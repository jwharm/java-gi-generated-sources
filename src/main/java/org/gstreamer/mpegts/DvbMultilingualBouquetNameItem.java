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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DvbMultilingualBouquetNameItem newInstance = new DvbMultilingualBouquetNameItem(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code bouquet_name}
     * @return The value of the field {@code bouquet_name}
     */
    public java.lang.String getBouquetName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code bouquet_name}
     * @param bouquetName The new value of the field {@code bouquet_name}
     */
    public void setBouquetName(java.lang.String bouquetName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bouquetName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bouquetName, null)));
    }
    
    /**
     * Create a DvbMultilingualBouquetNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DvbMultilingualBouquetNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DvbMultilingualBouquetNameItem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DvbMultilingualBouquetNameItem(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (languageCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(languageCode, null)));
            return this;
        }
        
        /**
         * the bouquet name
         * @param bouquetName The value for the {@code bouquetName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBouquetName(java.lang.String bouquetName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bouquetName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bouquetName, null)));
            return this;
        }
    }
}
