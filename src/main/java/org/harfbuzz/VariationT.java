package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding variation data. Registered OpenType
 * variation-axis tags are listed in
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Axis Tag Registry</a>.
 * @version 1.4.2
 */
public class VariationT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_variation_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("tag"),
            Interop.valueLayout.C_FLOAT.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VariationT}
     * @return A new, uninitialized @{link VariationT}
     */
    public static VariationT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VariationT newInstance = new VariationT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tag}
     * @return The value of the field {@code tag}
     */
    public org.harfbuzz.TagT getTag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void setTag(org.harfbuzz.TagT tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tag == null ? MemoryAddress.NULL : tag.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public float getValue() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(float value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Create a VariationT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VariationT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VariationT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VariationT(input, ownership);
    
    /**
     * Converts an {@link VariationT} into a {@code NULL}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     * @param buf output string
     * @param size the allocated size of {@code buf}
     */
    public void String(Out<java.lang.String[]> buf, int size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_variation_to_string.invokeExact(
                    handle(),
                    (Addressable) bufPOINTER.address(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        java.lang.String[] bufARRAY = new java.lang.String[size];
        for (int I = 0; I < size; I++) {
            var OBJ = bufPOINTER.get(Interop.valueLayout.ADDRESS, I);
            bufARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        buf.set(bufARRAY);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle hb_variation_to_string = Interop.downcallHandle(
            "hb_variation_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
    
    /**
     * A {@link VariationT.Builder} object constructs a {@link VariationT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VariationT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VariationT struct;
        
        private Builder() {
            struct = VariationT.allocate();
        }
        
         /**
         * Finish building the {@link VariationT} struct.
         * @return A new instance of {@code VariationT} with the fields 
         *         that were set in the Builder object.
         */
        public VariationT build() {
            return struct;
        }
        
        /**
         * The {@link TagT} tag of the variation-axis name
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTag(org.harfbuzz.TagT tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tag == null ? MemoryAddress.NULL : tag.getValue().intValue()));
            return this;
        }
        
        /**
         * The value of the variation axis
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(float value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
    }
}
