package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The parameter used in the action signals of {@code GtkNotebook}.
 */
public enum NotebookTab implements io.github.jwharm.javagi.Enumeration {
    /**
     * the first tab in the notebook
     */
    FIRST(0),
    /**
     * the last tab in the notebook
     */
    LAST(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkNotebookTab";
    
    private final int value;
    NotebookTab(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NotebookTab of(int value) {
        return switch (value) {
            case 0 -> FIRST;
            case 1 -> LAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
