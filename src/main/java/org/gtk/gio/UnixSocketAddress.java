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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddress.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.SocketAddress parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.SocketAddress(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a UnixSocketAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnixSocketAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to UnixSocketAddress if its GType is a (or inherits from) "GUnixSocketAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code UnixSocketAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixSocketAddress", a ClassCastException will be thrown.
     */
    public static UnixSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GUnixSocketAddress"))) {
            return new UnixSocketAddress(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixSocketAddress");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new.invokeExact(
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixSocketAddress} for {@code path}.
     * <p>
     * To create abstract socket addresses, on systems that support that,
     * use g_unix_socket_address_new_abstract().
     * @param path the socket path
     */
    public UnixSocketAddress(@NotNull java.lang.String path) {
        super(constructNew(path), Ownership.FULL);
    }
    
    private static Addressable constructNewAbstract(@NotNull byte[] path, int pathLen) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new_abstract.invokeExact(
                    Interop.allocateNativeArray(path, false),
                    pathLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public static UnixSocketAddress newAbstract(@NotNull byte[] path, int pathLen) {
        return new UnixSocketAddress(constructNewAbstract(path, pathLen), Ownership.FULL);
    }
    
    private static Addressable constructNewWithType(@NotNull byte[] path, int pathLen, @NotNull org.gtk.gio.UnixSocketAddressType type) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_new_with_type.invokeExact(
                    Interop.allocateNativeArray(path, false),
                    pathLen,
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public static UnixSocketAddress newWithType(@NotNull byte[] path, int pathLen, @NotNull org.gtk.gio.UnixSocketAddressType type) {
        return new UnixSocketAddress(constructNewWithType(path, pathLen, type), Ownership.FULL);
    }
    
    /**
     * Gets {@code address}'s type.
     * @return a {@link UnixSocketAddressType}
     */
    public @NotNull org.gtk.gio.UnixSocketAddressType getAddressType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_socket_address_get_address_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.UnixSocketAddressType(RESULT);
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
            RESULT = (int) DowncallHandles.g_unix_socket_address_get_is_abstract.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_socket_address_get_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (long) DowncallHandles.g_unix_socket_address_get_path_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_socket_address_new = Interop.downcallHandle(
            "g_unix_socket_address_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_new_abstract = Interop.downcallHandle(
            "g_unix_socket_address_new_abstract",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_new_with_type = Interop.downcallHandle(
            "g_unix_socket_address_new_with_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_get_address_type = Interop.downcallHandle(
            "g_unix_socket_address_get_address_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_get_is_abstract = Interop.downcallHandle(
            "g_unix_socket_address_get_is_abstract",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_get_path = Interop.downcallHandle(
            "g_unix_socket_address_get_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_get_path_len = Interop.downcallHandle(
            "g_unix_socket_address_get_path_len",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_socket_address_abstract_names_supported = Interop.downcallHandle(
            "g_unix_socket_address_abstract_names_supported",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
    }
}
