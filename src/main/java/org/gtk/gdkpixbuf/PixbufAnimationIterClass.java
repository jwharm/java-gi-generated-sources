package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimationIter}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationIterClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationIterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_delay_time"),
        Interop.valueLayout.ADDRESS.withName("get_pixbuf"),
        Interop.valueLayout.ADDRESS.withName("on_currently_loading_frame"),
        Interop.valueLayout.ADDRESS.withName("advance")
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
     * Allocate a new {@link PixbufAnimationIterClass}
     * @return A new, uninitialized @{link PixbufAnimationIterClass}
     */
    public static PixbufAnimationIterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufAnimationIterClass newInstance = new PixbufAnimationIterClass(segment.address(), Ownership.NONE);
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
     * Create a PixbufAnimationIterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufAnimationIterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufAnimationIterClass struct;
        
         /**
         * A {@link PixbufAnimationIterClass.Build} object constructs a {@link PixbufAnimationIterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufAnimationIterClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufAnimationIterClass} struct.
         * @return A new instance of {@code PixbufAnimationIterClass} with the fields 
         *         that were set in the Build object.
         */
        public PixbufAnimationIterClass construct() {
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
        
        public Build setGetDelayTime(java.lang.foreign.MemoryAddress get_delay_time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_delay_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_delay_time == null ? MemoryAddress.NULL : get_delay_time));
            return this;
        }
        
        public Build setGetPixbuf(java.lang.foreign.MemoryAddress get_pixbuf) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_pixbuf"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_pixbuf == null ? MemoryAddress.NULL : get_pixbuf));
            return this;
        }
        
        public Build setOnCurrentlyLoadingFrame(java.lang.foreign.MemoryAddress on_currently_loading_frame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("on_currently_loading_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (on_currently_loading_frame == null ? MemoryAddress.NULL : on_currently_loading_frame));
            return this;
        }
        
        public Build setAdvance(java.lang.foreign.MemoryAddress advance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (advance == null ? MemoryAddress.NULL : advance));
            return this;
        }
    }
}
