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
public class FrameTimings extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkFrameTimings";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FrameTimings allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FrameTimings newInstance = new FrameTimings(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FrameTimings proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FrameTimings(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
     * @return {@code true} if all information that will be available
     *   for the frame has been filled in.
     */
    public boolean getComplete() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_frame_timings_get_complete.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the frame counter value of the {@code GdkFrameClock} when
     * this frame was drawn.
     * @return the frame counter value for this frame
     */
    public long getFrameCounter() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_timings_get_frame_counter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the frame time for the frame.
     * <p>
     * This is the time value that is typically used to time
     * animations for the frame. See {@link FrameClock#getFrameTime}.
     * @return the frame time for the frame, in the timescale
     *  of g_get_monotonic_time()
     */
    public long getFrameTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_timings_get_frame_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @return The predicted time at which the frame will be presented,
     *   in the timescale of g_get_monotonic_time(), or 0 if no predicted
     *   presentation time is available.
     */
    public long getPredictedPresentationTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_timings_get_predicted_presentation_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Reurns the presentation time.
     * <p>
     * This is the time at which the frame became visible to the user.
     * @return the time the frame was displayed to the user, in the
     *   timescale of g_get_monotonic_time(), or 0 if no presentation
     *   time is available. See {@link FrameTimings#getComplete}
     */
    public long getPresentationTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_timings_get_presentation_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the natural interval between presentation times for
     * the display that this frame was displayed on.
     * <p>
     * Frame presentation usually happens during the “vertical
     * blanking interval”.
     * @return the refresh interval of the display, in microseconds,
     *   or 0 if the refresh interval is not available.
     *   See {@link FrameTimings#getComplete}.
     */
    public long getRefreshInterval() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_timings_get_refresh_interval.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increases the reference count of {@code timings}.
     * @return {@code timings}
     */
    public @NotNull org.gtk.gdk.FrameTimings ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_frame_timings_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.FrameTimings(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of {@code timings}.
     * <p>
     * If {@code timings} is no longer referenced, it will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_frame_timings_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_frame_timings_get_complete = Interop.downcallHandle(
            "gdk_frame_timings_get_complete",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_get_frame_counter = Interop.downcallHandle(
            "gdk_frame_timings_get_frame_counter",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_get_frame_time = Interop.downcallHandle(
            "gdk_frame_timings_get_frame_time",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_get_predicted_presentation_time = Interop.downcallHandle(
            "gdk_frame_timings_get_predicted_presentation_time",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_get_presentation_time = Interop.downcallHandle(
            "gdk_frame_timings_get_presentation_time",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_get_refresh_interval = Interop.downcallHandle(
            "gdk_frame_timings_get_refresh_interval",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_ref = Interop.downcallHandle(
            "gdk_frame_timings_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_frame_timings_unref = Interop.downcallHandle(
            "gdk_frame_timings_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
