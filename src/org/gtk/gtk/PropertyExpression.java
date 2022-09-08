package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GObject` property value in a `GtkExpression`.
 */
public class PropertyExpression extends Expression {

    public PropertyExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PropertyExpression */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyExpression(gobject.getReference());
    }
    
    /**
     * Creates an expression that looks up a property.
     * 
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     * 
     * If the resulting object conforms to `this_type`, its property named
     * `property_name` will be queried. Otherwise, this expression's
     * evaluation will fail.
     * 
     * The given `this_type` must have a property with `property_name`.
     */
    public PropertyExpression(Type thisType, Expression expression, java.lang.String propertyName) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_property_expression_new(thisType.getValue(), expression.getReference().unowned().HANDLE(), Interop.allocateNativeString(propertyName).HANDLE()), true));
    }
    
    /**
     * Creates an expression that looks up a property.
     * 
     * The object to use is found by evaluating the `expression`,
     * or using the `this` argument when `expression` is `NULL`.
     * 
     * If the resulting object conforms to `this_type`, its
     * property specified by `pspec` will be queried.
     * Otherwise, this expression's evaluation will fail.
     */
    public PropertyExpression(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_property_expression_new_for_pspec(expression.getReference().unowned().HANDLE(), pspec.HANDLE()), true));
    }
    
    /**
     * Gets the expression specifying the object of
     * a property expression.
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_property_expression_get_expression(HANDLE());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GParamSpec` specifying the property of
     * a property expression.
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_property_expression_get_pspec(HANDLE());
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, false));
    }
    
}
