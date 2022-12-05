package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Identifies how the user can interact with a particular cell.
 */
public enum CellRendererMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * The cell is just for display
     *  and cannot be interacted with.  Note that this doesn’t mean that eg. the
     *  row being drawn can’t be selected -- just that a particular element of
     *  it cannot be individually modified.
     */
    INERT(0),
    /**
     * The cell can be clicked.
     */
    ACTIVATABLE(1),
    /**
     * The cell can be edited or otherwise modified.
     */
    EDITABLE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererMode";
    
    private final int value;
    CellRendererMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CellRendererMode of(int value) {
        return switch (value) {
            case 0 -> INERT;
            case 1 -> ACTIVATABLE;
            case 2 -> EDITABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
