package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public Emblem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Emblem */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        return new Emblem(gobject.getReference());
    }
    
    private static Reference constructNew(Icon icon) {
        Reference RESULT = References.get(gtk_h.g_emblem_new(icon.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     */
    public Emblem(Icon icon) {
        super(constructNew(icon));
    }
    
    private static Reference constructNewWithOrigin(Icon icon, EmblemOrigin origin) {
        Reference RESULT = References.get(gtk_h.g_emblem_new_with_origin(icon.handle(), origin.getValue()), true);
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
        return new Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the origin of the emblem.
     */
    public EmblemOrigin getOrigin() {
        var RESULT = gtk_h.g_emblem_get_origin(handle());
        return EmblemOrigin.fromValue(RESULT);
    }
    
}
