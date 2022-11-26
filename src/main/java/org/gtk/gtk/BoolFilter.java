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
    @ApiStatus.Internal
    public BoolFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BoolFilter if its GType is a (or inherits from) "GtkBoolFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BoolFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBoolFilter", a ClassCastException will be thrown.
     */
    public static BoolFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), BoolFilter.getType())) {
            return new BoolFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBoolFilter");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Expression expression) {
        Addressable RESULT;
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
        return new org.gtk.gtk.Expression(RESULT, Ownership.NONE);
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
                    invert ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_bool_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Filter.Build {
        
         /**
         * A {@link BoolFilter.Build} object constructs a {@link BoolFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BoolFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BoolFilter} using {@link BoolFilter#castFrom}.
         * @return A new instance of {@code BoolFilter} with the properties 
         *         that were set in the Build object.
         */
        public BoolFilter construct() {
            return BoolFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BoolFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The boolean expression to evaluate on item.
         * @param expression The value for the {@code expression} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExpression(org.gtk.gtk.Expression expression) {
            names.add("expression");
            values.add(org.gtk.gobject.Value.create(expression));
            return this;
        }
        
        /**
         * If the expression result should be inverted.
         * @param invert The value for the {@code invert} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInvert(boolean invert) {
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
