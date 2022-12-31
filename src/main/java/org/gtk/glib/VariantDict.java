package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VariantDict} is a mutable interface to {@link Variant} dictionaries.
 * <p>
 * It can be used for doing a sequence of dictionary lookups in an
 * efficient way on an existing {@link Variant} dictionary or it can be used
 * to construct new dictionaries with a hashtable-like interface.  It
 * can also be used for taking existing dictionaries and modifying them
 * in order to create new ones.
 * <p>
 * {@link VariantDict} can only be used with {@code G_VARIANT_TYPE_VARDICT}
 * dictionaries.
 * <p>
 * It is possible to use {@link VariantDict} allocated on the stack or on the
 * heap.  When using a stack-allocated {@link VariantDict}, you begin with a
 * call to g_variant_dict_init() and free the resources with a call to
 * g_variant_dict_clear().
 * <p>
 * Heap-allocated {@link VariantDict} follows normal refcounting rules: you
 * allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * and g_variant_dict_unref().
 * <p>
 * g_variant_dict_end() is used to convert the {@link VariantDict} back into a
 * dictionary-type {@link Variant}.  When used with stack-allocated instances,
 * this also implicitly frees all associated memory, but for
 * heap-allocated instances, you must still call g_variant_dict_unref()
 * afterwards.
 * <p>
 * You will typically want to use a heap-allocated {@link VariantDict} when
 * you expose it as part of an API.  For most other uses, the
 * stack-allocated form will be more convenient.
 * <p>
 * Consider the following two examples that do the same thing in each
 * style: take an existing dictionary and look up the "count" uint32
 * key, adding 1 to it if it is found, or returning an error if the
 * key is not found.  Each returns the new dictionary as a floating
 * {@link Variant}.
 * <p>
 * <strong>Using a stack-allocated GVariantDict</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 * 
 *     g_variant_dict_init (&dict, orig);
 *     if (!g_variant_dict_lookup (&dict, "count", "u", &count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&dict);
 *         return NULL;
 *       }
 * 
 *     g_variant_dict_insert (&dict, "count", "u", count + 1);
 * 
 *     return g_variant_dict_end (&dict);
 *   }
 * }</pre>
 * <p>
 * <strong>Using heap-allocated GVariantDict</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict *dict;
 *     GVariant *result;
 *     guint32 count;
 * 
 *     dict = g_variant_dict_new (orig);
 * 
 *     if (g_variant_dict_lookup (dict, "count", "u", &count))
 *       {
 *         g_variant_dict_insert (dict, "count", "u", count + 1);
 *         result = g_variant_dict_end (dict);
 *       }
 *     else
 *       {
 *         g_set_error (...);
 *         result = NULL;
 *       }
 * 
 *     g_variant_dict_unref (dict);
 * 
 *     return result;
 *   }
 * }</pre>
 * @version 2.40
 */
