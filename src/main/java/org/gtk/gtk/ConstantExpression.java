package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A constant value in a {@code GtkExpression}.
 */
public class ConstantExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstantExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ConstantExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ConstantExpression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ConstantExpression if its GType is a (or inherits from) "GtkConstantExpression".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ConstantExpression} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstantExpression", a ClassCastException will be thrown.
     */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ConstantExpression.getType())) {
            return new ConstantExpression(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstantExpression");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type valueType, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(valueType, "Parameter 'valueType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_new.invokeExact(
                    valueType.getValue().longValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that evaluates to the
     * object given by the arguments.
     * @param valueType The type of the object
     * @param varargs arguments to create the object from
     */
    public ConstantExpression(@NotNull org.gtk.glib.Type valueType, java.lang.Object... varargs) {
        super(constructNew(valueType, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewForValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_new_for_value.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an expression that always evaluates to the given {@code value}.
     * @param value a {@code GValue}
     * @return a new {@code GtkExpression}
     */
    public static ConstantExpression newForValue(@NotNull org.gtk.gobject.Value value) {
        return new ConstantExpression(constructNewForValue(value), Ownership.FULL);
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     * @return the value
     */
    public @NotNull org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_constant_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Expression.Build {
        
         /**
         * A {@link ConstantExpression.Build} object constructs a {@link ConstantExpression} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ConstantExpression} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ConstantExpression} using {@link ConstantExpression#castFrom}.
         * @return A new instance of {@code ConstantExpression} with the properties 
         *         that were set in the Build object.
         */
        public ConstantExpression construct() {
            return ConstantExpression.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ConstantExpression.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constant_expression_new = Interop.downcallHandle(
            "gtk_constant_expression_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            true
        );
        
        private static final MethodHandle gtk_constant_expression_new_for_value = Interop.downcallHandle(
            "gtk_constant_expression_new_for_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constant_expression_get_value = Interop.downcallHandle(
            "gtk_constant_expression_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constant_expression_get_type = Interop.downcallHandle(
            "gtk_constant_expression_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
