package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to control what selections users are allowed to make.
 */
public enum SelectionMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * No selection is possible.
     */
    NONE(0),
    /**
     * Zero or one element may be selected.
     */
    SINGLE(1),
    /**
     * Exactly one element is selected.
     *   In some circumstances, such as initially or during a search
     *   operation, it’s possible for no element to be selected with
     *   {@link SelectionMode#BROWSE}. What is really enforced is that the user
     *   can’t deselect a currently selected element except by selecting
     *   another element.
     */
    BROWSE(2),
    /**
     * Any number of elements may be selected.
     *   The Ctrl key may be used to enlarge the selection, and Shift
     *   key to select between the focus and the child pointed to.
     *   Some widgets may also allow Click-drag to select a range of elements.
     */
    MULTIPLE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSelectionMode";
    
    private final int value;
    SelectionMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SelectionMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            case 2 -> BROWSE;
            case 3 -> MULTIPLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
