package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoGlyphGeometry} structure contains width and positioning
 * information for a single glyph.
 * <p>
 * Note that {@code width} is not guaranteed to be the same as the glyph
 * extents. Kerning and other positioning applied during shaping will
 * affect both the {@code width} and the {@code x_offset} for the glyphs in the
 * glyph string that results from shaping.
 * <p>
 * The information in this struct is intended for rendering the glyphs,
 * as follows:
 * <p>
 * 1. Assume the current point is (x, y)
 * 2. Render the current glyph at (x + x_offset, y + y_offset),
 * 3. Advance the current point to (x + width, y)
 * 4. Render the next glyph
 */
public class GlyphGeometry extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphGeometry";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("x_offset"),
        Interop.valueLayout.C_INT.withName("y_offset")
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
     * Allocate a new {@link GlyphGeometry}
     * @return A new, uninitialized @{link GlyphGeometry}
     */
    public static GlyphGeometry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphGeometry newInstance = new GlyphGeometry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public org.pango.GlyphUnit width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(org.pango.GlyphUnit width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code x_offset}
     * @return The value of the field {@code x_offset}
     */
    public org.pango.GlyphUnit xOffset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code x_offset}
     * @param xOffset The new value of the field {@code x_offset}
     */
    public void xOffset$set(org.pango.GlyphUnit xOffset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xOffset.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code y_offset}
     * @return The value of the field {@code y_offset}
     */
    public org.pango.GlyphUnit yOffset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code y_offset}
     * @param yOffset The new value of the field {@code y_offset}
     */
    public void yOffset$set(org.pango.GlyphUnit yOffset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yOffset.getValue().intValue());
    }
    
    /**
     * Create a GlyphGeometry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphGeometry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GlyphGeometry struct;
        
         /**
         * A {@link GlyphGeometry.Build} object constructs a {@link GlyphGeometry} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GlyphGeometry.allocate();
        }
        
         /**
         * Finish building the {@link GlyphGeometry} struct.
         * @return A new instance of {@code GlyphGeometry} with the fields 
         *         that were set in the Build object.
         */
        public GlyphGeometry construct() {
            return struct;
        }
        
        /**
         * the logical width to use for the the character.
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidth(org.pango.GlyphUnit width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (width == null ? MemoryAddress.NULL : width.getValue().intValue()));
            return this;
        }
        
        /**
         * horizontal offset from nominal character position.
         * @param xOffset The value for the {@code xOffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setXOffset(org.pango.GlyphUnit xOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (xOffset == null ? MemoryAddress.NULL : xOffset.getValue().intValue()));
            return this;
        }
        
        /**
         * vertical offset from nominal character position.
         * @param yOffset The value for the {@code yOffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setYOffset(org.pango.GlyphUnit yOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (yOffset == null ? MemoryAddress.NULL : yOffset.getValue().intValue()));
            return this;
        }
    }
}
