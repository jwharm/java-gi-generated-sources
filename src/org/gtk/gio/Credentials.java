package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GCredentials type is a reference-counted wrapper for native
 * credentials. This information is typically used for identifying,
 * authenticating and authorizing other processes.
 * 
 * Some operating systems supports looking up the credentials of the
 * remote peer of a communication endpoint - see e.g.
 * g_socket_get_credentials().
 * 
 * Some operating systems supports securely sending and receiving
 * credentials over a Unix Domain Socket, see
 * #GUnixCredentialsMessage, g_unix_connection_send_credentials() and
 * g_unix_connection_receive_credentials() for details.
 * 
 * On Linux, the native credential type is a `struct ucred` - see the
 * unix(7) man page for details. This corresponds to
 * %G_CREDENTIALS_TYPE_LINUX_UCRED.
 * 
 * On Apple operating systems (including iOS, tvOS, and macOS),
 * the native credential type is a `struct xucred`.
 * This corresponds to %G_CREDENTIALS_TYPE_APPLE_XUCRED.
 * 
 * On FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native
 * credential type is a `struct cmsgcred`. This corresponds
 * to %G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED.
 * 
 * On NetBSD, the native credential type is a `struct unpcbid`.
 * This corresponds to %G_CREDENTIALS_TYPE_NETBSD_UNPCBID.
 * 
 * On OpenBSD, the native credential type is a `struct sockpeercred`.
 * This corresponds to %G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED.
 * 
 * On Solaris (including OpenSolaris and its derivatives), the native
 * credential type is a `ucred_t`. This corresponds to
 * %G_CREDENTIALS_TYPE_SOLARIS_UCRED.
 * 
 * Since GLib 2.72, on Windows, the native credentials may contain the PID of a
 * process. This corresponds to %G_CREDENTIALS_TYPE_WIN32_PID.
 */
public class Credentials extends org.gtk.gobject.Object {

    public Credentials(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Credentials */
    public static Credentials castFrom(org.gtk.gobject.Object gobject) {
        return new Credentials(gobject.getProxy());
    }
    
    /**
     * Creates a new #GCredentials object with credentials matching the
     * the current process.
     */
    public Credentials() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_new(), true));
    }
    
    /**
     * Gets a pointer to native credentials of type @native_type from
     * @credentials.
     * 
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no #GCredentials support for
     * the OS or if @native_type isn't supported by the OS.
     */
    public jdk.incubator.foreign.MemoryAddress getNative(CredentialsType nativeType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_get_native(HANDLE(), nativeType.getValue());
        return RESULT;
    }
    
    /**
     * Tries to get the UNIX process identifier from @credentials. This
     * method is only available on UNIX platforms.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX process ID.
     */
    public int getUnixPid() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_get_unix_pid(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Tries to get the UNIX user identifier from @credentials. This
     * method is only available on UNIX platforms.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user.
     */
    public int getUnixUser() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_get_unix_user(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Checks if @credentials and @other_credentials is the same user.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * the OS.
     */
    public boolean isSameUser(Credentials otherCredentials) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_is_same_user(HANDLE(), otherCredentials.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Copies the native credentials of type @native_type from @native
     * into @credentials.
     * 
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no #GCredentials support for
     * the OS or if @native_type isn't supported by the OS.
     */
    public void setNative(CredentialsType nativeType, jdk.incubator.foreign.MemoryAddress native_) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_set_native(HANDLE(), nativeType.getValue(), native_);
    }
    
    /**
     * Tries to set the UNIX user identifier on @credentials. This method
     * is only available on UNIX platforms.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user. It can also fail if the OS does not allow the
     * use of "spoofed" credentials.
     */
    public boolean setUnixUser(int uid) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_set_unix_user(HANDLE(), uid, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a human-readable textual representation of @credentials
     * that can be used in logging and debug messages. The format of the
     * returned string may change in future GLib release.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_credentials_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}