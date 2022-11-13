package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link DBusAuthObserver} type provides a mechanism for participating
 * in how a {@link DBusServer} (or a {@link DBusConnection}) authenticates remote
 * peers. Simply instantiate a {@link DBusAuthObserver} and connect to the
 * signals you are interested in. Note that new signals may be added
 * in the future
 * <p>
 * <strong>Controlling Authentication Mechanisms</strong><br/>
 * By default, a {@link DBusServer} or server-side {@link DBusConnection} will allow
 * any authentication mechanism to be used. If you only
 * want to allow D-Bus connections with the {@code EXTERNAL} mechanism,
 * which makes use of credentials passing and is the recommended
 * mechanism for modern Unix platforms such as Linux and the BSD family,
 * you would use a signal handler like this:
 * <pre>{@code <!-- language="C" -->
 * static gboolean
 * on_allow_mechanism (GDBusAuthObserver *observer,
 *                     const gchar       *mechanism,
 *                     gpointer           user_data)
 * {
 *   if (g_strcmp0 (mechanism, "EXTERNAL") == 0)
 *     {
 *       return TRUE;
 *     }
 * 
 *   return FALSE;
 * }
 * }</pre>
 * <p>
 * <strong>Controlling Authorization # {#auth-observer}</strong><br/>
 * By default, a {@link DBusServer} or server-side {@link DBusConnection} will accept
 * connections from any successfully authenticated user (but not from
 * anonymous connections using the {@code ANONYMOUS} mechanism). If you only
 * want to allow D-Bus connections from processes owned by the same uid
 * as the server, since GLib 2.68, you should use the
 * {@link DBusServerFlags#AUTHENTICATION_REQUIRE_SAME_USER} flag. It’s equivalent
 * to the following signal handler:
 * <pre>{@code <!-- language="C" -->
 * static gboolean
 * on_authorize_authenticated_peer (GDBusAuthObserver *observer,
 *                                  GIOStream         *stream,
 *                                  GCredentials      *credentials,
 *                                  gpointer           user_data)
 * {
 *   gboolean authorized;
 * 
 *   authorized = FALSE;
 *   if (credentials != NULL)
 *     {
 *       GCredentials *own_credentials;
 *       own_credentials = g_credentials_new ();
 *       if (g_credentials_is_same_user (credentials, own_credentials, NULL))
 *         authorized = TRUE;
 *       g_object_unref (own_credentials);
 *     }
 * 
 *   return authorized;
 * }
 * }</pre>
 * @version 2.26
 */
public class DBusAuthObserver extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusAuthObserver";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusAuthObserver proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusAuthObserver(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusAuthObserver if its GType is a (or inherits from) "GDBusAuthObserver".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusAuthObserver} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusAuthObserver", a ClassCastException will be thrown.
     */
    public static DBusAuthObserver castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusAuthObserver"))) {
            return new DBusAuthObserver(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusAuthObserver");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_auth_observer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusAuthObserver} object.
     */
    public DBusAuthObserver() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Emits the {@link DBusAuthObserver}::allow-mechanism signal on {@code observer}.
     * @param mechanism The name of the mechanism, e.g. {@code DBUS_COOKIE_SHA1}.
     * @return {@code true} if {@code mechanism} can be used to authenticate the other peer, {@code false} if not.
     */
    public boolean allowMechanism(@NotNull java.lang.String mechanism) {
        java.util.Objects.requireNonNull(mechanism, "Parameter 'mechanism' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_auth_observer_allow_mechanism.invokeExact(
                    handle(),
                    Interop.allocateNativeString(mechanism));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Emits the {@link DBusAuthObserver}::authorize-authenticated-peer signal on {@code observer}.
     * @param stream A {@link IOStream} for the {@link DBusConnection}.
     * @param credentials Credentials received from the peer or {@code null}.
     * @return {@code true} if the peer is authorized, {@code false} if not.
     */
    public boolean authorizeAuthenticatedPeer(@NotNull org.gtk.gio.IOStream stream, @Nullable org.gtk.gio.Credentials credentials) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_auth_observer_authorize_authenticated_peer.invokeExact(
                    handle(),
                    stream.handle(),
                    (Addressable) (credentials == null ? MemoryAddress.NULL : credentials.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface AllowMechanism {
        boolean signalReceived(DBusAuthObserver source, @NotNull java.lang.String mechanism);
    }
    
    /**
     * Emitted to check if {@code mechanism} is allowed to be used.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusAuthObserver.AllowMechanism> onAllowMechanism(DBusAuthObserver.AllowMechanism handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("allow-mechanism"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusAuthObserver.Callbacks.class, "signalDBusAuthObserverAllowMechanism",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusAuthObserver.AllowMechanism>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AuthorizeAuthenticatedPeer {
        boolean signalReceived(DBusAuthObserver source, @NotNull org.gtk.gio.IOStream stream, @Nullable org.gtk.gio.Credentials credentials);
    }
    
    /**
     * Emitted to check if a peer that is successfully authenticated
     * is authorized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusAuthObserver.AuthorizeAuthenticatedPeer> onAuthorizeAuthenticatedPeer(DBusAuthObserver.AuthorizeAuthenticatedPeer handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("authorize-authenticated-peer"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusAuthObserver.Callbacks.class, "signalDBusAuthObserverAuthorizeAuthenticatedPeer",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusAuthObserver.AuthorizeAuthenticatedPeer>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_auth_observer_new = Interop.downcallHandle(
            "g_dbus_auth_observer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_auth_observer_allow_mechanism = Interop.downcallHandle(
            "g_dbus_auth_observer_allow_mechanism",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_auth_observer_authorize_authenticated_peer = Interop.downcallHandle(
            "g_dbus_auth_observer_authorize_authenticated_peer",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusAuthObserverAllowMechanism(MemoryAddress source, MemoryAddress mechanism, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusAuthObserver.AllowMechanism) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusAuthObserver(source, Ownership.UNKNOWN), Interop.getStringFrom(mechanism));
        }
        
        public static boolean signalDBusAuthObserverAuthorizeAuthenticatedPeer(MemoryAddress source, MemoryAddress stream, MemoryAddress credentials, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusAuthObserver.AuthorizeAuthenticatedPeer) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusAuthObserver(source, Ownership.UNKNOWN), new org.gtk.gio.IOStream(stream, Ownership.NONE), new org.gtk.gio.Credentials(credentials, Ownership.NONE));
        }
    }
}
