package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GCharsetConverter is an implementation of #GConverter based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.Object implements Converter, Initable {

    public CharsetConverter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CharsetConverter */
    public static CharsetConverter castFrom(org.gtk.gobject.Object gobject) {
        return new CharsetConverter(gobject.getProxy());
    }
    
    /**
     * Gets the number of fallbacks that @converter has applied so far.
     */
    public int getNumFallbacks() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_charset_converter_get_num_fallbacks(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the #GCharsetConverter:use-fallback property.
     */
    public boolean getUseFallback() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_charset_converter_get_use_fallback(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the #GCharsetConverter:use-fallback property.
     */
    public void setUseFallback(boolean useFallback) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_charset_converter_set_use_fallback(HANDLE(), useFallback ? 1 : 0);
    }
    
}
