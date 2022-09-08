package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains information found when looking up an icon in `GtkIconTheme`.
 * 
 * `GtkIconPaintable` implements `GdkPaintable`.
 */
public class IconPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable, SymbolicPaintable {

    public IconPaintable(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IconPaintable */
    public static IconPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new IconPaintable(gobject.getReference());
    }
    
    /**
     * Creates a `GtkIconPaintable` for a file with a given size and scale.
     * 
     * The icon can then be rendered by using it as a `GdkPaintable`.
     */
    public IconPaintable(org.gtk.gio.File file, int size, int scale) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_paintable_new_for_file(file.HANDLE(), size, scale), true));
    }
    
    /**
     * Gets the `GFile` that was used to load the icon.
     * 
     * Returns %NULL if the icon was not loaded from a file.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_paintable_get_file(HANDLE());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Get the icon name being used for this icon.
     * 
     * When an icon looked up in the icon theme was not available, the
     * icon theme may use fallback icons - either those specified to
     * gtk_icon_theme_lookup_icon() or the always-available
     * "image-missing". The icon chosen is returned by this function.
     * 
     * If the icon was created without an icon theme, this function
     * returns %NULL.
     */
    public java.lang.String getIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_paintable_get_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if the icon is symbolic or not.
     * 
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     * 
     * Note that to render a symbolic `GtkIconPaintable` properly (with
     * recoloring), you have to set its icon name on a `GtkImage`.
     */
    public boolean isSymbolic() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_paintable_is_symbolic(HANDLE());
        return (RESULT != 0);
    }
    
}
