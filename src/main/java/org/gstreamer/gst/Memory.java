package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstMemory is a lightweight refcounted object that wraps a region of memory.
 * They are typically used to manage the data of a {@link Buffer}.
 * <p>
 * A GstMemory object has an allocated region of memory of maxsize. The maximum
 * size does not change during the lifetime of the memory object. The memory
 * also has an offset and size property that specifies the valid range of memory
 * in the allocated region.
 * <p>
 * Memory is usually created by allocators with a gst_allocator_alloc()
 * method call. When {@code null} is used as the allocator, the default allocator will
 * be used.
 * <p>
 * New allocators can be registered with gst_allocator_register().
 * Allocators are identified by name and can be retrieved with
 * gst_allocator_find(). gst_allocator_set_default() can be used to change the
 * default allocator.
 * <p>
 * New memory can be created with gst_memory_new_wrapped() that wraps the memory
 * allocated elsewhere.
 * <p>
 * Refcounting of the memory block is performed with gst_memory_ref() and
 * gst_memory_unref().
 * <p>
 * The size of the memory can be retrieved and changed with
 * gst_memory_get_sizes() and gst_memory_resize() respectively.
 * <p>
 * Getting access to the data of the memory is performed with gst_memory_map().
 * The call will return a pointer to offset bytes into the region of memory.
 * After the memory access is completed, gst_memory_unmap() should be called.
 * <p>
 * Memory can be copied with gst_memory_copy(), which will return a writable
 * copy. gst_memory_share() will create a new memory block that shares the
 * memory with an existing memory block at a custom offset and with a custom
 * size.
 * <p>
 * Memory can be efficiently merged when gst_memory_is_span() returns {@code true}.
 */
