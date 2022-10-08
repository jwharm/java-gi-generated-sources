package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link DtlsServerConnection} is the server-side subclass of {@link DtlsConnection},
 * representing a server-side DTLS connection.
 */
public interface DtlsServerConnection extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_dtls_server_connection_new = Interop.downcallHandle(
        "g_dtls_server_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link DtlsServerConnection} wrapping {@code base_socket}.
     */
    public static DtlsServerConnection new_(DatagramBased baseSocket, TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dtls_server_connection_new.invokeExact(baseSocket.handle(), certificate.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new DtlsServerConnection.DtlsServerConnectionImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        public DtlsServerConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
