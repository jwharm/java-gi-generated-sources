package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class DesktopAppInfoClass extends io.github.jwharm.javagi.ResourceBase {

    public DesktopAppInfoClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DesktopAppInfoClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDesktopAppInfoClass.allocate(Interop.getAllocator()).address()));
    }
    
}
