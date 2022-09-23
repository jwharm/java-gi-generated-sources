package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class BoxLayoutClass extends io.github.jwharm.javagi.ResourceBase {

    public BoxLayoutClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BoxLayoutClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBoxLayoutClass.allocate(Interop.getAllocator()).address()));
    }
    
}
