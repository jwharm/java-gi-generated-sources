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
public class StringFilter extends org.gtk.gtk.Filter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StringFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StringFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to StringFilter if its GType is a (or inherits from) "GtkStringFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StringFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStringFilter", a ClassCastException will be thrown.
     */
    public static StringFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStringFilter"))) {
            return new StringFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStringFilter");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Expression expression) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_filter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new string filter.
     * <p>
     * You will want to set up the filter by providing a string to search for
     * and by providing a property to look up on the item.
     * @param expression The expression to evaluate
     */
    public StringFilter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression), Ownership.FULL);
    }
    
    /**
     * Gets the expression that the string filter uses to
     * obtain strings from items.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_filter_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the filter ignores case differences.
     * @return {@code true} if the filter ignores case
     */
    public boolean getIgnoreCase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_string_filter_get_ignore_case.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the match mode that the filter is using.
     * @return the match mode of the filter
     */
    public @NotNull org.gtk.gtk.StringFilterMatchMode getMatchMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_string_filter_get_match_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StringFilterMatchMode(RESULT);
    }
    
    /**
     * Gets the search term.
     * @return The search term
     */
    public @Nullable java.lang.String getSearch() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_filter_get_search.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the expression that the string filter uses to
     * obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_string_filter_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the filter ignores case differences.
     * @param ignoreCase {@code true} to ignore case
     */
    public void setIgnoreCase(boolean ignoreCase) {
        try {
            DowncallHandles.gtk_string_filter_set_ignore_case.invokeExact(
                    handle(),
                    ignoreCase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the match mode for the filter.
     * @param mode the new match mode
     */
    public void setMatchMode(@NotNull org.gtk.gtk.StringFilterMatchMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_string_filter_set_match_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the string to search for.
     * @param search The string to search for
     *   or {@code null} to clear the search
     */
    public void setSearch(@Nullable java.lang.String search) {
        try {
            DowncallHandles.gtk_string_filter_set_search.invokeExact(
                    handle(),
                    (Addressable) (search == null ? MemoryAddress.NULL : Interop.allocateNativeString(search)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_filter_new = Interop.downcallHandle(
            "gtk_string_filter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_get_expression = Interop.downcallHandle(
            "gtk_string_filter_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_get_ignore_case = Interop.downcallHandle(
            "gtk_string_filter_get_ignore_case",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_get_match_mode = Interop.downcallHandle(
            "gtk_string_filter_get_match_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_get_search = Interop.downcallHandle(
            "gtk_string_filter_get_search",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_set_expression = Interop.downcallHandle(
            "gtk_string_filter_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_filter_set_ignore_case = Interop.downcallHandle(
            "gtk_string_filter_set_ignore_case",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_string_filter_set_match_mode = Interop.downcallHandle(
            "gtk_string_filter_set_match_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_string_filter_set_search = Interop.downcallHandle(
            "gtk_string_filter_set_search",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
