package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code PangoRenderer}.
 * <p>
 * The following vfuncs take user space coordinates in Pango units
 * and have default implementations:
 * <ul>
 * <li>draw_glyphs
 * <li>draw_rectangle
 * <li>draw_error_underline
 * <li>draw_shape
 * <li>draw_glyph_item
 * </ul>
 * <p>
 * The default draw_shape implementation draws nothing.
 * <p>
 * The following vfuncs take device space coordinates as doubles
 * and must be implemented:
 * <ul>
 * <li>draw_trapezoid
 * <li>draw_glyph
 * </ul>
 * @version 1.8
 */
public class RendererClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoRendererClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("draw_glyphs"),
        Interop.valueLayout.ADDRESS.withName("draw_rectangle"),
        Interop.valueLayout.ADDRESS.withName("draw_error_underline"),
        Interop.valueLayout.ADDRESS.withName("draw_shape"),
        Interop.valueLayout.ADDRESS.withName("draw_trapezoid"),
        Interop.valueLayout.ADDRESS.withName("draw_glyph"),
        Interop.valueLayout.ADDRESS.withName("part_changed"),
        Interop.valueLayout.ADDRESS.withName("begin"),
        Interop.valueLayout.ADDRESS.withName("end"),
        Interop.valueLayout.ADDRESS.withName("prepare_run"),
        Interop.valueLayout.ADDRESS.withName("draw_glyph_item"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
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
     * Allocate a new {@link RendererClass}
     * @return A new, uninitialized @{link RendererClass}
     */
    public static RendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RendererClass newInstance = new RendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RendererClass struct;
        
         /**
         * A {@link RendererClass.Build} object constructs a {@link RendererClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RendererClass.allocate();
        }
        
         /**
         * Finish building the {@link RendererClass} struct.
         * @return A new instance of {@code RendererClass} with the fields 
         *         that were set in the Build object.
         */
        public RendererClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setDrawGlyphs(java.lang.foreign.MemoryAddress drawGlyphs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyphs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphs == null ? MemoryAddress.NULL : drawGlyphs));
            return this;
        }
        
        public Build setDrawRectangle(java.lang.foreign.MemoryAddress drawRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawRectangle == null ? MemoryAddress.NULL : drawRectangle));
            return this;
        }
        
        public Build setDrawErrorUnderline(java.lang.foreign.MemoryAddress drawErrorUnderline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawErrorUnderline == null ? MemoryAddress.NULL : drawErrorUnderline));
            return this;
        }
        
        public Build setDrawShape(java.lang.foreign.MemoryAddress drawShape) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_shape"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawShape == null ? MemoryAddress.NULL : drawShape));
            return this;
        }
        
        public Build setDrawTrapezoid(java.lang.foreign.MemoryAddress drawTrapezoid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_trapezoid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawTrapezoid == null ? MemoryAddress.NULL : drawTrapezoid));
            return this;
        }
        
        public Build setDrawGlyph(java.lang.foreign.MemoryAddress drawGlyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyph == null ? MemoryAddress.NULL : drawGlyph));
            return this;
        }
        
        public Build setPartChanged(java.lang.foreign.MemoryAddress partChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("part_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (partChanged == null ? MemoryAddress.NULL : partChanged));
            return this;
        }
        
        public Build setBegin(java.lang.foreign.MemoryAddress begin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (begin == null ? MemoryAddress.NULL : begin));
            return this;
        }
        
        public Build setEnd(java.lang.foreign.MemoryAddress end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end == null ? MemoryAddress.NULL : end));
            return this;
        }
        
        public Build setPrepareRun(java.lang.foreign.MemoryAddress prepareRun) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_run"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareRun == null ? MemoryAddress.NULL : prepareRun));
            return this;
        }
        
        public Build setDrawGlyphItem(java.lang.foreign.MemoryAddress drawGlyphItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphItem == null ? MemoryAddress.NULL : drawGlyphItem));
            return this;
        }
        
        public Build setPangoReserved2(java.lang.foreign.MemoryAddress PangoReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved2 == null ? MemoryAddress.NULL : PangoReserved2));
            return this;
        }
        
        public Build setPangoReserved3(java.lang.foreign.MemoryAddress PangoReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3));
            return this;
        }
        
        public Build setPangoReserved4(java.lang.foreign.MemoryAddress PangoReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4));
            return this;
        }
    }
}
