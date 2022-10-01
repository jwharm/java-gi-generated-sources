package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class of a flags type holds information about its
 * possible values.
 */
public class FlagsClass extends io.github.jwharm.javagi.ResourceBase {

    public FlagsClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public FlagsClass() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GFlagsClass.allocate(Interop.getAllocator()).address()));
    }
    
}
