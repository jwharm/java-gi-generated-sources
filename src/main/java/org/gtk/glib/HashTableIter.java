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
public class HashTableIter extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHashTableIter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("dummy1"),
            Interop.valueLayout.ADDRESS.withName("dummy2"),
            Interop.valueLayout.ADDRESS.withName("dummy3"),
            Interop.valueLayout.C_INT.withName("dummy4"),
            Interop.valueLayout.C_INT.withName("dummy5"),
            Interop.valueLayout.ADDRESS.withName("dummy6")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link HashTableIter}
     * @return A new, uninitialized @{link HashTableIter}
     */
    public static HashTableIter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        HashTableIter newInstance = new HashTableIter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a HashTableIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected HashTableIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, HashTableIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new HashTableIter(input);
    
    /**
     * Returns the {@link HashTable} associated with {@code iter}.
     * @return the {@link HashTable} associated with {@code iter}.
     */
    public org.gtk.glib.HashTable getHashTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hash_table_iter_get_hash_table.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, null);
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
    public void init(org.gtk.glib.HashTable hashTable) {
        try {
            DowncallHandles.g_hash_table_iter_init.invokeExact(
                    handle(),
                    hashTable.handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment keyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_hash_table_iter_next.invokeExact(
                        handle(),
                        (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) keyPOINTER.address()),
                        (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (key != null) key.set(keyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
                    if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
        try {
            DowncallHandles.g_hash_table_iter_replace.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
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
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_hash_table_iter_init = Interop.downcallHandle(
                "g_hash_table_iter_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_hash_table_iter_next = Interop.downcallHandle(
                "g_hash_table_iter_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_hash_table_iter_remove = Interop.downcallHandle(
                "g_hash_table_iter_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_hash_table_iter_replace = Interop.downcallHandle(
                "g_hash_table_iter_replace",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_hash_table_iter_steal = Interop.downcallHandle(
                "g_hash_table_iter_steal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link HashTableIter.Builder} object constructs a {@link HashTableIter} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link HashTableIter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final HashTableIter struct;
        
        private Builder() {
            struct = HashTableIter.allocate();
        }
        
        /**
         * Finish building the {@link HashTableIter} struct.
         * @return A new instance of {@code HashTableIter} with the fields 
         *         that were set in the Builder object.
         */
        public HashTableIter build() {
            return struct;
        }
        
        public Builder setDummy1(java.lang.foreign.MemoryAddress dummy1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy1 == null ? MemoryAddress.NULL : (Addressable) dummy1));
                return this;
            }
        }
        
        public Builder setDummy2(java.lang.foreign.MemoryAddress dummy2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy2 == null ? MemoryAddress.NULL : (Addressable) dummy2));
                return this;
            }
        }
        
        public Builder setDummy3(java.lang.foreign.MemoryAddress dummy3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy3 == null ? MemoryAddress.NULL : (Addressable) dummy3));
                return this;
            }
        }
        
        public Builder setDummy4(int dummy4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), dummy4);
                return this;
            }
        }
        
        public Builder setDummy5(boolean dummy5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(dummy5, null).intValue());
                return this;
            }
        }
        
        public Builder setDummy6(java.lang.foreign.MemoryAddress dummy6) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy6"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy6 == null ? MemoryAddress.NULL : (Addressable) dummy6));
                return this;
            }
        }
    }
}
