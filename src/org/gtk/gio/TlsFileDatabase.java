package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GTlsFileDatabase is implemented by #GTlsDatabase objects which load
 * their certificate information from a file. It is an interface which
 * TLS library specific subtypes implement.
 */
public interface TlsFileDatabase extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Creates a new #GTlsFileDatabase which uses anchor certificate authorities
     * in @anchors to verify certificate chains.
     * 
     * The certificates in @anchors must be PEM encoded.
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
