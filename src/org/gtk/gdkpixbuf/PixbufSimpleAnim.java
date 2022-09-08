package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque struct representing a simple animation.
 */
public class PixbufSimpleAnim extends PixbufAnimation {

    public PixbufSimpleAnim(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufSimpleAnim */
    public static PixbufSimpleAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnim(gobject.getReference());
    }
    
    /**
     * Creates a new, empty animation.
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(References.get(gtk_h.gdk_pixbuf_simple_anim_new(width, height, rate), true));
    }
    
    /**
     * Adds a new frame to @animation. The @pixbuf must
     * have the dimensions specified when the animation
     * was constructed.
     */
    public void addFrame(Pixbuf pixbuf) {
        gtk_h.gdk_pixbuf_simple_anim_add_frame(handle(), pixbuf.handle());
    }
    
    /**
     * Gets whether @animation should loop indefinitely when it reaches the end.
     */
    public boolean getLoop() {
        var RESULT = gtk_h.gdk_pixbuf_simple_anim_get_loop(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether @animation should loop indefinitely when it reaches the end.
     */
    public void setLoop(boolean loop) {
        gtk_h.gdk_pixbuf_simple_anim_set_loop(handle(), loop ? 1 : 0);
    }
    
}
