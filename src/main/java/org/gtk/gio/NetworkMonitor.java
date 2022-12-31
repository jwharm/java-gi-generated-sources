package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetworkMonitor} provides an easy-to-use cross-platform API
 * for monitoring network connectivity. On Linux, the available
 * implementations are based on the kernel's netlink interface and
 * on NetworkManager.
 * <p>
 * There is also an implementation for use inside Flatpak sandboxes.
 * @version 2.32
 */
public interface NetworkMonitor extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetworkMonitorImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetworkMonitorImpl(input, ownership);
    
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
     * @param connectable a {@link SocketConnectable}
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if {@code connectable} is reachable, {@code false} if not.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean canReach(org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_can_reach.invokeExact(
                    handle(),
                    connectable.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param connectable a {@link SocketConnectable}
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the
     *     request is satisfied
     */
    default void canReachAsync(org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_network_monitor_can_reach_async.invokeExact(
                    handle(),
                    connectable.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async network connectivity test.
     * See g_network_monitor_can_reach_async().
     * @param result a {@link AsyncResult}
     * @return {@code true} if network is reachable, {@code false} if not.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean canReachFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_can_reach_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @return the network connectivity state
     */
    default org.gtk.gio.NetworkConnectivity getConnectivity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_get_connectivity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.NetworkConnectivity.of(RESULT);
    }
    
    /**
     * Checks if the network is available. "Available" here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See {@link NetworkMonitor}:network-available for more details.
     * @return whether the network is available
     */
    default boolean getNetworkAvailable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_get_network_available.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the network is metered.
     * See {@link NetworkMonitor}:network-metered for more details.
     * @return whether the connection is metered
     */
    default boolean getNetworkMetered() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_get_network_metered.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_network_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@link NetworkMonitor} for the system.
     * @return a {@link NetworkMonitor}, which will be
     *     a dummy object if no network monitor is available
     */
    public static org.gtk.gio.NetworkMonitor getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_monitor_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.NetworkMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.NetworkMonitor.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface NetworkChanged {
        void run(boolean networkAvailable);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceNetworkMonitor, int networkAvailable) {
            run(Marshal.integerToBoolean.marshal(networkAvailable, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NetworkChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the network configuration changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<NetworkMonitor.NetworkChanged> onNetworkChanged(NetworkMonitor.NetworkChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("network-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_can_reach = Interop.downcallHandle(
            "g_network_monitor_can_reach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_can_reach_async = Interop.downcallHandle(
            "g_network_monitor_can_reach_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_can_reach_finish = Interop.downcallHandle(
            "g_network_monitor_can_reach_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_get_connectivity = Interop.downcallHandle(
            "g_network_monitor_get_connectivity",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_get_network_available = Interop.downcallHandle(
            "g_network_monitor_get_network_available",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_get_network_metered = Interop.downcallHandle(
            "g_network_monitor_get_network_metered",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_get_type = Interop.downcallHandle(
            "g_network_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_network_monitor_get_default = Interop.downcallHandle(
            "g_network_monitor_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class NetworkMonitorImpl extends org.gtk.gobject.GObject implements NetworkMonitor {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public NetworkMonitorImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
