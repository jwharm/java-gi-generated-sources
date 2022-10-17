package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_string_filter_new = Interop.downcallHandle(
        "gtk_string_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable Expression expression) {
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
    public StringFilter(@Nullable Expression expression) {
        super(constructNew(expression));
    }
    
    private static final MethodHandle gtk_string_filter_get_expression = Interop.downcallHandle(
        "gtk_string_filter_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression that the string filter uses to
     * obtain strings from items.
     */
    public @Nullable Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_string_filter_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Expression(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_string_filter_get_ignore_case = Interop.downcallHandle(
        "gtk_string_filter_get_ignore_case",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the filter ignores case differences.
     */
    public boolean getIgnoreCase() {
        int RESULT;
        try {
            RESULT = (int) gtk_string_filter_get_ignore_case.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_string_filter_get_match_mode = Interop.downcallHandle(
        "gtk_string_filter_get_match_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the match mode that the filter is using.
     */
    public @NotNull StringFilterMatchMode getMatchMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_string_filter_get_match_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StringFilterMatchMode(RESULT);
    }
    
    private static final MethodHandle gtk_string_filter_get_search = Interop.downcallHandle(
        "gtk_string_filter_get_search",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the search term.
     */
    public @Nullable java.lang.String getSearch() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_string_filter_get_search.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_string_filter_set_expression = Interop.downcallHandle(
        "gtk_string_filter_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that the string filter uses to
     * obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     */
    public @NotNull void setExpression(@Nullable Expression expression) {
        try {
            gtk_string_filter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_string_filter_set_ignore_case = Interop.downcallHandle(
        "gtk_string_filter_set_ignore_case",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the filter ignores case differences.
     */
    public @NotNull void setIgnoreCase(@NotNull boolean ignoreCase) {
        try {
            gtk_string_filter_set_ignore_case.invokeExact(handle(), ignoreCase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_string_filter_set_match_mode = Interop.downcallHandle(
        "gtk_string_filter_set_match_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the match mode for the filter.
     */
    public @NotNull void setMatchMode(@NotNull StringFilterMatchMode mode) {
        try {
            gtk_string_filter_set_match_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_string_filter_set_search = Interop.downcallHandle(
        "gtk_string_filter_set_search",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the string to search for.
     */
    public @NotNull void setSearch(@Nullable java.lang.String search) {
        try {
            gtk_string_filter_set_search.invokeExact(handle(), Interop.allocateNativeString(search));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
