package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsFileDatabase} is implemented by {@link TlsDatabase} objects which load
 * their certificate information from a file. It is an interface which
 * TLS library specific subtypes implement.
 * @version 2.30
 */
public interface TlsFileDatabase extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsFileDatabaseImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsFileDatabaseImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_file_database_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link TlsFileDatabase} which uses anchor certificate authorities
     * in {@code anchors} to verify certificate chains.
     * <p>
     * The certificates in {@code anchors} must be PEM encoded.
     * @param anchors filename of anchor certificate authorities.
     * @return the new
     * {@link TlsFileDatabase}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.TlsFileDatabase new_(java.lang.String anchors) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_file_database_new.invokeExact(
                    Marshal.stringToAddress.marshal(anchors, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.TlsFileDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.TlsFileDatabase.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_file_database_get_type = Interop.downcallHandle(
            "g_tls_file_database_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_file_database_new = Interop.downcallHandle(
            "g_tls_file_database_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class TlsFileDatabaseImpl extends org.gtk.gobject.GObject implements TlsFileDatabase {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsFileDatabaseImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
