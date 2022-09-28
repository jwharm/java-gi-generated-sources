package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Holds a password used in TLS.
 */
public class TlsPassword extends org.gtk.gobject.Object {

    public TlsPassword(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TlsPassword */
    public static TlsPassword castFrom(org.gtk.gobject.Object gobject) {
        return new TlsPassword(gobject.getReference());
    }
    
    private static Reference constructNew(TlsPasswordFlags flags, java.lang.String description) {
        Reference RESULT = References.get(gtk_h.g_tls_password_new(flags.getValue(), Interop.allocateNativeString(description).handle()), true);
        return RESULT;
    }
    
    /**
     * Create a new {@link TlsPassword} object.
     */
    public TlsPassword(TlsPasswordFlags flags, java.lang.String description) {
        super(constructNew(flags, description));
    }
    
    /**
     * Get a description string about what the password will be used for.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.g_tls_password_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get flags about the password.
     */
    public TlsPasswordFlags getFlags() {
        var RESULT = gtk_h.g_tls_password_get_flags(handle());
        return new TlsPasswordFlags(RESULT);
    }
    
    /**
     * Get the password value. If {@code length} is not {@code null} then it will be
     * filled in with the length of the password value. (Note that the
     * password value is not nul-terminated, so you can only pass {@code null}
     * for {@code length} in contexts where you know the password will have a
     * certain fixed length.)
     */
    public PointerIterator<Byte> getValue(PointerLong length) {
        var RESULT = gtk_h.g_tls_password_get_value(handle(), length.handle());
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public java.lang.String getWarning() {
        var RESULT = gtk_h.g_tls_password_get_warning(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Set a description string about what the password will be used for.
     */
    public void setDescription(java.lang.String description) {
        gtk_h.g_tls_password_set_description(handle(), Interop.allocateNativeString(description).handle());
    }
    
    /**
     * Set flags about the password.
     */
    public void setFlags(TlsPasswordFlags flags) {
        gtk_h.g_tls_password_set_flags(handle(), flags.getValue());
    }
    
    /**
     * Set the value for this password. The {@code value} will be copied by the password
     * object.
     * <p>
     * Specify the {@code length}, for a non-nul-terminated password. Pass -1 as
     * {@code length} if using a nul-terminated password, and {@code length} will be
     * calculated automatically. (Note that the terminating nul is not
     * considered part of the password in this case.)
     */
    public void setValue(byte[] value, long length) {
        gtk_h.g_tls_password_set_value(handle(), Interop.allocateNativeArray(value).handle(), length);
    }
    
    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public void setWarning(java.lang.String warning) {
        gtk_h.g_tls_password_set_warning(handle(), Interop.allocateNativeString(warning).handle());
    }
    
}
