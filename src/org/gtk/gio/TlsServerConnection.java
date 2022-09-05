package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GTlsServerConnection is the server-side subclass of #GTlsConnection,
 * representing a server-side TLS connection.
 */
public interface TlsServerConnection extends io.github.jwharm.javagi.interop.NativeAddress {

    class TlsServerConnectionImpl extends org.gtk.gobject.Object implements TlsServerConnection {
        public TlsServerConnectionImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
