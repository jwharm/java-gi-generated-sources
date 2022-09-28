package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link TlsPassword}.
 */
public class TlsPasswordClass extends io.github.jwharm.javagi.ResourceBase {

    public TlsPasswordClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsPasswordClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsPasswordClass.allocate(Interop.getAllocator()).address()));
    }
    
}
