package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enum for determining where a dropped row goes.
 */
public class TreeViewDropPosition extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * dropped row is inserted before
     */
    public static final TreeViewDropPosition BEFORE = new TreeViewDropPosition(0);
    
    /**
     * dropped row is inserted after
     */
    public static final TreeViewDropPosition AFTER = new TreeViewDropPosition(1);
    
    /**
     * dropped row becomes a child or is inserted before
     */
    public static final TreeViewDropPosition INTO_OR_BEFORE = new TreeViewDropPosition(2);
    
    /**
     * dropped row becomes a child or is inserted after
     */
    public static final TreeViewDropPosition INTO_OR_AFTER = new TreeViewDropPosition(3);
    
    public TreeViewDropPosition(int value) {
        super(value);
    }
}
