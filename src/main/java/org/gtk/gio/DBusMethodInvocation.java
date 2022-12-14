package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Instances of the {@link DBusMethodInvocation} class are used when
 * handling D-Bus method calls. It provides a way to asynchronously
 * return results and errors.
 * <p>
 * The normal way to obtain a {@link DBusMethodInvocation} object is to receive
 * it as an argument to the handle_method_call() function in a
 * {@link DBusInterfaceVTable} that was passed to g_dbus_connection_register_object().
 * @version 2.26
 */
public class DBusMethodInvocation extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMethodInvocation";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusMethodInvocation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusMethodInvocation(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusMethodInvocation> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusMethodInvocation(input);
    
    /**
     * Gets the {@link DBusConnection} the method was invoked on.
     * @return A {@link DBusConnection}. Do not free, it is owned by {@code invocation}.
     */
    public org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusConnection) Interop.register(RESULT, org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     * <p>
     * If this method call is a property Get, Set or GetAll call that has
     * been redirected to the method call handler then
     * "org.freedesktop.DBus.Properties" will be returned.  See
     * {@link DBusInterfaceVTable} for more information.
     * @return A string. Do not free, it is owned by {@code invocation}.
     */
    public java.lang.String getInterfaceName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_interface_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
     * @return {@link DBusMessage}. Do not free, it is owned by {@code invocation}.
     */
    public org.gtk.gio.DBusMessage getMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_message.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusMessage) Interop.register(RESULT, org.gtk.gio.DBusMessage.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets information about the method call, if any.
     * <p>
     * If this method invocation is a property Get, Set or GetAll call that
     * has been redirected to the method call handler then {@code null} will be
     * returned.  See g_dbus_method_invocation_get_property_info() and
     * {@link DBusInterfaceVTable} for more information.
     * @return A {@link DBusMethodInfo} or {@code null}. Do not free, it is owned by {@code invocation}.
     */
    public @Nullable org.gtk.gio.DBusMethodInfo getMethodInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_method_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusMethodInfo.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the name of the method that was invoked.
     * @return A string. Do not free, it is owned by {@code invocation}.
     */
    public java.lang.String getMethodName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_method_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the object path the method was invoked on.
     * @return A string. Do not free, it is owned by {@code invocation}.
     */
    public java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_object_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the parameters of the method invocation. If there are no input
     * parameters then this will return a GVariant with 0 children rather than NULL.
     * @return A {@link org.gtk.glib.Variant} tuple. Do not unref this because it is owned by {@code invocation}.
     */
    public org.gtk.glib.Variant getParameters() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_parameters.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
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
     * If the call was GetAll, {@code null} will be returned.
     * @return a {@link DBusPropertyInfo} or {@code null}
     */
    public @Nullable org.gtk.gio.DBusPropertyInfo getPropertyInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_property_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusPropertyInfo.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the bus name that invoked the method.
     * @return A string. Do not free, it is owned by {@code invocation}.
     */
    public java.lang.String getSender() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_sender.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code user_data} {@code gpointer} passed to g_dbus_connection_register_object().
     * @return A {@code gpointer}.
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_method_invocation_get_user_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param errorName A valid D-Bus error name.
     * @param errorMessage A valid D-Bus error message.
     */
    public void returnDbusError(java.lang.String errorName, java.lang.String errorMessage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_method_invocation_return_dbus_error.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(errorName, SCOPE),
                        Marshal.stringToAddress.marshal(errorMessage, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            this.yieldOwnership();
        }
    }
    
    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <p>
     * See g_dbus_error_encode_gerror() for details about what error name
     * will be returned on the wire. In a nutshell, if the given error is
     * registered using g_dbus_error_register_error() the name given
     * during registration is used. Otherwise, a name of the form
     * {@code org.gtk.GDBus.UnmappedGError.Quark...} is used. This provides
     * transparent mapping of {@link org.gtk.glib.Error} between applications using GDBus.
     * <p>
     * If you are writing an application intended to be portable,
     * always register errors with g_dbus_error_register_error()
     * or use g_dbus_method_invocation_return_dbus_error().
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * <p>
     * Since 2.48, if the method call requested for a reply not to be sent
     * then this call will free {@code invocation} but otherwise do nothing (as per
     * the recommendations of the D-Bus specification).
     * @param domain A {@link org.gtk.glib.Quark} for the {@link org.gtk.glib.Error} error domain.
     * @param code The error code.
     * @param format printf()-style format.
     * @param varargs Parameters for {@code format}.
     */
    public void returnError(org.gtk.glib.Quark domain, int code, java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_method_invocation_return_error.invokeExact(
                        handle(),
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            this.yieldOwnership();
        }
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param domain A {@link org.gtk.glib.Quark} for the {@link org.gtk.glib.Error} error domain.
     * @param code The error code.
     * @param message The error message.
     */
    public void returnErrorLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_method_invocation_return_error_literal.invokeExact(
                        handle(),
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(message, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            this.yieldOwnership();
        }
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but intended for
     * language bindings.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param domain A {@link org.gtk.glib.Quark} for the {@link org.gtk.glib.Error} error domain.
     * @param code The error code.
     * @param format printf()-style format.
     * @param varArgs {@code va_list} of parameters for {@code format}.
     */
    public void returnErrorValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList varArgs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_method_invocation_return_error_valist.invokeExact(
                        handle(),
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varArgs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            this.yieldOwnership();
        }
    }
    
    /**
     * Like g_dbus_method_invocation_return_error() but takes a {@link org.gtk.glib.Error}
     * instead of the error domain, error code and message.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param error A {@link org.gtk.glib.Error}.
     */
    public void returnGerror(org.gtk.glib.Error error) {
        try {
            DowncallHandles.g_dbus_method_invocation_return_gerror.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Finishes handling a D-Bus method call by returning {@code parameters}.
     * If the {@code parameters} GVariant is floating, it is consumed.
     * <p>
     * It is an error if {@code parameters} is not of the right format: it must be a tuple
     * containing the out-parameters of the D-Bus method. Even if the method has a
     * single out-parameter, it must be contained in a tuple. If the method has no
     * out-parameters, {@code parameters} may be {@code null} or an empty tuple.
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
     * @param parameters A {@link org.gtk.glib.Variant} tuple with out parameters for the method or {@code null} if not passing any parameters.
     */
    public void returnValue(@Nullable org.gtk.glib.Variant parameters) {
        try {
            DowncallHandles.g_dbus_method_invocation_return_value.invokeExact(
                    handle(),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Like g_dbus_method_invocation_return_value() but also takes a {@link UnixFDList}.
     * <p>
     * This method is only available on UNIX.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param parameters A {@link org.gtk.glib.Variant} tuple with out parameters for the method or {@code null} if not passing any parameters.
     * @param fdList A {@link UnixFDList} or {@code null}.
     */
    public void returnValueWithUnixFdList(@Nullable org.gtk.glib.Variant parameters, @Nullable org.gtk.gio.UnixFDList fdList) {
        try {
            DowncallHandles.g_dbus_method_invocation_return_value_with_unix_fd_list.invokeExact(
                    handle(),
                    (Addressable) (parameters == null ? MemoryAddress.NULL : parameters.handle()),
                    (Addressable) (fdList == null ? MemoryAddress.NULL : fdList.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Like g_dbus_method_invocation_return_gerror() but takes ownership
     * of {@code error} so the caller does not need to free it.
     * <p>
     * This method will take ownership of {@code invocation}. See
     * {@link DBusInterfaceVTable} for more information about the ownership of
     * {@code invocation}.
     * @param error A {@link org.gtk.glib.Error}.
     */
    public void takeError(org.gtk.glib.Error error) {
        try {
            DowncallHandles.g_dbus_method_invocation_take_error.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        error.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_method_invocation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DBusMethodInvocation.Builder} object constructs a {@link DBusMethodInvocation} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusMethodInvocation.Builder#build()}. 
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
         * Finish building the {@link DBusMethodInvocation} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusMethodInvocation}.
         * @return A new instance of {@code DBusMethodInvocation} with the properties 
         *         that were set in the Builder object.
         */
        public DBusMethodInvocation build() {
            return (DBusMethodInvocation) org.gtk.gobject.GObject.newWithProperties(
                DBusMethodInvocation.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_method_invocation_get_connection = Interop.downcallHandle(
                "g_dbus_method_invocation_get_connection",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_interface_name = Interop.downcallHandle(
                "g_dbus_method_invocation_get_interface_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_message = Interop.downcallHandle(
                "g_dbus_method_invocation_get_message",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_method_info = Interop.downcallHandle(
                "g_dbus_method_invocation_get_method_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_method_name = Interop.downcallHandle(
                "g_dbus_method_invocation_get_method_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_object_path = Interop.downcallHandle(
                "g_dbus_method_invocation_get_object_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_parameters = Interop.downcallHandle(
                "g_dbus_method_invocation_get_parameters",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_property_info = Interop.downcallHandle(
                "g_dbus_method_invocation_get_property_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_sender = Interop.downcallHandle(
                "g_dbus_method_invocation_get_sender",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_user_data = Interop.downcallHandle(
                "g_dbus_method_invocation_get_user_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_dbus_error = Interop.downcallHandle(
                "g_dbus_method_invocation_return_dbus_error",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_error = Interop.downcallHandle(
                "g_dbus_method_invocation_return_error",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_error_literal = Interop.downcallHandle(
                "g_dbus_method_invocation_return_error_literal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_error_valist = Interop.downcallHandle(
                "g_dbus_method_invocation_return_error_valist",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_gerror = Interop.downcallHandle(
                "g_dbus_method_invocation_return_gerror",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_value = Interop.downcallHandle(
                "g_dbus_method_invocation_return_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_return_value_with_unix_fd_list = Interop.downcallHandle(
                "g_dbus_method_invocation_return_value_with_unix_fd_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_take_error = Interop.downcallHandle(
                "g_dbus_method_invocation_take_error",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_method_invocation_get_type = Interop.downcallHandle(
                "g_dbus_method_invocation_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_method_invocation_get_type != null;
    }
}
