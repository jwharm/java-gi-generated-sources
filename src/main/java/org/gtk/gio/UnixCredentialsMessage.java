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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketControlMessage.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a UnixCredentialsMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UnixCredentialsMessage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixCredentialsMessage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UnixCredentialsMessage(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_credentials_message_new.invokeExact();
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
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithCredentials(org.gtk.gio.Credentials credentials) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_credentials_message_new_with_credentials.invokeExact(credentials.handle());
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
    public static UnixCredentialsMessage newWithCredentials(org.gtk.gio.Credentials credentials) {
        var RESULT = constructNewWithCredentials(credentials);
        var OBJECT = (org.gtk.gio.UnixCredentialsMessage) Interop.register(RESULT, org.gtk.gio.UnixCredentialsMessage.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the credentials stored in {@code message}.
     * @return A {@link Credentials} instance. Do not free, it is owned by {@code message}.
     */
    public org.gtk.gio.Credentials getCredentials() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_credentials_message_get_credentials.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Credentials) Interop.register(RESULT, org.gtk.gio.Credentials.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_credentials_message_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link UnixCredentialsMessage.Builder} object constructs a {@link UnixCredentialsMessage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link UnixCredentialsMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketControlMessage.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link UnixCredentialsMessage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixCredentialsMessage}.
         * @return A new instance of {@code UnixCredentialsMessage} with the properties 
         *         that were set in the Builder object.
         */
        public UnixCredentialsMessage build() {
            return (UnixCredentialsMessage) org.gtk.gobject.GObject.newWithProperties(
                UnixCredentialsMessage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The credentials stored in the message.
         * @param credentials The value for the {@code credentials} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCredentials(org.gtk.gio.Credentials credentials) {
            names.add("credentials");
            values.add(org.gtk.gobject.Value.create(credentials));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_credentials_message_new = Interop.downcallHandle(
                "g_unix_credentials_message_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_credentials_message_new_with_credentials = Interop.downcallHandle(
                "g_unix_credentials_message_new_with_credentials",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_credentials_message_get_credentials = Interop.downcallHandle(
                "g_unix_credentials_message_get_credentials",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_credentials_message_get_type = Interop.downcallHandle(
                "g_unix_credentials_message_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_unix_credentials_message_is_supported = Interop.downcallHandle(
                "g_unix_credentials_message_is_supported",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_unix_credentials_message_get_type != null;
    }
}
