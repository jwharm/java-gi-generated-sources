package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkPopup</code> is a surface that is attached to another surface.
 * <p>
 * The <code>GdkPopup</code> is positioned relative to its parent surface.
 * <p><code>GdkPopup</code>s are typically used to implement menus and similar popups.
 * They can be modal, which is indicated by the {@link [property@GdkPopup:autohide] (ref=property)}
 * property.
 */
public interface Popup extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Returns whether this popup is set to hide on outside clicks.
     */
    public default boolean getAutohide() {
        var RESULT = gtk_h.gdk_popup_get_autohide(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the parent surface of a popup.
     */
    public default Surface getParent() {
        var RESULT = gtk_h.gdk_popup_get_parent(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    public default int getPositionX() {
        var RESULT = gtk_h.gdk_popup_get_position_x(handle());
        return RESULT;
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    public default int getPositionY() {
        var RESULT = gtk_h.gdk_popup_get_position_y(handle());
        return RESULT;
    }
    
    /**
     * Gets the current popup rectangle anchor.
     * 
     * The value returned may change after calling {@link org.gtk.gdk.Popup<code>#present</code> ,
     * or after the {@link [signal@Gdk.Surface::layout] (ref=signal)} signal is emitted.
     */
    public default Gravity getRectAnchor() {
        var RESULT = gtk_h.gdk_popup_get_rect_anchor(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Gets the current popup surface anchor.
     * 
     * The value returned may change after calling {@link org.gtk.gdk.Popup<code>#present</code> ,
     * or after the {@link [signal@Gdk.Surface::layout] (ref=signal)} signal is emitted.
     */
    public default Gravity getSurfaceAnchor() {
        var RESULT = gtk_h.gdk_popup_get_surface_anchor(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Present @popup after having processed the <code>GdkPopupLayout</code> rules.
     * 
     * If the popup was previously now showing, it will be showed,
     * otherwise it will change position according to @layout.
     * 
     * After calling this function, the result should be handled in response
     * to the {@link [signal@GdkSurface::layout] (ref=signal)} signal being emitted. The resulting
     * popup position can be queried using {@link org.gtk.gdk.Popup<code>#getPositionX</code> ,
     * {@link org.gtk.gdk.Popup<code>#getPositionY</code> , and the resulting size will be sent as
     * parameters in the layout signal. Use {@link org.gtk.gdk.Popup<code>#getRectAnchor</code> 
     * and {@link org.gtk.gdk.Popup<code>#getSurfaceAnchor</code>  to get the resulting anchors.
     * 
     * Presenting may fail, for example if the @popup is set to autohide
     * and is immediately hidden upon being presented. If presenting failed,
     * the {@link [signal@Gdk.Surface::layout] (ref=signal)} signal will not me emitted.
     */
    public default boolean present(int width, int height, PopupLayout layout) {
        var RESULT = gtk_h.gdk_popup_present(handle(), width, height, layout.handle());
        return (RESULT != 0);
    }
    
    class PopupImpl extends org.gtk.gobject.Object implements Popup {
        public PopupImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
