package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer uses a global clock to synchronize the plugins in a pipeline.
 * Different clock implementations are possible by implementing this abstract
 * base class or, more conveniently, by subclassing {@link SystemClock}.
 * <p>
 * The {@link Clock} returns a monotonically increasing time with the method
 * gst_clock_get_time(). Its accuracy and base time depend on the specific
 * clock implementation but time is always expressed in nanoseconds. Since the
 * baseline of the clock is undefined, the clock time returned is not
 * meaningful in itself, what matters are the deltas between two clock times.
 * The time returned by a clock is called the absolute time.
 * <p>
 * The pipeline uses the clock to calculate the running time. Usually all
 * renderers synchronize to the global clock using the buffer timestamps, the
 * {@code GST_EVENT_SEGMENT} events and the element's base time, see {@link Pipeline}.
 * <p>
 * A clock implementation can support periodic and single shot clock
 * notifications both synchronous and asynchronous.
 * <p>
 * One first needs to create a {@link ClockID} for the periodic or single shot
 * notification using gst_clock_new_single_shot_id() or
 * gst_clock_new_periodic_id().
 * <p>
 * To perform a blocking wait for the specific time of the {@link ClockID} use
 * gst_clock_id_wait(). To receive a callback when the specific time is reached
 * in the clock use gst_clock_id_wait_async(). Both these calls can be
 * interrupted with the gst_clock_id_unschedule() call. If the blocking wait is
 * unscheduled a return value of {@code GST_CLOCK_UNSCHEDULED} is returned.
 * <p>
 * Periodic callbacks scheduled async will be repeatedly called automatically
 * until they are unscheduled. To schedule a sync periodic callback,
 * gst_clock_id_wait() should be called repeatedly.
 * <p>
 * The async callbacks can happen from any thread, either provided by the core
 * or from a streaming thread. The application should be prepared for this.
 * <p>
 * A {@link ClockID} that has been unscheduled cannot be used again for any wait
 * operation, a new {@link ClockID} should be created and the old unscheduled one
 * should be destroyed with gst_clock_id_unref().
 * <p>
 * It is possible to perform a blocking wait on the same {@link ClockID} from
 * multiple threads. However, registering the same {@link ClockID} for multiple
 * async notifications is not possible, the callback will only be called for
 * the thread registering the entry last.
 * <p>
 * None of the wait operations unref the {@link ClockID}, the owner is responsible
 * for unreffing the ids itself. This holds for both periodic and single shot
 * notifications. The reason being that the owner of the {@link ClockID} has to
 * keep a handle to the {@link ClockID} to unblock the wait on FLUSHING events or
 * state changes and if the entry would be unreffed automatically, the handle
 * might become invalid without any notification.
 * <p>
 * These clock operations do not operate on the running time, so the callbacks
 * will also occur when not in PLAYING state as if the clock just keeps on
 * running. Some clocks however do not progress when the element that provided
 * the clock is not PLAYING.
 * <p>
 * When a clock has the {@code GST_CLOCK_FLAG_CAN_SET_MASTER} flag set, it can be
 * slaved to another {@link Clock} with gst_clock_set_master(). The clock will
 * then automatically be synchronized to this master clock by repeatedly
 * sampling the master clock and the slave clock and recalibrating the slave
 * clock with gst_clock_set_calibration(). This feature is mostly useful for
 * plugins that have an internal clock but must operate with another clock
 * selected by the {@link Pipeline}.  They can track the offset and rate difference
 * of their internal clock relative to the master clock by using the
 * gst_clock_get_calibration() function.
 * <p>
 * The master/slave synchronisation can be tuned with the {@link Clock}:timeout,
 * {@link Clock}:window-size and {@link Clock}:window-threshold properties.
 * The {@link Clock}:timeout property defines the interval to sample the master
 * clock and run the calibration functions. {@link Clock}:window-size defines the
 * number of samples to use when calibrating and {@link Clock}:window-threshold
 * defines the minimum number of samples before the calibration is performed.
 */
