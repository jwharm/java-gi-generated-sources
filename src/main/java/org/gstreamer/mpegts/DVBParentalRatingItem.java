package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBParentalRatingItem extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBParentalRatingItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("country_code"),
            Interop.valueLayout.C_BYTE.withName("rating")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DVBParentalRatingItem}
     * @return A new, uninitialized @{link DVBParentalRatingItem}
     */
    public static DVBParentalRatingItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DVBParentalRatingItem newInstance = new DVBParentalRatingItem(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code country_code}
     * @return The value of the field {@code country_code}
     */
    public java.lang.String getCountryCode() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("country_code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code country_code}
     * @param countryCode The new value of the field {@code country_code}
     */
    public void setCountryCode(java.lang.String countryCode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("country_code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (countryCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(countryCode, null)));
    }
    
    /**
     * Get the value of the field {@code rating}
     * @return The value of the field {@code rating}
     */
    public byte getRating() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rating"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code rating}
     * @param rating The new value of the field {@code rating}
     */
    public void setRating(byte rating) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rating"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), rating);
    }
    
    /**
     * Create a DVBParentalRatingItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DVBParentalRatingItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DVBParentalRatingItem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DVBParentalRatingItem(input, ownership);
    
    /**
     * A {@link DVBParentalRatingItem.Builder} object constructs a {@link DVBParentalRatingItem} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DVBParentalRatingItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DVBParentalRatingItem struct;
        
        private Builder() {
            struct = DVBParentalRatingItem.allocate();
        }
        
         /**
         * Finish building the {@link DVBParentalRatingItem} struct.
         * @return A new instance of {@code DVBParentalRatingItem} with the fields 
         *         that were set in the Builder object.
         */
        public DVBParentalRatingItem build() {
            return struct;
        }
        
        public Builder setCountryCode(java.lang.String countryCode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("country_code"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (countryCode == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(countryCode, null)));
            return this;
        }
        
        public Builder setRating(byte rating) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rating"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), rating);
            return this;
        }
    }
}
