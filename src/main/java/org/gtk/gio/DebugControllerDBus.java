package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DebugControllerDBus} is an implementation of {@link DebugController} which exposes
 * debug settings as a D-Bus object.
 * <p>
 * It is a {@link Initable} object, and will register an object at
 * {@code /org/gtk/Debugging} on the bus given as
 * {@link DebugControllerDBus}:connection once it’s initialized. The object will be
 * unregistered when the last reference to the {@link DebugControllerDBus} is dropped.
 * <p>
 * This D-Bus object can be used by remote processes to enable or disable debug
 * output in this process. Remote processes calling
 * {@code org.gtk.Debugging.SetDebugEnabled()} will affect the value of
 * {@link DebugController}:debug-enabled and, by default, g_log_get_debug_enabled().
 * default.
 * <p>
 * By default, all processes will be able to call {@code SetDebugEnabled()}. If this
 * process is privileged, or might expose sensitive information in its debug
 * output, you may want to restrict the ability to enable debug output to
 * privileged users or processes.
 * <p>
 * One option is to install a D-Bus security policy which restricts access to
 * {@code SetDebugEnabled()}, installing something like the following in
 * {@code $datadir/dbus-1/system.d/}:
 * <pre>{@code <!-- language="XML" -->
 * <?xml version="1.0"?> <!--*-nxml-*-->
 * <!DOCTYPE busconfig PUBLIC "-//freedesktop//DTD D-BUS Bus Configuration 1.0//EN"
 *      "http://www.freedesktop.org/standards/dbus/1.0/busconfig.dtd">
 * <busconfig>
 *   <policy user="root">
 *     <allow send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
 *   </policy>
 *   <policy context="default">
 *     <deny send_destination="com.example.MyService" send_interface="org.gtk.Debugging"/>
 *   </policy>
 * </busconfig>
 * }</pre>
 * <p>
 * This will prevent the {@code SetDebugEnabled()} method from being called by all
 * except root. It will not prevent the {@code DebugEnabled} property from being read,
 * as it’s accessed through the {@code org.freedesktop.DBus.Properties} interface.
 * <p>
 * Another option is to use polkit to allow or deny requests on a case-by-case
 * basis, allowing for the possibility of dynamic authorisation. To do this,
 * connect to the {@link DebugControllerDBus}::authorize signal and query polkit in
 * it:
 * <pre>{@code <!-- language="C" -->
 *   g_autoptr(GError) child_error = NULL;
 *   g_autoptr(GDBusConnection) connection = g_bus_get_sync (G_BUS_TYPE_SYSTEM, NULL, NULL);
 *   gulong debug_controller_authorize_id = 0;
 * 
 *   // Set up the debug controller.
 *   debug_controller = G_DEBUG_CONTROLLER (g_debug_controller_dbus_new (priv->connection, NULL, &child_error));
 *   if (debug_controller == NULL)
 *     {
 *       g_error ("Could not register debug controller on bus: %s"),
 *                child_error->message);
 *     }
 * 
 *   debug_controller_authorize_id = g_signal_connect (debug_controller,
 *                                                     "authorize",
 *                                                     G_CALLBACK (debug_controller_authorize_cb),
 *                                                     self);
 * 
 *   static gboolean
 *   debug_controller_authorize_cb (GDebugControllerDBus  *debug_controller,
 *                                  GDBusMethodInvocation *invocation,
 *                                  gpointer               user_data)
 *   {
 *     g_autoptr(PolkitAuthority) authority = NULL;
 *     g_autoptr(PolkitSubject) subject = NULL;
 *     g_autoptr(PolkitAuthorizationResult) auth_result = NULL;
 *     g_autoptr(GError) local_error = NULL;
 *     GDBusMessage *message;
 *     GDBusMessageFlags message_flags;
 *     PolkitCheckAuthorizationFlags flags = POLKIT_CHECK_AUTHORIZATION_FLAGS_NONE;
 * 
 *     message = g_dbus_method_invocation_get_message (invocation);
 *     message_flags = g_dbus_message_get_flags (message);
 * 
 *     authority = polkit_authority_get_sync (NULL, &local_error);
 *     if (authority == NULL)
 *       {
 *         g_warning ("Failed to get polkit authority: %s", local_error->message);
 *         return FALSE;
 *       }
 * 
 *     if (message_flags & G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
 *       flags |= POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION;
 * 
 *     subject = polkit_system_bus_name_new (g_dbus_method_invocation_get_sender (invocation));
 * 
 *     auth_result = polkit_authority_check_authorization_sync (authority,
 *                                                              subject,
 *                                                              "com.example.MyService.set-debug-enabled",
 *                                                              NULL,
 *                                                              flags,
 *                                                              NULL,
 *                                                              &local_error);
 *     if (auth_result == NULL)
 *       {
 *         g_warning ("Failed to get check polkit authorization: %s", local_error->message);
 *         return FALSE;
 *       }
 * 
 *     return polkit_authorization_result_get_is_authorized (auth_result);
 *   }
 * }</pre>
 * @version 2.72
 */
