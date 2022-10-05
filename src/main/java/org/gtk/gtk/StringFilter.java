package org.gtk.gtk;

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

    public StringFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StringFilter */
    public static StringFilter castFrom(org.gtk.gobject.Object gobject) {
        return new StringFilter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_string_filter_new = Interop.downcallHandle(
        "gtk_string_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Expression expression) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_string_filter_new.invokeExact(expression.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_string_filter_get_expression = Interop.downcallHandle(
        "gtk_string_filter_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression that the string filter uses to
     * obtain strings from items.
     */
    public Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) gtk_string_filter_get_expression.invokeExact(handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_get_ignore_case = Interop.downcallHandle(
        "gtk_string_filter_get_ignore_case",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the filter ignores case differences.
     */
    public boolean getIgnoreCase() {
        try {
            var RESULT = (int) gtk_string_filter_get_ignore_case.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_get_match_mode = Interop.downcallHandle(
        "gtk_string_filter_get_match_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the match mode that the filter is using.
     */
    public StringFilterMatchMode getMatchMode() {
        try {
            var RESULT = (int) gtk_string_filter_get_match_mode.invokeExact(handle());
            return new StringFilterMatchMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_get_search = Interop.downcallHandle(
        "gtk_string_filter_get_search",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the search term.
     */
    public java.lang.String getSearch() {
        try {
            var RESULT = (MemoryAddress) gtk_string_filter_get_search.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_set_expression = Interop.downcallHandle(
        "gtk_string_filter_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that the string filter uses to
     * obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     */
    public void setExpression(Expression expression) {
        try {
            gtk_string_filter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_set_ignore_case = Interop.downcallHandle(
        "gtk_string_filter_set_ignore_case",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the filter ignores case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        try {
            gtk_string_filter_set_ignore_case.invokeExact(handle(), ignoreCase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_set_match_mode = Interop.downcallHandle(
        "gtk_string_filter_set_match_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the match mode for the filter.
     */
    public void setMatchMode(StringFilterMatchMode mode) {
        try {
            gtk_string_filter_set_match_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_filter_set_search = Interop.downcallHandle(
        "gtk_string_filter_set_search",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the string to search for.
     */
    public void setSearch(java.lang.String search) {
        try {
            gtk_string_filter_set_search.invokeExact(handle(), Interop.allocateNativeString(search).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
