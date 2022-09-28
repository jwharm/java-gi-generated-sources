package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class HeaderBarClass extends io.github.jwharm.javagi.ResourceBase {

    public HeaderBarClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public HeaderBarClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwHeaderBarClass.allocate(Interop.getAllocator()).address()));
    }
    
}
