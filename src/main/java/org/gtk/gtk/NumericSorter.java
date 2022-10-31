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
public class NumericSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNumericSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public NumericSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NumericSorter if its GType is a (or inherits from) "GtkNumericSorter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NumericSorter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNumericSorter", a ClassCastException will be thrown.
     */
    public static NumericSorter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNumericSorter"))) {
            return new NumericSorter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNumericSorter");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Expression expression) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_numeric_sorter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.refcounted().unowned().handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new numeric sorter using the given {@code expression}.
     * <p>
     * Smaller numbers will be sorted first. You can call
     * {@link NumericSorter#setSortOrder} to change this.
     * @param expression The expression to evaluate
     */
    public NumericSorter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_numeric_sorter_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     * @return the order of the numbers
     */
    public @NotNull org.gtk.gtk.SortType getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_numeric_sorter_get_sort_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SortType(RESULT);
    }
    
    /**
     * Sets the expression that is evaluated to obtain numbers from items.
     * <p>
     * Unless an expression is set on {@code self}, the sorter will always
     * compare items as invalid.
     * <p>
     * The expression must have a return type that can be compared
     * numerically, such as {@code G_TYPE_INT} or {@code G_TYPE_DOUBLE}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_numeric_sorter_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to sort smaller numbers before larger ones.
     * @param sortOrder whether to sort smaller numbers first
     */
    public void setSortOrder(@NotNull org.gtk.gtk.SortType sortOrder) {
        java.util.Objects.requireNonNull(sortOrder, "Parameter 'sortOrder' must not be null");
        try {
            DowncallHandles.gtk_numeric_sorter_set_sort_order.invokeExact(
                    handle(),
                    sortOrder.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_numeric_sorter_new = Interop.downcallHandle(
            "gtk_numeric_sorter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_numeric_sorter_get_expression = Interop.downcallHandle(
            "gtk_numeric_sorter_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_numeric_sorter_get_sort_order = Interop.downcallHandle(
            "gtk_numeric_sorter_get_sort_order",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_numeric_sorter_set_expression = Interop.downcallHandle(
            "gtk_numeric_sorter_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_numeric_sorter_set_sort_order = Interop.downcallHandle(
            "gtk_numeric_sorter_set_sort_order",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
