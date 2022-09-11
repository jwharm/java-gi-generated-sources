package org.gtk.gtk;

@FunctionalInterface
public interface FontFilterFunc {

        void onFontFilterFunc(org.pango.FontFamily family, org.pango.FontFace face);
}
