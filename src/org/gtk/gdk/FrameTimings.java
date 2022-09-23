package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public FrameTimings(io.github.jwharm.javagi.Reference reference) {
        super(reference);
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
     */
    public boolean getComplete() {
        var RESULT = gtk_h.gdk_frame_timings_get_complete(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the frame counter value of the {@code GdkFrameClock} when
     * this frame was drawn.
     */
    public long getFrameCounter() {
        var RESULT = gtk_h.gdk_frame_timings_get_frame_counter(handle());
        return RESULT;
    }
    
    /**
     * Returns the frame time for the frame.
     * <p>
     * This is the time value that is typically used to time
     * animations for the frame. See {@link FrameClock#getFrameTime}.
     */
    public long getFrameTime() {
        var RESULT = gtk_h.gdk_frame_timings_get_frame_time(handle());
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
     */
    public long getPredictedPresentationTime() {
        var RESULT = gtk_h.gdk_frame_timings_get_predicted_presentation_time(handle());
        return RESULT;
    }
    
    /**
     * Reurns the presentation time.
     * <p>
     * This is the time at which the frame became visible to the user.
     */
    public long getPresentationTime() {
        var RESULT = gtk_h.gdk_frame_timings_get_presentation_time(handle());
        return RESULT;
    }
    
    /**
     * Gets the natural interval between presentation times for
     * the display that this frame was displayed on.
     * <p>
     * Frame presentation usually happens during the “vertical
     * blanking interval”.
     */
    public long getRefreshInterval() {
        var RESULT = gtk_h.gdk_frame_timings_get_refresh_interval(handle());
        return RESULT;
    }
    
    /**
     * Increases the reference count of {@code timings}.
     */
    public FrameTimings ref() {
        var RESULT = gtk_h.gdk_frame_timings_ref(handle());
        return new FrameTimings(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of {@code timings}.
     * <p>
     * If {@code timings} is no longer referenced, it will be freed.
     */
    public void unref() {
        gtk_h.gdk_frame_timings_unref(handle());
    }
    
}
