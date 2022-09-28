package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TlsCertificateClass extends io.github.jwharm.javagi.ResourceBase {

    public TlsCertificateClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsCertificateClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsCertificateClass.allocate(Interop.getAllocator()).address()));
    }
    
}
