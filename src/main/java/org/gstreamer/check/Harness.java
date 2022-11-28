package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Harness} is meant to make writing unit test for GStreamer much easier.
 * It can be thought of as a way of treating a {@link org.gstreamer.gst.Element} as a black box,
 * deterministically feeding it data, and controlling what data it outputs.
 * <p>
 * The basic structure of {@link Harness} is two "floating" {@code GstPads} that connect
 * to the harnessed {@link org.gstreamer.gst.Element} src and sink {@code GstPads} like so:
 * <pre>{@code 
 *           __________________________
 *  _____   |  _____            _____  |   _____
 * |     |  | |     |          |     | |  |     |
 * | src |--+-| sink|  Element | src |-+--| sink|
 * |_____|  | |_____|          |_____| |  |_____|
 *          |__________________________|
 * 
 * }</pre>
 * <p>
 * With this, you can now simulate any environment the {@link org.gstreamer.gst.Element} might find
 * itself in. By specifying the {@link org.gstreamer.gst.Caps} of the harness {@code GstPads}, using
 * functions like gst_harness_set_src_caps() or gst_harness_set_sink_caps_str(),
 * you can test how the {@link org.gstreamer.gst.Element} interacts with different caps sets.
 * <p>
 * Your harnessed {@link org.gstreamer.gst.Element} can of course also be a bin, and using
 * gst_harness_new_parse() supporting standard gst-launch syntax, you can
 * easily test a whole pipeline instead of just one element.
 * <p>
 * You can then go on to push {@code GstBuffers} and {@code GstEvents} on to the srcpad,
 * using functions like gst_harness_push() and gst_harness_push_event(), and
 * then pull them out to examine them with gst_harness_pull() and
 * gst_harness_pull_event().
 * <p>
 * <strong>A simple buffer-in buffer-out example</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   #include <gst/gst.h>
 *   #include <gst/check/gstharness.h>
 *   GstHarness *h;
 *   GstBuffer *in_buf;
 *   GstBuffer *out_buf;
 * 
 *   // attach the harness to the src and sink pad of GstQueue
 *   h = gst_harness_new ("queue");
 * 
 *   // we must specify a caps before pushing buffers
 *   gst_harness_set_src_caps_str (h, "mycaps");
 * 
 *   // create a buffer of size 42
 *   in_buf = gst_harness_create_buffer (h, 42);
 * 
 *   // push the buffer into the queue
 *   gst_harness_push (h, in_buf);
 * 
 *   // pull the buffer from the queue
 *   out_buf = gst_harness_pull (h);
 * 
 *   // validate the buffer in is the same as buffer out
 *   fail_unless (in_buf == out_buf);
 * 
 *   // cleanup
 *   gst_buffer_unref (out_buf);
 *   gst_harness_teardown (h);
 * 
 *   }</pre>
 * <p>
 * Another main feature of the {@link Harness} is its integration with the
 * {@link TestClock}. Operating the {@link TestClock} can be very challenging, but
 * {@link Harness} simplifies some of the most desired actions a lot, like wanting
 * to manually advance the clock while at the same time releasing a {@link org.gstreamer.gst.ClockID}
 * that is waiting, with functions like gst_harness_crank_single_clock_wait().
 * <p>
 * {@link Harness} also supports sub-harnesses, as a way of generating and
 * validating data. A sub-harness is another {@link Harness} that is managed by
 * the "parent" harness, and can either be created by using the standard
 * gst_harness_new type functions directly on the (GstHarness *)-&gt;src_harness,
 * or using the much more convenient gst_harness_add_src() or
 * gst_harness_add_sink_parse(). If you have a decoder-element you want to test,
 * (like vp8dec) it can be very useful to add a src-harness with both a
 * src-element (videotestsrc) and an encoder (vp8enc) to feed the decoder data
 * with different configurations, by simply doing:
 * <pre>{@code <!-- language="C" -->
 *   GstHarness * h = gst_harness_new (h, "vp8dec");
 *   gst_harness_add_src_parse (h, "videotestsrc is-live=1 ! vp8enc", TRUE);
 * }</pre>
 * <p>
 * and then feeding it data with:
 * <pre>{@code <!-- language="C" -->
 * gst_harness_push_from_src (h);
 * }</pre>
 * @version 1.6
 */
