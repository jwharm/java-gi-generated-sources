package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The parameter used in the action signals of {@code GtkNotebook}.
 */
public class NotebookTab extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the first tab in the notebook
     */
    public static final NotebookTab FIRST = new NotebookTab(0);
    
    /**
     * the last tab in the notebook
     */
    public static final NotebookTab LAST = new NotebookTab(1);
    
    public NotebookTab(int value) {
        super(value);
    }
}
