package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Granularity types that extend the text selection. Use the
 * {@code GtkTextView::extend-selection} signal to customize the selection.
 */
public class TextExtendSelection extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Selects the current word. It is triggered by
     *   a double-click for example.
     */
    public static final TextExtendSelection WORD = new TextExtendSelection(0);
    
    /**
     * Selects the current line. It is triggered by
     *   a triple-click for example.
     */
    public static final TextExtendSelection LINE = new TextExtendSelection(1);
    
    public TextExtendSelection(int value) {
        super(value);
    }
}
