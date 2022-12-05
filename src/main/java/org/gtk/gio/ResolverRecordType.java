package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of record that g_resolver_lookup_records() or
 * g_resolver_lookup_records_async() should retrieve. The records are returned
 * as lists of {@link org.gtk.glib.Variant} tuples. Each record type has different values in
 * the variant tuples returned.
 * <p>
 * {@link ResolverRecordType#SRV} records are returned as variants with the signature
 * {@code (qqqs)}, containing a {@code guint16} with the priority, a {@code guint16} with the
 * weight, a {@code guint16} with the port, and a string of the hostname.
 * <p>
 * {@link ResolverRecordType#MX} records are returned as variants with the signature
 * {@code (qs)}, representing a {@code guint16} with the preference, and a string containing
 * the mail exchanger hostname.
 * <p>
 * {@link ResolverRecordType#TXT} records are returned as variants with the signature
 * {@code (as)}, representing an array of the strings in the text record. Note: Most TXT
 * records only contain a single string, but
 * <a href="https://tools.ietf.org/html/rfc1035#section-3.3.14">RFC 1035</a> does allow a
 * record to contain multiple strings. The RFC which defines the interpretation
 * of a specific TXT record will likely require concatenation of multiple
 * strings if they are present, as with
 * <a href="https://tools.ietf.org/html/rfc7208#section-3.3">RFC 7208</a>.
 * <p>
 * {@link ResolverRecordType#SOA} records are returned as variants with the signature
 * {@code (ssuuuuu)}, representing a string containing the primary name server, a
 * string containing the administrator, the serial as a {@code guint32}, the refresh
 * interval as a {@code guint32}, the retry interval as a {@code guint32}, the expire timeout
 * as a {@code guint32}, and the TTL as a {@code guint32}.
 * <p>
 * {@link ResolverRecordType#NS} records are returned as variants with the signature
 * {@code (s)}, representing a string of the hostname of the name server.
 * @version 2.34
 */
public enum ResolverRecordType implements io.github.jwharm.javagi.Enumeration {
    /**
     * look up DNS SRV records for a domain
     */
    SRV(1),
    /**
     * look up DNS MX records for a domain
     */
    MX(2),
    /**
     * look up DNS TXT records for a name
     */
    TXT(3),
    /**
     * look up DNS SOA records for a zone
     */
    SOA(4),
    /**
     * look up DNS NS records for a domain
     */
    NS(5);
    
    private static final java.lang.String C_TYPE_NAME = "GResolverRecordType";
    
    private final int value;
    ResolverRecordType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ResolverRecordType of(int value) {
        return switch (value) {
            case 1 -> SRV;
            case 2 -> MX;
            case 3 -> TXT;
            case 4 -> SOA;
            case 5 -> NS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
