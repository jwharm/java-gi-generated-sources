package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
 * 
 * A `PangoFontset` is the result of resolving a `PangoFontDescription`
 * against a particular `PangoContext`. It has operations for finding the
 * component font for a particular Unicode character, and for finding a
 * composite set of metrics for the entire fontset.
 */
public class Fontset extends org.gtk.gobject.Object {

    public Fontset(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Fontset */
    public static Fontset castFrom(org.gtk.gobject.Object gobject) {
        return new Fontset(gobject.getProxy());
    }
    
    /**
     * Returns the font in the fontset that contains the best
     * glyph for a Unicode character.
     */
    public Font getFont(int wc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_fontset_get_font(HANDLE(), wc);
        return new Font(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Get overall metric information for the fonts in the fontset.
     */
    public FontMetrics getMetrics() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_fontset_get_metrics(HANDLE());
        return new FontMetrics(ProxyFactory.getProxy(RESULT, true));
    }
    
}
