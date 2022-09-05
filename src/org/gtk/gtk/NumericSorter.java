package org.gtk.gtk;

import org.gtk.gobject.*;
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

    public NumericSorter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NumericSorter */
    public static NumericSorter castFrom(org.gtk.gobject.Object gobject) {
        return new NumericSorter(gobject.getProxy());
    }
    
    /**
     * Creates a new numeric sorter using the given @expression.
     * 
     * Smaller numbers will be sorted first. You can call
     * [method@Gtk.NumericSorter.set_sort_order] to change this.
     */
    public NumericSorter(Expression expression) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_numeric_sorter_new(expression.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_numeric_sorter_get_expression(HANDLE());
        return new Expression(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     */
    public SortType getSortOrder() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_numeric_sorter_get_sort_order(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_numeric_sorter_set_expression(HANDLE(), expression.HANDLE());
    }
    
    /**
     * Sets whether to sort smaller numbers before larger ones.
     */
    public void setSortOrder(SortType sortOrder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_numeric_sorter_set_sort_order(HANDLE(), sortOrder.getValue());
    }
    
}
