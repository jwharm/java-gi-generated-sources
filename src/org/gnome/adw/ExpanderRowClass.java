package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ExpanderRowClass extends io.github.jwharm.javagi.ResourceBase {

    public ExpanderRowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ExpanderRowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwExpanderRowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
