package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * In order to implement dynamic loading of types based on {@link TypeModule},
 * the {@code load} and {@code unload} functions in {@link TypeModuleClass} must be implemented.
 */
public class TypeModuleClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeModuleClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("load"),
        Interop.valueLayout.ADDRESS.withName("unload"),
        Interop.valueLayout.ADDRESS.withName("reserved1"),
        Interop.valueLayout.ADDRESS.withName("reserved2"),
        Interop.valueLayout.ADDRESS.withName("reserved3"),
        Interop.valueLayout.ADDRESS.withName("reserved4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TypeModuleClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeModuleClass newInstance = new TypeModuleClass(Refcounted.get(segment.address()));
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
    public TypeModuleClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
