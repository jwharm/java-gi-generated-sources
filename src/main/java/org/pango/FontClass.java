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
    public org.gtk.gobject.ObjectClass parent_class$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setDescribe(java.lang.foreign.MemoryAddress describe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe == null ? MemoryAddress.NULL : describe));
            return this;
        }
        
        public Build setGetCoverage(java.lang.foreign.MemoryAddress get_coverage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_coverage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_coverage == null ? MemoryAddress.NULL : get_coverage));
            return this;
        }
        
        public Build setGetGlyphExtents(java.lang.foreign.MemoryAddress get_glyph_extents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_glyph_extents"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_glyph_extents == null ? MemoryAddress.NULL : get_glyph_extents));
            return this;
        }
        
        public Build setGetMetrics(java.lang.foreign.MemoryAddress get_metrics) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_metrics == null ? MemoryAddress.NULL : get_metrics));
            return this;
        }
        
        public Build setGetFontMap(java.lang.foreign.MemoryAddress get_font_map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font_map == null ? MemoryAddress.NULL : get_font_map));
            return this;
        }
        
        public Build setDescribeAbsolute(java.lang.foreign.MemoryAddress describe_absolute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe_absolute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe_absolute == null ? MemoryAddress.NULL : describe_absolute));
            return this;
        }
        
        public Build setGetFeatures(java.lang.foreign.MemoryAddress get_features) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_features"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_features == null ? MemoryAddress.NULL : get_features));
            return this;
        }
        
        public Build setCreateHbFont(java.lang.foreign.MemoryAddress create_hb_font) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_hb_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_hb_font == null ? MemoryAddress.NULL : create_hb_font));
            return this;
        }
    }
}
