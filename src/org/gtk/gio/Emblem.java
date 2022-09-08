package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GEmblem is an implementation of #GIcon that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a #GEmblemedIcon.
 * 
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public class Emblem extends org.gtk.gobject.Object implements Icon {

    public Emblem(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Emblem */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        return new Emblem(gobject.getReference());
    }
    
    /**
     * Creates a new emblem for @icon.
     */
    public Emblem(Icon icon) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblem_new(icon.HANDLE()), true));
    }
    
    /**
     * Creates a new emblem for @icon.
     */
    public Emblem(Icon icon, EmblemOrigin origin) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblem_new_with_origin(icon.HANDLE(), origin.getValue()), true));
    }
    
    /**
     * Gives back the icon from @emblem.
     */
    public Icon getIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblem_get_icon(HANDLE());
        return new Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the origin of the emblem.
     */
    public EmblemOrigin getOrigin() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_emblem_get_origin(HANDLE());
        return EmblemOrigin.fromValue(RESULT);
    }
    
}
