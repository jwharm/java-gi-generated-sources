package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.g_credentials_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Credentials} object with credentials matching the
     * the current process.
     */
    public Credentials() {
        super(constructNew());
    }
    
    /**
     * Gets a pointer to native credentials of type {@code native_type} from
     * {@code credentials}.
     * <p>
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no {@link Credentials} support for
     * the OS or if {@code native_type} isn't supported by the OS.
     */
    public java.lang.foreign.MemoryAddress getNative(CredentialsType nativeType) {
        var RESULT = gtk_h.g_credentials_get_native(handle(), nativeType.getValue());
        return RESULT;
    }
    
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
        var RESULT = gtk_h.g_credentials_get_unix_pid(handle(), GERROR);
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
     */
    public int getUnixUser() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_get_unix_user(handle(), GERROR);
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
     */
    public boolean isSameUser(Credentials otherCredentials) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_is_same_user(handle(), otherCredentials.handle(), GERROR);
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
     */
    public void setNative(CredentialsType nativeType, java.lang.foreign.MemoryAddress native_) {
        gtk_h.g_credentials_set_native(handle(), nativeType.getValue(), native_);
    }
    
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
        var RESULT = gtk_h.g_credentials_set_unix_user(handle(), uid, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a human-readable textual representation of {@code credentials}
     * that can be used in logging and debug messages. The format of the
     * returned string may change in future GLib release.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_credentials_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
