package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GObject} property value in a {@code GtkExpression}.
 */
public class PropertyExpression extends Expression {

    public PropertyExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PropertyExpression */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyExpression(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gobject.Type thisType, Expression expression, java.lang.String propertyName) {
        Reference RESULT = References.get(gtk_h.gtk_property_expression_new(thisType.getValue(), expression.getReference().unowned().handle(), Interop.allocateNativeString(propertyName).handle()), true);
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
     */
    public PropertyExpression(org.gtk.gobject.Type thisType, Expression expression, java.lang.String propertyName) {
        super(constructNew(thisType, expression, propertyName));
    }
    
    private static Reference constructNewForPspec(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        Reference RESULT = References.get(gtk_h.gtk_property_expression_new_for_pspec(expression.getReference().unowned().handle(), pspec.handle()), true);
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
     */
    public static PropertyExpression newForPspec(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        return new PropertyExpression(constructNewForPspec(expression, pspec));
    }
    
    /**
     * Gets the expression specifying the object of
     * a property expression.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_property_expression_get_expression(handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GParamSpec} specifying the property of
     * a property expression.
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        var RESULT = gtk_h.gtk_property_expression_get_pspec(handle());
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, false));
    }
    
}
