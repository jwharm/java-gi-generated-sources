package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The host's network connectivity state, as reported by {@link NetworkMonitor}.
 * @version 2.44
 */
public class NetworkConnectivity extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public NetworkConnectivity(int value) {
        super(value);
    }
}
