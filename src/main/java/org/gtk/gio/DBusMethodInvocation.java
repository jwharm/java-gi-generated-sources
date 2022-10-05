package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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

    public DBusMethodInvocation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusMethodInvocation */
    public static DBusMethodInvocation castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMethodInvocation(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_method_invocation_get_connection = Interop.downcallHandle(
        "g_dbus_method_invocation_get_connection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusConnection} the method was invoked on.
     */
    public DBusConnection getConnection() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_connection.invokeExact(handle());
            return new DBusConnection(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_interface_name = Interop.downcallHandle(
        "g_dbus_method_invocation_get_interface_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     * <p>
     * If this method call is a property Get, Set or GetAll call that has
     * been redirected to the method call handler then
     * "org.freedesktop.DBus.Properties" will be returned.  See
     * {@link DBusInterfaceVTable} for more information.
     */
    public java.lang.String getInterfaceName() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_interface_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_message = Interop.downcallHandle(
        "g_dbus_method_invocation_get_message",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_message.invokeExact(handle());
            return new DBusMessage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_method_info = Interop.downcallHandle(
        "g_dbus_method_invocation_get_method_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets information about the method call, if any.
     * <p>
     * If this method invocation is a property Get, Set or GetAll call that
     * has been redirected to the method call handler then {@code null} will be
     * returned.  See g_dbus_method_invocation_get_property_info() and
     * {@link DBusInterfaceVTable} for more information.
     */
    public DBusMethodInfo getMethodInfo() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_method_info.invokeExact(handle());
            return new DBusMethodInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_method_name = Interop.downcallHandle(
        "g_dbus_method_invocation_get_method_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the method that was invoked.
     */
    public java.lang.String getMethodName() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_method_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_object_path = Interop.downcallHandle(
        "g_dbus_method_invocation_get_object_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the object path the method was invoked on.
     */
    public java.lang.String getObjectPath() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_object_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_parameters = Interop.downcallHandle(
        "g_dbus_method_invocation_get_parameters",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the parameters of the method invocation. If there are no input
     * parameters then this will return a GVariant with 0 children rather than NULL.
     */
    public org.gtk.glib.Variant getParameters() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_parameters.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_property_info = Interop.downcallHandle(
        "g_dbus_method_invocation_get_property_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If the call was GetAll, {@code null} will be returned.
     */
    public DBusPropertyInfo getPropertyInfo() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_property_info.invokeExact(handle());
            return new DBusPropertyInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_sender = Interop.downcallHandle(
        "g_dbus_method_invocation_get_sender",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the bus name that invoked the method.
     */
    public java.lang.String getSender() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_sender.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_get_user_data = Interop.downcallHandle(
        "g_dbus_method_invocation_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code user_data} {@code gpointer} passed to g_dbus_connection_register_object().
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        try {
            var RESULT = (MemoryAddress) g_dbus_method_invocation_get_user_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_dbus_error = Interop.downcallHandle(
        "g_dbus_method_invocation_return_dbus_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnDbusError(java.lang.String errorName, java.lang.String errorMessage) {
        try {
            g_dbus_method_invocation_return_dbus_error.invokeExact(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessage).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_error_literal = Interop.downcallHandle(
        "g_dbus_method_invocation_return_error_literal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnErrorLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        try {
            g_dbus_method_invocation_return_error_literal.invokeExact(handle(), domain.getValue(), code, Interop.allocateNativeString(message).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_error_valist = Interop.downcallHandle(
        "g_dbus_method_invocation_return_error_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_method_invocation_return_error() but intended for
     * language bindings.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnErrorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList varArgs) {
        try {
            g_dbus_method_invocation_return_error_valist.invokeExact(handle(), domain.getValue(), code, Interop.allocateNativeString(format).handle(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_gerror = Interop.downcallHandle(
        "g_dbus_method_invocation_return_gerror",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_method_invocation_return_error() but takes a {@link org.gtk.glib.Error}
     * instead of the error domain, error code and message.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void returnGerror(org.gtk.glib.Error error) {
        try {
            g_dbus_method_invocation_return_gerror.invokeExact(handle(), error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_value = Interop.downcallHandle(
        "g_dbus_method_invocation_return_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes handling a D-Bus method call by returning {@code parameters}.
     * If the {@code parameters} GVariant is floating, it is consumed.
     * <p>
     * It is an error if {@code parameters} is not of the right format: it must be a tuple
     * containing the out-parameters of the D-Bus method. Even if the method has a
     * single out-parameter, it must be contained in a tuple. If the method has no
     * out-parameters, {@code parameters} may be {@code null} or an empty tuple.
     * <p>
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
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
        try {
            g_dbus_method_invocation_return_value.invokeExact(handle(), parameters.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_return_value_with_unix_fd_list = Interop.downcallHandle(
        "g_dbus_method_invocation_return_value_with_unix_fd_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            g_dbus_method_invocation_return_value_with_unix_fd_list.invokeExact(handle(), parameters.handle(), fdList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_method_invocation_take_error = Interop.downcallHandle(
        "g_dbus_method_invocation_take_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_method_invocation_return_gerror() but takes ownership
     * of {@code error} so the caller does not need to free it.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     */
    public void takeError(org.gtk.glib.Error error) {
        try {
            g_dbus_method_invocation_take_error.invokeExact(handle(), error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
