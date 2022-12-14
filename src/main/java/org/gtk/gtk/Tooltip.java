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
public class Tooltip extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTooltip";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Tooltip proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Tooltip(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Tooltip> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Tooltip(input);
    
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
        try {
            DowncallHandles.gtk_tooltip_set_custom.invokeExact(
                    handle(),
                    (Addressable) (customWidget == null ? MemoryAddress.NULL : customWidget.handle()));
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
        try {
            DowncallHandles.gtk_tooltip_set_icon.invokeExact(
                    handle(),
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
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
        try {
            DowncallHandles.gtk_tooltip_set_icon_from_gicon.invokeExact(
                    handle(),
                    (Addressable) (gicon == null ? MemoryAddress.NULL : gicon.handle()));
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tooltip_set_icon_from_icon_name.invokeExact(
                        handle(),
                        (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tooltip_set_markup.invokeExact(
                        handle(),
                        (Addressable) (markup == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(markup, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tooltip_set_text.invokeExact(
                        handle(),
                        (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setTipArea(org.gtk.gdk.Rectangle rect) {
        try {
            DowncallHandles.gtk_tooltip_set_tip_area.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tooltip_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Tooltip.Builder} object constructs a {@link Tooltip} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Tooltip.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Tooltip} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Tooltip}.
         * @return A new instance of {@code Tooltip} with the properties 
         *         that were set in the Builder object.
         */
        public Tooltip build() {
            return (Tooltip) org.gtk.gobject.GObject.newWithProperties(
                Tooltip.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tooltip_set_custom = Interop.downcallHandle(
                "gtk_tooltip_set_custom",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_icon = Interop.downcallHandle(
                "gtk_tooltip_set_icon",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_icon_from_gicon = Interop.downcallHandle(
                "gtk_tooltip_set_icon_from_gicon",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_icon_from_icon_name = Interop.downcallHandle(
                "gtk_tooltip_set_icon_from_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_markup = Interop.downcallHandle(
                "gtk_tooltip_set_markup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_text = Interop.downcallHandle(
                "gtk_tooltip_set_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_set_tip_area = Interop.downcallHandle(
                "gtk_tooltip_set_tip_area",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tooltip_get_type = Interop.downcallHandle(
                "gtk_tooltip_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tooltip_get_type != null;
    }
}
