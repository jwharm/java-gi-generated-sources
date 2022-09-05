package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkFrameTimings` object holds timing information for a single frame
 * of the application’s displays.
 * 
 * To retrieve `GdkFrameTimings` objects, use [method@Gdk.FrameClock.get_timings]
 * or [method@Gdk.FrameClock.get_current_timings]. The information in
 * `GdkFrameTimings` is useful for precise synchronization of video with
 * the event or audio streams, and for measuring quality metrics for the
 * application’s display, such as latency and jitter.
 */
public class FrameTimings extends io.github.jwharm.javagi.interop.ResourceBase {

    public FrameTimings(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns whether @timings are complete.
     * 
     * The timing information in a `GdkFrameTimings` is filled in
     * incrementally as the frame as drawn and passed off to the
     * window system for processing and display to the user. The
     * accessor functions for `GdkFrameTimings` can return 0 to
     * indicate an unavailable value for two reasons: either because
     * the information is not yet available, or because it isn't
     * available at all.
     * 
     * Once this function returns %TRUE for a frame, you can be
     * certain that no further values will become available and be
     * stored in the `GdkFrameTimings`.
     */
    public boolean getComplete() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_complete(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the frame counter value of the `GdkFrameClock` when
     * this frame was drawn.
     */
    public long getFrameCounter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_frame_counter(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the frame time for the frame.
     * 
     * This is the time value that is typically used to time
     * animations for the frame. See [method@Gdk.FrameClock.get_frame_time].
     */
    public long getFrameTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_frame_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the predicted time at which this frame will be displayed.
     * 
     * Although no predicted time may be available, if one is available,
     * it will be available while the frame is being generated, in contrast
     * to [method@Gdk.FrameTimings.get_presentation_time], which is only
     * available after the frame has been presented.
     * 
     * In general, if you are simply animating, you should use
     * [method@Gdk.FrameClock.get_frame_time] rather than this function,
     * but this function is useful for applications that want exact control
     * over latency. For example, a movie player may want this information
     * for Audio/Video synchronization.
     */
    public long getPredictedPresentationTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_predicted_presentation_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Reurns the presentation time.
     * 
     * This is the time at which the frame became visible to the user.
     */
    public long getPresentationTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_presentation_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the natural interval between presentation times for
     * the display that this frame was displayed on.
     * 
     * Frame presentation usually happens during the “vertical
     * blanking interval”.
     */
    public long getRefreshInterval() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_get_refresh_interval(HANDLE());
        return RESULT;
    }
    
    /**
     * Increases the reference count of @timings.
     */
    public FrameTimings ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_ref(HANDLE());
        return new FrameTimings(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of @timings.
     * 
     * If @timings is no longer referenced, it will be freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_timings_unref(HANDLE());
    }
    
}
