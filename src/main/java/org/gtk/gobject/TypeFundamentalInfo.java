package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing fundamental types.
 */
public class TypeFundamentalInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeFundamentalFlags.getMemoryLayout().withName("type_flags")
    ).withName("GTypeFundamentalInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TypeFundamentalInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
