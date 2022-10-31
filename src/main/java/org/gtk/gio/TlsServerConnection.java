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
    
    /**
     * Cast object to TlsServerConnection if its GType is a (or inherits from) "GTlsServerConnection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TlsServerConnection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsServerConnection", a ClassCastException will be thrown.
     */
    public static TlsServerConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GTlsServerConnection"))) {
            return new TlsServerConnectionImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsServerConnection");
        }
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
    public static @NotNull org.gtk.gio.TlsServerConnection new_(@NotNull org.gtk.gio.IOStream baseIoStream, @Nullable org.gtk.gio.TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(baseIoStream, "Parameter 'baseIoStream' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_server_connection_new.invokeExact(
                    baseIoStream.handle(),
                    (Addressable) (certificate == null ? MemoryAddress.NULL : certificate.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsServerConnection.TlsServerConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_server_connection_new = Interop.downcallHandle(
            "g_tls_server_connection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class TlsServerConnectionImpl extends org.gtk.gobject.Object implements TlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsServerConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
