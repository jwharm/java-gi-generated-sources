package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The host's network connectivity state, as reported by {@link NetworkMonitor}.
 * @version 2.44
 */
public enum NetworkConnectivity implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The host is not configured with a
     *   route to the Internet; it may or may not be connected to a local
     *   network.
     */
    LOCAL(1),
    
    /**
     * The host is connected to a network, but
     *   does not appear to be able to reach the full Internet, perhaps
     *   due to upstream network problems.
     */
    LIMITED(2),
    
    /**
     * The host is behind a captive portal and
     *   cannot reach the full Internet.
     */
    PORTAL(3),
    
    /**
     * The host is connected to a network, and
     *   appears to be able to reach the full Internet.
     */
    FULL(4);
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkConnectivity";
    
    private final int value;
    
    /**
     * Create a new NetworkConnectivity for the provided value
     * @param numeric value the enum value
     */
    NetworkConnectivity(int value) {
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
     * Create a new NetworkConnectivity for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NetworkConnectivity of(int value) {
        return switch (value) {
            case 1 -> LOCAL;
            case 2 -> LIMITED;
            case 3 -> PORTAL;
            case 4 -> FULL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
