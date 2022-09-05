package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GError` structure contains information about
 * an error that has occurred.
 */
public class Error extends io.github.jwharm.javagi.interop.ResourceBase {

    public Error(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GError; unlike g_error_new(), @message is
     * not a printf()-style format string. Use this function if
     * @message contains text you don't have control over,
     * that could include printf() escape sequences.
     */
    public Error(Quark domain, int code, java.lang.String message) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_new_literal(domain.getValue(), code, Interop.getAllocator().allocateUtf8String(message)), true));
    }
    
    /**
     * Creates a new #GError with the given @domain and @code,
     * and a message formatted with @format.
     */
    public Error(Quark domain, int code, java.lang.String format, VaList args) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_new_valist(domain.getValue(), code, Interop.getAllocator().allocateUtf8String(format), args), true));
    }
    
    /**
     * Makes a copy of @error.
     */
    public Error copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_copy(HANDLE());
        return new Error(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Frees a #GError and associated resources.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_free(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_matches(HANDLE(), domain.getValue(), code);
        return (RESULT != 0);
    }
    
}
