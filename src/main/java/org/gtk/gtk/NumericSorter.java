package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkNumericSorter} is a {@code GtkSorter} that compares numbers.
 * <p>
 * To obtain the numbers to compare, this sorter evaluates a
 * {@link Expression}.
 */
public class NumericSorter extends Sorter {

    public NumericSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NumericSorter */
    public static NumericSorter castFrom(org.gtk.gobject.Object gobject) {
        return new NumericSorter(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Expression expression) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_numeric_sorter_new(expression.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new numeric sorter using the given {@code expression}.
     * <p>
     * Smaller numbers will be sorted first. You can call
     * {@link NumericSorter#setSortOrder} to change this.
     */
    public NumericSorter(Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_numeric_sorter_get_expression(handle());
        return new Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether this sorter will sort smaller numbers first.
     */
    public SortType getSortOrder() {
        var RESULT = gtk_h.gtk_numeric_sorter_get_sort_order(handle());
        return new SortType(RESULT);
    }
    
    /**
     * Sets the expression that is evaluated to obtain numbers from items.
     * <p>
     * Unless an expression is set on {@code self}, the sorter will always
     * compare items as invalid.
     * <p>
     * The expression must have a return type that can be compared
     * numerically, such as {@code G_TYPE_INT} or {@code G_TYPE_DOUBLE}.
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
