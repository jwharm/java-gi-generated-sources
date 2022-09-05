package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GNetworkMonitor provides an easy-to-use cross-platform API
 * for monitoring network connectivity. On Linux, the available
 * implementations are based on the kernel's netlink interface and
 * on NetworkManager.
 * 
 * There is also an implementation for use inside Flatpak sandboxes.
 */
public interface NetworkMonitor extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Attempts to determine whether or not the host pointed to by
     * @connectable can be reached, without actually trying to connect to
     * it.
     * 
     * This may return %TRUE even when #GNetworkMonitor:network-available
     * is %FALSE, if, for example, @monitor can determine that
     * @connectable refers to a host on a local network.
     * 
     * If @monitor believes that an attempt to connect to @connectable
     * will succeed, it will return %TRUE. Otherwise, it will return
     * %FALSE and set @error to an appropriate error (such as
     * %G_IO_ERROR_HOST_UNREACHABLE).
     * 
     * Note that although this does not attempt to connect to
     * @connectable, it may still block for a brief period of time (eg,
     * trying to do multicast DNS on the local network), so if you do not
     * want to block, you should use g_network_monitor_can_reach_async().
     */
    public default boolean canReach(SocketConnectable connectable, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_monitor_can_reach(HANDLE(), connectable.HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes an async network connectivity test.
     * See g_network_monitor_can_reach_async().
     */
    public default boolean canReachFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_monitor_can_reach_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets a more detailed networking state than
     * g_network_monitor_get_network_available().
     * 
     * If #GNetworkMonitor:network-available is %FALSE, then the
     * connectivity state will be %G_NETWORK_CONNECTIVITY_LOCAL.
     * 
     * If #GNetworkMonitor:network-available is %TRUE, then the
     * connectivity state will be %G_NETWORK_CONNECTIVITY_FULL (if there
     * is full Internet connectivity), %G_NETWORK_CONNECTIVITY_LIMITED (if
     * the host has a default route, but appears to be unable to actually
     * reach the full Internet), or %G_NETWORK_CONNECTIVITY_PORTAL (if the
     * host is trapped behind a "captive portal" that requires some sort
     * of login or acknowledgement before allowing full Internet access).
     * 
     * Note that in the case of %G_NETWORK_CONNECTIVITY_LIMITED and
     * %G_NETWORK_CONNECTIVITY_PORTAL, it is possible that some sites are
     * reachable but others are not. In this case, applications can
     * attempt to connect to remote servers, but should gracefully fall
     * back to their "offline" behavior if the connection attempt fails.
     */
    public default NetworkConnectivity getConnectivity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_monitor_get_connectivity(HANDLE());
        return NetworkConnectivity.fromValue(RESULT);
    }
    
    /**
     * Checks if the network is available. "Available" here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See #GNetworkMonitor:network-available for more details.
     */
    public default boolean getNetworkAvailable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_monitor_get_network_available(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the network is metered.
     * See #GNetworkMonitor:network-metered for more details.
     */
    public default boolean getNetworkMetered() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_monitor_get_network_metered(HANDLE());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface NetworkChangedHandler {
        void signalReceived(NetworkMonitor source, boolean networkAvailable);
    }
    
    /**
     * Emitted when the network configuration changes.
     */
    public default void onNetworkChanged(NetworkChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNetworkMonitorNetworkChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("network-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class NetworkMonitorImpl extends org.gtk.gobject.Object implements NetworkMonitor {
        public NetworkMonitorImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
