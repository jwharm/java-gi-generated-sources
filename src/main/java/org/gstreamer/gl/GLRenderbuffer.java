package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstGLRenderbuffer is a {@link GLBaseMemory} subclass providing support for
 * OpenGL renderbuffers.
 * <p>
 * {@link GLRenderbuffer} is created or wrapped through gst_gl_base_memory_alloc()
 * with {@link GLRenderbufferAllocationParams}.
 * @version 1.10
 */
public class GLRenderbuffer extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLRenderbuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLBaseMemory.getMemoryLayout().withName("mem"),
            Interop.valueLayout.C_INT.withName("renderbuffer_id"),
            Interop.valueLayout.C_INT.withName("renderbuffer_format"),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height"),
            Interop.valueLayout.C_INT.withName("renderbuffer_wrapped"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLRenderbuffer}
     * @return A new, uninitialized @{link GLRenderbuffer}
     */
    public static GLRenderbuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLRenderbuffer newInstance = new GLRenderbuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code renderbuffer_id}
     * @return The value of the field {@code renderbuffer_id}
     */
    public int getRenderbufferId() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code renderbuffer_id}
     * @param renderbufferId The new value of the field {@code renderbuffer_id}
     */
    public void setRenderbufferId(int renderbufferId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderbufferId);
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
    public int getWidth_() {
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
    public int getHeight_() {
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
     * Get the value of the field {@code renderbuffer_wrapped}
     * @return The value of the field {@code renderbuffer_wrapped}
     */
    public boolean getRenderbufferWrapped() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_wrapped"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code renderbuffer_wrapped}
     * @param renderbufferWrapped The new value of the field {@code renderbuffer_wrapped}
     */
    public void setRenderbufferWrapped(boolean renderbufferWrapped) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_wrapped"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(renderbufferWrapped, null).intValue());
    }
    
    /**
     * Create a GLRenderbuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLRenderbuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLRenderbuffer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLRenderbuffer(input, ownership);
    
    public org.gstreamer.gl.GLFormat getFormat() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_renderbuffer_get_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_renderbuffer_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_renderbuffer_get_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_renderbuffer_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes the GL Base Texture allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLRenderbuffer operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_renderbuffer_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_renderbuffer_get_format = Interop.downcallHandle(
            "gst_gl_renderbuffer_get_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_get_height = Interop.downcallHandle(
            "gst_gl_renderbuffer_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_get_id = Interop.downcallHandle(
            "gst_gl_renderbuffer_get_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_get_width = Interop.downcallHandle(
            "gst_gl_renderbuffer_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_init_once = Interop.downcallHandle(
            "gst_gl_renderbuffer_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
    }
    
    /**
     * A {@link GLRenderbuffer.Builder} object constructs a {@link GLRenderbuffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLRenderbuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLRenderbuffer struct;
        
        private Builder() {
            struct = GLRenderbuffer.allocate();
        }
        
         /**
         * Finish building the {@link GLRenderbuffer} struct.
         * @return A new instance of {@code GLRenderbuffer} with the fields 
         *         that were set in the Builder object.
         */
        public GLRenderbuffer build() {
            return struct;
        }
        
        public Builder setMem(org.gstreamer.gl.GLBaseMemory mem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
            return this;
        }
        
        /**
         * the GL texture id for this memory
         * @param renderbufferId The value for the {@code renderbufferId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderbufferId(int renderbufferId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderbufferId);
            return this;
        }
        
        /**
         * the texture type
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
        
        public Builder setRenderbufferWrapped(boolean renderbufferWrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("renderbuffer_wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(renderbufferWrapped, null).intValue());
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
