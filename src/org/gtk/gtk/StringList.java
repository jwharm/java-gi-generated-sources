package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStringList` is a list model that wraps an array of strings.
 * 
 * The objects in the model have a "string" property.
 * 
 * `GtkStringList` is well-suited for any place where you would
 * typically use a `char*[]`, but need a list model.
 * 
 * # GtkStringList as GtkBuildable
 * 
 * The `GtkStringList` implementation of the `GtkBuildable` interface
 * supports adding items directly using the <items> element and
 * specifying <item> elements for each item. Each <item> element
 * supports the regular translation attributes “translatable”,
 * “context” and “comments”.
 * 
 * Here is a UI definition fragment specifying a `GtkStringList`
 * 
 * ```xml
 * <object class="GtkStringList">
 *   <items>
 *     <item translatable="yes">Factory</item>
 *     <item translatable="yes">Home</item>
 *     <item translatable="yes">Subway</item>
 *   </items>
 * </object>
 * ```
 */
public class StringList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, Buildable {

    public StringList(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StringList */
    public static StringList castFrom(org.gtk.gobject.Object gobject) {
        return new StringList(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkStringList` with the given @strings.
     */
    public StringList(java.lang.String[] strings) {
        super(References.get(gtk_h.gtk_string_list_new(Interop.allocateNativeArray(strings)), true));
    }
    
    /**
     * Appends @string to @self.
     * 
     * The @string will be copied. See
     * [method@Gtk.StringList.take] for a way to avoid that.
     */
    public void append(java.lang.String string) {
        gtk_h.gtk_string_list_append(handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Gets the string that is at @position in @self.
     * 
     * If @self does not contain @position items, %NULL is returned.
     * 
     * This function returns the const char *. To get the
     * object wrapping it, use g_list_model_get_item().
     */
    public java.lang.String getString(int position) {
        var RESULT = gtk_h.gtk_string_list_get_string(handle(), position);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes the string at @position from @self.
     * 
     * @position must be smaller than the current
     * length of the list.
     */
    public void remove(int position) {
        gtk_h.gtk_string_list_remove(handle(), position);
    }
    
    /**
     * Changes @self by removing @n_removals strings and adding @additions
     * to it.
     * 
     * This function is more efficient than [method@Gtk.StringList.append]
     * and [method@Gtk.StringList.remove], because it only emits the
     * ::items-changed signal once for the change.
     * 
     * This function copies the strings in @additions.
     * 
     * The parameters @position and @n_removals must be correct (ie:
     * @position + @n_removals must be less than or equal to the length
     * of the list at the time this function is called).
     */
    public void splice(int position, int nRemovals, java.lang.String[] additions) {
        gtk_h.gtk_string_list_splice(handle(), position, nRemovals, Interop.allocateNativeArray(additions));
    }
    
    /**
     * Adds @string to self at the end, and takes
     * ownership of it.
     * 
     * This variant of [method@Gtk.StringList.append]
     * is convenient for formatting strings:
     * 
     * ```c
     * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
     * ```
     */
    public void take(java.lang.String string) {
        gtk_h.gtk_string_list_take(handle(), Interop.allocateNativeString(string).handle());
    }
    
}
