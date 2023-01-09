package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines how content overflowing a given area should be handled.
 * <p>
 * This is used in {@link Widget#setOverflow}. The
 * {@code Gtk.Widget:overflow} property is modeled after the
 * CSS overflow property, but implements it only partially.
 */
public enum Overflow implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No change is applied. Content is drawn at the specified
     *   position.
     */
    VISIBLE(0),
    
    /**
     * Content is clipped to the bounds of the area. Content
     *   outside the area is not drawn and cannot be interacted with.
     */
    HIDDEN(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkOverflow";
    
    private final int value;
    
    /**
     * Create a new Overflow for the provided value
     * @param numeric value the enum value
     */
    Overflow(int value) {
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
     * Create a new Overflow for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Overflow of(int value) {
        return switch (value) {
            case 0 -> VISIBLE;
            case 1 -> HIDDEN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
