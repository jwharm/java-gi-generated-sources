package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a {@code GtkBitset}.
 * <p>
 * Before a {@code GtkBitsetIter} can be used, it needs to be initialized with
 * {@link BitsetIter#initFirst}, {@link BitsetIter#initLast}
 * or {@link BitsetIter#initAt}.
 */
public class BitsetIter extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBitsetIter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(10, Interop.valueLayout.ADDRESS).withName("private_data")
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
    
    /**
     * Allocate a new {@link BitsetIter}
     * @return A new, uninitialized @{link BitsetIter}
     */
    public static BitsetIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BitsetIter newInstance = new BitsetIter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BitsetIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BitsetIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Gets the current value that {@code iter} points to.
     * <p>
     * If {@code iter} is not valid and {@link BitsetIter#isValid}
     * returns {@code false}, this function returns 0.
     * @return The current value pointer to by {@code iter}
     */
    public int getValue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code iter} points to a valid value.
     * @return {@code true} if {@code iter} points to a valid value
     */
    public boolean isValid() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_is_valid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the next value in the set.
     * <p>
     * If it was already pointing to the last value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     * @param value Set to the next value
     * @return {@code true} if a next value existed
     */
    public boolean next(Out<Integer> value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_next.invokeExact(
                    handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the previous value in the set.
     * <p>
     * If it was already pointing to the first value in the set,
     * {@code false} is returned and {@code iter} is invalidated.
     * @param value Set to the previous value
     * @return {@code true} if a previous value existed
     */
    public boolean previous(Out<Integer> value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_previous.invokeExact(
                    handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code iter} to point to {@code target}.
     * <p>
     * If {@code target} is not found, finds the next value after it.
     * If no value &gt;= {@code target} exists in {@code set}, this function returns {@code false}.
     * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
     * @param set a {@code GtkBitset}
     * @param target target value to start iterating at
     * @param value Set to the found value in {@code set}
     * @return {@code true} if a value was found.
     */
    public static boolean initAt(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, int target, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_at.invokeExact(
                    iter.handle(),
                    set.handle(),
                    target,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the first
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned and {@code value} is set to {@code G_MAXUINT}.
     * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
     * @param set a {@code GtkBitset}
     * @param value Set to the first value in {@code set}
     * @return {@code true} if {@code set} isn't empty.
     */
    public static boolean initFirst(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_first.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Initializes an iterator for {@code set} and points it to the last
     * value in {@code set}.
     * <p>
     * If {@code set} is empty, {@code false} is returned.
     * @param iter a pointer to an uninitialized {@code GtkBitsetIter}
     * @param set a {@code GtkBitset}
     * @param value Set to the last value in {@code set}
     * @return {@code true} if {@code set} isn't empty.
     */
    public static boolean initLast(@NotNull org.gtk.gtk.BitsetIter iter, @NotNull org.gtk.gtk.Bitset set, Out<Integer> value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bitset_iter_init_last.invokeExact(
                    iter.handle(),
                    set.handle(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bitset_iter_get_value = Interop.downcallHandle(
            "gtk_bitset_iter_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_is_valid = Interop.downcallHandle(
            "gtk_bitset_iter_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_next = Interop.downcallHandle(
            "gtk_bitset_iter_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_previous = Interop.downcallHandle(
            "gtk_bitset_iter_previous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_at = Interop.downcallHandle(
            "gtk_bitset_iter_init_at",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_first = Interop.downcallHandle(
            "gtk_bitset_iter_init_first",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bitset_iter_init_last = Interop.downcallHandle(
            "gtk_bitset_iter_init_last",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BitsetIter struct;
        
         /**
         * A {@link BitsetIter.Build} object constructs a {@link BitsetIter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BitsetIter.allocate();
        }
        
         /**
         * Finish building the {@link BitsetIter} struct.
         * @return A new instance of {@code BitsetIter} with the fields 
         *         that were set in the Build object.
         */
        public BitsetIter construct() {
            return struct;
        }
        
        public Build setPrivateData(java.lang.foreign.MemoryAddress[] private_data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (private_data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(private_data, false)));
            return this;
        }
    }
}
