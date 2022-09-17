package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GObject</code> property value in a <code>GtkExpression</code>.
 */
public class PropertyExpression extends Expression {

    public PropertyExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PropertyExpression */
    public static PropertyExpression castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyExpression(gobject.getReference());
    }
    
    private static Reference constructNew(Type thisType, Expression expression, java.lang.String propertyName) {
        Reference RESULT = References.get(gtk_h.gtk_property_expression_new(thisType.getValue(), expression.getReference().unowned().handle(), Interop.allocateNativeString(propertyName).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an expression that looks up a property.
     * <p>
     * The object to use is found by evaluating the <code>expression</code>,
     * or using the <code>this</code> argument when <code>expression</code> is <code>NULL</code>.
     * <p>
     * If the resulting object conforms to <code>this_type</code>, its property named<code>property_name</code> will be queried. Otherwise, this expression&#39;s
     * evaluation will fail.
     * <p>
     * The given <code>this_type</code> must have a property with <code>property_name</code>.
     */
    public PropertyExpression(Type thisType, Expression expression, java.lang.String propertyName) {
        super(constructNew(thisType, expression, propertyName));
    }
    
    private static Reference constructNewForPspec(Expression expression, org.gtk.gobject.ParamSpec pspec) {
        Reference RESULT = References.get(gtk_h.gtk_property_expression_new_for_pspec(expression.getReference().unowned().handle(), pspec.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an expression that looks up a property.
     * <p>
     * The object to use is found by evaluating the <code>expression</code>,
     * or using the <code>this</code> argument when <code>expression</code> is <code>NULL</code>.
     * <p>
     * If the resulting object conforms to <code>this_type</code>, its
     * property specified by <code>pspec</code> will be queried.
     * Otherwise, this expression&#39;s evaluation will fail.
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
     * Gets the <code>GParamSpec</code> specifying the property of
     * a property expression.
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        var RESULT = gtk_h.gtk_property_expression_get_pspec(handle());
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, false));
    }
    
}
