package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLFilterClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFilterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLBaseFilterClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("set_caps"),
        Interop.valueLayout.ADDRESS.withName("filter"),
        Interop.valueLayout.ADDRESS.withName("filter_texture"),
        Interop.valueLayout.ADDRESS.withName("init_fbo"),
        Interop.valueLayout.ADDRESS.withName("transform_internal_caps"),
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
     * Allocate a new {@link GLFilterClass}
     * @return A new, uninitialized @{link GLFilterClass}
     */
    public static GLFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLFilterClass newInstance = new GLFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gl.GLBaseFilterClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gl.GLBaseFilterClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GLFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLFilterClass struct;
        
         /**
         * A {@link GLFilterClass.Build} object constructs a {@link GLFilterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link GLFilterClass} struct.
         * @return A new instance of {@code GLFilterClass} with the fields 
         *         that were set in the Build object.
         */
        public GLFilterClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gl.GLBaseFilterClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setSetCaps(java.lang.foreign.MemoryAddress setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps));
            return this;
        }
        
        public Build setFilter(java.lang.foreign.MemoryAddress filter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filter == null ? MemoryAddress.NULL : filter));
            return this;
        }
        
        public Build setFilterTexture(java.lang.foreign.MemoryAddress filterTexture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_texture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filterTexture == null ? MemoryAddress.NULL : filterTexture));
            return this;
        }
        
        public Build setInitFbo(java.lang.foreign.MemoryAddress initFbo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_fbo"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initFbo == null ? MemoryAddress.NULL : initFbo));
            return this;
        }
        
        public Build setTransformInternalCaps(java.lang.foreign.MemoryAddress transformInternalCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_internal_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformInternalCaps == null ? MemoryAddress.NULL : transformInternalCaps));
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
