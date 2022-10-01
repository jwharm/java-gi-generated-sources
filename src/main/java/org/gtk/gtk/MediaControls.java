package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMediaControls} is a widget to show controls for a video.
 * <p>
 * <img src="./doc-files/media-controls.png" alt="An example GtkMediaControls">
 * <p>
 * Usually, {@code GtkMediaControls} is used as part of {@link Video}.
 */
public class MediaControls extends Widget implements Accessible, Buildable, ConstraintTarget {

    public MediaControls(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MediaControls */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
        return new MediaControls(gobject.refcounted());
    }
    
    private static Refcounted constructNew(MediaStream stream) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_media_controls_new(stream.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMediaControls} managing the {@code stream} passed to it.
     */
    public MediaControls(MediaStream stream) {
        super(constructNew(stream));
    }
    
    /**
     * Gets the media stream managed by {@code controls} or {@code null} if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = gtk_h.gtk_media_controls_get_media_stream(handle());
        return new MediaStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the stream that is controlled by {@code controls}.
     */
    public void setMediaStream(MediaStream stream) {
        gtk_h.gtk_media_controls_set_media_stream(handle(), stream.handle());
    }
    
}
