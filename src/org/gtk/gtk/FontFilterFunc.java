package org.gtk.gtk;

@FunctionalInterface
public interface FontFilterFunc {

    /**
     * The type of function that is used for deciding what fonts get
     * shown in a `GtkFontChooser`.
     * 
     * See [method@Gtk.FontChooser.set_filter_func].
     */
    public boolean onFontFilterFunc(org.pango.FontFamily family, org.pango.FontFace face, jdk.incubator.foreign.MemoryAddress data);
}
