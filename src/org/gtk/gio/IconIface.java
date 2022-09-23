package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * GIconIface is used to implement GIcon types for various
 * different systems. See {@link ThemedIcon} and {@link LoadableIcon} for
 * examples of how to implement this interface.
 */
public class IconIface extends io.github.jwharm.javagi.ResourceBase {

    public IconIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public IconIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GIconIface.allocate(Interop.getAllocator()).address()));
    }
    
}
