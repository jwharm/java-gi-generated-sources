package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public MediaControls(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MediaControls */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
        return new MediaControls(gobject.getReference());
    }
    
    private static Reference constructNew(MediaStream stream) {
        Reference RESULT = References.get(gtk_h.gtk_media_controls_new(stream.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMediaControls} managing the {@code stream} passed to it.
     */
    public MediaControls(MediaStream stream) {
        super(constructNew(stream));
    }
    
    /**
     * Gets the media stream managed by {@code controls} or <code>null</code> if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = gtk_h.gtk_media_controls_get_media_stream(handle());
        return new MediaStream(References.get(RESULT, false));
    }
    
    /**
     * Sets the stream that is controlled by {@code controls}.
     */
    public void setMediaStream(MediaStream stream) {
        gtk_h.gtk_media_controls_set_media_stream(handle(), stream.handle());
    }
    
}
