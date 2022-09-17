package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkStringList</code> is a list model that wraps an array of strings.
 * <p>
 * The objects in the model have a &#34;string&#34; property.
 * <p><code>GtkStringList</code> is well-suited for any place where you would
 * typically use a <code>char*{@link []}</code>, but need a list model.
 * <p>
 * <h1>tkStringList as GtkBuildable</h1>
 * <p>
 * The <code>GtkStringList</code> implementation of the <code>GtkBuildable</code> interface
 * supports adding items directly using the &#60;items&#62; element and
 * specifying &#60;item&#62; elements for each item. Each &#60;item&#62; element
 * supports the regular translation attributes &#8220;translatable&#8221;,
 * &#8220;context&#8221; and &#8220;comments&#8221;.
 * <p>
 * Here is a UI definition fragment specifying a <code>GtkStringList</code>
 * <p><pre>xml
 * &#60;object class=&#34;GtkStringList&#34;&#62;
 *   &#60;items&#62;
 *     &#60;item translatable=&#34;yes&#34;&#62;Factory&#60;/item&#62;
 *     &#60;item translatable=&#34;yes&#34;&#62;Home&#60;/item&#62;
 *     &#60;item translatable=&#34;yes&#34;&#62;Subway&#60;/item&#62;
 *   &#60;/items&#62;
 * &#60;/object&#62;
 * </pre>
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
     * Creates a new <code>GtkStringList</code> with the given @strings.
     */
    public StringList(java.lang.String[] strings) {
        super(constructNew(strings));
    }
    
    /**
     * Appends @string to @self.
     * 
     * The @string will be copied. See
     * {@link org.gtk.gtk.StringList#take} for a way to avoid that.
     */
    public void append(java.lang.String string) {
        gtk_h.gtk_string_list_append(handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Gets the string that is at @position in @self.
     * 
     * If @self does not contain @position items, <code>null</code> is returned.
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
     * This function is more efficient than {@link org.gtk.gtk.StringList#append}
     * and {@link org.gtk.gtk.StringList#remove}, because it only emits the
     * ::items-changed signal once for the change.
     * 
     * This function copies the strings in @additions.
     * 
     * The parameters @position and @n_removals must be correct (ie:
     * @position + @n_removals must be less than or equal to the length
     * of the list at the time this function is called).
     */
    public void splice(int position, int nRemovals, java.lang.String[] additions) {
        gtk_h.gtk_string_list_splice(handle(), position, nRemovals, Interop.allocateNativeArray(additions).handle());
    }
    
    /**
     * Adds @string to self at the end, and takes
     * ownership of it.
     * <p>
     * This variant of {@link org.gtk.gtk.StringList#append}
     * is convenient for formatting strings:
     * <p><pre>c
     * gtk_string_list_take (self, g_strdup_print (&#34;<code>d</code> dollars&#34;, lots));
     * </pre>
     */
    public void take(java.lang.String string) {
        gtk_h.gtk_string_list_take(handle(), Interop.allocateNativeString(string).handle());
    }
    
}
