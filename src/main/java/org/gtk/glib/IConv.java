package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * private data and should only be accessed using the following functions.
 */
public class IConv extends io.github.jwharm.javagi.ResourceBase {

    public IConv(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Same as the standard UNIX routine iconv(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     * <p>
     * Note that the behaviour of iconv() for characters which are valid in the
     * input character set, but which have no representation in the output character
     * set, is implementation defined. This function may return success (with a
     * positive number of non-reversible conversions as replacement characters were
     * used), or it may return -1 and set an error such as {@code EILSEQ}, in such a
     * situation.
     */
    public long gIconv(java.lang.String[] inbuf, PointerLong inbytesLeft, java.lang.String[] outbuf, PointerLong outbytesLeft) {
        var RESULT = gtk_h.g_iconv(handle(), Interop.allocateNativeArray(inbuf).handle(), inbytesLeft.handle(), Interop.allocateNativeArray(outbuf).handle(), outbytesLeft.handle());
        return RESULT;
    }
    
    /**
     * Same as the standard UNIX routine iconv_close(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation. Should be called to clean up
     * the conversion descriptor from g_iconv_open() when
     * you are done converting things.
     * <p>
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
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public static IConv open(java.lang.String toCodeset, java.lang.String fromCodeset) {
        var RESULT = gtk_h.g_iconv_open(Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle());
        return new IConv(References.get(RESULT, false));
    }
    
}
