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
public enum CssParserWarning implements io.github.jwharm.javagi.Enumeration {
    /**
     * The given construct is
     *   deprecated and will be removed in a future version
     */
    DEPRECATED(0),
    /**
     * A syntax construct was used
     *   that should be avoided
     */
    SYNTAX(1),
    /**
     * A feature is not implemented
     */
    UNIMPLEMENTED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssParserWarning";
    
    private final int value;
    CssParserWarning(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CssParserWarning of(int value) {
        return switch (value) {
            case 0 -> DEPRECATED;
            case 1 -> SYNTAX;
            case 2 -> UNIMPLEMENTED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
