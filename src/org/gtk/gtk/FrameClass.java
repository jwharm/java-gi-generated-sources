package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FrameClass extends io.github.jwharm.javagi.ResourceBase {

    public FrameClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FrameClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkFrameClass.allocate(Interop.getAllocator()).address()));
    }
    
}
