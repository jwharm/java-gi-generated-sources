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
public class TreeViewColumnSizing extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Columns only get bigger in reaction to changes in the model
     */
    public static final TreeViewColumnSizing GROW_ONLY = new TreeViewColumnSizing(0);
    
    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    public static final TreeViewColumnSizing AUTOSIZE = new TreeViewColumnSizing(1);
    
    /**
     * Columns are a fixed numbers of pixels wide.
     */
    public static final TreeViewColumnSizing FIXED = new TreeViewColumnSizing(2);
    
    public TreeViewColumnSizing(int value) {
        super(value);
    }
}
