package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMenuLinkIter is an opaque structure type.  You must access it using
 * the functions below.
 */
public class MenuLinkIter extends org.gtk.gobject.Object {

    public MenuLinkIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MenuLinkIter */
    public static MenuLinkIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuLinkIter(gobject.getProxy());
    }
    
    /**
     * Gets the name of the link at the current iterator position.
     * 
     * The iterator is not advanced.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_link_iter_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function combines g_menu_link_iter_next() with
     * g_menu_link_iter_get_name() and g_menu_link_iter_get_value().
     * 
     * First the iterator is advanced to the next (possibly first) link.
     * If that fails, then %FALSE is returned and there are no other effects.
     * 
     * If successful, @out_link and @value are set to the name and #GMenuModel
     * of the link that has just been advanced to.  At this point,
     * g_menu_link_iter_get_name() and g_menu_link_iter_get_value() will return the
     * same values again.
     * 
     * The value returned in @out_link remains valid for as long as the iterator
     * remains at the current position.  The value returned in @value must
     * be unreffed using g_object_unref() when it is no longer in use.
     */
    public boolean getNext(java.lang.String[] outLink, MenuModel[] value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_link_iter_get_next(HANDLE(), Interop.allocateNativeArray(outLink), Interop.allocateNativeArray(value));
        return (RESULT != 0);
    }
    
    /**
     * Gets the linked #GMenuModel at the current iterator position.
     * 
     * The iterator is not advanced.
     */
    public MenuModel getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_link_iter_get_value(HANDLE());
        return new MenuModel(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Attempts to advance the iterator to the next (possibly first)
     * link.
     * 
     * %TRUE is returned on success, or %FALSE if there are no more links.
     * 
     * You must call this function when you first acquire the iterator to
     * advance it to the first link (and determine if the first link exists
     * at all).
     */
    public boolean next() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_link_iter_next(HANDLE());
        return (RESULT != 0);
    }
    
}
