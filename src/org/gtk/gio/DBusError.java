package org.gtk.gio;

/**
 * Error codes for the %G_DBUS_ERROR error domain.
 */
public enum DBusError {

    /**
     * A generic error; "something went wrong" - see the error message for
     * more.
     */
    FAILED,
    
    /**
     * There was not enough memory to complete an operation.
     */
    NO_MEMORY,
    
    /**
     * The bus doesn't know how to launch a service to supply the bus name
     * you wanted.
     */
    SERVICE_UNKNOWN,
    
    /**
     * The bus name you referenced doesn't exist (i.e. no application owns
     * it).
     */
    NAME_HAS_NO_OWNER,
    
    /**
     * No reply to a message expecting one, usually means a timeout occurred.
     */
    NO_REPLY,
    
    /**
     * Something went wrong reading or writing to a socket, for example.
     */
    IO_ERROR,
    
    /**
     * A D-Bus bus address was malformed.
     */
    BAD_ADDRESS,
    
    /**
     * Requested operation isn't supported (like ENOSYS on UNIX).
     */
    NOT_SUPPORTED,
    
    /**
     * Some limited resource is exhausted.
     */
    LIMITS_EXCEEDED,
    
    /**
     * Security restrictions don't allow doing what you're trying to do.
     */
    ACCESS_DENIED,
    
    /**
     * Authentication didn't work.
     */
    AUTH_FAILED,
    
    /**
     * Unable to connect to server (probably caused by ECONNREFUSED on a
     * socket).
     */
    NO_SERVER,
    
    /**
     * Certain timeout errors, possibly ETIMEDOUT on a socket.  Note that
     * %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning:
     * this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also
     * exists. We can't fix it for compatibility reasons so just be
     * careful.
     */
    TIMEOUT,
    
    /**
     * No network access (probably ENETUNREACH on a socket).
     */
    NO_NETWORK,
    
    /**
     * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
     */
    ADDRESS_IN_USE,
    
    /**
     * The connection is disconnected and you're trying to use it.
     */
    DISCONNECTED,
    
    /**
     * Invalid arguments passed to a method call.
     */
    INVALID_ARGS,
    
    /**
     * Missing file.
     */
    FILE_NOT_FOUND,
    
    /**
     * Existing file and the operation you're using does not silently overwrite.
     */
    FILE_EXISTS,
    
    /**
     * Method name you invoked isn't known by the object you invoked it on.
     */
    UNKNOWN_METHOD,
    
    /**
     * Certain timeout errors, e.g. while starting a service. Warning: this is
     * confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We
     * can't fix it for compatibility reasons so just be careful.
     */
    TIMED_OUT,
    
    /**
     * Tried to remove or modify a match rule that didn't exist.
     */
    MATCH_RULE_NOT_FOUND,
    
    /**
     * The match rule isn't syntactically valid.
     */
    MATCH_RULE_INVALID,
    
    /**
     * While starting a new process, the exec() call failed.
     */
    SPAWN_EXEC_FAILED,
    
    /**
     * While starting a new process, the fork() call failed.
     */
    SPAWN_FORK_FAILED,
    
    /**
     * While starting a new process, the child exited with a status code.
     */
    SPAWN_CHILD_EXITED,
    
    /**
     * While starting a new process, the child exited on a signal.
     */
    SPAWN_CHILD_SIGNALED,
    
    /**
     * While starting a new process, something went wrong.
     */
    SPAWN_FAILED,
    
    /**
     * We failed to setup the environment correctly.
     */
    SPAWN_SETUP_FAILED,
    
    /**
     * We failed to setup the config parser correctly.
     */
    SPAWN_CONFIG_INVALID,
    
    /**
     * Bus name was not valid.
     */
    SPAWN_SERVICE_INVALID,
    
    /**
     * Service file not found in system-services directory.
     */
    SPAWN_SERVICE_NOT_FOUND,
    
