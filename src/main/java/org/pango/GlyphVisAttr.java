package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphVisAttr} structure communicates information between
 * the shaping and rendering phases.
 * <p>
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 * <p>
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphVisAttr";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("is_cluster_start"),
            Interop.valueLayout.C_INT.withName("is_color")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphVisAttr}
     * @return A new, uninitialized @{link GlyphVisAttr}
     */
    public static GlyphVisAttr allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GlyphVisAttr newInstance = new GlyphVisAttr(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_cluster_start}
     * @return The value of the field {@code is_cluster_start}
     */
    public int getIsClusterStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_cluster_start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_cluster_start}
     * @param isClusterStart The new value of the field {@code is_cluster_start}
     */
    public void setIsClusterStart(int isClusterStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_cluster_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isClusterStart);
        }
    }
    
    /**
     * Get the value of the field {@code is_color}
     * @return The value of the field {@code is_color}
     */
    public int getIsColor() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_color"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_color}
     * @param isColor The new value of the field {@code is_color}
     */
    public void setIsColor(int isColor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_color"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isColor);
        }
    }
    
    /**
     * Create a GlyphVisAttr proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GlyphVisAttr(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphVisAttr> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GlyphVisAttr(input);
    
    /**
     * A {@link GlyphVisAttr.Builder} object constructs a {@link GlyphVisAttr} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphVisAttr.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphVisAttr struct;
        
        private Builder() {
            struct = GlyphVisAttr.allocate();
        }
        
        /**
         * Finish building the {@link GlyphVisAttr} struct.
         * @return A new instance of {@code GlyphVisAttr} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphVisAttr build() {
            return struct;
        }
        
        /**
         * set for the first logical glyph in each cluster.
         * @param isClusterStart The value for the {@code isClusterStart} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsClusterStart(int isClusterStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_cluster_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isClusterStart);
                return this;
            }
        }
        
        /**
         * set if the the font will render this glyph with color. Since 1.50
         * @param isColor The value for the {@code isColor} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsColor(int isColor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_color"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isColor);
                return this;
            }
        }
    }
}
