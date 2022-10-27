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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PropertyExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PropertyExpression */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyExpression(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type thisType, @Nullable org.gtk.gtk.Expression expression, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(thisType, "Parameter 'thisType' must not be null");
        java.util.Objects.requireNonNullElse(expression, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_property_expression_new.invokeExact(thisType.getValue(), expression.refcounted().unowned().handle(), Interop.allocateNativeString(propertyName)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        super(constructNew(thisType, expression, propertyName));
    }
    
    private static Refcounted constructNewForPspec(@Nullable org.gtk.gtk.Expression expression, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNullElse(expression, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_property_expression_new_for_pspec.invokeExact(expression.refcounted().unowned().handle(), pspec.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        return new PropertyExpression(constructNewForPspec(expression, pspec));
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
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GParamSpec} specifying the property of
     * a property expression.
     * @return the {@code GParamSpec} for the property
     */
    public @NotNull org.gtk.gobject.ParamSpec getPspec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_property_expression_get_pspec.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_property_expression_new = Interop.downcallHandle(
            "gtk_property_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_property_expression_new_for_pspec = Interop.downcallHandle(
            "gtk_property_expression_new_for_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_property_expression_get_expression = Interop.downcallHandle(
            "gtk_property_expression_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_property_expression_get_pspec = Interop.downcallHandle(
            "gtk_property_expression_get_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
