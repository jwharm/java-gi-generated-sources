package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AppSink.getType(), AppSink.fromAddress);
        Interop.typeRegister.put(AppSrc.getType(), AppSrc.fromAddress);
    }
}
