package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GObject} property value in a {@code GtkExpression}.
 */
public class PropertyExpression extends Expression {

    public PropertyExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PropertyExpression */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyExpression(gobject.refcounted());
    }
    
    static final MethodHandle gtk_property_expression_new = Interop.downcallHandle(
        "gtk_property_expression_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Type thisType, Expression expression, java.lang.String propertyName) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_property_expression_new.invokeExact(thisType.getValue(), expression.refcounted().unowned().handle(), Interop.allocateNativeString(propertyName).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     */
    public PropertyExpression(org.gtk.gobject.Type thisType, Expression expression, java.lang.String propertyName) {
        super(constructNew(thisType, expression, propertyName));
    }
    
    static final MethodHandle gtk_property_expression_new_for_pspec = Interop.downcallHandle(
        "gtk_property_expression_new_for_pspec",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForPspec(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_property_expression_new_for_pspec.invokeExact(expression.refcounted().unowned().handle(), pspec.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static PropertyExpression newForPspec(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        return new PropertyExpression(constructNewForPspec(expression, pspec));
    }
    
    static final MethodHandle gtk_property_expression_get_expression = Interop.downcallHandle(
        "gtk_property_expression_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression specifying the object of
     * a property expression.
     */
    public Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) gtk_property_expression_get_expression.invokeExact(handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_property_expression_get_pspec = Interop.downcallHandle(
        "gtk_property_expression_get_pspec",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GParamSpec} specifying the property of
     * a property expression.
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        try {
            var RESULT = (MemoryAddress) gtk_property_expression_get_pspec.invokeExact(handle());
            return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
