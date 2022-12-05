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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("names"),
        Interop.valueLayout.C_INT.withName("graduated_scale"),
        Interop.valueLayout.C_BYTE.withName("values_defined"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.ADDRESS.withName("values")
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
     * Get the value of the field {@code graduated_scale}
     * @return The value of the field {@code graduated_scale}
     */
    public boolean graduatedScale$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code graduated_scale}
     * @param graduatedScale The new value of the field {@code graduated_scale}
     */
    public void graduatedScale$set(boolean graduatedScale) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), graduatedScale ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code values_defined}
     * @return The value of the field {@code values_defined}
     */
    public byte valuesDefined$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values_defined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code values_defined}
     * @param valuesDefined The new value of the field {@code values_defined}
     */
    public void valuesDefined$set(byte valuesDefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values_defined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), valuesDefined);
    }
    
    /**
     * Create a AtscRRTDimension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscRRTDimension(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscRRTDimension struct;
        
         /**
         * A {@link AtscRRTDimension.Build} object constructs a {@link AtscRRTDimension} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscRRTDimension.allocate();
        }
        
         /**
         * Finish building the {@link AtscRRTDimension} struct.
         * @return A new instance of {@code AtscRRTDimension} with the fields 
         *         that were set in the Build object.
         */
        public AtscRRTDimension construct() {
            return struct;
        }
        
        /**
         * the names
         * @param names The value for the {@code names} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNames(org.gstreamer.mpegts.AtscMultString[] names) {
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
        public Build setGraduatedScale(boolean graduatedScale) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("graduated_scale"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), graduatedScale ? 1 : 0);
            return this;
        }
        
        /**
         * the number of values defined for this dimension
         * @param valuesDefined The value for the {@code valuesDefined} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValuesDefined(byte valuesDefined) {
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
        public Build setValues(org.gstreamer.mpegts.AtscRRTDimensionValue[] values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gstreamer.mpegts.AtscRRTDimensionValue.getMemoryLayout(), false)));
            return this;
        }
    }
}
