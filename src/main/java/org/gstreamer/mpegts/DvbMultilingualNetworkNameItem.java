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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("language_code"),
        Interop.valueLayout.ADDRESS.withName("network_name")
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
     * Get the value of the field {@code network_name}
     * @return The value of the field {@code network_name}
     */
    public java.lang.String networkName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code network_name}
     * @param networkName The new value of the field {@code network_name}
     */
    public void networkName$set(java.lang.String networkName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(networkName));
    }
    
    /**
     * Create a DvbMultilingualNetworkNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DvbMultilingualNetworkNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DvbMultilingualNetworkNameItem struct;
        
         /**
         * A {@link DvbMultilingualNetworkNameItem.Build} object constructs a {@link DvbMultilingualNetworkNameItem} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DvbMultilingualNetworkNameItem.allocate();
        }
        
         /**
         * Finish building the {@link DvbMultilingualNetworkNameItem} struct.
         * @return A new instance of {@code DvbMultilingualNetworkNameItem} with the fields 
         *         that were set in the Build object.
         */
        public DvbMultilingualNetworkNameItem construct() {
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
         * the network name
         * @param networkName The value for the {@code networkName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNetworkName(java.lang.String networkName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (networkName == null ? MemoryAddress.NULL : Interop.allocateNativeString(networkName)));
            return this;
        }
    }
}
