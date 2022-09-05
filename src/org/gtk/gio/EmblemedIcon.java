package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GEmblemedIcon is an implementation of #GIcon that supports
 * adding an emblem to an icon. Adding multiple emblems to an
 * icon is ensured via g_emblemed_icon_add_emblem().
 * 
 * Note that #GEmblemedIcon allows no control over the position
 * of the emblems. See also #GEmblem for more information.
 */
public class EmblemedIcon extends org.gtk.gobject.Object implements Icon {

    public EmblemedIcon(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to EmblemedIcon */
    public static EmblemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new EmblemedIcon(gobject.getProxy());
    }
    
    /**
     * Creates a new emblemed icon for @icon with the emblem @emblem.
     */
    public EmblemedIcon(Icon icon, Emblem emblem) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblemed_icon_new(icon.HANDLE(), emblem.HANDLE()), true));
    }
    
    /**
     * Adds @emblem to the #GList of #GEmblems.
     */
    public void addEmblem(Emblem emblem) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblemed_icon_add_emblem(HANDLE(), emblem.HANDLE());
    }
    
    /**
     * Removes all the emblems from @icon.
     */
    public void clearEmblems() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblemed_icon_clear_emblems(HANDLE());
    }
    
    /**
     * Gets the list of emblems for the @icon.
     */
    public org.gtk.glib.List getEmblems() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblemed_icon_get_emblems(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the main icon for @emblemed.
     */
    public Icon getIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblemed_icon_get_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
}
