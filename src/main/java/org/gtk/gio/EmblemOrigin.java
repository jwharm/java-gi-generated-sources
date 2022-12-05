package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GEmblemOrigin is used to add information about the origin of the emblem
 * to {@link Emblem}.
 * @version 2.18
 */
public enum EmblemOrigin implements io.github.jwharm.javagi.Enumeration {
    /**
     * Emblem of unknown origin
     */
    UNKNOWN(0),
    /**
     * Emblem adds device-specific information
     */
    DEVICE(1),
    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    LIVEMETADATA(2),
    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    TAG(3);
    
    private static final java.lang.String C_TYPE_NAME = "GEmblemOrigin";
    
    private final int value;
    EmblemOrigin(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EmblemOrigin of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> DEVICE;
            case 2 -> LIVEMETADATA;
            case 3 -> TAG;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
