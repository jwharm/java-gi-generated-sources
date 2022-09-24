package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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