package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStringList} is a list model that wraps an array of strings.
 * <p>
 * The objects in the model have a "string" property.
 * <p>
 * {@code GtkStringList} is well-suited for any place where you would
 * typically use a {@code char*[]}, but need a list model.
 * <p>
 * <h1>GtkStringList as GtkBuildable</h1>
 * <p>
 * The {@code GtkStringList} implementation of the {@code GtkBuildable} interface
 * supports adding items directly using the &lt;items&gt; element and
 * specifying &lt;item> elements for each item. Each <item&gt; element
 * supports the regular translation attributes “translatable”,
 * “context” and “comments”.
 * <p>
 * Here is a UI definition fragment specifying a {@code GtkStringList}
 * <p>
 * <pre>{@code xml
 * <object class="GtkStringList">
 *   <items>
 *     <item translatable="yes">Factory</item>
 *     <item translatable="yes">Home</item>
 *     <item translatable="yes">Subway</item>
 *   </items>
 * </object>
 * }</pre>
 */
public class StringList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, Buildable {

    public StringList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StringList */
    public static StringList castFrom(org.gtk.gobject.Object gobject) {
        return new StringList(gobject.refcounted());
    }
    
    static final MethodHandle gtk_string_list_new = Interop.downcallHandle(
        "gtk_string_list_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String[] strings) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_string_list_new.invokeExact(Interop.allocateNativeArray(strings).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkStringList} with the given {@code strings}.
     */
    public StringList(java.lang.String[] strings) {
        super(constructNew(strings));
    }
    
    static final MethodHandle gtk_string_list_append = Interop.downcallHandle(
        "gtk_string_list_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code string} to {@code self}.
     * <p>
     * The {@code string} will be copied. See
     * {@link StringList#take} for a way to avoid that.
     */
    public void append(java.lang.String string) {
        try {
            gtk_string_list_append.invokeExact(handle(), Interop.allocateNativeString(string).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_list_get_string = Interop.downcallHandle(
        "gtk_string_list_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the string that is at {@code position} in {@code self}.
     * <p>
     * If {@code self} does not contain {@code position} items, {@code null} is returned.
     * <p>
     * This function returns the const char *. To get the
     * object wrapping it, use g_list_model_get_item().
     */
    public java.lang.String getString(int position) {
        try {
            var RESULT = (MemoryAddress) gtk_string_list_get_string.invokeExact(handle(), position);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_list_remove = Interop.downcallHandle(
        "gtk_string_list_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the string at {@code position} from {@code self}.
     * <p>
     * {@code position} must be smaller than the current
     * length of the list.
     */
    public void remove(int position) {
        try {
            gtk_string_list_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_list_splice = Interop.downcallHandle(
        "gtk_string_list_splice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes {@code self} by removing {@code n_removals} strings and adding {@code additions}
     * to it.
     * <p>
     * This function is more efficient than {@link StringList#append}
     * and {@link StringList#remove}, because it only emits the
     * ::items-changed signal once for the change.
     * <p>
     * This function copies the strings in {@code additions}.
     * <p>
     * The parameters {@code position} and {@code n_removals} must be correct (ie:
     * {@code position} + {@code n_removals} must be less than or equal to the length
     * of the list at the time this function is called).
     */
    public void splice(int position, int nRemovals, java.lang.String[] additions) {
        try {
            gtk_string_list_splice.invokeExact(handle(), position, nRemovals, Interop.allocateNativeArray(additions).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_string_list_take = Interop.downcallHandle(
        "gtk_string_list_take",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code string} to self at the end, and takes
     * ownership of it.
     * <p>
     * This variant of {@link StringList#append}
     * is convenient for formatting strings:
     * <p>
     * <pre>{@code c
     * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
     * }</pre>
     */
    public void take(java.lang.String string) {
        try {
            gtk_string_list_take.invokeExact(handle(), Interop.allocateNativeString(string).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}