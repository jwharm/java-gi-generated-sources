package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFontFamily} is used to represent a family of related
 * font faces.
 * <p>
 * The font faces in a family share a common design, but differ in
 * slant, weight, width or other aspects.
 */
public class FontFamily extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FontFamily(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontFamily */
    public static FontFamily castFrom(org.gtk.gobject.Object gobject) {
        return new FontFamily(gobject.getReference());
    }
    
    /**
     * Gets the {@code PangoFontFace} of {@code family} with the given name.
     */
    public FontFace getFace(java.lang.String name) {
        var RESULT = gtk_h.pango_font_family_get_face(handle(), Interop.allocateNativeString(name).handle());
        return new FontFace(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the family.
     * <p>
     * The name is unique among all fonts for the font backend and can
     * be used in a {@code PangoFontDescription} to specify that a face from
     * this family is desired.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.pango_font_family_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * A monospace font is a font designed for text display where the the
     * characters form a regular grid.
     * <p>
     * For Western languages this would
     * mean that the advance width of all characters are the same, but
     * this categorization also includes Asian fonts which include
     * double-width characters: characters that occupy two grid cells.
     * g_unichar_iswide() returns a result that indicates whether a
     * character is typically double-width in a monospace font.
     * <p>
     * The best way to find out the grid-cell size is to call
     * {@link FontMetrics#getApproximateDigitWidth}, since the
     * results of {@link FontMetrics#getApproximateCharWidth} may
     * be affected by double-width characters.
     */
    public boolean isMonospace() {
        var RESULT = gtk_h.pango_font_family_is_monospace(handle());
        return RESULT != 0;
    }
    
    /**
     * A variable font is a font which has axes that can be modified to
     * produce different faces.
     * <p>
     * Such axes are also known as _variations_; see
     * {@link FontDescription#setVariations} for more information.
     */
    public boolean isVariable() {
        var RESULT = gtk_h.pango_font_family_is_variable(handle());
        return RESULT != 0;
    }
    
    /**
     * Lists the different font faces that make up {@code family}.
     * <p>
     * The faces in a family share a common design, but differ in slant, weight,
     * width and other aspects.
     * <p>
     * Note that the returned faces are not in any particular order, and
     * multiple faces may have the same name or characteristics.
     * <p>
     * {@code PangoFontFamily} also implemented the {@code Gio.ListModel} interface
     * for enumerating faces.
     */
    public void listFaces(FontFace[] faces, PointerInteger nFaces) {
        gtk_h.pango_font_family_list_faces(handle(), Interop.allocateNativeArray(faces).handle(), nFaces.handle());
    }
    
}
