package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkMediaControls` is a widget to show controls for a video.
 * 
 * ![An example GtkMediaControls](media-controls.png)
 * 
 * Usually, `GtkMediaControls` is used as part of [class@Gtk.Video].
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
     * Creates a new `GtkMediaControls` managing the @stream passed to it.
     */
    public MediaControls(MediaStream stream) {
        super(constructNew(stream));
    }
    
    /**
     * Gets the media stream managed by @controls or %NULL if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = gtk_h.gtk_media_controls_get_media_stream(handle());
        return new MediaStream(References.get(RESULT, false));
    }
    
    /**
     * Sets the stream that is controlled by @controls.
     */
    public void setMediaStream(MediaStream stream) {
        gtk_h.gtk_media_controls_set_media_stream(handle(), stream.handle());
    }
    
}
