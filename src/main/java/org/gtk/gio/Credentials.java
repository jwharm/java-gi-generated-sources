package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Credentials} type is a reference-counted wrapper for native
 * credentials. This information is typically used for identifying,
 * authenticating and authorizing other processes.
 * <p>
 * Some operating systems supports looking up the credentials of the
 * remote peer of a communication endpoint - see e.g.
 * g_socket_get_credentials().
 * <p>
 * Some operating systems supports securely sending and receiving
 * credentials over a Unix Domain Socket, see
 * {@link UnixCredentialsMessage}, g_unix_connection_send_credentials() and
 * g_unix_connection_receive_credentials() for details.
 * <p>
 * On Linux, the native credential type is a {@code struct ucred} - see the
 * unix(7) man page for details. This corresponds to
 * {@link CredentialsType#LINUX_UCRED}.
 * <p>
 * On Apple operating systems (including iOS, tvOS, and macOS),
 * the native credential type is a {@code struct xucred}.
 * This corresponds to {@link CredentialsType#APPLE_XUCRED}.
 * <p>
 * On FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native
 * credential type is a {@code struct cmsgcred}. This corresponds
 * to {@link CredentialsType#FREEBSD_CMSGCRED}.
 * <p>
 * On NetBSD, the native credential type is a {@code struct unpcbid}.
 * This corresponds to {@link CredentialsType#NETBSD_UNPCBID}.
 * <p>
 * On OpenBSD, the native credential type is a {@code struct sockpeercred}.
 * This corresponds to {@link CredentialsType#OPENBSD_SOCKPEERCRED}.
 * <p>
 * On Solaris (including OpenSolaris and its derivatives), the native
 * credential type is a {@code ucred_t}. This corresponds to
 * {@link CredentialsType#SOLARIS_UCRED}.
 * <p>
 * Since GLib 2.72, on Windows, the native credentials may contain the PID of a
 * process. This corresponds to {@link CredentialsType#WIN32_PID}.
 * @version 2.26
 */
public class Credentials extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCredentials";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Credentials proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Credentials(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Credentials if its GType is a (or inherits from) "GCredentials".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Credentials} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GCredentials", a ClassCastException will be thrown.
     */
    public static Credentials castFrom(org.gtk.gobject.Object gobject) {
            return new Credentials(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_credentials_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Credentials} object with credentials matching the
     * the current process.
     */
    public Credentials() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets a pointer to native credentials of type {@code native_type} from
     * {@code credentials}.
     * <p>
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no {@link Credentials} support for
     * the OS or if {@code native_type} isn't supported by the OS.
     * @param nativeType The type of native credentials to get.
     * @return The pointer to native credentials or
     *     {@code null} if there is no {@link Credentials} support for the OS or if {@code native_type}
     *     isn't supported by the OS. Do not free the returned data, it is owned
     *     by {@code credentials}.
     */
    public @Nullable java.lang.foreign.MemoryAddress getNative(@NotNull org.gtk.gio.CredentialsType nativeType) {
        java.util.Objects.requireNonNull(nativeType, "Parameter 'nativeType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_credentials_get_native.invokeExact(
                    handle(),
                    nativeType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tries to get the UNIX process identifier from {@code credentials}. This
     * method is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX process ID.
     * @return The UNIX process ID, or {@code -1} if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int getUnixPid() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_credentials_get_unix_pid.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to get the UNIX user identifier from {@code credentials}. This
     * method is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user.
     * @return The UNIX user identifier or {@code -1} if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int getUnixUser() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_credentials_get_unix_user.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code credentials} and {@code other_credentials} is the same user.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * the OS.
     * @param otherCredentials A {@link Credentials}.
     * @return {@code true} if {@code credentials} and {@code other_credentials} has the same
     * user, {@code false} otherwise or if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean isSameUser(@NotNull org.gtk.gio.Credentials otherCredentials) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(otherCredentials, "Parameter 'otherCredentials' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_credentials_is_same_user.invokeExact(
                    handle(),
                    otherCredentials.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Copies the native credentials of type {@code native_type} from {@code native}
     * into {@code credentials}.
     * <p>
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no {@link Credentials} support for
     * the OS or if {@code native_type} isn't supported by the OS.
     * @param nativeType The type of native credentials to set.
     * @param native_ A pointer to native credentials.
     */
    public void setNative(@NotNull org.gtk.gio.CredentialsType nativeType, @NotNull java.lang.foreign.MemoryAddress native_) {
        java.util.Objects.requireNonNull(nativeType, "Parameter 'nativeType' must not be null");
        java.util.Objects.requireNonNull(native_, "Parameter 'native_' must not be null");
        try {
            DowncallHandles.g_credentials_set_native.invokeExact(
                    handle(),
                    nativeType.getValue(),
                    (Addressable) native_);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to set the UNIX user identifier on {@code credentials}. This method
     * is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user. It can also fail if the OS does not allow the
     * use of "spoofed" credentials.
     * @param uid The UNIX user identifier to set.
     * @return {@code true} if {@code uid} was set, {@code false} if error is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setUnixUser(int uid) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_credentials_set_unix_user.invokeExact(
                    handle(),
                    uid,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a human-readable textual representation of {@code credentials}
     * that can be used in logging and debug messages. The format of the
     * returned string may change in future GLib release.
     * @return A string that should be freed with g_free().
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_credentials_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_credentials_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Credentials.Build} object constructs a {@link Credentials} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Credentials} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Credentials} using {@link Credentials#castFrom}.
         * @return A new instance of {@code Credentials} with the properties 
         *         that were set in the Build object.
         */
        public Credentials construct() {
            return Credentials.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Credentials.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_credentials_new = Interop.downcallHandle(
            "g_credentials_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_get_native = Interop.downcallHandle(
            "g_credentials_get_native",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_credentials_get_unix_pid = Interop.downcallHandle(
            "g_credentials_get_unix_pid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_get_unix_user = Interop.downcallHandle(
            "g_credentials_get_unix_user",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_is_same_user = Interop.downcallHandle(
            "g_credentials_is_same_user",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_set_native = Interop.downcallHandle(
            "g_credentials_set_native",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_set_unix_user = Interop.downcallHandle(
            "g_credentials_set_unix_user",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_to_string = Interop.downcallHandle(
            "g_credentials_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_credentials_get_type = Interop.downcallHandle(
            "g_credentials_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
