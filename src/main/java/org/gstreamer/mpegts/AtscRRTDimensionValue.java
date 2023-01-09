package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AtscRRTDimensionValue extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscRRTDimensionValue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("abbrev_ratings"),
            Interop.valueLayout.ADDRESS.withName("ratings")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscRRTDimensionValue}
     * @return A new, uninitialized @{link AtscRRTDimensionValue}
     */
    public static AtscRRTDimensionValue allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AtscRRTDimensionValue newInstance = new AtscRRTDimensionValue(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code abbrev_ratings}
     * @return The value of the field {@code abbrev_ratings}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscMultString> getAbbrevRatings() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("abbrev_ratings"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.AtscMultString>(RESULT, org.gstreamer.mpegts.AtscMultString.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code abbrev_ratings}
     * @param abbrevRatings The new value of the field {@code abbrev_ratings}
     */
    public void setAbbrevRatings(org.gstreamer.mpegts.AtscMultString[] abbrevRatings) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("abbrev_ratings"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (abbrevRatings == null ? MemoryAddress.NULL : Interop.allocateNativeArray(abbrevRatings, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code ratings}
     * @return The value of the field {@code ratings}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscMultString> getRatings() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ratings"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.AtscMultString>(RESULT, org.gstreamer.mpegts.AtscMultString.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code ratings}
     * @param ratings The new value of the field {@code ratings}
     */
    public void setRatings(org.gstreamer.mpegts.AtscMultString[] ratings) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ratings"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ratings == null ? MemoryAddress.NULL : Interop.allocateNativeArray(ratings, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a AtscRRTDimensionValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AtscRRTDimensionValue(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscRRTDimensionValue> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AtscRRTDimensionValue(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_rrt_dimension_value_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscRRTDimensionValue() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_rrt_dimension_value_new = Interop.downcallHandle(
                "gst_mpegts_atsc_rrt_dimension_value_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link AtscRRTDimensionValue.Builder} object constructs a {@link AtscRRTDimensionValue} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscRRTDimensionValue.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscRRTDimensionValue struct;
        
        private Builder() {
            struct = AtscRRTDimensionValue.allocate();
        }
        
        /**
         * Finish building the {@link AtscRRTDimensionValue} struct.
         * @return A new instance of {@code AtscRRTDimensionValue} with the fields 
         *         that were set in the Builder object.
         */
        public AtscRRTDimensionValue build() {
            return struct;
        }
        
        /**
         * the abbreviated ratings
         * @param abbrevRatings The value for the {@code abbrevRatings} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAbbrevRatings(org.gstreamer.mpegts.AtscMultString[] abbrevRatings) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("abbrev_ratings"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (abbrevRatings == null ? MemoryAddress.NULL : Interop.allocateNativeArray(abbrevRatings, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the ratings
         * @param ratings The value for the {@code ratings} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRatings(org.gstreamer.mpegts.AtscMultString[] ratings) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ratings"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ratings == null ? MemoryAddress.NULL : Interop.allocateNativeArray(ratings, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
