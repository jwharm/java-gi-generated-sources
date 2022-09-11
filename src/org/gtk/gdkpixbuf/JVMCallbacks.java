package org.gtk.gdkpixbuf;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void signalPixbufLoaderAreaPrepared(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.AreaPreparedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)));
    }
    
    public static void signalPixbufLoaderAreaUpdated(MemoryAddress source, int x, int y, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.AreaUpdatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)), x, y, width, height);
    }
    
    public static void signalPixbufLoaderClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.ClosedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)));
    }
    
    public static void signalPixbufLoaderSizePrepared(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.SizePreparedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(References.get(source)), width, height);
    }
    
    public static void cbPixbufModuleSaveFunc(MemoryAddress f, MemoryAddress pixbuf, MemoryAddress paramKeys, MemoryAddress paramValues) {
        int hash = paramValues.get(C_INT, 0);
        var handler = (PixbufModuleSaveFunc) signalRegistry.get(hash);
        handler.onPixbufModuleSaveFunc(f, new Pixbuf(References.get(pixbuf, false)), null);
    }
    
    public static void cbPixbufModuleIncrementLoadFunc(MemoryAddress context, MemoryAddress buf, int size) {
        int hash = size.get(C_INT, 0);
        var handler = (PixbufModuleIncrementLoadFunc) signalRegistry.get(hash);
        handler.onPixbufModuleIncrementLoadFunc(context, null);
    }
    
    public static void cbPixbufModuleSizeFunc(int width, int height, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleSizeFunc) signalRegistry.get(hash);
        handler.onPixbufModuleSizeFunc(width, height);
    }
    
    public static void cbPixbufModuleFillInfoFunc(MemoryAddress info) {
        int hash = info.get(C_INT, 0);
        var handler = (PixbufModuleFillInfoFunc) signalRegistry.get(hash);
        handler.onPixbufModuleFillInfoFunc();
    }
    
    public static void cbPixbufDestroyNotify(MemoryAddress pixels, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufDestroyNotify) signalRegistry.get(hash);
        handler.onPixbufDestroyNotify(null);
    }
    
    public static void cbPixbufModuleSaveCallbackFunc(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
        int hash = optionValues.get(C_INT, 0);
        var handler = (PixbufModuleSaveCallbackFunc) signalRegistry.get(hash);
        handler.onPixbufModuleSaveCallbackFunc(null, userData, new Pixbuf(References.get(pixbuf, false)), null);
    }
    
    public static void cbPixbufModuleLoadAnimationFunc(MemoryAddress f) {
        int hash = f.get(C_INT, 0);
        var handler = (PixbufModuleLoadAnimationFunc) signalRegistry.get(hash);
        handler.onPixbufModuleLoadAnimationFunc();
    }
    
    public static void cbPixbufModuleLoadXpmDataFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufModuleLoadXpmDataFunc) signalRegistry.get(hash);
        handler.onPixbufModuleLoadXpmDataFunc();
    }
    
    public static void cbPixbufModuleFillVtableFunc(MemoryAddress module) {
        int hash = module.get(C_INT, 0);
        var handler = (PixbufModuleFillVtableFunc) signalRegistry.get(hash);
        handler.onPixbufModuleFillVtableFunc();
    }
    
    public static void cbPixbufSaveFunc(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufSaveFunc) signalRegistry.get(hash);
        handler.onPixbufSaveFunc(null, count, new org.gtk.glib.Error(References.get(error, true)));
    }
    
    public static void cbPixbufModuleSaveOptionSupportedFunc(MemoryAddress optionKey) {
        int hash = optionKey.get(C_INT, 0);
        var handler = (PixbufModuleSaveOptionSupportedFunc) signalRegistry.get(hash);
        handler.onPixbufModuleSaveOptionSupportedFunc();
    }
    
    public static void cbPixbufModuleUpdatedFunc(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleUpdatedFunc) signalRegistry.get(hash);
        handler.onPixbufModuleUpdatedFunc(new Pixbuf(References.get(pixbuf, false)), x, y, width, height);
    }
    
    public static void cbPixbufModulePreparedFunc(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModulePreparedFunc) signalRegistry.get(hash);
        handler.onPixbufModulePreparedFunc(new Pixbuf(References.get(pixbuf, false)), new PixbufAnimation(References.get(anim, false)));
    }
    
    public static void cbPixbufModuleBeginLoadFunc(MemoryAddress sizeFunc, MemoryAddress preparedFunc, MemoryAddress updatedFunc, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PixbufModuleBeginLoadFunc) signalRegistry.get(hash);
        handler.onPixbufModuleBeginLoadFunc(null, null, null);
    }
    
    public static void cbPixbufModuleStopLoadFunc(MemoryAddress context) {
        int hash = context.get(C_INT, 0);
        var handler = (PixbufModuleStopLoadFunc) signalRegistry.get(hash);
        handler.onPixbufModuleStopLoadFunc();
    }
    
    public static void cbPixbufModuleLoadFunc(MemoryAddress f) {
        int hash = f.get(C_INT, 0);
        var handler = (PixbufModuleLoadFunc) signalRegistry.get(hash);
        handler.onPixbufModuleLoadFunc();
    }
    
}
