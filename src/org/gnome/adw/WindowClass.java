package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class WindowClass extends io.github.jwharm.javagi.ResourceBase {

    public WindowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public WindowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwWindowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
