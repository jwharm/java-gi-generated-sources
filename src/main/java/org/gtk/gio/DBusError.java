package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for the {@code G_DBUS_ERROR} error domain.
 * @version 2.26
 */
public class DBusError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusError";
    
    /**
     * A generic error; "something went wrong" - see the error message for
     * more.
     */
    public static final DBusError FAILED = new DBusError(0);
    
    /**
     * There was not enough memory to complete an operation.
     */
    public static final DBusError NO_MEMORY = new DBusError(1);
    
    /**
     * The bus doesn't know how to launch a service to supply the bus name
     * you wanted.
     */
    public static final DBusError SERVICE_UNKNOWN = new DBusError(2);
    
    /**
     * The bus name you referenced doesn't exist (i.e. no application owns
     * it).
     */
    public static final DBusError NAME_HAS_NO_OWNER = new DBusError(3);
    
    /**
     * No reply to a message expecting one, usually means a timeout occurred.
     */
    public static final DBusError NO_REPLY = new DBusError(4);
    
    /**
     * Something went wrong reading or writing to a socket, for example.
     */
    public static final DBusError IO_ERROR = new DBusError(5);
    
    /**
     * A D-Bus bus address was malformed.
     */
    public static final DBusError BAD_ADDRESS = new DBusError(6);
    
    /**
     * Requested operation isn't supported (like ENOSYS on UNIX).
     */
    public static final DBusError NOT_SUPPORTED = new DBusError(7);
    
    /**
     * Some limited resource is exhausted.
     */
    public static final DBusError LIMITS_EXCEEDED = new DBusError(8);
    
    /**
     * Security restrictions don't allow doing what you're trying to do.
     */
    public static final DBusError ACCESS_DENIED = new DBusError(9);
    
    /**
     * Authentication didn't work.
     */
    public static final DBusError AUTH_FAILED = new DBusError(10);
    
    /**
     * Unable to connect to server (probably caused by ECONNREFUSED on a
     * socket).
     */
    public static final DBusError NO_SERVER = new DBusError(11);
    
    /**
     * Certain timeout errors, possibly ETIMEDOUT on a socket.  Note that
     * {@link DBusError#NO_REPLY} is used for message reply timeouts. Warning:
     * this is confusingly-named given that {@link DBusError#TIMED_OUT} also
     * exists. We can't fix it for compatibility reasons so just be
     * careful.
     */
    public static final DBusError TIMEOUT = new DBusError(12);
    
    /**
     * No network access (probably ENETUNREACH on a socket).
     */
    public static final DBusError NO_NETWORK = new DBusError(13);
    
    /**
     * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
     */
    public static final DBusError ADDRESS_IN_USE = new DBusError(14);
    
    /**
     * The connection is disconnected and you're trying to use it.
     */
    public static final DBusError DISCONNECTED = new DBusError(15);
    
    /**
     * Invalid arguments passed to a method call.
     */
    public static final DBusError INVALID_ARGS = new DBusError(16);
    
    /**
     * Missing file.
     */
    public static final DBusError FILE_NOT_FOUND = new DBusError(17);
    
    /**
     * Existing file and the operation you're using does not silently overwrite.
     */
    public static final DBusError FILE_EXISTS = new DBusError(18);
    
    /**
     * Method name you invoked isn't known by the object you invoked it on.
     */
    public static final DBusError UNKNOWN_METHOD = new DBusError(19);
    
    /**
     * Certain timeout errors, e.g. while starting a service. Warning: this is
     * confusingly-named given that {@link DBusError#TIMEOUT} also exists. We
     * can't fix it for compatibility reasons so just be careful.
     */
    public static final DBusError TIMED_OUT = new DBusError(20);
    
    /**
     * Tried to remove or modify a match rule that didn't exist.
     */
    public static final DBusError MATCH_RULE_NOT_FOUND = new DBusError(21);
    
    /**
     * The match rule isn't syntactically valid.
     */
    public static final DBusError MATCH_RULE_INVALID = new DBusError(22);
    
    /**
     * While starting a new process, the exec() call failed.
     */
    public static final DBusError SPAWN_EXEC_FAILED = new DBusError(23);
    
    /**
     * While starting a new process, the fork() call failed.
     */
    public static final DBusError SPAWN_FORK_FAILED = new DBusError(24);
    
    /**
     * While starting a new process, the child exited with a status code.
     */
    public static final DBusError SPAWN_CHILD_EXITED = new DBusError(25);
    
    /**
     * While starting a new process, the child exited on a signal.
     */
    public static final DBusError SPAWN_CHILD_SIGNALED = new DBusError(26);
    
    /**
     * While starting a new process, something went wrong.
     */
    public static final DBusError SPAWN_FAILED = new DBusError(27);
    
    /**
     * We failed to setup the environment correctly.
     */
    public static final DBusError SPAWN_SETUP_FAILED = new DBusError(28);
    
    /**
     * We failed to setup the config parser correctly.
     */
    public static final DBusError SPAWN_CONFIG_INVALID = new DBusError(29);
    
    /**
     * Bus name was not valid.
     */
    public static final DBusError SPAWN_SERVICE_INVALID = new DBusError(30);
    
    /**
     * Service file not found in system-services directory.
     */
    public static final DBusError SPAWN_SERVICE_NOT_FOUND = new DBusError(31);
    
    /**
     * Permissions are incorrect on the setuid helper.
     */
    public static final DBusError SPAWN_PERMISSIONS_INVALID = new DBusError(32);
    
    /**
     * Service file invalid (Name, User or Exec missing).
     */
    public static final DBusError SPAWN_FILE_INVALID = new DBusError(33);
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    public static final DBusError SPAWN_NO_MEMORY = new DBusError(34);
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    public static final DBusError UNIX_PROCESS_ID_UNKNOWN = new DBusError(35);
    
    /**
     * A type signature is not valid.
     */
    public static final DBusError INVALID_SIGNATURE = new DBusError(36);
    
    /**
     * A file contains invalid syntax or is otherwise broken.
     */
    public static final DBusError INVALID_FILE_CONTENT = new DBusError(37);
    
    /**
     * Asked for SELinux security context and it wasn't available.
     */
    public static final DBusError SELINUX_SECURITY_CONTEXT_UNKNOWN = new DBusError(38);
    
    /**
     * Asked for ADT audit data and it wasn't available.
     */
    public static final DBusError ADT_AUDIT_DATA_UNKNOWN = new DBusError(39);
    
    /**
     * There's already an object with the requested object path.
     */
    public static final DBusError OBJECT_PATH_IN_USE = new DBusError(40);
    
    /**
     * Object you invoked a method on isn't known. Since 2.42
     */
    public static final DBusError UNKNOWN_OBJECT = new DBusError(41);
    
    /**
     * Interface you invoked a method on isn't known by the object. Since 2.42
     */
    public static final DBusError UNKNOWN_INTERFACE = new DBusError(42);
    
    /**
     * Property you tried to access isn't known by the object. Since 2.42
     */
    public static final DBusError UNKNOWN_PROPERTY = new DBusError(43);
    
    /**
     * Property you tried to set is read-only. Since 2.42
     */
    public static final DBusError PROPERTY_READ_ONLY = new DBusError(44);
    
    public DBusError(int value) {
        super(value);
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
    public static @NotNull java.lang.String encodeGerror(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_encode_gerror.invokeExact(
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public static @Nullable java.lang.String getRemoteError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_get_remote_error.invokeExact(
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if {@code error} represents an error received via D-Bus from a remote peer. If so,
     * use g_dbus_error_get_remote_error() to get the name of the error.
     * @param error A {@link org.gtk.glib.Error}.
     * @return {@code true} if {@code error} represents an error from a remote peer,
     * {@code false} otherwise.
     */
    public static boolean isRemoteError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_is_remote_error.invokeExact(
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public static @NotNull org.gtk.glib.Error newForDbusError(@NotNull java.lang.String dbusErrorName, @NotNull java.lang.String dbusErrorMessage) {
        java.util.Objects.requireNonNull(dbusErrorName, "Parameter 'dbusErrorName' must not be null");
        java.util.Objects.requireNonNull(dbusErrorMessage, "Parameter 'dbusErrorMessage' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_error_new_for_dbus_error.invokeExact(
                    Interop.allocateNativeString(dbusErrorName),
                    Interop.allocateNativeString(dbusErrorMessage));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
    public static boolean registerError(@NotNull org.gtk.glib.Quark errorDomain, int errorCode, @NotNull java.lang.String dbusErrorName) {
        java.util.Objects.requireNonNull(errorDomain, "Parameter 'errorDomain' must not be null");
        java.util.Objects.requireNonNull(dbusErrorName, "Parameter 'dbusErrorName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_register_error.invokeExact(
                    errorDomain.getValue().intValue(),
                    errorCode,
                    Interop.allocateNativeString(dbusErrorName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public static void registerErrorDomain(@NotNull java.lang.String errorDomainQuarkName, PointerLong quarkVolatile, @NotNull org.gtk.gio.DBusErrorEntry[] entries, int numEntries) {
        java.util.Objects.requireNonNull(errorDomainQuarkName, "Parameter 'errorDomainQuarkName' must not be null");
        java.util.Objects.requireNonNull(quarkVolatile, "Parameter 'quarkVolatile' must not be null");
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_dbus_error_register_error_domain.invokeExact(
                    Interop.allocateNativeString(errorDomainQuarkName),
                    quarkVolatile.handle(),
                    Interop.allocateNativeArray(entries, org.gtk.gio.DBusErrorEntry.getMemoryLayout(), false),
                    numEntries);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static void setDbusError(@NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String dbusErrorName, @NotNull java.lang.String dbusErrorMessage, @Nullable java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(dbusErrorName, "Parameter 'dbusErrorName' must not be null");
        java.util.Objects.requireNonNull(dbusErrorMessage, "Parameter 'dbusErrorMessage' must not be null");
        try {
            DowncallHandles.g_dbus_error_set_dbus_error.invokeExact(
                    error.handle(),
                    Interop.allocateNativeString(dbusErrorName),
                    Interop.allocateNativeString(dbusErrorMessage),
                    (Addressable) (format == null ? MemoryAddress.NULL : Interop.allocateNativeString(format)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static void setDbusErrorValist(@NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String dbusErrorName, @NotNull java.lang.String dbusErrorMessage, @Nullable java.lang.String format, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(dbusErrorName, "Parameter 'dbusErrorName' must not be null");
        java.util.Objects.requireNonNull(dbusErrorMessage, "Parameter 'dbusErrorMessage' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.g_dbus_error_set_dbus_error_valist.invokeExact(
                    error.handle(),
                    Interop.allocateNativeString(dbusErrorName),
                    Interop.allocateNativeString(dbusErrorMessage),
                    (Addressable) (format == null ? MemoryAddress.NULL : Interop.allocateNativeString(format)),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public static boolean stripRemoteError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_strip_remote_error.invokeExact(
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Destroys an association previously set up with g_dbus_error_register_error().
     * @param errorDomain A {@link org.gtk.glib.Quark} for an error domain.
     * @param errorCode An error code.
     * @param dbusErrorName A D-Bus error name.
     * @return {@code true} if the association was destroyed, {@code false} if it wasn't found.
     */
    public static boolean unregisterError(@NotNull org.gtk.glib.Quark errorDomain, int errorCode, @NotNull java.lang.String dbusErrorName) {
        java.util.Objects.requireNonNull(errorDomain, "Parameter 'errorDomain' must not be null");
        java.util.Objects.requireNonNull(dbusErrorName, "Parameter 'dbusErrorName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_error_unregister_error.invokeExact(
                    errorDomain.getValue().intValue(),
                    errorCode,
                    Interop.allocateNativeString(dbusErrorName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
