package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors returned by g_module_open_full().
 * @version 2.70
 */
public enum ModuleError implements io.github.jwharm.javagi.Enumeration {
    /**
     * there was an error loading or opening a module file
     */
    FAILED(0),
    /**
     * a module returned an error from its {@code g_module_check_init()} function
     */
    CHECK_FAILED(1);
    
    private static final java.lang.String C_TYPE_NAME = "GModuleError";
    
    private final int value;
    ModuleError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ModuleError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> CHECK_FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
