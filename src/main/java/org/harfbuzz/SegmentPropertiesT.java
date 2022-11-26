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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("direction"),
        Interop.valueLayout.C_INT.withName("script"),
        org.harfbuzz.LanguageT.getMemoryLayout().withName("language"),
        Interop.valueLayout.ADDRESS.withName("reserved1"),
        Interop.valueLayout.ADDRESS.withName("reserved2")
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
     * Allocate a new {@link SegmentPropertiesT}
     * @return A new, uninitialized @{link SegmentPropertiesT}
     */
    public static SegmentPropertiesT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SegmentPropertiesT newInstance = new SegmentPropertiesT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code direction}
     * @return The value of the field {@code direction}
     */
    public org.harfbuzz.DirectionT direction$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("direction"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.DirectionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code direction}
     * @param direction The new value of the field {@code direction}
     */
    public void direction$set(org.harfbuzz.DirectionT direction) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("direction"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), direction.getValue());
    }
    
    /**
     * Get the value of the field {@code script}
     * @return The value of the field {@code script}
     */
    public org.harfbuzz.ScriptT script$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.ScriptT(RESULT);
    }
    
    /**
     * Change the value of the field {@code script}
     * @param script The new value of the field {@code script}
     */
    public void script$set(org.harfbuzz.ScriptT script) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), script.getValue());
    }
    
    /**
     * Create a SegmentPropertiesT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SegmentPropertiesT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SegmentPropertiesT struct;
        
         /**
         * A {@link SegmentPropertiesT.Build} object constructs a {@link SegmentPropertiesT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SegmentPropertiesT.allocate();
        }
        
         /**
         * Finish building the {@link SegmentPropertiesT} struct.
         * @return A new instance of {@code SegmentPropertiesT} with the fields 
         *         that were set in the Build object.
         */
        public SegmentPropertiesT construct() {
            return struct;
        }
        
        /**
         * the {@link DirectionT} of the buffer, see hb_buffer_set_direction().
         * @param direction The value for the {@code direction} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.harfbuzz.DirectionT direction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (direction == null ? MemoryAddress.NULL : direction.getValue()));
            return this;
        }
        
        /**
         * the {@link ScriptT} of the buffer, see hb_buffer_set_script().
         * @param script The value for the {@code script} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScript(org.harfbuzz.ScriptT script) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("script"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (script == null ? MemoryAddress.NULL : script.getValue()));
            return this;
        }
        
        /**
         * the {@link LanguageT} of the buffer, see hb_buffer_set_language().
         * @param language The value for the {@code language} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLanguage(org.harfbuzz.LanguageT language) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
            return this;
        }
        
        public Build setReserved1(java.lang.foreign.MemoryAddress reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved1 == null ? MemoryAddress.NULL : (Addressable) reserved1));
            return this;
        }
        
        public Build setReserved2(java.lang.foreign.MemoryAddress reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved2 == null ? MemoryAddress.NULL : (Addressable) reserved2));
            return this;
        }
    }
}
