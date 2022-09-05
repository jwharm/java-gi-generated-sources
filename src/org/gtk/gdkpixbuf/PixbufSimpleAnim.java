package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque struct representing a simple animation.
 */
public class PixbufSimpleAnim extends PixbufAnimation {

    public PixbufSimpleAnim(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PixbufSimpleAnim */
    public static PixbufSimpleAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnim(gobject.getProxy());
    }
    
    /**
     * Creates a new, empty animation.
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_simple_anim_new(width, height, rate), true));
    }
    
    /**
     * Adds a new frame to @animation. The @pixbuf must
     * have the dimensions specified when the animation
     * was constructed.
     */
    public void addFrame(Pixbuf pixbuf) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_simple_anim_add_frame(HANDLE(), pixbuf.HANDLE());
    }
    
    /**
     * Gets whether @animation should loop indefinitely when it reaches the end.
     */
    public boolean getLoop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_simple_anim_get_loop(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether @animation should loop indefinitely when it reaches the end.
     */
    public void setLoop(boolean loop) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_simple_anim_set_loop(HANDLE(), loop ? 1 : 0);
    }
    
}
