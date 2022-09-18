package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.glib.VariantIter} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class VariantIter extends io.github.jwharm.javagi.ResourceBase {

    public VariantIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new heap-allocated {@link org.gtk.glib.VariantIter} to iterate over the
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
        var RESULT = gtk_h.g_variant_iter_copy(handle());
        return new VariantIter(References.get(RESULT, true));
    }
    
    /**
     * Frees a heap-allocated {@link org.gtk.glib.VariantIter}   Only call this function on
     * iterators that were returned by g_variant_iter_new() or
     * g_variant_iter_copy().
     */
    public void free() {
        gtk_h.g_variant_iter_free(handle());
    }
    
    /**
     * Initialises (without allocating) a {@link org.gtk.glib.VariantIter}   @iter may be
     * completely uninitialised prior to this call; its old value is
     * ignored.
     * 
     * The iterator remains valid for as long as @value exists, and need not
     * be freed in any way.
     */
    public long init(Variant value) {
        var RESULT = gtk_h.g_variant_iter_init(handle(), value.handle());
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
        var RESULT = gtk_h.g_variant_iter_n_children(handle());
        return RESULT;
    }
    
    /**
     * Gets the next item in the container.  If no more items remain then
     * <code>null</code> is returned.
     * 
     * Use g_variant_unref() to drop your reference on the return value when
     * you no longer need it.
     * 
     * Here is an example for iterating with g_variant_iter_next_value():
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   // recursively iterate a container
     *   void
     *   iterate_container_recursive (GVariant *container)
     *   {
     *     GVariantIter iter;
     *     GVariant *child;
     * 
     *     g_variant_iter_init (&<code>#38</code> iter, container);
     *     while ((child = g_variant_iter_next_value (&<code>#38</code> iter)))
     *       {
     *         g_print (&<code>#34</code> type &<code>#39</code> <code>s</code> <code>#39</code> \\n&<code>#34</code> , g_variant_get_type_string (child));
     * 
     *         if (g_variant_is_container (child))
     *           iterate_container_recursive (child);
     * 
     *         g_variant_unref (child);
     *       }
     *   }
     * ]}|
     */
    public Variant nextValue() {
        var RESULT = gtk_h.g_variant_iter_next_value(handle());
        return new Variant(References.get(RESULT, true));
    }
    
}
