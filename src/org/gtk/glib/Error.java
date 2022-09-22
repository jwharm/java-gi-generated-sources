package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GError} structure contains information about
 * an error that has occurred.
 */
public class Error extends io.github.jwharm.javagi.ResourceBase {

    public Error(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewLiteral(Quark domain, int code, java.lang.String message) {
        Reference RESULT = References.get(gtk_h.g_error_new_literal(domain.getValue(), code, Interop.allocateNativeString(message).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Error}; unlike g_error_new(), {@code message} is
     * not a printf()-style format string. Use this function if
     * {@code message} contains text you don't have control over,
     * that could include printf() escape sequences.
     */
    public static Error newLiteral(Quark domain, int code, java.lang.String message) {
        return new Error(constructNewLiteral(domain, code, message));
    }
    
    private static Reference constructNewValist(Quark domain, int code, java.lang.String format, VaList args) {
        Reference RESULT = References.get(gtk_h.g_error_new_valist(domain.getValue(), code, Interop.allocateNativeString(format).handle(), args), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Error} with the given {@code domain} and {@code code},
     * and a message formatted with {@code format}.
     */
    public static Error newValist(Quark domain, int code, java.lang.String format, VaList args) {
        return new Error(constructNewValist(domain, code, format, args));
    }
    
    /**
     * Makes a copy of {@code error}.
     */
    public Error copy() {
        var RESULT = gtk_h.g_error_copy(handle());
        return new Error(References.get(RESULT, true));
    }
    
    /**
     * Frees a {@link Error} and associated resources.
     */
    public void free() {
        gtk_h.g_error_free(handle());
    }
    
    /**
     * Returns <code>true</code> if {@code error} matches {@code domain} and {@code code}, <code>false</code>
     * otherwise. In particular, when {@code error} is <code>null</code>, <code>false</code> will
     * be returned.
     * <p>
     * If {@code domain} contains a {@code FAILED} (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the {@code FAILED} code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     */
    public boolean matches(Quark domain, int code) {
        var RESULT = gtk_h.g_error_matches(handle(), domain.getValue(), code);
        return (RESULT != 0);
    }
    
}
