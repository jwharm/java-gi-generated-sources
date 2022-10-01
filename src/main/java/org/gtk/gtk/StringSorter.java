package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStringSorter} is a {@code GtkSorter} that compares strings.
 * <p>
 * It does the comparison in a linguistically correct way using the
 * current locale by normalizing Unicode strings and possibly case-folding
 * them before performing the comparison.
 * <p>
 * To obtain the strings to compare, this sorter evaluates a
 * {@link Expression}.
 */
public class StringSorter extends Sorter {

    public StringSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StringSorter */
    public static StringSorter castFrom(org.gtk.gobject.Object gobject) {
        return new StringSorter(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Expression expression) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_string_sorter_new(expression.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new string sorter that compares items using the given
     * {@code expression}.
     * <p>
     * Unless an expression is set on it, this sorter will always
     * compare items as invalid.
     */
    public StringSorter(Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that is evaluated to obtain strings from items.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_string_sorter_get_expression(handle());
        return new Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the sorter ignores case differences.
     */
    public boolean getIgnoreCase() {
        var RESULT = gtk_h.gtk_string_sorter_get_ignore_case(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * <p>
     * The expression must have the type {@code G_TYPE_STRING}.
     */
    public void setExpression(Expression expression) {
        gtk_h.gtk_string_sorter_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets whether the sorter will ignore case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        gtk_h.gtk_string_sorter_set_ignore_case(handle(), ignoreCase ? 1 : 0);
    }
    
}
