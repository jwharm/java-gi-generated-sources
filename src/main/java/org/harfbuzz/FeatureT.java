package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link FeatureT} is the structure that holds information about requested
 * feature application. The feature will be applied with the given value to all
 * glyphs which are in clusters between {@code start} (inclusive) and {@code end} (exclusive).
 * Setting start to {@code HB_FEATURE_GLOBAL_START} and end to {@code HB_FEATURE_GLOBAL_END}
 * specifies that the feature always applies to the entire buffer.
 */
public class FeatureT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_feature_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("tag"),
            Interop.valueLayout.C_INT.withName("value"),
            Interop.valueLayout.C_INT.withName("start"),
            Interop.valueLayout.C_INT.withName("end")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FeatureT}
     * @return A new, uninitialized @{link FeatureT}
     */
    public static FeatureT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FeatureT newInstance = new FeatureT(segment.address(), Ownership.NONE);
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
    public int getValue() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(int value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public int getStart() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(int start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
    }
    
    /**
     * Get the value of the field {@code end}
     * @return The value of the field {@code end}
     */
    public int getEnd() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void setEnd(int end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
    }
    
    /**
     * Create a FeatureT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FeatureT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FeatureT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FeatureT(input, ownership);
    
    /**
     * Converts a {@link FeatureT} into a {@code NULL}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     * @param buf output string
     * @param size the allocated size of {@code buf}
     */
    public void String(Out<java.lang.String[]> buf, int size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_feature_to_string.invokeExact(
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
        
        private static final MethodHandle hb_feature_to_string = Interop.downcallHandle(
            "hb_feature_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
    
    /**
     * A {@link FeatureT.Builder} object constructs a {@link FeatureT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FeatureT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FeatureT struct;
        
        private Builder() {
            struct = FeatureT.allocate();
        }
        
         /**
         * Finish building the {@link FeatureT} struct.
         * @return A new instance of {@code FeatureT} with the fields 
         *         that were set in the Builder object.
         */
        public FeatureT build() {
            return struct;
        }
        
        /**
         * The {@link TagT} tag of the feature
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
         * The value of the feature. 0 disables the feature, non-zero (usually
         * 1) enables the feature.  For features implemented as lookup type 3 (like
         * 'salt') the {@code value} is a one based index into the alternates.
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(int value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
        
        /**
         * the cluster to start applying this feature setting (inclusive).
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(int start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
            return this;
        }
        
        /**
         * the cluster to end applying this feature setting (exclusive).
         * @param end The value for the {@code end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnd(int end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
            return this;
        }
    }
}
