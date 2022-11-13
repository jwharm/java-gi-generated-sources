package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for describing TLS-related types.
 * @version 2.28
 */
public class TlsBackendInterface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsBackendInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("supports_tls"),
        Interop.valueLayout.ADDRESS.withName("get_certificate_type"),
        Interop.valueLayout.ADDRESS.withName("get_client_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_server_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_file_database_type"),
        Interop.valueLayout.ADDRESS.withName("get_default_database"),
        Interop.valueLayout.ADDRESS.withName("supports_dtls"),
        Interop.valueLayout.ADDRESS.withName("get_dtls_client_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_dtls_server_connection_type")
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
    
    public static TlsBackendInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsBackendInterface newInstance = new TlsBackendInterface(segment.address(), Ownership.NONE);
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
     * Create a TlsBackendInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsBackendInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
