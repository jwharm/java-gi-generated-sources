package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application Information interface, for operating system portability.
 */
public class AppInfoIface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppInfoIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("dup"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_description"),
        Interop.valueLayout.ADDRESS.withName("get_executable"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("launch"),
        Interop.valueLayout.ADDRESS.withName("supports_uris"),
        Interop.valueLayout.ADDRESS.withName("supports_files"),
        Interop.valueLayout.ADDRESS.withName("launch_uris"),
        Interop.valueLayout.ADDRESS.withName("should_show"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_type"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_extension"),
        Interop.valueLayout.ADDRESS.withName("add_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_delete"),
        Interop.valueLayout.ADDRESS.withName("do_delete"),
        Interop.valueLayout.ADDRESS.withName("get_commandline"),
        Interop.valueLayout.ADDRESS.withName("get_display_name"),
        Interop.valueLayout.ADDRESS.withName("set_as_last_used_for_type"),
        Interop.valueLayout.ADDRESS.withName("get_supported_types"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_async"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_finish")
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
    
    public static AppInfoIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppInfoIface newInstance = new AppInfoIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AppInfoIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppInfoIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
