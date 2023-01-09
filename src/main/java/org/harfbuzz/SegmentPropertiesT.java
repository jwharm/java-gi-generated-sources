package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The structure that holds various text properties of an {@link BufferT}. Can be
 * set and retrieved using hb_buffer_set_segment_properties() and
 * hb_buffer_get_segment_properties(), respectively.
 */
public class SegmentPropertiesT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_segment_properties_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("direction"),
            Interop.valueLayout.C_INT.withName("script"),
            org.harfbuzz.LanguageT.getMemoryLayout().withName("language"),
            Interop.valueLayout.ADDRESS.withName("reserved1"),
            Interop.valueLayout.ADDRESS.withName("reserved2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SegmentPropertiesT}
     * @return A new, uninitialized @{link SegmentPropertiesT}
     */
    public static SegmentPropertiesT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SegmentPropertiesT newInstance = new SegmentPropertiesT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code direction}
     * @return The value of the field {@code direction}
     */
    public org.harfbuzz.DirectionT getDirection() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.harfbuzz.DirectionT.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code direction}
     * @param direction The new value of the field {@code direction}
     */
    public void setDirection(org.harfbuzz.DirectionT direction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code script}
     * @return The value of the field {@code script}
     */
    public org.harfbuzz.ScriptT getScript() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("script"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.harfbuzz.ScriptT.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code script}
     * @param script The new value of the field {@code script}
     */
    public void setScript(org.harfbuzz.ScriptT script) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("script"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (script == null ? MemoryAddress.NULL : script.getValue()));
        }
    }
    
    /**
     * Create a SegmentPropertiesT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SegmentPropertiesT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SegmentPropertiesT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SegmentPropertiesT(input);
    
    /**
     * A {@link SegmentPropertiesT.Builder} object constructs a {@link SegmentPropertiesT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SegmentPropertiesT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SegmentPropertiesT struct;
        
        private Builder() {
            struct = SegmentPropertiesT.allocate();
        }
        
        /**
         * Finish building the {@link SegmentPropertiesT} struct.
         * @return A new instance of {@code SegmentPropertiesT} with the fields 
         *         that were set in the Builder object.
         */
        public SegmentPropertiesT build() {
            return struct;
        }
        
        /**
         * the {@link DirectionT} of the buffer, see hb_buffer_set_direction().
         * @param direction The value for the {@code direction} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.harfbuzz.DirectionT direction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
                return this;
            }
        }
        
        /**
         * the {@link ScriptT} of the buffer, see hb_buffer_set_script().
         * @param script The value for the {@code script} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScript(org.harfbuzz.ScriptT script) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("script"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (script == null ? MemoryAddress.NULL : script.getValue()));
                return this;
            }
        }
        
        /**
         * the {@link LanguageT} of the buffer, see hb_buffer_set_language().
         * @param language The value for the {@code language} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguage(org.harfbuzz.LanguageT language) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("language"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
                return this;
            }
        }
        
        public Builder setReserved1(java.lang.foreign.MemoryAddress reserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved1 == null ? MemoryAddress.NULL : (Addressable) reserved1));
                return this;
            }
        }
        
        public Builder setReserved2(java.lang.foreign.MemoryAddress reserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved2 == null ? MemoryAddress.NULL : (Addressable) reserved2));
                return this;
            }
        }
    }
}
