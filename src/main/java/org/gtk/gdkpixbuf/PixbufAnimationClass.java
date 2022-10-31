package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimation}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_static_image"),
        Interop.valueLayout.ADDRESS.withName("get_static_image"),
        Interop.valueLayout.ADDRESS.withName("get_size"),
        Interop.valueLayout.ADDRESS.withName("get_iter")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PixbufAnimationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufAnimationClass newInstance = new PixbufAnimationClass(Refcounted.get(segment.address()));
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
    public PixbufAnimationClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
