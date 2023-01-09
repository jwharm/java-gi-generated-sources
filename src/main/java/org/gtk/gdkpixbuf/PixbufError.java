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
public enum PixbufError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * An image file was broken somehow.
     */
    CORRUPT_IMAGE(0),
    
    /**
     * Not enough memory.
     */
    INSUFFICIENT_MEMORY(1),
    
    /**
     * A bad option was passed to a pixbuf save module.
     */
    BAD_OPTION(2),
    
    /**
     * Unknown image type.
     */
    UNKNOWN_TYPE(3),
    
    /**
     * Don't know how to perform the
     *  given operation on the type of image at hand.
     */
    UNSUPPORTED_OPERATION(4),
    
    /**
     * Generic failure code, something went wrong.
     */
    FAILED(5),
    
    /**
     * Only part of the animation was loaded.
     */
    INCOMPLETE_ANIMATION(6);
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufError";
    
    private final int value;
    
    /**
     * Create a new PixbufError for the provided value
     * @param numeric value the enum value
     */
    PixbufError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new PixbufError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PixbufError of(int value) {
        return switch (value) {
            case 0 -> CORRUPT_IMAGE;
            case 1 -> INSUFFICIENT_MEMORY;
            case 2 -> BAD_OPTION;
            case 3 -> UNKNOWN_TYPE;
            case 4 -> UNSUPPORTED_OPERATION;
            case 5 -> FAILED;
            case 6 -> INCOMPLETE_ANIMATION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
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
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
