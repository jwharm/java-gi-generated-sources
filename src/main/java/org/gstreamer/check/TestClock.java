package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstTestClock is an implementation of {@link org.gstreamer.gst.Clock} which has different
 * behaviour compared to {@link org.gstreamer.gst.SystemClock}. Time for {@link org.gstreamer.gst.SystemClock} advances
 * according to the system time, while time for {@link TestClock} changes only
 * when gst_test_clock_set_time() or gst_test_clock_advance_time() are
 * called. {@link TestClock} provides unit tests with the possibility to
 * precisely advance the time in a deterministic manner, independent of the
 * system time or any other external factors.
 * <p>
 * <strong>Advancing the time of a #GstTestClock</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   #include <gst/gst.h>
 *   #include <gst/check/gsttestclock.h>
 * 
 *   GstClock *clock;
 *   GstTestClock *test_clock;
 * 
 *   clock = gst_test_clock_new ();
 *   test_clock = GST_TEST_CLOCK (clock);
 *   GST_INFO ("Time: %" GST_TIME_FORMAT, GST_TIME_ARGS (gst_clock_get_time (clock)));
 *   gst_test_clock_advance_time ( test_clock, 1 * GST_SECOND);
 *   GST_INFO ("Time: %" GST_TIME_FORMAT, GST_TIME_ARGS (gst_clock_get_time (clock)));
 *   g_usleep (10 * G_USEC_PER_SEC);
 *   GST_INFO ("Time: %" GST_TIME_FORMAT, GST_TIME_ARGS (gst_clock_get_time (clock)));
 *   gst_test_clock_set_time (test_clock, 42 * GST_SECOND);
 *   GST_INFO ("Time: %" GST_TIME_FORMAT, GST_TIME_ARGS (gst_clock_get_time (clock)));
 *   ...
 * }</pre>
 * <p>
 * {@link org.gstreamer.gst.Clock} allows for setting up single shot or periodic clock notifications
 * as well as waiting for these notifications synchronously (using
 * gst_clock_id_wait()) or asynchronously (using gst_clock_id_wait_async() or
 * gst_clock_id_wait_async()). This is used by many GStreamer elements,
 * among them {@link org.gstreamer.base.BaseSrc} and {@link org.gstreamer.base.BaseSink}.
 * <p>
 * {@link TestClock} keeps track of these clock notifications. By calling
 * gst_test_clock_wait_for_next_pending_id() or
 * gst_test_clock_wait_for_multiple_pending_ids() a unit tests may wait for the
 * next one or several clock notifications to be requested. Additionally unit
 * tests may release blocked waits in a controlled fashion by calling
 * gst_test_clock_process_next_clock_id(). This way a unit test can control the
 * inaccuracy (jitter) of clock notifications, since the test can decide to
 * release blocked waits when the clock time has advanced exactly to, or past,
 * the requested clock notification time.
 * <p>
 * There are also interfaces for determining if a notification belongs to a
 * {@link TestClock} or not, as well as getting the number of requested clock
 * notifications so far.
 * <p>
 * N.B.: When a unit test waits for a certain amount of clock notifications to
 * be requested in gst_test_clock_wait_for_next_pending_id() or
 * gst_test_clock_wait_for_multiple_pending_ids() then these functions may block
 * for a long time. If they block forever then the expected clock notifications
 * were never requested from {@link TestClock}, and so the assumptions in the code
 * of the unit test are wrong. The unit test case runner in gstcheck is
 * expected to catch these cases either by the default test case timeout or the
 * one set for the unit test by calling tcase_set_timeout\\(\\).
 * <p>
 * The sample code below assumes that the element under test will delay a
 * buffer pushed on the source pad by some latency until it arrives on the sink
 * pad. Moreover it is assumed that the element will at some point call
 * gst_clock_id_wait() to synchronously wait for a specific time. The first
 * buffer sent will arrive exactly on time only delayed by the latency. The
 * second buffer will arrive a little late (7ms) due to simulated jitter in the
 * clock notification.
 * <p>
 * <strong>Demonstration of how to work with clock notifications and #GstTestClock</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   #include <gst/gst.h>
 *   #include <gst/check/gstcheck.h>
 *   #include <gst/check/gsttestclock.h>
 * 
 *   GstClockTime latency;
 *   GstElement *element;
 *   GstPad *srcpad;
 *   GstClock *clock;
 *   GstTestClock *test_clock;
 *   GstBuffer buf;
 *   GstClockID pending_id;
 *   GstClockID processed_id;
 * 
 *   latency = 42 * GST_MSECOND;
 *   element = create_element (latency, ...);
 *   srcpad = get_source_pad (element);
 * 
 *   clock = gst_test_clock_new ();
 *   test_clock = GST_TEST_CLOCK (clock);
 *   gst_element_set_clock (element, clock);
 * 
 *   GST_INFO ("Set time, create and push the first buffer\\n");
 *   gst_test_clock_set_time (test_clock, 0);
 *   buf = create_test_buffer (gst_clock_get_time (clock), ...);
 *   gst_assert_cmpint (gst_pad_push (srcpad, buf), ==, GST_FLOW_OK);
 * 
 *   GST_INFO ("Block until element is waiting for a clock notification\\n");
 *   gst_test_clock_wait_for_next_pending_id (test_clock, &pending_id);
 *   GST_INFO ("Advance to the requested time of the clock notification\\n");
 *   gst_test_clock_advance_time (test_clock, latency);
 *   GST_INFO ("Release the next blocking wait and make sure it is the one from element\\n");
 *   processed_id = gst_test_clock_process_next_clock_id (test_clock);
 *   g_assert (processed_id == pending_id);
 *   g_assert_cmpint (GST_CLOCK_ENTRY_STATUS (processed_id), ==, GST_CLOCK_OK);
 *   gst_clock_id_unref (pending_id);
 *   gst_clock_id_unref (processed_id);
 * 
 *   GST_INFO ("Validate that element produced an output buffer and check its timestamp\\n");
 *   g_assert_cmpint (get_number_of_output_buffer (...), ==, 1);
 *   buf = get_buffer_pushed_by_element (element, ...);
 *   g_assert_cmpint (GST_BUFFER_TIMESTAMP (buf), ==, latency);
 *   gst_buffer_unref (buf);
 *   GST_INFO ("Check that element does not wait for any clock notification\\n");
 *   g_assert (!gst_test_clock_peek_next_pending_id (test_clock, NULL));
 * 
 *   GST_INFO ("Set time, create and push the second buffer\\n");
 *   gst_test_clock_advance_time (test_clock, 10 * GST_SECOND);
 *   buf = create_test_buffer (gst_clock_get_time (clock), ...);
 *   gst_assert_cmpint (gst_pad_push (srcpad, buf), ==, GST_FLOW_OK);
 * 
 *   GST_INFO ("Block until element is waiting for a new clock notification\\n");
 *   (gst_test_clock_wait_for_next_pending_id (test_clock, &pending_id);
 *   GST_INFO ("Advance past 7ms beyond the requested time of the clock notification\\n");
 *   gst_test_clock_advance_time (test_clock, latency + 7 * GST_MSECOND);
 *   GST_INFO ("Release the next blocking wait and make sure it is the one from element\\n");
 *   processed_id = gst_test_clock_process_next_clock_id (test_clock);
 *   g_assert (processed_id == pending_id);
 *   g_assert_cmpint (GST_CLOCK_ENTRY_STATUS (processed_id), ==, GST_CLOCK_OK);
 *   gst_clock_id_unref (pending_id);
 *   gst_clock_id_unref (processed_id);
 * 
 *   GST_INFO ("Validate that element produced an output buffer and check its timestamp\\n");
 *   g_assert_cmpint (get_number_of_output_buffer (...), ==, 1);
 *   buf = get_buffer_pushed_by_element (element, ...);
 *   g_assert_cmpint (GST_BUFFER_TIMESTAMP (buf), ==,
 *       10 * GST_SECOND + latency + 7 * GST_MSECOND);
 *   gst_buffer_unref (buf);
 *   GST_INFO ("Check that element does not wait for any clock notification\\n");
 *   g_assert (!gst_test_clock_peek_next_pending_id (test_clock, NULL));
 *   ...
 * }</pre>
 * <p>
 * Since {@link TestClock} is only supposed to be used in unit tests it calls
 * g_assert(), g_assert_cmpint() or g_assert_cmpuint() to validate all function
 * arguments. This will highlight any issues with the unit test code itself.
 * @version 1.2
 */
