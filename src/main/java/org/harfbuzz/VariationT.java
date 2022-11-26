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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("tag"),
        Interop.valueLayout.C_FLOAT.withName("value")
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
    public org.harfbuzz.TagT tag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void tag$set(org.harfbuzz.TagT tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public float value$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(float value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Create a VariationT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VariationT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Converts an {@link VariationT} into a {@code NULL}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     * @param buf output string
     * @param size the allocated size of {@code buf}
     */
    public void String(@NotNull Out<java.lang.String[]> buf, Out<Integer> size) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_variation_to_string.invokeExact(
                    handle(),
                    (Addressable) bufPOINTER.address(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] bufARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = bufPOINTER.get(Interop.valueLayout.ADDRESS, I);
            bufARRAY[I] = Interop.getStringFrom(OBJ);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VariationT struct;
        
         /**
         * A {@link VariationT.Build} object constructs a {@link VariationT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VariationT.allocate();
        }
        
         /**
         * Finish building the {@link VariationT} struct.
         * @return A new instance of {@code VariationT} with the fields 
         *         that were set in the Build object.
         */
        public VariationT construct() {
            return struct;
        }
        
        /**
         * The {@link TagT} tag of the variation-axis name
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTag(org.harfbuzz.TagT tag) {
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
        public Build setValue(float value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
    }
}
