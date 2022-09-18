package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.glib.StrvBuilder} is a method of easily building dynamically sized
 * NULL-terminated string arrays.
 * 
 * The following example shows how to build a two element array:
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, &<code>#34</code> hello&<code>#34</code> );
 *   g_strv_builder_add (builder, &<code>#34</code> world&<code>#34</code> );
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * ]}|
 */
public class StrvBuilder extends io.github.jwharm.javagi.ResourceBase {

    public StrvBuilder(io.github.jwharm.javagi.Reference reference) {
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
     * associated with the {@link org.gtk.glib.StrvBuilder}
     */
    public void unref() {
        gtk_h.g_strv_builder_unref(handle());
    }
    
    /**
     * Creates a new {@link org.gtk.glib.StrvBuilder} with a reference count of 1.
     * Use g_strv_builder_unref() on the returned value when no longer needed.
     */
    public static StrvBuilder new_() {
        var RESULT = gtk_h.g_strv_builder_new();
        return new StrvBuilder(References.get(RESULT, true));
    }
    
}
