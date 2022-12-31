package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Context.getType(), Context.fromAddress);
        Interop.typeRegister.put(Coverage.getType(), Coverage.fromAddress);
        Interop.typeRegister.put(Font.getType(), Font.fromAddress);
        Interop.typeRegister.put(FontFace.getType(), FontFace.fromAddress);
        Interop.typeRegister.put(FontFamily.getType(), FontFamily.fromAddress);
        Interop.typeRegister.put(FontMap.getType(), FontMap.fromAddress);
        Interop.typeRegister.put(Fontset.getType(), Fontset.fromAddress);
        Interop.typeRegister.put(FontsetSimple.getType(), FontsetSimple.fromAddress);
        Interop.typeRegister.put(Layout.getType(), Layout.fromAddress);
        Interop.typeRegister.put(Renderer.getType(), Renderer.fromAddress);
    }
}
