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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLAllocationParams}
     * @return A new, uninitialized @{link GLAllocationParams}
     */
    public static GLAllocationParams allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLAllocationParams newInstance = new GLAllocationParams(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code struct_size}
     * @return The value of the field {@code struct_size}
     */
    public long getStructSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code struct_size}
     * @param structSize The new value of the field {@code struct_size}
     */
    public void setStructSize(long structSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), structSize);
        }
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gl.GLAllocationParamsCopyFunc getCopy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(org.gstreamer.gl.GLAllocationParamsCopyFunc copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code free}
     * @return The value of the field {@code free}
     */
    public org.gstreamer.gl.GLAllocationParamsFreeFunc getFree() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(org.gstreamer.gl.GLAllocationParamsFreeFunc free) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code alloc_flags}
     * @return The value of the field {@code alloc_flags}
     */
    public int getAllocFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code alloc_flags}
     * @param allocFlags The new value of the field {@code alloc_flags}
     */
    public void setAllocFlags(int allocFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), allocFlags);
        }
    }
    
    /**
     * Get the value of the field {@code alloc_size}
     * @return The value of the field {@code alloc_size}
     */
    public long getAllocSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code alloc_size}
     * @param allocSize The new value of the field {@code alloc_size}
     */
    public void setAllocSize(long allocSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), allocSize);
        }
    }
    
    /**
     * Get the value of the field {@code alloc_params}
     * @return The value of the field {@code alloc_params}
     */
    public org.gstreamer.gst.AllocationParams getAllocParams() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.AllocationParams.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code alloc_params}
     * @param allocParams The new value of the field {@code alloc_params}
     */
    public void setAllocParams(org.gstreamer.gst.AllocationParams allocParams) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()));
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
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gtk.glib.DestroyNotify getNotify() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(org.gtk.glib.DestroyNotify notify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData(java.lang.foreign.MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
        }
    }
    
    /**
     * Get the value of the field {@code wrapped_data}
     * @return The value of the field {@code wrapped_data}
     */
    public java.lang.foreign.MemoryAddress getWrappedData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code wrapped_data}
     * @param wrappedData The new value of the field {@code wrapped_data}
     */
    public void setWrappedData(java.lang.foreign.MemoryAddress wrappedData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wrappedData == null ? MemoryAddress.NULL : (Addressable) wrappedData));
        }
    }
    
    /**
     * Get the value of the field {@code gl_handle}
     * @return The value of the field {@code gl_handle}
     */
    public java.lang.foreign.MemoryAddress getGlHandle() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code gl_handle}
     * @param glHandle The new value of the field {@code gl_handle}
     */
    public void setGlHandle(java.lang.foreign.MemoryAddress glHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle));
        }
    }
    
    /**
     * Create a GLAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLAllocationParams(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLAllocationParams> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLAllocationParams(input);
    
    public org.gstreamer.gl.GLAllocationParams copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_allocation_params_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copies the dynamically allocated data from {@code src} to {@code dest}.  Direct subclasses
     * should call this function in their own overridden copy function.
     * @param dest the destination {@link GLAllocationParams}
     */
    public void copyData(org.gstreamer.gl.GLAllocationParams dest) {
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
            DowncallHandles.gst_gl_allocation_params_free.invokeExact(handle());
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
            DowncallHandles.gst_gl_allocation_params_free_data.invokeExact(handle());
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
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     * @return whether the parameters could be initialized
     */
    public boolean init(long structSize, int allocFlags, org.gstreamer.gl.GLAllocationParamsCopyFunc copy, org.gstreamer.gl.GLAllocationParamsFreeFunc free, org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_allocation_params_init.invokeExact(
                    handle(),
                    structSize,
                    allocFlags,
                    (Addressable) copy.toCallback(),
                    (Addressable) free.toCallback(),
                    context.handle(),
                    allocSize,
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * A {@link GLAllocationParams.Builder} object constructs a {@link GLAllocationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLAllocationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLAllocationParams struct;
        
        private Builder() {
            struct = GLAllocationParams.allocate();
        }
        
        /**
         * Finish building the {@link GLAllocationParams} struct.
         * @return A new instance of {@code GLAllocationParams} with the fields 
         *         that were set in the Builder object.
         */
        public GLAllocationParams build() {
            return struct;
        }
        
        /**
         * the size of the struct (including and subclass data)
         * @param structSize The value for the {@code structSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStructSize(long structSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("struct_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), structSize);
                return this;
            }
        }
        
        /**
         * a {@link GLAllocationParamsCopyFunc}
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopy(org.gstreamer.gl.GLAllocationParamsCopyFunc copy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLAllocationParamsFreeFunc}
         * @param free The value for the {@code free} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFree(org.gstreamer.gl.GLAllocationParamsFreeFunc free) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
                return this;
            }
        }
        
        /**
         * allocation flags
         * @param allocFlags The value for the {@code allocFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllocFlags(int allocFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), allocFlags);
                return this;
            }
        }
        
        /**
         * the allocation size
         * @param allocSize The value for the {@code allocSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllocSize(long allocSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), allocSize);
                return this;
            }
        }
        
        /**
         * the {@link org.gstreamer.gst.AllocationParams}
         * @param allocParams The value for the {@code allocParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllocParams(org.gstreamer.gst.AllocationParams allocParams) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_params"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()));
                return this;
            }
        }
        
        /**
         * a {@link GLContext}
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
        
        /**
         * a {@link org.gtk.glib.DestroyNotify}
         * @param notify The value for the {@code notify} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
                return this;
            }
        }
        
        /**
         * argument to call {@code notify} with
         * @param userData The value for the {@code userData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
                return this;
            }
        }
        
        /**
         * the wrapped data pointer
         * @param wrappedData The value for the {@code wrappedData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrappedData(java.lang.foreign.MemoryAddress wrappedData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wrapped_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wrappedData == null ? MemoryAddress.NULL : (Addressable) wrappedData));
                return this;
            }
        }
        
        /**
         * the wrapped OpenGL handle
         * @param glHandle The value for the {@code glHandle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlHandle(java.lang.foreign.MemoryAddress glHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle));
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
