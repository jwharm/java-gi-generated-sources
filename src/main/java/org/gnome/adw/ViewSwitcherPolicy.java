package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public enum ViewSwitcherPolicy implements io.github.jwharm.javagi.Enumeration {
    /**
     * Force the narrow mode
     */
    NARROW(0),
    /**
     * Force the wide mode
     */
    WIDE(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcherPolicy";
    
    private final int value;
    ViewSwitcherPolicy(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ViewSwitcherPolicy of(int value) {
        return switch (value) {
            case 0 -> NARROW;
            case 1 -> WIDE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
