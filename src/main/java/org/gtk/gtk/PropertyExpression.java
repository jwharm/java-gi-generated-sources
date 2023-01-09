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
     */
    protected PropertyExpression(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PropertyExpression> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PropertyExpression(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type thisType, @Nullable org.gtk.gtk.Expression expression, java.lang.String propertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_new.invokeExact(
                        thisType.getValue().longValue(),
                        (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            expression.yieldOwnership();
            return RESULT;
        }
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
    public PropertyExpression(org.gtk.glib.Type thisType, @Nullable org.gtk.gtk.Expression expression, java.lang.String propertyName) {
        super(constructNew(thisType, expression, propertyName));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewForPspec(@Nullable org.gtk.gtk.Expression expression, org.gtk.gobject.ParamSpec pspec) {
        MemoryAddress RESULT;
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
    public static PropertyExpression newForPspec(@Nullable org.gtk.gtk.Expression expression, org.gtk.gobject.ParamSpec pspec) {
        var RESULT = constructNewForPspec(expression, pspec);
        var OBJECT = (org.gtk.gtk.PropertyExpression) Interop.register(RESULT, org.gtk.gtk.PropertyExpression.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the expression specifying the object of
     * a property expression.
     * @return the object expression
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) Interop.register(RESULT, org.gtk.gtk.Expression.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code GParamSpec} specifying the property of
     * a property expression.
     * @return the {@code GParamSpec} for the property
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_get_pspec.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_property_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_property_expression_new = Interop.downcallHandle(
                "gtk_property_expression_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_property_expression_new_for_pspec = Interop.downcallHandle(
                "gtk_property_expression_new_for_pspec",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_property_expression_get_expression = Interop.downcallHandle(
                "gtk_property_expression_get_expression",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_property_expression_get_pspec = Interop.downcallHandle(
                "gtk_property_expression_get_pspec",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_property_expression_get_type = Interop.downcallHandle(
                "gtk_property_expression_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_property_expression_get_type != null;
    }
}
