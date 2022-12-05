package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Built-in icon sizes.
 * <p>
 * Icon sizes default to being inherited. Where they cannot be
 * inherited, text size is the default.
 * <p>
 * All widgets which use {@code GtkIconSize} set the normal-icons or
 * large-icons style classes correspondingly, and let themes
 * determine the actual size to be used with the
 * {@code -gtk-icon-size} CSS property.
 */
public enum IconSize implements io.github.jwharm.javagi.Enumeration {
    /**
     * Keep the size of the parent element
     */
    INHERIT(0),
    /**
     * Size similar to text size
     */
    NORMAL(1),
    /**
     * Large size, for example in an icon view
     */
    LARGE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconSize";
    
    private final int value;
    IconSize(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static IconSize of(int value) {
        return switch (value) {
            case 0 -> INHERIT;
            case 1 -> NORMAL;
            case 2 -> LARGE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
