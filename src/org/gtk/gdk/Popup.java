package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkPopup` is a surface that is attached to another surface.
 * 
 * The `GdkPopup` is positioned relative to its parent surface.
 * 
 * `GdkPopup`s are typically used to implement menus and similar popups.
 * They can be modal, which is indicated by the [property@GdkPopup:autohide]
 * property.
 */
public interface Popup extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns whether this popup is set to hide on outside clicks.
     */
    public default boolean getAutohide() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_autohide(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the parent surface of a popup.
     */
    public default Surface getParent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_parent(HANDLE());
        return new Surface(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    public default int getPositionX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_position_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Obtains the position of the popup relative to its parent.
     */
    public default int getPositionY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_position_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the current popup rectangle anchor.
     * 
     * The value returned may change after calling [method@Gdk.Popup.present],
     * or after the [signal@Gdk.Surface::layout] signal is emitted.
     */
    public default Gravity getRectAnchor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_rect_anchor(HANDLE());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Gets the current popup surface anchor.
     * 
     * The value returned may change after calling [method@Gdk.Popup.present],
     * or after the [signal@Gdk.Surface::layout] signal is emitted.
     */
    public default Gravity getSurfaceAnchor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_get_surface_anchor(HANDLE());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Present @popup after having processed the `GdkPopupLayout` rules.
     * 
     * If the popup was previously now showing, it will be showed,
     * otherwise it will change position according to @layout.
     * 
     * After calling this function, the result should be handled in response
     * to the [signal@GdkSurface::layout] signal being emitted. The resulting
     * popup position can be queried using [method@Gdk.Popup.get_position_x],
     * [method@Gdk.Popup.get_position_y], and the resulting size will be sent as
     * parameters in the layout signal. Use [method@Gdk.Popup.get_rect_anchor]
     * and [method@Gdk.Popup.get_surface_anchor] to get the resulting anchors.
     * 
     * Presenting may fail, for example if the @popup is set to autohide
     * and is immediately hidden upon being presented. If presenting failed,
     * the [signal@Gdk.Surface::layout] signal will not me emitted.
     */
    public default boolean present(int width, int height, PopupLayout layout) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_popup_present(HANDLE(), width, height, layout.HANDLE());
        return (RESULT != 0);
    }
    
    class PopupImpl extends org.gtk.gobject.Object implements Popup {
        public PopupImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
