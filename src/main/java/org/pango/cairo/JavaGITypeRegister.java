package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Font.getType(), Font.fromAddress);
        Interop.typeRegister.put(FontMap.getType(), FontMap.fromAddress);
    }
}
