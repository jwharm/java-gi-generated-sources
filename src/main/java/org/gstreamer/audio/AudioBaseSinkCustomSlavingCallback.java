package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is set with gst_audio_base_sink_set_custom_slaving_callback()
 * and is called during playback. It receives the current time of external and
 * internal clocks, which the callback can then use to apply any custom
 * slaving/synchronization schemes.
 * <p>
 * The external clock is the sink's element clock, the internal one is the
 * internal audio clock. The internal audio clock's calibration is applied to
 * the timestamps before they are passed to the callback. The difference between
 * etime and itime is the skew; how much internal and external clock lie apart
 * from each other. A skew of 0 means both clocks are perfectly in sync.
 * itime &gt; etime means the external clock is going slower, while itime &lt; etime
 * means it is going faster than the internal clock. etime and itime are always
 * valid timestamps, except for when a discontinuity happens.
 * <p>
 * requested_skew is an output value the callback can write to. It informs the
 * sink of whether or not it should move the playout pointer, and if so, by how
 * much. This pointer is only NULL if a discontinuity occurs; otherwise, it is
 * safe to write to *requested_skew. The default skew is 0.
 * <p>
 * The sink may experience discontinuities. If one happens, discont is TRUE,
 * itime, etime are set to GST_CLOCK_TIME_NONE, and requested_skew is NULL.
 * This makes it possible to reset custom clock slaving algorithms when a
 * discontinuity happens.
 * @version 1.6
 */
@FunctionalInterface
public interface AudioBaseSinkCustomSlavingCallback {
    void run(org.gstreamer.audio.AudioBaseSink sink, org.gstreamer.gst.ClockTime etime, org.gstreamer.gst.ClockTime itime, org.gstreamer.gst.ClockTimeDiff requestedSkew, org.gstreamer.audio.AudioBaseSinkDiscontReason discontReason);

    @ApiStatus.Internal default void upcall(MemoryAddress sink, long etime, long itime, MemoryAddress requestedSkew, int discontReason, MemoryAddress userData) {
        org.gstreamer.gst.ClockTimeDiff requestedSkewALIAS = new org.gstreamer.gst.ClockTimeDiff(requestedSkew.get(Interop.valueLayout.C_LONG, 0));
        run((org.gstreamer.audio.AudioBaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioBaseSink.fromAddress).marshal(sink, Ownership.NONE), new org.gstreamer.gst.ClockTime(etime), new org.gstreamer.gst.ClockTime(itime), requestedSkewALIAS, org.gstreamer.audio.AudioBaseSinkDiscontReason.of(discontReason));
        requestedSkew.set(Interop.valueLayout.C_LONG, 0, requestedSkewALIAS.getValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioBaseSinkCustomSlavingCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
