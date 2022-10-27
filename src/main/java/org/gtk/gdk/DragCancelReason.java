package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used in {@code GdkDrag} to the reason of a cancelled DND operation.
 */
public class DragCancelReason extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * There is no suitable drop target.
     */
    public static final DragCancelReason NO_TARGET = new DragCancelReason(0);
    
    /**
     * Drag cancelled by the user
     */
    public static final DragCancelReason USER_CANCELLED = new DragCancelReason(1);
    
    /**
     * Unspecified error.
     */
    public static final DragCancelReason ERROR = new DragCancelReason(2);
    
    public DragCancelReason(int value) {
        super(value);
    }
}
