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
 * 
 * <h2>Controlling Authentication Mechanisms</h2>
 * By default, a {@link DBusServer} or server-side {@link DBusConnection} will allow
 * any authentication mechanism to be used. If you only
 * want to allow D-Bus connections with the {@code EXTERNAL} mechanism,
 * which makes use of credentials passing and is the recommended
 * mechanism for modern Unix platforms such as Linux and the BSD family,
 * you would use a signal handler like this:
 * <p>
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
 * 
 * <h2>Controlling Authorization # {#auth-observer}</h2>
 * By default, a {@link DBusServer} or server-side {@link DBusConnection} will accept
 * connections from any successfully authenticated user (but not from
 * anonymous connections using the {@code ANONYMOUS} mechanism). If you only
 * want to allow D-Bus connections from processes owned by the same uid
 * as the server, since GLib 2.68, you should use the
 * {@link DBusServerFlags#AUTHENTICATION_REQUIRE_SAME_USER} flag. It’s equivalent
 * to the following signal handler:
 * <p>
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
 */
public class DBusAuthObserver extends org.gtk.gobject.Object {

    public DBusAuthObserver(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusAuthObserver */
    public static DBusAuthObserver castFrom(org.gtk.gobject.Object gobject) {
        return new DBusAuthObserver(gobject.refcounted());
    }
    
    private static final MethodHandle g_dbus_auth_observer_new = Interop.downcallHandle(
        "g_dbus_auth_observer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_auth_observer_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusAuthObserver} object.
     */
    public DBusAuthObserver() {
        super(constructNew());
    }
    
    private static final MethodHandle g_dbus_auth_observer_allow_mechanism = Interop.downcallHandle(
        "g_dbus_auth_observer_allow_mechanism",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@link DBusAuthObserver}::allow-mechanism signal on {@code observer}.
     */
    public boolean allowMechanism(@NotNull java.lang.String mechanism) {
        int RESULT;
        try {
            RESULT = (int) g_dbus_auth_observer_allow_mechanism.invokeExact(handle(), Interop.allocateNativeString(mechanism));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_dbus_auth_observer_authorize_authenticated_peer = Interop.downcallHandle(
        "g_dbus_auth_observer_authorize_authenticated_peer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@link DBusAuthObserver}::authorize-authenticated-peer signal on {@code observer}.
     */
    public boolean authorizeAuthenticatedPeer(@NotNull IOStream stream, @Nullable Credentials credentials) {
        int RESULT;
        try {
            RESULT = (int) g_dbus_auth_observer_authorize_authenticated_peer.invokeExact(handle(), stream.handle(), credentials.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface AllowMechanismHandler {
        boolean signalReceived(DBusAuthObserver source, @NotNull java.lang.String mechanism);
    }
    
    /**
     * Emitted to check if {@code mechanism} is allowed to be used.
     */
    public SignalHandle onAllowMechanism(AllowMechanismHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("allow-mechanism"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusAuthObserver.Callbacks.class, "signalDBusAuthObserverAllowMechanism",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AuthorizeAuthenticatedPeerHandler {
        boolean signalReceived(DBusAuthObserver source, @NotNull IOStream stream, @Nullable Credentials credentials);
    }
    
    /**
     * Emitted to check if a peer that is successfully authenticated
     * is authorized.
     */
    public SignalHandle onAuthorizeAuthenticatedPeer(AuthorizeAuthenticatedPeerHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("authorize-authenticated-peer"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusAuthObserver.Callbacks.class, "signalDBusAuthObserverAuthorizeAuthenticatedPeer",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalDBusAuthObserverAllowMechanism(MemoryAddress source, MemoryAddress mechanism, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusAuthObserver.AllowMechanismHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DBusAuthObserver(Refcounted.get(source)), mechanism.getUtf8String(0));
        }
        
        public static boolean signalDBusAuthObserverAuthorizeAuthenticatedPeer(MemoryAddress source, MemoryAddress stream, MemoryAddress credentials, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusAuthObserver.AuthorizeAuthenticatedPeerHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DBusAuthObserver(Refcounted.get(source)), new IOStream(Refcounted.get(stream, false)), new Credentials(Refcounted.get(credentials, false)));
        }
        
    }
}
