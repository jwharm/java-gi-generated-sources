package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link Squeezer}.
 */
public class SqueezerPage extends org.gtk.gobject.Object {

    public SqueezerPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SqueezerPage */
    public static SqueezerPage castFrom(org.gtk.gobject.Object gobject) {
        return new SqueezerPage(gobject.getReference());
    }
    
    /**
     * Returns the squeezer child to which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_squeezer_page_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is enabled.
     */
    public boolean getEnabled() {
        var RESULT = gtk_h.adw_squeezer_page_get_enabled(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code self} is enabled.
     */
    public void setEnabled(boolean enabled) {
        gtk_h.adw_squeezer_page_set_enabled(handle(), enabled ? 1 : 0);
    }
    
}
