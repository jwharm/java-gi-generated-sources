package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GError` structure contains information about
 * an error that has occurred.
 */
public class Error extends io.github.jwharm.javagi.interop.ResourceBase {

    public Error(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new #GError; unlike g_error_new(), @message is
     * not a printf()-style format string. Use this function if
     * @message contains text you don't have control over,
     * that could include printf() escape sequences.
     */
    public Error(Quark domain, int code, java.lang.String message) {
        super(References.get(gtk_h.g_error_new_literal(domain.getValue(), code, Interop.allocateNativeString(message).handle()), true));
    }
    
    /**
     * Creates a new #GError with the given @domain and @code,
     * and a message formatted with @format.
     */
    public Error(Quark domain, int code, java.lang.String format, VaList args) {
        super(References.get(gtk_h.g_error_new_valist(domain.getValue(), code, Interop.allocateNativeString(format).handle(), args), true));
    }
    
    /**
     * Makes a copy of @error.
     */
    public Error copy() {
        var RESULT = gtk_h.g_error_copy(handle());
        return new Error(References.get(RESULT, true));
    }
    
    /**
     * Frees a #GError and associated resources.
     */
    public void free() {
        gtk_h.g_error_free(handle());
    }
    
    /**
     * Returns %TRUE if @error matches @domain and @code, %FALSE
     * otherwise. In particular, when @error is %NULL, %FALSE will
     * be returned.
     * 
     * If @domain contains a `FAILED` (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the `FAILED` code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     */
    public boolean matches(Quark domain, int code) {
        var RESULT = gtk_h.g_error_matches(handle(), domain.getValue(), code);
        return (RESULT != 0);
    }
    
}
