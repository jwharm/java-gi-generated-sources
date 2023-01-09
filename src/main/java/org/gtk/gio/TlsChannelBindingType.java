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
public enum TlsChannelBindingType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-3">`tls-unique`</a> binding
     *    type
     */
    UNIQUE(0),
    
    /**
     * <a href="https://tools.ietf.org/html/rfc5929#section-4">`tls-server-end-point`</a>
     *    binding type
     */
    SERVER_END_POINT(1),
    
    /**
     * <a href="https://www.rfc-editor.org/rfc/rfc9266.html">`tls-exporter`</a> binding
     *    type. Since: 2.74
     */
    EXPORTER(2);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsChannelBindingType";
    
    private final int value;
    
    /**
     * Create a new TlsChannelBindingType for the provided value
     * @param numeric value the enum value
     */
    TlsChannelBindingType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TlsChannelBindingType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TlsChannelBindingType of(int value) {
        return switch (value) {
            case 0 -> UNIQUE;
            case 1 -> SERVER_END_POINT;
            case 2 -> EXPORTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
