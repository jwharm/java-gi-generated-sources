package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible folding behavior of a {@link Flap} widget.
 * @version 1.0
 */
public enum FlapFoldPolicy implements io.github.jwharm.javagi.Enumeration {
    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    NEVER(0),
    /**
     * Keep the flap always folded.
     */
    ALWAYS(1),
    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    AUTO(2);
    
    private static final java.lang.String C_TYPE_NAME = "AdwFlapFoldPolicy";
    
    private final int value;
    FlapFoldPolicy(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FlapFoldPolicy of(int value) {
        return switch (value) {
            case 0 -> NEVER;
            case 1 -> ALWAYS;
            case 2 -> AUTO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
