package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class InetSocketAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public InetSocketAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public InetSocketAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GInetSocketAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
