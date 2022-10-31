package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrFontDesc} structure is used to store an attribute that
 * sets all aspects of the font description at once.
 */
public class AttrFontDesc extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrFontDesc";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Attribute.getMemoryLayout().withName("attr"),
        Interop.valueLayout.ADDRESS.withName("desc")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AttrFontDesc allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrFontDesc newInstance = new AttrFontDesc(Refcounted.get(segment.address()));
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
     * Get the value of the field {@code desc}
     * @return The value of the field {@code desc}
     */
    public org.pango.FontDescription desc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.FontDescription(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code desc}
     * @param desc The new value of the field {@code desc}
     */
    public void desc$set(org.pango.FontDescription desc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), desc.handle());
    }
    
    @ApiStatus.Internal
    public AttrFontDesc(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Create a new font description attribute.
     * <p>
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     * @param desc the font description
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute new_(@NotNull org.pango.FontDescription desc) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_desc_new.invokeExact(
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
            "pango_attr_font_desc_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
