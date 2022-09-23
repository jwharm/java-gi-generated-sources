package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ResolverClass extends io.github.jwharm.javagi.ResourceBase {

    public ResolverClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ResolverClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GResolverClass.allocate(Interop.getAllocator()).address()));
    }
    
}
