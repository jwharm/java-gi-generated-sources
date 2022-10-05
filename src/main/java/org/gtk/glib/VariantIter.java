package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link VariantIter} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class VariantIter extends io.github.jwharm.javagi.ResourceBase {

    public VariantIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_variant_iter_copy = Interop.downcallHandle(
        "g_variant_iter_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new heap-allocated {@link VariantIter} to iterate over the
     * container that was being iterated over by {@code iter}.  Iteration begins on
     * the new iterator from the current position of the old iterator but
     * the two copies are independent past that point.
     * <p>
     * Use g_variant_iter_free() to free the return value when you no longer
     * need it.
     * <p>
     * A reference is taken to the container that {@code iter} is iterating over
     * and will be related only when g_variant_iter_free() is called.
     */
    public VariantIter copy() {
        try {
            var RESULT = (MemoryAddress) g_variant_iter_copy.invokeExact(handle());
            return new VariantIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_iter_free = Interop.downcallHandle(
        "g_variant_iter_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a heap-allocated {@link VariantIter}.  Only call this function on
     * iterators that were returned by g_variant_iter_new() or
     * g_variant_iter_copy().
     */
    public void free() {
        try {
            g_variant_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_iter_init = Interop.downcallHandle(
        "g_variant_iter_init",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initialises (without allocating) a {@link VariantIter}.  {@code iter} may be
     * completely uninitialised prior to this call; its old value is
     * ignored.
     * <p>
     * The iterator remains valid for as long as {@code value} exists, and need not
     * be freed in any way.
     */
    public long init(Variant value) {
        try {
            var RESULT = (long) g_variant_iter_init.invokeExact(handle(), value.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_iter_n_children = Interop.downcallHandle(
        "g_variant_iter_n_children",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the number of child items in the container that we are
     * iterating over.  This is the total number of items -- not the number
     * of items remaining.
     * <p>
     * This function might be useful for preallocation of arrays.
     */
    public long nChildren() {
        try {
            var RESULT = (long) g_variant_iter_n_children.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_iter_next_value = Interop.downcallHandle(
        "g_variant_iter_next_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the next item in the container.  If no more items remain then
     * {@code null} is returned.
     * <p>
     * Use g_variant_unref() to drop your reference on the return value when
     * you no longer need it.
     * <p>
     * Here is an example for iterating with g_variant_iter_next_value():
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     */
    public Variant nextValue() {
        try {
            var RESULT = (MemoryAddress) g_variant_iter_next_value.invokeExact(handle());
            return new Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
