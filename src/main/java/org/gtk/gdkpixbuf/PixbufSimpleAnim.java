package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_pixbuf_simple_anim_new = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(@NotNull int width, @NotNull int height, @NotNull float rate) {
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
    public PixbufSimpleAnim(@NotNull int width, @NotNull int height, @NotNull float rate) {
        super(constructNew(width, height, rate));
    }
    
    private static final MethodHandle gdk_pixbuf_simple_anim_add_frame = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_add_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new frame to {@code animation}. The {@code pixbuf} must
     * have the dimensions specified when the animation
     * was constructed.
     */
    public @NotNull void addFrame(@NotNull Pixbuf pixbuf) {
        try {
            gdk_pixbuf_simple_anim_add_frame.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_pixbuf_simple_anim_get_loop = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_get_loop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public boolean getLoop() {
        int RESULT;
        try {
            RESULT = (int) gdk_pixbuf_simple_anim_get_loop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_pixbuf_simple_anim_set_loop = Interop.downcallHandle(
        "gdk_pixbuf_simple_anim_set_loop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code animation} should loop indefinitely when it reaches the end.
     */
    public @NotNull void setLoop(@NotNull boolean loop) {
        try {
            gdk_pixbuf_simple_anim_set_loop.invokeExact(handle(), loop ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
