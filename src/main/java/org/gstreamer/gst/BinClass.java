package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override {@link BinClass}::add_element and {@link BinClass}::remove_element
 * to update the list of children in the bin.
 * <p>
 * The {@link BinClass}::handle_message method can be overridden to implement custom
 * message handling.
 * <p>
 * {@link BinClass}::deep_element_added will be called when a new element has been
 * added to any bin inside this bin, so it will also be called if a new child
 * was added to a sub-bin of this bin. {@link Bin} implementations that override
 * this message should chain up to the parent class implementation so the
 * {@link Bin}::deep-element-added signal is emitted on all parents.
 */
public class BinClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBinClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("pool"),
        Interop.valueLayout.ADDRESS.withName("element_added"),
        Interop.valueLayout.ADDRESS.withName("element_removed"),
        Interop.valueLayout.ADDRESS.withName("add_element"),
        Interop.valueLayout.ADDRESS.withName("remove_element"),
        Interop.valueLayout.ADDRESS.withName("handle_message"),
        Interop.valueLayout.ADDRESS.withName("do_latency"),
        Interop.valueLayout.ADDRESS.withName("deep_element_added"),
        Interop.valueLayout.ADDRESS.withName("deep_element_removed"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link BinClass}
     * @return A new, uninitialized @{link BinClass}
     */
    public static BinClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BinClass newInstance = new BinClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a BinClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BinClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BinClass struct;
        
         /**
         * A {@link BinClass.Build} object constructs a {@link BinClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BinClass.allocate();
        }
        
         /**
         * Finish building the {@link BinClass} struct.
         * @return A new instance of {@code BinClass} with the fields 
         *         that were set in the Build object.
         */
        public BinClass construct() {
            return struct;
        }
        
        /**
         * bin parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setPool(org.gtk.glib.ThreadPool pool) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
            return this;
        }
        
        public Build setElementAdded(java.lang.foreign.MemoryAddress elementAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementAdded == null ? MemoryAddress.NULL : elementAdded));
            return this;
        }
        
        public Build setElementRemoved(java.lang.foreign.MemoryAddress elementRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementRemoved == null ? MemoryAddress.NULL : elementRemoved));
            return this;
        }
        
        public Build setAddElement(java.lang.foreign.MemoryAddress addElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addElement == null ? MemoryAddress.NULL : addElement));
            return this;
        }
        
        public Build setRemoveElement(java.lang.foreign.MemoryAddress removeElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeElement == null ? MemoryAddress.NULL : removeElement));
            return this;
        }
        
        public Build setHandleMessage(java.lang.foreign.MemoryAddress handleMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMessage == null ? MemoryAddress.NULL : handleMessage));
            return this;
        }
        
        public Build setDoLatency(java.lang.foreign.MemoryAddress doLatency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_latency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doLatency == null ? MemoryAddress.NULL : doLatency));
            return this;
        }
        
        public Build setDeepElementAdded(java.lang.foreign.MemoryAddress deepElementAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementAdded == null ? MemoryAddress.NULL : deepElementAdded));
            return this;
        }
        
        public Build setDeepElementRemoved(java.lang.foreign.MemoryAddress deepElementRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deep_element_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deepElementRemoved == null ? MemoryAddress.NULL : deepElementRemoved));
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
