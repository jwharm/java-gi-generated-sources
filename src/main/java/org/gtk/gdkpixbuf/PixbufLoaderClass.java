package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufLoaderClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufLoaderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("size_prepared"),
        Interop.valueLayout.ADDRESS.withName("area_prepared"),
        Interop.valueLayout.ADDRESS.withName("area_updated"),
        Interop.valueLayout.ADDRESS.withName("closed")
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
     * Allocate a new {@link PixbufLoaderClass}
     * @return A new, uninitialized @{link PixbufLoaderClass}
     */
    public static PixbufLoaderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufLoaderClass newInstance = new PixbufLoaderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PixbufLoaderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufLoaderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufLoaderClass struct;
        
         /**
         * A {@link PixbufLoaderClass.Build} object constructs a {@link PixbufLoaderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufLoaderClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufLoaderClass} struct.
         * @return A new instance of {@code PixbufLoaderClass} with the fields 
         *         that were set in the Build object.
         */
        public PixbufLoaderClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setSizePrepared(java.lang.foreign.MemoryAddress size_prepared) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size_prepared"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (size_prepared == null ? MemoryAddress.NULL : size_prepared));
            return this;
        }
        
        public Build setAreaPrepared(java.lang.foreign.MemoryAddress area_prepared) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("area_prepared"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (area_prepared == null ? MemoryAddress.NULL : area_prepared));
            return this;
        }
        
        public Build setAreaUpdated(java.lang.foreign.MemoryAddress area_updated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("area_updated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (area_updated == null ? MemoryAddress.NULL : area_updated));
            return this;
        }
        
        public Build setClosed(java.lang.foreign.MemoryAddress closed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed));
            return this;
        }
    }
}
