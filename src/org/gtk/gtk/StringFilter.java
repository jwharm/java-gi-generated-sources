package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStringFilter} determines whether to include items by comparing
 * strings to a fixed search term.
 * <p>
 * The strings are obtained from the items by evaluating a {@code GtkExpression}
 * set with {@link StringFilter#setExpression}, and they are
 * compared against a search term set with {@link StringFilter#setSearch}.
 * <p>
 * {@code GtkStringFilter} has several different modes of comparison - it
 * can match the whole string, just a prefix, or any substring. Use
 * {@link StringFilter#setMatchMode} choose a mode.
 * <p>
 * It is also possible to make case-insensitive comparisons, with
 * {@link StringFilter#setIgnoreCase}.
 */
public class StringFilter extends Filter {

    public StringFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StringFilter */
    public static StringFilter castFrom(org.gtk.gobject.Object gobject) {
        return new StringFilter(gobject.getReference());
    }
    
    private static Reference constructNew(Expression expression) {
        Reference RESULT = References.get(gtk_h.gtk_string_filter_new(expression.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new string filter.
     * <p>
     * You will want to set up the filter by providing a string to search for
     * and by providing a property to look up on the item.
     */
    public StringFilter(Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that the string filter uses to
     * obtain strings from items.
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_string_filter_get_expression(handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the filter ignores case differences.
     */
    public boolean getIgnoreCase() {
        var RESULT = gtk_h.gtk_string_filter_get_ignore_case(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the match mode that the filter is using.
     */
    public StringFilterMatchMode getMatchMode() {
        var RESULT = gtk_h.gtk_string_filter_get_match_mode(handle());
        return new StringFilterMatchMode(RESULT);
    }
    
    /**
     * Gets the search term.
     */
    public java.lang.String getSearch() {
        var RESULT = gtk_h.gtk_string_filter_get_search(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the expression that the string filter uses to
     * obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     */
    public void setExpression(Expression expression) {
        gtk_h.gtk_string_filter_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets whether the filter ignores case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        gtk_h.gtk_string_filter_set_ignore_case(handle(), ignoreCase ? 1 : 0);
    }
    
    /**
     * Sets the match mode for the filter.
     */
    public void setMatchMode(StringFilterMatchMode mode) {
        gtk_h.gtk_string_filter_set_match_mode(handle(), mode.getValue());
    }
    
    /**
     * Sets the string to search for.
     */
    public void setSearch(java.lang.String search) {
        gtk_h.gtk_string_filter_set_search(handle(), Interop.allocateNativeString(search).handle());
    }
    
}
