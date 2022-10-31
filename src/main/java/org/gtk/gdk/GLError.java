package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error enumeration for {@code GdkGLContext}.
 */
public class GLError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkGLError";
    
    /**
     * OpenGL support is not available
     */
    public static final GLError NOT_AVAILABLE = new GLError(0);
    
    /**
     * The requested visual format is not supported
     */
    public static final GLError UNSUPPORTED_FORMAT = new GLError(1);
    
    /**
     * The requested profile is not supported
     */
    public static final GLError UNSUPPORTED_PROFILE = new GLError(2);
    
    /**
     * The shader compilation failed
     */
    public static final GLError COMPILATION_FAILED = new GLError(3);
    
    /**
     * The shader linking failed
     */
    public static final GLError LINK_FAILED = new GLError(4);
    
    public GLError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_error_quark = Interop.downcallHandle(
            "gdk_gl_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
