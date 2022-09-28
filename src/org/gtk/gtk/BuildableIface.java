package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkBuildableIface} interface contains methods that are
 * necessary to allow {@code GtkBuilder} to construct an object from
 * a {@code GtkBuilder} UI definition.
 */
public class BuildableIface extends io.github.jwharm.javagi.ResourceBase {

    public BuildableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BuildableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBuildableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
