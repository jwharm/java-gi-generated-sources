package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * a multilingual bouquet name entry
 */
public class DvbMultilingualBouquetNameItem extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDvbMultilingualBouquetNameItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("language_code"),
            Interop.valueLayout.ADDRESS.withName("bouquet_name")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DvbMultilingualBouquetNameItem}
     * @return A new, uninitialized @{link DvbMultilingualBouquetNameItem}
     */
    public static DvbMultilingualBouquetNameItem allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DvbMultilingualBouquetNameItem newInstance = new DvbMultilingualBouquetNameItem(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code language_code}
     * @return The value of the field {@code language_code}
     */
    public java.lang.String getLanguageCode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code language_code}
     * @param languageCode The new value of the field {@code language_code}
     */
    public void setLanguageCode(java.lang.String languageCode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code bouquet_name}
     * @return The value of the field {@code bouquet_name}
     */
    public java.lang.String getBouquetName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code bouquet_name}
     * @param bouquetName The new value of the field {@code bouquet_name}
     */
    public void setBouquetName(java.lang.String bouquetName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bouquetName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bouquetName, SCOPE)));
        }
    }
    
    /**
     * Create a DvbMultilingualBouquetNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DvbMultilingualBouquetNameItem(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DvbMultilingualBouquetNameItem> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DvbMultilingualBouquetNameItem(input);
    
    /**
     * A {@link DvbMultilingualBouquetNameItem.Builder} object constructs a {@link DvbMultilingualBouquetNameItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DvbMultilingualBouquetNameItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DvbMultilingualBouquetNameItem struct;
        
        private Builder() {
            struct = DvbMultilingualBouquetNameItem.allocate();
        }
        
        /**
         * Finish building the {@link DvbMultilingualBouquetNameItem} struct.
         * @return A new instance of {@code DvbMultilingualBouquetNameItem} with the fields 
         *         that were set in the Builder object.
         */
        public DvbMultilingualBouquetNameItem build() {
            return struct;
        }
        
        /**
         * the ISO 639 language code
         * @param languageCode The value for the {@code languageCode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguageCode(java.lang.String languageCode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, SCOPE)));
                return this;
            }
        }
        
        /**
         * the bouquet name
         * @param bouquetName The value for the {@code bouquetName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBouquetName(java.lang.String bouquetName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bouquetName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bouquetName, SCOPE)));
                return this;
            }
        }
    }
}
