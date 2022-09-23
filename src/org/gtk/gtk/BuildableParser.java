package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A sub-parser for {@code GtkBuildable} implementations.
 */
public class BuildableParser extends io.github.jwharm.javagi.ResourceBase {

    public BuildableParser(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BuildableParser() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBuildableParser.allocate(Interop.getAllocator()).address()));
    }
    
}
