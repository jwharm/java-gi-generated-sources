package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkTooltip} is an object representing a widget tooltip.
 * <p>
 * Basic tooltips can be realized simply by using
 * {@link Widget#setTooltipText} or
 * {@link Widget#setTooltipMarkup} without
 * any explicit tooltip object.
 * <p>
 * When you need a tooltip with a little more fancy contents,
 * like adding an image, or you want the tooltip to have different
 * contents per {@code GtkTreeView} row or cell, you will have to do a
 * little more work:
 * <p>
 * <ul>
 * <li>Set the {@code Gtk.Widget:has-tooltip} property to {@code true}.
 *   This will make GTK monitor the widget for motion and related events
 *   which are needed to determine when and where to show a tooltip.
 * </ul>
 * <p>
 * <ul>
 * <li>Connect to the {@code Gtk.Widget::query-tooltip} signal.
 *   This signal will be emitted when a tooltip is supposed to be shown.
 *   One of the arguments passed to the signal handler is a {@code GtkTooltip}
 *   object. This is the object that we are about to display as a tooltip,
 *   and can be manipulated in your callback using functions like
 *   {@link Tooltip#setIcon}. There are functions for setting
 *   the tooltip’s markup, setting an image from a named icon, or even
 *   putting in a custom widget.
 * </ul>
 * <p>
 * <ul>
 * <li>Return {@code true} from your ::query-tooltip handler. This causes the tooltip
 *   to be show. If you return {@code false}, it will not be shown.
 */
public class Tooltip extends org.gtk.gobject.Object {

    public Tooltip(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Tooltip */
    public static Tooltip castFrom(org.gtk.gobject.Object gobject) {
        return new Tooltip(gobject.refcounted());
    }
    
    /**
     * Replaces the widget packed into the tooltip with
     * {@code custom_widget}. {@code custom_widget} does not get destroyed when the tooltip goes
     * away.
     * By default a box with a {@code GtkImage} and {@code GtkLabel} is embedded in
     * the tooltip, which can be configured using gtk_tooltip_set_markup()
     * and gtk_tooltip_set_icon().
     */
    public void setCustom(Widget customWidget) {
        gtk_h.gtk_tooltip_set_custom(handle(), customWidget.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * {@code paintable}.  If {@code paintable} is {@code null}, the image will be hidden.
     */
    public void setIcon(org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_tooltip_set_icon(handle(), paintable.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text)
     * to be the icon indicated by {@code gicon} with the size indicated
     * by {@code size}. If {@code gicon} is {@code null}, the image will be hidden.
     */
    public void setIconFromGicon(org.gtk.gio.Icon gicon) {
        gtk_h.gtk_tooltip_set_icon_from_gicon(handle(), gicon.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * the icon indicated by {@code icon_name} with the size indicated
     * by {@code size}.  If {@code icon_name} is {@code null}, the image will be hidden.
     */
    public void setIconFromIconName(java.lang.String iconName) {
        gtk_h.gtk_tooltip_set_icon_from_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the text of the tooltip to be {@code markup}.
     * <p>
     * The string must be marked up with Pango markup.
     * If {@code markup} is {@code null}, the label will be hidden.
     */
    public void setMarkup(java.lang.String markup) {
        gtk_h.gtk_tooltip_set_markup(handle(), Interop.allocateNativeString(markup).handle());
    }
    
    /**
     * Sets the text of the tooltip to be {@code text}.
     * <p>
     * If {@code text} is {@code null}, the label will be hidden.
     * See also {@link Tooltip#setMarkup}.
     */
    public void setText(java.lang.String text) {
        gtk_h.gtk_tooltip_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets the area of the widget, where the contents of this tooltip apply,
     * to be {@code rect} (in widget coordinates).  This is especially useful for
     * properly setting tooltips on {@code GtkTreeView} rows and cells, {@code GtkIconViews},
     * etc.
     * <p>
     * For setting tooltips on {@code GtkTreeView}, please refer to the convenience
     * functions for this: gtk_tree_view_set_tooltip_row() and
     * gtk_tree_view_set_tooltip_cell().
     */
    public void setTipArea(org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_tooltip_set_tip_area(handle(), rect.handle());
    }
    
}
