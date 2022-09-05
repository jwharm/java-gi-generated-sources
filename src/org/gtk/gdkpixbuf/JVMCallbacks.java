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
        handler.signalReceived(new PixbufLoader(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalPixbufLoaderAreaUpdated(MemoryAddress source, int x, int y, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.AreaUpdatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(ProxyFactory.getCachedProxy(source)), x, y, width, height);
    }
    
    public static void signalPixbufLoaderClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.ClosedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalPixbufLoaderSizePrepared(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PixbufLoader.SizePreparedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PixbufLoader(ProxyFactory.getCachedProxy(source)), width, height);
    }
    
}
