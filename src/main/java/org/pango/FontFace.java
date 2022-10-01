package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFontFace} is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 */
public class FontFace extends org.gtk.gobject.Object {

    public FontFace(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontFace */
    public static FontFace castFrom(org.gtk.gobject.Object gobject) {
        return new FontFace(gobject.getReference());
    }
    
    /**
     * Returns a font description that matches the face.
     * <p>
     * The resulting font description will have the family, style,
     * variant, weight and stretch of the face, but its size field
     * will be unset.
     */
    public FontDescription describe() {
        var RESULT = gtk_h.pango_font_face_describe(handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Gets a name representing the style of this face.
     * <p>
     * Note that a font family may contain multiple faces
     * with the same name (e.g. a variable and a non-variable
     * face for the same style).
     */
    public java.lang.String getFaceName() {
        var RESULT = gtk_h.pango_font_face_get_face_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@code PangoFontFamily} that {@code face} belongs to.
     */
    public FontFamily getFamily() {
        var RESULT = gtk_h.pango_font_face_get_family(handle());
        return new FontFamily(References.get(RESULT, false));
    }
    
    /**
     * Returns whether a {@code PangoFontFace} is synthesized.
     * <p>
     * This will be the case if the underlying font rendering engine
     * creates this face from another face, by shearing, emboldening,
     * lightening or modifying it in some other way.
     */
    public boolean isSynthesized() {
        var RESULT = gtk_h.pango_font_face_is_synthesized(handle());
        return RESULT != 0;
    }
    
    /**
     * List the available sizes for a font.
     * <p>
     * This is only applicable to bitmap fonts. For scalable fonts, stores
     * {@code null} at the location pointed to by {@code sizes} and 0 at the location pointed
     * to by {@code n_sizes}. The sizes returned are in Pango units and are sorted
     * in ascending order.
     */
    public void listSizes(int[] sizes, PointerInteger nSizes) {
        gtk_h.pango_font_face_list_sizes(handle(), Interop.allocateNativeArray(sizes).handle(), nSizes.handle());
    }
    
}
