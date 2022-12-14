package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for use with g_io_module_scope_new().
 * @version 2.30
 */
public enum IOModuleScopeFlags implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No module scan flags
     */
    NONE(0),
    
    /**
     * When using this scope to load or
     *     scan modules, automatically block a modules which has the same base
     *     basename as previously loaded module.
     */
    BLOCK_DUPLICATES(1);
    
    private static final java.lang.String C_TYPE_NAME = "GIOModuleScopeFlags";
    
    private final int value;
    
    /**
     * Create a new IOModuleScopeFlags for the provided value
     * @param numeric value the enum value
     */
    IOModuleScopeFlags(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new IOModuleScopeFlags for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IOModuleScopeFlags of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> BLOCK_DUPLICATES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
