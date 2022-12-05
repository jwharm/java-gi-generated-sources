package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public enum EntryIconPosition implements io.github.jwharm.javagi.Enumeration {
    /**
     * At the beginning of the entry (depending on the text direction).
     */
    PRIMARY(0),
    /**
     * At the end of the entry (depending on the text direction).
     */
    SECONDARY(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntryIconPosition";
    
    private final int value;
    EntryIconPosition(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EntryIconPosition of(int value) {
        return switch (value) {
            case 0 -> PRIMARY;
            case 1 -> SECONDARY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
