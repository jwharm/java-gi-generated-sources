package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Holds a password used in TLS.
 */
public class TlsPassword extends org.gtk.gobject.Object {

    public TlsPassword(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TlsPassword */
    public static TlsPassword castFrom(org.gtk.gobject.Object gobject) {
        return new TlsPassword(gobject.getReference());
    }
    
    /**
     * Create a new #GTlsPassword object.
     */
    public TlsPassword(int flags, java.lang.String description) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_new(flags, Interop.allocateNativeString(description).HANDLE()), true));
    }
    
    /**
     * Get a description string about what the password will be used for.
     */
    public java.lang.String getDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_get_description(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get flags about the password.
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public java.lang.String getWarning() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_get_warning(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Set a description string about what the password will be used for.
     */
    public void setDescription(java.lang.String description) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_set_description(HANDLE(), Interop.allocateNativeString(description).HANDLE());
    }
    
    /**
     * Set flags about the password.
     */
    public void setFlags(int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_set_flags(HANDLE(), flags);
    }
    
    /**
     * Set the value for this password. The @value will be copied by the password
     * object.
     * 
     * Specify the @length, for a non-nul-terminated password. Pass -1 as
     * @length if using a nul-terminated password, and @length will be
     * calculated automatically. (Note that the terminating nul is not
     * considered part of the password in this case.)
     */
    public void setValue(byte[] value, long length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_set_value(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, value), length);
    }
    
    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public void setWarning(java.lang.String warning) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_password_set_warning(HANDLE(), Interop.allocateNativeString(warning).HANDLE());
    }
    
}
