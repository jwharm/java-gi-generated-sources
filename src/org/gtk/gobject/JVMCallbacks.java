package org.gtk.gobject;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void signalObjectNotify(MemoryAddress source, MemoryAddress pspec, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Object.NotifyHandler) signalRegistry.get(hash);
        handler.signalReceived(new Object(References.get(source)), new ParamSpec(References.get(pspec, false)));
    }
    
    public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.BindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)), new Object(References.get(instance, false)));
    }
    
    public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.UnbindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)));
    }
    
}
