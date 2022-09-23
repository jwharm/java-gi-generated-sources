package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An auxiliary class used by {@link Leaflet}.
 */
public class LeafletPage extends org.gtk.gobject.Object {

    public LeafletPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LeafletPage */
    public static LeafletPage castFrom(org.gtk.gobject.Object gobject) {
        return new LeafletPage(gobject.getReference());
    }
    
    /**
     * Gets the leaflet child th which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_leaflet_page_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of {@code self}.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.adw_leaflet_page_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the child can be navigated to when folded.
     */
    public boolean getNavigatable() {
        var RESULT = gtk_h.adw_leaflet_page_get_navigatable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the name of the {@code self}.
     */
    public void setName(java.lang.String name) {
        gtk_h.adw_leaflet_page_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets whether {@code self} can be navigated to when folded.
     */
    public void setNavigatable(boolean navigatable) {
        gtk_h.adw_leaflet_page_set_navigatable(handle(), navigatable ? 1 : 0);
    }
    
}
