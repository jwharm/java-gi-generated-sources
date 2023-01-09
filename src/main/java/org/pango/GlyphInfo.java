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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("glyph"),
            MemoryLayout.paddingLayout(32),
            org.pango.GlyphGeometry.getMemoryLayout().withName("geometry"),
            org.pango.GlyphVisAttr.getMemoryLayout().withName("attr")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphInfo}
     * @return A new, uninitialized @{link GlyphInfo}
     */
    public static GlyphInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GlyphInfo newInstance = new GlyphInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph}
     * @return The value of the field {@code glyph}
     */
    public org.pango.Glyph getGlyph() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.pango.Glyph(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code glyph}
     * @param glyph The new value of the field {@code glyph}
     */
    public void setGlyph(org.pango.Glyph glyph) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code geometry}
     * @return The value of the field {@code geometry}
     */
    public org.pango.GlyphGeometry getGeometry() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("geometry"));
        return org.pango.GlyphGeometry.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code geometry}
     * @param geometry The new value of the field {@code geometry}
     */
    public void setGeometry(org.pango.GlyphGeometry geometry) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("geometry"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (geometry == null ? MemoryAddress.NULL : geometry.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.GlyphVisAttr getAttr() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return org.pango.GlyphVisAttr.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code attr}
     * @param attr The new value of the field {@code attr}
     */
    public void setAttr(org.pango.GlyphVisAttr attr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
        }
    }
    
    /**
     * Create a GlyphInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GlyphInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GlyphInfo(input);
    
    /**
     * A {@link GlyphInfo.Builder} object constructs a {@link GlyphInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphInfo struct;
        
        private Builder() {
            struct = GlyphInfo.allocate();
        }
        
        /**
         * Finish building the {@link GlyphInfo} struct.
         * @return A new instance of {@code GlyphInfo} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphInfo build() {
            return struct;
        }
        
        /**
         * the glyph itself.
         * @param glyph The value for the {@code glyph} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlyph(org.pango.Glyph glyph) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * the positional information about the glyph.
         * @param geometry The value for the {@code geometry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGeometry(org.pango.GlyphGeometry geometry) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("geometry"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (geometry == null ? MemoryAddress.NULL : geometry.handle()));
                return this;
            }
        }
        
        /**
         * the visual attributes of the glyph.
         * @param attr The value for the {@code attr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttr(org.pango.GlyphVisAttr attr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
                return this;
            }
        }
    }
}
