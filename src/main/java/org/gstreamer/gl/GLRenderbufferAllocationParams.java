package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Allocation parameters
 */
public class GLRenderbufferAllocationParams extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLRenderbufferAllocationParams";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLAllocationParams.getMemoryLayout().withName("parent"),
            Interop.valueLayout.C_INT.withName("renderbuffer_format"),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLRenderbufferAllocationParams}
     * @return A new, uninitialized @{link GLRenderbufferAllocationParams}
     */
    public static GLRenderbufferAllocationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLRenderbufferAllocationParams newInstance = new GLRenderbufferAllocationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code renderbuffer_format}
     * @return The value of the field {@code renderbuffer_format}
     */
    public org.gstreamer.gl.GLFormat getRenderbufferFormat() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code renderbuffer_format}
     * @param renderbufferFormat The new value of the field {@code renderbuffer_format}
     */
    public void setRenderbufferFormat(org.gstreamer.gl.GLFormat renderbufferFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderbufferFormat == null ? MemoryAddress.NULL : renderbufferFormat.getValue()));
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int getWidth() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int getHeight() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(int height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
    }
    
    /**
     * Create a GLRenderbufferAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLRenderbufferAllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLRenderbufferAllocationParams> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLRenderbufferAllocationParams(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.gl.GLFormat renderbufferFormat, int width, int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_renderbuffer_allocation_params_new.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    renderbufferFormat.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLRenderbufferAllocationParams(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.gl.GLFormat renderbufferFormat, int width, int height) {
        super(constructNew(context, allocParams, renderbufferFormat, width, height), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWrapped(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.gl.GLFormat renderbufferFormat, int width, int height, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_renderbuffer_allocation_params_new_wrapped.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    renderbufferFormat.getValue(),
                    width,
                    height,
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLRenderbufferAllocationParams newWrapped(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.gl.GLFormat renderbufferFormat, int width, int height, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWrapped(context, allocParams, renderbufferFormat, width, height, glHandle, notify);
        return org.gstreamer.gl.GLRenderbufferAllocationParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_renderbuffer_allocation_params_new = Interop.downcallHandle(
            "gst_gl_renderbuffer_allocation_params_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_allocation_params_new_wrapped = Interop.downcallHandle(
            "gst_gl_renderbuffer_allocation_params_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link GLRenderbufferAllocationParams.Builder} object constructs a {@link GLRenderbufferAllocationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLRenderbufferAllocationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLRenderbufferAllocationParams struct;
        
        private Builder() {
            struct = GLRenderbufferAllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link GLRenderbufferAllocationParams} struct.
         * @return A new instance of {@code GLRenderbufferAllocationParams} with the fields 
         *         that were set in the Builder object.
         */
        public GLRenderbufferAllocationParams build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gl.GLAllocationParams parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link GLFormat}
         * @param renderbufferFormat The value for the {@code renderbufferFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderbufferFormat(org.gstreamer.gl.GLFormat renderbufferFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderbufferFormat == null ? MemoryAddress.NULL : renderbufferFormat.getValue()));
            return this;
        }
        
        /**
         * the width
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
            return this;
        }
        
        /**
         * the height
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}