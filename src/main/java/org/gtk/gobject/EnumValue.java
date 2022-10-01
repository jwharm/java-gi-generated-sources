package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure which contains a single enum value, its name, and its
 * nickname.
 */
public class EnumValue extends io.github.jwharm.javagi.ResourceBase {

    public EnumValue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public EnumValue() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GEnumValue.allocate(Interop.getAllocator()).address()));
    }
    
}
