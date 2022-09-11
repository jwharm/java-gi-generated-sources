package org.gtk.gtk;

/**
 * The type of function that is used for deciding what fonts get
 * shown in a `GtkFontChooser`.
 * 
 * See [method@Gtk.FontChooser.set_filter_func].
 */
@FunctionalInterface
public interface FontFilterFunc {
        boolean onFontFilterFunc(org.pango.FontFamily family, org.pango.FontFace face);
}
