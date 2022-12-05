package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstGLBaseMemory is a {@link org.gstreamer.gst.Memory} subclass providing the basis of support
 * for the mapping of GL buffers.
 * <p>
 * Data is uploaded or downloaded from the GPU as is necessary.
 */
public class GLBaseMemory extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseMemory";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Memory.getMemoryLayout().withName("mem"),
        Interop.valueLayout.ADDRESS.withName("context"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
        Interop.valueLayout.C_INT.withName("map_flags"),
        Interop.valueLayout.C_INT.withName("map_count"),
        Interop.valueLayout.C_INT.withName("gl_map_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("query"),
        Interop.valueLayout.C_LONG.withName("alloc_size"),
        Interop.valueLayout.ADDRESS.withName("alloc_data"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link GLBaseMemory}
     * @return A new, uninitialized @{link GLBaseMemory}
     */
    public static GLBaseMemory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBaseMemory newInstance = new GLBaseMemory(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gst.Memory mem$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
        return new org.gstreamer.gst.Memory(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code context}
     * @return The value of the field {@code context}
     */
    public org.gstreamer.gl.GLContext context$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code context}
     * @param context The new value of the field {@code context}
     */
    public void context$set(org.gstreamer.gl.GLContext context) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), context.handle());
    }
    
    /**
     * Get the value of the field {@code lock}
     * @return The value of the field {@code lock}
     */
    public org.gtk.glib.Mutex lock$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Mutex(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code lock}
     * @param lock The new value of the field {@code lock}
     */
    public void lock$set(org.gtk.glib.Mutex lock) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lock.handle());
    }
    
    /**
     * Get the value of the field {@code map_flags}
     * @return The value of the field {@code map_flags}
     */
    public org.gstreamer.gst.MapFlags mapFlags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MapFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code map_flags}
     * @param mapFlags The new value of the field {@code map_flags}
     */
    public void mapFlags$set(org.gstreamer.gst.MapFlags mapFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapFlags.getValue());
    }
    
    /**
     * Get the value of the field {@code map_count}
     * @return The value of the field {@code map_count}
     */
    public int mapCount$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code map_count}
     * @param mapCount The new value of the field {@code map_count}
     */
    public void mapCount$set(int mapCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapCount);
    }
    
    /**
     * Get the value of the field {@code gl_map_count}
     * @return The value of the field {@code gl_map_count}
     */
    public int glMapCount$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gl_map_count}
     * @param glMapCount The new value of the field {@code gl_map_count}
     */
    public void glMapCount$set(int glMapCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glMapCount);
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) data);
    }
    
    /**
     * Get the value of the field {@code query}
     * @return The value of the field {@code query}
     */
    public org.gstreamer.gl.GLQuery query$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gl.GLQuery(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void query$set(org.gstreamer.gl.GLQuery query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), query.handle());
    }
    
    /**
     * Create a GLBaseMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBaseMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Note: only intended for subclass usage to allocate the system memory buffer
     * on demand.  If there is already a non-NULL data pointer in {@code gl_mem}-&gt;data,
     * then this function imply returns TRUE.
     * @return whether the system memory could be allocated
     */
    public boolean allocData() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_memory_alloc_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code mem} with the required parameters
     * @param allocator the {@link org.gstreamer.gst.Allocator} to initialize with
     * @param parent the parent {@link org.gstreamer.gst.Memory} to initialize with
     * @param context the {@link GLContext} to initialize with
     * @param params the {@code GstAllocationParams} to initialize with
     * @param size the number of bytes to be allocated
     * @param userData user data to call {@code notify} with
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void init(@NotNull org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.Memory parent, @NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams params, long size, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        try {
            DowncallHandles.gst_gl_base_memory_init.invokeExact(
                    handle(),
                    allocator.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    context.handle(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()),
                    size,
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean memcpy(@NotNull org.gstreamer.gl.GLBaseMemory dest, long offset, long size) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_memory_memcpy.invokeExact(
                    handle(),
                    dest.handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull org.gstreamer.gl.GLBaseMemory alloc(@NotNull org.gstreamer.gl.GLBaseMemoryAllocator allocator, @NotNull org.gstreamer.gl.GLAllocationParams params) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_base_memory_alloc.invokeExact(
                    allocator.handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLBaseMemory(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes the GL Base Memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLBaseMemory operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_base_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_base_memory_alloc_data = Interop.downcallHandle(
            "gst_gl_base_memory_alloc_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_init = Interop.downcallHandle(
            "gst_gl_base_memory_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_memcpy = Interop.downcallHandle(
            "gst_gl_base_memory_memcpy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_alloc = Interop.downcallHandle(
            "gst_gl_base_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_init_once = Interop.downcallHandle(
            "gst_gl_base_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLBaseMemory struct;
        
         /**
         * A {@link GLBaseMemory.Build} object constructs a {@link GLBaseMemory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLBaseMemory.allocate();
        }
        
         /**
         * Finish building the {@link GLBaseMemory} struct.
         * @return A new instance of {@code GLBaseMemory} with the fields 
         *         that were set in the Build object.
         */
        public GLBaseMemory construct() {
            return struct;
        }
        
        /**
         * the parent object
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMem(org.gstreamer.gst.Memory mem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
            return this;
        }
        
        /**
         * the {@link GLContext} to use for GL operations
         * @param context The value for the {@code context} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContext(org.gstreamer.gl.GLContext context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
            return this;
        }
        
        public Build setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        public Build setMapFlags(org.gstreamer.gst.MapFlags mapFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mapFlags == null ? MemoryAddress.NULL : mapFlags.getValue()));
            return this;
        }
        
        public Build setMapCount(int mapCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapCount);
            return this;
        }
        
        public Build setGlMapCount(int glMapCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), glMapCount);
            return this;
        }
        
        public Build setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        public Build setQuery(org.gstreamer.gl.GLQuery query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.handle()));
            return this;
        }
        
        public Build setAllocSize(long allocSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocSize);
            return this;
        }
        
        public Build setAllocData(java.lang.foreign.MemoryAddress allocData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocData == null ? MemoryAddress.NULL : (Addressable) allocData));
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
