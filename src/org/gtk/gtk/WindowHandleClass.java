package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class WindowHandleClass extends io.github.jwharm.javagi.ResourceBase {

    public WindowHandleClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public WindowHandleClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkWindowHandleClass.allocate(Interop.getAllocator()).address()));
    }
    
}
