package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A constant value in a {@code GtkExpression}.
 */
public class ConstantExpression extends Expression {

    public ConstantExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ConstantExpression */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ConstantExpression(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_constant_expression_new_for_value = Interop.downcallHandle(
        "gtk_constant_expression_new_for_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForValue(@NotNull org.gtk.gobject.Value value) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_constant_expression_new_for_value.invokeExact(value.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an expression that always evaluates to the given {@code value}.
     */
    public static ConstantExpression newForValue(@NotNull org.gtk.gobject.Value value) {
        return new ConstantExpression(constructNewForValue(value));
    }
    
    private static final MethodHandle gtk_constant_expression_get_value = Interop.downcallHandle(
        "gtk_constant_expression_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value that a constant expression evaluates to.
     */
    public @NotNull org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_constant_expression_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
}