public class Memory extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMemory";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
        Interop.valueLayout.ADDRESS.withName("allocator"),
        Interop.valueLayout.ADDRESS.withName("parent"),
        Interop.valueLayout.C_LONG.withName("maxsize"),
        Interop.valueLayout.C_LONG.withName("align"),
        Interop.valueLayout.C_LONG.withName("offset"),
        Interop.valueLayout.C_LONG.withName("size")
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
     * Allocate a new {@link Memory}
     * @return A new, uninitialized @{link Memory}
     */
    public static Memory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Memory newInstance = new Memory(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject miniObject$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code allocator}
     * @return The value of the field {@code allocator}
     */
    public org.gstreamer.gst.Allocator allocator$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allocator"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Allocator(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code allocator}
     * @param allocator The new value of the field {@code allocator}
     */
    public void allocator$set(org.gstreamer.gst.Allocator allocator) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allocator"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocator.handle());
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Memory parent$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Memory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void parent$set(org.gstreamer.gst.Memory parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parent.handle());
    }
    
    /**
     * Get the value of the field {@code maxsize}
     * @return The value of the field {@code maxsize}
     */
    public long maxsize$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("maxsize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code maxsize}
     * @param maxsize The new value of the field {@code maxsize}
     */
    public void maxsize$set(long maxsize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("maxsize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxsize);
    }
    
    /**
     * Get the value of the field {@code align}
     * @return The value of the field {@code align}
     */
    public long align$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("align"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code align}
     * @param align The new value of the field {@code align}
     */
    public void align$set(long align) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("align"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), align);
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long offset$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void offset$set(long offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long size$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void size$set(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Create a Memory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Memory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewWrapped(@NotNull org.gstreamer.gst.MemoryFlags flags, @NotNull byte[] data, long maxsize, long offset, long size, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_memory_new_wrapped.invokeExact(
                    flags.getValue(),
                    Interop.allocateNativeArray(data, false),
                    maxsize,
                    offset,
                    size,
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new memory block that wraps the given {@code data}.
     * <p>
     * The prefix/padding must be filled with 0 if {@code flags} contains
     * {@code GST_MEMORY_FLAG_ZERO_PREFIXED} and {@code GST_MEMORY_FLAG_ZERO_PADDED} respectively.
     * @param flags {@link MemoryFlags}
     * @param data data to
     *   wrap
     * @param maxsize allocated size of {@code data}
     * @param offset offset in {@code data}
     * @param size size of valid data
     * @param userData user_data
     * @param notify called with {@code user_data} when the memory is freed
     * @return a new {@link Memory}.
     */
    public static Memory newWrapped(@NotNull org.gstreamer.gst.MemoryFlags flags, @NotNull byte[] data, long maxsize, long offset, long size, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        return new Memory(constructNewWrapped(flags, data, maxsize, offset, size, userData, notify), Ownership.FULL);
    }
    
    /**
     * Return a copy of {@code size} bytes from {@code mem} starting from {@code offset}. This copy is
     * guaranteed to be writable. {@code size} can be set to -1 to return a copy
     * from {@code offset} to the end of the memory region.
     * @param offset offset to copy from
     * @param size size to copy, or -1 to copy to the end of the memory region
     * @return a new {@link Memory}.
     */
    public @NotNull org.gstreamer.gst.Memory copy(long offset, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_memory_copy.invokeExact(
                    handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the current {@code size}, {@code offset} and {@code maxsize} of {@code mem}.
     * @param offset pointer to offset
     * @param maxsize pointer to maxsize
     * @return the current size of {@code mem}
     */
    public long getSizes(Out<Long> offset, Out<Long> maxsize) {
        java.util.Objects.requireNonNull(offset, "Parameter 'offset' must not be null");
        MemorySegment offsetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(maxsize, "Parameter 'maxsize' must not be null");
        MemorySegment maxsizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_memory_get_sizes.invokeExact(
                    handle(),
                    (Addressable) offsetPOINTER.address(),
                    (Addressable) maxsizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        offset.set(offsetPOINTER.get(Interop.valueLayout.C_LONG, 0));
        maxsize.set(maxsizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Initializes a newly allocated {@code mem} with the given parameters. This function
     * will call gst_mini_object_init() with the default memory parameters.
     * @param flags {@link MemoryFlags}
     * @param allocator the {@link Allocator}
     * @param parent the parent of {@code mem}
     * @param maxsize the total size of the memory
     * @param align the alignment of the memory
     * @param offset The offset in the memory
     * @param size the size of valid data in the memory
     */
    public void init(@NotNull org.gstreamer.gst.MemoryFlags flags, @NotNull org.gstreamer.gst.Allocator allocator, @NotNull org.gstreamer.gst.Memory parent, long maxsize, long align, long offset, long size) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        try {
            DowncallHandles.gst_memory_init.invokeExact(
                    handle(),
                    flags.getValue(),
                    allocator.handle(),
                    parent.handle(),
                    maxsize,
                    align,
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if {@code mem1} and mem2 share the memory with a common parent memory object
     * and that the memory is contiguous.
     * <p>
     * If this is the case, the memory of {@code mem1} and {@code mem2} can be merged
     * efficiently by performing gst_memory_share() on the parent object from
     * the returned {@code offset}.
     * @param mem2 a {@link Memory}
     * @param offset a pointer to a result offset
     * @return {@code true} if the memory is contiguous and of a common parent.
     */
    public boolean isSpan(@NotNull org.gstreamer.gst.Memory mem2, Out<Long> offset) {
        java.util.Objects.requireNonNull(mem2, "Parameter 'mem2' must not be null");
        java.util.Objects.requireNonNull(offset, "Parameter 'offset' must not be null");
        MemorySegment offsetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_memory_is_span.invokeExact(
                    handle(),
                    mem2.handle(),
                    (Addressable) offsetPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        offset.set(offsetPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Check if {@code mem} if allocated with an allocator for {@code mem_type}.
     * @param memType a memory type
     * @return {@code true} if {@code mem} was allocated from an allocator for {@code mem_type}.
     */
    public boolean isType(@NotNull java.lang.String memType) {
        java.util.Objects.requireNonNull(memType, "Parameter 'memType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_memory_is_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(memType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Create a {@link Memory} object that is mapped with {@code flags}. If {@code mem} is mappable
     * with {@code flags}, this function returns the mapped {@code mem} directly. Otherwise a
     * mapped copy of {@code mem} is returned.
     * <p>
     * This function takes ownership of old {@code mem} and returns a reference to a new
     * {@link Memory}.
     * @param info pointer for info
     * @param flags mapping flags
     * @return a {@link Memory} object mapped
     * with {@code flags} or {@code null} when a mapping is not possible.
     */
    public @Nullable org.gstreamer.gst.Memory makeMapped(@NotNull org.gstreamer.gst.MapInfo info, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_memory_make_mapped.invokeExact(
                    handle(),
                    info.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    /**
     * Fill {@code info} with the pointer and sizes of the memory in {@code mem} that can be
     * accessed according to {@code flags}.
     * <p>
     * This function can return {@code false} for various reasons:
     * <ul>
     * <li>the memory backed by {@code mem} is not accessible with the given {@code flags}.
     * <li>the memory was already mapped with a different mapping.
     * </ul>
     * <p>
     * {@code info} and its contents remain valid for as long as {@code mem} is valid and
     * until gst_memory_unmap() is called.
     * <p>
     * For each gst_memory_map() call, a corresponding gst_memory_unmap() call
     * should be done.
     * @param info pointer for info
     * @param flags mapping flags
     * @return {@code true} if the map operation was successful.
     */
    public boolean map(@NotNull org.gstreamer.gst.MapInfo info, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_memory_map.invokeExact(
                    handle(),
                    info.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Resize the memory region. {@code mem} should be writable and offset + size should be
     * less than the maxsize of {@code mem}.
     * <p>
     * {@code GST_MEMORY_FLAG_ZERO_PREFIXED} and {@code GST_MEMORY_FLAG_ZERO_PADDED} will be
     * cleared when offset or padding is increased respectively.
     * @param offset a new offset
     * @param size a new size
     */
    public void resize(long offset, long size) {
        try {
            DowncallHandles.gst_memory_resize.invokeExact(
                    handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Return a shared copy of {@code size} bytes from {@code mem} starting from {@code offset}. No
     * memory copy is performed and the memory region is simply shared. The result
     * is guaranteed to be non-writable. {@code size} can be set to -1 to return a shared
     * copy from {@code offset} to the end of the memory region.
     * @param offset offset to share from
     * @param size size to share, or -1 to share to the end of the memory region
     * @return a new {@link Memory}.
     */
    public @NotNull org.gstreamer.gst.Memory share(long offset, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_memory_share.invokeExact(
                    handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    /**
     * Release the memory obtained with gst_memory_map()
     * @param info a {@link MapInfo}
     */
    public void unmap(@NotNull org.gstreamer.gst.MapInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.gst_memory_unmap.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_memory_new_wrapped = Interop.downcallHandle(
            "gst_memory_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_memory_copy = Interop.downcallHandle(
            "gst_memory_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_memory_get_sizes = Interop.downcallHandle(
            "gst_memory_get_sizes",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_memory_init = Interop.downcallHandle(
            "gst_memory_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_memory_is_span = Interop.downcallHandle(
            "gst_memory_is_span",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_memory_is_type = Interop.downcallHandle(
            "gst_memory_is_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_memory_make_mapped = Interop.downcallHandle(
            "gst_memory_make_mapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_memory_map = Interop.downcallHandle(
            "gst_memory_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_memory_resize = Interop.downcallHandle(
            "gst_memory_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_memory_share = Interop.downcallHandle(
            "gst_memory_share",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_memory_unmap = Interop.downcallHandle(
            "gst_memory_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Memory struct;
        
         /**
         * A {@link Memory.Build} object constructs a {@link Memory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Memory.allocate();
        }
        
         /**
         * Finish building the {@link Memory} struct.
         * @return A new instance of {@code Memory} with the fields 
         *         that were set in the Build object.
         */
        public Memory construct() {
            return struct;
        }
        
        /**
         * parent structure
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
        
        /**
         * pointer to the {@link Allocator}
         * @param allocator The value for the {@code allocator} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllocator(org.gstreamer.gst.Allocator allocator) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocator"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()));
            return this;
        }
        
        /**
         * parent memory block
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.Memory parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the maximum size allocated
         * @param maxsize The value for the {@code maxsize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxsize(long maxsize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("maxsize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxsize);
            return this;
        }
        
        /**
         * the alignment of the memory
         * @param align The value for the {@code align} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlign(long align) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("align"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), align);
            return this;
        }
        
        /**
         * the offset where valid data starts
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffset(long offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
            return this;
        }
        
        /**
         * the size of valid data
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
    }
}
