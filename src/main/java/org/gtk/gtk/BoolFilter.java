package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBoolFilter} evaluates a boolean {@code GtkExpression}
 * to determine whether to include items.
 */
public class BoolFilter extends Filter {

    public BoolFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BoolFilter */
    public static BoolFilter castFrom(org.gtk.gobject.Object gobject) {
        return new BoolFilter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_bool_filter_new = Interop.downcallHandle(
        "gtk_bool_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Expression expression) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_bool_filter_new.invokeExact(expression.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new bool filter.
     */
    public BoolFilter(Expression expression) {
        super(constructNew(expression));
    }
    
    static final MethodHandle gtk_bool_filter_get_expression = Interop.downcallHandle(
        "gtk_bool_filter_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     */
    public Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) gtk_bool_filter_get_expression.invokeExact(handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bool_filter_get_invert = Interop.downcallHandle(
        "gtk_bool_filter_get_invert",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the filter inverts the expression.
     */
    public boolean getInvert() {
        try {
            var RESULT = (int) gtk_bool_filter_get_invert.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bool_filter_set_expression = Interop.downcallHandle(
        "gtk_bool_filter_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     * <p>
     * The expression must have a value type of {@code G_TYPE_BOOLEAN}.
     */
    public void setExpression(Expression expression) {
        try {
            gtk_bool_filter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bool_filter_set_invert = Interop.downcallHandle(
        "gtk_bool_filter_set_invert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the filter should invert the expression.
     */
    public void setInvert(boolean invert) {
        try {
            gtk_bool_filter_set_invert.invokeExact(handle(), invert ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}