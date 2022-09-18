package org.gtk.gio;

/**
 * The type of TLS channel binding data to retrieve from {@link org.gtk.gio.TlsConnection} or {@link org.gtk.gio.DtlsConnection}  as documented by RFC 5929. The
 * {@link [<code>tls-unique-for-telnet</code>]}(https://tools.ietf.org/html/rfc5929<code>#section</code> 5)
 * binding type is not currently implemented.
 */
public enum TlsChannelBindingType {

    /**
     * {@link [<code>tls-unique</code>]}(https://tools.ietf.org/html/rfc5929<code>#section</code> 3) binding
     *    type
     */
    UNIQUE,
    
    /**
     * {@link [<code>tls-server-end-point</code>]}(https://tools.ietf.org/html/rfc5929<code>#section</code> 4)
     *    binding type
     */
    SERVER_END_POINT;
    
    public static TlsChannelBindingType fromValue(int value) {
        return switch(value) {
            case 0 -> UNIQUE;
            case 1 -> SERVER_END_POINT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNIQUE -> 0;
            case SERVER_END_POINT -> 1;
        };
    }

}
