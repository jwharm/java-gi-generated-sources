package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public class TreeViewGridLines extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No grid lines.
     */
    public static final TreeViewGridLines NONE = new TreeViewGridLines(0);
    
    /**
     * Horizontal grid lines.
     */
    public static final TreeViewGridLines HORIZONTAL = new TreeViewGridLines(1);
    
    /**
     * Vertical grid lines.
     */
    public static final TreeViewGridLines VERTICAL = new TreeViewGridLines(2);
    
    /**
     * Horizontal and vertical grid lines.
     */
    public static final TreeViewGridLines BOTH = new TreeViewGridLines(3);
    
    public TreeViewGridLines(int value) {
        super(value);
    }
}
