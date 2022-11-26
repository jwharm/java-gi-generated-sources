package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors that can be returned by {@code GdkTexture} constructors.
 * @version 4.6
 */
public class TextureError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkTextureError";
    
    /**
     * Not enough memory to handle this image
     */
    public static final TextureError TOO_LARGE = new TextureError(0);
    
    /**
     * The image data appears corrupted
     */
    public static final TextureError CORRUPT_IMAGE = new TextureError(1);
    
    /**
     * The image contains features
     *   that cannot be loaded
     */
    public static final TextureError UNSUPPORTED_CONTENT = new TextureError(2);
    
    /**
     * The image format is not supported
     */
    public static final TextureError UNSUPPORTED_FORMAT = new TextureError(3);
    
    public TextureError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
