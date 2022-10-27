package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <ul>
 * <li>Set the {@code Gtk.Widget:has-tooltip} property to {@code true}.
 *   This will make GTK monitor the widget for motion and related events
 *   which are needed to determine when and where to show a tooltip.
 * </ul>
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
 * <ul>
 * <li>Return {@code true} from your ::query-tooltip handler. This causes the tooltip
 *   to be show. If you return {@code false}, it will not be shown.
 * </ul>
 */
public class Tooltip extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
     * @param customWidget a {@code GtkWidget}, or {@code null} to unset the old custom widget.
     */
    public void setCustom(@Nullable org.gtk.gtk.Widget customWidget) {
        java.util.Objects.requireNonNullElse(customWidget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_custom.invokeExact(handle(), customWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * {@code paintable}.  If {@code paintable} is {@code null}, the image will be hidden.
     * @param paintable a {@code GdkPaintable}
     */
    public void setIcon(@Nullable org.gtk.gdk.Paintable paintable) {
        java.util.Objects.requireNonNullElse(paintable, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_icon.invokeExact(handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text)
     * to be the icon indicated by {@code gicon} with the size indicated
     * by {@code size}. If {@code gicon} is {@code null}, the image will be hidden.
     * @param gicon a {@code GIcon} representing the icon
     */
    public void setIconFromGicon(@Nullable org.gtk.gio.Icon gicon) {
        java.util.Objects.requireNonNullElse(gicon, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_icon_from_gicon.invokeExact(handle(), gicon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * the icon indicated by {@code icon_name} with the size indicated
     * by {@code size}.  If {@code icon_name} is {@code null}, the image will be hidden.
     * @param iconName an icon name
     */
    public void setIconFromIconName(@Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNullElse(iconName, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_icon_from_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the tooltip to be {@code markup}.
     * <p>
     * The string must be marked up with Pango markup.
     * If {@code markup} is {@code null}, the label will be hidden.
     * @param markup a string with Pango markup or {@code NLL}
     */
    public void setMarkup(@Nullable java.lang.String markup) {
        java.util.Objects.requireNonNullElse(markup, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_markup.invokeExact(handle(), Interop.allocateNativeString(markup));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the tooltip to be {@code text}.
     * <p>
     * If {@code text} is {@code null}, the label will be hidden.
     * See also {@link Tooltip#setMarkup}.
     * @param text a text string
     */
    public void setText(@Nullable java.lang.String text) {
        java.util.Objects.requireNonNullElse(text, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tooltip_set_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param rect a {@code GdkRectangle}
     */
    public void setTipArea(@NotNull org.gtk.gdk.Rectangle rect) {
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        try {
            DowncallHandles.gtk_tooltip_set_tip_area.invokeExact(handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tooltip_set_custom = Interop.downcallHandle(
            "gtk_tooltip_set_custom",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_icon = Interop.downcallHandle(
            "gtk_tooltip_set_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_icon_from_gicon = Interop.downcallHandle(
            "gtk_tooltip_set_icon_from_gicon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_icon_from_icon_name = Interop.downcallHandle(
            "gtk_tooltip_set_icon_from_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_markup = Interop.downcallHandle(
            "gtk_tooltip_set_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_text = Interop.downcallHandle(
            "gtk_tooltip_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tooltip_set_tip_area = Interop.downcallHandle(
            "gtk_tooltip_set_tip_area",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
