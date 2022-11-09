package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VariantIter} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class VariantIter extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVariantIter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_LONG).withName("x")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static VariantIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VariantIter newInstance = new VariantIter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VariantIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VariantIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
     * @return a new heap-allocated {@link VariantIter}
     */
    public @NotNull org.gtk.glib.VariantIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_iter_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantIter(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a heap-allocated {@link VariantIter}.  Only call this function on
     * iterators that were returned by g_variant_iter_new() or
     * g_variant_iter_copy().
     */
    public void free() {
        try {
            DowncallHandles.g_variant_iter_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initialises (without allocating) a {@link VariantIter}.  {@code iter} may be
     * completely uninitialised prior to this call; its old value is
     * ignored.
     * <p>
     * The iterator remains valid for as long as {@code value} exists, and need not
     * be freed in any way.
     * @param value a container {@link Variant}
     * @return the number of items in {@code value}
     */
    public long init(@NotNull org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_iter_init.invokeExact(
                    handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the next item in the container and unpacks it into the variable
     * argument list according to {@code format_string}, returning {@code true}.
     * <p>
     * If no more items remain then {@code false} is returned.
     * <p>
     * On the first call to this function, the pointers appearing on the
     * variable argument list are assumed to point at uninitialised memory.
     * On the second and later calls, it is assumed that the same pointers
     * will be given and that they will point to the memory as set by the
     * previous call to this function.  This allows the previous values to
     * be freed, as appropriate.
     * <p>
     * This function is intended to be used with a while loop as
     * demonstrated in the following example.  This function can only be
     * used when iterating over an array.  It is only valid to call this
     * function with a string constant for the format string and the same
     * string constant must be used each time.  Mixing calls to this
     * function and g_variant_iter_next() or g_variant_iter_next_value() on
     * the same iterator causes undefined behavior.
     * <p>
     * If you break out of a such a while loop using g_variant_iter_loop() then
     * you must free or unreference all the unpacked values as you would with
     * g_variant_get(). Failure to do so will cause a memory leak.
     * <p>
     * Here is an example for memory management with g_variant_iter_loop():
     * <pre>{@code <!-- language="C" -->
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&iter, dictionary);
     *     while (g_variant_iter_loop (&iter, "{sv}", &key, &value))
     *       {
     *         g_print ("Item '%s' has type '%s'\\n", key,
     *                  g_variant_get_type_string (value));
     * 
     *         // no need to free 'key' and 'value' here
     *         // unless breaking out of this loop
     *       }
     *   }
     * }</pre>
     * <p>
     * For most cases you should use g_variant_iter_next().
     * <p>
     * This function is really only useful when unpacking into {@link Variant} or
     * {@link VariantIter} in order to allow you to skip the call to
     * g_variant_unref() or g_variant_iter_free().
     * <p>
     * For example, if you are only looping over simple integer and string
     * types, g_variant_iter_next() is definitely preferred.  For string
     * types, use the '&amp;' prefix to avoid allocating any memory at all (and
     * thereby avoiding the need to free anything as well).
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed.
     * <p>
     * See the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * @param formatString a GVariant format string
     * @param varargs the arguments to unpack the value into
     * @return {@code true} if a value was unpacked, or {@code false} if there was no
     *          value
     */
    public boolean loop(@NotNull java.lang.String formatString, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(formatString, "Parameter 'formatString' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_iter_loop.invokeExact(
                    handle(),
                    Interop.allocateNativeString(formatString),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queries the number of child items in the container that we are
     * iterating over.  This is the total number of items -- not the number
     * of items remaining.
     * <p>
     * This function might be useful for preallocation of arrays.
     * @return the number of children in the container
     */
    public long nChildren() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_iter_n_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the next item in the container and unpacks it into the variable
     * argument list according to {@code format_string}, returning {@code true}.
     * <p>
     * If no more items remain then {@code false} is returned.
     * <p>
     * All of the pointers given on the variable arguments list of this
     * function are assumed to point at uninitialised memory.  It is the
     * responsibility of the caller to free all of the values returned by
     * the unpacking process.
     * <p>
     * Here is an example for memory management with g_variant_iter_next():
     * <pre>{@code <!-- language="C" -->
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&iter, dictionary);
     *     while (g_variant_iter_next (&iter, "{sv}", &key, &value))
     *       {
     *         g_print ("Item '%s' has type '%s'\\n", key,
     *                  g_variant_get_type_string (value));
     * 
     *         // must free data for ourselves
     *         g_variant_unref (value);
     *         g_free (key);
     *       }
     *   }
     * }</pre>
     * <p>
     * For a solution that is likely to be more convenient to C programmers
     * when dealing with loops, see g_variant_iter_loop().
     * <p>
     * {@code format_string} determines the C types that are used for unpacking
     * the values and also determines if the values are copied or borrowed.
     * <p>
     * See the section on
     * [GVariant format strings][gvariant-format-strings-pointers].
     * @param formatString a GVariant format string
     * @param varargs the arguments to unpack the value into
     * @return {@code true} if a value was unpacked, or {@code false} if there as no value
     */
    public boolean next(@NotNull java.lang.String formatString, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(formatString, "Parameter 'formatString' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_iter_next.invokeExact(
                    handle(),
                    Interop.allocateNativeString(formatString),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @return a {@link Variant}, or {@code null}
     */
    public @Nullable org.gtk.glib.Variant nextValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_iter_next_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_variant_iter_copy = Interop.downcallHandle(
            "g_variant_iter_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_iter_free = Interop.downcallHandle(
            "g_variant_iter_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_iter_init = Interop.downcallHandle(
            "g_variant_iter_init",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_iter_loop = Interop.downcallHandle(
            "g_variant_iter_loop",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_iter_n_children = Interop.downcallHandle(
            "g_variant_iter_n_children",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_iter_next = Interop.downcallHandle(
            "g_variant_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_iter_next_value = Interop.downcallHandle(
            "g_variant_iter_next_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
