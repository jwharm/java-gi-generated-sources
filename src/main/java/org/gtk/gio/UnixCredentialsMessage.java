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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketControlMessage.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.SocketControlMessage parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.SocketControlMessage(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a UnixCredentialsMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnixCredentialsMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to UnixCredentialsMessage if its GType is a (or inherits from) "GUnixCredentialsMessage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code UnixCredentialsMessage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixCredentialsMessage", a ClassCastException will be thrown.
     */
    public static UnixCredentialsMessage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), UnixCredentialsMessage.getType())) {
            return new UnixCredentialsMessage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixCredentialsMessage");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewWithCredentials(@NotNull org.gtk.gio.Credentials credentials) {
        java.util.Objects.requireNonNull(credentials, "Parameter 'credentials' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_credentials_message_new_with_credentials.invokeExact(
                    credentials.handle());
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
        return new UnixCredentialsMessage(constructNewWithCredentials(credentials), Ownership.FULL);
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
        return new org.gtk.gio.Credentials(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketControlMessage.Build {
        
         /**
         * A {@link UnixCredentialsMessage.Build} object constructs a {@link UnixCredentialsMessage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link UnixCredentialsMessage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixCredentialsMessage} using {@link UnixCredentialsMessage#castFrom}.
         * @return A new instance of {@code UnixCredentialsMessage} with the properties 
         *         that were set in the Build object.
         */
        public UnixCredentialsMessage construct() {
            return UnixCredentialsMessage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    UnixCredentialsMessage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The credentials stored in the message.
         * @param credentials The value for the {@code credentials} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCredentials(org.gtk.gio.Credentials credentials) {
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
}
