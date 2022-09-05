package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontFace` is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 */
public class FontFace extends org.gtk.gobject.Object {

    public FontFace(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FontFace */
    public static FontFace castFrom(org.gtk.gobject.Object gobject) {
        return new FontFace(gobject.getProxy());
    }
    
    /**
     * Returns a font description that matches the face.
     * 
     * The resulting font description will have the family, style,
     * variant, weight and stretch of the face, but its size field
     * will be unset.
     */
    public FontDescription describe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_face_describe(HANDLE());
        return new FontDescription(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets a name representing the style of this face.
     * 
     * Note that a font family may contain multiple faces
     * with the same name (e.g. a variable and a non-variable
     * face for the same style).
     */
    public java.lang.String getFaceName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_face_get_face_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the `PangoFontFamily` that @face belongs to.
     */
    public FontFamily getFamily() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_face_get_family(HANDLE());
        return new FontFamily(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether a `PangoFontFace` is synthesized.
     * 
     * This will be the case if the underlying font rendering engine
     * creates this face from another face, by shearing, emboldening,
     * lightening or modifying it in some other way.
     */
    public boolean isSynthesized() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_face_is_synthesized(HANDLE());
        return (RESULT != 0);
    }
    
}
