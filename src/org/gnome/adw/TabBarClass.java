package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TabBarClass extends io.github.jwharm.javagi.ResourceBase {

    public TabBarClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TabBarClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwTabBarClass.allocate(Interop.getAllocator()).address()));
    }
    
}
