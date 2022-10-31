package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for describing TLS-related types.
 * @version 2.28
 */
public class TlsBackendInterface extends io.github.jwharm.javagi.ResourceBase {
    
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
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TlsBackendInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsBackendInterface newInstance = new TlsBackendInterface(Refcounted.get(segment.address()));
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
    public TlsBackendInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
