package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class LeafletClass extends io.github.jwharm.javagi.ResourceBase {

    public LeafletClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LeafletClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwLeafletClass.allocate(Interop.getAllocator()).address()));
    }
    
}
