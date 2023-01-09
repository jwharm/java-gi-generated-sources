package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors that can be returned by {@code GdkTexture} constructors.
 * @version 4.6
 */
public enum TextureError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Not enough memory to handle this image
     */
    TOO_LARGE(0),
    
    /**
     * The image data appears corrupted
     */
    CORRUPT_IMAGE(1),
    
    /**
     * The image contains features
     *   that cannot be loaded
     */
    UNSUPPORTED_CONTENT(2),
    
    /**
     * The image format is not supported
     */
    UNSUPPORTED_FORMAT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GdkTextureError";
    
    private final int value;
    
    /**
     * Create a new TextureError for the provided value
     * @param numeric value the enum value
     */
    TextureError(int value) {
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
     * Create a new TextureError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TextureError of(int value) {
        return switch (value) {
            case 0 -> TOO_LARGE;
            case 1 -> CORRUPT_IMAGE;
            case 2 -> UNSUPPORTED_CONTENT;
            case 3 -> UNSUPPORTED_FORMAT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_texture_error_quark = Interop.downcallHandle(
                "gdk_texture_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
