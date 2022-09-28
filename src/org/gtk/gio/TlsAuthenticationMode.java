package org.gtk.gio;

/**
 * The client authentication mode for a {@link TlsServerConnection}.
 */
public class TlsAuthenticationMode {

    /**
     * client authentication not required
     */
    public static final TlsAuthenticationMode NONE = new TlsAuthenticationMode(0);
    
    /**
     * client authentication is requested
     */
    public static final TlsAuthenticationMode REQUESTED = new TlsAuthenticationMode(1);
    
    /**
     * client authentication is required
     */
    public static final TlsAuthenticationMode REQUIRED = new TlsAuthenticationMode(2);
    
    private int value;
    
    public TlsAuthenticationMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsAuthenticationMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
