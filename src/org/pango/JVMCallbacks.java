package org.pango;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static boolean cbFontsetForeachFunc(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontsetForeachFunc) Interop.signalRegistry.get(hash);
        return handler.onFontsetForeachFunc(new Fontset(References.get(fontset, false)), new Font(References.get(font, false)));
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbAttrDataCopyFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AttrDataCopyFunc) Interop.signalRegistry.get(hash);
        return handler.onAttrDataCopyFunc();
    }
    
    public static boolean cbAttrFilterFunc(MemoryAddress attribute, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AttrFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onAttrFilterFunc(new Attribute(References.get(attribute, false)));
    }
    
}
