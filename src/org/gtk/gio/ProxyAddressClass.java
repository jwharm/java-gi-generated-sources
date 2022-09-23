package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link ProxyAddress}.
 */
public class ProxyAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public ProxyAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ProxyAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GProxyAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
