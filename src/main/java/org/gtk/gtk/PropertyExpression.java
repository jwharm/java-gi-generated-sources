package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GObject} property value in a {@code GtkExpression}.
 */
public class PropertyExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPropertyExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PropertyExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PropertyExpression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PropertyExpression if its GType is a (or inherits from) "GtkPropertyExpression".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PropertyExpression} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPropertyExpression", a ClassCastException will be thrown.
     */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPropertyExpression"))) {
            return new PropertyExpression(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPropertyExpression");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type thisType, @Nullable org.gtk.gtk.Expression expression, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(thisType, "Parameter 'thisType' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_new.invokeExact(
                    thisType.getValue().longValue(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates an expression that looks up a property.
     * <p>
     * The object to use is found by evaluating the {@code expression},
     * or using the {@code this} argument when {@code expression} is {@code NULL}.
     * <p>
     * If the resulting object conforms to {@code this_type}, its property named
     * {@code property_name} will be queried. Otherwise, this expression's
     * evaluation will fail.
     * <p>
     * The given {@code this_type} must have a property with {@code property_name}.
     * @param thisType The type to expect for the this type
     * @param expression Expression to
     *   evaluate to get the object to query or {@code NULL} to
     *   query the {@code this} object
     * @param propertyName name of the property
     */
    public PropertyExpression(@NotNull org.gtk.glib.Type thisType, @Nullable org.gtk.gtk.Expression expression, @NotNull java.lang.String propertyName) {
        super(constructNew(thisType, expression, propertyName), Ownership.FULL);
    }
    
    private static Addressable constructNewForPspec(@Nullable org.gtk.gtk.Expression expression, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_new_for_pspec.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates an expression that looks up a property.
     * <p>
     * The object to use is found by evaluating the {@code expression},
     * or using the {@code this} argument when {@code expression} is {@code NULL}.
     * <p>
     * If the resulting object conforms to {@code this_type}, its
     * property specified by {@code pspec} will be queried.
     * Otherwise, this expression's evaluation will fail.
     * @param expression Expression to
     *   evaluate to get the object to query or {@code NULL} to
     *   query the {@code this} object
     * @param pspec the {@code GParamSpec} for the property to query
     * @return a new {@code GtkExpression}
     */
    public static PropertyExpression newForPspec(@Nullable org.gtk.gtk.Expression expression, @NotNull org.gtk.gobject.ParamSpec pspec) {
        return new PropertyExpression(constructNewForPspec(expression, pspec), Ownership.FULL);
    }
    
    /**
     * Gets the expression specifying the object of
     * a property expression.
     * @return the object expression
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GParamSpec} specifying the property of
     * a property expression.
     * @return the {@code GParamSpec} for the property
     */
    public @NotNull org.gtk.gobject.ParamSpec getPspec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_get_pspec.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_property_expression_new = Interop.downcallHandle(
            "gtk_property_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_property_expression_new_for_pspec = Interop.downcallHandle(
            "gtk_property_expression_new_for_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_property_expression_get_expression = Interop.downcallHandle(
            "gtk_property_expression_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_property_expression_get_pspec = Interop.downcallHandle(
            "gtk_property_expression_get_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
