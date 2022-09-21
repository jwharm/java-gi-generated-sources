package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public StringSorter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StringSorter */
    public static StringSorter castFrom(org.gtk.gobject.Object gobject) {
        return new StringSorter(gobject.getReference());
    }
    
    private static Reference constructNew(Expression expression) {
        Reference RESULT = References.get(gtk_h.gtk_string_sorter_new(expression.getReference().unowned().handle()), true);
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
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the sorter ignores case differences.
     */
    public boolean getIgnoreCase() {
        var RESULT = gtk_h.gtk_string_sorter_get_ignore_case(handle());
        return (RESULT != 0);
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
