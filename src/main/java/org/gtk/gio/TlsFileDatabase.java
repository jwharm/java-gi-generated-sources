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
    public static @NotNull org.gtk.gio.TlsFileDatabase new_(@NotNull java.lang.String anchors) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(anchors, "Parameter 'anchors' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_file_database_new.invokeExact(Interop.allocateNativeString(anchors), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsFileDatabase.TlsFileDatabaseImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_file_database_new = Interop.downcallHandle(
            "g_tls_file_database_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class TlsFileDatabaseImpl extends org.gtk.gobject.Object implements TlsFileDatabase {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsFileDatabaseImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
