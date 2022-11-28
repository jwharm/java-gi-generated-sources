package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Font-wide extent values, measured in font units.
 * <p>
 * Note that typically {@code ascender} is positive and {@code descender}
 * negative, in coordinate systems that grow up.
 */
public class FontExtentsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_font_extents_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("ascender"),
        Interop.valueLayout.C_INT.withName("descender"),
        Interop.valueLayout.C_INT.withName("line_gap"),
        Interop.valueLayout.C_INT.withName("reserved9"),
        Interop.valueLayout.C_INT.withName("reserved8"),
        Interop.valueLayout.C_INT.withName("reserved7"),
        Interop.valueLayout.C_INT.withName("reserved6"),
        Interop.valueLayout.C_INT.withName("reserved5"),
        Interop.valueLayout.C_INT.withName("reserved4"),
        Interop.valueLayout.C_INT.withName("reserved3"),
        Interop.valueLayout.C_INT.withName("reserved2"),
        Interop.valueLayout.C_INT.withName("reserved1")
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
     * Allocate a new {@link FontExtentsT}
     * @return A new, uninitialized @{link FontExtentsT}
     */
    public static FontExtentsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontExtentsT newInstance = new FontExtentsT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ascender}
     * @return The value of the field {@code ascender}
     */
    public org.harfbuzz.PositionT ascender$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ascender"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code ascender}
     * @param ascender The new value of the field {@code ascender}
     */
    public void ascender$set(org.harfbuzz.PositionT ascender) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ascender"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ascender.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code descender}
     * @return The value of the field {@code descender}
     */
    public org.harfbuzz.PositionT descender$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descender"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code descender}
     * @param descender The new value of the field {@code descender}
     */
    public void descender$set(org.harfbuzz.PositionT descender) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descender"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), descender.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code line_gap}
     * @return The value of the field {@code line_gap}
     */
    public org.harfbuzz.PositionT lineGap$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_gap"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code line_gap}
     * @param lineGap The new value of the field {@code line_gap}
     */
    public void lineGap$set(org.harfbuzz.PositionT lineGap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_gap"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineGap.getValue().intValue());
    }
    
    /**
     * Create a FontExtentsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontExtentsT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontExtentsT struct;
        
         /**
         * A {@link FontExtentsT.Build} object constructs a {@link FontExtentsT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontExtentsT.allocate();
        }
        
         /**
         * Finish building the {@link FontExtentsT} struct.
         * @return A new instance of {@code FontExtentsT} with the fields 
         *         that were set in the Build object.
         */
        public FontExtentsT construct() {
            return struct;
        }
        
        /**
         * The height of typographic ascenders.
         * @param ascender The value for the {@code ascender} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAscender(org.harfbuzz.PositionT ascender) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ascender"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ascender == null ? MemoryAddress.NULL : ascender.getValue().intValue()));
            return this;
        }
        
        /**
         * The depth of typographic descenders.
         * @param descender The value for the {@code descender} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescender(org.harfbuzz.PositionT descender) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descender"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descender == null ? MemoryAddress.NULL : descender.getValue().intValue()));
            return this;
        }
        
        /**
         * The suggested line-spacing gap.
         * @param lineGap The value for the {@code lineGap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLineGap(org.harfbuzz.PositionT lineGap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line_gap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lineGap == null ? MemoryAddress.NULL : lineGap.getValue().intValue()));
            return this;
        }
        
        public Build setReserved9(org.harfbuzz.PositionT reserved9) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved9"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved9 == null ? MemoryAddress.NULL : reserved9.getValue().intValue()));
            return this;
        }
        
        public Build setReserved8(org.harfbuzz.PositionT reserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved8 == null ? MemoryAddress.NULL : reserved8.getValue().intValue()));
            return this;
        }
        
        public Build setReserved7(org.harfbuzz.PositionT reserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved7 == null ? MemoryAddress.NULL : reserved7.getValue().intValue()));
            return this;
        }
        
        public Build setReserved6(org.harfbuzz.PositionT reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved6 == null ? MemoryAddress.NULL : reserved6.getValue().intValue()));
            return this;
        }
        
        public Build setReserved5(org.harfbuzz.PositionT reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved5 == null ? MemoryAddress.NULL : reserved5.getValue().intValue()));
            return this;
        }
        
        public Build setReserved4(org.harfbuzz.PositionT reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved4 == null ? MemoryAddress.NULL : reserved4.getValue().intValue()));
            return this;
        }
        
        public Build setReserved3(org.harfbuzz.PositionT reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved3 == null ? MemoryAddress.NULL : reserved3.getValue().intValue()));
            return this;
        }
        
        public Build setReserved2(org.harfbuzz.PositionT reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved2 == null ? MemoryAddress.NULL : reserved2.getValue().intValue()));
            return this;
        }
        
        public Build setReserved1(org.harfbuzz.PositionT reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved1 == null ? MemoryAddress.NULL : reserved1.getValue().intValue()));
            return this;
        }
    }
}