    /**
     * Permissions are incorrect on the setuid helper.
     */
    SPAWN_PERMISSIONS_INVALID,
    
    /**
     * Service file invalid (Name, User or Exec missing).
     */
    SPAWN_FILE_INVALID,
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    SPAWN_NO_MEMORY,
    
    /**
     * Tried to get a UNIX process ID and it wasn't available.
     */
    UNIX_PROCESS_ID_UNKNOWN,
    
    /**
     * A type signature is not valid.
     */
    INVALID_SIGNATURE,
    
    /**
     * A file contains invalid syntax or is otherwise broken.
     */
    INVALID_FILE_CONTENT,
    
    /**
     * Asked for SELinux security context and it wasn't available.
     */
    SELINUX_SECURITY_CONTEXT_UNKNOWN,
    
    /**
     * Asked for ADT audit data and it wasn't available.
     */
    ADT_AUDIT_DATA_UNKNOWN,
    
    /**
     * There's already an object with the requested object path.
     */
    OBJECT_PATH_IN_USE,
    
    /**
     * Object you invoked a method on isn't known. Since 2.42
     */
    UNKNOWN_OBJECT,
    
    /**
     * Interface you invoked a method on isn't known by the object. Since 2.42
     */
    UNKNOWN_INTERFACE,
    
    /**
     * Property you tried to access isn't known by the object. Since 2.42
     */
    UNKNOWN_PROPERTY,
    
    /**
     * Property you tried to set is read-only. Since 2.42
     */
    PROPERTY_READ_ONLY;
    
    public static DBusError fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case NO_MEMORY -> 1;
            case SERVICE_UNKNOWN -> 2;
            case NAME_HAS_NO_OWNER -> 3;
            case NO_REPLY -> 4;
            case IO_ERROR -> 5;
            case BAD_ADDRESS -> 6;
            case NOT_SUPPORTED -> 7;
            case LIMITS_EXCEEDED -> 8;
            case ACCESS_DENIED -> 9;
            case AUTH_FAILED -> 10;
            case NO_SERVER -> 11;
            case TIMEOUT -> 12;
            case NO_NETWORK -> 13;
            case ADDRESS_IN_USE -> 14;
            case DISCONNECTED -> 15;
            case INVALID_ARGS -> 16;
            case FILE_NOT_FOUND -> 17;
            case FILE_EXISTS -> 18;
            case UNKNOWN_METHOD -> 19;
            case TIMED_OUT -> 20;
            case MATCH_RULE_NOT_FOUND -> 21;
            case MATCH_RULE_INVALID -> 22;
            case SPAWN_EXEC_FAILED -> 23;
            case SPAWN_FORK_FAILED -> 24;
            case SPAWN_CHILD_EXITED -> 25;
            case SPAWN_CHILD_SIGNALED -> 26;
            case SPAWN_FAILED -> 27;
            case SPAWN_SETUP_FAILED -> 28;
            case SPAWN_CONFIG_INVALID -> 29;
            case SPAWN_SERVICE_INVALID -> 30;
            case SPAWN_SERVICE_NOT_FOUND -> 31;
            case SPAWN_PERMISSIONS_INVALID -> 32;
            case SPAWN_FILE_INVALID -> 33;
            case SPAWN_NO_MEMORY -> 34;
            case UNIX_PROCESS_ID_UNKNOWN -> 35;
            case INVALID_SIGNATURE -> 36;
            case INVALID_FILE_CONTENT -> 37;
            case SELINUX_SECURITY_CONTEXT_UNKNOWN -> 38;
            case ADT_AUDIT_DATA_UNKNOWN -> 39;
            case OBJECT_PATH_IN_USE -> 40;
            case UNKNOWN_OBJECT -> 41;
            case UNKNOWN_INTERFACE -> 42;
            case UNKNOWN_PROPERTY -> 43;
            case PROPERTY_READ_ONLY -> 44;
        };
    }

}
