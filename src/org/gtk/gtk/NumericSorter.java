package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkNumericSorter` is a `GtkSorter` that compares numbers.
 * 
 * To obtain the numbers to compare, this sorter evaluates a
 * [class@Gtk.Expression].
 */
public class NumericSorter extends Sorter {

    public NumericSorter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NumericSorter */
    public static NumericSorter castFrom(org.gtk.gobject.Object gobject) {
        return new NumericSorter(gobject.getReference());
    }
    
    /**
     * Creates a new numeric sorter using the given @expression.
     * 
     * Smaller numbers will be sorted first. You can call
     * [method@Gtk.NumericSorter.set_sort_order] to change this.
     */
    public NumericSorter(Expression expression) {
        super(References.get(gtk_h.gtk_numeric_sorter_new(expression.getReference().unowned().handle()), true));
    }
    
    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_numeric_sorter_get_expression(handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     */
    public SortType getSortOrder() {
        var RESULT = gtk_h.gtk_numeric_sorter_get_sort_order(handle());
        return SortType.fromValue(RESULT);
    }
    
    /**
     * Sets the expression that is evaluated to obtain numbers from items.
     * 
     * Unless an expression is set on @self, the sorter will always
     * compare items as invalid.
     * 
     * The expression must have a return type that can be compared
     * numerically, such as %G_TYPE_INT or %G_TYPE_DOUBLE.
     */
    public void setExpression(Expression expression) {
        gtk_h.gtk_numeric_sorter_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets whether to sort smaller numbers before larger ones.
     */
    public void setSortOrder(SortType sortOrder) {
        gtk_h.gtk_numeric_sorter_set_sort_order(handle(), sortOrder.getValue());
    }
    
}
