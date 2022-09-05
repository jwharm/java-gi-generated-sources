package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GVariantIter is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class VariantIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public VariantIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new heap-allocated #GVariantIter to iterate over the
     * container that was being iterated over by @iter.  Iteration begins on
     * the new iterator from the current position of the old iterator but
     * the two copies are independent past that point.
     * 
     * Use g_variant_iter_free() to free the return value when you no longer
     * need it.
     * 
     * A reference is taken to the container that @iter is iterating over
     * and will be related only when g_variant_iter_free() is called.
     */
    public VariantIter copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_copy(HANDLE());
        return new VariantIter(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Frees a heap-allocated #GVariantIter.  Only call this function on
     * iterators that were returned by g_variant_iter_new() or
     * g_variant_iter_copy().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_free(HANDLE());
    }
    
    /**
     * Initialises (without allocating) a #GVariantIter.  @iter may be
     * completely uninitialised prior to this call; its old value is
     * ignored.
     * 
     * The iterator remains valid for as long as @value exists, and need not
     * be freed in any way.
     */
    public long init(Variant value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_init(HANDLE(), value.HANDLE());
        return RESULT;
    }
    
    /**
     * Queries the number of child items in the container that we are
     * iterating over.  This is the total number of items -- not the number
     * of items remaining.
     * 
     * This function might be useful for preallocation of arrays.
     */
    public long nChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_n_children(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the next item in the container.  If no more items remain then
     * %NULL is returned.
     * 
     * Use g_variant_unref() to drop your reference on the return value when
     * you no longer need it.
     * 
     * Here is an example for iterating with g_variant_iter_next_value():
     * |[<!-- language="C" -->
     *   // recursively iterate a container
     *   void
     *   iterate_container_recursive (GVariant *container)
     *   {
     *     GVariantIter iter;
     *     GVariant *child;
     * 
     *     g_variant_iter_init (&iter, container);
     *     while ((child = g_variant_iter_next_value (&iter)))
     *       {
     *         g_print ("type '%s'\\n", g_variant_get_type_string (child));
     * 
     *         if (g_variant_is_container (child))
     *           iterate_container_recursive (child);
     * 
     *         g_variant_unref (child);
     *       }
     *   }
     * ]|
     */
    public Variant nextValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_iter_next_value(HANDLE());
        return new Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
}
