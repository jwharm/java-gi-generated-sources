package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class BinClass extends io.github.jwharm.javagi.ResourceBase {

    public BinClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BinClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwBinClass.allocate(Interop.getAllocator()).address()));
    }
    
}
