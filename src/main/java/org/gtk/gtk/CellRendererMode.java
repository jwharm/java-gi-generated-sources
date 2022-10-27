package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Identifies how the user can interact with a particular cell.
 */
public class CellRendererMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The cell is just for display
     *  and cannot be interacted with.  Note that this doesn’t mean that eg. the
     *  row being drawn can’t be selected -- just that a particular element of
     *  it cannot be individually modified.
     */
    public static final CellRendererMode INERT = new CellRendererMode(0);
    
    /**
     * The cell can be clicked.
     */
    public static final CellRendererMode ACTIVATABLE = new CellRendererMode(1);
    
    /**
     * The cell can be edited or otherwise modified.
     */
    public static final CellRendererMode EDITABLE = new CellRendererMode(2);
    
    public CellRendererMode(int value) {
        super(value);
    }
}
