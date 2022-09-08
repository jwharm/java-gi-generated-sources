package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GStrvBuilder is a method of easily building dynamically sized
 * NULL-terminated string arrays.
 * 
 * The following example shows how to build a two element array:
 * 
 * |[<!-- language="C" -->
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, "hello");
 *   g_strv_builder_add (builder, "world");
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * ]|
 */
public class StrvBuilder extends io.github.jwharm.javagi.interop.ResourceBase {

    public StrvBuilder(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Add a string to the end of the array.
     * 
     * Since 2.68
     */
    public void add(java.lang.String value) {
        gtk_h.g_strv_builder_add(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Appends all the strings in the given vector to the builder.
     * 
     * Since 2.70
     */
    public void addv(java.lang.String[] value) {
        gtk_h.g_strv_builder_addv(handle(), Interop.allocateNativeArray(value).handle());
    }
    
    /**
     * Atomically increments the reference count of @builder by one.
     * This function is thread-safe and may be called from any thread.
     */
    public StrvBuilder ref() {
        var RESULT = gtk_h.g_strv_builder_ref(handle());
        return new StrvBuilder(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on @builder.
     * 
     * In the event that there are no more references, releases all memory
     * associated with the #GStrvBuilder.
     */
    public void unref() {
        gtk_h.g_strv_builder_unref(handle());
    }
    
}
