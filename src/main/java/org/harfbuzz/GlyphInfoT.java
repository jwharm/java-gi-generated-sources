package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GlyphInfoT} is the structure that holds information about the
 * glyphs and their relation to input text.
 */
public class GlyphInfoT extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_info_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("codepoint"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("cluster"),
        MemoryLayout.paddingLayout(32),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var1"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var2")
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
    public org.harfbuzz.CodepointT codepoint$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codepoint"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Change the value of the field {@code codepoint}
     * @param codepoint The new value of the field {@code codepoint}
     */
    public void codepoint$set(org.harfbuzz.CodepointT codepoint) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codepoint"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), codepoint.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code cluster}
     * @return The value of the field {@code cluster}
     */
    public int cluster$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cluster"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cluster}
     * @param cluster The new value of the field {@code cluster}
     */
    public void cluster$set(int cluster) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cluster"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cluster);
    }
    
    /**
     * Create a GlyphInfoT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphInfoT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
