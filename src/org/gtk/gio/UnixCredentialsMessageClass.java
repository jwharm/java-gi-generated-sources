package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link UnixCredentialsMessage}.
 */
public class UnixCredentialsMessageClass extends io.github.jwharm.javagi.ResourceBase {

    public UnixCredentialsMessageClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public UnixCredentialsMessageClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GUnixCredentialsMessageClass.allocate(Interop.getAllocator()).address()));
    }
    
}
