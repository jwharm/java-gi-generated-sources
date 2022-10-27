package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for use with g_io_module_scope_new().
 * @version 2.30
 */
public class IOModuleScopeFlags extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No module scan flags
     */
    public static final IOModuleScopeFlags NONE = new IOModuleScopeFlags(0);
    
    /**
     * When using this scope to load or
     *     scan modules, automatically block a modules which has the same base
     *     basename as previously loaded module.
     */
    public static final IOModuleScopeFlags BLOCK_DUPLICATES = new IOModuleScopeFlags(1);
    
    public IOModuleScopeFlags(int value) {
        super(value);
    }
}
