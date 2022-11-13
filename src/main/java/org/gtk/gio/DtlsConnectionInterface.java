package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual method table for a {@link DtlsConnection} implementation.
 * @version 2.48
 */
public class DtlsConnectionInterface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDtlsConnectionInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("accept_certificate"),
        Interop.valueLayout.ADDRESS.withName("handshake"),
        Interop.valueLayout.ADDRESS.withName("handshake_async"),
        Interop.valueLayout.ADDRESS.withName("handshake_finish"),
        Interop.valueLayout.ADDRESS.withName("shutdown"),
        Interop.valueLayout.ADDRESS.withName("shutdown_async"),
        Interop.valueLayout.ADDRESS.withName("shutdown_finish"),
        Interop.valueLayout.ADDRESS.withName("set_advertised_protocols"),
        Interop.valueLayout.ADDRESS.withName("get_negotiated_protocol"),
        Interop.valueLayout.ADDRESS.withName("get_binding_data")
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
    
    public static DtlsConnectionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DtlsConnectionInterface newInstance = new DtlsConnectionInterface(segment.address(), Ownership.NONE);
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
     * Create a DtlsConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DtlsConnectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
