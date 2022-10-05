package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class Credentials extends org.gtk.gobject.Object {

    public Credentials(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Credentials */
    public static Credentials castFrom(org.gtk.gobject.Object gobject) {
        return new Credentials(gobject.refcounted());
    }
    
    static final MethodHandle g_credentials_new = Interop.downcallHandle(
        "g_credentials_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_credentials_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Credentials} object with credentials matching the
     * the current process.
     */
    public Credentials() {
        super(constructNew());
    }
    
    static final MethodHandle g_credentials_get_native = Interop.downcallHandle(
        "g_credentials_get_native",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a pointer to native credentials of type {@code native_type} from
     * {@code credentials}.
     * <p>
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no {@link Credentials} support for
     * the OS or if {@code native_type} isn't supported by the OS.
     */
    public java.lang.foreign.MemoryAddress getNative(CredentialsType nativeType) {
        try {
            var RESULT = (MemoryAddress) g_credentials_get_native.invokeExact(handle(), nativeType.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_get_unix_pid = Interop.downcallHandle(
        "g_credentials_get_unix_pid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to get the UNIX process identifier from {@code credentials}. This
     * method is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX process ID.
     */
    public int getUnixPid() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_credentials_get_unix_pid.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_get_unix_user = Interop.downcallHandle(
        "g_credentials_get_unix_user",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to get the UNIX user identifier from {@code credentials}. This
     * method is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user.
     */
    public int getUnixUser() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_credentials_get_unix_user.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_is_same_user = Interop.downcallHandle(
        "g_credentials_is_same_user",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code credentials} and {@code other_credentials} is the same user.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * the OS.
     */
    public boolean isSameUser(Credentials otherCredentials) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_credentials_is_same_user.invokeExact(handle(), otherCredentials.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_set_native = Interop.downcallHandle(
        "g_credentials_set_native",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the native credentials of type {@code native_type} from {@code native}
     * into {@code credentials}.
     * <p>
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no {@link Credentials} support for
     * the OS or if {@code native_type} isn't supported by the OS.
     */
    public void setNative(CredentialsType nativeType, java.lang.foreign.MemoryAddress native_) {
        try {
            g_credentials_set_native.invokeExact(handle(), nativeType.getValue(), native_);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_set_unix_user = Interop.downcallHandle(
        "g_credentials_set_unix_user",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tries to set the UNIX user identifier on {@code credentials}. This method
     * is only available on UNIX platforms.
     * <p>
     * This operation can fail if {@link Credentials} is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user. It can also fail if the OS does not allow the
     * use of "spoofed" credentials.
     */
    public boolean setUnixUser(int uid) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_credentials_set_unix_user.invokeExact(handle(), uid, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_credentials_to_string = Interop.downcallHandle(
        "g_credentials_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a human-readable textual representation of {@code credentials}
     * that can be used in logging and debug messages. The format of the
     * returned string may change in future GLib release.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) g_credentials_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}