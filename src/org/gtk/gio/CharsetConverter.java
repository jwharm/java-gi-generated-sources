package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link CharsetConverter} is an implementation of {@link Converter} based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.Object implements Converter, Initable {

    public CharsetConverter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CharsetConverter */
    public static CharsetConverter castFrom(org.gtk.gobject.Object gobject) {
        return new CharsetConverter(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_charset_converter_new(Interop.allocateNativeString(toCharset).handle(), Interop.allocateNativeString(fromCharset).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CharsetConverter}.
     */
    public CharsetConverter(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        super(constructNew(toCharset, fromCharset));
    }
    
    /**
     * Gets the number of fallbacks that {@code converter} has applied so far.
     */
    public int getNumFallbacks() {
        var RESULT = gtk_h.g_charset_converter_get_num_fallbacks(handle());
        return RESULT;
    }
    
    /**
     * Gets the {@link CharsetConverter}:use-fallback property.
     */
    public boolean getUseFallback() {
        var RESULT = gtk_h.g_charset_converter_get_use_fallback(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     */
    public void setUseFallback(boolean useFallback) {
        gtk_h.g_charset_converter_set_use_fallback(handle(), useFallback ? 1 : 0);
    }
    
}
