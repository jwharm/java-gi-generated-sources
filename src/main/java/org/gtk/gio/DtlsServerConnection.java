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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DtlsServerConnectionImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DtlsServerConnectionImpl(input, ownership);
    
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return (org.gtk.gio.DtlsServerConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DtlsServerConnection.fromAddress).marshal(RESULT, Ownership.FULL);
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
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.GObject implements DtlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DtlsServerConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
