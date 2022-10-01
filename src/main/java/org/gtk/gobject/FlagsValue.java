package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue extends io.github.jwharm.javagi.ResourceBase {

    public FlagsValue(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FlagsValue() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFlagsValue.allocate(Interop.getAllocator()).address()));
    }
    
}
