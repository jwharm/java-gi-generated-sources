package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Domain for VFL parsing errors.
 */
public class ConstraintVflParserError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintVflParserError";
    
    /**
     * Invalid or unknown symbol
     */
    public static final ConstraintVflParserError SYMBOL = new ConstraintVflParserError(0);
    
    /**
     * Invalid or unknown attribute
     */
    public static final ConstraintVflParserError ATTRIBUTE = new ConstraintVflParserError(1);
    
    /**
     * Invalid or unknown view
     */
    public static final ConstraintVflParserError VIEW = new ConstraintVflParserError(2);
    
    /**
     * Invalid or unknown metric
     */
    public static final ConstraintVflParserError METRIC = new ConstraintVflParserError(3);
    
    /**
     * Invalid or unknown priority
     */
    public static final ConstraintVflParserError PRIORITY = new ConstraintVflParserError(4);
    
    /**
     * Invalid or unknown relation
     */
    public static final ConstraintVflParserError RELATION = new ConstraintVflParserError(5);
    
    public ConstraintVflParserError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
    }
}
