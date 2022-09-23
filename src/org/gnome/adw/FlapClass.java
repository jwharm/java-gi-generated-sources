package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FlapClass extends io.github.jwharm.javagi.ResourceBase {

    public FlapClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FlapClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwFlapClass.allocate(Interop.getAllocator()).address()));
    }
    
}
