package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusAuthObserver type provides a mechanism for participating
 * in how a #GDBusServer (or a #GDBusConnection) authenticates remote
 * peers. Simply instantiate a #GDBusAuthObserver and connect to the
 * signals you are interested in. Note that new signals may be added
 * in the future
 * 
 * ## Controlling Authentication Mechanisms
 * 
 * By default, a #GDBusServer or server-side #GDBusConnection will allow
 * any authentication mechanism to be used. If you only
 * want to allow D-Bus connections with the `EXTERNAL` mechanism,
 * which makes use of credentials passing and is the recommended
 * mechanism for modern Unix platforms such as Linux and the BSD family,
 * you would use a signal handler like this:
 * 
 * |[<!-- language="C" -->
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
 * ]|
 * 
 * ## Controlling Authorization # {#auth-observer}
 * 
 * By default, a #GDBusServer or server-side #GDBusConnection will accept
 * connections from any successfully authenticated user (but not from
 * anonymous connections using the `ANONYMOUS` mechanism). If you only
 * want to allow D-Bus connections from processes owned by the same uid
 * as the server, since GLib 2.68, you should use the
 * %G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flag. It’s equivalent
 * to the following signal handler:
 * 
 * |[<!-- language="C" -->
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
 * ]|
 */
public class DBusAuthObserver extends org.gtk.gobject.Object {

    public DBusAuthObserver(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusAuthObserver */
    public static DBusAuthObserver castFrom(org.gtk.gobject.Object gobject) {
        return new DBusAuthObserver(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_dbus_auth_observer_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GDBusAuthObserver object.
     */
    public DBusAuthObserver() {
        super(constructNew());
    }
    
    /**
     * Emits the #GDBusAuthObserver::allow-mechanism signal on @observer.
     */
    public boolean allowMechanism(java.lang.String mechanism) {
        var RESULT = gtk_h.g_dbus_auth_observer_allow_mechanism(handle(), Interop.allocateNativeString(mechanism).handle());
        return (RESULT != 0);
    }
    
    /**
     * Emits the #GDBusAuthObserver::authorize-authenticated-peer signal on @observer.
     */
    public boolean authorizeAuthenticatedPeer(IOStream stream, Credentials credentials) {
        var RESULT = gtk_h.g_dbus_auth_observer_authorize_authenticated_peer(handle(), stream.handle(), credentials.handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface AllowMechanismHandler {
        boolean signalReceived(DBusAuthObserver source, java.lang.String mechanism);
    }
    
    /**
     * Emitted to check if @mechanism is allowed to be used.
     */
    public SignalHandle onAllowMechanism(AllowMechanismHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusAuthObserverAllowMechanism", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("allow-mechanism").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface AuthorizeAuthenticatedPeerHandler {
        boolean signalReceived(DBusAuthObserver source, IOStream stream, Credentials credentials);
    }
    
    /**
     * Emitted to check if a peer that is successfully authenticated
     * is authorized.
     */
    public SignalHandle onAuthorizeAuthenticatedPeer(AuthorizeAuthenticatedPeerHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusAuthObserverAuthorizeAuthenticatedPeer", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("authorize-authenticated-peer").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
