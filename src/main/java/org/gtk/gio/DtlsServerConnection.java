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
     * Creates a new {@link DtlsServerConnection} wrapping {@code base_socket}.
     * @param baseSocket the {@link DatagramBased} to wrap
     * @param certificate the default server certificate, or {@code null}
     * @return the new
     *   {@link DtlsServerConnection}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.DtlsServerConnection new_(@NotNull org.gtk.gio.DatagramBased baseSocket, @Nullable org.gtk.gio.TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(baseSocket, "Parameter 'baseSocket' must not be null");
        java.util.Objects.requireNonNullElse(certificate, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_server_connection_new.invokeExact(baseSocket.handle(), certificate.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.DtlsServerConnection.DtlsServerConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_server_connection_new = Interop.downcallHandle(
            "g_dtls_server_connection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DtlsServerConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
