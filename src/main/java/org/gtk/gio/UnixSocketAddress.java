package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Support for UNIX-domain (also known as local) sockets.
 * <p>
 * UNIX domain sockets are generally visible in the filesystem.
 * However, some systems support abstract socket names which are not
 * visible in the filesystem and not affected by the filesystem
 * permissions, visibility, etc. Currently this is only supported
 * under Linux. If you attempt to use abstract sockets on other
 * systems, function calls may return {@link IOErrorEnum#NOT_SUPPORTED}
 * errors. You can use g_unix_socket_address_abstract_names_supported()
 * to see if abstract names are supported.
 * <p>
 * Since GLib 2.72, {@link UnixSocketAddress} is available on all platforms. It
 * requires underlying system support (such as Windows 10 with {@code AF_UNIX}) at
 * run time.
 * <p>
 * Before GLib 2.72, {@code <gio/gunixsocketaddress.h>} belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the {@code gio-unix-2.0.pc} pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 */
public class UnixSocketAddress extends org.gtk.gio.SocketAddress implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixSocketAddress";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a UnixSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UnixSocketAddress(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixSocketAddress> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UnixSocketAddress(input);
    
    private static MemoryAddress constructNew(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new.invokeExact(Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link UnixSocketAddress} for {@code path}.
     * <p>
     * To create abstract socket addresses, on systems that support that,
     * use g_unix_socket_address_new_abstract().
     * @param path the socket path
     */
    public UnixSocketAddress(java.lang.String path) {
        super(constructNew(path));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewAbstract(byte[] path, int pathLen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new_abstract.invokeExact(
                        Interop.allocateNativeArray(path, false, SCOPE),
                        pathLen);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@link UnixSocketAddressType#ABSTRACT_PADDED}
     * {@link UnixSocketAddress} for {@code path}.
     * @param path the abstract name
     * @param pathLen the length of {@code path}, or -1
     * @return a new {@link UnixSocketAddress}
     * @deprecated Use g_unix_socket_address_new_with_type().
     */
    @Deprecated
    public static UnixSocketAddress newAbstract(byte[] path, int pathLen) {
        var RESULT = constructNewAbstract(path, pathLen);
        var OBJECT = (org.gtk.gio.UnixSocketAddress) Interop.register(RESULT, org.gtk.gio.UnixSocketAddress.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithType(byte[] path, int pathLen, org.gtk.gio.UnixSocketAddressType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new_with_type.invokeExact(
                        Interop.allocateNativeArray(path, false, SCOPE),
                        pathLen,
                        type.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@link UnixSocketAddress} of type {@code type} with name {@code path}.
     * <p>
     * If {@code type} is {@link UnixSocketAddressType#PATH}, this is equivalent to
     * calling g_unix_socket_address_new().
     * <p>
     * If {@code type} is {@link UnixSocketAddressType#ANONYMOUS}, {@code path} and {@code path_len} will be
     * ignored.
     * <p>
     * If {@code path_type} is {@link UnixSocketAddressType#ABSTRACT}, then {@code path_len}
     * bytes of {@code path} will be copied to the socket's path, and only those
     * bytes will be considered part of the name. (If {@code path_len} is -1,
     * then {@code path} is assumed to be NUL-terminated.) For example, if {@code path}
     * was "test", then calling g_socket_address_get_native_size() on the
     * returned socket would return 7 (2 bytes of overhead, 1 byte for the
     * abstract-socket indicator byte, and 4 bytes for the name "test").
     * <p>
     * If {@code path_type} is {@link UnixSocketAddressType#ABSTRACT_PADDED}, then
     * {@code path_len} bytes of {@code path} will be copied to the socket's path, the
     * rest of the path will be padded with 0 bytes, and the entire
     * zero-padded buffer will be considered the name. (As above, if
     * {@code path_len} is -1, then {@code path} is assumed to be NUL-terminated.) In
     * this case, g_socket_address_get_native_size() will always return
     * the full size of a {@code struct sockaddr_un}, although
     * g_unix_socket_address_get_path_len() will still return just the
     * length of {@code path}.
     * <p>
     * {@link UnixSocketAddressType#ABSTRACT} is preferred over
     * {@link UnixSocketAddressType#ABSTRACT_PADDED} for new programs. Of course,
     * when connecting to a server created by another process, you must
     * use the appropriate type corresponding to how that process created
     * its listening socket.
     * @param path the name
     * @param pathLen the length of {@code path}, or -1
     * @param type a {@link UnixSocketAddressType}
     * @return a new {@link UnixSocketAddress}
     */
    public static UnixSocketAddress newWithType(byte[] path, int pathLen, org.gtk.gio.UnixSocketAddressType type) {
        var RESULT = constructNewWithType(path, pathLen, type);
        var OBJECT = (org.gtk.gio.UnixSocketAddress) Interop.register(RESULT, org.gtk.gio.UnixSocketAddress.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets {@code address}'s type.
     * @return a {@link UnixSocketAddressType}
     */
    public org.gtk.gio.UnixSocketAddressType getAddressType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_socket_address_get_address_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.UnixSocketAddressType.of(RESULT);
    }
    
    /**
     * Tests if {@code address} is abstract.
     * @return {@code true} if the address is abstract, {@code false} otherwise
     * @deprecated Use g_unix_socket_address_get_address_type()
     */
    @Deprecated
    public boolean getIsAbstract() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_socket_address_get_is_abstract.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets {@code address}'s path, or for abstract sockets the "name".
     * <p>
     * Guaranteed to be zero-terminated, but an abstract socket
     * may contain embedded zeros, and thus you should use
     * g_unix_socket_address_get_path_len() to get the true length
     * of this string.
     * @return the path for {@code address}
     */
    public java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_get_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the length of {@code address}'s path.
     * <p>
     * For details, see g_unix_socket_address_get_path().
     * @return the length of the path
     */
    public long getPathLen() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_socket_address_get_path_len.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_socket_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Checks if abstract UNIX domain socket names are supported.
     * @return {@code true} if supported, {@code false} otherwise
     */
    public static boolean abstractNamesSupported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_socket_address_abstract_names_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link UnixSocketAddress.Builder} object constructs a {@link UnixSocketAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link UnixSocketAddress.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketAddress.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link UnixSocketAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixSocketAddress}.
         * @return A new instance of {@code UnixSocketAddress} with the properties 
         *         that were set in the Builder object.
         */
        public UnixSocketAddress build() {
            return (UnixSocketAddress) org.gtk.gobject.GObject.newWithProperties(
                UnixSocketAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether or not this is an abstract address
         * @param abstract_ The value for the {@code abstract} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAbstract(boolean abstract_) {
            names.add("abstract");
            values.add(org.gtk.gobject.Value.create(abstract_));
            return this;
        }
        
        public Builder setAddressType(org.gtk.gio.UnixSocketAddressType addressType) {
            names.add("address-type");
            values.add(org.gtk.gobject.Value.create(addressType));
            return this;
        }
        
        public Builder setPath(java.lang.String path) {
            names.add("path");
            values.add(org.gtk.gobject.Value.create(path));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_socket_address_new = Interop.downcallHandle(
                "g_unix_socket_address_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_new_abstract = Interop.downcallHandle(
                "g_unix_socket_address_new_abstract",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_new_with_type = Interop.downcallHandle(
                "g_unix_socket_address_new_with_type",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_get_address_type = Interop.downcallHandle(
                "g_unix_socket_address_get_address_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_get_is_abstract = Interop.downcallHandle(
                "g_unix_socket_address_get_is_abstract",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_get_path = Interop.downcallHandle(
                "g_unix_socket_address_get_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_get_path_len = Interop.downcallHandle(
                "g_unix_socket_address_get_path_len",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_get_type = Interop.downcallHandle(
                "g_unix_socket_address_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_unix_socket_address_abstract_names_supported = Interop.downcallHandle(
                "g_unix_socket_address_abstract_names_supported",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_unix_socket_address_get_type != null;
    }
}
