package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ChildProxy} interface.
 */
public class ChildProxyInterface extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstChildProxyInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("get_child_by_name"),
        Interop.valueLayout.ADDRESS.withName("get_child_by_index"),
        Interop.valueLayout.ADDRESS.withName("get_children_count"),
        Interop.valueLayout.ADDRESS.withName("child_added"),
        Interop.valueLayout.ADDRESS.withName("child_removed"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link ChildProxyInterface}
     * @return A new, uninitialized @{link ChildProxyInterface}
     */
    public static ChildProxyInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ChildProxyInterface newInstance = new ChildProxyInterface(segment.address(), Ownership.NONE);
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
     * Create a ChildProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ChildProxyInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ChildProxyInterface struct;
        
         /**
         * A {@link ChildProxyInterface.Build} object constructs a {@link ChildProxyInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ChildProxyInterface.allocate();
        }
        
         /**
         * Finish building the {@link ChildProxyInterface} struct.
         * @return A new instance of {@code ChildProxyInterface} with the fields 
         *         that were set in the Build object.
         */
        public ChildProxyInterface construct() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setGetChildByName(java.lang.foreign.MemoryAddress getChildByName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByName == null ? MemoryAddress.NULL : getChildByName));
            return this;
        }
        
        public Build setGetChildByIndex(java.lang.foreign.MemoryAddress getChildByIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_by_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildByIndex == null ? MemoryAddress.NULL : getChildByIndex));
            return this;
        }
        
        public Build setGetChildrenCount(java.lang.foreign.MemoryAddress getChildrenCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_children_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildrenCount == null ? MemoryAddress.NULL : getChildrenCount));
            return this;
        }
        
        public Build setChildAdded(java.lang.foreign.MemoryAddress childAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childAdded == null ? MemoryAddress.NULL : childAdded));
            return this;
        }
        
        public Build setChildRemoved(java.lang.foreign.MemoryAddress childRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("child_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (childRemoved == null ? MemoryAddress.NULL : childRemoved));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
