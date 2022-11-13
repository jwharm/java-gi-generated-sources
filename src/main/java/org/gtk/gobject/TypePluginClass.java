package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TypePlugin} interface is used by the type system in order to handle
 * the lifecycle of dynamically loaded types.
 */
public class TypePluginClass extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypePluginClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("use_plugin"),
        Interop.valueLayout.ADDRESS.withName("unuse_plugin"),
        Interop.valueLayout.ADDRESS.withName("complete_type_info"),
        Interop.valueLayout.ADDRESS.withName("complete_interface_info")
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
    
    public static TypePluginClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypePluginClass newInstance = new TypePluginClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code use_plugin}
     * @return The value of the field {@code use_plugin}
     */
    public org.gtk.gobject.TypePluginUse use_plugin$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("use_plugin"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code unuse_plugin}
     * @return The value of the field {@code unuse_plugin}
     */
    public org.gtk.gobject.TypePluginUnuse unuse_plugin$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unuse_plugin"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code complete_type_info}
     * @return The value of the field {@code complete_type_info}
     */
    public org.gtk.gobject.TypePluginCompleteTypeInfo complete_type_info$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("complete_type_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code complete_interface_info}
     * @return The value of the field {@code complete_interface_info}
     */
    public org.gtk.gobject.TypePluginCompleteInterfaceInfo complete_interface_info$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("complete_interface_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a TypePluginClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypePluginClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