public class VariantDict extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVariantDict";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VariantDict}
     * @return A new, uninitialized @{link VariantDict}
     */
    public static VariantDict allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VariantDict newInstance = new VariantDict(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VariantDict proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VariantDict(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VariantDict> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VariantDict(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.glib.Variant fromAsv) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dict_new.invokeExact(
                    (Addressable) (fromAsv == null ? MemoryAddress.NULL : fromAsv.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initialises a new {@link VariantDict}.
     * <p>
     * You should call g_variant_dict_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * <p>
     * In some cases it may be easier to place a {@link VariantDict} directly on
     * the stack of the calling function and initialise it with
     * g_variant_dict_init().  This is particularly useful when you are
     * using {@link VariantDict} to construct a {@link Variant}.
     * @param fromAsv the {@link Variant} with which to initialise the
     *   dictionary
     */
    public VariantDict(@Nullable org.gtk.glib.Variant fromAsv) {
        super(constructNew(fromAsv), Ownership.FULL);
    }
    
    /**
     * Releases all memory associated with a {@link VariantDict} without freeing
     * the {@link VariantDict} structure itself.
     * <p>
     * It typically only makes sense to do this on a stack-allocated
     * {@link VariantDict} if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_dict_end() and it also doesn't need to be called on dicts
     * allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * that).
     * <p>
     * It is valid to call this function on either an initialised
     * {@link VariantDict} or one that was previously cleared by an earlier call
     * to g_variant_dict_clear() but it is not valid to call this function
     * on uninitialised memory.
     */
    public void clear() {
        try {
            DowncallHandles.g_variant_dict_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if {@code key} exists in {@code dict}.
     * @param key the key to look up in the dictionary
     * @return {@code true} if {@code key} is in {@code dict}
     */
    public boolean contains(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_dict_contains.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the current value of {@code dict} as a {@link Variant} of type
     * {@code G_VARIANT_TYPE_VARDICT}, clearing it in the process.
     * <p>
     * It is not permissible to use {@code dict} in any way after this call except
     * for reference counting operations (in the case of a heap-allocated
     * {@link VariantDict}) or by reinitialising it with g_variant_dict_init() (in
     * the case of stack-allocated).
     * @return a new, floating, {@link Variant}
     */
    public org.gtk.glib.Variant end() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dict_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initialises a {@link VariantDict} structure.
     * <p>
     * If {@code from_asv} is given, it is used to initialise the dictionary.
     * <p>
     * This function completely ignores the previous contents of {@code dict}.  On
     * one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing {@link VariantDict} you need to first
     * call g_variant_dict_clear() in order to avoid leaking memory.
     * <p>
     * You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
     * {@link VariantDict} that was initialised with this function.  If you ever
     * pass a reference to a {@link VariantDict} outside of the control of your
     * own code then you should assume that the person receiving that
     * reference may try to use reference counting; you should use
     * g_variant_dict_new() instead of this function.
     * @param fromAsv the initial value for {@code dict}
     */
    public void init(@Nullable org.gtk.glib.Variant fromAsv) {
        try {
            DowncallHandles.g_variant_dict_init.invokeExact(
                    handle(),
                    (Addressable) (fromAsv == null ? MemoryAddress.NULL : fromAsv.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a value into a {@link VariantDict}.
     * <p>
     * This call is a convenience wrapper that is exactly equivalent to
     * calling g_variant_new() followed by g_variant_dict_insert_value().
     * @param key the key to insert a value for
     * @param formatString a {@link Variant} varargs format string
     * @param varargs arguments, as per {@code format_string}
     */
    public void insert(java.lang.String key, java.lang.String formatString, java.lang.Object... varargs) {
        try {
            DowncallHandles.g_variant_dict_insert.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts (or replaces) a key in a {@link VariantDict}.
     * <p>
     * {@code value} is consumed if it is floating.
     * @param key the key to insert a value for
     * @param value the value to insert
     */
    public void insertValue(java.lang.String key, org.gtk.glib.Variant value) {
        try {
            DowncallHandles.g_variant_dict_insert_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up a value in a {@link VariantDict}.
     * <p>
     * This function is a wrapper around g_variant_dict_lookup_value() and
     * g_variant_get().  In the case that {@code null} would have been returned,
     * this function returns {@code false}.  Otherwise, it unpacks the returned
     * value and returns {@code true}.
     * <p>
     * {@code format_string} determines the C types that are used for unpacking the
     * values and also determines if the values are copied or borrowed, see the
     * section on [GVariant format strings][gvariant-format-strings-pointers].
     * @param key the key to look up in the dictionary
     * @param formatString a GVariant format string
     * @param varargs the arguments to unpack the value into
     * @return {@code true} if a value was unpacked
     */
    public boolean lookup(java.lang.String key, java.lang.String formatString, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_dict_lookup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Looks up a value in a {@link VariantDict}.
     * <p>
     * If {@code key} is not found in {@code dictionary}, {@code null} is returned.
     * <p>
     * The {@code expected_type} string specifies what type of value is expected.
     * If the value associated with {@code key} has a different type then {@code null} is
     * returned.
     * <p>
     * If the key is found and the value has the correct type, it is
     * returned.  If {@code expected_type} was specified then any non-{@code null} return
     * value will have this type.
     * @param key the key to look up in the dictionary
     * @param expectedType a {@link VariantType}, or {@code null}
     * @return the value of the dictionary key, or {@code null}
     */
    public @Nullable org.gtk.glib.Variant lookupValue(java.lang.String key, @Nullable org.gtk.glib.VariantType expectedType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dict_lookup_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    (Addressable) (expectedType == null ? MemoryAddress.NULL : expectedType.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Increases the reference count on {@code dict}.
     * <p>
     * Don't call this on stack-allocated {@link VariantDict} instances or bad
     * things will happen.
     * @return a new reference to {@code dict}
     */
    public org.gtk.glib.VariantDict ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_dict_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantDict.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes a key and its associated value from a {@link VariantDict}.
     * @param key the key to remove
     * @return {@code true} if the key was found and removed
     */
    public boolean remove(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_dict_remove.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Decreases the reference count on {@code dict}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link VariantDict}.
     * <p>
     * Don't call this on stack-allocated {@link VariantDict} instances or bad
     * things will happen.
     */
    public void unref() {
        try {
            DowncallHandles.g_variant_dict_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_variant_dict_new = Interop.downcallHandle(
            "g_variant_dict_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_clear = Interop.downcallHandle(
            "g_variant_dict_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_contains = Interop.downcallHandle(
            "g_variant_dict_contains",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_end = Interop.downcallHandle(
            "g_variant_dict_end",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_init = Interop.downcallHandle(
            "g_variant_dict_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_insert = Interop.downcallHandle(
            "g_variant_dict_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_dict_insert_value = Interop.downcallHandle(
            "g_variant_dict_insert_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_lookup = Interop.downcallHandle(
            "g_variant_dict_lookup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_variant_dict_lookup_value = Interop.downcallHandle(
            "g_variant_dict_lookup_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_ref = Interop.downcallHandle(
            "g_variant_dict_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_remove = Interop.downcallHandle(
            "g_variant_dict_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_variant_dict_unref = Interop.downcallHandle(
            "g_variant_dict_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
