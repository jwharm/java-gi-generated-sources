package org.gtk.gio;

/**
 * The type of TLS channel binding data to retrieve from {@link TlsConnection}
 * or {@link DtlsConnection}, as documented by RFC 5929. The
 * <a href="https://tools.ietf.org/html/rfc5929#section-5">`tls-unique-for-telnet`</a>
 * binding type is not currently implemented.
 */
public class TlsChannelBindingType extends io.github.jwharm.javagi.Enumeration {

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
    
    public TlsChannelBindingType(int value) {
        super(value);
    }
    
}