package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public StringList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StringList */
    public static StringList castFrom(org.gtk.gobject.Object gobject) {
        return new StringList(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String[] strings) {
        Reference RESULT = References.get(gtk_h.gtk_string_list_new(Interop.allocateNativeArray(strings).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkStringList} with the given {@code strings}.
     */
    public StringList(java.lang.String[] strings) {
        super(constructNew(strings));
    }
    
    /**
     * Appends {@code string} to {@code self}.
     * <p>
     * The {@code string} will be copied. See
     * {@link StringList#take} for a way to avoid that.
     */
    public void append(java.lang.String string) {
        gtk_h.gtk_string_list_append(handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Gets the string that is at {@code position} in {@code self}.
     * <p>
     * If {@code self} does not contain {@code position} items, <code>null</code> is returned.
     * <p>
     * This function returns the const char *. To get the
     * object wrapping it, use g_list_model_get_item().
     */
    public java.lang.String getString(int position) {
        var RESULT = gtk_h.gtk_string_list_get_string(handle(), position);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes the string at {@code position} from {@code self}.
     * <p>
     * {@code position} must be smaller than the current
     * length of the list.
     */
    public void remove(int position) {
        gtk_h.gtk_string_list_remove(handle(), position);
    }
    
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
        gtk_h.gtk_string_list_splice(handle(), position, nRemovals, Interop.allocateNativeArray(additions).handle());
    }
    
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
        gtk_h.gtk_string_list_take(handle(), Interop.allocateNativeString(string).handle());
    }
    
}
