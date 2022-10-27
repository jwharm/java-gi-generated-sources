package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("dummy1"),
        Interop.valueLayout.ADDRESS.withName("dummy2"),
        Interop.valueLayout.ADDRESS.withName("dummy3"),
        ValueLayout.JAVA_INT.withName("dummy4"),
        ValueLayout.JAVA_INT.withName("dummy5"),
        Interop.valueLayout.ADDRESS.withName("dummy6")
    ).withName("GHashTableIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public HashTableIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the {@link HashTable} associated with {@code iter}.
     * @return the {@link HashTable} associated with {@code iter}.
     */
    public @NotNull org.gtk.glib.HashTable getHashTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_iter_get_hash_table.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.HashTable(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a key/value pair iterator and associates it with
     * {@code hash_table}. Modifying the hash table after calling this function
     * invalidates the returned iterator.
     * <p>
     * The iteration order of a {@link HashTableIter} over the keys/values in a hash
     * table is not defined.
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
     * @param hashTable a {@link HashTable}
     */
    public void init(@NotNull org.gtk.glib.HashTable hashTable) {
        java.util.Objects.requireNonNull(hashTable, "Parameter 'hashTable' must not be null");
        try {
            DowncallHandles.g_hash_table_iter_init.invokeExact(handle(), hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Advances {@code iter} and retrieves the key and/or value that are now
     * pointed to as a result of this advancement. If {@code false} is returned,
     * {@code key} and {@code value} are not set, and the iterator becomes invalid.
     * @param key a location to store the key
     * @param value a location to store the value
     * @return {@code false} if the end of the {@link HashTable} has been reached.
     */
    public boolean next(@Nullable Out<java.lang.foreign.MemoryAddress> key, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
        java.util.Objects.requireNonNullElse(key, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        MemorySegment keyPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_iter_next.invokeExact(handle(), (Addressable) keyPOINTER.address(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        key.set(keyPOINTER.get(ValueLayout.ADDRESS, 0));
        value.set(valuePOINTER.get(ValueLayout.ADDRESS, 0));
        return RESULT != 0;
    }
    
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
            DowncallHandles.g_hash_table_iter_remove.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Replaces the value currently pointed to by the iterator
     * from its associated {@link HashTable}. Can only be called after
     * g_hash_table_iter_next() returned {@code true}.
     * <p>
     * If you supplied a {@code value_destroy_func} when creating the
     * {@link HashTable}, the old value is freed using that function.
     * @param value the value to replace with
     */
    public void replace(@Nullable java.lang.foreign.MemoryAddress value) {
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        try {
            DowncallHandles.g_hash_table_iter_replace.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated {@link HashTable}, without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned {@code true}, and cannot
     * be called more than once for the same key/value pair.
     */
    public void steal() {
        try {
            DowncallHandles.g_hash_table_iter_steal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hash_table_iter_get_hash_table = Interop.downcallHandle(
            "g_hash_table_iter_get_hash_table",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hash_table_iter_init = Interop.downcallHandle(
            "g_hash_table_iter_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hash_table_iter_next = Interop.downcallHandle(
            "g_hash_table_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hash_table_iter_remove = Interop.downcallHandle(
            "g_hash_table_iter_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hash_table_iter_replace = Interop.downcallHandle(
            "g_hash_table_iter_replace",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hash_table_iter_steal = Interop.downcallHandle(
            "g_hash_table_iter_steal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
