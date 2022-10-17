package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsServerConnection} is the server-side subclass of {@link TlsConnection},
 * representing a server-side TLS connection.
 */
public interface TlsServerConnection extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_tls_server_connection_new = Interop.downcallHandle(
        "g_tls_server_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link TlsServerConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams).
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
     * this function has returned.
     */
    public static @NotNull TlsServerConnection new_(@NotNull IOStream baseIoStream, @Nullable TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_server_connection_new.invokeExact(baseIoStream.handle(), certificate.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsServerConnection.TlsServerConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    class TlsServerConnectionImpl extends org.gtk.gobject.Object implements TlsServerConnection {
        public TlsServerConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
