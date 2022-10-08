package org.gtk.gio;

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

    static final MethodHandle g_network_monitor_can_reach = Interop.downcallHandle(
        "g_network_monitor_can_reach",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) g_network_monitor_can_reach.invokeExact(handle(), connectable.handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_can_reach_async = Interop.downcallHandle(
        "g_network_monitor_can_reach_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_network_monitor_can_reach_async.invokeExact(handle(), connectable.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_can_reach_finish = Interop.downcallHandle(
        "g_network_monitor_can_reach_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async network connectivity test.
     * See g_network_monitor_can_reach_async().
     */
    public default boolean canReachFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_network_monitor_can_reach_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_get_connectivity = Interop.downcallHandle(
        "g_network_monitor_get_connectivity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) g_network_monitor_get_connectivity.invokeExact(handle());
            return new NetworkConnectivity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_get_network_available = Interop.downcallHandle(
        "g_network_monitor_get_network_available",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the network is available. "Available" here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See {@link NetworkMonitor}:network-available for more details.
     */
    public default boolean getNetworkAvailable() {
        try {
            var RESULT = (int) g_network_monitor_get_network_available.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_get_network_metered = Interop.downcallHandle(
        "g_network_monitor_get_network_metered",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the network is metered.
     * See {@link NetworkMonitor}:network-metered for more details.
     */
    public default boolean getNetworkMetered() {
        try {
            var RESULT = (int) g_network_monitor_get_network_metered.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_network_monitor_get_default = Interop.downcallHandle(
        "g_network_monitor_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link NetworkMonitor} for the system.
     */
    public static NetworkMonitor getDefault() {
        try {
            var RESULT = (MemoryAddress) g_network_monitor_get_default.invokeExact();
            return new NetworkMonitor.NetworkMonitorImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("network-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(NetworkMonitor.Callbacks.class, "signalNetworkMonitorNetworkChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
