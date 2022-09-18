package org.gtk.gio;

/**
 * The host&<code>#39</code> s network connectivity state, as reported by {@link org.gtk.gio.NetworkMonitor}
 */
public enum NetworkConnectivity {

    /**
     * The host is not configured with a
     *   route to the Internet; it may or may not be connected to a local
     *   network.
     */
    LOCAL,
    
    /**
     * The host is connected to a network, but
     *   does not appear to be able to reach the full Internet, perhaps
     *   due to upstream network problems.
     */
    LIMITED,
    
    /**
     * The host is behind a captive portal and
     *   cannot reach the full Internet.
     */
    PORTAL,
    
    /**
     * The host is connected to a network, and
     *   appears to be able to reach the full Internet.
     */
    FULL;
    
    public static NetworkConnectivity fromValue(int value) {
        return switch(value) {
            case 1 -> LOCAL;
            case 2 -> LIMITED;
            case 3 -> PORTAL;
            case 4 -> FULL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOCAL -> 1;
            case LIMITED -> 2;
            case PORTAL -> 3;
            case FULL -> 4;
        };
    }

}
