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
    
    /**
     * Cast object to NetworkMonitor if its GType is a (or inherits from) "GNetworkMonitor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NetworkMonitor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNetworkMonitor", a ClassCastException will be thrown.
     */
    public static NetworkMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), NetworkMonitor.getType())) {
            return new NetworkMonitorImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GNetworkMonitor");
        }
    }
    
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
    default boolean canReach(@NotNull org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(connectable, "Parameter 'connectable' must not be null");
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
     * @param connectable a {@link SocketConnectable}
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the
     *     request is satisfied
     */
    default void canReachAsync(@NotNull org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(connectable, "Parameter 'connectable' must not be null");
        try {
            DowncallHandles.g_network_monitor_can_reach_async.invokeExact(
                    handle(),
                    connectable.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
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
    default boolean canReachFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
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
     * @return the network connectivity state
     */
    default @NotNull org.gtk.gio.NetworkConnectivity getConnectivity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_network_monitor_get_connectivity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.NetworkConnectivity(RESULT);
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.NetworkMonitor getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_monitor_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.NetworkMonitor.NetworkMonitorImpl(RESULT, Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface NetworkChanged {
        void signalReceived(NetworkMonitor source, boolean networkAvailable);
    }
    
    /**
     * Emitted when the network configuration changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<NetworkMonitor.NetworkChanged> onNetworkChanged(NetworkMonitor.NetworkChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("network-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(NetworkMonitor.Callbacks.class, "signalNetworkMonitorNetworkChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<NetworkMonitor.NetworkChanged>(handle(), RESULT);
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
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalNetworkMonitorNetworkChanged(MemoryAddress source, int networkAvailable, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (NetworkMonitor.NetworkChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new NetworkMonitor.NetworkMonitorImpl(source, Ownership.NONE), networkAvailable != 0);
        }
    }
    
    class NetworkMonitorImpl extends org.gtk.gobject.Object implements NetworkMonitor {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public NetworkMonitorImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
