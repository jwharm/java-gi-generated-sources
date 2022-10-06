package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link HashTable} struct is an opaque data structure to represent a
 * [Hash Table][glib-Hash-Tables]. It should only be accessed via the
 * following functions.
 */
public class HashTable extends io.github.jwharm.javagi.ResourceBase {

    public HashTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_hash_table_add = Interop.downcallHandle(
        "g_hash_table_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a convenience function for using a {@link HashTable} as a set.  It
     * is equivalent to calling g_hash_table_replace() with {@code key} as both the
     * key and the value.
     * <p>
     * In particular, this means that if {@code key} already exists in the hash table, then
     * the old copy of {@code key} in the hash table is freed and {@code key} replaces it in the
     * table.
     * <p>
     * When a hash table only ever contains keys that have themselves as the
     * corresponding value it is able to be stored more efficiently.  See
     * the discussion in the section description.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean add(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_add.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_contains = Interop.downcallHandle(
        "g_hash_table_contains",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code key} is in {@code hash_table}.
     */
    public static boolean contains(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_contains.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_destroy = Interop.downcallHandle(
        "g_hash_table_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys all keys and values in the {@link HashTable} and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the {@link HashTable} with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     */
    public static void destroy(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_destroy.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_find = Interop.downcallHandle(
        "g_hash_table_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for key/value pairs in the {@link HashTable}
     * until {@code predicate} returns {@code true}. The function is passed the key
     * and value of each pair, and the given {@code user_data} parameter. The
     * hash table may not be modified while iterating over it (you can't
     * add/remove items).
     * <p>
     * Note, that hash tables are really only optimized for forward
     * lookups, i.e. g_hash_table_lookup(). So code that frequently issues
     * g_hash_table_find() or g_hash_table_foreach() (e.g. in the order of
     * once per every entry in a hash table) should probably be reworked
     * to use additional or different data structures for reverse lookups
     * (keep in mind that an O(n) find/foreach operation issued for all n
     * values in a hash table ends up needing O(n*n) operations).
     */
    public static java.lang.foreign.MemoryAddress find(org.gtk.glib.HashTable hashTable, HRFunc predicate) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_find.invokeExact(hashTable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHRFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(predicate.hashCode(), predicate)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_foreach = Interop.downcallHandle(
        "g_hash_table_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each of the key/value pairs in the
     * {@link HashTable}.  The function is passed the key and value of each
     * pair, and the given {@code user_data} parameter.  The hash table may not
     * be modified while iterating over it (you can't add/remove
     * items). To remove all items matching a predicate, use
     * g_hash_table_foreach_remove().
     * <p>
     * The order in which g_hash_table_foreach() iterates over the keys/values in
     * the hash table is not defined.
     * <p>
     * See g_hash_table_find() for performance caveats for linear
     * order searches in contrast to g_hash_table_lookup().
     */
    public static void foreach(org.gtk.glib.HashTable hashTable, HFunc func) {
        try {
            g_hash_table_foreach.invokeExact(hashTable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_foreach_remove = Interop.downcallHandle(
        "g_hash_table_foreach_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each key/value pair in the
     * {@link HashTable}. If the function returns {@code true}, then the key/value
     * pair is removed from the {@link HashTable}. If you supplied key or
     * value destroy functions when creating the {@link HashTable}, they are
     * used to free the memory allocated for the removed keys and values.
     * <p>
     * See {@link HashTableIter} for an alternative way to loop over the
     * key/value pairs in the hash table.
     */
    public static int foreachRemove(org.gtk.glib.HashTable hashTable, HRFunc func) {
        try {
            var RESULT = (int) g_hash_table_foreach_remove.invokeExact(hashTable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHRFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_foreach_steal = Interop.downcallHandle(
        "g_hash_table_foreach_steal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each key/value pair in the
     * {@link HashTable}. If the function returns {@code true}, then the key/value
     * pair is removed from the {@link HashTable}, but no key or value
     * destroy functions are called.
     * <p>
     * See {@link HashTableIter} for an alternative way to loop over the
     * key/value pairs in the hash table.
     */
    public static int foreachSteal(org.gtk.glib.HashTable hashTable, HRFunc func) {
        try {
            var RESULT = (int) g_hash_table_foreach_steal.invokeExact(hashTable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHRFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_get_keys = Interop.downcallHandle(
        "g_hash_table_get_keys",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves every key inside {@code hash_table}. The returned data is valid
     * until changes to the hash release those keys.
     * <p>
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a {@link HashTable} more efficiently, use a
     * {@link HashTableIter}.
     */
    public static org.gtk.glib.List getKeys(org.gtk.glib.HashTable hashTable) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_get_keys.invokeExact(hashTable.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_get_keys_as_array = Interop.downcallHandle(
        "g_hash_table_get_keys_as_array",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves every key inside {@code hash_table}, as an array.
     * <p>
     * The returned array is {@code null}-terminated but may contain {@code null} as a
     * key.  Use {@code length} to determine the true length if it's possible that
     * {@code null} was used as the value for a key.
     * <p>
     * Note: in the common case of a string-keyed {@link HashTable}, the return
     * value of this function can be conveniently cast to (const gchar **).
     * <p>
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a {@link HashTable} more efficiently, use a
     * {@link HashTableIter}.
     * <p>
     * You should always free the return result with g_free().  In the
     * above-mentioned case of a string-keyed hash table, it may be
     * appropriate to use g_strfreev() if you call g_hash_table_steal_all()
     * first to transfer ownership of the keys.
     */
    public static PointerAddress getKeysAsArray(org.gtk.glib.HashTable hashTable, PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_get_keys_as_array.invokeExact(hashTable.handle(), length.handle());
            return new PointerAddress(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_get_values = Interop.downcallHandle(
        "g_hash_table_get_values",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves every value inside {@code hash_table}. The returned data
     * is valid until {@code hash_table} is modified.
     * <p>
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a {@link HashTable} more efficiently, use a
     * {@link HashTableIter}.
     */
    public static org.gtk.glib.List getValues(org.gtk.glib.HashTable hashTable) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_get_values.invokeExact(hashTable.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_insert = Interop.downcallHandle(
        "g_hash_table_insert",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link HashTable}.
     * <p>
     * If the key already exists in the {@link HashTable} its current
     * value is replaced with the new value. If you supplied a
     * {@code value_destroy_func} when creating the {@link HashTable}, the old
     * value is freed using that function. If you supplied a
     * {@code key_destroy_func} when creating the {@link HashTable}, the passed
     * key is freed using that function.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean insert(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_insert.invokeExact(hashTable.handle(), key, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_lookup = Interop.downcallHandle(
        "g_hash_table_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in a {@link HashTable}. Note that this function cannot
     * distinguish between a key that is not present and one which is present
     * and has the value {@code null}. If you need this distinction, use
     * g_hash_table_lookup_extended().
     */
    public static java.lang.foreign.MemoryAddress lookup(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_lookup.invokeExact(hashTable.handle(), key);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_lookup_extended = Interop.downcallHandle(
        "g_hash_table_lookup_extended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in the {@link HashTable}, returning the original key and the
     * associated value and a {@code gboolean} which is {@code true} if the key was found. This
     * is useful if you need to free the memory allocated for the original key,
     * for example before calling g_hash_table_remove().
     * <p>
     * You can actually pass {@code null} for {@code lookup_key} to test
     * whether the {@code null} key exists, provided the hash and equal functions
     * of {@code hash_table} are {@code null}-safe.
     */
    public static boolean lookupExtended(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress lookupKey, java.lang.foreign.MemoryAddress origKey, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_lookup_extended.invokeExact(hashTable.handle(), lookupKey, origKey, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_new_similar = Interop.downcallHandle(
        "g_hash_table_new_similar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link HashTable} like g_hash_table_new_full() with a reference
     * count of 1.
     * <p>
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from {@code other_hash_table}.
     * <p>
     * The returned hash table will be empty; it will not contain the keys
     * or values from {@code other_hash_table}.
     */
    public static org.gtk.glib.HashTable newSimilar(org.gtk.glib.HashTable otherHashTable) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_new_similar.invokeExact(otherHashTable.handle());
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_ref = Interop.downcallHandle(
        "g_hash_table_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code hash_table} by one.
     * This function is MT-safe and may be called from any thread.
     */
    public static org.gtk.glib.HashTable ref(org.gtk.glib.HashTable hashTable) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_ref.invokeExact(hashTable.handle());
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_remove = Interop.downcallHandle(
        "g_hash_table_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key and its associated value from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(), the
     * key and value are freed using the supplied destroy functions, otherwise
     * you have to make sure that any dynamically allocated values are freed
     * yourself.
     */
    public static boolean remove(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_remove.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_remove_all = Interop.downcallHandle(
        "g_hash_table_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     */
    public static void removeAll(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_remove_all.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_replace = Interop.downcallHandle(
        "g_hash_table_replace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link HashTable} similar to
     * g_hash_table_insert(). The difference is that if the key
     * already exists in the {@link HashTable}, it gets replaced by the
     * new key. If you supplied a {@code value_destroy_func} when creating
     * the {@link HashTable}, the old value is freed using that function.
     * If you supplied a {@code key_destroy_func} when creating the
     * {@link HashTable}, the old key is freed using that function.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean replace(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_replace.invokeExact(hashTable.handle(), key, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_size = Interop.downcallHandle(
        "g_hash_table_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of elements contained in the {@link HashTable}.
     */
    public static int size(org.gtk.glib.HashTable hashTable) {
        try {
            var RESULT = (int) g_hash_table_size.invokeExact(hashTable.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal = Interop.downcallHandle(
        "g_hash_table_steal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key and its associated value from a {@link HashTable} without
     * calling the key and value destroy functions.
     */
    public static boolean steal(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_steal.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal_all = Interop.downcallHandle(
        "g_hash_table_steal_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}
     * without calling the key and value destroy functions.
     */
    public static void stealAll(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_steal_all.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal_extended = Interop.downcallHandle(
        "g_hash_table_steal_extended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in the {@link HashTable}, stealing the original key and the
     * associated value and returning {@code true} if the key was found. If the key was
     * not found, {@code false} is returned.
     * <p>
     * If found, the stolen key and value are removed from the hash table without
     * calling the key and value destroy functions, and ownership is transferred to
     * the caller of this method; as with g_hash_table_steal().
     * <p>
     * You can pass {@code null} for {@code lookup_key}, provided the hash and equal functions
     * of {@code hash_table} are {@code null}-safe.
     */
    public static boolean stealExtended(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress lookupKey, java.lang.foreign.MemoryAddress stolenKey, java.lang.foreign.MemoryAddress stolenValue) {
        try {
            var RESULT = (int) g_hash_table_steal_extended.invokeExact(hashTable.handle(), lookupKey, stolenKey, stolenValue);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_unref = Interop.downcallHandle(
        "g_hash_table_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code hash_table} by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     */
    public static void unref(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_unref.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
