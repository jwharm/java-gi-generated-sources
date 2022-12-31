package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(TagDemux.getType(), TagDemux.fromAddress);
        Interop.typeRegister.put(TagMux.getType(), TagMux.fromAddress);
        Interop.typeRegister.put(TagXmpWriter.getType(), TagXmpWriter.fromAddress);
    }
}
