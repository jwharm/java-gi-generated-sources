package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Glyph extent values, measured in font units.
 * <p>
 * Note that {@code height} is negative, in coordinate systems that grow up.
 */
public class GlyphExtentsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_extents_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("x_bearing"),
        Interop.valueLayout.C_INT.withName("y_bearing"),
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("height")
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
     * Allocate a new {@link GlyphExtentsT}
     * @return A new, uninitialized @{link GlyphExtentsT}
     */
    public static GlyphExtentsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphExtentsT newInstance = new GlyphExtentsT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x_bearing}
     * @return The value of the field {@code x_bearing}
     */
    public org.harfbuzz.PositionT xBearing$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code x_bearing}
     * @param xBearing The new value of the field {@code x_bearing}
     */
    public void xBearing$set(org.harfbuzz.PositionT xBearing) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), xBearing.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code y_bearing}
     * @return The value of the field {@code y_bearing}
     */
    public org.harfbuzz.PositionT yBearing$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code y_bearing}
     * @param yBearing The new value of the field {@code y_bearing}
     */
    public void yBearing$set(org.harfbuzz.PositionT yBearing) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), yBearing.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public org.harfbuzz.PositionT width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(org.harfbuzz.PositionT width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public org.harfbuzz.PositionT height$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void height$set(org.harfbuzz.PositionT height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height.getValue().intValue());
    }
    
    /**
     * Create a GlyphExtentsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphExtentsT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GlyphExtentsT struct;
        
         /**
         * A {@link GlyphExtentsT.Build} object constructs a {@link GlyphExtentsT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GlyphExtentsT.allocate();
        }
        
         /**
         * Finish building the {@link GlyphExtentsT} struct.
         * @return A new instance of {@code GlyphExtentsT} with the fields 
         *         that were set in the Build object.
         */
        public GlyphExtentsT construct() {
            return struct;
        }
        
        /**
         * Distance from the x-origin to the left extremum of the glyph.
         * @param xBearing The value for the {@code xBearing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setXBearing(org.harfbuzz.PositionT xBearing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (xBearing == null ? MemoryAddress.NULL : xBearing.getValue().intValue()));
            return this;
        }
        
        /**
         * Distance from the top extremum of the glyph to the y-origin.
         * @param yBearing The value for the {@code yBearing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setYBearing(org.harfbuzz.PositionT yBearing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (yBearing == null ? MemoryAddress.NULL : yBearing.getValue().intValue()));
            return this;
        }
        
        /**
         * Distance from the left extremum of the glyph to the right extremum.
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidth(org.harfbuzz.PositionT width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (width == null ? MemoryAddress.NULL : width.getValue().intValue()));
            return this;
        }
        
        /**
         * Distance from the top extremum of the glyph to the bottom extremum.
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeight(org.harfbuzz.PositionT height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (height == null ? MemoryAddress.NULL : height.getValue().intValue()));
            return this;
        }
    }
}
