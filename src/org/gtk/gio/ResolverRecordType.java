package org.gtk.gio;

/**
 * The type of record that g_resolver_lookup_records() or
 * g_resolver_lookup_records_async() should retrieve. The records are returned
 * as lists of #GVariant tuples. Each record type has different values in
 * the variant tuples returned.
 * <p>
 * {@link org.gtk.gio.ResolverRecordType#SRV} records are returned as variants with the signature<code>(qqqs)</code>, containing a <code>guint16</code> with the priority, a <code>guint16</code> with the
 * weight, a <code>guint16</code> with the port, and a string of the hostname.
 * <p>
 * {@link org.gtk.gio.ResolverRecordType#MX} records are returned as variants with the signature<code>(qs)</code>, representing a <code>guint16</code> with the preference, and a string containing
 * the mail exchanger hostname.
 * <p>
 * {@link org.gtk.gio.ResolverRecordType#TXT} records are returned as variants with the signature<code>(as)</code>, representing an array of the strings in the text record. Note: Most TXT
 * records only contain a single string, but
 * {@link [RFC 1035]}(https://tools.ietf.org/html/rfc1035#section-3.3.14) does allow a
 * record to contain multiple strings. The RFC which defines the interpretation
 * of a specific TXT record will likely require concatenation of multiple
 * strings if they are present, as with
 * {@link [RFC 7208]}(https://tools.ietf.org/html/rfc7208#section-3.3).
 * <p>
 * {@link org.gtk.gio.ResolverRecordType#SOA} records are returned as variants with the signature<code>(ssuuuuu)</code>, representing a string containing the primary name server, a
 * string containing the administrator, the serial as a <code>guint32</code>, the refresh
 * interval as a <code>guint32</code>, the retry interval as a <code>guint32</code>, the expire timeout
 * as a <code>guint32</code>, and the TTL as a <code>guint32</code>.
 * <p>
 * {@link org.gtk.gio.ResolverRecordType#NS} records are returned as variants with the signature<code>(s)</code>, representing a string of the hostname of the name server.
 */
public enum ResolverRecordType {

    /**
     * look up DNS SRV records for a domain
     */
    SRV,
    
    /**
     * look up DNS MX records for a domain
     */
    MX,
    
    /**
     * look up DNS TXT records for a name
     */
    TXT,
    
    /**
     * look up DNS SOA records for a zone
     */
    SOA,
    
    /**
     * look up DNS NS records for a domain
     */
    NS;
    
    public static ResolverRecordType fromValue(int value) {
        return switch(value) {
            case 1 -> SRV;
            case 2 -> MX;
            case 3 -> TXT;
            case 4 -> SOA;
            case 5 -> NS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SRV -> 1;
            case MX -> 2;
            case TXT -> 3;
            case SOA -> 4;
            case NS -> 5;
        };
    }

}
