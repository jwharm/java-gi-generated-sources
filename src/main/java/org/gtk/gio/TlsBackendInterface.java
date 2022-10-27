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
    ).withName("GTlsBackendInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TlsBackendInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
