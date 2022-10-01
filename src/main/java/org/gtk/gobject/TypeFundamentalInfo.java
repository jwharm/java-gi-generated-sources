package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing fundamental types.
 */
public class TypeFundamentalInfo extends io.github.jwharm.javagi.ResourceBase {

    public TypeFundamentalInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public TypeFundamentalInfo() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GTypeFundamentalInfo.allocate(Interop.getAllocator()).address()));
    }
    
}
