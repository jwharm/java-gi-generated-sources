package org.gtk.glib;

import org.gtk.gobject.*;
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

    public StrvBuilder(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Add a string to the end of the array.
     * 
     * Since 2.68
     */
    public void add(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_strv_builder_add(HANDLE(), Interop.getAllocator().allocateUtf8String(value));
    }
    
    /**
     * Appends all the strings in the given vector to the builder.
     * 
     * Since 2.70
     */
    public void addv(java.lang.String[] value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_strv_builder_addv(HANDLE(), Interop.allocateNativeArray(value));
    }
    
    /**
     * Atomically increments the reference count of @builder by one.
     * This function is thread-safe and may be called from any thread.
     */
    public StrvBuilder ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_strv_builder_ref(HANDLE());
        return new StrvBuilder(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Decreases the reference count on @builder.
     * 
     * In the event that there are no more references, releases all memory
     * associated with the #GStrvBuilder.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_strv_builder_unref(HANDLE());
    }
    
}
