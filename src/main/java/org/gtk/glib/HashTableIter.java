package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GHashTableIter structure represents an iterator that can be used
 * to iterate over the elements of a {@link HashTable}. GHashTableIter
 * structures are typically allocated on the stack and then initialized
 * with g_hash_table_iter_init().
 * <p>
 * The iteration order of a {@link HashTableIter} over the keys/values in a hash
 * table is not defined.
 */
public class HashTableIter extends io.github.jwharm.javagi.ResourceBase {

    public HashTableIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_hash_table_iter_get_hash_table = Interop.downcallHandle(
        "g_hash_table_iter_get_hash_table",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link HashTable} associated with {@code iter}.
     */
    public org.gtk.glib.HashTable getHashTable() {
        try {
            var RESULT = (MemoryAddress) g_hash_table_iter_get_hash_table.invokeExact(handle());
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_iter_init = Interop.downcallHandle(
        "g_hash_table_iter_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a key/value pair iterator and associates it with
     * {@code hash_table}. Modifying the hash table after calling this function
     * invalidates the returned iterator.
     * <p>
     * The iteration order of a {@link HashTableIter} over the keys/values in a hash
     * table is not defined.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * GHashTableIter iter;
     * gpointer key, value;
     * 
     * g_hash_table_iter_init (&iter, hash_table);
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     // do something with key and value
     *   }
     * }</pre>
     */
    public void init(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_iter_init.invokeExact(handle(), hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_iter_next = Interop.downcallHandle(
        "g_hash_table_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Advances {@code iter} and retrieves the key and/or value that are now
     * pointed to as a result of this advancement. If {@code false} is returned,
     * {@code key} and {@code value} are not set, and the iterator becomes invalid.
     */
    public boolean next(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_iter_next.invokeExact(handle(), key, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_iter_remove = Interop.downcallHandle(
        "g_hash_table_iter_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the key/value pair currently pointed to by the iterator
     * from its associated {@link HashTable}. Can only be called after
     * g_hash_table_iter_next() returned {@code true}, and cannot be called
     * more than once for the same key/value pair.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(),
     * the key and value are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     * <p>
     * It is safe to continue iterating the {@link HashTable} afterward:
     * <pre>{@code <!-- language="C" -->
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     if (condition)
     *       g_hash_table_iter_remove (&iter);
     *   }
     * }</pre>
     */
    public void remove() {
        try {
            g_hash_table_iter_remove.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_iter_replace = Interop.downcallHandle(
        "g_hash_table_iter_replace",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replaces the value currently pointed to by the iterator
     * from its associated {@link HashTable}. Can only be called after
     * g_hash_table_iter_next() returned {@code true}.
     * <p>
     * If you supplied a {@code value_destroy_func} when creating the
     * {@link HashTable}, the old value is freed using that function.
     */
    public void replace(java.lang.foreign.MemoryAddress value) {
        try {
            g_hash_table_iter_replace.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_iter_steal = Interop.downcallHandle(
        "g_hash_table_iter_steal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated {@link HashTable}, without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned {@code true}, and cannot
     * be called more than once for the same key/value pair.
     */
    public void steal() {
        try {
            g_hash_table_iter_steal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
