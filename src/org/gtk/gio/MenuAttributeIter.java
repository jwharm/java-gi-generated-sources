package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMenuAttributeIter is an opaque structure type.  You must access it
 * using the functions below.
 */
public class MenuAttributeIter extends org.gtk.gobject.Object {

    public MenuAttributeIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MenuAttributeIter */
    public static MenuAttributeIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuAttributeIter(gobject.getReference());
    }
    
    /**
     * Gets the name of the attribute at the current iterator position, as
     * a string.
     * 
     * The iterator is not advanced.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_menu_attribute_iter_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function combines g_menu_attribute_iter_next() with
     * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value().
     * 
     * First the iterator is advanced to the next (possibly first) attribute.
     * If that fails, then <code>false</code> is returned and there are no other
     * effects.
     * 
     * If successful, @name and @value are set to the name and value of the
     * attribute that has just been advanced to.  At this point,
     * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value() will
     * return the same values again.
     * 
     * The value returned in @name remains valid for as long as the iterator
     * remains at the current position.  The value returned in @value must
     * be unreffed using g_variant_unref() when it is no longer in use.
     */
    public boolean getNext(java.lang.String[] outName, org.gtk.glib.Variant[] value) {
        var RESULT = gtk_h.g_menu_attribute_iter_get_next(handle(), Interop.allocateNativeArray(outName).handle(), Interop.allocateNativeArray(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the attribute at the current iterator position.
     * 
     * The iterator is not advanced.
     */
    public org.gtk.glib.Variant getValue() {
        var RESULT = gtk_h.g_menu_attribute_iter_get_value(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Attempts to advance the iterator to the next (possibly first)
     * attribute.
     * 
     * <code>true</code> is returned on success, or <code>false</code> if there are no more
     * attributes.
     * 
     * You must call this function when you first acquire the iterator
     * to advance it to the first attribute (and determine if the first
     * attribute exists at all).
     */
    public boolean next() {
        var RESULT = gtk_h.g_menu_attribute_iter_next(handle());
        return (RESULT != 0);
    }
    
}
