package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link NetworkMonitor} provides an easy-to-use cross-platform API
 * for monitoring network connectivity. On Linux, the available
 * implementations are based on the kernel's netlink interface and
 * on NetworkManager.
 * <p>
 * There is also an implementation for use inside Flatpak sandboxes.
 */
public interface NetworkMonitor extends io.github.jwharm.javagi.Proxy {

    /**
     * Attempts to determine whether or not the host pointed to by
     * {@code connectable} can be reached, without actually trying to connect to
     * it.
     * <p>
     * This may return {@code true} even when {@link NetworkMonitor}:network-available
     * is {@code false}, if, for example, {@code monitor} can determine that
     * {@code connectable} refers to a host on a local network.
     * <p>
     * If {@code monitor} believes that an attempt to connect to {@code connectable}
     * will succeed, it will return {@code true}. Otherwise, it will return
     * {@code false} and set {@code error} to an appropriate error (such as
     * {@link IOErrorEnum#HOST_UNREACHABLE}).
     * <p>
     * Note that although this does not attempt to connect to
     * {@code connectable}, it may still block for a brief period of time (eg,
     * trying to do multicast DNS on the local network), so if you do not
     * want to block, you should use g_network_monitor_can_reach_async().
     */
    public default boolean canReach(SocketConnectable connectable, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_network_monitor_can_reach(handle(), connectable.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously attempts to determine whether or not the host
     * pointed to by {@code connectable} can be reached, without actually
     * trying to connect to it.
     * <p>
     * For more details, see g_network_monitor_can_reach().
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_network_monitor_can_reach_finish()
     * to get the result of the operation.
     */
    public default void canReachAsync(SocketConnectable connectable, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_network_monitor_can_reach_async(handle(), connectable.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async network connectivity test.
     * See g_network_monitor_can_reach_async().
     */
    public default boolean canReachFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_network_monitor_can_reach_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a more detailed networking state than
     * g_network_monitor_get_network_available().
     * <p>
     * If {@link NetworkMonitor}:network-available is {@code false}, then the
     * connectivity state will be {@link NetworkConnectivity#LOCAL}.
     * <p>
     * If {@link NetworkMonitor}:network-available is {@code true}, then the
     * connectivity state will be {@link NetworkConnectivity#FULL} (if there
     * is full Internet connectivity), {@link NetworkConnectivity#LIMITED} (if
     * the host has a default route, but appears to be unable to actually
     * reach the full Internet), or {@link NetworkConnectivity#PORTAL} (if the
     * host is trapped behind a "captive portal" that requires some sort
     * of login or acknowledgement before allowing full Internet access).
     * <p>
     * Note that in the case of {@link NetworkConnectivity#LIMITED} and
     * {@link NetworkConnectivity#PORTAL}, it is possible that some sites are
     * reachable but others are not. In this case, applications can
     * attempt to connect to remote servers, but should gracefully fall
     * back to their "offline" behavior if the connection attempt fails.
     */
    public default NetworkConnectivity getConnectivity() {
        var RESULT = gtk_h.g_network_monitor_get_connectivity(handle());
        return new NetworkConnectivity(RESULT);
    }
    
    /**
     * Checks if the network is available. "Available" here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See {@link NetworkMonitor}:network-available for more details.
     */
    public default boolean getNetworkAvailable() {
        var RESULT = gtk_h.g_network_monitor_get_network_available(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if the network is metered.
     * See {@link NetworkMonitor}:network-metered for more details.
     */
    public default boolean getNetworkMetered() {
        var RESULT = gtk_h.g_network_monitor_get_network_metered(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the default {@link NetworkMonitor} for the system.
     */
    public static NetworkMonitor getDefault() {
        var RESULT = gtk_h.g_network_monitor_get_default();
        return new NetworkMonitor.NetworkMonitorImpl(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface NetworkChangedHandler {
        void signalReceived(NetworkMonitor source, boolean networkAvailable);
    }
    
    /**
     * Emitted when the network configuration changes.
     */
    public default SignalHandle onNetworkChanged(NetworkChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("network-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(NetworkMonitor.Callbacks.class, "signalNetworkMonitorNetworkChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalNetworkMonitorNetworkChanged(MemoryAddress source, int networkAvailable, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (NetworkMonitor.NetworkChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new NetworkMonitor.NetworkMonitorImpl(Refcounted.get(source)), networkAvailable != 0);
        }
        
    }
    
    class NetworkMonitorImpl extends org.gtk.gobject.Object implements NetworkMonitor {
        public NetworkMonitorImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
