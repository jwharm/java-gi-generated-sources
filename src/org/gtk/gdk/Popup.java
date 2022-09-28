package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkPopup} is a surface that is attached to another surface.
 * <p>
 * The {@code GdkPopup} is positioned relative to its parent surface.
 * <p>
 * {@code GdkPopup}s are typically used to implement menus and similar popups.
 * They can be modal, which is indicated by the {@code GdkPopup:autohide}
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
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     */
    public default Gravity getRectAnchor() {
        var RESULT = gtk_h.gdk_popup_get_rect_anchor(handle());
        return new Gravity(RESULT);
    }
    
    /**
     * Gets the current popup surface anchor.
     * <p>
     * The value returned may change after calling {@link Popup#present},
     * or after the {@code Gdk.Surface::layout} signal is emitted.
     */
    public default Gravity getSurfaceAnchor() {
        var RESULT = gtk_h.gdk_popup_get_surface_anchor(handle());
        return new Gravity(RESULT);
    }
    
    /**
     * Present {@code popup} after having processed the {@code GdkPopupLayout} rules.
     * <p>
     * If the popup was previously now showing, it will be showed,
     * otherwise it will change position according to {@code layout}.
     * <p>
     * After calling this function, the result should be handled in response
     * to the {@code GdkSurface::layout} signal being emitted. The resulting
     * popup position can be queried using {@link Popup#getPositionX},
     * {@link Popup#getPositionY}, and the resulting size will be sent as
     * parameters in the layout signal. Use {@link Popup#getRectAnchor}
     * and {@link Popup#getSurfaceAnchor} to get the resulting anchors.
     * <p>
     * Presenting may fail, for example if the {@code popup} is set to autohide
     * and is immediately hidden upon being presented. If presenting failed,
     * the {@code Gdk.Surface::layout} signal will not me emitted.
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
