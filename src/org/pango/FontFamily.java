package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFontFamily` is used to represent a family of related
 * font faces.
 * 
 * The font faces in a family share a common design, but differ in
 * slant, weight, width or other aspects.
 */
public class FontFamily extends org.gtk.gobject.Object {

    public FontFamily(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FontFamily */
    public static FontFamily castFrom(org.gtk.gobject.Object gobject) {
        return new FontFamily(gobject.getReference());
    }
    
    /**
     * Gets the `PangoFontFace` of @family with the given name.
     */
    public FontFace getFace(java.lang.String name) {
        var RESULT = gtk_h.pango_font_family_get_face(handle(), Interop.allocateNativeString(name).handle());
        return new FontFace(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the family.
     * 
     * The name is unique among all fonts for the font backend and can
     * be used in a `PangoFontDescription` to specify that a face from
     * this family is desired.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.pango_font_family_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * A monospace font is a font designed for text display where the the
     * characters form a regular grid.
     * 
     * For Western languages this would
     * mean that the advance width of all characters are the same, but
     * this categorization also includes Asian fonts which include
     * double-width characters: characters that occupy two grid cells.
     * g_unichar_iswide() returns a result that indicates whether a
     * character is typically double-width in a monospace font.
     * 
     * The best way to find out the grid-cell size is to call
     * [method@Pango.FontMetrics.get_approximate_digit_width], since the
     * results of [method@Pango.FontMetrics.get_approximate_char_width] may
     * be affected by double-width characters.
     */
    public boolean isMonospace() {
        var RESULT = gtk_h.pango_font_family_is_monospace(handle());
        return (RESULT != 0);
    }
    
    /**
     * A variable font is a font which has axes that can be modified to
     * produce different faces.
     * 
     * Such axes are also known as _variations_; see
     * [method@Pango.FontDescription.set_variations] for more information.
     */
    public boolean isVariable() {
        var RESULT = gtk_h.pango_font_family_is_variable(handle());
        return (RESULT != 0);
    }
    
}
