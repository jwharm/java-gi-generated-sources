package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DtlsServerConnection} is the server-side subclass of {@link DtlsConnection},
 * representing a server-side DTLS connection.
 * @version 2.48
 */
public interface DtlsServerConnection extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DtlsServerConnectionImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DtlsServerConnectionImpl(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dtls_server_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link DtlsServerConnection} wrapping {@code base_socket}.
     * @param baseSocket the {@link DatagramBased} to wrap
     * @param certificate the default server certificate, or {@code null}
     * @return the new
     *   {@link DtlsServerConnection}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.DtlsServerConnection new_(org.gtk.gio.DatagramBased baseSocket, @Nullable org.gtk.gio.TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dtls_server_connection_new.invokeExact(
                        baseSocket.handle(),
                        (Addressable) (certificate == null ? MemoryAddress.NULL : certificate.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.DtlsServerConnection) Interop.register(RESULT, org.gtk.gio.DtlsServerConnection.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_server_connection_get_type = Interop.downcallHandle(
                "g_dtls_server_connection_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_server_connection_new = Interop.downcallHandle(
                "g_dtls_server_connection_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * The DtlsServerConnectionImpl type represents a native instance of the DtlsServerConnection interface.
     */
    class DtlsServerConnectionImpl extends org.gtk.gobject.GObject implements DtlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DtlsServerConnection for the provided memory address.
         * @param address the memory address of the instance
         */
        public DtlsServerConnectionImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dtls_server_connection_get_type != null;
    }
}
