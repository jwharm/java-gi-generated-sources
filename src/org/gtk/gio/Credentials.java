package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GCredentials type is a reference-counted wrapper for native
 * credentials. This information is typically used for identifying,
 * authenticating and authorizing other processes.
 * <p>
 * Some operating systems supports looking up the credentials of the
 * remote peer of a communication endpoint - see e.g.
 * g_socket_get_credentials().
 * <p>
 * Some operating systems supports securely sending and receiving
 * credentials over a Unix Domain Socket, see
 * <h1>nixCredentialsMessage, g_unix_connection_send_credentials() and</h1>
 * g_unix_connection_receive_credentials() for details.
 * <p>
 * On Linux, the native credential type is a <code>struct ucred</code> - see the
 * unix(7) man page for details. This corresponds to
 * <code>G_CREDENTIALS_TYPE_LINUX_UCRED.
 * <p>
 * On</code> Apple operating systems (including iOS, tvOS, and macOS),
 * the native credential type is a <code>struct xucred</code>.
 * This corresponds to <code>G_CREDENTIALS_TYPE_APPLE_XUCRED.
 * <p>
 * On</code> FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native
 * credential type is a <code>struct cmsgcred</code>. This corresponds
 * to <code>G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED.
 * <p>
 * On</code> NetBSD, the native credential type is a <code>struct unpcbid</code>.
 * This corresponds to <code>G_CREDENTIALS_TYPE_NETBSD_UNPCBID.
 * <p>
 * On</code> OpenBSD, the native credential type is a <code>struct sockpeercred</code>.
 * This corresponds to <code>G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED.
 * <p>
 * On</code> Solaris (including OpenSolaris and its derivatives), the native
 * credential type is a <code>ucred_t</code>. This corresponds to
 * <code>G_CREDENTIALS_TYPE_SOLARIS_UCRED.
 * 
 * Since</code> GLib 2.72, on Windows, the native credentials may contain the PID of a
 * process. This corresponds to GLib 2.72, on Windows, the native credentials may contain the PID of a
 * process. This corresponds to %G_CREDENTIALS_TYPE_WIN32_PID.
 */
public class Credentials extends org.gtk.gobject.Object {

    public Credentials(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Credentials */
    public static Credentials castFrom(org.gtk.gobject.Object gobject) {
        return new Credentials(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_credentials_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GCredentials object with credentials matching the
     * the current process.
     */
    public Credentials() {
        super(constructNew());
    }
    
    /**
     * Gets a pointer to native credentials of type @native_type from
     * @credentials.
     * 
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no #GCredentials support for
     * the OS or if @native_type isn&#39;t supported by the OS.
     */
    public jdk.incubator.foreign.MemoryAddress getNative(CredentialsType nativeType) {
        var RESULT = gtk_h.g_credentials_get_native(handle(), nativeType.getValue());
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
    public int getUnixPid() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_get_unix_pid(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public int getUnixUser() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_get_unix_user(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Checks if @credentials and @other_credentials is the same user.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * the OS.
     */
    public boolean isSameUser(Credentials otherCredentials) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_is_same_user(handle(), otherCredentials.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Copies the native credentials of type @native_type from @native
     * into @credentials.
     * 
     * It is a programming error (which will cause a warning to be
     * logged) to use this method if there is no #GCredentials support for
     * the OS or if @native_type isn&#39;t supported by the OS.
     */
    public void setNative(CredentialsType nativeType, jdk.incubator.foreign.MemoryAddress native_) {
        gtk_h.g_credentials_set_native(handle(), nativeType.getValue(), native_);
    }
    
    /**
     * Tries to set the UNIX user identifier on @credentials. This method
     * is only available on UNIX platforms.
     * 
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user. It can also fail if the OS does not allow the
     * use of &#34;spoofed&#34; credentials.
     */
    public boolean setUnixUser(int uid) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_credentials_set_unix_user(handle(), uid, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a human-readable textual representation of @credentials
     * that can be used in logging and debug messages. The format of the
     * returned string may change in future GLib release.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_credentials_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
