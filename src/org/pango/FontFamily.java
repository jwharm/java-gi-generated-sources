package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoFontFamily</code> is used to represent a family of related
 * font faces.
 * 
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
     * Gets the <code>PangoFontFace</code> of @family with the given name.
     */
    public FontFace getFace(java.lang.String name) {
        var RESULT = gtk_h.pango_font_family_get_face(handle(), Interop.allocateNativeString(name).handle());
        return new FontFace(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the family.
     * <p>
     * The name is unique among all fonts for the font backend and can
     * be used in a <code>PangoFontDescription</code> to specify that a face from
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
     * {@link org.pango.FontMetrics<code>#getApproximateDigitWidth</code> , since the
     * results of {@link org.pango.FontMetrics<code>#getApproximateCharWidth</code>  may
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
     * {@link org.pango.FontDescription<code>#setVariations</code>  for more information.
     */
    public boolean isVariable() {
        var RESULT = gtk_h.pango_font_family_is_variable(handle());
        return (RESULT != 0);
    }
    
}
