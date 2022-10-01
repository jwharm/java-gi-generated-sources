package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class of an enumeration type holds information about its
 * possible values.
 */
public class EnumClass extends io.github.jwharm.javagi.ResourceBase {

    public EnumClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public EnumClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GEnumClass.allocate(Interop.getAllocator()).address()));
    }
    
}
