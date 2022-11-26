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
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
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
    
    public static @NotNull org.gtk.glib.Quark pixbufErrorQuark() {
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
        
        public static void cbPixbufModuleSizeFunc(MemoryAddress width, MemoryAddress height, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufModuleSizeFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPixbufModuleSizeFunc(new PointerInteger(width), new PointerInteger(height));
        }
        
        public static void cbPixbufDestroyNotify(MemoryAddress pixels, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufDestroyNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onPixbufDestroyNotify(new PointerByte(pixels));
        }
        
        public static boolean cbPixbufModuleSaveCallbackFunc(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufModuleSaveCallbackFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onPixbufModuleSaveCallbackFunc(null /* Unsupported parameter type */, new org.gtk.gdkpixbuf.Pixbuf(pixbuf, Ownership.NONE), new PointerString(optionKeys), new PointerString(optionValues));
            return RESULT;
        }
        
        public static boolean cbPixbufSaveFunc(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufSaveFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onPixbufSaveFunc(new PointerByte(buf), count, new PointerProxy<org.gtk.glib.Error>(error, org.gtk.glib.Error.class));
            return RESULT;
        }
        
        public static void cbPixbufModuleUpdatedFunc(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufModuleUpdatedFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPixbufModuleUpdatedFunc(new org.gtk.gdkpixbuf.Pixbuf(pixbuf, Ownership.NONE), x, y, width, height);
        }
        
        public static void cbPixbufModulePreparedFunc(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufModulePreparedFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onPixbufModulePreparedFunc(new org.gtk.gdkpixbuf.Pixbuf(pixbuf, Ownership.NONE), new org.gtk.gdkpixbuf.PixbufAnimation(anim, Ownership.NONE));
        }
        
        public static java.lang.foreign.MemoryAddress cbPixbufModuleBeginLoadFunc(MemoryAddress sizeFunc, MemoryAddress preparedFunc, MemoryAddress updatedFunc, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufModuleBeginLoadFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onPixbufModuleBeginLoadFunc(null /* Unsupported parameter type */, null /* Unsupported parameter type */, null /* Unsupported parameter type */);
            return RESULT;
        }
    }
}
