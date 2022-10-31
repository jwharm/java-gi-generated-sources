package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for creating {@link Drive} implementations.
 */
public class DriveIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDriveIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("disconnected"),
        Interop.valueLayout.ADDRESS.withName("eject_button"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("has_volumes"),
        Interop.valueLayout.ADDRESS.withName("get_volumes"),
        Interop.valueLayout.ADDRESS.withName("is_media_removable"),
        Interop.valueLayout.ADDRESS.withName("has_media"),
        Interop.valueLayout.ADDRESS.withName("is_media_check_automatic"),
        Interop.valueLayout.ADDRESS.withName("can_eject"),
        Interop.valueLayout.ADDRESS.withName("can_poll_for_media"),
        Interop.valueLayout.ADDRESS.withName("eject"),
        Interop.valueLayout.ADDRESS.withName("eject_finish"),
        Interop.valueLayout.ADDRESS.withName("poll_for_media"),
        Interop.valueLayout.ADDRESS.withName("poll_for_media_finish"),
        Interop.valueLayout.ADDRESS.withName("get_identifier"),
        Interop.valueLayout.ADDRESS.withName("enumerate_identifiers"),
        Interop.valueLayout.ADDRESS.withName("get_start_stop_type"),
        Interop.valueLayout.ADDRESS.withName("can_start"),
        Interop.valueLayout.ADDRESS.withName("can_start_degraded"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("start_finish"),
        Interop.valueLayout.ADDRESS.withName("can_stop"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("stop_finish"),
        Interop.valueLayout.ADDRESS.withName("stop_button"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("get_sort_key"),
        Interop.valueLayout.ADDRESS.withName("get_symbolic_icon"),
        Interop.valueLayout.ADDRESS.withName("is_removable")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DriveIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DriveIface newInstance = new DriveIface(Refcounted.get(segment.address()));
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
    public DriveIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
