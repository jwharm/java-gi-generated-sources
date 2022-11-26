package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphInfo} structure represents a single glyph with
 * positioning information and visual attributes.
 */
public class GlyphInfo extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("glyph"),
        MemoryLayout.paddingLayout(32),
        org.pango.GlyphGeometry.getMemoryLayout().withName("geometry"),
        org.pango.GlyphVisAttr.getMemoryLayout().withName("attr")
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
     * Allocate a new {@link GlyphInfo}
     * @return A new, uninitialized @{link GlyphInfo}
     */
    public static GlyphInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphInfo newInstance = new GlyphInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph}
     * @return The value of the field {@code glyph}
     */
    public org.pango.Glyph glyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.Glyph(RESULT);
    }
    
    /**
     * Change the value of the field {@code glyph}
     * @param glyph The new value of the field {@code glyph}
     */
    public void glyph$set(org.pango.Glyph glyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glyph.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code geometry}
     * @return The value of the field {@code geometry}
     */
    public org.pango.GlyphGeometry geometry$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("geometry"));
        return new org.pango.GlyphGeometry(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.GlyphVisAttr attr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return new org.pango.GlyphVisAttr(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GlyphInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GlyphInfo struct;
        
         /**
         * A {@link GlyphInfo.Build} object constructs a {@link GlyphInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GlyphInfo.allocate();
        }
        
         /**
         * Finish building the {@link GlyphInfo} struct.
         * @return A new instance of {@code GlyphInfo} with the fields 
         *         that were set in the Build object.
         */
        public GlyphInfo construct() {
            return struct;
        }
        
        /**
         * the glyph itself.
         * @param glyph The value for the {@code glyph} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGlyph(org.pango.Glyph glyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
            return this;
        }
        
        /**
         * the positional information about the glyph.
         * @param geometry The value for the {@code geometry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGeometry(org.pango.GlyphGeometry geometry) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("geometry"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (geometry == null ? MemoryAddress.NULL : geometry.handle()));
            return this;
        }
        
        /**
         * the visual attributes of the glyph.
         * @param attr The value for the {@code attr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAttr(org.pango.GlyphVisAttr attr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
            return this;
        }
    }
}
