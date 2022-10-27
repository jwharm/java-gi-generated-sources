package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies how search strings are matched inside text.
 */
public class StringFilterMatchMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The search string and
     *   text must match exactly.
     */
    public static final StringFilterMatchMode EXACT = new StringFilterMatchMode(0);
    
    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    public static final StringFilterMatchMode SUBSTRING = new StringFilterMatchMode(1);
    
    /**
     * The text must begin
     *   with the search string.
     */
    public static final StringFilterMatchMode PREFIX = new StringFilterMatchMode(2);
    
    public StringFilterMatchMode(int value) {
        super(value);
    }
}
