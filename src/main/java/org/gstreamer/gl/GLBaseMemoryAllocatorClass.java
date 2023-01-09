package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLBaseMemoryAllocatorClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseMemoryAllocatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.AllocatorClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("alloc"),
            Interop.valueLayout.ADDRESS.withName("create"),
            Interop.valueLayout.ADDRESS.withName("map"),
            Interop.valueLayout.ADDRESS.withName("unmap"),
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("destroy"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBaseMemoryAllocatorClass}
     * @return A new, uninitialized @{link GLBaseMemoryAllocatorClass}
     */
    public static GLBaseMemoryAllocatorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBaseMemoryAllocatorClass newInstance = new GLBaseMemoryAllocatorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.AllocatorClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.AllocatorClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.AllocatorClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code alloc}
     * @return The value of the field {@code alloc}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorAllocFunction getAlloc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code alloc}
     * @param alloc The new value of the field {@code alloc}
     */
    public void setAlloc(org.gstreamer.gl.GLBaseMemoryAllocatorAllocFunction alloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alloc == null ? MemoryAddress.NULL : (Addressable) alloc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code create}
     * @return The value of the field {@code create}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorCreateFunction getCreate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code create}
     * @param create The new value of the field {@code create}
     */
    public void setCreate(org.gstreamer.gl.GLBaseMemoryAllocatorCreateFunction create) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (create == null ? MemoryAddress.NULL : (Addressable) create.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction getMap() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction map) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : (Addressable) map.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code unmap}
     * @return The value of the field {@code unmap}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction getUnmap() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code unmap}
     * @param unmap The new value of the field {@code unmap}
     */
    public void setUnmap(org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction unmap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : (Addressable) unmap.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction getCopy() {
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
    public void setCopy(org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorDestroyFunction getDestroy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code destroy}
     * @param destroy The new value of the field {@code destroy}
     */
    public void setDestroy(org.gstreamer.gl.GLBaseMemoryAllocatorDestroyFunction destroy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        }
    }
    
    /**
     * Create a GLBaseMemoryAllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBaseMemoryAllocatorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBaseMemoryAllocatorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseMemoryAllocatorClass(input);
    
    /**
     * A {@link GLBaseMemoryAllocatorClass.Builder} object constructs a {@link GLBaseMemoryAllocatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBaseMemoryAllocatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBaseMemoryAllocatorClass struct;
        
        private Builder() {
            struct = GLBaseMemoryAllocatorClass.allocate();
        }
        
        /**
         * Finish building the {@link GLBaseMemoryAllocatorClass} struct.
         * @return A new instance of {@code GLBaseMemoryAllocatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLBaseMemoryAllocatorClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.AllocatorClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorAllocFunction}
         * @param alloc The value for the {@code alloc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAlloc(org.gstreamer.gl.GLBaseMemoryAllocatorAllocFunction alloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alloc == null ? MemoryAddress.NULL : (Addressable) alloc.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorCreateFunction}
         * @param create The value for the {@code create} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCreate(org.gstreamer.gl.GLBaseMemoryAllocatorCreateFunction create) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (create == null ? MemoryAddress.NULL : (Addressable) create.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorMapFunction}
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMap(org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction map) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : (Addressable) map.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorUnmapFunction}
         * @param unmap The value for the {@code unmap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnmap(org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction unmap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : (Addressable) unmap.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorCopyFunction}
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopy(org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction copy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
                return this;
            }
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorDestroyFunction}
         * @param destroy The value for the {@code destroy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestroy(org.gstreamer.gl.GLBaseMemoryAllocatorDestroyFunction destroy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
