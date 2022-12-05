package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes how well an event matches a given keyval and modifiers.
 * <p>
 * {@code GdkKeyMatch} values are returned by {@link KeyEvent#matches}.
 */
public enum KeyMatch implements io.github.jwharm.javagi.Enumeration {
    /**
     * The key event does not match
     */
    NONE(0),
    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    PARTIAL(1),
    /**
     * The key event matches
     */
    EXACT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GdkKeyMatch";
    
    private final int value;
    KeyMatch(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static KeyMatch of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> PARTIAL;
            case 2 -> EXACT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
