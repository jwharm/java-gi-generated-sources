package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimation}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_static_image"),
        Interop.valueLayout.ADDRESS.withName("get_static_image"),
        Interop.valueLayout.ADDRESS.withName("get_size"),
        Interop.valueLayout.ADDRESS.withName("get_iter")
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
     * Allocate a new {@link PixbufAnimationClass}
     * @return A new, uninitialized @{link PixbufAnimationClass}
     */
    public static PixbufAnimationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufAnimationClass newInstance = new PixbufAnimationClass(segment.address(), Ownership.NONE);
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
     * Create a PixbufAnimationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufAnimationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufAnimationClass struct;
        
         /**
         * A {@link PixbufAnimationClass.Build} object constructs a {@link PixbufAnimationClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufAnimationClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufAnimationClass} struct.
         * @return A new instance of {@code PixbufAnimationClass} with the fields 
         *         that were set in the Build object.
         */
        public PixbufAnimationClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setIsStaticImage(java.lang.foreign.MemoryAddress is_static_image) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_static_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_static_image == null ? MemoryAddress.NULL : is_static_image));
            return this;
        }
        
        public Build setGetStaticImage(java.lang.foreign.MemoryAddress get_static_image) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_static_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_static_image == null ? MemoryAddress.NULL : get_static_image));
            return this;
        }
        
        public Build setGetSize(java.lang.foreign.MemoryAddress get_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_size == null ? MemoryAddress.NULL : get_size));
            return this;
        }
        
        public Build setGetIter(java.lang.foreign.MemoryAddress get_iter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_iter == null ? MemoryAddress.NULL : get_iter));
            return this;
        }
    }
}