public class DebugControllerDBus extends org.gtk.gobject.GObject implements org.gtk.gio.DebugController, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDebugControllerDBus";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DebugControllerDBus proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DebugControllerDBus(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugControllerDBus> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DebugControllerDBus(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.DBusConnection connection, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_debug_controller_dbus_new.invokeExact(
                        connection.handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new {@link DebugControllerDBus} and synchronously initialize it.
     * <p>
     * Initializing the object will export the debug object on {@code connection}. The
     * object will remain registered until the last reference to the
     * {@link DebugControllerDBus} is dropped.
     * <p>
     * Initialization may fail if registering the object on {@code connection} fails.
     * @param connection a {@link DBusConnection} to register the debug object on
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public DebugControllerDBus(org.gtk.gio.DBusConnection connection, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        super(constructNew(connection, cancellable));
        this.takeOwnership();
    }
    
    /**
     * Stop the debug controller, unregistering its object from the bus.
     * <p>
     * Any pending method calls to the object will complete successfully, but new
     * ones will return an error. This method will block until all pending
     * {@link DebugControllerDBus}::authorize signals have been handled. This is expected
     * to not take long, as it will just be waiting for threads to join. If any
     * {@link DebugControllerDBus}::authorize signal handlers are still executing in other
     * threads, this will block until after they have returned.
     * <p>
     * This method will be called automatically when the final reference to the
     * {@link DebugControllerDBus} is dropped. You may want to call it explicitly to know
     * when the controller has been fully removed from the bus, or to break
     * reference count cycles.
     * <p>
     * Calling this method from within a {@link DebugControllerDBus}::authorize signal
     * handler will cause a deadlock and must not be done.
     */
    public void stop() {
        try {
            DowncallHandles.g_debug_controller_dbus_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_debug_controller_dbus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Authorize} callback.
     */
    @FunctionalInterface
    public interface Authorize {
    
        /**
         * Emitted when a D-Bus peer is trying to change the debug settings and used
         * to determine if that is authorized.
         * <p>
         * This signal is emitted in a dedicated worker thread, so handlers are
         * allowed to perform blocking I/O. This means that, for example, it is
         * appropriate to call {@code polkit_authority_check_authorization_sync()} to check
         * authorization using polkit.
         * <p>
         * If {@code false} is returned then no further handlers are run and the request to
         * change the debug settings is rejected.
         * <p>
         * Otherwise, if {@code true} is returned, signal emission continues. If no handlers
         * return {@code false}, then the debug settings are allowed to be changed.
         * <p>
         * Signal handlers must not modify {@code invocation}, or cause it to return a value.
         * <p>
         * The default class handler just returns {@code true}.
         */
        boolean run(org.gtk.gio.DBusMethodInvocation invocation);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceDebugControllerDBus, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusMethodInvocation) Interop.register(invocation, org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Authorize.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a D-Bus peer is trying to change the debug settings and used
     * to determine if that is authorized.
     * <p>
     * This signal is emitted in a dedicated worker thread, so handlers are
     * allowed to perform blocking I/O. This means that, for example, it is
     * appropriate to call {@code polkit_authority_check_authorization_sync()} to check
     * authorization using polkit.
     * <p>
     * If {@code false} is returned then no further handlers are run and the request to
     * change the debug settings is rejected.
     * <p>
     * Otherwise, if {@code true} is returned, signal emission continues. If no handlers
     * return {@code false}, then the debug settings are allowed to be changed.
     * <p>
     * Signal handlers must not modify {@code invocation}, or cause it to return a value.
     * <p>
     * The default class handler just returns {@code true}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DebugControllerDBus.Authorize> onAuthorize(DebugControllerDBus.Authorize handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("authorize", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DebugControllerDBus.Builder} object constructs a {@link DebugControllerDBus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DebugControllerDBus.Builder#build()}. 
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
         * Finish building the {@link DebugControllerDBus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DebugControllerDBus}.
         * @return A new instance of {@code DebugControllerDBus} with the properties 
         *         that were set in the Builder object.
         */
        public DebugControllerDBus build() {
            return (DebugControllerDBus) org.gtk.gobject.GObject.newWithProperties(
                DebugControllerDBus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The D-Bus connection to expose the debugging interface on.
         * <p>
         * Typically this will be the same connection (to the system or session bus)
         * which the rest of the application or service’s D-Bus objects are registered
         * on.
         * @param connection The value for the {@code connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnection(org.gtk.gio.DBusConnection connection) {
            names.add("connection");
            values.add(org.gtk.gobject.Value.create(connection));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_debug_controller_dbus_new = Interop.downcallHandle(
                "g_debug_controller_dbus_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_debug_controller_dbus_stop = Interop.downcallHandle(
                "g_debug_controller_dbus_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_debug_controller_dbus_get_type = Interop.downcallHandle(
                "g_debug_controller_dbus_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_debug_controller_dbus_get_type != null;
    }
}
