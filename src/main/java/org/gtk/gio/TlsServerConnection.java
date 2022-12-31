package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsServerConnection} is the server-side subclass of {@link TlsConnection},
 * representing a server-side TLS connection.
 * @version 2.28
 */
public interface TlsServerConnection extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsServerConnectionImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsServerConnectionImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_server_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link TlsServerConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams).
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
     * this function has returned.
     * @param baseIoStream the {@link IOStream} to wrap
     * @param certificate the default server certificate, or {@code null}
     * @return the new
     * {@link TlsServerConnection}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.TlsServerConnection new_(org.gtk.gio.IOStream baseIoStream, @Nullable org.gtk.gio.TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_server_connection_new.invokeExact(
                    baseIoStream.handle(),
                    (Addressable) (certificate == null ? MemoryAddress.NULL : certificate.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.TlsServerConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.TlsServerConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_server_connection_get_type = Interop.downcallHandle(
            "g_tls_server_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_server_connection_new = Interop.downcallHandle(
            "g_tls_server_connection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class TlsServerConnectionImpl extends org.gtk.gobject.GObject implements TlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsServerConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
