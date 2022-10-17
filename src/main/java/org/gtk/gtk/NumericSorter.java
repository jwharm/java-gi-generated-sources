package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNumericSorter} is a {@code GtkSorter} that compares numbers.
 * <p>
 * To obtain the numbers to compare, this sorter evaluates a
 * {@link Expression}.
 */
public class NumericSorter extends Sorter {

    public NumericSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NumericSorter */
    public static NumericSorter castFrom(org.gtk.gobject.Object gobject) {
        return new NumericSorter(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_numeric_sorter_new = Interop.downcallHandle(
        "gtk_numeric_sorter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable Expression expression) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_numeric_sorter_new.invokeExact(expression.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new numeric sorter using the given {@code expression}.
     * <p>
     * Smaller numbers will be sorted first. You can call
     * {@link NumericSorter#setSortOrder} to change this.
     */
    public NumericSorter(@Nullable Expression expression) {
        super(constructNew(expression));
    }
    
    private static final MethodHandle gtk_numeric_sorter_get_expression = Interop.downcallHandle(
        "gtk_numeric_sorter_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     */
    public @Nullable Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_numeric_sorter_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Expression(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_numeric_sorter_get_sort_order = Interop.downcallHandle(
        "gtk_numeric_sorter_get_sort_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     */
    public @NotNull SortType getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) gtk_numeric_sorter_get_sort_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SortType(RESULT);
    }
    
    private static final MethodHandle gtk_numeric_sorter_set_expression = Interop.downcallHandle(
        "gtk_numeric_sorter_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that is evaluated to obtain numbers from items.
     * <p>
     * Unless an expression is set on {@code self}, the sorter will always
     * compare items as invalid.
     * <p>
     * The expression must have a return type that can be compared
     * numerically, such as {@code G_TYPE_INT} or {@code G_TYPE_DOUBLE}.
     */
    public @NotNull void setExpression(@Nullable Expression expression) {
        try {
            gtk_numeric_sorter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_numeric_sorter_set_sort_order = Interop.downcallHandle(
        "gtk_numeric_sorter_set_sort_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to sort smaller numbers before larger ones.
     */
    public @NotNull void setSortOrder(@NotNull SortType sortOrder) {
        try {
            gtk_numeric_sorter_set_sort_order.invokeExact(handle(), sortOrder.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
