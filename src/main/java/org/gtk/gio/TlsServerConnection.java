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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TlsServerConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsServerConnection", a ClassCastException will be thrown.
     */
    public static TlsServerConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TlsServerConnection.getType())) {
            return new TlsServerConnectionImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsServerConnection");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.TlsServerConnection new_(@NotNull org.gtk.gio.IOStream baseIoStream, @Nullable org.gtk.gio.TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(baseIoStream, "Parameter 'baseIoStream' must not be null");
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
        return new org.gtk.gio.TlsServerConnection.TlsServerConnectionImpl(RESULT, Ownership.FULL);
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
    
    class TlsServerConnectionImpl extends org.gtk.gobject.Object implements TlsServerConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsServerConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
