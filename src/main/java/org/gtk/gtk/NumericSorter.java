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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a NumericSorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NumericSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NumericSorter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NumericSorter(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Expression expression) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_numeric_sorter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
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
        super(constructNew(expression), Ownership.FULL);
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
        return (org.gtk.gtk.Expression) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Expression.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     * @return the order of the numbers
     */
    public org.gtk.gtk.SortType getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_numeric_sorter_get_sort_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SortType.of(RESULT);
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
    public void setSortOrder(org.gtk.gtk.SortType sortOrder) {
        try {
            DowncallHandles.gtk_numeric_sorter_set_sort_order.invokeExact(
                    handle(),
                    sortOrder.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_numeric_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NumericSorter.Builder} object constructs a {@link NumericSorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NumericSorter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Sorter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NumericSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NumericSorter}.
         * @return A new instance of {@code NumericSorter} with the properties 
         *         that were set in the Builder object.
         */
        public NumericSorter build() {
            return (NumericSorter) org.gtk.gobject.GObject.newWithProperties(
                NumericSorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The expression to evaluate on items to get a number to compare with.
         * @param expression The value for the {@code expression} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpression(org.gtk.gtk.Expression expression) {
            names.add("expression");
            values.add(org.gtk.gobject.Value.create(expression));
            return this;
        }
        
        /**
         * Whether the sorter will sort smaller numbers first.
         * @param sortOrder The value for the {@code sort-order} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSortOrder(org.gtk.gtk.SortType sortOrder) {
            names.add("sort-order");
            values.add(org.gtk.gobject.Value.create(sortOrder));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_numeric_sorter_new = Interop.downcallHandle(
            "gtk_numeric_sorter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_numeric_sorter_get_expression = Interop.downcallHandle(
            "gtk_numeric_sorter_get_expression",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_numeric_sorter_get_sort_order = Interop.downcallHandle(
            "gtk_numeric_sorter_get_sort_order",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_numeric_sorter_set_expression = Interop.downcallHandle(
            "gtk_numeric_sorter_set_expression",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_numeric_sorter_set_sort_order = Interop.downcallHandle(
            "gtk_numeric_sorter_set_sort_order",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_numeric_sorter_get_type = Interop.downcallHandle(
            "gtk_numeric_sorter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
