package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque struct representing a simple animation.
 */
public class PixbufSimpleAnim extends org.gtk.gdkpixbuf.PixbufAnimation {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PixbufSimpleAnim(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufSimpleAnim */
    public static PixbufSimpleAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnim(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int width, int height, float rate) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_simple_anim_new.invokeExact(width, height, rate), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty animation.
     * @param width the width of the animation
     * @param height the height of the animation
     * @param rate the speed of the animation, in frames per second
     */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(constructNew(width, height, rate));
    }
    
    /**
     * Adds a new frame to {@code animation}. The {@code pixbuf} must
     * have the dimensions specified when the animation
     * was constructed.
     * @param pixbuf the pixbuf to add
     */
    public void addFrame(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNull(pixbuf, "Parameter 'pixbuf' must not be null");
        try {
            DowncallHandles.gdk_pixbuf_simple_anim_add_frame.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether {@code animation} should loop indefinitely when it reaches the end.
     * @return {@code true} if the animation loops forever, {@code false} otherwise
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_simple_anim_get_loop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     * @param loop whether to loop the animation
     */
    public void setLoop(boolean loop) {
        try {
            DowncallHandles.gdk_pixbuf_simple_anim_set_loop.invokeExact(handle(), loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_simple_anim_new = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_add_frame = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_add_frame",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_get_loop = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_get_loop",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_simple_anim_set_loop = Interop.downcallHandle(
            "gdk_pixbuf_simple_anim_set_loop",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
