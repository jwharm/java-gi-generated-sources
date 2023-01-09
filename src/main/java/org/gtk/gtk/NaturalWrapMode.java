package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 * <p>
 * See for example the {@code Gtk.Label:natural-wrap-mode} property.
 * @version 4.6
 */
public enum NaturalWrapMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with {@link org.pango.WrapMode#CHAR}.
     */
    INHERIT(0),
    
    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3's behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    NONE(1),
    
    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using {@link org.pango.WrapMode#WORD_CHAR} as the
     *   wrap mode.
     */
    WORD(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkNaturalWrapMode";
    
    private final int value;
    
    /**
     * Create a new NaturalWrapMode for the provided value
     * @param numeric value the enum value
     */
    NaturalWrapMode(int value) {
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
     * Create a new NaturalWrapMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NaturalWrapMode of(int value) {
        return switch (value) {
            case 0 -> INHERIT;
            case 1 -> NONE;
            case 2 -> WORD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
