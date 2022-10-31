package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Font-wide extent values, measured in font units.
 * <p>
 * Note that typically {@code ascender} is positive and {@code descender}
 * negative, in coordinate systems that grow up.
 */
public class FontExtentsT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_font_extents_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ascender"),
        ValueLayout.JAVA_INT.withName("descender"),
        ValueLayout.JAVA_INT.withName("line_gap"),
        ValueLayout.JAVA_INT.withName("reserved9"),
        ValueLayout.JAVA_INT.withName("reserved8"),
        ValueLayout.JAVA_INT.withName("reserved7"),
        ValueLayout.JAVA_INT.withName("reserved6"),
        ValueLayout.JAVA_INT.withName("reserved5"),
        ValueLayout.JAVA_INT.withName("reserved4"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.JAVA_INT.withName("reserved2"),
        ValueLayout.JAVA_INT.withName("reserved1")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FontExtentsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontExtentsT newInstance = new FontExtentsT(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ascender}
     * @return The value of the field {@code ascender}
     */
    public org.harfbuzz.PositionT ascender$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ascender"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code ascender}
     * @param ascender The new value of the field {@code ascender}
     */
    public void ascender$set(org.harfbuzz.PositionT ascender) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ascender"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ascender.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code descender}
     * @return The value of the field {@code descender}
     */
    public org.harfbuzz.PositionT descender$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descender"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code descender}
     * @param descender The new value of the field {@code descender}
     */
    public void descender$set(org.harfbuzz.PositionT descender) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descender"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), descender.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code line_gap}
     * @return The value of the field {@code line_gap}
     */
    public org.harfbuzz.PositionT line_gap$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_gap"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code line_gap}
     * @param line_gap The new value of the field {@code line_gap}
     */
    public void line_gap$set(org.harfbuzz.PositionT line_gap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_gap"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), line_gap.getValue().intValue());
    }
    
    @ApiStatus.Internal
    public FontExtentsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
