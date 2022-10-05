package org.gtk.gdkpixbuf;

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
    
    static final MethodHandle gdk_pixbuf_simple_anim_new = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(int width, int height, float rate) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_simple_anim_new.invokeExact(width, height, rate), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new, empty animation.
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(constructNew(width, height, rate));
    }
    
    static final MethodHandle gdk_pixbuf_simple_anim_add_frame = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_add_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new frame to {@code animation}. The {@code pixbuf} must
     * have the dimensions specified when the animation
     * was constructed.
     */
    public void addFrame(Pixbuf pixbuf) {
        try {
            gdk_pixbuf_simple_anim_add_frame.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_simple_anim_get_loop = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_get_loop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public boolean getLoop() {
        try {
            var RESULT = (int) gdk_pixbuf_simple_anim_get_loop.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_simple_anim_set_loop = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_set_loop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public void setLoop(boolean loop) {
        try {
            gdk_pixbuf_simple_anim_set_loop.invokeExact(handle(), loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
