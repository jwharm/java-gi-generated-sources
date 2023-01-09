package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for the {@code G_DBUS_ERROR} error domain.
 * @version 2.26
 */
public enum DBusError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * A generic error; "something went wrong" - see the error message for
     * more.
     */
    FAILED(0),
    
    /**
     * There was not enough memory to complete an operation.
     */
    NO_MEMORY(1),
    
    /**
     * The bus doesn't know how to launch a service to supply the bus name
     * you wanted.
     */
    SERVICE_UNKNOWN(2),
    
    /**
     * The bus name you referenced doesn't exist (i.e. no application owns
     * it).
     */
    NAME_HAS_NO_OWNER(3),
    
    /**
     * No reply to a message expecting one, usually means a timeout occurred.
     */
    NO_REPLY(4),
    
    /**
     * Something went wrong reading or writing to a socket, for example.
     */
    IO_ERROR(5),
    
    /**
     * A D-Bus bus address was malformed.
     */
    BAD_ADDRESS(6),
    
    /**
     * Requested operation isn't supported (like ENOSYS on UNIX).
     */
    NOT_SUPPORTED(7),
    
    /**
     * Some limited resource is exhausted.
     */
    LIMITS_EXCEEDED(8),
    
    /**
     * Security restrictions don't allow doing what you're trying to do.
     */
    ACCESS_DENIED(9),
    
    /**
     * Authentication didn't work.
     */
    AUTH_FAILED(10),
    
    /**
     * Unable to connect to server (probably caused by ECONNREFUSED on a
     * socket).
     */
    NO_SERVER(11),
    
    /**
     * Certain timeout errors, possibly ETIMEDOUT on a socket.  Note that
     * {@link DBusError#NO_REPLY} is used for message reply timeouts. Warning:
     * this is confusingly-named given that {@link DBusError#TIMED_OUT} also
     * exists. We can't fix it for compatibility reasons so just be
     * careful.
     */
    TIMEOUT(12),
    
    /**
     * No network access (probably ENETUNREACH on a socket).
     */
    NO_NETWORK(13),
    
    /**
     * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
     */
    ADDRESS_IN_USE(14),
    
    /**
     * The connection is disconnected and you're trying to use it.
     */
    DISCONNECTED(15),
    
    /**
     * Invalid arguments passed to a method call.
     */
    INVALID_ARGS(16),
    
    /**
     * Missing file.
     */
    FILE_NOT_FOUND(17),
    
    /**
     * Existing file and the operation you're using does not silently overwrite.
     */
    FILE_EXISTS(18),
    
    /**
     * Method name you invoked isn't known by the object you invoked it on.
     */
    UNKNOWN_METHOD(19),
    
    /**
     * Certain timeout errors, e.g. while starting a service. Warning: this is
     * confusingly-named given that {@link DBusError#TIMEOUT} also exists. We
     * can't fix it for compatibility reasons so just be careful.
     */
    TIMED_OUT(20),
    
    /**
     * Tried to remove or modify a match rule that didn't exist.
     */
    MATCH_RULE_NOT_FOUND(21),
    
    /**
     * The match rule isn't syntactically valid.
     */
    MATCH_RULE_INVALID(22),
    
    /**
     * While starting a new process, the exec() call failed.
     */
    SPAWN_EXEC_FAILED(23),
    
    /**
     * While starting a new process, the fork() call failed.
     */
    SPAWN_FORK_FAILED(24),
    
    /**
     * While starting a new process, the child exited with a status code.
     */
    SPAWN_CHILD_EXITED(25),
    
    /**
     * While starting a new process, the child exited on a signal.
     */
    SPAWN_CHILD_SIGNALED(26),
    
    /**
     * While starting a new process, something went wrong.
     */
    SPAWN_FAILED(27),
    
    /**
     * We failed to setup the environment correctly.
     */
    SPAWN_SETUP_FAILED(28),
    
    /**
     * We failed to setup the config parser correctly.
     */
    SPAWN_CONFIG_INVALID(29),
    
    /**
     * Bus name was not valid.
     */
    SPAWN_SERVICE_INVALID(30),
    
    /**
     * Service file not found in system-services directory.
     */
    SPAWN_SERVICE_NOT_FOUND(31),
    
    /**
     * Permissions are incorrect on the setuid helper.
     */
    SPAWN_PERMISSIONS_INVALID(32),
    
    /**
     * Service file invalid (Name, User or Exec missing).
     */
    SPAWN_FILE_INVALID(33),
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    SPAWN_NO_MEMORY(34),
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    UNIX_PROCESS_ID_UNKNOWN(35),
    
    /**
     * A type signature is not valid.
     */
    INVALID_SIGNATURE(36),
    
    /**
     * A file contains invalid syntax or is otherwise broken.
     */
    INVALID_FILE_CONTENT(37),
    
    /**
     * Asked for SELinux security context and it wasn't available.
     */
    SELINUX_SECURITY_CONTEXT_UNKNOWN(38),
    
    /**
     * Asked for ADT audit data and it wasn't available.
     */
    ADT_AUDIT_DATA_UNKNOWN(39),
    
    /**
     * There's already an object with the requested object path.
     */
    OBJECT_PATH_IN_USE(40),
    
    /**
     * Object you invoked a method on isn't known. Since 2.42
     */
    UNKNOWN_OBJECT(41),
    
    /**
     * Interface you invoked a method on isn't known by the object. Since 2.42
     */
    UNKNOWN_INTERFACE(42),
    
    /**
     * Property you tried to access isn't known by the object. Since 2.42
     */
    UNKNOWN_PROPERTY(43),
    
    /**
     * Property you tried to set is read-only. Since 2.42
     */
    PROPERTY_READ_ONLY(44);
    
    private static final java.lang.String C_TYPE_NAME = "GDBusError";
    
    private final int value;
    
    /**
     * Create a new DBusError for the provided value
     * @param numeric value the enum value
     */
    DBusError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new DBusError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DBusError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> NO_MEMORY;
            case 2 -> SERVICE_UNKNOWN;
            case 3 -> NAME_HAS_NO_OWNER;
            case 4 -> NO_REPLY;
            case 5 -> IO_ERROR;
            case 6 -> BAD_ADDRESS;
            case 7 -> NOT_SUPPORTED;
            case 8 -> LIMITS_EXCEEDED;
            case 9 -> ACCESS_DENIED;
            case 10 -> AUTH_FAILED;
            case 11 -> NO_SERVER;
            case 12 -> TIMEOUT;
            case 13 -> NO_NETWORK;
            case 14 -> ADDRESS_IN_USE;
            case 15 -> DISCONNECTED;
            case 16 -> INVALID_ARGS;
            case 17 -> FILE_NOT_FOUND;
            case 18 -> FILE_EXISTS;
            case 19 -> UNKNOWN_METHOD;
            case 20 -> TIMED_OUT;
            case 21 -> MATCH_RULE_NOT_FOUND;
            case 22 -> MATCH_RULE_INVALID;
            case 23 -> SPAWN_EXEC_FAILED;
            case 24 -> SPAWN_FORK_FAILED;
            case 25 -> SPAWN_CHILD_EXITED;
            case 26 -> SPAWN_CHILD_SIGNALED;
            case 27 -> SPAWN_FAILED;
            case 28 -> SPAWN_SETUP_FAILED;
            case 29 -> SPAWN_CONFIG_INVALID;
            case 30 -> SPAWN_SERVICE_INVALID;
            case 31 -> SPAWN_SERVICE_NOT_FOUND;
            case 32 -> SPAWN_PERMISSIONS_INVALID;
            case 33 -> SPAWN_FILE_INVALID;
            case 34 -> SPAWN_NO_MEMORY;
            case 35 -> UNIX_PROCESS_ID_UNKNOWN;
            case 36 -> INVALID_SIGNATURE;
            case 37 -> INVALID_FILE_CONTENT;
            case 38 -> SELINUX_SECURITY_CONTEXT_UNKNOWN;
            case 39 -> ADT_AUDIT_DATA_UNKNOWN;
            case 40 -> OBJECT_PATH_IN_USE;
            case 41 -> UNKNOWN_OBJECT;
            case 42 -> UNKNOWN_INTERFACE;
            case 43 -> UNKNOWN_PROPERTY;
            case 44 -> PROPERTY_READ_ONLY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Creates a D-Bus error name to use for {@code error}. If {@code error} matches
     * a registered error (cf. g_dbus_error_register_error()), the corresponding
     * D-Bus error name will be returned.
     * <p>
     * Otherwise the a name of the form
     * {@code org.gtk.GDBus.UnmappedGError.Quark._ESCAPED_QUARK_NAME.Code_ERROR_CODE}
     * will be used. This allows other GDBus applications to map the error
     * on the wire back to a {@link org.gtk.glib.Error} using g_dbus_error_new_for_dbus_error().
     * <p>
     * This function is typically only used in object mappings to put a
     * {@link org.gtk.glib.Error} on the wire. Regular applications should not use it.
     * @param error A {@link org.gtk.glib.Error}.
     * @return A D-Bus error name (never {@code null}).
     *     Free with g_free().
     */
    public static java.lang.String encodeGerror(org.gtk.glib.Error error) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_encode_gerror.invokeExact(error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the D-Bus error name used for {@code error}, if any.
     * <p>
     * This function is guaranteed to return a D-Bus error name for all
     * {@code GErrors} returned from functions handling remote method calls
     * (e.g. g_dbus_connection_call_finish()) unless
     * g_dbus_error_strip_remote_error() has been used on {@code error}.
     * @param error a {@link org.gtk.glib.Error}
     * @return an allocated string or {@code null} if the
     *     D-Bus error name could not be found. Free with g_free().
     */
    public static @Nullable java.lang.String getRemoteError(org.gtk.glib.Error error) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_get_remote_error.invokeExact(error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks if {@code error} represents an error received via D-Bus from a remote peer. If so,
     * use g_dbus_error_get_remote_error() to get the name of the error.
     * @param error A {@link org.gtk.glib.Error}.
     * @return {@code true} if {@code error} represents an error from a remote peer,
     * {@code false} otherwise.
     */
    public static boolean isRemoteError(org.gtk.glib.Error error) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_is_remote_error.invokeExact(error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a {@link org.gtk.glib.Error} based on the contents of {@code dbus_error_name} and
     * {@code dbus_error_message}.
     * <p>
     * Errors registered with g_dbus_error_register_error() will be looked
     * up using {@code dbus_error_name} and if a match is found, the error domain
     * and code is used. Applications can use g_dbus_error_get_remote_error()
     * to recover {@code dbus_error_name}.
     * <p>
     * If a match against a registered error is not found and the D-Bus
     * error name is in a form as returned by g_dbus_error_encode_gerror()
     * the error domain and code encoded in the name is used to
     * create the {@link org.gtk.glib.Error}. Also, {@code dbus_error_name} is added to the error message
     * such that it can be recovered with g_dbus_error_get_remote_error().
     * <p>
     * Otherwise, a {@link org.gtk.glib.Error} with the error code {@link IOErrorEnum#DBUS_ERROR}
     * in the {@code G_IO_ERROR} error domain is returned. Also, {@code dbus_error_name} is
     * added to the error message such that it can be recovered with
     * g_dbus_error_get_remote_error().
     * <p>
     * In all three cases, {@code dbus_error_name} can always be recovered from the
     * returned {@link org.gtk.glib.Error} using the g_dbus_error_get_remote_error() function
     * (unless g_dbus_error_strip_remote_error() hasn't been used on the returned error).
     * <p>
     * This function is typically only used in object mappings to prepare
     * {@link org.gtk.glib.Error} instances for applications. Regular applications should not use
     * it.
     * @param dbusErrorName D-Bus error name.
     * @param dbusErrorMessage D-Bus error message.
     * @return An allocated {@link org.gtk.glib.Error}. Free with g_error_free().
     */
    public static org.gtk.glib.Error newForDbusError(java.lang.String dbusErrorName, java.lang.String dbusErrorMessage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_new_for_dbus_error.invokeExact(
                        Marshal.stringToAddress.marshal(dbusErrorName, SCOPE),
                        Marshal.stringToAddress.marshal(dbusErrorMessage, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Error.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Creates an association to map between {@code dbus_error_name} and
     * {@code GErrors} specified by {@code error_domain} and {@code error_code}.
     * <p>
     * This is typically done in the routine that returns the {@link org.gtk.glib.Quark} for
     * an error domain.
     * @param errorDomain A {@link org.gtk.glib.Quark} for an error domain.
     * @param errorCode An error code.
     * @param dbusErrorName A D-Bus error name.
     * @return {@code true} if the association was created, {@code false} if it already
     * exists.
     */
    public static boolean registerError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_dbus_error_register_error.invokeExact(
                        errorDomain.getValue().intValue(),
                        errorCode,
                        Marshal.stringToAddress.marshal(dbusErrorName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Helper function for associating a {@link org.gtk.glib.Error} error domain with D-Bus error names.
     * <p>
     * While {@code quark_volatile} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     * @param errorDomainQuarkName The error domain name.
     * @param quarkVolatile A pointer where to store the {@link org.gtk.glib.Quark}.
     * @param entries A pointer to {@code num_entries} {@link DBusErrorEntry} struct items.
     * @param numEntries Number of items to register.
     */
    public static void registerErrorDomain(java.lang.String errorDomainQuarkName, PointerLong quarkVolatile, org.gtk.gio.DBusErrorEntry[] entries, int numEntries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_error_register_error_domain.invokeExact(
                        Marshal.stringToAddress.marshal(errorDomainQuarkName, SCOPE),
                        quarkVolatile.handle(),
                        Interop.allocateNativeArray(entries, org.gtk.gio.DBusErrorEntry.getMemoryLayout(), false, SCOPE),
                        numEntries);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Does nothing if {@code error} is {@code null}. Otherwise sets *{@code error} to
     * a new {@link org.gtk.glib.Error} created with g_dbus_error_new_for_dbus_error()
     * with {@code dbus_error_message} prepend with {@code format} (unless {@code null}).
     * @param error A pointer to a {@link org.gtk.glib.Error} or {@code null}.
     * @param dbusErrorName D-Bus error name.
     * @param dbusErrorMessage D-Bus error message.
     * @param format printf()-style format to prepend to {@code dbus_error_message} or {@code null}.
     * @param varargs Arguments for {@code format}.
     */
    public static void setDbusError(PointerProxy<org.gtk.glib.Error> error, java.lang.String dbusErrorName, java.lang.String dbusErrorMessage, @Nullable java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_error_set_dbus_error.invokeExact(
                        error.handle(),
                        Marshal.stringToAddress.marshal(dbusErrorName, SCOPE),
                        Marshal.stringToAddress.marshal(dbusErrorMessage, SCOPE),
                        (Addressable) (format == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(format, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Like g_dbus_error_set_dbus_error() but intended for language bindings.
     * @param error A pointer to a {@link org.gtk.glib.Error} or {@code null}.
     * @param dbusErrorName D-Bus error name.
     * @param dbusErrorMessage D-Bus error message.
     * @param format printf()-style format to prepend to {@code dbus_error_message} or {@code null}.
     * @param varArgs Arguments for {@code format}.
     */
    public static void setDbusErrorValist(PointerProxy<org.gtk.glib.Error> error, java.lang.String dbusErrorName, java.lang.String dbusErrorMessage, @Nullable java.lang.String format, VaList varArgs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_dbus_error_set_dbus_error_valist.invokeExact(
                        error.handle(),
                        Marshal.stringToAddress.marshal(dbusErrorName, SCOPE),
                        Marshal.stringToAddress.marshal(dbusErrorMessage, SCOPE),
                        (Addressable) (format == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(format, SCOPE)),
                        varArgs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Looks for extra information in the error message used to recover
     * the D-Bus error name and strips it if found. If stripped, the
     * message field in {@code error} will correspond exactly to what was
     * received on the wire.
     * <p>
     * This is typically used when presenting errors to the end user.
     * @param error A {@link org.gtk.glib.Error}.
     * @return {@code true} if information was stripped, {@code false} otherwise.
     */
    public static boolean stripRemoteError(org.gtk.glib.Error error) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_strip_remote_error.invokeExact(error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Destroys an association previously set up with g_dbus_error_register_error().
     * @param errorDomain A {@link org.gtk.glib.Quark} for an error domain.
     * @param errorCode An error code.
     * @param dbusErrorName A D-Bus error name.
     * @return {@code true} if the association was destroyed, {@code false} if it wasn't found.
     */
    public static boolean unregisterError(org.gtk.glib.Quark errorDomain, int errorCode, java.lang.String dbusErrorName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_dbus_error_unregister_error.invokeExact(
                        errorDomain.getValue().intValue(),
                        errorCode,
                        Marshal.stringToAddress.marshal(dbusErrorName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_error_encode_gerror = Interop.downcallHandle(
                "g_dbus_error_encode_gerror",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_get_remote_error = Interop.downcallHandle(
                "g_dbus_error_get_remote_error",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_is_remote_error = Interop.downcallHandle(
                "g_dbus_error_is_remote_error",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_new_for_dbus_error = Interop.downcallHandle(
                "g_dbus_error_new_for_dbus_error",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_quark = Interop.downcallHandle(
                "g_dbus_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_dbus_error_register_error = Interop.downcallHandle(
                "g_dbus_error_register_error",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_register_error_domain = Interop.downcallHandle(
                "g_dbus_error_register_error_domain",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_dbus_error_set_dbus_error = Interop.downcallHandle(
                "g_dbus_error_set_dbus_error",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_dbus_error_set_dbus_error_valist = Interop.downcallHandle(
                "g_dbus_error_set_dbus_error_valist",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_strip_remote_error = Interop.downcallHandle(
                "g_dbus_error_strip_remote_error",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_error_unregister_error = Interop.downcallHandle(
                "g_dbus_error_unregister_error",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
