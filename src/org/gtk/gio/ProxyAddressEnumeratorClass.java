package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link ProxyAddressEnumerator}.
 */
public class ProxyAddressEnumeratorClass extends io.github.jwharm.javagi.ResourceBase {

    public ProxyAddressEnumeratorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ProxyAddressEnumeratorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GProxyAddressEnumeratorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
