package org.gtk.gtk;

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
    
    static final MethodHandle gtk_string_sorter_new = Interop.downcallHandle(
        "gtk_string_sorter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Expression expression) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_string_sorter_new.invokeExact(expression.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_string_sorter_get_expression = Interop.downcallHandle(
        "gtk_string_sorter_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression that is evaluated to obtain strings from items.
     */
    public Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) gtk_string_sorter_get_expression.invokeExact(handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_sorter_get_ignore_case = Interop.downcallHandle(
        "gtk_string_sorter_get_ignore_case",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the sorter ignores case differences.
     */
    public boolean getIgnoreCase() {
        try {
            var RESULT = (int) gtk_string_sorter_get_ignore_case.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_sorter_set_expression = Interop.downcallHandle(
        "gtk_string_sorter_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * <p>
     * The expression must have the type {@code G_TYPE_STRING}.
     */
    public void setExpression(Expression expression) {
        try {
            gtk_string_sorter_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_sorter_set_ignore_case = Interop.downcallHandle(
        "gtk_string_sorter_set_ignore_case",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the sorter will ignore case differences.
     */
    public void setIgnoreCase(boolean ignoreCase) {
        try {
            gtk_string_sorter_set_ignore_case.invokeExact(handle(), ignoreCase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
