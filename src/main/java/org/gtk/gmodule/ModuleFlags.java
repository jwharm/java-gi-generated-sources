package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags passed to g_module_open().
 * Note that these flags are not supported on all platforms.
 */
public class ModuleFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GModuleFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ModuleFlags or(ModuleFlags mask) {
        return new ModuleFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ModuleFlags combined(ModuleFlags mask, ModuleFlags... masks) {
        int value = mask.getValue();        for (ModuleFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ModuleFlags(value);
    }
}
