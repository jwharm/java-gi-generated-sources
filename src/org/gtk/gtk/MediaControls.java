package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public MediaControls(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MediaControls */
    public static MediaControls castFrom(org.gtk.gobject.Object gobject) {
        return new MediaControls(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkMediaControls` managing the @stream passed to it.
     */
    public MediaControls(MediaStream stream) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_controls_new(stream.HANDLE()), false));
    }
    
    /**
     * Gets the media stream managed by @controls or %NULL if none.
     */
    public MediaStream getMediaStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_controls_get_media_stream(HANDLE());
        return new MediaStream(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the stream that is controlled by @controls.
     */
    public void setMediaStream(MediaStream stream) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_media_controls_set_media_stream(HANDLE(), stream.HANDLE());
    }
    
}
