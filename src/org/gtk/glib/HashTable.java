package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GHashTable struct is an opaque data structure to represent a
 * [Hash Table][glib-Hash-Tables]. It should only be accessed via the
 * following functions.
 */
public class HashTable extends io.github.jwharm.javagi.ResourceBase {

    public HashTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * This is a convenience function for using a #GHashTable as a set.  It
     * is equivalent to calling g_hash_table_replace() with @key as both the
     * key and the value.
     * 
     * In particular, this means that if @key already exists in the hash table, then
     * the old copy of @key in the hash table is freed and @key replaces it in the
     * table.
     * 
     * When a hash table only ever contains keys that have themselves as the
     * corresponding value it is able to be stored more efficiently.  See
     * the discussion in the section description.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean add(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_add(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Checks if @key is in @hash_table.
     */
    public static boolean contains(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_contains(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Destroys all keys and values in the #GHashTable and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the #GHashTable with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     */
    public static void destroy(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_destroy(hashTable.handle());
    }
    
    /**
     * Calls the given function for key/value pairs in the #GHashTable
     * until @predicate returns %TRUE. The function is passed the key
     * and value of each pair, and the given @user_data parameter. The
     * hash table may not be modified while iterating over it (you can't
     * add/remove items).
     * 
     * Note, that hash tables are really only optimized for forward
     * lookups, i.e. g_hash_table_lookup(). So code that frequently issues
     * g_hash_table_find() or g_hash_table_foreach() (e.g. in the order of
     * once per every entry in a hash table) should probably be reworked
     * to use additional or different data structures for reverse lookups
     * (keep in mind that an O(n) find/foreach operation issued for all n
     * values in a hash table ends up needing O(n*n) operations).
     */
    public static jdk.incubator.foreign.MemoryAddress find(org.gtk.glib.HashTable hashTable, HRFunc predicate) {
        try {
            var RESULT = gtk_h.g_hash_table_find(hashTable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHRFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(predicate.hashCode(), predicate)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls the given function for each of the key/value pairs in the
     * #GHashTable.  The function is passed the key and value of each
     * pair, and the given @user_data parameter.  The hash table may not
     * be modified while iterating over it (you can't add/remove
     * items). To remove all items matching a predicate, use
     * g_hash_table_foreach_remove().
     * 
     * The order in which g_hash_table_foreach() iterates over the keys/values in
     * the hash table is not defined.
     * 
     * See g_hash_table_find() for performance caveats for linear
     * order searches in contrast to g_hash_table_lookup().
     */
    public static void foreach(org.gtk.glib.HashTable hashTable, HFunc func) {
        try {
            gtk_h.g_hash_table_foreach(hashTable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls the given function for each key/value pair in the
     * #GHashTable. If the function returns %TRUE, then the key/value
     * pair is removed from the #GHashTable. If you supplied key or
     * value destroy functions when creating the #GHashTable, they are
     * used to free the memory allocated for the removed keys and values.
     * 
     * See #GHashTableIter for an alternative way to loop over the
     * key/value pairs in the hash table.
     */
    public static int foreachRemove(org.gtk.glib.HashTable hashTable, HRFunc func) {
        try {
            var RESULT = gtk_h.g_hash_table_foreach_remove(hashTable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHRFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls the given function for each key/value pair in the
     * #GHashTable. If the function returns %TRUE, then the key/value
     * pair is removed from the #GHashTable, but no key or value
     * destroy functions are called.
     * 
     * See #GHashTableIter for an alternative way to loop over the
     * key/value pairs in the hash table.
     */
    public static int foreachSteal(org.gtk.glib.HashTable hashTable, HRFunc func) {
        try {
            var RESULT = gtk_h.g_hash_table_foreach_steal(hashTable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHRFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves every key inside @hash_table. The returned data is valid
     * until changes to the hash release those keys.
     * 
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a #GHashTable more efficiently, use a
     * #GHashTableIter.
     */
    public static org.gtk.glib.List getKeys(org.gtk.glib.HashTable hashTable) {
        var RESULT = gtk_h.g_hash_table_get_keys(hashTable.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Retrieves every value inside @hash_table. The returned data
     * is valid until @hash_table is modified.
     * 
     * This iterates over every entry in the hash table to build its return value.
     * To iterate over the entries in a #GHashTable more efficiently, use a
     * #GHashTableIter.
     */
    public static org.gtk.glib.List getValues(org.gtk.glib.HashTable hashTable) {
        var RESULT = gtk_h.g_hash_table_get_values(hashTable.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Inserts a new key and value into a #GHashTable.
     * 
     * If the key already exists in the #GHashTable its current
     * value is replaced with the new value. If you supplied a
     * @value_destroy_func when creating the #GHashTable, the old
     * value is freed using that function. If you supplied a
     * @key_destroy_func when creating the #GHashTable, the passed
     * key is freed using that function.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean insert(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_insert(hashTable.handle(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up a key in a #GHashTable. Note that this function cannot
     * distinguish between a key that is not present and one which is present
     * and has the value %NULL. If you need this distinction, use
     * g_hash_table_lookup_extended().
     */
    public static jdk.incubator.foreign.MemoryAddress lookup(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_lookup(hashTable.handle(), key);
        return RESULT;
    }
    
    /**
     * Looks up a key in the #GHashTable, returning the original key and the
     * associated value and a #gboolean which is %TRUE if the key was found. This
     * is useful if you need to free the memory allocated for the original key,
     * for example before calling g_hash_table_remove().
     * 
     * You can actually pass %NULL for @lookup_key to test
     * whether the %NULL key exists, provided the hash and equal functions
     * of @hash_table are %NULL-safe.
     */
    public static boolean lookupExtended(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress lookupKey, jdk.incubator.foreign.MemoryAddress origKey, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_lookup_extended(hashTable.handle(), lookupKey, origKey, value);
        return (RESULT != 0);
    }
    
    /**
     * Creates a new #GHashTable like g_hash_table_new_full() with a reference
     * count of 1.
     * 
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from @other_hash_table.
     * 
     * The returned hash table will be empty; it will not contain the keys
     * or values from @other_hash_table.
     */
    public static org.gtk.glib.HashTable newSimilar(org.gtk.glib.HashTable otherHashTable) {
        var RESULT = gtk_h.g_hash_table_new_similar(otherHashTable.handle());
        return new org.gtk.glib.HashTable(References.get(RESULT, true));
    }
    
    /**
     * Atomically increments the reference count of @hash_table by one.
     * This function is MT-safe and may be called from any thread.
     */
    public static org.gtk.glib.HashTable ref(org.gtk.glib.HashTable hashTable) {
        var RESULT = gtk_h.g_hash_table_ref(hashTable.handle());
        return new org.gtk.glib.HashTable(References.get(RESULT, false));
    }
    
    /**
     * Removes a key and its associated value from a #GHashTable.
     * 
     * If the #GHashTable was created using g_hash_table_new_full(), the
     * key and value are freed using the supplied destroy functions, otherwise
     * you have to make sure that any dynamically allocated values are freed
     * yourself.
     */
    public static boolean remove(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_remove(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Removes all keys and their associated values from a #GHashTable.
     * 
     * If the #GHashTable was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     */
    public static void removeAll(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_remove_all(hashTable.handle());
    }
    
    /**
     * Inserts a new key and value into a #GHashTable similar to
     * g_hash_table_insert(). The difference is that if the key
     * already exists in the #GHashTable, it gets replaced by the
     * new key. If you supplied a @value_destroy_func when creating
     * the #GHashTable, the old value is freed using that function.
     * If you supplied a @key_destroy_func when creating the
     * #GHashTable, the old key is freed using that function.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean replace(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_replace(hashTable.handle(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of elements contained in the #GHashTable.
     */
    public static int size(org.gtk.glib.HashTable hashTable) {
        var RESULT = gtk_h.g_hash_table_size(hashTable.handle());
        return RESULT;
    }
    
    /**
     * Removes a key and its associated value from a #GHashTable without
     * calling the key and value destroy functions.
     */
    public static boolean steal(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_steal(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Removes all keys and their associated values from a #GHashTable
     * without calling the key and value destroy functions.
     */
    public static void stealAll(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_steal_all(hashTable.handle());
    }
    
    /**
     * Looks up a key in the #GHashTable, stealing the original key and the
     * associated value and returning %TRUE if the key was found. If the key was
     * not found, %FALSE is returned.
     * 
     * If found, the stolen key and value are removed from the hash table without
     * calling the key and value destroy functions, and ownership is transferred to
     * the caller of this method; as with g_hash_table_steal().
     * 
     * You can pass %NULL for @lookup_key, provided the hash and equal functions
     * of @hash_table are %NULL-safe.
     */
    public static boolean stealExtended(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress lookupKey, jdk.incubator.foreign.MemoryAddress stolenKey, jdk.incubator.foreign.MemoryAddress stolenValue) {
        var RESULT = gtk_h.g_hash_table_steal_extended(hashTable.handle(), lookupKey, stolenKey, stolenValue);
        return (RESULT != 0);
    }
    
    /**
     * Atomically decrements the reference count of @hash_table by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     */
    public static void unref(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_unref(hashTable.handle());
    }
    
}