public class Harness extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstHarness";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("element"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        Interop.valueLayout.ADDRESS.withName("sinkpad"),
        Interop.valueLayout.ADDRESS.withName("src_harness"),
        Interop.valueLayout.ADDRESS.withName("sink_harness"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Harness}
     * @return A new, uninitialized @{link Harness}
     */
    public static Harness allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Harness newInstance = new Harness(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code element}
     * @return The value of the field {@code element}
     */
    public org.gstreamer.gst.Element element$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Element(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code element}
     * @param element The new value of the field {@code element}
     */
    public void element$set(org.gstreamer.gst.Element element) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), element.handle());
    }
    
    /**
     * Get the value of the field {@code srcpad}
     * @return The value of the field {@code srcpad}
     */
    public org.gstreamer.gst.Pad srcpad$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("srcpad"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Pad(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code srcpad}
     * @param srcpad The new value of the field {@code srcpad}
     */
    public void srcpad$set(org.gstreamer.gst.Pad srcpad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("srcpad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), srcpad.handle());
    }
    
    /**
     * Get the value of the field {@code sinkpad}
     * @return The value of the field {@code sinkpad}
     */
    public org.gstreamer.gst.Pad sinkpad$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sinkpad"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Pad(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code sinkpad}
     * @param sinkpad The new value of the field {@code sinkpad}
     */
    public void sinkpad$set(org.gstreamer.gst.Pad sinkpad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sinkpad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sinkpad.handle());
    }
    
    /**
     * Get the value of the field {@code src_harness}
     * @return The value of the field {@code src_harness}
     */
    public org.gstreamer.check.Harness srcHarness$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_harness"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.check.Harness(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code src_harness}
     * @param srcHarness The new value of the field {@code src_harness}
     */
    public void srcHarness$set(org.gstreamer.check.Harness srcHarness) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_harness"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), srcHarness.handle());
    }
    
    /**
     * Get the value of the field {@code sink_harness}
     * @return The value of the field {@code sink_harness}
     */
    public org.gstreamer.check.Harness sinkHarness$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_harness"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.check.Harness(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code sink_harness}
     * @param sinkHarness The new value of the field {@code sink_harness}
     */
    public void sinkHarness$set(org.gstreamer.check.Harness sinkHarness) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_harness"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sinkHarness.handle());
    }
    
    /**
     * Create a Harness proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Harness(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Adds a {@link org.gstreamer.gst.Element} to an empty {@link Harness}
     * <p>
     * MT safe.
     * @param element a {@link org.gstreamer.gst.Element} to add to the harness (transfer none)
     * @param hsrc a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness srcpad.
     * {@code null} will not create a harness srcpad.
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. Can be a static or request
     * or a sometimes pad that has been added. {@code null} will not get/request a sinkpad
     * from the element. (Like if the element is a src.)
     * @param hsink a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness sinkpad.
     * {@code null} will not create a harness sinkpad.
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad, similar to the
     * {@code element_sinkpad_name}.
     */
    public void addElementFull(@NotNull org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.StaticPadTemplate hsrc, @Nullable java.lang.String elementSinkpadName, @Nullable org.gstreamer.gst.StaticPadTemplate hsink, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        try {
            DowncallHandles.gst_harness_add_element_full.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) (hsrc == null ? MemoryAddress.NULL : hsrc.handle()),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (hsink == null ? MemoryAddress.NULL : hsink.handle()),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Links the specified {@link org.gstreamer.gst.Pad} the {@code GstHarness} srcpad.
     * <p>
     * MT safe.
     * @param sinkpad a {@link org.gstreamer.gst.Pad} to link to the harness srcpad
     */
    public void addElementSinkPad(@NotNull org.gstreamer.gst.Pad sinkpad) {
        java.util.Objects.requireNonNull(sinkpad, "Parameter 'sinkpad' must not be null");
        try {
            DowncallHandles.gst_harness_add_element_sink_pad.invokeExact(
                    handle(),
                    sinkpad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Links the specified {@link org.gstreamer.gst.Pad} the {@code GstHarness} sinkpad. This can be useful if
     * perhaps the srcpad did not exist at the time of creating the harness,
     * like a demuxer that provides a sometimes-pad after receiving data.
     * <p>
     * MT safe.
     * @param srcpad a {@link org.gstreamer.gst.Pad} to link to the harness sinkpad
     */
    public void addElementSrcPad(@NotNull org.gstreamer.gst.Pad srcpad) {
        java.util.Objects.requireNonNull(srcpad, "Parameter 'srcpad' must not be null");
        try {
            DowncallHandles.gst_harness_add_element_src_pad.invokeExact(
                    handle(),
                    srcpad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses the {@code launchline} and puts that in a {@link org.gstreamer.gst.Bin},
     * and then attches the supplied {@link Harness} to the bin.
     * <p>
     * MT safe.
     * @param launchline a {@code gchar} describing a gst-launch type line
     */
    public void addParse(@NotNull java.lang.String launchline) {
        java.util.Objects.requireNonNull(launchline, "Parameter 'launchline' must not be null");
        try {
            DowncallHandles.gst_harness_add_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(launchline));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to allows you to call gst_pad_add_probe on a
     * {@link org.gstreamer.gst.Pad} of a {@link org.gstreamer.gst.Element} that are residing inside the {@link Harness},
     * by using normal gst_pad_add_probe syntax
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} with a {@link org.gstreamer.gst.ElementFactory} name
     * @param padName a {@code gchar} with the name of the pad to attach the probe to
     * @param mask a {@link org.gstreamer.gst.PadProbeType} (see gst_pad_add_probe)
     * @param callback a {@link org.gstreamer.gst.PadProbeCallback} (see gst_pad_add_probe)
     */
    public void addProbe(@NotNull java.lang.String elementName, @NotNull java.lang.String padName, @NotNull org.gstreamer.gst.PadProbeType mask, @NotNull org.gstreamer.gst.PadProbeCallback callback) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        java.util.Objects.requireNonNull(padName, "Parameter 'padName' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_harness_add_probe.invokeExact(
                    handle(),
                    Interop.allocateNativeString(elementName),
                    Interop.allocateNativeString(padName),
                    mask.getValue(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbPadProbeCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add api with params as one of the supported metadata API to propose when
     * receiving an allocation query.
     * <p>
     * MT safe.
     * @param api a metadata API
     * @param params API specific parameters
     */
    public void addProposeAllocationMeta(@NotNull org.gtk.glib.Type api, @Nullable org.gstreamer.gst.Structure params) {
        java.util.Objects.requireNonNull(api, "Parameter 'api' must not be null");
        try {
            DowncallHandles.gst_harness_add_propose_allocation_meta.invokeExact(
                    handle(),
                    api.getValue().longValue(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to gst_harness_add_sink_harness, this is a convenience to
     * directly create a sink-harness using the {@code sink_element_name} name specified.
     * <p>
     * MT safe.
     * @param sinkElementName a {@code gchar} with the name of a {@link org.gstreamer.gst.Element}
     */
    public void addSink(@NotNull java.lang.String sinkElementName) {
        java.util.Objects.requireNonNull(sinkElementName, "Parameter 'sinkElementName' must not be null");
        try {
            DowncallHandles.gst_harness_add_sink.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sinkElementName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to gst_harness_add_src, this allows you to send the data coming out
     * of your harnessed {@link org.gstreamer.gst.Element} to a sink-element, allowing to test different
     * responses the element output might create in sink elements. An example might
     * be an existing sink providing some analytical data on the input it receives that
     * can be useful to your testing. If the goal is to test a sink-element itself,
     * this is better achieved using gst_harness_new directly on the sink.
     * <p>
     * If a sink-harness already exists it will be replaced.
     * <p>
     * MT safe.
     * @param sinkHarness a {@link Harness} to be added as a sink-harness.
     */
    public void addSinkHarness(@NotNull org.gstreamer.check.Harness sinkHarness) {
        java.util.Objects.requireNonNull(sinkHarness, "Parameter 'sinkHarness' must not be null");
        try {
            DowncallHandles.gst_harness_add_sink_harness.invokeExact(
                    handle(),
                    sinkHarness.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sinkHarness.yieldOwnership();
    }
    
    /**
     * Similar to gst_harness_add_sink, this allows you to specify a launch-line
     * instead of just an element name. See gst_harness_add_src_parse for details.
     * <p>
     * MT safe.
     * @param launchline a {@code gchar} with the name of a {@link org.gstreamer.gst.Element}
     */
    public void addSinkParse(@NotNull java.lang.String launchline) {
        java.util.Objects.requireNonNull(launchline, "Parameter 'launchline' must not be null");
        try {
            DowncallHandles.gst_harness_add_sink_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(launchline));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to gst_harness_add_src_harness, this is a convenience to
     * directly create a src-harness using the {@code src_element_name} name specified.
     * <p>
     * MT safe.
     * @param srcElementName a {@code gchar} with the name of a {@link org.gstreamer.gst.Element}
     * @param hasClockWait a {@code gboolean} specifying if the {@link org.gstreamer.gst.Element} uses
     * gst_clock_wait_id internally.
     */
    public void addSrc(@NotNull java.lang.String srcElementName, boolean hasClockWait) {
        java.util.Objects.requireNonNull(srcElementName, "Parameter 'srcElementName' must not be null");
        try {
            DowncallHandles.gst_harness_add_src.invokeExact(
                    handle(),
                    Interop.allocateNativeString(srcElementName),
                    hasClockWait ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A src-harness is a great way of providing the {@link Harness} with data.
     * By adding a src-type {@link org.gstreamer.gst.Element}, it is then easy to use functions like
     * gst_harness_push_from_src or gst_harness_src_crank_and_push_many
     * to provide your harnessed element with input. The {@code has_clock_wait} variable
     * is a great way to control you src-element with, in that you can have it
     * produce a buffer for you by simply cranking the clock, and not have it
     * spin out of control producing buffers as fast as possible.
     * <p>
     * If a src-harness already exists it will be replaced.
     * <p>
     * MT safe.
     * @param srcHarness a {@link Harness} to be added as a src-harness.
     * @param hasClockWait a {@code gboolean} specifying if the {@link org.gstreamer.gst.Element} uses
     * gst_clock_wait_id internally.
     */
    public void addSrcHarness(@NotNull org.gstreamer.check.Harness srcHarness, boolean hasClockWait) {
        java.util.Objects.requireNonNull(srcHarness, "Parameter 'srcHarness' must not be null");
        try {
            DowncallHandles.gst_harness_add_src_harness.invokeExact(
                    handle(),
                    srcHarness.handle(),
                    hasClockWait ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        srcHarness.yieldOwnership();
    }
    
    /**
     * Similar to gst_harness_add_src, this allows you to specify a launch-line,
     * which can be useful for both having more then one {@link org.gstreamer.gst.Element} acting as your
     * src (Like a src producing raw buffers, and then an encoder, providing encoded
     * data), but also by allowing you to set properties like "is-live" directly on
     * the elements.
     * <p>
     * MT safe.
     * @param launchline a {@code gchar} describing a gst-launch type line
     * @param hasClockWait a {@code gboolean} specifying if the {@link org.gstreamer.gst.Element} uses
     * gst_clock_wait_id internally.
     */
    public void addSrcParse(@NotNull java.lang.String launchline, boolean hasClockWait) {
        java.util.Objects.requireNonNull(launchline, "Parameter 'launchline' must not be null");
        try {
            DowncallHandles.gst_harness_add_src_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(launchline),
                    hasClockWait ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The number of {@code GstBuffers} currently in the {@link Harness} sinkpad {@link org.gtk.glib.AsyncQueue}
     * <p>
     * MT safe.
     * @return a {@code guint} number of buffers in the queue
     */
    public int buffersInQueue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_buffers_in_queue.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The total number of {@code GstBuffers} that has arrived on the {@link Harness} sinkpad.
     * This number includes buffers that have been dropped as well as buffers
     * that have already been pulled out.
     * <p>
     * MT safe.
     * @return a {@code guint} number of buffers received
     */
    public int buffersReceived() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_buffers_received.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Similar to gst_harness_crank_single_clock_wait(), this is the function to use
     * if your harnessed element(s) are using more then one gst_clock_id_wait.
     * Failing to do so can (and will) make it racy which {@link org.gstreamer.gst.ClockID} you actually
     * are releasing, where as this function will process all the waits at the
     * same time, ensuring that one thread can't register another wait before
     * both are released.
     * <p>
     * MT safe.
     * @param waits a {@code guint} describing the number of {@code GstClockIDs} to crank
     * @return a {@code gboolean} {@code true} if the "crank" was successful, {@code false} if not.
     */
    public boolean crankMultipleClockWaits(int waits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_crank_multiple_clock_waits.invokeExact(
                    handle(),
                    waits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * A "crank" consists of three steps:
     * 1: Wait for a {@link org.gstreamer.gst.ClockID} to be registered with the {@link TestClock}.
     * 2: Advance the {@link TestClock} to the time the {@link org.gstreamer.gst.ClockID} is waiting for.
     * 3: Release the {@link org.gstreamer.gst.ClockID} wait.
     * Together, this provides an easy way to not have to think about the details
     * around clocks and time, but still being able to write deterministic tests
     * that are dependent on this. A "crank" can be though of as the notion of
     * manually driving the clock forward to its next logical step.
     * <p>
     * MT safe.
     * @return a {@code gboolean} {@code true} if the "crank" was successful, {@code false} if not.
     */
    public boolean crankSingleClockWait() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_crank_single_clock_wait.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allocates a buffer using a {@link org.gstreamer.gst.BufferPool} if present, or else using the
     * configured {@link org.gstreamer.gst.Allocator} and {@link org.gstreamer.gst.AllocationParams}
     * <p>
     * MT safe.
     * @param size a {@code gsize} specifying the size of the buffer
     * @return a {@link org.gstreamer.gst.Buffer} of size {@code size}
     */
    public @NotNull org.gstreamer.gst.Buffer createBuffer(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_create_buffer.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Allows you to dump the {@code GstBuffers} the {@link Harness} sinkpad {@link org.gtk.glib.AsyncQueue}
     * to a file.
     * <p>
     * MT safe.
     * @param filename a {@code gchar} with a the name of a file
     */
    public void dumpToFile(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        try {
            DowncallHandles.gst_harness_dump_to_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The number of {@code GstEvents} currently in the {@link Harness} sinkpad {@link org.gtk.glib.AsyncQueue}
     * <p>
     * MT safe.
     * @return a {@code guint} number of events in the queue
     */
    public int eventsInQueue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_events_in_queue.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The total number of {@code GstEvents} that has arrived on the {@link Harness} sinkpad
     * This number includes events handled by the harness as well as events
     * that have already been pulled out.
     * <p>
     * MT safe.
     * @return a {@code guint} number of events received
     */
    public int eventsReceived() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_events_received.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Most useful in conjunction with gst_harness_new_parse, this will scan the
     * {@code GstElements} inside the {@link Harness}, and check if any of them matches
     * {@code element_name}. Typical usecase being that you need to access one of the
     * harnessed elements for properties and/or signals.
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} with a {@link org.gstreamer.gst.ElementFactory} name
     * @return a {@link org.gstreamer.gst.Element} or {@code null} if not found
     */
    public @Nullable org.gstreamer.gst.Element findElement(@NotNull java.lang.String elementName) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_find_element.invokeExact(
                    handle(),
                    Interop.allocateNativeString(elementName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.FULL);
    }
    
    /**
     * A convenience function to allows you to call g_object_get on a {@link org.gstreamer.gst.Element}
     * that are residing inside the {@link Harness}, by using normal g_object_get
     * syntax.
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} with a {@link org.gstreamer.gst.ElementFactory} name
     * @param firstPropertyName a {@code gchar} with the first property name
     * @param varargs return location for the first property, followed optionally by more
     *  name/return location pairs, followed by {@code null}
     */
    public void get(@NotNull java.lang.String elementName, @NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.gst_harness_get.invokeExact(
                    handle(),
                    Interop.allocateNativeString(elementName),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code allocator} and its {@code params} that has been decided to use after an
     * allocation query.
     * <p>
     * MT safe.
     * @param allocator the {@link org.gstreamer.gst.Allocator} used
     * @param params the {@link org.gstreamer.gst.AllocationParams} of
     *   {@code allocator}
     */
    public void getAllocator(@NotNull Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.gst_harness_get_allocator.invokeExact(
                    handle(),
                    (Addressable) allocatorPOINTER.address(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        params.yieldOwnership();
    }
    
    /**
     * Get the timestamp of the last {@link org.gstreamer.gst.Buffer} pushed on the {@link Harness} srcpad,
     * typically with gst_harness_push or gst_harness_push_from_src.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.ClockTime} with the timestamp or {@code GST_CLOCK_TIME_NONE} if no
     * {@link org.gstreamer.gst.Buffer} has been pushed on the {@link Harness} srcpad
     */
    public @NotNull org.gstreamer.gst.ClockTime getLastPushedTimestamp() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_harness_get_last_pushed_timestamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the {@link TestClock}. Useful if specific operations on the testclock is
     * needed.
     * <p>
     * MT safe.
     * @return a {@link TestClock}, or {@code null} if the testclock is not
     * present.
     */
    public @NotNull org.gstreamer.check.TestClock getTestclock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_get_testclock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.TestClock(RESULT, Ownership.FULL);
    }
    
    /**
     * This will set the harnessed {@link org.gstreamer.gst.Element} to {@link org.gstreamer.gst.State#PLAYING}.
     * {@code GstElements} without a sink-{@link org.gstreamer.gst.Pad} and with the {@link org.gstreamer.gst.ElementFlags#SOURCE}
     * flag set is considered a src {@link org.gstreamer.gst.Element}
     * Non-src {@code GstElements} (like sinks and filters) are automatically set to
     * playing by the {@link Harness}, but src {@code GstElements} are not to avoid them
     * starting to produce buffers.
     * Hence, for src {@link org.gstreamer.gst.Element} you must call gst_harness_play() explicitly.
     * <p>
     * MT safe.
     */
    public void play() {
        try {
            DowncallHandles.gst_harness_play.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pulls a {@link org.gstreamer.gst.Buffer} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} sinkpad. The pull
     * will timeout in 60 seconds. This is the standard way of getting a buffer
     * from a harnessed {@link org.gstreamer.gst.Element}.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Buffer} or {@code null} if timed out.
     */
    public @NotNull org.gstreamer.gst.Buffer pull() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_pull.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Pulls an {@link org.gstreamer.gst.Event} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} sinkpad.
     * Timeouts after 60 seconds similar to gst_harness_pull.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Event} or {@code null} if timed out.
     */
    public @NotNull org.gstreamer.gst.Event pullEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_pull_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * Pulls a {@link org.gstreamer.gst.Buffer} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} sinkpad. The pull
     * will block until an EOS event is received, or timeout in 60 seconds.
     * MT safe.
     * @param buf A {@link org.gstreamer.gst.Buffer}, or {@code null} if EOS or timeout occures
     *   first.
     * @return {@code true} on success, {@code false} on timeout.
     */
    public boolean pullUntilEos(@NotNull Out<org.gstreamer.gst.Buffer> buf) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_pull_until_eos.invokeExact(
                    handle(),
                    (Addressable) bufPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.set(new org.gstreamer.gst.Buffer(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Pulls an {@link org.gstreamer.gst.Event} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} srcpad.
     * Timeouts after 60 seconds similar to gst_harness_pull.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Event} or {@code null} if timed out.
     */
    public @NotNull org.gstreamer.gst.Event pullUpstreamEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_pull_upstream_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * Pushes a {@link org.gstreamer.gst.Buffer} on the {@link Harness} srcpad. The standard way of
     * interacting with an harnessed element.
     * <p>
     * MT safe.
     * @param buffer a {@link org.gstreamer.gst.Buffer} to push
     * @return a {@link org.gstreamer.gst.FlowReturn} with the result from the push
     */
    public @NotNull org.gstreamer.gst.FlowReturn push(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_push.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Basically a gst_harness_push and a gst_harness_pull in one line. Reflects
     * the fact that you often want to do exactly this in your test: Push one buffer
     * in, and inspect the outcome.
     * <p>
     * MT safe.
     * @param buffer a {@link org.gstreamer.gst.Buffer} to push
     * @return a {@link org.gstreamer.gst.Buffer} or {@code null} if timed out.
     */
    public @NotNull org.gstreamer.gst.Buffer pushAndPull(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_push_and_pull.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Pushes an {@link org.gstreamer.gst.Event} on the {@link Harness} srcpad.
     * <p>
     * MT safe.
     * @param event a {@link org.gstreamer.gst.Event} to push
     * @return a {@code gboolean} with the result from the push
     */
    public boolean pushEvent(@NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_push_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Transfer data from the src-{@link Harness} to the main-{@link Harness}. It consists
     * of 4 steps:
     * 1: Make sure the src is started. (see: gst_harness_play)
     * 2: Crank the clock (see: gst_harness_crank_single_clock_wait)
     * 3: Pull a {@link org.gstreamer.gst.Buffer} from the src-{@link Harness} (see: gst_harness_pull)
     * 4: Push the same {@link org.gstreamer.gst.Buffer} into the main-{@link Harness} (see: gst_harness_push)
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.FlowReturn} with the result of the push
     */
    public @NotNull org.gstreamer.gst.FlowReturn pushFromSrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_push_from_src.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Transfer one {@link org.gstreamer.gst.Buffer} from the main-{@link Harness} to the sink-{@link Harness}.
     * See gst_harness_push_from_src for details.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.FlowReturn} with the result of the push
     */
    public @NotNull org.gstreamer.gst.FlowReturn pushToSink() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_push_to_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Pushes an {@link org.gstreamer.gst.Event} on the {@link Harness} sinkpad.
     * <p>
     * MT safe.
     * @param event a {@link org.gstreamer.gst.Event} to push
     * @return a {@code gboolean} with the result from the push
     */
    public boolean pushUpstreamEvent(@NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_push_upstream_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the min latency reported by any harnessed {@link org.gstreamer.gst.Element}.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.ClockTime} with min latency
     */
    public @NotNull org.gstreamer.gst.ClockTime queryLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_harness_query_latency.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * A convenience function to allows you to call g_object_set on a {@link org.gstreamer.gst.Element}
     * that are residing inside the {@link Harness}, by using normal g_object_set
     * syntax.
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} with a {@link org.gstreamer.gst.ElementFactory} name
     * @param firstPropertyName a {@code gchar} with the first property name
     * @param varargs value for the first property, followed optionally by more
     *  name/value pairs, followed by {@code null}
     */
    public void set(@NotNull java.lang.String elementName, @NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.gst_harness_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(elementName),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Setting this will make the harness block in the chain-function, and
     * then release when gst_harness_pull() or gst_harness_try_pull() is called.
     * Can be useful when wanting to control a src-element that is not implementing
     * gst_clock_id_wait() so it can't be controlled by the {@link TestClock}, since
     * it otherwise would produce buffers as fast as possible.
     * <p>
     * MT safe.
     */
    public void setBlockingPushMode() {
        try {
            DowncallHandles.gst_harness_set_blocking_push_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GstHarness} srcpad and sinkpad caps.
     * <p>
     * MT safe.
     * @param in a {@link org.gstreamer.gst.Caps} to set on the harness srcpad
     * @param out a {@link org.gstreamer.gst.Caps} to set on the harness sinkpad
     */
    public void setCaps(@NotNull org.gstreamer.gst.Caps in, @NotNull org.gstreamer.gst.Caps out) {
        java.util.Objects.requireNonNull(in, "Parameter 'in' must not be null");
        java.util.Objects.requireNonNull(out, "Parameter 'out' must not be null");
        try {
            DowncallHandles.gst_harness_set_caps.invokeExact(
                    handle(),
                    in.handle(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        in.yieldOwnership();
        out.yieldOwnership();
    }
    
    /**
     * Sets the {@code GstHarness} srcpad and sinkpad caps using strings.
     * <p>
     * MT safe.
     * @param in a {@code gchar} describing a {@link org.gstreamer.gst.Caps} to set on the harness srcpad
     * @param out a {@code gchar} describing a {@link org.gstreamer.gst.Caps} to set on the harness sinkpad
     */
    public void setCapsStr(@NotNull java.lang.String in, @NotNull java.lang.String out) {
        java.util.Objects.requireNonNull(in, "Parameter 'in' must not be null");
        java.util.Objects.requireNonNull(out, "Parameter 'out' must not be null");
        try {
            DowncallHandles.gst_harness_set_caps_str.invokeExact(
                    handle(),
                    Interop.allocateNativeString(in),
                    Interop.allocateNativeString(out));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * When set to {@code true}, instead of placing the buffers arriving from the harnessed
     * {@link org.gstreamer.gst.Element} inside the sinkpads {@link org.gtk.glib.AsyncQueue}, they are instead unreffed.
     * <p>
     * MT safe.
     * @param dropBuffers a {@code gboolean} specifying to drop outgoing buffers or not
     */
    public void setDropBuffers(boolean dropBuffers) {
        try {
            DowncallHandles.gst_harness_set_drop_buffers.invokeExact(
                    handle(),
                    dropBuffers ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * As a convenience, a src-harness will forward {@link org.gstreamer.gst.EventType#STREAM_START},
     * {@link org.gstreamer.gst.EventType#CAPS} and {@link org.gstreamer.gst.EventType#SEGMENT} to the main-harness if forwarding
     * is enabled, and forward any sticky-events from the main-harness to
     * the sink-harness. It will also forward the {@link org.gstreamer.gst.QueryType#ALLOCATION}.
     * <p>
     * If forwarding is disabled, the user will have to either manually push
     * these events from the src-harness using gst_harness_src_push_event(), or
     * create and push them manually. While this will allow full control and
     * inspection of these events, for the most cases having forwarding enabled
     * will be sufficient when writing a test where the src-harness' main function
     * is providing data for the main-harness.
     * <p>
     * Forwarding is enabled by default.
     * <p>
     * MT safe.
     * @param forwarding a {@code gboolean} to enable/disable forwarding
     */
    public void setForwarding(boolean forwarding) {
        try {
            DowncallHandles.gst_harness_set_forwarding.invokeExact(
                    handle(),
                    forwarding ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the liveness reported by {@link Harness} when receiving a latency-query.
     * The default is {@code true}.
     * @param isLive {@code true} for live, {@code false} for non-live
     */
    public void setLive(boolean isLive) {
        try {
            DowncallHandles.gst_harness_set_live.invokeExact(
                    handle(),
                    isLive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code allocator} and {@code params} to propose when receiving an allocation
     * query.
     * <p>
     * MT safe.
     * @param allocator a {@link org.gstreamer.gst.Allocator}
     * @param params a {@link org.gstreamer.gst.AllocationParams}
     */
    public void setProposeAllocator(@Nullable org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try {
            DowncallHandles.gst_harness_set_propose_allocator.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocator.yieldOwnership();
    }
    
    /**
     * Sets the {@code GstHarness} sinkpad caps.
     * <p>
     * MT safe.
     * @param caps a {@link org.gstreamer.gst.Caps} to set on the harness sinkpad
     */
    public void setSinkCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        try {
            DowncallHandles.gst_harness_set_sink_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps.yieldOwnership();
    }
    
    /**
     * Sets the {@code GstHarness} sinkpad caps using a string.
     * <p>
     * MT safe.
     * @param str a {@code gchar} describing a {@link org.gstreamer.gst.Caps} to set on the harness sinkpad
     */
    public void setSinkCapsStr(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gst_harness_set_sink_caps_str.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GstHarness} srcpad caps. This must be done before any buffers
     * can legally be pushed from the harness to the element.
     * <p>
     * MT safe.
     * @param caps a {@link org.gstreamer.gst.Caps} to set on the harness srcpad
     */
    public void setSrcCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        try {
            DowncallHandles.gst_harness_set_src_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps.yieldOwnership();
    }
    
    /**
     * Sets the {@code GstHarness} srcpad caps using a string. This must be done before
     * any buffers can legally be pushed from the harness to the element.
     * <p>
     * MT safe.
     * @param str a {@code gchar} describing a {@link org.gstreamer.gst.Caps} to set on the harness srcpad
     */
    public void setSrcCapsStr(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gst_harness_set_src_caps_str.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Advance the {@link TestClock} to a specific time.
     * <p>
     * MT safe.
     * @param time a {@link org.gstreamer.gst.ClockTime} to advance the clock to
     * @return a {@code gboolean} {@code true} if the time could be set. {@code false} if not.
     */
    public boolean setTime(@NotNull org.gstreamer.gst.ClockTime time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_set_time.invokeExact(
                    handle(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the min latency reported by {@link Harness} when receiving a latency-query
     * @param latency a {@link org.gstreamer.gst.ClockTime} specifying the latency
     */
    public void setUpstreamLatency(@NotNull org.gstreamer.gst.ClockTime latency) {
        java.util.Objects.requireNonNull(latency, "Parameter 'latency' must not be null");
        try {
            DowncallHandles.gst_harness_set_upstream_latency.invokeExact(
                    handle(),
                    latency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience that calls gst_harness_push_to_sink {@code pushes} number of times.
     * Will abort the pushing if any one push fails.
     * <p>
     * MT safe.
     * @param pushes a {@code gint} with the number of calls to gst_harness_push_to_sink
     * @return a {@link org.gstreamer.gst.FlowReturn} with the result of the push
     */
    public @NotNull org.gstreamer.gst.FlowReturn sinkPushMany(int pushes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_sink_push_many.invokeExact(
                    handle(),
                    pushes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Transfer data from the src-{@link Harness} to the main-{@link Harness}. Similar to
     * gst_harness_push_from_src, this variant allows you to specify how many cranks
     * and how many pushes to perform. This can be useful for both moving a lot
     * of data at the same time, as well as cases when one crank does not equal one
     * buffer to push and v.v.
     * <p>
     * MT safe.
     * @param cranks a {@code gint} with the number of calls to gst_harness_crank_single_clock_wait
     * @param pushes a {@code gint} with the number of calls to gst_harness_push
     * @return a {@link org.gstreamer.gst.FlowReturn} with the result of the push
     */
    public @NotNull org.gstreamer.gst.FlowReturn srcCrankAndPushMany(int cranks, int pushes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_src_crank_and_push_many.invokeExact(
                    handle(),
                    cranks,
                    pushes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Similar to what gst_harness_src_push does with {@code GstBuffers}, this transfers
     * a {@link org.gstreamer.gst.Event} from the src-{@link Harness} to the main-{@link Harness}. Note that
     * some {@code GstEvents} are being transferred automagically. Look at sink_forward_pad
     * for details.
     * <p>
     * MT safe.
     * @return a {@code gboolean} with the result of the push
     */
    public boolean srcPushEvent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_src_push_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Start a custom stress-thread that will call your {@code callback} for every
     * iteration allowing you to do something nasty.
     * <p>
     * MT safe.
     * @param init a {@link org.gtk.glib.Func} that is called initially and only once
     * @param callback a {@link org.gtk.glib.Func} that is called as often as possible
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each call to the {@code callback}
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressCustomStart(@Nullable org.gtk.glib.Func init, @NotNull org.gtk.glib.Func callback, long sleep) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_custom_start.invokeExact(
                    handle(),
                    (Addressable) (init == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (init == null ? MemoryAddress.NULL : Interop.registerCallback(init)),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Call g_object_set with {@code name} and {@code value} in intervals of {@code sleep} microseconds
     * <p>
     * MT safe.
     * @param name a {@code gchar} specifying a property name
     * @param value a {@link org.gtk.gobject.Value} to set the property to
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each g_object_set with {@code name} and {@code value}
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPropertyStartFull(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Value value, long sleep) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_property_start_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value.handle(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push a {@link org.gstreamer.gst.Buffer} in intervals of {@code sleep} microseconds.
     * <p>
     * MT safe.
     * @param caps a {@link org.gstreamer.gst.Caps} for the {@link org.gstreamer.gst.Buffer}
     * @param segment a {@link org.gstreamer.gst.Segment}
     * @param buf a {@link org.gstreamer.gst.Buffer} to push
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each call to gst_pad_push
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushBufferStartFull(@NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Segment segment, @NotNull org.gstreamer.gst.Buffer buf, long sleep) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_buffer_start_full.invokeExact(
                    handle(),
                    caps.handle(),
                    segment.handle(),
                    buf.handle(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push a {@link org.gstreamer.gst.Buffer} returned by {@code func} in intervals of {@code sleep} microseconds.
     * <p>
     * MT safe.
     * @param caps a {@link org.gstreamer.gst.Caps} for the {@link org.gstreamer.gst.Buffer}
     * @param segment a {@link org.gstreamer.gst.Segment}
     * @param func a {@link HarnessPrepareBufferFunc} function called before every iteration
     * to prepare / create a {@link org.gstreamer.gst.Buffer} for pushing
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each call to gst_pad_push
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushBufferWithCbStartFull(@NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Segment segment, @NotNull org.gstreamer.check.HarnessPrepareBufferFunc func, long sleep) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_buffer_with_cb_start_full.invokeExact(
                    handle(),
                    caps.handle(),
                    segment.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbHarnessPrepareBufferFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push the {@code event} onto the harnessed {@link org.gstreamer.gst.Element} sinkpad in intervals of
     * {@code sleep} microseconds
     * <p>
     * MT safe.
     * @param event a {@link org.gstreamer.gst.Event} to push
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each gst_event_push with {@code event}
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushEventStartFull(@NotNull org.gstreamer.gst.Event event, long sleep) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_event_start_full.invokeExact(
                    handle(),
                    event.handle(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push a {@link org.gstreamer.gst.Event} returned by {@code func} onto the harnessed {@link org.gstreamer.gst.Element} sinkpad
     * in intervals of {@code sleep} microseconds.
     * <p>
     * MT safe.
     * @param func a {@link HarnessPrepareEventFunc} function called before every iteration
     * to prepare / create a {@link org.gstreamer.gst.Event} for pushing
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each call to gst_pad_push
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushEventWithCbStartFull(@NotNull org.gstreamer.check.HarnessPrepareEventFunc func, long sleep) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_event_with_cb_start_full.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbHarnessPrepareEventFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push the {@code event} onto the harnessed {@link org.gstreamer.gst.Element} srcpad in intervals of
     * {@code sleep} microseconds.
     * <p>
     * MT safe.
     * @param event a {@link org.gstreamer.gst.Event} to push
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each gst_event_push with {@code event}
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushUpstreamEventStartFull(@NotNull org.gstreamer.gst.Event event, long sleep) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_upstream_event_start_full.invokeExact(
                    handle(),
                    event.handle(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Push a {@link org.gstreamer.gst.Event} returned by {@code func} onto the harnessed {@link org.gstreamer.gst.Element} srcpad
     * in intervals of {@code sleep} microseconds.
     * <p>
     * MT safe.
     * @param func a {@link HarnessPrepareEventFunc} function called before every iteration
     * to prepare / create a {@link org.gstreamer.gst.Event} for pushing
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each call to gst_pad_push
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressPushUpstreamEventWithCbStartFull(@NotNull org.gstreamer.check.HarnessPrepareEventFunc func, long sleep) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_push_upstream_event_with_cb_start_full.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbHarnessPrepareEventFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Call gst_element_request_pad in intervals of {@code sleep} microseconds
     * <p>
     * MT safe.
     * @param templ a {@link org.gstreamer.gst.PadTemplate}
     * @param name a {@code gchar}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @param release a {@code gboolean}
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each gst_element_request_pad
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressRequestpadStartFull(@NotNull org.gstreamer.gst.PadTemplate templ, @NotNull java.lang.String name, @NotNull org.gstreamer.gst.Caps caps, boolean release, long sleep) {
        java.util.Objects.requireNonNull(templ, "Parameter 'templ' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_requestpad_start_full.invokeExact(
                    handle(),
                    templ.handle(),
                    Interop.allocateNativeString(name),
                    caps.handle(),
                    release ? 1 : 0,
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the state of your harnessed {@link org.gstreamer.gst.Element} from NULL to PLAYING and
     * back again, only pausing for {@code sleep} microseconds every time.
     * <p>
     * MT safe.
     * @param sleep a {@code gulong} specifying how long to sleep in (microseconds) for
     * each state-change
     * @return a {@link HarnessThread}
     */
    public @NotNull org.gstreamer.check.HarnessThread stressStatechangeStartFull(long sleep) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_stress_statechange_start_full.invokeExact(
                    handle(),
                    sleep);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.HarnessThread(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Pulls all pending data from the harness and returns it as a single
     * data slice.
     * @param size the size of the data in bytes
     * @return a pointer to the data, newly allocated. Free
     *     with g_free() when no longer needed. Will return {@code null} if there is no
     *     data.
     */
    public PointerByte takeAllData(Out<Long> size) {
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_take_all_data.invokeExact(
                    handle(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerByte(RESULT);
    }
    
    /**
     * Pulls all pending data from the harness and returns it as a single buffer.
     * @return the data as a buffer. Unref with gst_buffer_unref()
     *     when no longer needed.
     */
    public @NotNull org.gstreamer.gst.Buffer takeAllDataAsBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_take_all_data_as_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Pulls all pending data from the harness and returns it as a single {@link org.gtk.glib.Bytes}.
     * @return a pointer to the data, newly allocated. Free
     *     with g_free() when no longer needed.
     */
    public @NotNull org.gtk.glib.Bytes takeAllDataAsBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_take_all_data_as_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Tears down a {@code GstHarness}, freeing all resources allocated using it.
     * <p>
     * MT safe.
     */
    public void teardown() {
        try {
            DowncallHandles.gst_harness_teardown.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pulls a {@link org.gstreamer.gst.Buffer} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} sinkpad. Unlike
     * gst_harness_pull this will not wait for any buffers if not any are present,
     * and return {@code null} straight away.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Buffer} or {@code null} if no buffers are present in the {@link org.gtk.glib.AsyncQueue}
     */
    public @NotNull org.gstreamer.gst.Buffer tryPull() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_try_pull.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Pulls an {@link org.gstreamer.gst.Event} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} sinkpad.
     * See gst_harness_try_pull for details.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Event} or {@code null} if no buffers are present in the {@link org.gtk.glib.AsyncQueue}
     */
    public @NotNull org.gstreamer.gst.Event tryPullEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_try_pull_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * Pulls an {@link org.gstreamer.gst.Event} from the {@link org.gtk.glib.AsyncQueue} on the {@link Harness} srcpad.
     * See gst_harness_try_pull for details.
     * <p>
     * MT safe.
     * @return a {@link org.gstreamer.gst.Event} or {@code null} if no buffers are present in the {@link org.gtk.glib.AsyncQueue}
     */
    public @NotNull org.gstreamer.gst.Event tryPullUpstreamEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_try_pull_upstream_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * The number of {@code GstEvents} currently in the {@link Harness} srcpad {@link org.gtk.glib.AsyncQueue}
     * <p>
     * MT safe.
     * @return a {@code guint} number of events in the queue
     */
    public int upstreamEventsInQueue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_upstream_events_in_queue.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The total number of {@code GstEvents} that has arrived on the {@link Harness} srcpad
     * This number includes events handled by the harness as well as events
     * that have already been pulled out.
     * <p>
     * MT safe.
     * @return a {@code guint} number of events received
     */
    public int upstreamEventsReceived() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_upstream_events_received.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the system {@link org.gstreamer.gst.Clock} on the {@code GstHarness} {@link org.gstreamer.gst.Element}
     * <p>
     * MT safe.
     */
    public void useSystemclock() {
        try {
            DowncallHandles.gst_harness_use_systemclock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@link TestClock} on the {@link Harness} {@link org.gstreamer.gst.Element}
     * <p>
     * MT safe.
     */
    public void useTestclock() {
        try {
            DowncallHandles.gst_harness_use_testclock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Waits for {@code timeout} seconds until {@code waits} number of {@link org.gstreamer.gst.ClockID} waits is
     * registered with the {@link TestClock}. Useful for writing deterministic tests,
     * where you want to make sure that an expected number of waits have been
     * reached.
     * <p>
     * MT safe.
     * @param waits a {@code guint} describing the numbers of {@link org.gstreamer.gst.ClockID} registered with
     * the {@link TestClock}
     * @param timeout a {@code guint} describing how many seconds to wait for {@code waits} to be true
     * @return a {@code gboolean} {@code true} if the waits have been registered, {@code false} if not.
     * (Could be that it timed out waiting or that more waits than waits was found)
     */
    public boolean waitForClockIdWaits(int waits, int timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_wait_for_clock_id_waits.invokeExact(
                    handle(),
                    waits,
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a new harness. Works like gst_harness_new_with_padnames(), except it
     * assumes the {@link org.gstreamer.gst.Element} sinkpad is named "sink" and srcpad is named "src"
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness new_(@NotNull java.lang.String elementName) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new.invokeExact(
                    Interop.allocateNativeString(elementName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new empty harness. Use gst_harness_add_element_full() to add
     * an {@link org.gstreamer.gst.Element} to it.
     * <p>
     * MT safe.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness.
     * <p>
     * MT safe.
     * @param element a {@link org.gstreamer.gst.Element} to attach the harness to (transfer none)
     * @param hsrc a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness srcpad.
     * {@code null} will not create a harness srcpad.
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. Can be a static or request
     * or a sometimes pad that has been added. {@code null} will not get/request a sinkpad
     * from the element. (Like if the element is a src.)
     * @param hsink a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness sinkpad.
     * {@code null} will not create a harness sinkpad.
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad, similar to the
     * {@code element_sinkpad_name}.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newFull(@NotNull org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.StaticPadTemplate hsrc, @Nullable java.lang.String elementSinkpadName, @Nullable org.gstreamer.gst.StaticPadTemplate hsink, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_full.invokeExact(
                    element.handle(),
                    (Addressable) (hsrc == null ? MemoryAddress.NULL : hsrc.handle()),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (hsink == null ? MemoryAddress.NULL : hsink.handle()),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness, parsing the {@code launchline} and putting that in a {@link org.gstreamer.gst.Bin},
     * and then attches the harness to the bin.
     * <p>
     * MT safe.
     * @param launchline a {@code gchar} describing a gst-launch type line
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newParse(@NotNull java.lang.String launchline) {
        java.util.Objects.requireNonNull(launchline, "Parameter 'launchline' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_parse.invokeExact(
                    Interop.allocateNativeString(launchline));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness. Works in the same way as gst_harness_new_full(), only
     * that generic padtemplates are used for the harness src and sinkpads, which
     * will be sufficient in most usecases.
     * <p>
     * MT safe.
     * @param element a {@link org.gstreamer.gst.Element} to attach the harness to (transfer none)
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. {@code null} does not attach a
     * sinkpad
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad. {@code null} does not attach a
     * srcpad
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newWithElement(@NotNull org.gstreamer.gst.Element element, @Nullable java.lang.String elementSinkpadName, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_element.invokeExact(
                    element.handle(),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness. Works like gst_harness_new_with_element(),
     * except you specify the factoryname of the {@link org.gstreamer.gst.Element}
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. {@code null} does not attach a
     * sinkpad
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad. {@code null} does not attach a
     * srcpad
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newWithPadnames(@NotNull java.lang.String elementName, @Nullable java.lang.String elementSinkpadName, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_padnames.invokeExact(
                    Interop.allocateNativeString(elementName),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness, like gst_harness_new_full(), except it
     * assumes the {@link org.gstreamer.gst.Element} sinkpad is named "sink" and srcpad is named "src"
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @param hsrc a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness srcpad.
     * {@code null} will not create a harness srcpad.
     * @param hsink a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness sinkpad.
     * {@code null} will not create a harness sinkpad.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness newWithTemplates(@NotNull java.lang.String elementName, @Nullable org.gstreamer.gst.StaticPadTemplate hsrc, @Nullable org.gstreamer.gst.StaticPadTemplate hsink) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_templates.invokeExact(
                    Interop.allocateNativeString(elementName),
                    (Addressable) (hsrc == null ? MemoryAddress.NULL : hsrc.handle()),
                    (Addressable) (hsink == null ? MemoryAddress.NULL : hsink.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Stop the running {@link HarnessThread}
     * <p>
     * MT safe.
     * @param t a {@link HarnessThread}
     */
    public static int stressThreadStop(@NotNull org.gstreamer.check.HarnessThread t) {
        java.util.Objects.requireNonNull(t, "Parameter 't' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_stress_thread_stop.invokeExact(
                    t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_harness_add_element_full = Interop.downcallHandle(
            "gst_harness_add_element_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_element_sink_pad = Interop.downcallHandle(
            "gst_harness_add_element_sink_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_element_src_pad = Interop.downcallHandle(
            "gst_harness_add_element_src_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_parse = Interop.downcallHandle(
            "gst_harness_add_parse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_probe = Interop.downcallHandle(
            "gst_harness_add_probe",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_propose_allocation_meta = Interop.downcallHandle(
            "gst_harness_add_propose_allocation_meta",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_sink = Interop.downcallHandle(
            "gst_harness_add_sink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_sink_harness = Interop.downcallHandle(
            "gst_harness_add_sink_harness",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_sink_parse = Interop.downcallHandle(
            "gst_harness_add_sink_parse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_add_src = Interop.downcallHandle(
            "gst_harness_add_src",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_add_src_harness = Interop.downcallHandle(
            "gst_harness_add_src_harness",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_add_src_parse = Interop.downcallHandle(
            "gst_harness_add_src_parse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_buffers_in_queue = Interop.downcallHandle(
            "gst_harness_buffers_in_queue",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_buffers_received = Interop.downcallHandle(
            "gst_harness_buffers_received",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_crank_multiple_clock_waits = Interop.downcallHandle(
            "gst_harness_crank_multiple_clock_waits",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_crank_single_clock_wait = Interop.downcallHandle(
            "gst_harness_crank_single_clock_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_create_buffer = Interop.downcallHandle(
            "gst_harness_create_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_dump_to_file = Interop.downcallHandle(
            "gst_harness_dump_to_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_events_in_queue = Interop.downcallHandle(
            "gst_harness_events_in_queue",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_events_received = Interop.downcallHandle(
            "gst_harness_events_received",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_find_element = Interop.downcallHandle(
            "gst_harness_find_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_get = Interop.downcallHandle(
            "gst_harness_get",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_harness_get_allocator = Interop.downcallHandle(
            "gst_harness_get_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_get_last_pushed_timestamp = Interop.downcallHandle(
            "gst_harness_get_last_pushed_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_get_testclock = Interop.downcallHandle(
            "gst_harness_get_testclock",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_play = Interop.downcallHandle(
            "gst_harness_play",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_pull = Interop.downcallHandle(
            "gst_harness_pull",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_pull_event = Interop.downcallHandle(
            "gst_harness_pull_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_pull_until_eos = Interop.downcallHandle(
            "gst_harness_pull_until_eos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_pull_upstream_event = Interop.downcallHandle(
            "gst_harness_pull_upstream_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push = Interop.downcallHandle(
            "gst_harness_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push_and_pull = Interop.downcallHandle(
            "gst_harness_push_and_pull",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push_event = Interop.downcallHandle(
            "gst_harness_push_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push_from_src = Interop.downcallHandle(
            "gst_harness_push_from_src",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push_to_sink = Interop.downcallHandle(
            "gst_harness_push_to_sink",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_push_upstream_event = Interop.downcallHandle(
            "gst_harness_push_upstream_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_query_latency = Interop.downcallHandle(
            "gst_harness_query_latency",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set = Interop.downcallHandle(
            "gst_harness_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_harness_set_blocking_push_mode = Interop.downcallHandle(
            "gst_harness_set_blocking_push_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_caps = Interop.downcallHandle(
            "gst_harness_set_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_caps_str = Interop.downcallHandle(
            "gst_harness_set_caps_str",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_drop_buffers = Interop.downcallHandle(
            "gst_harness_set_drop_buffers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_set_forwarding = Interop.downcallHandle(
            "gst_harness_set_forwarding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_set_live = Interop.downcallHandle(
            "gst_harness_set_live",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_set_propose_allocator = Interop.downcallHandle(
            "gst_harness_set_propose_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_sink_caps = Interop.downcallHandle(
            "gst_harness_set_sink_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_sink_caps_str = Interop.downcallHandle(
            "gst_harness_set_sink_caps_str",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_src_caps = Interop.downcallHandle(
            "gst_harness_set_src_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_src_caps_str = Interop.downcallHandle(
            "gst_harness_set_src_caps_str",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_set_time = Interop.downcallHandle(
            "gst_harness_set_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_set_upstream_latency = Interop.downcallHandle(
            "gst_harness_set_upstream_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_sink_push_many = Interop.downcallHandle(
            "gst_harness_sink_push_many",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_src_crank_and_push_many = Interop.downcallHandle(
            "gst_harness_src_crank_and_push_many",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_src_push_event = Interop.downcallHandle(
            "gst_harness_src_push_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_stress_custom_start = Interop.downcallHandle(
            "gst_harness_stress_custom_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_property_start_full = Interop.downcallHandle(
            "gst_harness_stress_property_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_buffer_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_buffer_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_buffer_with_cb_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_buffer_with_cb_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_event_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_event_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_event_with_cb_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_event_with_cb_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_upstream_event_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_upstream_event_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_push_upstream_event_with_cb_start_full = Interop.downcallHandle(
            "gst_harness_stress_push_upstream_event_with_cb_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_requestpad_start_full = Interop.downcallHandle(
            "gst_harness_stress_requestpad_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_stress_statechange_start_full = Interop.downcallHandle(
            "gst_harness_stress_statechange_start_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_harness_take_all_data = Interop.downcallHandle(
            "gst_harness_take_all_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_take_all_data_as_buffer = Interop.downcallHandle(
            "gst_harness_take_all_data_as_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_take_all_data_as_bytes = Interop.downcallHandle(
            "gst_harness_take_all_data_as_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_teardown = Interop.downcallHandle(
            "gst_harness_teardown",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_try_pull = Interop.downcallHandle(
            "gst_harness_try_pull",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_try_pull_event = Interop.downcallHandle(
            "gst_harness_try_pull_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_try_pull_upstream_event = Interop.downcallHandle(
            "gst_harness_try_pull_upstream_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_upstream_events_in_queue = Interop.downcallHandle(
            "gst_harness_upstream_events_in_queue",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_upstream_events_received = Interop.downcallHandle(
            "gst_harness_upstream_events_received",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_use_systemclock = Interop.downcallHandle(
            "gst_harness_use_systemclock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_use_testclock = Interop.downcallHandle(
            "gst_harness_use_testclock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_wait_for_clock_id_waits = Interop.downcallHandle(
            "gst_harness_wait_for_clock_id_waits",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_harness_new = Interop.downcallHandle(
            "gst_harness_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_empty = Interop.downcallHandle(
            "gst_harness_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_full = Interop.downcallHandle(
            "gst_harness_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_parse = Interop.downcallHandle(
            "gst_harness_new_parse",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_element = Interop.downcallHandle(
            "gst_harness_new_with_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_padnames = Interop.downcallHandle(
            "gst_harness_new_with_padnames",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_templates = Interop.downcallHandle(
            "gst_harness_new_with_templates",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_stress_thread_stop = Interop.downcallHandle(
            "gst_harness_stress_thread_stop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Harness struct;
        
         /**
         * A {@link Harness.Build} object constructs a {@link Harness} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Harness.allocate();
        }
        
         /**
         * Finish building the {@link Harness} struct.
         * @return A new instance of {@code Harness} with the fields 
         *         that were set in the Build object.
         */
        public Harness construct() {
            return struct;
        }
        
        /**
         * the element inside the harness
         * @param element The value for the {@code element} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setElement(org.gstreamer.gst.Element element) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (element == null ? MemoryAddress.NULL : element.handle()));
            return this;
        }
        
        /**
         * the internal harness source pad
         * @param srcpad The value for the {@code srcpad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSrcpad(org.gstreamer.gst.Pad srcpad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("srcpad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcpad == null ? MemoryAddress.NULL : srcpad.handle()));
            return this;
        }
        
        /**
         * the internal harness sink pad
         * @param sinkpad The value for the {@code sinkpad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSinkpad(org.gstreamer.gst.Pad sinkpad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sinkpad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkpad == null ? MemoryAddress.NULL : sinkpad.handle()));
            return this;
        }
        
        /**
         * the source (input) harness (if any)
         * @param srcHarness The value for the {@code srcHarness} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSrcHarness(org.gstreamer.check.Harness srcHarness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_harness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcHarness == null ? MemoryAddress.NULL : srcHarness.handle()));
            return this;
        }
        
        /**
         * the sink (output) harness (if any)
         * @param sinkHarness The value for the {@code sinkHarness} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSinkHarness(org.gstreamer.check.Harness sinkHarness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_harness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkHarness == null ? MemoryAddress.NULL : sinkHarness.handle()));
            return this;
        }
        
        public Build setPriv(org.gstreamer.check.HarnessPrivate priv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
            return this;
        }
    }
}
