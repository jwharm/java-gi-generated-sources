package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GdkPixbuf namespace.
 */
public final class GdkPixbuf {
    
    static {
        System.loadLibrary("gdk_pixbuf-2.0");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * Major version of gdk-pixbuf library, that is the "0" in
     * "0.8.2" for example.
     */
    public static final int PIXBUF_MAJOR = 2;
    
    /**
     * Micro version of gdk-pixbuf library, that is the "2" in
     * "0.8.2" for example.
     */
    public static final int PIXBUF_MICRO = 10;
    
    /**
     * Minor version of gdk-pixbuf library, that is the "8" in
     * "0.8.2" for example.
     */
    public static final int PIXBUF_MINOR = 42;
    
    /**
     * Contains the full version of GdkPixbuf as a string.
     * <p>
     * This is the version being compiled against; contrast with
     * {@code gdk_pixbuf_version}.
     */
    public static final java.lang.String PIXBUF_VERSION = "2.42.10";
    
    public static org.gtk.glib.Quark pixbufErrorQuark() {
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
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
