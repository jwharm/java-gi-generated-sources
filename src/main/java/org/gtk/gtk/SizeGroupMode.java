package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The mode of the size group determines the directions in which the size
 * group affects the requested sizes of its component widgets.
 */
public class SizeGroupMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * group has no effect
     */
    public static final SizeGroupMode NONE = new SizeGroupMode(0);
    
    /**
     * group affects horizontal requisition
     */
    public static final SizeGroupMode HORIZONTAL = new SizeGroupMode(1);
    
    /**
     * group affects vertical requisition
     */
    public static final SizeGroupMode VERTICAL = new SizeGroupMode(2);
    
    /**
     * group affects both horizontal and vertical requisition
     */
    public static final SizeGroupMode BOTH = new SizeGroupMode(3);
    
    public SizeGroupMode(int value) {
        super(value);
    }
}
