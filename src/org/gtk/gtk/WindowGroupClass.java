package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class WindowGroupClass extends io.github.jwharm.javagi.ResourceBase {

    public WindowGroupClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public WindowGroupClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkWindowGroupClass.allocate(Interop.getAllocator()).address()));
    }
    
}
