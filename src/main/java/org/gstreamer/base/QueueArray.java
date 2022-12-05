package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link QueueArray} is an object that provides standard queue functionality
 * based on an array instead of linked lists. This reduces the overhead
 * caused by memory management by a large factor.
 */
public class QueueArray extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstQueueArray";
    
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
     * Allocate a new {@link QueueArray}
     * @return A new, uninitialized @{link QueueArray}
     */
    public static QueueArray allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        QueueArray newInstance = new QueueArray(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a QueueArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public QueueArray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Clears queue {@code array} and frees all memory associated to it.
     */
    public void clear() {
        try {
            DowncallHandles.gst_queue_array_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Drops the queue element at position {@code idx} from queue {@code array}.
     * @param idx index to drop
     * @return the dropped element
     */
    public @Nullable java.lang.foreign.MemoryAddress dropElement(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_drop_element.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Drops the queue element at position {@code idx} from queue {@code array} and copies the
     * data of the element or structure that was removed into {@code p_struct} if
     * {@code p_struct} is set (not NULL).
     * @param idx index to drop
     * @param pStruct address into which to store the data of the dropped structure, or NULL
     * @return TRUE on success, or FALSE on error
     */
    public boolean dropStruct(int idx, @Nullable java.lang.foreign.MemoryAddress pStruct) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_queue_array_drop_struct.invokeExact(
                    handle(),
                    idx,
                    (Addressable) (pStruct == null ? MemoryAddress.NULL : (Addressable) pStruct));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Finds an element in the queue {@code array}, either by comparing every element
     * with {@code func} or by looking up {@code data} if no compare function {@code func} is provided,
     * and returning the index of the found element.
     * @param func comparison function, or {@code null} to find {@code data} by value
     * @return Index of the found element or -1 if nothing was found.
     */
    public int find(@Nullable org.gtk.glib.CompareFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_queue_array_find.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstBase.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees queue {@code array} and all memory associated to it.
     */
    public void free() {
        try {
            DowncallHandles.gst_queue_array_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the length of the queue {@code array}
     * @return the length of the queue {@code array}.
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_queue_array_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if the queue {@code array} is empty.
     * @return {@code true} if the queue {@code array} is empty
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_queue_array_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the head of the queue {@code array} and does not
     * remove it from the queue.
     * @return The head of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress peekHead() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_head.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the head of the queue {@code array} without removing it from the queue.
     * @return pointer to element or struct, or NULL if {@code array} was empty. The
     *    data pointed to by the returned pointer stays valid only as long as
     *    the queue array is not modified further!
     */
    public @Nullable java.lang.foreign.MemoryAddress peekHeadStruct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_head_struct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the item at {@code idx} in {@code array}, but does not remove it from the queue.
     * @return The item, or {@code null} if {@code idx} was out of bounds
     */
    public @Nullable java.lang.foreign.MemoryAddress peekNth(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_nth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the item at {@code idx} in {@code array}, but does not remove it from the queue.
     * @return The item, or {@code null} if {@code idx} was out of bounds
     */
    public @Nullable java.lang.foreign.MemoryAddress peekNthStruct(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_nth_struct.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the tail of the queue {@code array}, but does not remove it from the queue.
     * @return The tail of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress peekTail() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_tail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the tail of the queue {@code array}, but does not remove it from the queue.
     * @return The tail of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress peekTailStruct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_peek_tail_struct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns and head of the queue {@code array} and removes
     * it from the queue.
     * @return The head of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress popHead() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_pop_head.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the head of the queue {@code array} and removes it from the queue.
     * @return pointer to element or struct, or NULL if {@code array} was empty. The
     *    data pointed to by the returned pointer stays valid only as long as
     *    the queue array is not modified further!
     */
    public @Nullable java.lang.foreign.MemoryAddress popHeadStruct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_pop_head_struct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the tail of the queue {@code array} and removes
     * it from the queue.
     * @return The tail of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress popTail() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_pop_tail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the tail of the queue {@code array} and removes
     * it from the queue.
     * @return The tail of the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress popTailStruct() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_pop_tail_struct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pushes {@code data} to the tail of the queue {@code array}.
     * @param data object to push
     */
    public void pushTail(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.gst_queue_array_push_tail.invokeExact(
                    handle(),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void pushTailStruct(@Nullable java.lang.foreign.MemoryAddress pStruct) {
        try {
            DowncallHandles.gst_queue_array_push_tail_struct.invokeExact(
                    handle(),
                    (Addressable) (pStruct == null ? MemoryAddress.NULL : (Addressable) pStruct));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a function to clear an element of {@code array}.
     * <p>
     * The {@code clear_func} will be called when an element in the array
     * data segment is removed and when the array is freed and data
     * segment is deallocated as well. {@code clear_func} will be passed a
     * pointer to the element to clear, rather than the element itself.
     * <p>
     * Note that in contrast with other uses of {@link org.gtk.glib.DestroyNotify}
     * functions, {@code clear_func} is expected to clear the contents of
     * the array element it is given, but not free the element itself.
     * @param clearFunc a function to clear an element of {@code array}
     */
    public void setClearFunc(@NotNull org.gtk.glib.DestroyNotify clearFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Allocates a new {@link QueueArray} object with an initial
     * queue size of {@code initial_size}.
     * @param initialSize Initial size of the new queue
     * @return a new {@link QueueArray} object
     */
    public static @NotNull org.gstreamer.base.QueueArray new_(int initialSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new.invokeExact(
                    initialSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.QueueArray(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Allocates a new {@link QueueArray} object for elements (e.g. structures)
     * of size {@code struct_size}, with an initial queue size of {@code initial_size}.
     * @param structSize Size of each element (e.g. structure) in the array
     * @param initialSize Initial size of the new queue
     * @return a new {@link QueueArray} object
     */
    public static @NotNull org.gstreamer.base.QueueArray newForStruct(long structSize, int initialSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_queue_array_new_for_struct.invokeExact(
                    structSize,
                    initialSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.QueueArray(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_queue_array_clear = Interop.downcallHandle(
            "gst_queue_array_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_drop_element = Interop.downcallHandle(
            "gst_queue_array_drop_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_queue_array_drop_struct = Interop.downcallHandle(
            "gst_queue_array_drop_struct",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_find = Interop.downcallHandle(
            "gst_queue_array_find",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_free = Interop.downcallHandle(
            "gst_queue_array_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_get_length = Interop.downcallHandle(
            "gst_queue_array_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_is_empty = Interop.downcallHandle(
            "gst_queue_array_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_head = Interop.downcallHandle(
            "gst_queue_array_peek_head",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_head_struct = Interop.downcallHandle(
            "gst_queue_array_peek_head_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_nth = Interop.downcallHandle(
            "gst_queue_array_peek_nth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_nth_struct = Interop.downcallHandle(
            "gst_queue_array_peek_nth_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_tail = Interop.downcallHandle(
            "gst_queue_array_peek_tail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_peek_tail_struct = Interop.downcallHandle(
            "gst_queue_array_peek_tail_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_pop_head = Interop.downcallHandle(
            "gst_queue_array_pop_head",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_pop_head_struct = Interop.downcallHandle(
            "gst_queue_array_pop_head_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_pop_tail = Interop.downcallHandle(
            "gst_queue_array_pop_tail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_pop_tail_struct = Interop.downcallHandle(
            "gst_queue_array_pop_tail_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_push_tail = Interop.downcallHandle(
            "gst_queue_array_push_tail",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_push_tail_struct = Interop.downcallHandle(
            "gst_queue_array_push_tail_struct",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_set_clear_func = Interop.downcallHandle(
            "gst_queue_array_set_clear_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_queue_array_new = Interop.downcallHandle(
            "gst_queue_array_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_queue_array_new_for_struct = Interop.downcallHandle(
            "gst_queue_array_new_for_struct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
    }
}
