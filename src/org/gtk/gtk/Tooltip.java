package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkTooltip</code> is an object representing a widget tooltip.
 * <p>
 * Basic tooltips can be realized simply by using
 * {@link org.gtk.gtk.Widget#setTooltipText} or
 * {@link org.gtk.gtk.Widget#setTooltipMarkup} without
 * any explicit tooltip object.
 * <p>
 * When you need a tooltip with a little more fancy contents,
 * like adding an image, or you want the tooltip to have different
 * contents per <code>GtkTreeView</code> row or cell, you will have to do a
 * little more work:
 * <p>
 * <li>Set the {@link [property@Gtk.Widget:has-tooltip] (ref=property)} property to <code>TRUE.
 * </code>  This will make GTK monitor the widget for motion and related events
 *   which are needed to determine when and where to show a tooltip.
 * <p>
 * <li>Connect to the {@link [signal@Gtk.Widget::query-tooltip] (ref=signal)} signal.
 *   This signal will be emitted when a tooltip is supposed to be shown.
 *   One of the arguments passed to the signal handler is a <code>GtkTooltip</code>
 *   object. This is the object that we are about to display as a tooltip,
 *   and can be manipulated in your callback using functions like
 *   {@link org.gtk.gtk.Tooltip#setIcon}. There are functions for setting
 *   the tooltip&#8217;s markup, setting an image from a named icon, or even
 *   putting in a custom widget.
 * 
 * - Return <code>true</code> from your ::query-tooltip handler. This causes the tooltip
 *   to be show. If you return <code>FALSE,</code> it will not be shown.
 */
public class Tooltip extends org.gtk.gobject.Object {

    public Tooltip(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Tooltip */
    public static Tooltip castFrom(org.gtk.gobject.Object gobject) {
        return new Tooltip(gobject.getReference());
    }
    
    /**
     * Replaces the widget packed into the tooltip with
     * @custom_widget. @custom_widget does not get destroyed when the tooltip goes
     * away.
     * By default a box with a <code>GtkImage</code> and <code>GtkLabel</code> is embedded in
     * the tooltip, which can be configured using gtk_tooltip_set_markup()
     * and gtk_tooltip_set_icon().
     */
    public void setCustom(Widget customWidget) {
        gtk_h.gtk_tooltip_set_custom(handle(), customWidget.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * @paintable.  If @paintable is <code>NULL,</code> the image will be hidden.
     */
    public void setIcon(org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_tooltip_set_icon(handle(), paintable.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text)
     * to be the icon indicated by @gicon with the size indicated
     * by @size. If @gicon is <code>NULL,</code> the image will be hidden.
     */
    public void setIconFromGicon(org.gtk.gio.Icon gicon) {
        gtk_h.gtk_tooltip_set_icon_from_gicon(handle(), gicon.handle());
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * the icon indicated by @icon_name with the size indicated
     * by @size.  If @icon_name is <code>NULL,</code> the image will be hidden.
     */
    public void setIconFromIconName(java.lang.String iconName) {
        gtk_h.gtk_tooltip_set_icon_from_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the text of the tooltip to be @markup.
     * 
     * The string must be marked up with Pango markup.
     * If @markup is <code>NULL,</code> the label will be hidden.
     */
    public void setMarkup(java.lang.String markup) {
        gtk_h.gtk_tooltip_set_markup(handle(), Interop.allocateNativeString(markup).handle());
    }
    
    /**
     * Sets the text of the tooltip to be @text.
     * 
     * If @text is <code>NULL,</code> the label will be hidden.
     * See also {@link org.gtk.gtk.Tooltip#setMarkup}.
     */
    public void setText(java.lang.String text) {
        gtk_h.gtk_tooltip_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets the area of the widget, where the contents of this tooltip apply,
     * to be @rect (in widget coordinates).  This is especially useful for
     * properly setting tooltips on <code>GtkTreeView</code> rows and cells, <code>GtkIconViews</code>,
     * etc.
     * <p>
     * For setting tooltips on <code>GtkTreeView</code>, please refer to the convenience
     * functions for this: gtk_tree_view_set_tooltip_row() and
     * gtk_tree_view_set_tooltip_cell().
     */
    public void setTipArea(org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_tooltip_set_tip_area(handle(), rect.handle());
    }
    
}
