package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The identifiers for {@code Gtk.Editable} properties.
 * <p>
 * See {@link Editable#installProperties} for details on how to
 * implement the {@code GtkEditable} interface.
 */
public enum EditableProperties implements io.github.jwharm.javagi.Enumeration {
    /**
     * the property id for {@code Gtk.Editable:text}
     */
    PROP_TEXT(0),
    /**
     * the property id for {@code Gtk.Editable:cursor-position}
     */
    PROP_CURSOR_POSITION(1),
    /**
     * the property id for {@code Gtk.Editable:selection-bound}
     */
    PROP_SELECTION_BOUND(2),
    /**
     * the property id for {@code Gtk.Editable:editable}
     */
    PROP_EDITABLE(3),
    /**
     * the property id for {@code Gtk.Editable:width-chars}
     */
    PROP_WIDTH_CHARS(4),
    /**
     * the property id for {@code Gtk.Editable:max-width-chars}
     */
    PROP_MAX_WIDTH_CHARS(5),
    /**
     * the property id for {@code Gtk.Editable:xalign}
     */
    PROP_XALIGN(6),
    /**
     * the property id for {@code Gtk.Editable:enable-undo}
     */
    PROP_ENABLE_UNDO(7),
    /**
     * the number of properties
     */
    NUM_PROPERTIES(8);
    
    private static final java.lang.String C_TYPE_NAME = "GtkEditableProperties";
    
    private final int value;
    EditableProperties(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EditableProperties of(int value) {
        return switch (value) {
            case 0 -> PROP_TEXT;
            case 1 -> PROP_CURSOR_POSITION;
            case 2 -> PROP_SELECTION_BOUND;
            case 3 -> PROP_EDITABLE;
            case 4 -> PROP_WIDTH_CHARS;
            case 5 -> PROP_MAX_WIDTH_CHARS;
            case 6 -> PROP_XALIGN;
            case 7 -> PROP_ENABLE_UNDO;
            case 8 -> NUM_PROPERTIES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
