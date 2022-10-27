package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An error code in the {@code GDK_PIXBUF_ERROR} domain.
 * <p>
 * Many gdk-pixbuf operations can cause errors in this domain, or in
 * the {@code G_FILE_ERROR} domain.
 */
public class PixbufError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * An image file was broken somehow.
     */
    public static final PixbufError CORRUPT_IMAGE = new PixbufError(0);
    
    /**
     * Not enough memory.
     */
    public static final PixbufError INSUFFICIENT_MEMORY = new PixbufError(1);
    
    /**
     * A bad option was passed to a pixbuf save module.
     */
    public static final PixbufError BAD_OPTION = new PixbufError(2);
    
    /**
     * Unknown image type.
     */
    public static final PixbufError UNKNOWN_TYPE = new PixbufError(3);
    
    /**
     * Don't know how to perform the
     *  given operation on the type of image at hand.
     */
    public static final PixbufError UNSUPPORTED_OPERATION = new PixbufError(4);
    
    /**
     * Generic failure code, something went wrong.
     */
    public static final PixbufError FAILED = new PixbufError(5);
    
    /**
     * Only part of the animation was loaded.
     */
    public static final PixbufError INCOMPLETE_ANIMATION = new PixbufError(6);
    
    public PixbufError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_error_quark = Interop.downcallHandle(
            "gdk_pixbuf_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
