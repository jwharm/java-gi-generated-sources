package org.gtk.gio;

/**
 * The type of TLS channel binding data to retrieve from {@link TlsConnection}
 * or {@link DtlsConnection}, as documented by RFC 5929. The
 * <a href="https://tools.ietf.org/html/rfc5929#section-5">`tls-unique-for-telnet`</a>
 * binding type is not currently implemented.
 */
public class TlsChannelBindingType {

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
    
    private int value;
    
    public TlsChannelBindingType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsChannelBindingType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
