package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link SocketAddressEnumerator}.
 */
public class SocketAddressEnumeratorClass extends io.github.jwharm.javagi.ResourceBase {

    public SocketAddressEnumeratorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketAddressEnumeratorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketAddressEnumeratorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
