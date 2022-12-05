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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("language_code"),
        Interop.valueLayout.ADDRESS.withName("provider_name"),
        Interop.valueLayout.ADDRESS.withName("service_name")
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
    public java.lang.String languageCode$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void languageCode$set(java.lang.String languageCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(languageCode));
    }
    
    /**
     * Get the value of the field {@code provider_name}
     * @return The value of the field {@code provider_name}
     */
    public java.lang.String providerName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code provider_name}
     * @param providerName The new value of the field {@code provider_name}
     */
    public void providerName$set(java.lang.String providerName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(providerName));
    }
    
    /**
     * Get the value of the field {@code service_name}
     * @return The value of the field {@code service_name}
     */
    public java.lang.String serviceName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code service_name}
     * @param serviceName The new value of the field {@code service_name}
     */
    public void serviceName$set(java.lang.String serviceName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(serviceName));
    }
    
    /**
     * Create a DvbMultilingualServiceNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DvbMultilingualServiceNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DvbMultilingualServiceNameItem struct;
        
         /**
         * A {@link DvbMultilingualServiceNameItem.Build} object constructs a {@link DvbMultilingualServiceNameItem} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DvbMultilingualServiceNameItem.allocate();
        }
        
         /**
         * Finish building the {@link DvbMultilingualServiceNameItem} struct.
         * @return A new instance of {@code DvbMultilingualServiceNameItem} with the fields 
         *         that were set in the Build object.
         */
        public DvbMultilingualServiceNameItem construct() {
            return struct;
        }
        
        /**
         * the ISO 639 language code
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLanguageCode(java.lang.String languageCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Interop.allocateNativeString(languageCode)));
            return this;
        }
        
        /**
         * the provider name
         * @param providerName The value for the {@code providerName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProviderName(java.lang.String providerName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("provider_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (providerName == null ? MemoryAddress.NULL : Interop.allocateNativeString(providerName)));
            return this;
        }
        
        /**
         * the service name
         * @param serviceName The value for the {@code serviceName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setServiceName(java.lang.String serviceName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serviceName == null ? MemoryAddress.NULL : Interop.allocateNativeString(serviceName)));
            return this;
        }
    }
}
