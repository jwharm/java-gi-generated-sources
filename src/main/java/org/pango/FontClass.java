package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("describe"),
        Interop.valueLayout.ADDRESS.withName("get_coverage"),
        Interop.valueLayout.ADDRESS.withName("get_glyph_extents"),
        Interop.valueLayout.ADDRESS.withName("get_metrics"),
        Interop.valueLayout.ADDRESS.withName("get_font_map"),
        Interop.valueLayout.ADDRESS.withName("describe_absolute"),
        Interop.valueLayout.ADDRESS.withName("get_features"),
        Interop.valueLayout.ADDRESS.withName("create_hb_font")
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
     * Allocate a new {@link FontClass}
     * @return A new, uninitialized @{link FontClass}
     */
    public static FontClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontClass newInstance = new FontClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a FontClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontClass struct;
        
         /**
         * A {@link FontClass.Build} object constructs a {@link FontClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontClass.allocate();
        }
        
         /**
         * Finish building the {@link FontClass} struct.
         * @return A new instance of {@code FontClass} with the fields 
         *         that were set in the Build object.
         */
        public FontClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setDescribe(java.lang.foreign.MemoryAddress describe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe == null ? MemoryAddress.NULL : describe));
            return this;
        }
        
        public Build setGetCoverage(java.lang.foreign.MemoryAddress getCoverage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_coverage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCoverage == null ? MemoryAddress.NULL : getCoverage));
            return this;
        }
        
        public Build setGetGlyphExtents(java.lang.foreign.MemoryAddress getGlyphExtents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_glyph_extents"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlyphExtents == null ? MemoryAddress.NULL : getGlyphExtents));
            return this;
        }
        
        public Build setGetMetrics(java.lang.foreign.MemoryAddress getMetrics) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMetrics == null ? MemoryAddress.NULL : getMetrics));
            return this;
        }
        
        public Build setGetFontMap(java.lang.foreign.MemoryAddress getFontMap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap));
            return this;
        }
        
        public Build setDescribeAbsolute(java.lang.foreign.MemoryAddress describeAbsolute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe_absolute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describeAbsolute == null ? MemoryAddress.NULL : describeAbsolute));
            return this;
        }
        
        public Build setGetFeatures(java.lang.foreign.MemoryAddress getFeatures) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_features"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFeatures == null ? MemoryAddress.NULL : getFeatures));
            return this;
        }
        
        public Build setCreateHbFont(java.lang.foreign.MemoryAddress createHbFont) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_hb_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createHbFont == null ? MemoryAddress.NULL : createHbFont));
            return this;
        }
    }
}
