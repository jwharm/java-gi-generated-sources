package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class GdkPixbuf {
    
    /**
     * Major version of gdk-pixbuf library, that is the "0" in
     * "0.8.2" for example.
     */
    public static final int PIXBUF_MAJOR = 2;

    /**
     * Micro version of gdk-pixbuf library, that is the "2" in
     * "0.8.2" for example.
     */
    public static final int PIXBUF_MICRO = 9;

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
    public static final java.lang.String PIXBUF_VERSION = "2.42.9";

    private static final MethodHandle gdk_pixbuf_error_quark = Interop.downcallHandle(
        "gdk_pixbuf_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static @NotNull org.gtk.glib.Quark pixbufErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) gdk_pixbuf_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static void __cbPixbufModuleSizeFunc(MemoryAddress width, MemoryAddress height, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModuleSizeFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModuleSizeFunc(new PointerInteger(width), new PointerInteger(height));
    }
    
    public static void __cbPixbufModuleUpdatedFunc(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModuleUpdatedFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModuleUpdatedFunc(new Pixbuf(Refcounted.get(pixbuf, false)), x, y, width, height);
    }
    
    public static void __cbPixbufModulePreparedFunc(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModulePreparedFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModulePreparedFunc(new Pixbuf(Refcounted.get(pixbuf, false)), new PixbufAnimation(Refcounted.get(anim, false)));
    }
    
    public static java.lang.foreign.MemoryAddress __cbPixbufModuleBeginLoadFunc(MemoryAddress sizeFunc, MemoryAddress preparedFunc, MemoryAddress updatedFunc, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModuleBeginLoadFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufModuleBeginLoadFunc(null /* Unsupported parameter type */, null /* Unsupported parameter type */, null /* Unsupported parameter type */);
    }
    
}
