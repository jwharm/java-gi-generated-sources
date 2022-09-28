package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ActionRowClass extends io.github.jwharm.javagi.ResourceBase {

    public ActionRowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ActionRowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwActionRowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
