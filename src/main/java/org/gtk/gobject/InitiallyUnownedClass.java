package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GInitiallyUnowned type.
 */
public class InitiallyUnownedClass extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnownedClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        Interop.valueLayout.ADDRESS.withName("construct_properties"),
        Interop.valueLayout.ADDRESS.withName("constructor"),
        Interop.valueLayout.ADDRESS.withName("set_property"),
        Interop.valueLayout.ADDRESS.withName("get_property"),
        Interop.valueLayout.ADDRESS.withName("dispose"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("dispatch_properties_changed"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("constructed"),
        ValueLayout.JAVA_LONG.withName("flags"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(6, ValueLayout.ADDRESS).withName("pdummy")
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
    
    public static InitiallyUnownedClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InitiallyUnownedClass newInstance = new InitiallyUnownedClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass g_type_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return new org.gtk.gobject.TypeClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a InitiallyUnownedClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InitiallyUnownedClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
