package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NativeSocketAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public NativeSocketAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NativeSocketAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GNativeSocketAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
