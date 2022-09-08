package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Instances of the #GDBusMethodInvocation class are used when
 * handling D-Bus method calls. It provides a way to asynchronously
 * return results and errors.
 * 
 * The normal way to obtain a #GDBusMethodInvocation object is to receive
 * it as an argument to the handle_method_call() function in a
 * #GDBusInterfaceVTable that was passed to g_dbus_connection_register_object().
 */
public class DBusMethodInvocation extends org.gtk.gobject.Object {

    public DBusMethodInvocation(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusMethodInvocation */
    public static DBusMethodInvocation castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMethodInvocation(gobject.getReference());
    }
    
    /**
     * Gets the #GDBusConnection the method was invoked on.
     */
    public DBusConnection getConnection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_connection(HANDLE());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     * 
     * If this method call is a property Get, Set or GetAll call that has
     * been redirected to the method call handler then
     * "org.freedesktop.DBus.Properties" will be returned.  See
     * #GDBusInterfaceVTable for more information.
     */
    public java.lang.String getInterfaceName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_interface_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the #GDBusMessage for the method invocation. This is useful if
     * you need to use low-level protocol features, such as UNIX file
     * descriptor passing, that cannot be properly expressed in the
     * #GVariant API.
     * 
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     */
    public DBusMessage getMessage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_message(HANDLE());
        return new DBusMessage(References.get(RESULT, false));
    }
    
    /**
     * Gets information about the method call, if any.
     * 
     * If this method invocation is a property Get, Set or GetAll call that
     * has been redirected to the method call handler then %NULL will be
     * returned.  See g_dbus_method_invocation_get_property_info() and
     * #GDBusInterfaceVTable for more information.
     */
    public DBusMethodInfo getMethodInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_method_info(HANDLE());
        return new DBusMethodInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the method that was invoked.
     */
    public java.lang.String getMethodName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_method_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the object path the method was invoked on.
     */
    public java.lang.String getObjectPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_object_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the parameters of the method invocation. If there are no input
     * parameters then this will return a GVariant with 0 children rather than NULL.
     */
    public org.gtk.glib.Variant getParameters() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_parameters(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets information about the property that this method call is for, if
     * any.
     * 
     * This will only be set in the case of an invocation in response to a
     * property Get or Set call that has been directed to the method call
     * handler for an object on account of its property_get() or
     * property_set() vtable pointers being unset.
     * 
     * See #GDBusInterfaceVTable for more information.
     * 
     * If the call was GetAll, %NULL will be returned.
     */
    public DBusPropertyInfo getPropertyInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_property_info(HANDLE());
        return new DBusPropertyInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the bus name that invoked the method.
     */
    public java.lang.String getSender() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_sender(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the @user_data #gpointer passed to g_dbus_connection_register_object().
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_get_user_data(HANDLE());
        return RESULT;
    }
    
    /**
     * Finishes handling a D-Bus method call by returning an error.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void returnDbusError(java.lang.String errorName, java.lang.String errorMessage) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_dbus_error(HANDLE(), Interop.allocateNativeString(errorName).HANDLE(), Interop.allocateNativeString(errorMessage).HANDLE());
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void returnErrorLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_error_literal(HANDLE(), domain.getValue(), code, Interop.allocateNativeString(message).HANDLE());
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but intended for
     * language bindings.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void returnErrorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList varArgs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_error_valist(HANDLE(), domain.getValue(), code, Interop.allocateNativeString(format).HANDLE(), varArgs);
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but takes a #GError
     * instead of the error domain, error code and message.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void returnGerror(org.gtk.glib.Error error) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_gerror(HANDLE(), error.HANDLE());
    }
    
    /**
     * Finishes handling a D-Bus method call by returning @parameters.
     * If the @parameters GVariant is floating, it is consumed.
     * 
     * It is an error if @parameters is not of the right format: it must be a tuple
     * containing the out-parameters of the D-Bus method. Even if the method has a
     * single out-parameter, it must be contained in a tuple. If the method has no
     * out-parameters, @parameters may be %NULL or an empty tuple.
     * 
     * |[<!-- language="C" -->
     * GDBusMethodInvocation *invocation = some_invocation;
     * g_autofree gchar *result_string = NULL;
     * g_autoptr (GError) error = NULL;
     * 
     * result_string = calculate_result (&error);
     * 
     * if (error != NULL)
     *   g_dbus_method_invocation_return_gerror (invocation, error);
     * else
     *   g_dbus_method_invocation_return_value (invocation,
     *                                          g_variant_new ("(s)", result_string));
     * 
     * // Do not free @invocation here; returning a value does that
     * ]|
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     * 
     * Since 2.48, if the method call requested for a reply not to be sent
     * then this call will sink @parameters and free @invocation, but
     * otherwise do nothing (as per the recommendations of the D-Bus
     * specification).
     */
    public void returnValue(org.gtk.glib.Variant parameters) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_value(HANDLE(), parameters.HANDLE());
    }
    
    /**
     * Like g_dbus_method_invocation_return_value() but also takes a #GUnixFDList.
     * 
     * This method is only available on UNIX.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void returnValueWithUnixFdList(org.gtk.glib.Variant parameters, UnixFDList fdList) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_return_value_with_unix_fd_list(HANDLE(), parameters.HANDLE(), fdList.HANDLE());
    }
    
    /**
     * Like g_dbus_method_invocation_return_gerror() but takes ownership
     * of @error so the caller does not need to free it.
     * 
     * This method will take ownership of @invocation. See
     * #GDBusInterfaceVTable for more information about the ownership of
     * @invocation.
     */
    public void takeError(org.gtk.glib.Error error) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_method_invocation_take_error(HANDLE(), error.HANDLE());
    }
    
}
