package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBoolFilter` evaluates a boolean `GtkExpression`
 * to determine whether to include items.
 */
public class BoolFilter extends Filter {

    public BoolFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BoolFilter */
    public static BoolFilter castFrom(org.gtk.gobject.Object gobject) {
        return new BoolFilter(gobject.getReference());
    }
    
    private static Reference constructNew(Expression expression) {
        Reference RESULT = References.get(gtk_h.gtk_bool_filter_new(expression.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new bool filter.
     */
    public BoolFilter(Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that the filter uses to evaluate if
     * an item should be filtered.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_bool_filter_get_expression(handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the filter inverts the expression.
     */
    public boolean getInvert() {
        var RESULT = gtk_h.gtk_bool_filter_get_invert(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the expression that the filter uses to check if items
     * should be filtered.
     * 
     * The expression must have a value type of %G_TYPE_BOOLEAN.
     */
    public void setExpression(Expression expression) {
        gtk_h.gtk_bool_filter_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets whether the filter should invert the expression.
     */
    public void setInvert(boolean invert) {
        gtk_h.gtk_bool_filter_set_invert(handle(), invert ? 1 : 0);
    }
    
}
