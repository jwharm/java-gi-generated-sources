package org.gtk.gtk;

/**
 * The type of function that is used for deciding what fonts get
 * shown in a {@code GtkFontChooser}.
 * <p>
 * See {@link FontChooser#setFilterFunc}.
 */
@FunctionalInterface
public interface FontFilterFunc {
        boolean onFontFilterFunc(org.pango.FontFamily family, org.pango.FontFace face);
}
