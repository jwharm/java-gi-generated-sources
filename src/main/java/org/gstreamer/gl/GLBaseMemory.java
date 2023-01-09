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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBaseMemory}
     * @return A new, uninitialized @{link GLBaseMemory}
     */
    public static GLBaseMemory allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBaseMemory newInstance = new GLBaseMemory(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gst.Memory getMem() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
        return org.gstreamer.gst.Memory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mem}
     * @param mem The new value of the field {@code mem}
     */
    public void setMem(org.gstreamer.gst.Memory mem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code context}
     * @return The value of the field {@code context}
     */
    public org.gstreamer.gl.GLContext getContext() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gl.GLContext) Interop.register(RESULT, org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code context}
     * @param context The new value of the field {@code context}
     */
    public void setContext(org.gstreamer.gl.GLContext context) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code lock}
     * @return The value of the field {@code lock}
     */
    public org.gtk.glib.Mutex getLock() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.Mutex.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code lock}
     * @param lock The new value of the field {@code lock}
     */
    public void setLock(org.gtk.glib.Mutex lock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code map_flags}
     * @return The value of the field {@code map_flags}
     */
    public org.gstreamer.gst.MapFlags getMapFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.MapFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code map_flags}
     * @param mapFlags The new value of the field {@code map_flags}
     */
    public void setMapFlags(org.gstreamer.gst.MapFlags mapFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapFlags == null ? MemoryAddress.NULL : mapFlags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code map_count}
     * @return The value of the field {@code map_count}
     */
    public int getMapCount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code map_count}
     * @param mapCount The new value of the field {@code map_count}
     */
    public void setMapCount(int mapCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), mapCount);
        }
    }
    
    /**
     * Get the value of the field {@code gl_map_count}
     * @return The value of the field {@code gl_map_count}
     */
    public int getGlMapCount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code gl_map_count}
     * @param glMapCount The new value of the field {@code gl_map_count}
     */
    public void setGlMapCount(int glMapCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), glMapCount);
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Get the value of the field {@code query}
     * @return The value of the field {@code query}
     */
    public org.gstreamer.gl.GLQuery getQuery() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gl.GLQuery.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(org.gstreamer.gl.GLQuery query) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.handle()));
        }
    }
    
    /**
     * Create a GLBaseMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBaseMemory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBaseMemory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseMemory(input);
    
    /**
     * Note: only intended for subclass usage to allocate the system memory buffer
     * on demand.  If there is already a non-NULL data pointer in {@code gl_mem}-&gt;data,
     * then this function imply returns TRUE.
     * @return whether the system memory could be allocated
     */
    public boolean allocData() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_memory_alloc_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Initializes {@code mem} with the required parameters
     * @param allocator the {@link org.gstreamer.gst.Allocator} to initialize with
     * @param parent the parent {@link org.gstreamer.gst.Memory} to initialize with
     * @param context the {@link GLContext} to initialize with
     * @param params the {@code GstAllocationParams} to initialize with
     * @param size the number of bytes to be allocated
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void init(org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.Memory parent, org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams params, long size, @Nullable org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_gl_base_memory_init.invokeExact(
                    handle(),
                    allocator.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    context.handle(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()),
                    size,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean memcpy(org.gstreamer.gl.GLBaseMemory dest, long offset, long size) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gl.GLBaseMemory alloc(org.gstreamer.gl.GLBaseMemoryAllocator allocator, org.gstreamer.gl.GLAllocationParams params) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_base_memory_alloc.invokeExact(
                    allocator.handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * A {@link GLBaseMemory.Builder} object constructs a {@link GLBaseMemory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBaseMemory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBaseMemory struct;
        
        private Builder() {
            struct = GLBaseMemory.allocate();
        }
        
        /**
         * Finish building the {@link GLBaseMemory} struct.
         * @return A new instance of {@code GLBaseMemory} with the fields 
         *         that were set in the Builder object.
         */
        public GLBaseMemory build() {
            return struct;
        }
        
        /**
         * the parent object
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMem(org.gstreamer.gst.Memory mem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
                return this;
            }
        }
        
        /**
         * the {@link GLContext} to use for GL operations
         * @param context The value for the {@code context} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
                return this;
            }
        }
        
        public Builder setLock(org.gtk.glib.Mutex lock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
                return this;
            }
        }
        
        public Builder setMapFlags(org.gstreamer.gst.MapFlags mapFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapFlags == null ? MemoryAddress.NULL : mapFlags.getValue()));
                return this;
            }
        }
        
        public Builder setMapCount(int mapCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), mapCount);
                return this;
            }
        }
        
        public Builder setGlMapCount(int glMapCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_map_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), glMapCount);
                return this;
            }
        }
        
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        public Builder setQuery(org.gstreamer.gl.GLQuery query) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.handle()));
                return this;
            }
        }
        
        public Builder setAllocSize(long allocSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), allocSize);
                return this;
            }
        }
        
        public Builder setAllocData(java.lang.foreign.MemoryAddress allocData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocData == null ? MemoryAddress.NULL : (Addressable) allocData));
                return this;
            }
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
                return this;
            }
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false, SCOPE)));
                return this;
            }
        }
    }
}
