package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by markup parsing.
 */
public class MarkupError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * text being parsed was not valid UTF-8
     */
    public static final MarkupError BAD_UTF8 = new MarkupError(0);
    
    /**
     * document contained nothing, or only whitespace
     */
    public static final MarkupError EMPTY = new MarkupError(1);
    
    /**
     * document was ill-formed
     */
    public static final MarkupError PARSE = new MarkupError(2);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; element wasn't known
     */
    public static final MarkupError UNKNOWN_ELEMENT = new MarkupError(3);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; attribute wasn't known
     */
    public static final MarkupError UNKNOWN_ATTRIBUTE = new MarkupError(4);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; content was invalid
     */
    public static final MarkupError INVALID_CONTENT = new MarkupError(5);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; a required attribute was missing
     */
    public static final MarkupError MISSING_ATTRIBUTE = new MarkupError(6);
    
    public MarkupError(int value) {
        super(value);
    }
}
