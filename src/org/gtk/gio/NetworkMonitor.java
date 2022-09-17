package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GNetworkMonitor provides an easy-to-use cross-platform API
 * for monitoring network connectivity. On Linux, the available
 * implementations are based on the kernel&#39;s netlink interface and
 * on NetworkManager.
 * 
 * There is also an implementation for use inside Flatpak sandboxes.
 */
public interface NetworkMonitor extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Attempts to determine whether or not the host pointed to by
     * @connectable can be reached, without actually trying to connect to
     * it.
     * 
     * This may return <code>true</code> even when #GNetworkMonitor:network-available
     * is <code>FALSE,</code> if, for example, @monitor can determine that
     * @connectable refers to a host on a local network.
     * 
     * If @monitor believes that an attempt to connect to @connectable
     * will succeed, it will return <code>TRUE.</code> Otherwise, it will return
     * <code>false</code> and set @error to an appropriate error (such as
     * <code>G_IO_ERROR_HOST_UNREACHABLE).
     * 
     * Note</code> that although this does not attempt to connect to
     * @connectable, it may still block for a brief period of time (eg,
     * trying to do multicast DNS on the local network), so if you do not
     * want to block, you should use g_network_monitor_can_reach_async().
     */
    public default boolean canReach(SocketConnectable connectable, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_network_monitor_can_reach(handle(), connectable.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously attempts to determine whether or not the host
     * pointed to by @connectable can be reached, without actually
     * trying to connect to it.
     * 
     * For more details, see g_network_monitor_can_reach().
     * 
     * When the operation is finished, @callback will be called.
     * You can then call g_network_monitor_can_reach_finish()
     * to get the result of the operation.
     */
    public default void canReachAsync(SocketConnectable connectable, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_network_monitor_can_reach_async(handle(), connectable.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
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
        return (RESULT != 0);
    }
    
    /**
     * Gets a more detailed networking state than
     * g_network_monitor_get_network_available().
     * 
     * If #GNetworkMonitor:network-available is <code>FALSE,</code> then the
     * connectivity state will be <code>G_NETWORK_CONNECTIVITY_LOCAL.
     * 
     * If</code> #GNetworkMonitor:network-available is <code>TRUE,</code> then the
     * connectivity state will be {@link org.gtk.gio.NetworkConnectivity#FULL} (if there
     * is full Internet connectivity), {@link org.gtk.gio.NetworkConnectivity#LIMITED} (if
     * the host has a default route, but appears to be unable to actually
     * reach the full Internet), or {@link org.gtk.gio.NetworkConnectivity#PORTAL} (if the
     * host is trapped behind a &#34;captive portal&#34; that requires some sort
     * of login or acknowledgement before allowing full Internet access).
     * 
     * Note that in the case of {@link org.gtk.gio.NetworkConnectivity#LIMITED} and
     * <code>G_NETWORK_CONNECTIVITY_PORTAL,</code> it is possible that some sites are
     * reachable but others are not. In this case, applications can
     * attempt to connect to remote servers, but should gracefully fall
     * back to their &#34;offline&#34; behavior if the connection attempt fails.
     */
    public default NetworkConnectivity getConnectivity() {
        var RESULT = gtk_h.g_network_monitor_get_connectivity(handle());
        return NetworkConnectivity.fromValue(RESULT);
    }
    
    /**
     * Checks if the network is available. &#34;Available&#34; here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See #GNetworkMonitor:network-available for more details.
     */
    public default boolean getNetworkAvailable() {
        var RESULT = gtk_h.g_network_monitor_get_network_available(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the network is metered.
     * See #GNetworkMonitor:network-metered for more details.
     */
    public default boolean getNetworkMetered() {
        var RESULT = gtk_h.g_network_monitor_get_network_metered(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the default #GNetworkMonitor for the system.
     */
    public static NetworkMonitor getDefault() {
        var RESULT = gtk_h.g_network_monitor_get_default();
        return new NetworkMonitor.NetworkMonitorImpl(References.get(RESULT, false));
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNetworkMonitorNetworkChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("network-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class NetworkMonitorImpl extends org.gtk.gobject.Object implements NetworkMonitor {
        public NetworkMonitorImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
