package org.gtk.gdkpixbuf;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static void signalPixbufLoaderAreaPrepared(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.AreaPreparedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)));
    }
    
    public static void signalPixbufLoaderAreaUpdated(MemoryAddress source, int x, int y, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.AreaUpdatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)), x, y, width, height);
    }
    
    public static void signalPixbufLoaderClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.ClosedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)));
    }
    
    public static void signalPixbufLoaderSizePrepared(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.SizePreparedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)), width, height);
    }
    
    public static void cbPixbufModuleSizeFunc(int width, int height, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleSizeFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModuleSizeFunc(width, height);
    }
    
    public static void cbPixbufDestroyNotify(MemoryAddress pixels, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufDestroyNotify) Interop.signalRegistry.get(hash);
        handler.onPixbufDestroyNotify(null);
    }
    
    public static boolean cbPixbufModuleSaveCallbackFunc(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleSaveCallbackFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufModuleSaveCallbackFunc(null, new Pixbuf(References.get(pixbuf, false)), null, null);
    }
    
    public static boolean cbPixbufSaveFunc(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufSaveFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufSaveFunc(null, count);
    }
    
    public static void cbPixbufModuleUpdatedFunc(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleUpdatedFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModuleUpdatedFunc(new Pixbuf(References.get(pixbuf, false)), x, y, width, height);
    }
    
    public static void cbPixbufModulePreparedFunc(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModulePreparedFunc) Interop.signalRegistry.get(hash);
        handler.onPixbufModulePreparedFunc(new Pixbuf(References.get(pixbuf, false)), new PixbufAnimation(References.get(anim, false)));
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbPixbufModuleBeginLoadFunc(MemoryAddress sizeFunc, MemoryAddress preparedFunc, MemoryAddress updatedFunc, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleBeginLoadFunc) Interop.signalRegistry.get(hash);
        return handler.onPixbufModuleBeginLoadFunc(null, null, null);
    }
    
}
