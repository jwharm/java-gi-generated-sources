package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsFileDatabase} is implemented by {@link TlsDatabase} objects which load
 * their certificate information from a file. It is an interface which
 * TLS library specific subtypes implement.
 */
public interface TlsFileDatabase extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_tls_file_database_new = Interop.downcallHandle(
        "g_tls_file_database_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link TlsFileDatabase} which uses anchor certificate authorities
     * in {@code anchors} to verify certificate chains.
     * <p>
     * The certificates in {@code anchors} must be PEM encoded.
     */
    public static @NotNull TlsFileDatabase new_(@NotNull java.lang.String anchors) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_file_database_new.invokeExact(Interop.allocateNativeString(anchors), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsFileDatabase.TlsFileDatabaseImpl(Refcounted.get(RESULT, true));
    }
    
    class TlsFileDatabaseImpl extends org.gtk.gobject.Object implements TlsFileDatabase {
        public TlsFileDatabaseImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
