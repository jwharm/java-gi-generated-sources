package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link EmblemedIcon} is an implementation of {@link Icon} that supports
 * adding an emblem to an icon. Adding multiple emblems to an
 * icon is ensured via g_emblemed_icon_add_emblem().
 * <p>
 * Note that {@link EmblemedIcon} allows no control over the position
 * of the emblems. See also {@link Emblem} for more information.
 */
public class EmblemedIcon extends org.gtk.gobject.Object implements Icon {

    public EmblemedIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EmblemedIcon */
    public static EmblemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new EmblemedIcon(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Icon icon, Emblem emblem) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_emblemed_icon_new(icon.handle(), emblem.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new emblemed icon for {@code icon} with the emblem {@code emblem}.
     */
    public EmblemedIcon(Icon icon, Emblem emblem) {
        super(constructNew(icon, emblem));
    }
    
    /**
     * Adds {@code emblem} to the {@link org.gtk.glib.List} of {@code GEmblems}.
     */
    public void addEmblem(Emblem emblem) {
        gtk_h.g_emblemed_icon_add_emblem(handle(), emblem.handle());
    }
    
    /**
     * Removes all the emblems from {@code icon}.
     */
    public void clearEmblems() {
        gtk_h.g_emblemed_icon_clear_emblems(handle());
    }
    
    /**
     * Gets the list of emblems for the {@code icon}.
     */
    public org.gtk.glib.List getEmblems() {
        var RESULT = gtk_h.g_emblemed_icon_get_emblems(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the main icon for {@code emblemed}.
     */
    public Icon getIcon() {
        var RESULT = gtk_h.g_emblemed_icon_get_icon(handle());
        return new Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
}
