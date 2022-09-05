package org.gtk.gio;

/**
 * The type of TLS channel binding data to retrieve from #GTlsConnection
 * or #GDtlsConnection, as documented by RFC 5929. The
 * [`tls-unique-for-telnet`](https://tools.ietf.org/html/rfc5929#section-5)
 * binding type is not currently implemented.
 */
public enum TlsChannelBindingType {

    /**
     * [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding
     *    type
     */
    UNIQUE,
    
    /**
     * [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4)
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
