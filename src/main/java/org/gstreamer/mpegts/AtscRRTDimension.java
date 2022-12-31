package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AtscRRTDimension extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscRRTDimension";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("names"),
            Interop.valueLayout.C_INT.withName("graduated_scale"),
            Interop.valueLayout.C_BYTE.withName("values_defined"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.ADDRESS.withName("values")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscRRTDimension}
     * @return A new, uninitialized @{link AtscRRTDimension}
     */
    public static AtscRRTDimension allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscRRTDimension newInstance = new AtscRRTDimension(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code names}
     * @return The value of the field {@code names}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscMultString> getNames() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("names"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscMultString>(RESULT, org.gstreamer.mpegts.AtscMultString.fromAddress);
    }
    
    /**
     * Change the value of the field {@code names}
     * @param names The new value of the field {@code names}
     */
    public void setNames(org.gstreamer.mpegts.AtscMultString[] names) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("names"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code graduated_scale}
     * @return The value of the field {@code graduated_scale}
     */
    public boolean getGraduatedScale() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code graduated_scale}
     * @param graduatedScale The new value of the field {@code graduated_scale}
     */
    public void setGraduatedScale(boolean graduatedScale) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(graduatedScale, null).intValue());
    }
    
    /**
     * Get the value of the field {@code values_defined}
     * @return The value of the field {@code values_defined}
     */
    public byte getValuesDefined() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values_defined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code values_defined}
     * @param valuesDefined The new value of the field {@code values_defined}
     */
    public void setValuesDefined(byte valuesDefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values_defined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), valuesDefined);
    }
    
    /**
     * Get the value of the field {@code values}
     * @return The value of the field {@code values}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscRRTDimensionValue> getValues() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscRRTDimensionValue>(RESULT, org.gstreamer.mpegts.AtscRRTDimensionValue.fromAddress);
    }
    
    /**
     * Change the value of the field {@code values}
     * @param values The new value of the field {@code values}
     */
    public void setValues(org.gstreamer.mpegts.AtscRRTDimensionValue[] values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gstreamer.mpegts.AtscRRTDimensionValue.getMemoryLayout(), false)));
    }
    
    /**
     * Create a AtscRRTDimension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscRRTDimension(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscRRTDimension> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscRRTDimension(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_rrt_dimension_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscRRTDimension() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_rrt_dimension_new = Interop.downcallHandle(
            "gst_mpegts_atsc_rrt_dimension_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AtscRRTDimension.Builder} object constructs a {@link AtscRRTDimension} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscRRTDimension.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscRRTDimension struct;
        
        private Builder() {
            struct = AtscRRTDimension.allocate();
        }
        
         /**
         * Finish building the {@link AtscRRTDimension} struct.
         * @return A new instance of {@code AtscRRTDimension} with the fields 
         *         that were set in the Builder object.
         */
        public AtscRRTDimension build() {
            return struct;
        }
        
        /**
         * the names
         * @param names The value for the {@code names} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNames(org.gstreamer.mpegts.AtscMultString[] names) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * whether the ratings represent a graduated scale
         * @param graduatedScale The value for the {@code graduatedScale} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGraduatedScale(boolean graduatedScale) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(graduatedScale, null).intValue());
            return this;
        }
        
        /**
         * the number of values defined for this dimension
         * @param valuesDefined The value for the {@code valuesDefined} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValuesDefined(byte valuesDefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values_defined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), valuesDefined);
            return this;
        }
        
        /**
         * set of values
         * @param values The value for the {@code values} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValues(org.gstreamer.mpegts.AtscRRTDimensionValue[] values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gstreamer.mpegts.AtscRRTDimensionValue.getMemoryLayout(), false)));
            return this;
        }
    }
}
