package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that modify the behavior of gtk_style_context_to_string().
 * <p>
 * New values may be added to this enumeration.
 */
public class StyleContextPrintFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Default value.
     */
    public static final StyleContextPrintFlags NONE = new StyleContextPrintFlags(0);
    
    /**
     * Print the entire tree of
     *   CSS nodes starting at the style context's node
     */
    public static final StyleContextPrintFlags RECURSE = new StyleContextPrintFlags(1);
    
    /**
     * Show the values of the
     *   CSS properties for each node
     */
    public static final StyleContextPrintFlags SHOW_STYLE = new StyleContextPrintFlags(2);
    
    /**
     * Show information about
     *   what changes affect the styles
     */
    public static final StyleContextPrintFlags SHOW_CHANGE = new StyleContextPrintFlags(4);
    
    public StyleContextPrintFlags(int value) {
        super(value);
    }
}
