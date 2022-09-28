package org.gtk.gio;

/**
 * Flags for use with g_io_module_scope_new().
 */
public class IOModuleScopeFlags extends io.github.jwharm.javagi.Enumeration {

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
