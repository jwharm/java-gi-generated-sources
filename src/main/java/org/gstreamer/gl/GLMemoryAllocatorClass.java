package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLMemoryAllocatorClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryAllocatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLBaseMemoryAllocatorClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("map"),
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("unmap"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLMemoryAllocatorClass}
     * @return A new, uninitialized @{link GLMemoryAllocatorClass}
     */
    public static GLMemoryAllocatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLMemoryAllocatorClass newInstance = new GLMemoryAllocatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction getMap() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction map) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : (Addressable) map.toCallback()));
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction getCopy() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction copy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
    }
    
    /**
     * Get the value of the field {@code unmap}
     * @return The value of the field {@code unmap}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction getUnmap() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code unmap}
     * @param unmap The new value of the field {@code unmap}
     */
    public void setUnmap(org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction unmap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmap == null ? MemoryAddress.NULL : (Addressable) unmap.toCallback()));
    }
    
    /**
     * Create a GLMemoryAllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLMemoryAllocatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLMemoryAllocatorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLMemoryAllocatorClass(input, ownership);
    
    /**
     * A {@link GLMemoryAllocatorClass.Builder} object constructs a {@link GLMemoryAllocatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLMemoryAllocatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLMemoryAllocatorClass struct;
        
        private Builder() {
            struct = GLMemoryAllocatorClass.allocate();
        }
        
         /**
         * Finish building the {@link GLMemoryAllocatorClass} struct.
         * @return A new instance of {@code GLMemoryAllocatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLMemoryAllocatorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gl.GLBaseMemoryAllocatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * provide a custom map implementation
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMap(org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : (Addressable) map.toCallback()));
            return this;
        }
        
        /**
         * provide a custom copy implementation
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopy(org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
            return this;
        }
        
        /**
         * provide a custom unmap implementation
         * @param unmap The value for the {@code unmap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnmap(org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction unmap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmap == null ? MemoryAddress.NULL : (Addressable) unmap.toCallback()));
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
