package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ButtonClass extends io.github.jwharm.javagi.ResourceBase {

    public ButtonClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ButtonClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkButtonClass.allocate(Interop.getAllocator()).address()));
    }
    
}
