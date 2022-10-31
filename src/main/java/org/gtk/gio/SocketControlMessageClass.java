package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SocketControlMessage}.
 */
public class SocketControlMessageClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketControlMessageClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_size"),
        Interop.valueLayout.ADDRESS.withName("get_level"),
        Interop.valueLayout.ADDRESS.withName("get_type"),
        Interop.valueLayout.ADDRESS.withName("serialize"),
        Interop.valueLayout.ADDRESS.withName("deserialize"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static SocketControlMessageClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketControlMessageClass newInstance = new SocketControlMessageClass(Refcounted.get(segment.address()));
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
    public SocketControlMessageClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
