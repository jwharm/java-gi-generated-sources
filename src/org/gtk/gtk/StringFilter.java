package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStringFilter` determines whether to include items by comparing
 * strings to a fixed search term.
 * 
 * The strings are obtained from the items by evaluating a `GtkExpression`
 * set with [method@Gtk.StringFilter.set_expression], and they are
 * compared against a search term set with [method@Gtk.StringFilter.set_search].
 * 
 * `GtkStringFilter` has several different modes of comparison - it
 * can match the whole string, just a prefix, or any substring. Use
 * [method@Gtk.StringFilter.set_match_mode] choose a mode.
 * 
 * It is also possible to make case-insensitive comparisons, with
 * [method@Gtk.StringFilter.set_ignore_case].
 */
public class StringFilter extends Filter {

    public StringFilter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StringFilter */
    public static StringFilter castFrom(org.gtk.gobject.Object gobject) {
        return new StringFilter(gobject.getProxy());
    }
    
    /**
     * Creates a new string filter.
     * 
     * You will want to set up the filter by providing a string to search for
     * and by providing a property to look up on the item.
     */
    public StringFilter(Expression expression) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_new(expression.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the expression that the string filter uses to
     * obtain strings from items.
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_get_expression(HANDLE());
        return new Expression(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the filter ignores case differences.
     */
    public boolean getIgnoreCase() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_get_ignore_case(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the match mode that the filter is using.
     */
    public StringFilterMatchMode getMatchMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_get_match_mode(HANDLE());
        return StringFilterMatchMode.fromValue(RESULT);
    }
    
    /**
     * Gets the search term.
     */
    public java.lang.String getSearch() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_get_search(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the expression that the string filter uses to
     * obtain strings from items.
     * 
     * The expression must have a value type of %G_TYPE_STRING.
     */
    public void setExpression(Expression expression) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_set_expression(HANDLE(), expression.HANDLE());
    }
    
    /**
     * Sets whether the filter ignores case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_set_ignore_case(HANDLE(), ignoreCase ? 1 : 0);
    }
    
    /**
     * Sets the match mode for the filter.
     */
    public void setMatchMode(StringFilterMatchMode mode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_set_match_mode(HANDLE(), mode.getValue());
    }
    
    /**
     * Sets the string to search for.
     */
    public void setSearch(java.lang.String search) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_filter_set_search(HANDLE(), Interop.getAllocator().allocateUtf8String(search));
    }
    
}
