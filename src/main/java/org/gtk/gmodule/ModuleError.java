package org.gtk.gmodule;

/**
 * Errors returned by g_module_open_full().
 */
public class ModuleError extends io.github.jwharm.javagi.Enumeration {

    /**
     * there was an error loading or opening a module file
     */
    public static final ModuleError FAILED = new ModuleError(0);
    
    /**
     * a module returned an error from its {@code g_module_check_init()} function
     */
    public static final ModuleError CHECK_FAILED = new ModuleError(1);
    
    public ModuleError(int value) {
        super(value);
    }
    
}
