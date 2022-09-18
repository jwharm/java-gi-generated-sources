package org.gtk.gtk;

/**
 * The type of function that is used for deciding what fonts get
 * shown in a <code>GtkFontChooser</code>.
 * 
 * See {@link org.gtk.gtk.FontChooser<code>#setFilterFunc</code> .
 */
@FunctionalInterface
public interface FontFilterFunc {
        boolean onFontFilterFunc(org.pango.FontFamily family, org.pango.FontFace face);
}
