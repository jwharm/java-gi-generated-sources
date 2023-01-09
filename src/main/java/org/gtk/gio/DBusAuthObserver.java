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
public class DBusAuthObserver extends org.gtk.gobject.GObject {
    
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
     */
    protected DBusAuthObserver(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusAuthObserver> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusAuthObserver(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Emits the {@link DBusAuthObserver}::allow-mechanism signal on {@code observer}.
     * @param mechanism The name of the mechanism, e.g. {@code DBUS_COOKIE_SHA1}.
     * @return {@code true} if {@code mechanism} can be used to authenticate the other peer, {@code false} if not.
     */
    public boolean allowMechanism(java.lang.String mechanism) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_dbus_auth_observer_allow_mechanism.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(mechanism, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Emits the {@link DBusAuthObserver}::authorize-authenticated-peer signal on {@code observer}.
     * @param stream A {@link IOStream} for the {@link DBusConnection}.
     * @param credentials Credentials received from the peer or {@code null}.
     * @return {@code true} if the peer is authorized, {@code false} if not.
     */
    public boolean authorizeAuthenticatedPeer(org.gtk.gio.IOStream stream, @Nullable org.gtk.gio.Credentials credentials) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_auth_observer_authorize_authenticated_peer.invokeExact(
                    handle(),
                    stream.handle(),
                    (Addressable) (credentials == null ? MemoryAddress.NULL : credentials.handle()));
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
            RESULT = (long) DowncallHandles.g_dbus_auth_observer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AllowMechanism} callback.
     */
    @FunctionalInterface
    public interface AllowMechanism {
    
        /**
         * Emitted to check if {@code mechanism} is allowed to be used.
         */
        boolean run(java.lang.String mechanism);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceDBusAuthObserver, MemoryAddress mechanism) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(mechanism, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AllowMechanism.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to check if {@code mechanism} is allowed to be used.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusAuthObserver.AllowMechanism> onAllowMechanism(DBusAuthObserver.AllowMechanism handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("allow-mechanism", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code AuthorizeAuthenticatedPeer} callback.
     */
    @FunctionalInterface
    public interface AuthorizeAuthenticatedPeer {
    
        /**
         * Emitted to check if a peer that is successfully authenticated
         * is authorized.
         */
        boolean run(org.gtk.gio.IOStream stream, @Nullable org.gtk.gio.Credentials credentials);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceDBusAuthObserver, MemoryAddress stream, MemoryAddress credentials) {
            var RESULT = run((org.gtk.gio.IOStream) Interop.register(stream, org.gtk.gio.IOStream.fromAddress).marshal(stream, null), (org.gtk.gio.Credentials) Interop.register(credentials, org.gtk.gio.Credentials.fromAddress).marshal(credentials, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AuthorizeAuthenticatedPeer.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to check if a peer that is successfully authenticated
     * is authorized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusAuthObserver.AuthorizeAuthenticatedPeer> onAuthorizeAuthenticatedPeer(DBusAuthObserver.AuthorizeAuthenticatedPeer handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("authorize-authenticated-peer", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusAuthObserver.Builder} object constructs a {@link DBusAuthObserver} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusAuthObserver.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusAuthObserver} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusAuthObserver}.
         * @return A new instance of {@code DBusAuthObserver} with the properties 
         *         that were set in the Builder object.
         */
        public DBusAuthObserver build() {
            return (DBusAuthObserver) org.gtk.gobject.GObject.newWithProperties(
                DBusAuthObserver.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_auth_observer_new = Interop.downcallHandle(
                "g_dbus_auth_observer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_auth_observer_allow_mechanism = Interop.downcallHandle(
                "g_dbus_auth_observer_allow_mechanism",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_auth_observer_authorize_authenticated_peer = Interop.downcallHandle(
                "g_dbus_auth_observer_authorize_authenticated_peer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_auth_observer_get_type = Interop.downcallHandle(
                "g_dbus_auth_observer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_auth_observer_get_type != null;
    }
}
