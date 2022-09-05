package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDtlsServerConnection is the server-side subclass of #GDtlsConnection,
 * representing a server-side DTLS connection.
 */
public interface DtlsServerConnection extends io.github.jwharm.javagi.interop.NativeAddress {

    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        public DtlsServerConnectionImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
