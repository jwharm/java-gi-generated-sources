package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link TlsFileDatabase} is implemented by {@link TlsDatabase} objects which load
 * their certificate information from a file. It is an interface which
 * TLS library specific subtypes implement.
 */
public interface TlsFileDatabase extends io.github.jwharm.javagi.Proxy {

    /**
     * Creates a new {@link TlsFileDatabase} which uses anchor certificate authorities
     * in {@code anchors} to verify certificate chains.
     * <p>
     * The certificates in {@code anchors} must be PEM encoded.
     */
    public static TlsFileDatabase new_(java.lang.String anchors) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_file_database_new(Interop.allocateNativeString(anchors).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsFileDatabase.TlsFileDatabaseImpl(References.get(RESULT, true));
    }
    
    class TlsFileDatabaseImpl extends org.gtk.gobject.Object implements TlsFileDatabase {
        public TlsFileDatabaseImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
