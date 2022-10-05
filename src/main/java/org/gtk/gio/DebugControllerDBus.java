package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class DebugControllerDBus extends org.gtk.gobject.Object implements DebugController, Initable {

    public DebugControllerDBus(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DebugControllerDBus */
    public static DebugControllerDBus castFrom(org.gtk.gobject.Object gobject) {
        return new DebugControllerDBus(gobject.refcounted());
    }
    
    static final MethodHandle g_debug_controller_dbus_new = Interop.downcallHandle(
        "g_debug_controller_dbus_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(DBusConnection connection, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_debug_controller_dbus_new.invokeExact(connection.handle(), cancellable.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     */
    public DebugControllerDBus(DBusConnection connection, Cancellable cancellable) throws GErrorException {
        super(constructNew(connection, cancellable));
    }
    
    static final MethodHandle g_debug_controller_dbus_stop = Interop.downcallHandle(
        "g_debug_controller_dbus_stop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            g_debug_controller_dbus_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AuthorizeHandler {
        boolean signalReceived(DebugControllerDBus source, DBusMethodInvocation invocation);
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
     */
    public SignalHandle onAuthorize(AuthorizeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("authorize").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DebugControllerDBus.Callbacks.class, "signalDebugControllerDBusAuthorize",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalDebugControllerDBusAuthorize(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DebugControllerDBus.AuthorizeHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DebugControllerDBus(Refcounted.get(source)), new DBusMethodInvocation(Refcounted.get(invocation, false)));
        }
        
    }
}