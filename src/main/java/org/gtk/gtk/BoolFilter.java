package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBoolFilter} evaluates a boolean {@code GtkExpression}
 * to determine whether to include items.
 */
public class BoolFilter extends org.gtk.gtk.Filter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public BoolFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BoolFilter */
    public static BoolFilter castFrom(org.gtk.gobject.Object gobject) {
        return new BoolFilter(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Expression expression) {
        java.util.Objects.requireNonNullElse(expression, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_bool_filter_new.invokeExact(expression.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new bool filter.
     * @param expression The expression to evaluate
     */
    public BoolFilter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bool_filter_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the filter inverts the expression.
     * @return {@code true} if the filter inverts
     */
    public boolean getInvert() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bool_filter_get_invert.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     * <p>
     * The expression must have a value type of {@code G_TYPE_BOOLEAN}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        java.util.Objects.requireNonNullElse(expression, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_bool_filter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the filter should invert the expression.
     * @param invert {@code true} to invert
     */
    public void setInvert(boolean invert) {
        try {
            DowncallHandles.gtk_bool_filter_set_invert.invokeExact(handle(), invert ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bool_filter_new = Interop.downcallHandle(
            "gtk_bool_filter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bool_filter_get_expression = Interop.downcallHandle(
            "gtk_bool_filter_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bool_filter_get_invert = Interop.downcallHandle(
            "gtk_bool_filter_get_invert",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bool_filter_set_expression = Interop.downcallHandle(
            "gtk_bool_filter_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bool_filter_set_invert = Interop.downcallHandle(
            "gtk_bool_filter_set_invert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
