package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains information found when looking up an icon in <code>GtkIconTheme</code>.
 * <p><code>GtkIconPaintable</code> implements <code>GdkPaintable</code>.
 */
public class IconPaintable extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable, SymbolicPaintable {

    public IconPaintable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IconPaintable */
    public static IconPaintable castFrom(org.gtk.gobject.Object gobject) {
        return new IconPaintable(gobject.getReference());
    }
    
    private static Reference constructNewForFile(org.gtk.gio.File file, int size, int scale) {
        Reference RESULT = References.get(gtk_h.gtk_icon_paintable_new_for_file(file.handle(), size, scale), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkIconPaintable</code> for a file with a given size and scale.
     * <p>
     * The icon can then be rendered by using it as a <code>GdkPaintable</code>.
     */
    public static IconPaintable newForFile(org.gtk.gio.File file, int size, int scale) {
        return new IconPaintable(constructNewForFile(file, size, scale));
    }
    
    /**
     * Gets the <code>GFile</code> that was used to load the icon.
     * 
     * Returns <code>null</code> if the icon was not loaded from a file.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_icon_paintable_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Get the icon name being used for this icon.
     * 
     * When an icon looked up in the icon theme was not available, the
     * icon theme may use fallback icons - either those specified to
     * gtk_icon_theme_lookup_icon() or the always-available
     * &#34;image-missing&#34;. The icon chosen is returned by this function.
     * 
     * If the icon was created without an icon theme, this function
     * returns 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Get the icon name being used for this icon.
     * 
     * When an icon looked up in the icon theme was not available, the
     * icon theme may use fallback icons - either those specified to
     * gtk_icon_theme_lookup_icon() or the always-available
     * &#34;image-missing&#34;. The icon chosen is returned by this function.
     * 
     * If the icon was created without an icon theme, this function
     * returns %NULL.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_icon_paintable_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if the icon is symbolic or not.
     * <p>
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     * <p>
     * Note that to render a symbolic <code>GtkIconPaintable</code> properly (with
     * recoloring), you have to set its icon name on a <code>GtkImage</code>.
     */
    public boolean isSymbolic() {
        var RESULT = gtk_h.gtk_icon_paintable_is_symbolic(handle());
        return (RESULT != 0);
    }
    
}
