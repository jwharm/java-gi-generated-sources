package org.gtk.gio;

/**
 * The host's network connectivity state, as reported by {@link NetworkMonitor}.
 */
public class NetworkConnectivity {

    /**
     * The host is not configured with a
     *   route to the Internet; it may or may not be connected to a local
     *   network.
     */
    public static final NetworkConnectivity LOCAL = new NetworkConnectivity(1);
    
    /**
     * The host is connected to a network, but
     *   does not appear to be able to reach the full Internet, perhaps
     *   due to upstream network problems.
     */
    public static final NetworkConnectivity LIMITED = new NetworkConnectivity(2);
    
    /**
     * The host is behind a captive portal and
     *   cannot reach the full Internet.
     */
    public static final NetworkConnectivity PORTAL = new NetworkConnectivity(3);
    
    /**
     * The host is connected to a network, and
     *   appears to be able to reach the full Internet.
     */
    public static final NetworkConnectivity FULL = new NetworkConnectivity(4);
    
    private int value;
    
    public NetworkConnectivity(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NetworkConnectivity[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
