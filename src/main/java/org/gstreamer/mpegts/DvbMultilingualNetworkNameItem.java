package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * a multilingual network name entry
 */
public class DvbMultilingualNetworkNameItem extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDvbMultilingualNetworkNameItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.ADDRESS.withName("network_name")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DvbMultilingualNetworkNameItem}
     * @return A new, uninitialized @{link DvbMultilingualNetworkNameItem}
     */
    public static DvbMultilingualNetworkNameItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DvbMultilingualNetworkNameItem newInstance = new DvbMultilingualNetworkNameItem(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code language_code}
     * @return The value of the field {@code language_code}
     */
    public java.lang.String getLanguageCode() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void setLanguageCode(java.lang.String languageCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, null)));
    }
    
    /**
     * Get the value of the field {@code network_name}
     * @return The value of the field {@code network_name}
     */
    public java.lang.String getNetworkName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code network_name}
     * @param networkName The new value of the field {@code network_name}
     */
    public void setNetworkName(java.lang.String networkName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (networkName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(networkName, null)));
    }
    
    /**
     * Create a DvbMultilingualNetworkNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DvbMultilingualNetworkNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DvbMultilingualNetworkNameItem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DvbMultilingualNetworkNameItem(input, ownership);
    
    /**
     * A {@link DvbMultilingualNetworkNameItem.Builder} object constructs a {@link DvbMultilingualNetworkNameItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DvbMultilingualNetworkNameItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DvbMultilingualNetworkNameItem struct;
        
        private Builder() {
            struct = DvbMultilingualNetworkNameItem.allocate();
        }
        
         /**
         * Finish building the {@link DvbMultilingualNetworkNameItem} struct.
         * @return A new instance of {@code DvbMultilingualNetworkNameItem} with the fields 
         *         that were set in the Builder object.
         */
        public DvbMultilingualNetworkNameItem build() {
            return struct;
        }
        
        /**
         * the ISO 639 language code
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, null)));
            return this;
        }
        
        /**
         * the network name
         * @param networkName The value for the {@code networkName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNetworkName(java.lang.String networkName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (networkName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(networkName, null)));
            return this;
        }
    }
}
