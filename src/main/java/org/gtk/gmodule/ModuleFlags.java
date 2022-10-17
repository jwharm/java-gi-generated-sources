package org.gtk.gmodule;

/**
 * Flags passed to g_module_open().
 * Note that these flags are not supported on all platforms.
 */
public class ModuleFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * specifies that symbols are only resolved when
     *     needed. The default action is to bind all symbols when the module
     *     is loaded.
     */
    public static final ModuleFlags LAZY = new ModuleFlags(1);
    
    /**
     * specifies that symbols in the module should
     *     not be added to the global name space. The default action on most
     *     platforms is to place symbols in the module in the global name space,
     *     which may cause conflicts with existing symbols.
     */
    public static final ModuleFlags LOCAL = new ModuleFlags(2);
    
    /**
     * mask for all flags.
     */
    public static final ModuleFlags MASK = new ModuleFlags(3);
    
    public ModuleFlags(int value) {
        super(value);
    }
    
}
