package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Instances of the {@link DBusMethodInvocation} class are used when
 * handling D-Bus method calls. It provides a way to asynchronously
 * return results and errors.
 * <p>
 * The normal way to obtain a {@link DBusMethodInvocation} object is to receive
 * it as an argument to the handle_method_call() function in a
 * {@link DBusInterfaceVTable} that was passed to g_dbus_connection_register_object().
 */
public class DBusMethodInvocation extends org.gtk.gobject.Object {

    public DBusMethodInvocation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusMethodInvocation */
    public static DBusMethodInvocation castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMethodInvocation(gobject.getReference());
    }
    
    /**
     * Gets the {@link DBusConnection} the method was invoked on.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     * <p>
     * If this method call is a property Get, Set or GetAll call that has
     * been redirected to the method call handler then
     * "org.freedesktop.DBus.Properties" will be returned.  See
     * {@link DBusInterfaceVTable} for more information.
     */
    public java.lang.String getInterfaceName() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_interface_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@link DBusMessage} for the method invocation. This is useful if
     * you need to use low-level protocol features, such as UNIX file
     * descriptor passing, that cannot be properly expressed in the
     * {@link org.gtk.glib.Variant} API.
     * <p>
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     */
    public DBusMessage getMessage() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_message(handle());
        return new DBusMessage(References.get(RESULT, false));
    }
    
    /**
     * Gets information about the method call, if any.
     * <p>
     * If this method invocation is a property Get, Set or GetAll call that
     * has been redirected to the method call handler then <code>null</code> will be
     * returned.  See g_dbus_method_invocation_get_property_info() and
     * {@link DBusInterfaceVTable} for more information.
     */
    public DBusMethodInfo getMethodInfo() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_method_info(handle());
        return new DBusMethodInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the method that was invoked.
     */
    public java.lang.String getMethodName() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_method_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the object path the method was invoked on.
     */
    public java.lang.String getObjectPath() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the parameters of the method invocation. If there are no input
     * parameters then this will return a GVariant with 0 children rather than NULL.
     */
    public org.gtk.glib.Variant getParameters() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_parameters(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets information about the property that this method call is for, if
     * any.
     * <p>
     * This will only be set in the case of an invocation in response to a
     * property Get or Set call that has been directed to the method call
     * handler for an object on account of its property_get() or
     * property_set() vtable pointers being unset.
     * <p>
     * See {@link DBusInterfaceVTable} for more information.
     * <p>
     * If the call was GetAll, <code>null</code> will be returned.
     */
    public DBusPropertyInfo getPropertyInfo() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_property_info(handle());
        return new DBusPropertyInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the bus name that invoked the method.
     */
    public java.lang.String getSender() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_sender(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@code user_data} {@code gpointer} passed to g_dbus_connection_register_object().
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.g_dbus_method_invocation_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnDbusError(java.lang.String errorName, java.lang.String errorMessage) {
        gtk_h.g_dbus_method_invocation_return_dbus_error(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessage).handle());
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnErrorLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        gtk_h.g_dbus_method_invocation_return_error_literal(handle(), domain.getValue(), code, Interop.allocateNativeString(message).handle());
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but intended for
     * language bindings.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnErrorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList varArgs) {
        gtk_h.g_dbus_method_invocation_return_error_valist(handle(), domain.getValue(), code, Interop.allocateNativeString(format).handle(), varArgs);
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but takes a {@link org.gtk.glib.Error}
     * instead of the error domain, error code and message.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnGerror(org.gtk.glib.Error error) {
        gtk_h.g_dbus_method_invocation_return_gerror(handle(), error.handle());
    }
    
    /**
     * Finishes handling a D-Bus method call by returning {@code parameters}.
     * If the {@code parameters} GVariant is floating, it is consumed.
     * <p>
     * It is an error if {@code parameters} is not of the right format: it must be a tuple
     * containing the out-parameters of the D-Bus method. Even if the method has a
     * single out-parameter, it must be contained in a tuple. If the method has no
     * out-parameters, {@code parameters} may be <code>null</code> or an empty tuple.
     * <p>
     * |[&lt;!-- language="C" --&gt;
     * GDBusMethodInvocation *invocation = some_invocation;
     * g_autofree gchar *result_string = NULL;
     * g_autoptr (GError) error = NULL;
     * <p>
     * result_string = calculate_result (&error);
     * <p>
     * if (error != NULL)
     *   g_dbus_method_invocation_return_gerror (invocation, error);
     * else
     *   g_dbus_method_invocation_return_value (invocation,
     *                                          g_variant_new ("(s)", result_string));
     * <p>
     * // Do not free {@code invocation} here; returning a value does that
     * ]|
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * <p>
     * Since 2.48, if the method call requested for a reply not to be sent
     * then this call will sink {@code parameters} and free {@code invocation}, but
     * otherwise do nothing (as per the recommendations of the D-Bus
     * specification).
     */
    public void returnValue(org.gtk.glib.Variant parameters) {
        gtk_h.g_dbus_method_invocation_return_value(handle(), parameters.handle());
    }
    
    /**
     * Like g_dbus_method_invocation_return_value() but also takes a {@link UnixFDList}.
     * <p>
     * This method is only available on UNIX.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnValueWithUnixFdList(org.gtk.glib.Variant parameters, UnixFDList fdList) {
        gtk_h.g_dbus_method_invocation_return_value_with_unix_fd_list(handle(), parameters.handle(), fdList.handle());
    }
    
    /**
     * Like g_dbus_method_invocation_return_gerror() but takes ownership
     * of {@code error} so the caller does not need to free it.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void takeError(org.gtk.glib.Error error) {
        gtk_h.g_dbus_method_invocation_take_error(handle(), error.handle());
    }
    
}
