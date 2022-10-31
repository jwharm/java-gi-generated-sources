package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontFaceClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFaceClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_face_name"),
        Interop.valueLayout.ADDRESS.withName("describe"),
        Interop.valueLayout.ADDRESS.withName("list_sizes"),
        Interop.valueLayout.ADDRESS.withName("is_synthesized"),
        Interop.valueLayout.ADDRESS.withName("get_family"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FontFaceClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontFaceClass newInstance = new FontFaceClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public FontFaceClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
