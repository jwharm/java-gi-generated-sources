package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Buffer lists are an object containing a list of buffers.
 * <p>
 * Buffer lists are created with gst_buffer_list_new() and filled with data
 * using gst_buffer_list_insert().
 * <p>
 * Buffer lists can be pushed on a srcpad with gst_pad_push_list(). This is
 * interesting when multiple buffers need to be pushed in one go because it
 * can reduce the amount of overhead for pushing each buffer individually.
 */
public class BufferList extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferList";
    
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
     * Allocate a new {@link BufferList}
     * @return A new, uninitialized @{link BufferList}
     */
    public static BufferList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BufferList newInstance = new BufferList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BufferList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BufferList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_list_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty {@link BufferList}.
     */
    public BufferList() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewSized(int size) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_list_new_sized.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty {@link BufferList}. The list will have {@code size} space
     * preallocated so that memory reallocations can be avoided.
     * @param size an initial reserved size
     * @return the new {@link BufferList}.
     */
    public static BufferList newSized(int size) {
        return new BufferList(constructNewSized(size), Ownership.FULL);
    }
    
    /**
     * Calculates the size of the data contained in {@code list} by adding the
     * size of all buffers.
     * @return the size of the data contained in {@code list} in bytes.
     */
    public long calculateSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_buffer_list_calculate_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a copy of the given buffer list. This will make a newly allocated
     * copy of the buffers that the source buffer list contains.
     * @return a new copy of {@code list}.
     */
    public @NotNull org.gstreamer.gst.BufferList copyDeep() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_list_copy_deep.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferList(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls {@code func} with {@code data} for each buffer in {@code list}.
     * <p>
     * {@code func} can modify the passed buffer pointer or its contents. The return value
     * of {@code func} defines if this function returns or if the remaining buffers in
     * the list should be skipped.
     * @param func a {@link BufferListFunc} to call
     * @return {@code true} when {@code func} returned {@code true} for each buffer in {@code list} or when
     * {@code list} is empty.
     */
    public boolean foreach(@NotNull org.gstreamer.gst.BufferListFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_list_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbBufferListFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the buffer at {@code idx}.
     * <p>
     * You must make sure that {@code idx} does not exceed the number of
     * buffers available.
     * @param idx the index
     * @return the buffer at {@code idx} in {@code group}
     *     or {@code null} when there is no buffer. The buffer remains valid as
     *     long as {@code list} is valid and buffer is not removed from the list.
     */
    public @Nullable org.gstreamer.gst.Buffer get(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_list_get.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the buffer at {@code idx}, ensuring it is a writable buffer.
     * <p>
     * You must make sure that {@code idx} does not exceed the number of
     * buffers available.
     * @param idx the index
     * @return the buffer at {@code idx} in {@code group}.
     *     The returned  buffer remains valid as long as {@code list} is valid and
     *     the buffer is not removed from the list.
     */
    public @Nullable org.gstreamer.gst.Buffer getWritable(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_list_get_writable.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Inserts {@code buffer} at {@code idx} in {@code list}. Other buffers are moved to make room for
     * this new buffer.
     * <p>
     * A -1 value for {@code idx} will append the buffer at the end.
     * @param idx the index
     * @param buffer a {@link Buffer}
     */
    public void insert(int idx, @NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.gst_buffer_list_insert.invokeExact(
                    handle(),
                    idx,
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
    }
    
    /**
     * Returns the number of buffers in {@code list}.
     * @return the number of buffers in the buffer list
     */
    public int length() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_list_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes {@code length} buffers starting from {@code idx} in {@code list}. The following buffers
     * are moved to close the gap.
     * @param idx the index
     * @param length the amount to remove
     */
    public void remove(int idx, int length) {
        try {
            DowncallHandles.gst_buffer_list_remove.invokeExact(
                    handle(),
                    idx,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_list_new = Interop.downcallHandle(
            "gst_buffer_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_new_sized = Interop.downcallHandle(
            "gst_buffer_list_new_sized",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_list_calculate_size = Interop.downcallHandle(
            "gst_buffer_list_calculate_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_copy_deep = Interop.downcallHandle(
            "gst_buffer_list_copy_deep",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_foreach = Interop.downcallHandle(
            "gst_buffer_list_foreach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_get = Interop.downcallHandle(
            "gst_buffer_list_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_list_get_writable = Interop.downcallHandle(
            "gst_buffer_list_get_writable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_list_insert = Interop.downcallHandle(
            "gst_buffer_list_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_length = Interop.downcallHandle(
            "gst_buffer_list_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_list_remove = Interop.downcallHandle(
            "gst_buffer_list_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BufferList struct;
        
         /**
         * A {@link BufferList.Build} object constructs a {@link BufferList} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BufferList.allocate();
        }
        
         /**
         * Finish building the {@link BufferList} struct.
         * @return A new instance of {@code BufferList} with the fields 
         *         that were set in the Build object.
         */
        public BufferList construct() {
            return struct;
        }
    }
}