public class Clock extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstClock";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Clock proxy instance for the provided memory address.
     * <p>
     * Because Clock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Clock(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Clock> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Clock(input, ownership);
    
    /**
     * The time {@code master} of the master clock and the time {@code slave} of the slave
     * clock are added to the list of observations. If enough observations
     * are available, a linear regression algorithm is run on the
     * observations and {@code clock} is recalibrated.
     * <p>
     * If this functions returns {@code true}, {@code r_squared} will contain the
     * correlation coefficient of the interpolation. A value of 1.0
     * means a perfect regression was performed. This value can
     * be used to control the sampling frequency of the master and slave
     * clocks.
     * @param slave a time on the slave
     * @param master a time on the master
     * @param rSquared a pointer to hold the result
     * @return {@code true} if enough observations were added to run the
     * regression algorithm.
     */
    public boolean addObservation(org.gstreamer.gst.ClockTime slave, org.gstreamer.gst.ClockTime master, Out<Double> rSquared) {
        MemorySegment rSquaredPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_add_observation.invokeExact(
                    handle(),
                    slave.getValue().longValue(),
                    master.getValue().longValue(),
                    (Addressable) rSquaredPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rSquared.set(rSquaredPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a clock observation to the internal slaving algorithm the same as
     * gst_clock_add_observation(), and return the result of the master clock
     * estimation, without updating the internal calibration.
     * <p>
     * The caller can then take the results and call gst_clock_set_calibration()
     * with the values, or some modified version of them.
     * @param slave a time on the slave
     * @param master a time on the master
     * @param rSquared a pointer to hold the result
     * @param internal a location to store the internal time
     * @param external a location to store the external time
     * @param rateNum a location to store the rate numerator
     * @param rateDenom a location to store the rate denominator
     * @return {@code true} if enough observations were added to run the
     * regression algorithm.
     */
    public boolean addObservationUnapplied(org.gstreamer.gst.ClockTime slave, org.gstreamer.gst.ClockTime master, Out<Double> rSquared, @Nullable org.gstreamer.gst.ClockTime internal, @Nullable org.gstreamer.gst.ClockTime external, @Nullable org.gstreamer.gst.ClockTime rateNum, @Nullable org.gstreamer.gst.ClockTime rateDenom) {
        MemorySegment rSquaredPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment internalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment externalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment rateNumPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment rateDenomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_add_observation_unapplied.invokeExact(
                    handle(),
                    slave.getValue().longValue(),
                    master.getValue().longValue(),
                    (Addressable) rSquaredPOINTER.address(),
                    (Addressable) (internal == null ? MemoryAddress.NULL : (Addressable) internalPOINTER.address()),
                    (Addressable) (external == null ? MemoryAddress.NULL : (Addressable) externalPOINTER.address()),
                    (Addressable) (rateNum == null ? MemoryAddress.NULL : (Addressable) rateNumPOINTER.address()),
                    (Addressable) (rateDenom == null ? MemoryAddress.NULL : (Addressable) rateDenomPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rSquared.set(rSquaredPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (internal != null) internal.setValue(internalPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (external != null) external.setValue(externalPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (rateNum != null) rateNum.setValue(rateNumPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (rateDenom != null) rateDenom.setValue(rateDenomPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the given {@code internal} clock time to the external time, adjusting for the
     * rate and reference time set with gst_clock_set_calibration() and making sure
     * that the returned time is increasing. This function should be called with the
     * clock's OBJECT_LOCK held and is mainly used by clock subclasses.
     * <p>
     * This function is the reverse of gst_clock_unadjust_unlocked().
     * @param internal a clock time
     * @return the converted time of the clock.
     */
    public org.gstreamer.gst.ClockTime adjustUnlocked(org.gstreamer.gst.ClockTime internal) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_adjust_unlocked.invokeExact(
                    handle(),
                    internal.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Converts the given {@code internal_target} clock time to the external time,
     * using the passed calibration parameters. This function performs the
     * same calculation as gst_clock_adjust_unlocked() when called using the
     * current calibration parameters, but doesn't ensure a monotonically
     * increasing result as gst_clock_adjust_unlocked() does.
     * <p>
     * Note: The {@code clock} parameter is unused and can be NULL
     * @param internalTarget a clock time
     * @param cinternal a reference internal time
     * @param cexternal a reference external time
     * @param cnum the numerator of the rate of the clock relative to its
     *        internal time
     * @param cdenom the denominator of the rate of the clock
     * @return the converted time of the clock.
     */
    public org.gstreamer.gst.ClockTime adjustWithCalibration(org.gstreamer.gst.ClockTime internalTarget, org.gstreamer.gst.ClockTime cinternal, org.gstreamer.gst.ClockTime cexternal, org.gstreamer.gst.ClockTime cnum, org.gstreamer.gst.ClockTime cdenom) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_adjust_with_calibration.invokeExact(
                    handle(),
                    internalTarget.getValue().longValue(),
                    cinternal.getValue().longValue(),
                    cexternal.getValue().longValue(),
                    cnum.getValue().longValue(),
                    cdenom.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the internal rate and reference time of {@code clock}. See
     * gst_clock_set_calibration() for more information.
     * <p>
     * {@code internal}, {@code external}, {@code rate_num}, and {@code rate_denom} can be left {@code null} if the
     * caller is not interested in the values.
     * @param internal a location to store the internal time
     * @param external a location to store the external time
     * @param rateNum a location to store the rate numerator
     * @param rateDenom a location to store the rate denominator
     */
    public void getCalibration(@Nullable org.gstreamer.gst.ClockTime internal, @Nullable org.gstreamer.gst.ClockTime external, @Nullable org.gstreamer.gst.ClockTime rateNum, @Nullable org.gstreamer.gst.ClockTime rateDenom) {
        MemorySegment internalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment externalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment rateNumPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment rateDenomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_clock_get_calibration.invokeExact(
                    handle(),
                    (Addressable) (internal == null ? MemoryAddress.NULL : (Addressable) internalPOINTER.address()),
                    (Addressable) (external == null ? MemoryAddress.NULL : (Addressable) externalPOINTER.address()),
                    (Addressable) (rateNum == null ? MemoryAddress.NULL : (Addressable) rateNumPOINTER.address()),
                    (Addressable) (rateDenom == null ? MemoryAddress.NULL : (Addressable) rateDenomPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (internal != null) internal.setValue(internalPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (external != null) external.setValue(externalPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (rateNum != null) rateNum.setValue(rateNumPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (rateDenom != null) rateDenom.setValue(rateDenomPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Gets the current internal time of the given clock. The time is returned
     * unadjusted for the offset and the rate.
     * @return the internal time of the clock. Or {@code GST_CLOCK_TIME_NONE} when
     * given invalid input.
     */
    public org.gstreamer.gst.ClockTime getInternalTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_get_internal_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the master clock that {@code clock} is slaved to or {@code null} when the clock is
     * not slaved to any master clock.
     * @return a master {@link Clock} or {@code null}
     *     when this clock is not slaved to a master clock.
     */
    public @Nullable org.gstreamer.gst.Clock getMaster() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_clock_get_master.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the accuracy of the clock. The accuracy of the clock is the granularity
     * of the values returned by gst_clock_get_time().
     * @return the resolution of the clock in units of {@link ClockTime}.
     */
    public org.gstreamer.gst.ClockTime getResolution() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_get_resolution.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the current time of the given clock. The time is always
     * monotonically increasing and adjusted according to the current
     * offset and rate.
     * @return the time of the clock. Or {@code GST_CLOCK_TIME_NONE} when
     * given invalid input.
     */
    public org.gstreamer.gst.ClockTime getTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_get_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the amount of time that master and slave clocks are sampled.
     * @return the interval between samples.
     */
    public org.gstreamer.gst.ClockTime getTimeout() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_get_timeout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Checks if the clock is currently synced, by looking at whether
     * {@link ClockFlags#NEEDS_STARTUP_SYNC} is set.
     * @return {@code true} if the clock is currently synced
     */
    public boolean isSynced() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_is_synced.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets an ID from {@code clock} to trigger a periodic notification.
     * The periodic notifications will start at time {@code start_time} and
     * will then be fired with the given {@code interval}.
     * @param startTime the requested start time
     * @param interval the requested interval
     * @return a {@link ClockID} that can be used to request the
     *     time notification.
     */
    public org.gstreamer.gst.ClockID newPeriodicId(org.gstreamer.gst.ClockTime startTime, org.gstreamer.gst.ClockTime interval) {
        java.lang.foreign.MemoryAddress RESULT;
        try {
            RESULT = (java.lang.foreign.MemoryAddress) DowncallHandles.gst_clock_new_periodic_id.invokeExact(
                    handle(),
                    startTime.getValue().longValue(),
                    interval.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockID(RESULT);
    }
    
    /**
     * Gets a {@link ClockID} from {@code clock} to trigger a single shot
     * notification at the requested time.
     * @param time the requested time
     * @return a {@link ClockID} that can be used to request the
     *     time notification.
     */
    public org.gstreamer.gst.ClockID newSingleShotId(org.gstreamer.gst.ClockTime time) {
        java.lang.foreign.MemoryAddress RESULT;
        try {
            RESULT = (java.lang.foreign.MemoryAddress) DowncallHandles.gst_clock_new_single_shot_id.invokeExact(
                    handle(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockID(RESULT);
    }
    
    /**
     * Reinitializes the provided periodic {@code id} to the provided start time and
     * interval. Does not modify the reference count.
     * @param id a {@link ClockID}
     * @param startTime the requested start time
     * @param interval the requested interval
     * @return {@code true} if the GstClockID could be reinitialized to the provided
     * {@code time}, else {@code false}.
     */
    public boolean periodicIdReinit(org.gstreamer.gst.ClockID id, org.gstreamer.gst.ClockTime startTime, org.gstreamer.gst.ClockTime interval) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_periodic_id_reinit.invokeExact(
                    handle(),
                    (Addressable) id.getValue(),
                    startTime.getValue().longValue(),
                    interval.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adjusts the rate and time of {@code clock}. A rate of 1/1 is the normal speed of
     * the clock. Values bigger than 1/1 make the clock go faster.
     * <p>
     * {@code internal} and {@code external} are calibration parameters that arrange that
     * gst_clock_get_time() should have been {@code external} at internal time {@code internal}.
     * This internal time should not be in the future; that is, it should be less
     * than the value of gst_clock_get_internal_time() when this function is called.
     * <p>
     * Subsequent calls to gst_clock_get_time() will return clock times computed as
     * follows:
     * <pre>{@code  C
     *   time = (internal_time - internal) * rate_num / rate_denom + external
     * }</pre>
     * <p>
     * This formula is implemented in gst_clock_adjust_unlocked(). Of course, it
     * tries to do the integer arithmetic as precisely as possible.
     * <p>
     * Note that gst_clock_get_time() always returns increasing values so when you
     * move the clock backwards, gst_clock_get_time() will report the previous value
     * until the clock catches up.
     * @param internal a reference internal time
     * @param external a reference external time
     * @param rateNum the numerator of the rate of the clock relative to its
     *            internal time
     * @param rateDenom the denominator of the rate of the clock
     */
    public void setCalibration(org.gstreamer.gst.ClockTime internal, org.gstreamer.gst.ClockTime external, org.gstreamer.gst.ClockTime rateNum, org.gstreamer.gst.ClockTime rateDenom) {
        try {
            DowncallHandles.gst_clock_set_calibration.invokeExact(
                    handle(),
                    internal.getValue().longValue(),
                    external.getValue().longValue(),
                    rateNum.getValue().longValue(),
                    rateDenom.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code master} as the master clock for {@code clock}. {@code clock} will be automatically
     * calibrated so that gst_clock_get_time() reports the same time as the
     * master clock.
     * <p>
     * A clock provider that slaves its clock to a master can get the current
     * calibration values with gst_clock_get_calibration().
     * <p>
     * {@code master} can be {@code null} in which case {@code clock} will not be slaved anymore. It will
     * however keep reporting its time adjusted with the last configured rate
     * and time offsets.
     * @param master a master {@link Clock}
     * @return {@code true} if the clock is capable of being slaved to a master clock.
     * Trying to set a master on a clock without the
     * {@code GST_CLOCK_FLAG_CAN_SET_MASTER} flag will make this function return {@code false}.
     */
    public boolean setMaster(@Nullable org.gstreamer.gst.Clock master) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_set_master.invokeExact(
                    handle(),
                    (Addressable) (master == null ? MemoryAddress.NULL : master.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the accuracy of the clock. Some clocks have the possibility to operate
     * with different accuracy at the expense of more resource usage. There is
     * normally no need to change the default resolution of a clock. The resolution
     * of a clock can only be changed if the clock has the
     * {@code GST_CLOCK_FLAG_CAN_SET_RESOLUTION} flag set.
     * @param resolution The resolution to set
     * @return the new resolution of the clock.
     */
    public org.gstreamer.gst.ClockTime setResolution(org.gstreamer.gst.ClockTime resolution) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_set_resolution.invokeExact(
                    handle(),
                    resolution.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Sets {@code clock} to synced and emits the {@link Clock}::synced signal, and wakes up any
     * thread waiting in gst_clock_wait_for_sync().
     * <p>
     * This function must only be called if {@link ClockFlags#NEEDS_STARTUP_SYNC}
     * is set on the clock, and is intended to be called by subclasses only.
     * @param synced if the clock is synced
     */
    public void setSynced(boolean synced) {
        try {
            DowncallHandles.gst_clock_set_synced.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(synced, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of time, in nanoseconds, to sample master and slave
     * clocks
     * @param timeout a timeout
     */
    public void setTimeout(org.gstreamer.gst.ClockTime timeout) {
        try {
            DowncallHandles.gst_clock_set_timeout.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reinitializes the provided single shot {@code id} to the provided time. Does not
     * modify the reference count.
     * @param id a {@link ClockID}
     * @param time The requested time.
     * @return {@code true} if the GstClockID could be reinitialized to the provided
     * {@code time}, else {@code false}.
     */
    public boolean singleShotIdReinit(org.gstreamer.gst.ClockID id, org.gstreamer.gst.ClockTime time) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_single_shot_id_reinit.invokeExact(
                    handle(),
                    (Addressable) id.getValue(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the given {@code external} clock time to the internal time of {@code clock},
     * using the rate and reference time set with gst_clock_set_calibration().
     * This function should be called with the clock's OBJECT_LOCK held and
     * is mainly used by clock subclasses.
     * <p>
     * This function is the reverse of gst_clock_adjust_unlocked().
     * @param external an external clock time
     * @return the internal time of the clock corresponding to {@code external}.
     */
    public org.gstreamer.gst.ClockTime unadjustUnlocked(org.gstreamer.gst.ClockTime external) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_unadjust_unlocked.invokeExact(
                    handle(),
                    external.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Converts the given {@code external_target} clock time to the internal time,
     * using the passed calibration parameters. This function performs the
     * same calculation as gst_clock_unadjust_unlocked() when called using the
     * current calibration parameters.
     * <p>
     * Note: The {@code clock} parameter is unused and can be NULL
     * @param externalTarget a clock time
     * @param cinternal a reference internal time
     * @param cexternal a reference external time
     * @param cnum the numerator of the rate of the clock relative to its
     *        internal time
     * @param cdenom the denominator of the rate of the clock
     * @return the converted time of the clock.
     */
    public org.gstreamer.gst.ClockTime unadjustWithCalibration(org.gstreamer.gst.ClockTime externalTarget, org.gstreamer.gst.ClockTime cinternal, org.gstreamer.gst.ClockTime cexternal, org.gstreamer.gst.ClockTime cnum, org.gstreamer.gst.ClockTime cdenom) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_unadjust_with_calibration.invokeExact(
                    handle(),
                    externalTarget.getValue().longValue(),
                    cinternal.getValue().longValue(),
                    cexternal.getValue().longValue(),
                    cnum.getValue().longValue(),
                    cdenom.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Waits until {@code clock} is synced for reporting the current time. If {@code timeout}
     * is {@code GST_CLOCK_TIME_NONE} it will wait forever, otherwise it will time out
     * after {@code timeout} nanoseconds.
     * <p>
     * For asynchronous waiting, the {@link Clock}::synced signal can be used.
     * <p>
     * This returns immediately with {@code true} if {@link ClockFlags#NEEDS_STARTUP_SYNC}
     * is not set on the clock, or if the clock is already synced.
     * @param timeout timeout for waiting or {@code GST_CLOCK_TIME_NONE}
     * @return {@code true} if waiting was successful, or {@code false} on timeout
     */
    public boolean waitForSync(org.gstreamer.gst.ClockTime timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_wait_for_sync.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Compares the two {@link ClockID} instances. This function can be used
     * as a GCompareFunc when sorting ids.
     * @param id1 A {@link ClockID}
     * @param id2 A {@link ClockID} to compare with
     * @return negative value if {@code a < b}; zero if {@code a = b}; positive value if {@code a > b}
     */
    public static int idCompareFunc(@Nullable java.lang.foreign.MemoryAddress id1, @Nullable java.lang.foreign.MemoryAddress id2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_id_compare_func.invokeExact(
                    (Addressable) (id1 == null ? MemoryAddress.NULL : (Addressable) id1),
                    (Addressable) (id2 == null ? MemoryAddress.NULL : (Addressable) id2));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function returns the underlying clock.
     * @param id a {@link ClockID}
     * @return a {@link Clock} or {@code null} when the
     *     underlying clock has been freed.
     */
    public static @Nullable org.gstreamer.gst.Clock idGetClock(org.gstreamer.gst.ClockID id) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_clock_id_get_clock.invokeExact(
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the time of the clock ID
     * @param id The {@link ClockID} to query
     * @return the time of the given clock id.
     */
    public static org.gstreamer.gst.ClockTime idGetTime(org.gstreamer.gst.ClockID id) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_clock_id_get_time.invokeExact(
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Increases the refcount of given {@code id}.
     * @param id The {@link ClockID} to ref
     * @return The same {@link ClockID} with increased refcount.
     */
    public static org.gstreamer.gst.ClockID idRef(org.gstreamer.gst.ClockID id) {
        java.lang.foreign.MemoryAddress RESULT;
        try {
            RESULT = (java.lang.foreign.MemoryAddress) DowncallHandles.gst_clock_id_ref.invokeExact(
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockID(RESULT);
    }
    
    /**
     * Unrefs given {@code id}. When the refcount reaches 0 the
     * {@link ClockID} will be freed.
     * @param id The {@link ClockID} to unref
     */
    public static void idUnref(org.gstreamer.gst.ClockID id) {
        try {
            DowncallHandles.gst_clock_id_unref.invokeExact(
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Cancels an outstanding request with {@code id}. This can either
     * be an outstanding async notification or a pending sync notification.
     * After this call, {@code id} cannot be used anymore to receive sync or
     * async notifications, you need to create a new {@link ClockID}.
     * @param id The id to unschedule
     */
    public static void idUnschedule(org.gstreamer.gst.ClockID id) {
        try {
            DowncallHandles.gst_clock_id_unschedule.invokeExact(
                    (Addressable) id.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function returns whether {@code id} uses {@code clock} as the underlying clock.
     * {@code clock} can be NULL, in which case the return value indicates whether
     * the underlying clock has been freed.  If this is the case, the {@code id} is
     * no longer usable and should be freed.
     * @param id a {@link ClockID} to check
     * @param clock a {@link Clock} to compare against
     * @return whether the clock {@code id} uses the same underlying {@link Clock} {@code clock}.
     */
    public static boolean idUsesClock(org.gstreamer.gst.ClockID id, org.gstreamer.gst.Clock clock) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_id_uses_clock.invokeExact(
                    (Addressable) id.getValue(),
                    clock.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Performs a blocking wait on {@code id}.
     * {@code id} should have been created with gst_clock_new_single_shot_id()
     * or gst_clock_new_periodic_id() and should not have been unscheduled
     * with a call to gst_clock_id_unschedule().
     * <p>
     * If the {@code jitter} argument is not {@code null} and this function returns {@code GST_CLOCK_OK}
     * or {@code GST_CLOCK_EARLY}, it will contain the difference
     * against the clock and the time of {@code id} when this method was
     * called.
     * Positive values indicate how late {@code id} was relative to the clock
     * (in which case this function will return {@code GST_CLOCK_EARLY}).
     * Negative values indicate how much time was spent waiting on the clock
     * before this function returned.
     * @param id The {@link ClockID} to wait on
     * @param jitter a pointer that will contain the jitter,
     *     can be {@code null}.
     * @return the result of the blocking wait. {@code GST_CLOCK_EARLY} will be returned
     * if the current clock time is past the time of {@code id}, {@code GST_CLOCK_OK} if
     * {@code id} was scheduled in time. {@code GST_CLOCK_UNSCHEDULED} if {@code id} was
     * unscheduled with gst_clock_id_unschedule().
     */
    public static org.gstreamer.gst.ClockReturn idWait(org.gstreamer.gst.ClockID id, @Nullable org.gstreamer.gst.ClockTimeDiff jitter) {
        MemorySegment jitterPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_id_wait.invokeExact(
                    (Addressable) id.getValue(),
                    (Addressable) (jitter == null ? MemoryAddress.NULL : (Addressable) jitterPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (jitter != null) jitter.setValue(jitterPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return org.gstreamer.gst.ClockReturn.of(RESULT);
    }
    
    /**
     * Registers a callback on the given {@link ClockID} {@code id} with the given
     * function and user_data. When passing a {@link ClockID} with an invalid
     * time to this function, the callback will be called immediately
     * with  a time set to {@code GST_CLOCK_TIME_NONE}. The callback will
     * be called when the time of {@code id} has been reached.
     * <p>
     * The callback {@code func} can be invoked from any thread, either provided by the
     * core or from a streaming thread. The application should be prepared for this.
     * @param id a {@link ClockID} to wait on
     * @param func The callback function
     * @param destroyData {@link org.gtk.glib.DestroyNotify} for user_data
     * @return the result of the non blocking wait.
     */
    public static org.gstreamer.gst.ClockReturn idWaitAsync(org.gstreamer.gst.ClockID id, org.gstreamer.gst.ClockCallback func, org.gtk.glib.DestroyNotify destroyData) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_clock_id_wait_async.invokeExact(
                    (Addressable) id.getValue(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.ClockReturn.of(RESULT);
    }
    
    @FunctionalInterface
    public interface Synced {
        void run(boolean synced);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceClock, int synced) {
            run(Marshal.integerToBoolean.marshal(synced, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Synced.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signaled on clocks with {@link ClockFlags#NEEDS_STARTUP_SYNC} set once
     * the clock is synchronized, or when it completely lost synchronization.
     * This signal will not be emitted on clocks without the flag.
     * <p>
     * This signal will be emitted from an arbitrary thread, most likely not
     * the application's main thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Clock.Synced> onSynced(Clock.Synced handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("synced"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Clock.Builder} object constructs a {@link Clock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Clock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Clock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Clock}.
         * @return A new instance of {@code Clock} with the properties 
         *         that were set in the Builder object.
         */
        public Clock build() {
            return (Clock) org.gtk.gobject.GObject.newWithProperties(
                Clock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setTimeout(long timeout) {
            names.add("timeout");
            values.add(org.gtk.gobject.Value.create(timeout));
            return this;
        }
        
        public Builder setWindowSize(int windowSize) {
            names.add("window-size");
            values.add(org.gtk.gobject.Value.create(windowSize));
            return this;
        }
        
        public Builder setWindowThreshold(int windowThreshold) {
            names.add("window-threshold");
            values.add(org.gtk.gobject.Value.create(windowThreshold));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_clock_add_observation = Interop.downcallHandle(
            "gst_clock_add_observation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_add_observation_unapplied = Interop.downcallHandle(
            "gst_clock_add_observation_unapplied",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_adjust_unlocked = Interop.downcallHandle(
            "gst_clock_adjust_unlocked",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_adjust_with_calibration = Interop.downcallHandle(
            "gst_clock_adjust_with_calibration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_get_calibration = Interop.downcallHandle(
            "gst_clock_get_calibration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_get_internal_time = Interop.downcallHandle(
            "gst_clock_get_internal_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_get_master = Interop.downcallHandle(
            "gst_clock_get_master",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_get_resolution = Interop.downcallHandle(
            "gst_clock_get_resolution",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_get_time = Interop.downcallHandle(
            "gst_clock_get_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_get_timeout = Interop.downcallHandle(
            "gst_clock_get_timeout",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_is_synced = Interop.downcallHandle(
            "gst_clock_is_synced",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_new_periodic_id = Interop.downcallHandle(
            "gst_clock_new_periodic_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_new_single_shot_id = Interop.downcallHandle(
            "gst_clock_new_single_shot_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_periodic_id_reinit = Interop.downcallHandle(
            "gst_clock_periodic_id_reinit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_set_calibration = Interop.downcallHandle(
            "gst_clock_set_calibration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_set_master = Interop.downcallHandle(
            "gst_clock_set_master",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_set_resolution = Interop.downcallHandle(
            "gst_clock_set_resolution",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_set_synced = Interop.downcallHandle(
            "gst_clock_set_synced",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_clock_set_timeout = Interop.downcallHandle(
            "gst_clock_set_timeout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_single_shot_id_reinit = Interop.downcallHandle(
            "gst_clock_single_shot_id_reinit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_unadjust_unlocked = Interop.downcallHandle(
            "gst_clock_unadjust_unlocked",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_unadjust_with_calibration = Interop.downcallHandle(
            "gst_clock_unadjust_with_calibration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_wait_for_sync = Interop.downcallHandle(
            "gst_clock_wait_for_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_get_type = Interop.downcallHandle(
            "gst_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_clock_id_compare_func = Interop.downcallHandle(
            "gst_clock_id_compare_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_get_clock = Interop.downcallHandle(
            "gst_clock_id_get_clock",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_get_time = Interop.downcallHandle(
            "gst_clock_id_get_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_ref = Interop.downcallHandle(
            "gst_clock_id_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_unref = Interop.downcallHandle(
            "gst_clock_id_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_unschedule = Interop.downcallHandle(
            "gst_clock_id_unschedule",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_uses_clock = Interop.downcallHandle(
            "gst_clock_id_uses_clock",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_wait = Interop.downcallHandle(
            "gst_clock_id_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_clock_id_wait_async = Interop.downcallHandle(
            "gst_clock_id_wait_async",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
