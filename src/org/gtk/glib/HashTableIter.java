package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GHashTableIter structure represents an iterator that can be used
 * to iterate over the elements of a #GHashTable. GHashTableIter
 * structures are typically allocated on the stack and then initialized
 * with g_hash_table_iter_init().
 * 
 * The iteration order of a #GHashTableIter over the keys/values in a hash
 * table is not defined.
 */
public class HashTableIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public HashTableIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns the #GHashTable associated with @iter.
     */
    public org.gtk.glib.HashTable getHashTable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_get_hash_table(HANDLE());
        return new org.gtk.glib.HashTable(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a key/value pair iterator and associates it with
     * @hash_table. Modifying the hash table after calling this function
     * invalidates the returned iterator.
     * 
     * The iteration order of a #GHashTableIter over the keys/values in a hash
     * table is not defined.
     * 
     * |[<!-- language="C" -->
     * GHashTableIter iter;
     * gpointer key, value;
     * 
     * g_hash_table_iter_init (&iter, hash_table);
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     // do something with key and value
     *   }
     * ]|
     */
    public void init(org.gtk.glib.HashTable hashTable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_init(HANDLE(), hashTable.HANDLE());
    }
    
    /**
     * Advances @iter and retrieves the key and/or value that are now
     * pointed to as a result of this advancement. If %FALSE is returned,
     * @key and @value are not set, and the iterator becomes invalid.
     */
    public boolean next(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_next(HANDLE(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Removes the key/value pair currently pointed to by the iterator
     * from its associated #GHashTable. Can only be called after
     * g_hash_table_iter_next() returned %TRUE, and cannot be called
     * more than once for the same key/value pair.
     * 
     * If the #GHashTable was created using g_hash_table_new_full(),
     * the key and value are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     * 
     * It is safe to continue iterating the #GHashTable afterward:
     * |[<!-- language="C" -->
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     if (condition)
     *       g_hash_table_iter_remove (&iter);
     *   }
     * ]|
     */
    public void remove() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_remove(HANDLE());
    }
    
    /**
     * Replaces the value currently pointed to by the iterator
     * from its associated #GHashTable. Can only be called after
     * g_hash_table_iter_next() returned %TRUE.
     * 
     * If you supplied a @value_destroy_func when creating the
     * #GHashTable, the old value is freed using that function.
     */
    public void replace(jdk.incubator.foreign.MemoryAddress value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_replace(HANDLE(), value);
    }
    
    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated #GHashTable, without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned %TRUE, and cannot
     * be called more than once for the same key/value pair.
     */
    public void steal() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hash_table_iter_steal(HANDLE());
    }
    
}
