package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of TLS channel binding data to retrieve from {@link TlsConnection}
 * or {@link DtlsConnection}, as documented by RFC 5929 or RFC 9266. The
 * <a href="https://tools.ietf.org/html/rfc5929#section-5">`tls-unique-for-telnet`</a>
 * binding type is not currently implemented.
 * @version 2.66
 */
public class TlsChannelBindingType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsChannelBindingType";
    
    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-3">`tls-unique`</a> binding
     *    type
     */
    public static final TlsChannelBindingType UNIQUE = new TlsChannelBindingType(0);
    
    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-4">`tls-server-end-point`</a>
     *    binding type
     */
    public static final TlsChannelBindingType SERVER_END_POINT = new TlsChannelBindingType(1);
    
    /**
     * <a href="https://www.rfc-editor.org/rfc/rfc9266.html">`tls-exporter`</a> binding
     *    type. Since: 2.74
     */
    public static final TlsChannelBindingType EXPORTER = new TlsChannelBindingType(2);
    
    public TlsChannelBindingType(int value) {
        super(value);
    }
}
