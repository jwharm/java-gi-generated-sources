package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLAllocationParams extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLAllocationParams";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("struct_size"),
        Interop.valueLayout.ADDRESS.withName("copy"),
        Interop.valueLayout.ADDRESS.withName("free"),
        Interop.valueLayout.C_INT.withName("alloc_flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("alloc_size"),
        Interop.valueLayout.ADDRESS.withName("alloc_params"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("wrapped_data"),
        Interop.valueLayout.ADDRESS.withName("gl_handle"),
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
     * Allocate a new {@link GLAllocationParams}
     * @return A new, uninitialized @{link GLAllocationParams}
     */
    public static GLAllocationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLAllocationParams newInstance = new GLAllocationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code struct_size}
     * @return The value of the field {@code struct_size}
     */
    public long structSize$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code struct_size}
     * @param structSize The new value of the field {@code struct_size}
     */
    public void structSize$set(long structSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), structSize);
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gl.GLAllocationParamsCopyFunc copy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code free}
     * @return The value of the field {@code free}
     */
    public org.gstreamer.gl.GLAllocationParamsFreeFunc free$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code alloc_flags}
     * @return The value of the field {@code alloc_flags}
     */
    public int allocFlags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code alloc_flags}
     * @param allocFlags The new value of the field {@code alloc_flags}
     */
    public void allocFlags$set(int allocFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocFlags);
    }
    
    /**
     * Get the value of the field {@code alloc_size}
     * @return The value of the field {@code alloc_size}
     */
    public long allocSize$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code alloc_size}
     * @param allocSize The new value of the field {@code alloc_size}
     */
    public void allocSize$set(long allocSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocSize);
    }
    
    /**
     * Get the value of the field {@code alloc_params}
     * @return The value of the field {@code alloc_params}
     */
    public org.gstreamer.gst.AllocationParams allocParams$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.AllocationParams(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code alloc_params}
     * @param allocParams The new value of the field {@code alloc_params}
     */
    public void allocParams$set(org.gstreamer.gst.AllocationParams allocParams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocParams.handle());
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
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gtk.glib.DestroyNotify notify$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress userData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void userData$set(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) userData);
    }
    
    /**
     * Get the value of the field {@code wrapped_data}
     * @return The value of the field {@code wrapped_data}
     */
    public java.lang.foreign.MemoryAddress wrappedData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code wrapped_data}
     * @param wrappedData The new value of the field {@code wrapped_data}
     */
    public void wrappedData$set(java.lang.foreign.MemoryAddress wrappedData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) wrappedData);
    }
    
    /**
     * Get the value of the field {@code gl_handle}
     * @return The value of the field {@code gl_handle}
     */
    public java.lang.foreign.MemoryAddress glHandle$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gl_handle}
     * @param glHandle The new value of the field {@code gl_handle}
     */
    public void glHandle$set(java.lang.foreign.MemoryAddress glHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) glHandle);
    }
    
    /**
     * Create a GLAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLAllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public @NotNull org.gstreamer.gl.GLAllocationParams copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_allocation_params_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAllocationParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Copies the dynamically allocated data from {@code src} to {@code dest}.  Direct subclasses
     * should call this function in their own overridden copy function.
     * @param dest the destination {@link GLAllocationParams}
     */
    public void copyData(@NotNull org.gstreamer.gl.GLAllocationParams dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        try {
            DowncallHandles.gst_gl_allocation_params_copy_data.invokeExact(
                    handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the {@link GLAllocationParams} and all associated data.
     */
    public void free() {
        try {
            DowncallHandles.gst_gl_allocation_params_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the dynamically allocated data in {@code params}.  Direct subclasses
     * should call this function in their own overridden free function.
     */
    public void freeData() {
        try {
            DowncallHandles.gst_gl_allocation_params_free_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * {@code notify} will be called once for each allocated memory using these {@code params}
     * when freeing the memory.
     * @param structSize the struct size of the implementation
     * @param allocFlags some alloc flags
     * @param copy a copy function
     * @param free a free function
     * @param context a {@link GLContext}
     * @param allocSize the number of bytes to allocate.
     * @param allocParams a {@link org.gstreamer.gst.AllocationParams} to apply
     * @param glHandle a GL handle to initialize the allocation with
     * @return whether the parameters could be initialized
     */
    public boolean init(long structSize, int allocFlags, @NotNull org.gstreamer.gl.GLAllocationParamsCopyFunc copy, @NotNull org.gstreamer.gl.GLAllocationParamsFreeFunc free, @NotNull org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, @Nullable java.lang.foreign.MemoryAddress glHandle) {
        java.util.Objects.requireNonNull(copy, "Parameter 'copy' must not be null");
        java.util.Objects.requireNonNull(free, "Parameter 'free' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_allocation_params_init.invokeExact(
                    handle(),
                    structSize,
                    allocFlags,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLAllocationParamsCopyFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLAllocationParamsFreeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    context.handle(),
                    allocSize,
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    (Addressable) (Interop.registerCallback(copy)),
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) (Interop.registerCallback(copy)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_allocation_params_copy = Interop.downcallHandle(
            "gst_gl_allocation_params_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_allocation_params_copy_data = Interop.downcallHandle(
            "gst_gl_allocation_params_copy_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_allocation_params_free = Interop.downcallHandle(
            "gst_gl_allocation_params_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_allocation_params_free_data = Interop.downcallHandle(
            "gst_gl_allocation_params_free_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_allocation_params_init = Interop.downcallHandle(
            "gst_gl_allocation_params_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLAllocationParams struct;
        
         /**
         * A {@link GLAllocationParams.Build} object constructs a {@link GLAllocationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLAllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link GLAllocationParams} struct.
         * @return A new instance of {@code GLAllocationParams} with the fields 
         *         that were set in the Build object.
         */
        public GLAllocationParams construct() {
            return struct;
        }
        
        /**
         * the size of the struct (including and subclass data)
         * @param structSize The value for the {@code structSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStructSize(long structSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), structSize);
            return this;
        }
        
        /**
         * a {@link GLAllocationParamsCopyFunc}
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        /**
         * a {@link GLAllocationParamsFreeFunc}
         * @param free The value for the {@code free} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFree(java.lang.foreign.MemoryAddress free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free));
            return this;
        }
        
        /**
         * allocation flags
         * @param allocFlags The value for the {@code allocFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllocFlags(int allocFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocFlags);
            return this;
        }
        
        /**
         * the allocation size
         * @param allocSize The value for the {@code allocSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllocSize(long allocSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocSize);
            return this;
        }
        
        /**
         * the {@link org.gstreamer.gst.AllocationParams}
         * @param allocParams The value for the {@code allocParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllocParams(org.gstreamer.gst.AllocationParams allocParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()));
            return this;
        }
        
        /**
         * a {@link GLContext}
         * @param context The value for the {@code context} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContext(org.gstreamer.gl.GLContext context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
            return this;
        }
        
        /**
         * a {@link org.gtk.glib.DestroyNotify}
         * @param notify The value for the {@code notify} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        /**
         * argument to call {@code notify} with
         * @param userData The value for the {@code userData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        /**
         * the wrapped data pointer
         * @param wrappedData The value for the {@code wrappedData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWrappedData(java.lang.foreign.MemoryAddress wrappedData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wrappedData == null ? MemoryAddress.NULL : (Addressable) wrappedData));
            return this;
        }
        
        /**
         * the wrapped OpenGL handle
         * @param glHandle The value for the {@code glHandle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGlHandle(java.lang.foreign.MemoryAddress glHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle));
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
