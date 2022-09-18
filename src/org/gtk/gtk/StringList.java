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
 * The objects in the model have a &<code>#34</code> string&<code>#34</code>  property.
 * <p><code>GtkStringList</code> is well-suited for any place where you would
 * typically use a <code>char*{@link []}</code>, but need a list model.
 * <p>
 * <h1>GtkStringList as GtkBuildable</h1>
 * <p>
 * The <code>GtkStringList</code> implementation of the <code>GtkBuildable</code> interface
 * supports adding items directly using the &<code>#60</code> items&<code>#62</code>  element and
 * specifying &<code>#60</code> item&<code>#62</code>  elements for each item. Each &<code>#60</code> item&<code>#62</code>  element
 * supports the regular translation attributes &<code>#8220</code> translatable&<code>#8221</code> ,
 * &<code>#8220</code> context&<code>#8221</code>  and &<code>#8220</code> comments&<code>#8221</code> .
 * <p>
 * Here is a UI definition fragment specifying a <code>GtkStringList</code>
 * <p><pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkStringList&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> items&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code> &<code>#62</code> Factory&<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code> &<code>#62</code> Home&<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code> &<code>#62</code> Subway&<code>#60</code> /item&<code>#62</code> 
 *   &<code>#60</code> /items&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
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
     * {@link org.gtk.gtk.StringList<code>#take</code>  for a way to avoid that.
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
     * This function is more efficient than {@link org.gtk.gtk.StringList<code>#append</code> 
     * and {@link org.gtk.gtk.StringList<code>#remove</code> , because it only emits the
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
     * This variant of {@link org.gtk.gtk.StringList<code>#append</code> 
     * is convenient for formatting strings:
     * <p><pre>c
     * gtk_string_list_take (self, g_strdup_print (&<code>#34</code> <code>d</code> dollars&<code>#34</code> , lots));
     * </pre>
     */
    public void take(java.lang.String string) {
        gtk_h.gtk_string_list_take(handle(), Interop.allocateNativeString(string).handle());
    }
    
}
