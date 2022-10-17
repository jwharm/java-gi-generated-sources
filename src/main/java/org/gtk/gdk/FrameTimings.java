package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkFrameTimings} object holds timing information for a single frame
 * of the application’s displays.
 * <p>
 * To retrieve {@code GdkFrameTimings} objects, use {@link FrameClock#getTimings}
 * or {@link FrameClock#getCurrentTimings}. The information in
 * {@code GdkFrameTimings} is useful for precise synchronization of video with
 * the event or audio streams, and for measuring quality metrics for the
 * application’s display, such as latency and jitter.
 */
public class FrameTimings extends io.github.jwharm.javagi.ResourceBase {

    public FrameTimings(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gdk_frame_timings_get_complete = Interop.downcallHandle(
        "gdk_frame_timings_get_complete",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code timings} are complete.
     * <p>
     * The timing information in a {@code GdkFrameTimings} is filled in
     * incrementally as the frame as drawn and passed off to the
     * window system for processing and display to the user. The
     * accessor functions for {@code GdkFrameTimings} can return 0 to
     * indicate an unavailable value for two reasons: either because
     * the information is not yet available, or because it isn't
     * available at all.
     * <p>
     * Once this function returns {@code true} for a frame, you can be
     * certain that no further values will become available and be
     * stored in the {@code GdkFrameTimings}.
     */
    public boolean getComplete() {
        int RESULT;
        try {
            RESULT = (int) gdk_frame_timings_get_complete.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_frame_timings_get_frame_counter = Interop.downcallHandle(
        "gdk_frame_timings_get_frame_counter",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the frame counter value of the {@code GdkFrameClock} when
     * this frame was drawn.
     */
    public long getFrameCounter() {
        long RESULT;
        try {
            RESULT = (long) gdk_frame_timings_get_frame_counter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_frame_timings_get_frame_time = Interop.downcallHandle(
        "gdk_frame_timings_get_frame_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the frame time for the frame.
     * <p>
     * This is the time value that is typically used to time
     * animations for the frame. See {@link FrameClock#getFrameTime}.
     */
    public long getFrameTime() {
        long RESULT;
        try {
            RESULT = (long) gdk_frame_timings_get_frame_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_frame_timings_get_predicted_presentation_time = Interop.downcallHandle(
        "gdk_frame_timings_get_predicted_presentation_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the predicted time at which this frame will be displayed.
     * <p>
     * Although no predicted time may be available, if one is available,
     * it will be available while the frame is being generated, in contrast
     * to {@link FrameTimings#getPresentationTime}, which is only
     * available after the frame has been presented.
     * <p>
     * In general, if you are simply animating, you should use
     * {@link FrameClock#getFrameTime} rather than this function,
     * but this function is useful for applications that want exact control
     * over latency. For example, a movie player may want this information
     * for Audio/Video synchronization.
     */
    public long getPredictedPresentationTime() {
        long RESULT;
        try {
            RESULT = (long) gdk_frame_timings_get_predicted_presentation_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_frame_timings_get_presentation_time = Interop.downcallHandle(
        "gdk_frame_timings_get_presentation_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Reurns the presentation time.
     * <p>
     * This is the time at which the frame became visible to the user.
     */
    public long getPresentationTime() {
        long RESULT;
        try {
            RESULT = (long) gdk_frame_timings_get_presentation_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_frame_timings_get_refresh_interval = Interop.downcallHandle(
        "gdk_frame_timings_get_refresh_interval",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the natural interval between presentation times for
     * the display that this frame was displayed on.
     * <p>
     * Frame presentation usually happens during the “vertical
     * blanking interval”.
     */
    public long getRefreshInterval() {
        long RESULT;
        try {
            RESULT = (long) gdk_frame_timings_get_refresh_interval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_frame_timings_ref = Interop.downcallHandle(
        "gdk_frame_timings_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code timings}.
     */
    public @NotNull FrameTimings ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_frame_timings_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FrameTimings(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_frame_timings_unref = Interop.downcallHandle(
        "gdk_frame_timings_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code timings}.
     * <p>
     * If {@code timings} is no longer referenced, it will be freed.
     */
    public @NotNull void unref() {
        try {
            gdk_frame_timings_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
