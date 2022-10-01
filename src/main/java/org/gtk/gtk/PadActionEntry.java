package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry extends io.github.jwharm.javagi.ResourceBase {

    public PadActionEntry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PadActionEntry() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkPadActionEntry.allocate(Interop.getAllocator()).address()));
    }
    
}
