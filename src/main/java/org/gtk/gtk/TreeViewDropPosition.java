package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enum for determining where a dropped row goes.
 */
public enum TreeViewDropPosition implements io.github.jwharm.javagi.Enumeration {
    /**
     * dropped row is inserted before
     */
    BEFORE(0),
    /**
     * dropped row is inserted after
     */
    AFTER(1),
    /**
     * dropped row becomes a child or is inserted before
     */
    INTO_OR_BEFORE(2),
    /**
     * dropped row becomes a child or is inserted after
     */
    INTO_OR_AFTER(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewDropPosition";
    
    private final int value;
    TreeViewDropPosition(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TreeViewDropPosition of(int value) {
        return switch (value) {
            case 0 -> BEFORE;
            case 1 -> AFTER;
            case 2 -> INTO_OR_BEFORE;
            case 3 -> INTO_OR_AFTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
