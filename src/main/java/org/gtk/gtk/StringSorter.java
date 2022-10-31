package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class StringSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public StringSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to StringSorter if its GType is a (or inherits from) "GtkStringSorter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "StringSorter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStringSorter", a ClassCastException will be thrown.
     */
    public static StringSorter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStringSorter"))) {
            return new StringSorter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStringSorter");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Expression expression) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_string_sorter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.refcounted().unowned().handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new string sorter that compares items using the given
     * {@code expression}.
     * <p>
     * Unless an expression is set on it, this sorter will always
     * compare items as invalid.
     * @param expression The expression to evaluate
     */
    public StringSorter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression));
    }
    
    /**
     * Gets the expression that is evaluated to obtain strings from items.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_sorter_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the sorter ignores case differences.
     * @return {@code true} if {@code self} is ignoring case differences
     */
    public boolean getIgnoreCase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_string_sorter_get_ignore_case.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * <p>
     * The expression must have the type {@code G_TYPE_STRING}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_string_sorter_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the sorter will ignore case differences.
     * @param ignoreCase {@code true} to ignore case differences
     */
    public void setIgnoreCase(boolean ignoreCase) {
        try {
            DowncallHandles.gtk_string_sorter_set_ignore_case.invokeExact(
                    handle(),
                    ignoreCase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_sorter_new = Interop.downcallHandle(
            "gtk_string_sorter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_string_sorter_get_expression = Interop.downcallHandle(
            "gtk_string_sorter_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_string_sorter_get_ignore_case = Interop.downcallHandle(
            "gtk_string_sorter_get_ignore_case",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_string_sorter_set_expression = Interop.downcallHandle(
            "gtk_string_sorter_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_string_sorter_set_ignore_case = Interop.downcallHandle(
            "gtk_string_sorter_set_ignore_case",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
