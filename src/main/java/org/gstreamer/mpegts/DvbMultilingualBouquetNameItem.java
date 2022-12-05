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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("language_code"),
        Interop.valueLayout.ADDRESS.withName("bouquet_name")
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
     * Get the value of the field {@code bouquet_name}
     * @return The value of the field {@code bouquet_name}
     */
    public java.lang.String bouquetName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code bouquet_name}
     * @param bouquetName The new value of the field {@code bouquet_name}
     */
    public void bouquetName$set(java.lang.String bouquetName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(bouquetName));
    }
    
    /**
     * Create a DvbMultilingualBouquetNameItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DvbMultilingualBouquetNameItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DvbMultilingualBouquetNameItem struct;
        
         /**
         * A {@link DvbMultilingualBouquetNameItem.Build} object constructs a {@link DvbMultilingualBouquetNameItem} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DvbMultilingualBouquetNameItem.allocate();
        }
        
         /**
         * Finish building the {@link DvbMultilingualBouquetNameItem} struct.
         * @return A new instance of {@code DvbMultilingualBouquetNameItem} with the fields 
         *         that were set in the Build object.
         */
        public DvbMultilingualBouquetNameItem construct() {
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
         * the bouquet name
         * @param bouquetName The value for the {@code bouquetName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBouquetName(java.lang.String bouquetName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bouquet_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bouquetName == null ? MemoryAddress.NULL : Interop.allocateNativeString(bouquetName)));
            return this;
        }
    }
}
