package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link HashTable} struct is an opaque data structure to represent a
 * [Hash Table][glib-Hash-Tables]. It should only be accessed via the
 * following functions.
 */
public class HashTable extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHashTable";
    
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
     * Allocate a new {@link HashTable}
     * @return A new, uninitialized @{link HashTable}
     */
    public static HashTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HashTable newInstance = new HashTable(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a HashTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected HashTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, HashTable> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new HashTable(input, ownership);
    
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
     * @param hashTable a {@link HashTable}
     * @param key a key to insert
     * @return {@code true} if the key did not exist yet
     */
    public static boolean add(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_add.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code key} is in {@code hash_table}.
     * @param hashTable a {@link HashTable}
     * @param key a key to check
     * @return {@code true} if {@code key} is in {@code hash_table}, {@code false} otherwise.
     */
    public static boolean contains(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_contains.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Destroys all keys and values in the {@link HashTable} and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the {@link HashTable} with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     * @param hashTable a {@link HashTable}
     */
    public static void destroy(org.gtk.glib.HashTable hashTable) {
        try {
            DowncallHandles.g_hash_table_destroy.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param predicate function to test the key/value pairs for a certain property
     * @return The value of the first key/value pair is returned,
     *     for which {@code predicate} evaluates to {@code true}. If no pair with the
     *     requested property is found, {@code null} is returned.
     */
    public static @Nullable java.lang.foreign.MemoryAddress find(org.gtk.glib.HashTable hashTable, org.gtk.glib.HRFunc predicate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_find.invokeExact(
                    hashTable.handle(),
                    (Addressable) predicate.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param func the function to call for each key/value pair
     */
    public static void foreach(org.gtk.glib.HashTable hashTable, org.gtk.glib.HFunc func) {
        try {
            DowncallHandles.g_hash_table_foreach.invokeExact(
                    hashTable.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the given function for each key/value pair in the
     * {@link HashTable}. If the function returns {@code true}, then the key/value
     * pair is removed from the {@link HashTable}. If you supplied key or
     * value destroy functions when creating the {@link HashTable}, they are
     * used to free the memory allocated for the removed keys and values.
     * <p>
     * See {@link HashTableIter} for an alternative way to loop over the
     * key/value pairs in the hash table.
     * @param hashTable a {@link HashTable}
     * @param func the function to call for each key/value pair
     * @return the number of key/value pairs removed
     */
    public static int foreachRemove(org.gtk.glib.HashTable hashTable, org.gtk.glib.HRFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_foreach_remove.invokeExact(
                    hashTable.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calls the given function for each key/value pair in the
     * {@link HashTable}. If the function returns {@code true}, then the key/value
     * pair is removed from the {@link HashTable}, but no key or value
     * destroy functions are called.
     * <p>
     * See {@link HashTableIter} for an alternative way to loop over the
     * key/value pairs in the hash table.
     * @param hashTable a {@link HashTable}
     * @param func the function to call for each key/value pair
     * @return the number of key/value pairs removed.
     */
    public static int foreachSteal(org.gtk.glib.HashTable hashTable, org.gtk.glib.HRFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_foreach_steal.invokeExact(
                    hashTable.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves every key inside {@code hash_table}. The returned data is valid
     * until changes to the hash release those keys.
     * <p>
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a {@link HashTable} more efficiently, use a
     * {@link HashTableIter}.
     * @param hashTable a {@link HashTable}
     * @return a {@link List} containing all the keys
     *     inside the hash table. The content of the list is owned by the
     *     hash table and should not be modified or freed. Use g_list_free()
     *     when done using the list.
     */
    public static org.gtk.glib.List getKeys(org.gtk.glib.HashTable hashTable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_get_keys.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param length the length of the returned array
     * @return a
     *   {@code null}-terminated array containing each key from the table.
     */
    public static java.lang.foreign.MemoryAddress[] getKeysAsArray(org.gtk.glib.HashTable hashTable, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_get_keys_as_array.invokeExact(
                    hashTable.handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.foreign.MemoryAddress[] resultARRAY = new java.lang.foreign.MemoryAddress[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ;
        }
        return resultARRAY;
    }
    
    /**
     * Retrieves every value inside {@code hash_table}. The returned data
     * is valid until {@code hash_table} is modified.
     * <p>
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a {@link HashTable} more efficiently, use a
     * {@link HashTableIter}.
     * @param hashTable a {@link HashTable}
     * @return a {@link List} containing all the values
     *     inside the hash table. The content of the list is owned by the
     *     hash table and should not be modified or freed. Use g_list_free()
     *     when done using the list.
     */
    public static org.gtk.glib.List getValues(org.gtk.glib.HashTable hashTable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_get_values.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return {@code true} if the key did not exist yet
     */
    public static boolean insert(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_insert.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Looks up a key in a {@link HashTable}. Note that this function cannot
     * distinguish between a key that is not present and one which is present
     * and has the value {@code null}. If you need this distinction, use
     * g_hash_table_lookup_extended().
     * @param hashTable a {@link HashTable}
     * @param key the key to look up
     * @return the associated value, or {@code null} if the key is not found
     */
    public static @Nullable java.lang.foreign.MemoryAddress lookup(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_lookup.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Looks up a key in the {@link HashTable}, returning the original key and the
     * associated value and a {@code gboolean} which is {@code true} if the key was found. This
     * is useful if you need to free the memory allocated for the original key,
     * for example before calling g_hash_table_remove().
     * <p>
     * You can actually pass {@code null} for {@code lookup_key} to test
     * whether the {@code null} key exists, provided the hash and equal functions
     * of {@code hash_table} are {@code null}-safe.
     * @param hashTable a {@link HashTable}
     * @param lookupKey the key to look up
     * @param origKey return location for the original key
     * @param value return location for the value associated
     * with the key
     * @return {@code true} if the key was found in the {@link HashTable}
     */
    public static boolean lookupExtended(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress lookupKey, @Nullable Out<java.lang.foreign.MemoryAddress> origKey, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
        MemorySegment origKeyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_lookup_extended.invokeExact(
                    hashTable.handle(),
                    (Addressable) (lookupKey == null ? MemoryAddress.NULL : (Addressable) lookupKey),
                    (Addressable) (origKey == null ? MemoryAddress.NULL : (Addressable) origKeyPOINTER.address()),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (origKey != null) origKey.set(origKeyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a new {@link HashTable} with a reference count of 1.
     * <p>
     * Hash values returned by {@code hash_func} are used to determine where keys
     * are stored within the {@link HashTable} data structure. The g_direct_hash(),
     * g_int_hash(), g_int64_hash(), g_double_hash() and g_str_hash()
     * functions are provided for some common types of keys.
     * If {@code hash_func} is {@code null}, g_direct_hash() is used.
     * <p>
     * {@code key_equal_func} is used when looking up keys in the {@link HashTable}.
     * The g_direct_equal(), g_int_equal(), g_int64_equal(), g_double_equal()
     * and g_str_equal() functions are provided for the most common types
     * of keys. If {@code key_equal_func} is {@code null}, keys are compared directly in
     * a similar fashion to g_direct_equal(), but without the overhead of
     * a function call. {@code key_equal_func} is called with the key from the hash table
     * as its first parameter, and the user-provided key to check against as
     * its second.
     * @param hashFunc a function to create a hash value from a key
     * @param keyEqualFunc a function to check two keys for equality
     * @return a new {@link HashTable}
     */
    public static org.gtk.glib.HashTable new_(org.gtk.glib.HashFunc hashFunc, org.gtk.glib.EqualFunc keyEqualFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_new.invokeExact(
                    (Addressable) hashFunc.toCallback(),
                    (Addressable) keyEqualFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Creates a new {@link HashTable} like g_hash_table_new() with a reference
     * count of 1 and allows to specify functions to free the memory
     * allocated for the key and value that get called when removing the
     * entry from the {@link HashTable}.
     * <p>
     * Since version 2.42 it is permissible for destroy notify functions to
     * recursively remove further items from the hash table. This is only
     * permissible if the application still holds a reference to the hash table.
     * This means that you may need to ensure that the hash table is empty by
     * calling g_hash_table_remove_all() before releasing the last reference using
     * g_hash_table_unref().
     * @param hashFunc a function to create a hash value from a key
     * @param keyEqualFunc a function to check two keys for equality
     * @param keyDestroyFunc a function to free the memory allocated for the key
     *     used when removing the entry from the {@link HashTable}, or {@code null}
     *     if you don't want to supply such a function.
     * @param valueDestroyFunc a function to free the memory allocated for the
     *     value used when removing the entry from the {@link HashTable}, or {@code null}
     *     if you don't want to supply such a function.
     * @return a new {@link HashTable}
     */
    public static org.gtk.glib.HashTable newFull(org.gtk.glib.HashFunc hashFunc, org.gtk.glib.EqualFunc keyEqualFunc, @Nullable org.gtk.glib.DestroyNotify keyDestroyFunc, @Nullable org.gtk.glib.DestroyNotify valueDestroyFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_new_full.invokeExact(
                    (Addressable) hashFunc.toCallback(),
                    (Addressable) keyEqualFunc.toCallback(),
                    (Addressable) (keyDestroyFunc == null ? MemoryAddress.NULL : (Addressable) keyDestroyFunc.toCallback()),
                    (Addressable) (valueDestroyFunc == null ? MemoryAddress.NULL : (Addressable) valueDestroyFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Creates a new {@link HashTable} like g_hash_table_new_full() with a reference
     * count of 1.
     * <p>
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from {@code other_hash_table}.
     * <p>
     * The returned hash table will be empty; it will not contain the keys
     * or values from {@code other_hash_table}.
     * @param otherHashTable Another {@link HashTable}
     * @return a new {@link HashTable}
     */
    public static org.gtk.glib.HashTable newSimilar(org.gtk.glib.HashTable otherHashTable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_new_similar.invokeExact(
                    otherHashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Atomically increments the reference count of {@code hash_table} by one.
     * This function is MT-safe and may be called from any thread.
     * @param hashTable a valid {@link HashTable}
     * @return the passed in {@link HashTable}
     */
    public static org.gtk.glib.HashTable ref(org.gtk.glib.HashTable hashTable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_ref.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes a key and its associated value from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(), the
     * key and value are freed using the supplied destroy functions, otherwise
     * you have to make sure that any dynamically allocated values are freed
     * yourself.
     * @param hashTable a {@link HashTable}
     * @param key the key to remove
     * @return {@code true} if the key was found and removed from the {@link HashTable}
     */
    public static boolean remove(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_remove.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     * @param hashTable a {@link HashTable}
     */
    public static void removeAll(org.gtk.glib.HashTable hashTable) {
        try {
            DowncallHandles.g_hash_table_remove_all.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return {@code true} if the key did not exist yet
     */
    public static boolean replace(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_replace.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the number of elements contained in the {@link HashTable}.
     * @param hashTable a {@link HashTable}
     * @return the number of key/value pairs in the {@link HashTable}.
     */
    public static int size(org.gtk.glib.HashTable hashTable) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_size.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a key and its associated value from a {@link HashTable} without
     * calling the key and value destroy functions.
     * @param hashTable a {@link HashTable}
     * @param key the key to remove
     * @return {@code true} if the key was found and removed from the {@link HashTable}
     */
    public static boolean steal(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_steal.invokeExact(
                    hashTable.handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}
     * without calling the key and value destroy functions.
     * @param hashTable a {@link HashTable}
     */
    public static void stealAll(org.gtk.glib.HashTable hashTable) {
        try {
            DowncallHandles.g_hash_table_steal_all.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param hashTable a {@link HashTable}
     * @param lookupKey the key to look up
     * @param stolenKey return location for the
     *    original key
     * @param stolenValue return location
     *    for the value associated with the key
     * @return {@code true} if the key was found in the {@link HashTable}
     */
    public static boolean stealExtended(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress lookupKey, @Nullable Out<java.lang.foreign.MemoryAddress> stolenKey, @Nullable Out<java.lang.foreign.MemoryAddress> stolenValue) {
        MemorySegment stolenKeyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment stolenValuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_steal_extended.invokeExact(
                    hashTable.handle(),
                    (Addressable) (lookupKey == null ? MemoryAddress.NULL : (Addressable) lookupKey),
                    (Addressable) (stolenKey == null ? MemoryAddress.NULL : (Addressable) stolenKeyPOINTER.address()),
                    (Addressable) (stolenValue == null ? MemoryAddress.NULL : (Addressable) stolenValuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (stolenKey != null) stolenKey.set(stolenKeyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        if (stolenValue != null) stolenValue.set(stolenValuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Atomically decrements the reference count of {@code hash_table} by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     * @param hashTable a valid {@link HashTable}
     */
    public static void unref(org.gtk.glib.HashTable hashTable) {
        try {
            DowncallHandles.g_hash_table_unref.invokeExact(
                    hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hash_table_add = Interop.downcallHandle(
            "g_hash_table_add",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_contains = Interop.downcallHandle(
            "g_hash_table_contains",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_destroy = Interop.downcallHandle(
            "g_hash_table_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_find = Interop.downcallHandle(
            "g_hash_table_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_foreach = Interop.downcallHandle(
            "g_hash_table_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_foreach_remove = Interop.downcallHandle(
            "g_hash_table_foreach_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_foreach_steal = Interop.downcallHandle(
            "g_hash_table_foreach_steal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_get_keys = Interop.downcallHandle(
            "g_hash_table_get_keys",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_get_keys_as_array = Interop.downcallHandle(
            "g_hash_table_get_keys_as_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_get_values = Interop.downcallHandle(
            "g_hash_table_get_values",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_insert = Interop.downcallHandle(
            "g_hash_table_insert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_lookup = Interop.downcallHandle(
            "g_hash_table_lookup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_lookup_extended = Interop.downcallHandle(
            "g_hash_table_lookup_extended",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_new = Interop.downcallHandle(
            "g_hash_table_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_new_full = Interop.downcallHandle(
            "g_hash_table_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_new_similar = Interop.downcallHandle(
            "g_hash_table_new_similar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_ref = Interop.downcallHandle(
            "g_hash_table_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_remove = Interop.downcallHandle(
            "g_hash_table_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_remove_all = Interop.downcallHandle(
            "g_hash_table_remove_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_replace = Interop.downcallHandle(
            "g_hash_table_replace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_size = Interop.downcallHandle(
            "g_hash_table_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_steal = Interop.downcallHandle(
            "g_hash_table_steal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_steal_all = Interop.downcallHandle(
            "g_hash_table_steal_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_steal_extended = Interop.downcallHandle(
            "g_hash_table_steal_extended",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hash_table_unref = Interop.downcallHandle(
            "g_hash_table_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
