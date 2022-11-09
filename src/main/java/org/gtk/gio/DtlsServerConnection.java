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
     * Cast object to DtlsServerConnection if its GType is a (or inherits from) "GDtlsServerConnection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DtlsServerConnection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDtlsServerConnection", a ClassCastException will be thrown.
     */
    public static DtlsServerConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDtlsServerConnection"))) {
            return new DtlsServerConnectionImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDtlsServerConnection");
        }
    }
    
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
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return new org.gtk.gio.DtlsServerConnection.DtlsServerConnectionImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_server_connection_new = Interop.downcallHandle(
            "g_dtls_server_connection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DtlsServerConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
