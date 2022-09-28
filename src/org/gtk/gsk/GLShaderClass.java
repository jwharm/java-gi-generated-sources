package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class GLShaderClass extends io.github.jwharm.javagi.ResourceBase {

    public GLShaderClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GLShaderClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GskGLShaderClass.allocate(Interop.getAllocator()).address()));
    }
    
}
