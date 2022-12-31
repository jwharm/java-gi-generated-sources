package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * a multilingual service name entry
 */
public class DvbMultilingualServiceNameItem extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDvbMultilingualServiceNameItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.ADDRESS.withName("provider_name"),
            Interop.valueLayout.ADDRESS.withName("service_name")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DvbMultilingualServiceNameItem}
     * @return A new, uninitialized @{link DvbMultilingualServiceNameItem}
     */
    public static DvbMultilingualServiceNameItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DvbMultilingualServiceNameItem newInstance = new DvbMultilingualServiceNameItem(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code provider_name}
     * @return The value of the field {@code provider_name}
     */
    public java.lang.String getProviderName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code provider_name}
     * @param providerName The new value of the field {@code provider_name}
     */
    public void setProviderName(java.lang.String providerName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (providerName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(providerName, null)));
    }
    
    /**
     * Get the value of the field {@code service_name}
     * @return The value of the field {@code service_name}
     */
    public java.lang.String getServiceName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code service_name}
     * @param serviceName The new value of the field {@code service_name}
     */
    public void setServiceName(java.lang.String serviceName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serviceName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceName, null)));
    }
    
    /**
     * Create a DvbMultilingualServiceNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DvbMultilingualServiceNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DvbMultilingualServiceNameItem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DvbMultilingualServiceNameItem(input, ownership);
    
    /**
     * A {@link DvbMultilingualServiceNameItem.Builder} object constructs a {@link DvbMultilingualServiceNameItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DvbMultilingualServiceNameItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DvbMultilingualServiceNameItem struct;
        
        private Builder() {
            struct = DvbMultilingualServiceNameItem.allocate();
        }
        
         /**
         * Finish building the {@link DvbMultilingualServiceNameItem} struct.
         * @return A new instance of {@code DvbMultilingualServiceNameItem} with the fields 
         *         that were set in the Builder object.
         */
        public DvbMultilingualServiceNameItem build() {
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
         * the provider name
         * @param providerName The value for the {@code providerName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProviderName(java.lang.String providerName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (providerName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(providerName, null)));
            return this;
        }
        
        /**
         * the service name
         * @param serviceName The value for the {@code serviceName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setServiceName(java.lang.String serviceName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serviceName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(serviceName, null)));
            return this;
        }
    }
}
