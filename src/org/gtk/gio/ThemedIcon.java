package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GThemedIcon is an implementation of #GIcon that supports icon themes.
 * #GThemedIcon contains a list of all of the icons present in an icon
 * theme, so that icons can be looked up quickly. #GThemedIcon does
 * not provide actual pixmaps for icons, just the icon names.
 * Ideally something like gtk_icon_theme_choose_icon() should be used to
 * resolve the list of names so that fallback icons work nicely with
 * themes that inherit other themes.
 */
public class ThemedIcon extends org.gtk.gobject.Object implements Icon {

    public ThemedIcon(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ThemedIcon */
    public static ThemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new ThemedIcon(gobject.getProxy());
    }
    
    /**
     * Creates a new themed icon for @iconname.
     */
    public ThemedIcon(java.lang.String iconname) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_themed_icon_new(Interop.getAllocator().allocateUtf8String(iconname)), true));
    }
    
    /**
     * Creates a new themed icon for @iconnames.
     */
    public ThemedIcon(java.lang.String[] iconnames, int len) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_themed_icon_new_from_names(Interop.allocateNativeArray(iconnames), len), true));
    }
    
    /**
     * Creates a new themed icon for @iconname, and all the names
     * that can be created by shortening @iconname at '-' characters.
     * 
     * In the following example, @icon1 and @icon2 are equivalent:
     * |[<!-- language="C" -->
     * const char *names[] = {
     *   "gnome-dev-cdrom-audio",
     *   "gnome-dev-cdrom",
     *   "gnome-dev",
     *   "gnome"
     * };
     * 
     * icon1 = g_themed_icon_new_from_names (names, 4);
     * icon2 = g_themed_icon_new_with_default_fallbacks ("gnome-dev-cdrom-audio");
     * ]|
     */
    public static ThemedIcon newWithDefaultFallbacks(java.lang.String iconname) {
        return new ThemedIcon(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_themed_icon_new_with_default_fallbacks(Interop.getAllocator().allocateUtf8String(iconname)), true));
    }
    
    /**
     * Append a name to the list of icons from within @icon.
     * 
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     */
    public void appendName(java.lang.String iconname) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_themed_icon_append_name(HANDLE(), Interop.getAllocator().allocateUtf8String(iconname));
    }
    
    /**
     * Prepend a name to the list of icons from within @icon.
     * 
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     */
    public void prependName(java.lang.String iconname) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_themed_icon_prepend_name(HANDLE(), Interop.getAllocator().allocateUtf8String(iconname));
    }
    
}
