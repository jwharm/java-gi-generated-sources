package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExtendedEventItem extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsExtendedEventItem";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("item_description"),
        Interop.valueLayout.ADDRESS.withName("item")
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
     * Allocate a new {@link ExtendedEventItem}
     * @return A new, uninitialized @{link ExtendedEventItem}
     */
    public static ExtendedEventItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExtendedEventItem newInstance = new ExtendedEventItem(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code item_description}
     * @return The value of the field {@code item_description}
     */
    public java.lang.String itemDescription$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code item_description}
     * @param itemDescription The new value of the field {@code item_description}
     */
    public void itemDescription$set(java.lang.String itemDescription) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(itemDescription));
    }
    
    /**
     * Get the value of the field {@code item}
     * @return The value of the field {@code item}
     */
    public java.lang.String item$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code item}
     * @param item The new value of the field {@code item}
     */
    public void item$set(java.lang.String item) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(item));
    }
    
    /**
     * Create a ExtendedEventItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ExtendedEventItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ExtendedEventItem struct;
        
         /**
         * A {@link ExtendedEventItem.Build} object constructs a {@link ExtendedEventItem} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ExtendedEventItem.allocate();
        }
        
         /**
         * Finish building the {@link ExtendedEventItem} struct.
         * @return A new instance of {@code ExtendedEventItem} with the fields 
         *         that were set in the Build object.
         */
        public ExtendedEventItem construct() {
            return struct;
        }
        
        public Build setItemDescription(java.lang.String itemDescription) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (itemDescription == null ? MemoryAddress.NULL : Interop.allocateNativeString(itemDescription)));
            return this;
        }
        
        public Build setItem(java.lang.String item) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (item == null ? MemoryAddress.NULL : Interop.allocateNativeString(item)));
            return this;
        }
    }
}
