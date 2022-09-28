package org.gtk.gio;

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 */
public class TlsRehandshakeMode {

    /**
     * Never allow rehandshaking
     */
    public static final TlsRehandshakeMode NEVER = new TlsRehandshakeMode(0);
    
    /**
     * Allow safe rehandshaking only
     */
    public static final TlsRehandshakeMode SAFELY = new TlsRehandshakeMode(1);
    
    /**
     * Allow unsafe rehandshaking
     */
    public static final TlsRehandshakeMode UNSAFELY = new TlsRehandshakeMode(2);
    
    private int value;
    
    public TlsRehandshakeMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsRehandshakeMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
