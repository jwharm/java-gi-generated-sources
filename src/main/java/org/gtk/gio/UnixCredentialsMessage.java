package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.26
 */
public class UnixCredentialsMessage extends org.gtk.gio.SocketControlMessage {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixCredentialsMessage";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketControlMessage.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.SocketControlMessage parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.SocketControlMessage(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public UnixCredentialsMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to UnixCredentialsMessage if its GType is a (or inherits from) "GUnixCredentialsMessage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "UnixCredentialsMessage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixCredentialsMessage", a ClassCastException will be thrown.
     */
    public static UnixCredentialsMessage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GUnixCredentialsMessage"))) {
            return new UnixCredentialsMessage(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixCredentialsMessage");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_credentials_message_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixCredentialsMessage} with credentials matching the current processes.
     */
    public UnixCredentialsMessage() {
        super(constructNew());
    }
    
    private static Refcounted constructNewWithCredentials(@NotNull org.gtk.gio.Credentials credentials) {
        java.util.Objects.requireNonNull(credentials, "Parameter 'credentials' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_credentials_message_new_with_credentials.invokeExact(
                    credentials.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixCredentialsMessage} holding {@code credentials}.
     * @param credentials A {@link Credentials} object.
     * @return a new {@link UnixCredentialsMessage}
     */
    public static UnixCredentialsMessage newWithCredentials(@NotNull org.gtk.gio.Credentials credentials) {
        return new UnixCredentialsMessage(constructNewWithCredentials(credentials));
    }
    
    /**
     * Gets the credentials stored in {@code message}.
     * @return A {@link Credentials} instance. Do not free, it is owned by {@code message}.
     */
    public @NotNull org.gtk.gio.Credentials getCredentials() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_credentials_message_get_credentials.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Credentials(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks if passing {@link Credentials} on a {@link Socket} is supported on this platform.
     * @return {@code true} if supported, {@code false} otherwise
     */
    public static boolean isSupported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_credentials_message_is_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_credentials_message_new = Interop.downcallHandle(
            "g_unix_credentials_message_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_credentials_message_new_with_credentials = Interop.downcallHandle(
            "g_unix_credentials_message_new_with_credentials",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_credentials_message_get_credentials = Interop.downcallHandle(
            "g_unix_credentials_message_get_credentials",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_credentials_message_is_supported = Interop.downcallHandle(
            "g_unix_credentials_message_is_supported",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
