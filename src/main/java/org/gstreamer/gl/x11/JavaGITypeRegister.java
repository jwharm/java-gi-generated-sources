package org.gstreamer.gl.x11;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(GLDisplayX11.getType(), GLDisplayX11.fromAddress);
    }
}
