package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStringSorter` is a `GtkSorter` that compares strings.
 * 
 * It does the comparison in a linguistically correct way using the
 * current locale by normalizing Unicode strings and possibly case-folding
 * them before performing the comparison.
 * 
 * To obtain the strings to compare, this sorter evaluates a
 * [class@Gtk.Expression].
 */
public class StringSorter extends Sorter {

    public StringSorter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StringSorter */
    public static StringSorter castFrom(org.gtk.gobject.Object gobject) {
        return new StringSorter(gobject.getProxy());
    }
    
    /**
     * Creates a new string sorter that compares items using the given
     * @expression.
     * 
     * Unless an expression is set on it, this sorter will always
     * compare items as invalid.
     */
    public StringSorter(Expression expression) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_sorter_new(expression.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the expression that is evaluated to obtain strings from items.
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_sorter_get_expression(HANDLE());
        return new Expression(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets whether the sorter ignores case differences.
     */
    public boolean getIgnoreCase() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_sorter_get_ignore_case(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * 
     * The expression must have the type %G_TYPE_STRING.
     */
    public void setExpression(Expression expression) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_sorter_set_expression(HANDLE(), expression.HANDLE());
    }
    
    /**
     * Sets whether the sorter will ignore case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_sorter_set_ignore_case(HANDLE(), ignoreCase ? 1 : 0);
    }
    
}
