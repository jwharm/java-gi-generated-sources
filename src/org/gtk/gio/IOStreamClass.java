package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class IOStreamClass extends io.github.jwharm.javagi.ResourceBase {

    public IOStreamClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public IOStreamClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GIOStreamClass.allocate(Interop.getAllocator()).address()));
    }
    
}
