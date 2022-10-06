package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class GdkPixbuf {
    
    public static final int PIXBUF_MAJOR = 2;

    public static final int PIXBUF_MICRO = 9;

    public static final int PIXBUF_MINOR = 42;

    public static final java.lang.String PIXBUF_VERSION = "2.42.9";

    static final MethodHandle gdk_pixbuf_error_quark = Interop.downcallHandle(
        "gdk_pixbuf_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark pixbufErrorQuark() {
        try {
            var RESULT = (int) gdk_pixbuf_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void __cbPixbufModuleSizeFunc(MemoryAddress width, MemoryAddress height, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModuleSizeFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModuleSizeFunc(new PointerInteger(width), new PointerInteger(height));
    }
    
    public static void __cbPixbufDestroyNotify(MemoryAddress pixels, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufDestroyNotify) Interop.signalRegistry.get(hash);
        handler.onPixbufDestroyNotify(new PointerByte(pixels));
    }
    
    public static boolean __cbPixbufModuleSaveCallbackFunc(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufModuleSaveCallbackFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufModuleSaveCallbackFunc(null /* Unsupported parameter type */, new Pixbuf(Refcounted.get(pixbuf, false)), new PointerString(optionKeys), new PointerString(optionValues));
    }
    
    public static boolean __cbPixbufSaveFunc(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (PixbufSaveFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufSaveFunc(new PointerByte(buf), count);
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
