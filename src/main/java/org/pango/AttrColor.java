package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrColor} structure is used to represent attributes that
 * are colors.
 */
public class AttrColor extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrColor";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Attribute.getMemoryLayout().withName("attr"),
        org.pango.Color.getMemoryLayout().withName("color")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AttrColor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrColor newInstance = new AttrColor(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.Attribute attr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return new org.pango.Attribute(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code color}
     * @return The value of the field {@code color}
     */
    public org.pango.Color color$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("color"));
        return new org.pango.Color(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public AttrColor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
