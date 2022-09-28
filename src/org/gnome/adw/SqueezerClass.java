package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SqueezerClass extends io.github.jwharm.javagi.ResourceBase {

    public SqueezerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SqueezerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwSqueezerClass.allocate(Interop.getAllocator()).address()));
    }
    
}
