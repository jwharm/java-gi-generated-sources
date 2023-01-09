package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Domain for VFL parsing errors.
 */
public enum ConstraintVflParserError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Invalid or unknown symbol
     */
    SYMBOL(0),
    
    /**
     * Invalid or unknown attribute
     */
    ATTRIBUTE(1),
    
    /**
     * Invalid or unknown view
     */
    VIEW(2),
    
    /**
     * Invalid or unknown metric
     */
    METRIC(3),
    
    /**
     * Invalid or unknown priority
     */
    PRIORITY(4),
    
    /**
     * Invalid or unknown relation
     */
    RELATION(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintVflParserError";
    
    private final int value;
    
    /**
     * Create a new ConstraintVflParserError for the provided value
     * @param numeric value the enum value
     */
    ConstraintVflParserError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new ConstraintVflParserError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ConstraintVflParserError of(int value) {
        return switch (value) {
            case 0 -> SYMBOL;
            case 1 -> ATTRIBUTE;
            case 2 -> VIEW;
            case 3 -> METRIC;
            case 4 -> PRIORITY;
            case 5 -> RELATION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_vfl_parser_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_vfl_parser_error_quark = Interop.downcallHandle(
                "gtk_constraint_vfl_parser_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
