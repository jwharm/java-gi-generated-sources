package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GlyphInfoT} is the structure that holds information about the
 * glyphs and their relation to input text.
 */
public class GlyphInfoT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_info_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("codepoint"),
            Interop.valueLayout.C_INT.withName("mask"),
            Interop.valueLayout.C_INT.withName("cluster"),
            MemoryLayout.paddingLayout(32),
            org.harfbuzz.VarIntT.getMemoryLayout().withName("var1"),
            org.harfbuzz.VarIntT.getMemoryLayout().withName("var2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphInfoT}
     * @return A new, uninitialized @{link GlyphInfoT}
     */
    public static GlyphInfoT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphInfoT newInstance = new GlyphInfoT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code codepoint}
     * @return The value of the field {@code codepoint}
     */
    public org.harfbuzz.CodepointT getCodepoint() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codepoint"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Change the value of the field {@code codepoint}
     * @param codepoint The new value of the field {@code codepoint}
     */
    public void setCodepoint(org.harfbuzz.CodepointT codepoint) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codepoint"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (codepoint == null ? MemoryAddress.NULL : codepoint.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code cluster}
     * @return The value of the field {@code cluster}
     */
    public int getCluster() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cluster"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cluster}
     * @param cluster The new value of the field {@code cluster}
     */
    public void setCluster(int cluster) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cluster"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cluster);
    }
    
    /**
     * Create a GlyphInfoT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GlyphInfoT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphInfoT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GlyphInfoT(input, ownership);
    
    /**
     * A {@link GlyphInfoT.Builder} object constructs a {@link GlyphInfoT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphInfoT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphInfoT struct;
        
        private Builder() {
            struct = GlyphInfoT.allocate();
        }
        
         /**
         * Finish building the {@link GlyphInfoT} struct.
         * @return A new instance of {@code GlyphInfoT} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphInfoT build() {
            return struct;
        }
        
        /**
         * either a Unicode code point (before shaping) or a glyph index
         *             (after shaping).
         * @param codepoint The value for the {@code codepoint} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCodepoint(org.harfbuzz.CodepointT codepoint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("codepoint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (codepoint == null ? MemoryAddress.NULL : codepoint.getValue().intValue()));
            return this;
        }
        
        public Builder setMask(org.harfbuzz.MaskT mask) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mask == null ? MemoryAddress.NULL : mask.getValue().intValue()));
            return this;
        }
        
        /**
         * the index of the character in the original text that corresponds
         *           to this {@link GlyphInfoT}, or whatever the client passes to
         *           hb_buffer_add(). More than one {@link GlyphInfoT} can have the same
         *           {@code cluster} value, if they resulted from the same character (e.g. one
         *           to many glyph substitution), and when more than one character gets
         *           merged in the same glyph (e.g. many to one glyph substitution) the
         *           {@link GlyphInfoT} will have the smallest cluster value of them.
         *           By default some characters are merged into the same cluster
         *           (e.g. combining marks have the same cluster as their bases)
         *           even if they are separate glyphs, hb_buffer_set_cluster_level()
         *           allow selecting more fine-grained cluster handling.
         * @param cluster The value for the {@code cluster} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCluster(int cluster) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cluster"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), cluster);
            return this;
        }
        
        public Builder setVar1(org.harfbuzz.VarIntT var1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("var1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (var1 == null ? MemoryAddress.NULL : var1.handle()));
            return this;
        }
        
        public Builder setVar2(org.harfbuzz.VarIntT var2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("var2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (var2 == null ? MemoryAddress.NULL : var2.handle()));
            return this;
        }
    }
}
