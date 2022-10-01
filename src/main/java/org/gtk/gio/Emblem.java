package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Emblem} is an implementation of {@link Icon} that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a {@link EmblemedIcon}.
 * <p>
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public class Emblem extends org.gtk.gobject.Object implements Icon {

    public Emblem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Emblem */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        return new Emblem(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Icon icon) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_emblem_new(icon.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     */
    public Emblem(Icon icon) {
        super(constructNew(icon));
    }
    
    private static Refcounted constructNewWithOrigin(Icon icon, EmblemOrigin origin) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_emblem_new_with_origin(icon.handle(), origin.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     */
    public static Emblem newWithOrigin(Icon icon, EmblemOrigin origin) {
        return new Emblem(constructNewWithOrigin(icon, origin));
    }
    
    /**
     * Gives back the icon from {@code emblem}.
     */
    public Icon getIcon() {
        var RESULT = gtk_h.g_emblem_get_icon(handle());
        return new Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the origin of the emblem.
     */
    public EmblemOrigin getOrigin() {
        var RESULT = gtk_h.g_emblem_get_origin(handle());
        return new EmblemOrigin(RESULT);
    }
    
}
