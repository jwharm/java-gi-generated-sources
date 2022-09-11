package org.pango;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void cbFontsetForeachFunc(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FontsetForeachFunc) signalRegistry.get(hash);
        handler.onFontsetForeachFunc(new Fontset(References.get(fontset, false)), new Font(References.get(font, false)));
    }
    
    public static void cbAttrDataCopyFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AttrDataCopyFunc) signalRegistry.get(hash);
        handler.onAttrDataCopyFunc();
    }
    
    public static void cbAttrFilterFunc(MemoryAddress attribute, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AttrFilterFunc) signalRegistry.get(hash);
        handler.onAttrFilterFunc(new Attribute(References.get(attribute, false)));
    }
    
}
