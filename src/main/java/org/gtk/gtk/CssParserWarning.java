package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Warnings that can occur while parsing CSS.
 * <p>
 * Unlike {@code GtkCssParserError}s, warnings do not cause the parser to
 * skip any input, but they indicate issues that should be fixed.
 */
public class CssParserWarning extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssParserWarning";
    
    /**
     * The given construct is
     *   deprecated and will be removed in a future version
     */
    public static final CssParserWarning DEPRECATED = new CssParserWarning(0);
    
    /**
     * A syntax construct was used
     *   that should be avoided
     */
    public static final CssParserWarning SYNTAX = new CssParserWarning(1);
    
    /**
     * A feature is not implemented
     */
    public static final CssParserWarning UNIMPLEMENTED = new CssParserWarning(2);
    
    public CssParserWarning(int value) {
        super(value);
    }
}
