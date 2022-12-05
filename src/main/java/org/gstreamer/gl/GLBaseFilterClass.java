package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The base class for GStreamer GL Filter.
 */
public class GLBaseFilterClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseFilterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.C_INT.withName("supported_gl_api"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("gl_start"),
        Interop.valueLayout.ADDRESS.withName("gl_stop"),
        Interop.valueLayout.ADDRESS.withName("gl_set_caps"),
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
     * Allocate a new {@link GLBaseFilterClass}
     * @return A new, uninitialized @{link GLBaseFilterClass}
     */
    public static GLBaseFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBaseFilterClass newInstance = new GLBaseFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseTransformClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.base.BaseTransformClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code supported_gl_api}
     * @return The value of the field {@code supported_gl_api}
     */
    public org.gstreamer.gl.GLAPI supportedGlApi$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    /**
     * Change the value of the field {@code supported_gl_api}
     * @param supportedGlApi The new value of the field {@code supported_gl_api}
     */
    public void supportedGlApi$set(org.gstreamer.gl.GLAPI supportedGlApi) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), supportedGlApi.getValue());
    }
    
    /**
     * Create a GLBaseFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBaseFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLBaseFilterClass struct;
        
         /**
         * A {@link GLBaseFilterClass.Build} object constructs a {@link GLBaseFilterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLBaseFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link GLBaseFilterClass} struct.
         * @return A new instance of {@code GLBaseFilterClass} with the fields 
         *         that were set in the Build object.
         */
        public GLBaseFilterClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * the logical-OR of {@link GLAPI}'s supported by this element
         * @param supportedGlApi The value for the {@code supportedGlApi} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSupportedGlApi(org.gstreamer.gl.GLAPI supportedGlApi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportedGlApi == null ? MemoryAddress.NULL : supportedGlApi.getValue()));
            return this;
        }
        
        public Build setGlStart(java.lang.foreign.MemoryAddress glStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStart == null ? MemoryAddress.NULL : glStart));
            return this;
        }
        
        public Build setGlStop(java.lang.foreign.MemoryAddress glStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStop == null ? MemoryAddress.NULL : glStop));
            return this;
        }
        
        public Build setGlSetCaps(java.lang.foreign.MemoryAddress glSetCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glSetCaps == null ? MemoryAddress.NULL : glSetCaps));
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
