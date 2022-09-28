package org.gtk.gio;

/**
 * Error codes for the {@code G_DBUS_ERROR} error domain.
 */
public class DBusError {

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
    
    private int value;
    
    public DBusError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
