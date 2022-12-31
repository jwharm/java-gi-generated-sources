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
    
    private static final java.lang.String C_TYPE_NAME = "GtkBoolFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BoolFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BoolFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BoolFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BoolFilter(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Expression expression) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bool_filter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new bool filter.
     * @param expression The expression to evaluate
     */
    public BoolFilter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression), Ownership.FULL);
    }
    
    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bool_filter_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Expression.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the filter inverts the expression.
     * @return {@code true} if the filter inverts
     */
    public boolean getInvert() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bool_filter_get_invert.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     * <p>
     * The expression must have a value type of {@code G_TYPE_BOOLEAN}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_bool_filter_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
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
            DowncallHandles.gtk_bool_filter_set_invert.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(invert, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_bool_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BoolFilter.Builder} object constructs a {@link BoolFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BoolFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Filter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BoolFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BoolFilter}.
         * @return A new instance of {@code BoolFilter} with the properties 
         *         that were set in the Builder object.
         */
        public BoolFilter build() {
            return (BoolFilter) org.gtk.gobject.GObject.newWithProperties(
                BoolFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The boolean expression to evaluate on item.
         * @param expression The value for the {@code expression} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpression(org.gtk.gtk.Expression expression) {
            names.add("expression");
            values.add(org.gtk.gobject.Value.create(expression));
            return this;
        }
        
        /**
         * If the expression result should be inverted.
         * @param invert The value for the {@code invert} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInvert(boolean invert) {
            names.add("invert");
            values.add(org.gtk.gobject.Value.create(invert));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bool_filter_new = Interop.downcallHandle(
            "gtk_bool_filter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bool_filter_get_expression = Interop.downcallHandle(
            "gtk_bool_filter_get_expression",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bool_filter_get_invert = Interop.downcallHandle(
            "gtk_bool_filter_get_invert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bool_filter_set_expression = Interop.downcallHandle(
            "gtk_bool_filter_set_expression",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bool_filter_set_invert = Interop.downcallHandle(
            "gtk_bool_filter_set_invert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_bool_filter_get_type = Interop.downcallHandle(
            "gtk_bool_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
