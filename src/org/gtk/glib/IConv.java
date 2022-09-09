package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * private data and should only be accessed using the following functions.
 */
public class IConv extends io.github.jwharm.javagi.interop.ResourceBase {

    public IConv(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Same as the standard UNIX routine iconv_close(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation. Should be called to clean up
     * the conversion descriptor from g_iconv_open() when
     * you are done converting things.
     * 
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public int close() {
        var RESULT = gtk_h.g_iconv_close(handle());
        return RESULT;
    }
    
    /**
     * Same as the standard UNIX routine iconv_open(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * 
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public static IConv open(java.lang.String toCodeset, java.lang.String fromCodeset) {
        var RESULT = gtk_h.g_iconv_open(Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle());
        return new IConv(References.get(RESULT, false));
    }
    
}
