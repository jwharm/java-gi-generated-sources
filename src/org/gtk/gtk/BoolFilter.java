package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBoolFilter` evaluates a boolean `GtkExpression`
 * to determine whether to include items.
 */
public class BoolFilter extends Filter {

    public BoolFilter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BoolFilter */
    public static BoolFilter castFrom(org.gtk.gobject.Object gobject) {
        return new BoolFilter(gobject.getProxy());
    }
    
    /**
     * Creates a new bool filter.
     */
    public BoolFilter(Expression expression) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bool_filter_new(expression.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bool_filter_get_expression(HANDLE());
        return new Expression(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the filter inverts the expression.
     */
    public boolean getInvert() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bool_filter_get_invert(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     * 
     * The expression must have a value type of %G_TYPE_BOOLEAN.
     */
    public void setExpression(Expression expression) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bool_filter_set_expression(HANDLE(), expression.HANDLE());
    }
    
    /**
     * Sets whether the filter should invert the expression.
     */
    public void setInvert(boolean invert) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bool_filter_set_invert(HANDLE(), invert ? 1 : 0);
    }
    
}
