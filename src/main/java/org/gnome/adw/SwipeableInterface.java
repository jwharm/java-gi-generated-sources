package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for swipeable widgets.
 * @version 1.0
 */
public class SwipeableInterface extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSwipeableInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("get_distance"),
        Interop.valueLayout.ADDRESS.withName("get_snap_points"),
        Interop.valueLayout.ADDRESS.withName("get_progress"),
        Interop.valueLayout.ADDRESS.withName("get_cancel_progress"),
        Interop.valueLayout.ADDRESS.withName("get_swipe_area"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link SwipeableInterface}
     * @return A new, uninitialized @{link SwipeableInterface}
     */
    public static SwipeableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SwipeableInterface newInstance = new SwipeableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SwipeableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SwipeableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SwipeableInterface struct;
        
         /**
         * A {@link SwipeableInterface.Build} object constructs a {@link SwipeableInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SwipeableInterface.allocate();
        }
        
         /**
         * Finish building the {@link SwipeableInterface} struct.
         * @return A new instance of {@code SwipeableInterface} with the fields 
         *         that were set in the Build object.
         */
        public SwipeableInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setGetDistance(java.lang.foreign.MemoryAddress get_distance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_distance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_distance == null ? MemoryAddress.NULL : get_distance));
            return this;
        }
        
        public Build setGetSnapPoints(java.lang.foreign.MemoryAddress get_snap_points) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_snap_points"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_snap_points == null ? MemoryAddress.NULL : get_snap_points));
            return this;
        }
        
        public Build setGetProgress(java.lang.foreign.MemoryAddress get_progress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_progress == null ? MemoryAddress.NULL : get_progress));
            return this;
        }
        
        public Build setGetCancelProgress(java.lang.foreign.MemoryAddress get_cancel_progress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cancel_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_cancel_progress == null ? MemoryAddress.NULL : get_cancel_progress));
            return this;
        }
        
        public Build setGetSwipeArea(java.lang.foreign.MemoryAddress get_swipe_area) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_swipe_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_swipe_area == null ? MemoryAddress.NULL : get_swipe_area));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
