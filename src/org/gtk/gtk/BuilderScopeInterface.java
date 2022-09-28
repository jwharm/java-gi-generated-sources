package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table to implement for {@code GtkBuilderScope} implementations.
 * Default implementations for each function do exist, but they usually just fail,
 * so it is suggested that implementations implement all of them.
 */
public class BuilderScopeInterface extends io.github.jwharm.javagi.ResourceBase {

    public BuilderScopeInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BuilderScopeInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBuilderScopeInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
