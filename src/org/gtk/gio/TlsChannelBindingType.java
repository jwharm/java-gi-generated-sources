package org.gtk.gio;

/**
 * The type of TLS channel binding data to retrieve from {@link TlsConnection}
 * or {@link DtlsConnection}, as documented by RFC 5929. The
 * <a href="https://tools.ietf.org/html/rfc5929#section-5">`tls-unique-for-telnet`</a>
 * binding type is not currently implemented.
 */
public enum TlsChannelBindingType {

    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-3">`tls-unique`</a> binding
     *    type
     */
    UNIQUE,
    
    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-4">`tls-server-end-point`</a>
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
