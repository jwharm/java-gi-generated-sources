package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * This {@link SocketControlMessage} contains a {@link Credentials} instance.  It
 * may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * {@link SocketFamily#UNIX} family).
 * <p>
 * For an easier way to send and receive credentials over
 * stream-oriented UNIX sockets, see
 * g_unix_connection_send_credentials() and
 * g_unix_connection_receive_credentials(). To receive credentials of
 * a foreign process connected to a socket, use
 * g_socket_get_credentials().
 * <p>
 * Since GLib 2.72, {@code GUnixCredentialMessage} is available on all platforms. It
 * requires underlying system support (such as Windows 10 with {@code AF_UNIX}) at run
 * time.
 * <p>
 * Before GLib 2.72, {@code <gio/gunixcredentialsmessage.h>} belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the {@code gio-unix-2.0.pc} pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 */
public class UnixCredentialsMessage extends SocketControlMessage {

    public UnixCredentialsMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixCredentialsMessage */
    public static UnixCredentialsMessage castFrom(org.gtk.gobject.Object gobject) {
        return new UnixCredentialsMessage(gobject.refcounted());
    }
    
    static final MethodHandle g_unix_credentials_message_new = Interop.downcallHandle(
        "g_unix_credentials_message_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_unix_credentials_message_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link UnixCredentialsMessage} with credentials matching the current processes.
     */
    public UnixCredentialsMessage() {
        super(constructNew());
    }
    
    static final MethodHandle g_unix_credentials_message_new_with_credentials = Interop.downcallHandle(
        "g_unix_credentials_message_new_with_credentials",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithCredentials(Credentials credentials) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_unix_credentials_message_new_with_credentials.invokeExact(credentials.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link UnixCredentialsMessage} holding {@code credentials}.
     */
    public static UnixCredentialsMessage newWithCredentials(Credentials credentials) {
        return new UnixCredentialsMessage(constructNewWithCredentials(credentials));
    }
    
    static final MethodHandle g_unix_credentials_message_get_credentials = Interop.downcallHandle(
        "g_unix_credentials_message_get_credentials",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the credentials stored in {@code message}.
     */
    public Credentials getCredentials() {
        try {
            var RESULT = (MemoryAddress) g_unix_credentials_message_get_credentials.invokeExact(handle());
            return new Credentials(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_credentials_message_is_supported = Interop.downcallHandle(
        "g_unix_credentials_message_is_supported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if passing {@link Credentials} on a {@link Socket} is supported on this platform.
     */
    public static boolean isSupported() {
        try {
            var RESULT = (int) g_unix_credentials_message_is_supported.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
