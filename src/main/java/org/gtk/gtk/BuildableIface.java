package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkBuildableIface} interface contains methods that are
 * necessary to allow {@code GtkBuilder} to construct an object from
 * a {@code GtkBuilder} UI definition.
 */
public class BuildableIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("set_id"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("add_child"),
        Interop.valueLayout.ADDRESS.withName("set_buildable_property"),
        Interop.valueLayout.ADDRESS.withName("construct_child"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_start"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_end"),
        Interop.valueLayout.ADDRESS.withName("custom_finished"),
        Interop.valueLayout.ADDRESS.withName("parser_finished"),
        Interop.valueLayout.ADDRESS.withName("get_internal_child")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static BuildableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuildableIface newInstance = new BuildableIface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public BuildableIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
