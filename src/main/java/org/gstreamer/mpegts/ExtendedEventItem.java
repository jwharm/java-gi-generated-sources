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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("item_description"),
            Interop.valueLayout.ADDRESS.withName("item")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ExtendedEventItem}
     * @return A new, uninitialized @{link ExtendedEventItem}
     */
    public static ExtendedEventItem allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ExtendedEventItem newInstance = new ExtendedEventItem(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code item_description}
     * @return The value of the field {@code item_description}
     */
    public java.lang.String getItemDescription() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code item_description}
     * @param itemDescription The new value of the field {@code item_description}
     */
    public void setItemDescription(java.lang.String itemDescription) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (itemDescription == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(itemDescription, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code item}
     * @return The value of the field {@code item}
     */
    public java.lang.String getItem() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code item}
     * @param item The new value of the field {@code item}
     */
    public void setItem(java.lang.String item) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (item == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(item, SCOPE)));
        }
    }
    
    /**
     * Create a ExtendedEventItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ExtendedEventItem(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExtendedEventItem> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ExtendedEventItem(input);
    
    /**
     * A {@link ExtendedEventItem.Builder} object constructs a {@link ExtendedEventItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ExtendedEventItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ExtendedEventItem struct;
        
        private Builder() {
            struct = ExtendedEventItem.allocate();
        }
        
        /**
         * Finish building the {@link ExtendedEventItem} struct.
         * @return A new instance of {@code ExtendedEventItem} with the fields 
         *         that were set in the Builder object.
         */
        public ExtendedEventItem build() {
            return struct;
        }
        
        public Builder setItemDescription(java.lang.String itemDescription) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("item_description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (itemDescription == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(itemDescription, SCOPE)));
                return this;
            }
        }
        
        public Builder setItem(java.lang.String item) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("item"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (item == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(item, SCOPE)));
                return this;
            }
        }
    }
}
