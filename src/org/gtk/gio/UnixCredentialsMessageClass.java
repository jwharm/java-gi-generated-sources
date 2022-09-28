package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
