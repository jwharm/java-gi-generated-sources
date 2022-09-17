package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDebugControllerDBus is an implementation of #GDebugController which exposes
 * debug settings as a D-Bus object.
 * <p>
 * It is a #GInitable object, and will register an object at<code>/org/gtk/Debugging</code> on the bus given as
 * <h1>ebugControllerDBus:connection once it&#8217;s initialized. The object will be</h1>
 * unregistered when the last reference to the #GDebugControllerDBus is dropped.
 * <p>
 * This D-Bus object can be used by remote processes to enable or disable debug
 * output in this process. Remote processes calling<code>org.gtk.Debugging.SetDebugEnabled()</code> will affect the value of
 * <h1>ebugController:debug-enabled and, by default, g_log_get_debug_enabled().</h1>
 * default.
 * <p>
 * By default, all processes will be able to call <code>SetDebugEnabled()</code>. If this
 * process is privileged, or might expose sensitive information in its debug
 * output, you may want to restrict the ability to enable debug output to
 * privileged users or processes.
 * <p>
 * One option is to install a D-Bus security policy which restricts access to<code>SetDebugEnabled()</code>, installing something like the following in<code>$datadir/dbus-1/system.d/</code>:
 * |{@link [&#60;!-- language=&#34;XML&#34; --&#62;
 * &#60;?xml version=&#34;1.0&#34;?&#62; &#60;!--*-nxml-*--&#62;
 * &#60;!DOCTYPE busconfig PUBLIC &#34;-//freedesktop//DTD D-BUS Bus Configuration 1.0//EN&#34;
 *      &#34;http://www.freedesktop.org/standards/dbus/1.0/busconfig.dtd&#34;&#62;
 * &#60;busconfig&#62;
 *   &#60;policy user=&#34;root&#34;&#62;
 *     &#60;allow send_destination=&#34;com.example.MyService&#34; send_interface=&#34;org.gtk.Debugging&#34;/&#62;
 *   &#60;/policy&#62;
 *   &#60;policy context=&#34;default&#34;&#62;
 *     &#60;deny send_destination=&#34;com.example.MyService&#34; send_interface=&#34;org.gtk.Debugging&#34;/&#62;
 *   &#60;/policy&#62;
 * &#60;/busconfig&#62;
 * ]}|
 * <p>
 * This will prevent the <code>SetDebugEnabled()</code> method from being called by all
 * except root. It will not prevent the <code>DebugEnabled</code> property from being read,
 * as it&#8217;s accessed through the <code>org.freedesktop.DBus.Properties</code> interface.
 * 
 * Another option is to use polkit to allow or deny requests on a case-by-case
 * basis, allowing for the possibility of dynamic authorisation. To do this,
 * connect to the #GDebugControllerDBus::authorize signal and query polkit in
 * it:
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 *   g_autoptr(GError) child_error = NULL;
 *   g_autoptr(GDBusConnection) connection = g_bus_get_sync (G_BUS_TYPE_SYSTEM, NULL, NULL);
 *   gulong debug_controller_authorize_id = 0;
 * 
 *   // Set up the debug controller.
 *   debug_controller = G_DEBUG_CONTROLLER (g_debug_controller_dbus_new (priv-&#62;connection, NULL, &#38;child_error));
 *   if (debug_controller == NULL)
 *     {
 *       g_error (&#34;Could not register debug controller on bus: <code>s&#34;),
 * </code>               child_error-&#62;message);
 *     }
 * 
 *   debug_controller_authorize_id = g_signal_connect (debug_controller,
 *                                                     &#34;authorize&#34;,
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
 *     authority = polkit_authority_get_sync (NULL, &#38;local_error);
 *     if (authority == NULL)
 *       {
 *         g_warning (&#34;Failed to get polkit authority: <code>s&#34;,</code> local_error-&#62;message);
 *         return FALSE;
 *       }
 * 
 *     if (message_flags &#38; G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
 *       flags |= POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION;
 * 
 *     subject = polkit_system_bus_name_new (g_dbus_method_invocation_get_sender (invocation));
 * 
 *     auth_result = polkit_authority_check_authorization_sync (authority,
 *                                                              subject,
 *                                                              &#34;com.example.MyService.set-debug-enabled&#34;,
 *                                                              NULL,
 *                                                              flags,
 *                                                              NULL,
 *                                                              &#38;local_error);
 *     if (auth_result == NULL)
 *       {
 *         g_warning (&#34;Failed to get check polkit authorization: <code>s&#34;,</code> local_error-&#62;message);
 *         return FALSE;
 *       }
 * 
 *     return polkit_authorization_result_get_is_authorized (auth_result);
 *   }
 * ]}|
 */
public class DebugControllerDBus extends org.gtk.gobject.Object implements DebugController, Initable {

    public DebugControllerDBus(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DebugControllerDBus */
    public static DebugControllerDBus castFrom(org.gtk.gobject.Object gobject) {
        return new DebugControllerDBus(gobject.getReference());
    }
    
    private static Reference constructNew(DBusConnection connection, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_debug_controller_dbus_new(connection.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Create a new #GDebugControllerDBus and synchronously initialize it.
     * 
     * Initializing the object will export the debug object on @connection. The
     * object will remain registered until the last reference to the
     * #GDebugControllerDBus is dropped.
     * 
     * Initialization may fail if registering the object on @connection fails.
     */
    public DebugControllerDBus(DBusConnection connection, Cancellable cancellable) throws GErrorException {
        super(constructNew(connection, cancellable));
    }
    
    /**
     * Stop the debug controller, unregistering its object from the bus.
     * 
     * Any pending method calls to the object will complete successfully, but new
     * ones will return an error. This method will block until all pending
     * #GDebugControllerDBus::authorize signals have been handled. This is expected
     * to not take long, as it will just be waiting for threads to join. If any
     * #GDebugControllerDBus::authorize signal handlers are still executing in other
     * threads, this will block until after they have returned.
     * 
     * This method will be called automatically when the final reference to the
     * #GDebugControllerDBus is dropped. You may want to call it explicitly to know
     * when the controller has been fully removed from the bus, or to break
     * reference count cycles.
     * 
     * Calling this method from within a #GDebugControllerDBus::authorize signal
     * handler will cause a deadlock and must not be done.
     */
    public void stop() {
        gtk_h.g_debug_controller_dbus_stop(handle());
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
     * appropriate to call <code>polkit_authority_check_authorization_sync()</code> to check
     * authorization using polkit.
     * 
     * If <code>false</code> is returned then no further handlers are run and the request to
     * change the debug settings is rejected.
     * 
     * Otherwise, if <code>true</code> is returned, signal emission continues. If no handlers
     * return <code>FALSE,</code> then the debug settings are allowed to be changed.
     * 
     * Signal handlers must not modify @invocation, or cause it to return a value.
     * 
     * The default class handler just returns then the debug settings are allowed to be changed.
     * 
     * Signal handlers must not modify @invocation, or cause it to return a value.
     * 
     * The default class handler just returns %TRUE.
     */
    public SignalHandle onAuthorize(AuthorizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDebugControllerDBusAuthorize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("authorize").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
