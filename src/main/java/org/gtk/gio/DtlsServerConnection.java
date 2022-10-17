package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DtlsServerConnection} is the server-side subclass of {@link DtlsConnection},
 * representing a server-side DTLS connection.
 */
public interface DtlsServerConnection extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_dtls_server_connection_new = Interop.downcallHandle(
        "g_dtls_server_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link DtlsServerConnection} wrapping {@code base_socket}.
     */
    public static @NotNull DtlsServerConnection new_(@NotNull DatagramBased baseSocket, @Nullable TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dtls_server_connection_new.invokeExact(baseSocket.handle(), certificate.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsServerConnection.DtlsServerConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        public DtlsServerConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
