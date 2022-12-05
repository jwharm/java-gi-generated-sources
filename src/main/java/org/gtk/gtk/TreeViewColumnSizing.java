package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The sizing method the column uses to determine its width.  Please note
 * that {@link TreeViewColumnSizing#AUTOSIZE} are inefficient for large views, and
 * can make columns appear choppy.
 */
public enum TreeViewColumnSizing implements io.github.jwharm.javagi.Enumeration {
    /**
     * Columns only get bigger in reaction to changes in the model
     */
    GROW_ONLY(0),
    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    AUTOSIZE(1),
    /**
     * Columns are a fixed numbers of pixels wide.
     */
    FIXED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewColumnSizing";
    
    private final int value;
    TreeViewColumnSizing(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TreeViewColumnSizing of(int value) {
        return switch (value) {
            case 0 -> GROW_ONLY;
            case 1 -> AUTOSIZE;
            case 2 -> FIXED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