public class TestClock extends org.gstreamer.gst.Clock {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTestClock";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Clock.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TestClock proxy instance for the provided memory address.
     * <p>
     * Because TestClock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TestClock(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestClock> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TestClock(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_test_clock_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new test clock with its time set to zero.
     * <p>
     * MT safe.
     */
    public TestClock() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithStartTime(org.gstreamer.gst.ClockTime startTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_test_clock_new_with_start_time.invokeExact(
                    startTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new test clock with its time set to the specified time.
     * <p>
     * MT safe.
     * @param startTime a {@link org.gstreamer.gst.ClockTime} set to the desired start time of the clock.
     * @return a {@link TestClock} cast to {@link org.gstreamer.gst.Clock}.
     */
    public static TestClock newWithStartTime(org.gstreamer.gst.ClockTime startTime) {
        var RESULT = constructNewWithStartTime(startTime);
        return (org.gstreamer.check.TestClock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.check.TestClock.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Advances the time of the {@code test_clock} by the amount given by {@code delta}. The
     * time of {@code test_clock} is monotonically increasing, therefore providing a
     * {@code delta} which is negative or zero is a programming error.
     * <p>
     * MT safe.
     * @param delta a positive {@link org.gstreamer.gst.ClockTimeDiff} to be added to the time of the clock
     */
    public void advanceTime(org.gstreamer.gst.ClockTimeDiff delta) {
        try {
            DowncallHandles.gst_test_clock_advance_time.invokeExact(
                    handle(),
                    delta.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A "crank" consists of three steps:
     * 1: Wait for a {@link org.gstreamer.gst.ClockID} to be registered with the {@link TestClock}.
     * 2: Advance the {@link TestClock} to the time the {@link org.gstreamer.gst.ClockID} is waiting, unless
     *    the clock time is already passed the clock id (Since: 1.18).
     * 3: Release the {@link org.gstreamer.gst.ClockID} wait.
     * A "crank" can be though of as the notion of
     * manually driving the clock forward to its next logical step.
     * @return {@code true} if the crank was successful, {@code false} otherwise.
     * <p>
     * MT safe.
     */
    public boolean crank() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_crank.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve the requested time for the next pending clock notification.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.ClockTime} set to the time of the next pending clock
     * notification. If no clock notifications have been requested
     * {@code GST_CLOCK_TIME_NONE} will be returned.
     */
    public org.gstreamer.gst.ClockTime getNextEntryTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_test_clock_get_next_entry_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Checks whether {@code test_clock} was requested to provide the clock notification
     * given by {@code id}.
     * <p>
     * MT safe.
     * @param id a {@link org.gstreamer.gst.ClockID} clock notification
     * @return {@code true} if the clock has been asked to provide the given clock
     * notification, {@code false} otherwise.
     */
    public boolean hasId(org.gstreamer.gst.ClockID id) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_has_id.invokeExact(
                    handle(),
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determine the number of pending clock notifications that have been
     * requested from the {@code test_clock}.
     * <p>
     * MT safe.
     * @return the number of pending clock notifications.
     */
    public int peekIdCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_peek_id_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines if the {@code pending_id} is the next clock notification scheduled to
     * be triggered given the current time of the {@code test_clock}.
     * <p>
     * MT safe.
     * @param pendingId a {@link org.gstreamer.gst.ClockID} clock
     * notification to look for
     * @return {@code true} if {@code pending_id} is the next clock notification to be
     * triggered, {@code false} otherwise.
     */
    public boolean peekNextPendingId(@Nullable org.gstreamer.gst.ClockID pendingId) {
        MemorySegment pendingIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_peek_next_pending_id.invokeExact(
                    handle(),
                    (Addressable) (pendingId == null ? MemoryAddress.NULL : (Addressable) pendingIdPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (pendingId != null) pendingId.setValue(pendingIdPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Processes and releases the pending ID.
     * <p>
     * MT safe.
     * @param pendingId {@link org.gstreamer.gst.ClockID}
     */
    public boolean processId(org.gstreamer.gst.ClockID pendingId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_process_id.invokeExact(
                    handle(),
                    (Addressable) pendingId.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Processes and releases the pending IDs in the list.
     * <p>
     * MT safe.
     * @param pendingList List
     *     of pending {@code GstClockIDs}
     */
    public int processIdList(@Nullable org.gtk.glib.List pendingList) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_process_id_list.invokeExact(
                    handle(),
                    (Addressable) (pendingList == null ? MemoryAddress.NULL : pendingList.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * MT safe.
     * @return a {@link org.gstreamer.gst.ClockID} containing the next pending clock
     * notification.
     */
    public @Nullable org.gstreamer.gst.ClockID processNextClockId() {
        java.lang.foreign.MemoryAddress RESULT;
        try {
            RESULT = (java.lang.foreign.MemoryAddress) DowncallHandles.gst_test_clock_process_next_clock_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockID(RESULT);
    }
    
    /**
     * Sets the time of {@code test_clock} to the time given by {@code new_time}. The time of
     * {@code test_clock} is monotonically increasing, therefore providing a {@code new_time}
     * which is earlier or equal to the time of the clock as given by
     * gst_clock_get_time() is a programming error.
     * <p>
     * MT safe.
     * @param newTime a {@link org.gstreamer.gst.ClockTime} later than that returned by gst_clock_get_time()
     */
    public void setTime(org.gstreamer.gst.ClockTime newTime) {
        try {
            DowncallHandles.gst_test_clock_set_time.invokeExact(
                    handle(),
                    newTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Blocks until at least {@code count} clock notifications have been requested from
     * {@code test_clock}, or the timeout expires.
     * <p>
     * MT safe.
     * @param count the number of pending clock notifications to wait for
     * @param timeoutMs the timeout in milliseconds
     * @param pendingList Address
     *     of a {@link org.gtk.glib.List} pointer variable to store the list of pending {@code GstClockIDs}
     *     that expired, or {@code null}
     * @return a {@code gboolean} {@code true} if the waits have been registered, {@code false} if not.
     * (Could be that it timed out waiting or that more waits than waits was found)
     */
    public boolean timedWaitForMultiplePendingIds(int count, int timeoutMs, @Nullable Out<org.gtk.glib.List> pendingList) {
        MemorySegment pendingListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_test_clock_timed_wait_for_multiple_pending_ids.invokeExact(
                    handle(),
                    count,
                    timeoutMs,
                    (Addressable) (pendingList == null ? MemoryAddress.NULL : (Addressable) pendingListPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (pendingList != null) pendingList.set(org.gtk.glib.List.fromAddress.marshal(pendingListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Blocks until at least {@code count} clock notifications have been requested from
     * {@code test_clock}. There is no timeout for this wait, see the main description of
     * {@link TestClock}.
     * <p>
     * MT safe.
     * @param count the number of pending clock notifications to wait for
     * @param pendingList Address
     *     of a {@link org.gtk.glib.List} pointer variable to store the list of pending {@code GstClockIDs}
     *     that expired, or {@code null}
     */
    public void waitForMultiplePendingIds(int count, @Nullable Out<org.gtk.glib.List> pendingList) {
        MemorySegment pendingListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_test_clock_wait_for_multiple_pending_ids.invokeExact(
                    handle(),
                    count,
                    (Addressable) (pendingList == null ? MemoryAddress.NULL : (Addressable) pendingListPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (pendingList != null) pendingList.set(org.gtk.glib.List.fromAddress.marshal(pendingListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Waits until a clock notification is requested from {@code test_clock}. There is no
     * timeout for this wait, see the main description of {@link TestClock}. A reference
     * to the pending clock notification is stored in {@code pending_id}.
     * <p>
     * MT safe.
     * @param pendingId {@link org.gstreamer.gst.ClockID}
     * with information about the pending clock notification
     */
    public void waitForNextPendingId(@Nullable org.gstreamer.gst.ClockID pendingId) {
        MemorySegment pendingIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_test_clock_wait_for_next_pending_id.invokeExact(
                    handle(),
                    (Addressable) (pendingId == null ? MemoryAddress.NULL : (Addressable) pendingIdPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (pendingId != null) pendingId.setValue(pendingIdPOINTER.get(Interop.valueLayout.ADDRESS, 0));
    }
    
    /**
     * Blocks until at least {@code count} clock notifications have been requested from
     * {@code test_clock}. There is no timeout for this wait, see the main description of
     * {@link TestClock}.
     * @param count the number of pending clock notifications to wait for
     * @deprecated use gst_test_clock_wait_for_multiple_pending_ids() instead.
     */
    @Deprecated
    public void waitForPendingIdCount(int count) {
        try {
            DowncallHandles.gst_test_clock_wait_for_pending_id_count.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_test_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Finds the latest time inside the list.
     * <p>
     * MT safe.
     * @param pendingList List
     *     of of pending {@code GstClockIDs}
     */
    public static org.gstreamer.gst.ClockTime idListGetLatestTime(@Nullable org.gtk.glib.List pendingList) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_test_clock_id_list_get_latest_time.invokeExact(
                    (Addressable) (pendingList == null ? MemoryAddress.NULL : pendingList.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * A {@link TestClock.Builder} object constructs a {@link TestClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TestClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Clock.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TestClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TestClock}.
         * @return A new instance of {@code TestClock} with the properties 
         *         that were set in the Builder object.
         */
        public TestClock build() {
            return (TestClock) org.gtk.gobject.GObject.newWithProperties(
                TestClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setClockType(org.gstreamer.gst.ClockType clockType) {
            names.add("clock-type");
            values.add(org.gtk.gobject.Value.create(clockType));
            return this;
        }
        
        /**
         * When a {@link TestClock} is constructed it will have a certain start time set.
         * If the clock was created using gst_test_clock_new_with_start_time() then
         * this property contains the value of the {@code start_time} argument. If
         * gst_test_clock_new() was called the clock started at time zero, and thus
         * this property contains the value 0.
         * @param startTime The value for the {@code start-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStartTime(long startTime) {
            names.add("start-time");
            values.add(org.gtk.gobject.Value.create(startTime));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_test_clock_new = Interop.downcallHandle(
            "gst_test_clock_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_new_with_start_time = Interop.downcallHandle(
            "gst_test_clock_new_with_start_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_test_clock_advance_time = Interop.downcallHandle(
            "gst_test_clock_advance_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_test_clock_crank = Interop.downcallHandle(
            "gst_test_clock_crank",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_get_next_entry_time = Interop.downcallHandle(
            "gst_test_clock_get_next_entry_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_has_id = Interop.downcallHandle(
            "gst_test_clock_has_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_peek_id_count = Interop.downcallHandle(
            "gst_test_clock_peek_id_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_peek_next_pending_id = Interop.downcallHandle(
            "gst_test_clock_peek_next_pending_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_process_id = Interop.downcallHandle(
            "gst_test_clock_process_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_process_id_list = Interop.downcallHandle(
            "gst_test_clock_process_id_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_process_next_clock_id = Interop.downcallHandle(
            "gst_test_clock_process_next_clock_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_set_time = Interop.downcallHandle(
            "gst_test_clock_set_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_test_clock_timed_wait_for_multiple_pending_ids = Interop.downcallHandle(
            "gst_test_clock_timed_wait_for_multiple_pending_ids",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_wait_for_multiple_pending_ids = Interop.downcallHandle(
            "gst_test_clock_wait_for_multiple_pending_ids",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_wait_for_next_pending_id = Interop.downcallHandle(
            "gst_test_clock_wait_for_next_pending_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_test_clock_wait_for_pending_id_count = Interop.downcallHandle(
            "gst_test_clock_wait_for_pending_id_count",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_test_clock_get_type = Interop.downcallHandle(
            "gst_test_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_test_clock_id_list_get_latest_time = Interop.downcallHandle(
            "gst_test_clock_id_list_get_latest_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
