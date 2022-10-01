package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque struct representing a simple animation.
 */
public class PixbufSimpleAnim extends PixbufAnimation {

    public PixbufSimpleAnim(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufSimpleAnim */
    public static PixbufSimpleAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnim(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int width, int height, float rate) {
        Refcounted RESULT = Refcounted.get(gtk_h.gdk_pixbuf_simple_anim_new(width, height, rate), true);
        return RESULT;
    }
    
    /**
     * Creates a new, empty animation.
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(constructNew(width, height, rate));
    }
    
    /**
     * Adds a new frame to {@code animation}. The {@code pixbuf} must
     * have the dimensions specified when the animation
     * was constructed.
     */
    public void addFrame(Pixbuf pixbuf) {
        gtk_h.gdk_pixbuf_simple_anim_add_frame(handle(), pixbuf.handle());
    }
    
    /**
     * Gets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public boolean getLoop() {
        var RESULT = gtk_h.gdk_pixbuf_simple_anim_get_loop(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public void setLoop(boolean loop) {
        gtk_h.gdk_pixbuf_simple_anim_set_loop(handle(), loop ? 1 : 0);
    }
    
}
