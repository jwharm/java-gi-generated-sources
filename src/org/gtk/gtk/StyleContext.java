package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStyleContext` stores styling information affecting a widget.
 * 
 * In order to construct the final style information, `GtkStyleContext`
 * queries information from all attached `GtkStyleProviders`. Style
 * providers can be either attached explicitly to the context through
 * [method@Gtk.StyleContext.add_provider], or to the display through
 * [func@Gtk.StyleContext.add_provider_for_display]. The resulting
 * style is a combination of all providers’ information in priority order.
 * 
 * For GTK widgets, any `GtkStyleContext` returned by
 * [method@Gtk.Widget.get_style_context] will already have a `GdkDisplay`
 * and RTL/LTR information set. The style context will also be updated
 * automatically if any of these settings change on the widget.
 * 
 * # Style Classes
 * 
 * Widgets can add style classes to their context, which can be used to associate
 * different styles by class. The documentation for individual widgets lists
 * which style classes it uses itself, and which style classes may be added by
 * applications to affect their appearance.
 * 
 * # Custom styling in UI libraries and applications
 * 
 * If you are developing a library with custom widgets that render differently
 * than standard components, you may need to add a `GtkStyleProvider` yourself
 * with the %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK priority, either a
 * `GtkCssProvider` or a custom object implementing the `GtkStyleProvider`
 * interface. This way themes may still attempt to style your UI elements in
 * a different way if needed so.
 * 
 * If you are using custom styling on an applications, you probably want then
 * to make your style information prevail to the theme’s, so you must use
 * a `GtkStyleProvider` with the %GTK_STYLE_PROVIDER_PRIORITY_APPLICATION
 * priority, keep in mind that the user settings in
 * `XDG_CONFIG_HOME/gtk-4.0/gtk.css` will
 * still take precedence over your changes, as it uses the
 * %GTK_STYLE_PROVIDER_PRIORITY_USER priority.
 */
public class StyleContext extends org.gtk.gobject.Object {

    public StyleContext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StyleContext */
    public static StyleContext castFrom(org.gtk.gobject.Object gobject) {
        return new StyleContext(gobject.getProxy());
    }
    
    /**
     * Adds a style class to @context, so later uses of the
     * style context will make use of this new class for styling.
     * 
     * In the CSS file format, a `GtkEntry` defining a “search”
     * class, would be matched by:
     * 
     * ```css
     * entry.search { ... }
     * ```
     * 
     * While any widget defining a “search” class would be
     * matched by:
     * ```css
     * .search { ... }
     * ```
     */
    public void addClass(java.lang.String className) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_add_class(HANDLE(), Interop.getAllocator().allocateUtf8String(className));
    }
    
    /**
     * Adds a style provider to @context, to be used in style construction.
     * 
     * Note that a style provider added by this function only affects
     * the style of the widget to which @context belongs. If you want
     * to affect the style of all widgets, use
     * [func@Gtk.StyleContext.add_provider_for_display].
     * 
     * Note: If both priorities are the same, a `GtkStyleProvider`
     * added through this function takes precedence over another added
     * through [func@Gtk.StyleContext.add_provider_for_display].
     */
    public void addProvider(StyleProvider provider, int priority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_add_provider(HANDLE(), provider.HANDLE(), priority);
    }
    
    /**
     * Gets the border for a given state as a `GtkBorder`.
     */
    public void getBorder(Border border) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_border(HANDLE(), border.HANDLE());
    }
    
    /**
     * Gets the foreground color for a given state.
     */
    public void getColor(org.gtk.gdk.RGBA color) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_color(HANDLE(), color.HANDLE());
    }
    
    /**
     * Returns the `GdkDisplay` to which @context is attached.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_display(HANDLE());
        return new org.gtk.gdk.Display(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the margin for a given state as a `GtkBorder`.
     */
    public void getMargin(Border margin) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_margin(HANDLE(), margin.HANDLE());
    }
    
    /**
     * Gets the padding for a given state as a `GtkBorder`.
     */
    public void getPadding(Border padding) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_padding(HANDLE(), padding.HANDLE());
    }
    
    /**
     * Returns the scale used for assets.
     */
    public int getScale() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_scale(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the state used for style matching.
     * 
     * This method should only be used to retrieve the `GtkStateFlags`
     * to pass to `GtkStyleContext` methods, like
     * [method@Gtk.StyleContext.get_padding].
     * If you need to retrieve the current state of a `GtkWidget`, use
     * [method@Gtk.Widget.get_state_flags].
     */
    public int getState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_get_state(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if @context currently has defined the
     * given class name.
     */
    public boolean hasClass(java.lang.String className) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_has_class(HANDLE(), Interop.getAllocator().allocateUtf8String(className));
        return (RESULT != 0);
    }
    
    /**
     * Looks up and resolves a color name in the @context color map.
     */
    public boolean lookupColor(java.lang.String colorName, org.gtk.gdk.RGBA color) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_lookup_color(HANDLE(), Interop.getAllocator().allocateUtf8String(colorName), color.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Removes @class_name from @context.
     */
    public void removeClass(java.lang.String className) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_remove_class(HANDLE(), Interop.getAllocator().allocateUtf8String(className));
    }
    
    /**
     * Removes @provider from the style providers list in @context.
     */
    public void removeProvider(StyleProvider provider) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_remove_provider(HANDLE(), provider.HANDLE());
    }
    
    /**
     * Restores @context state to a previous stage.
     * 
     * See [method@Gtk.StyleContext.save].
     */
    public void restore() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_restore(HANDLE());
    }
    
    /**
     * Saves the @context state.
     * 
     * This allows temporary modifications done through
     * [method@Gtk.StyleContext.add_class],
     * [method@Gtk.StyleContext.remove_class],
     * [method@Gtk.StyleContext.set_state] to be quickly
     * reverted in one go through [method@Gtk.StyleContext.restore].
     * 
     * The matching call to [method@Gtk.StyleContext.restore]
     * must be done before GTK returns to the main loop.
     */
    public void save() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_save(HANDLE());
    }
    
    /**
     * Attaches @context to the given display.
     * 
     * The display is used to add style information from “global”
     * style providers, such as the display's `GtkSettings` instance.
     * 
     * If you are using a `GtkStyleContext` returned from
     * [method@Gtk.Widget.get_style_context], you do not need to
     * call this yourself.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_set_display(HANDLE(), display.HANDLE());
    }
    
    /**
     * Sets the scale to use when getting image assets for the style.
     */
    public void setScale(int scale) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_set_scale(HANDLE(), scale);
    }
    
    /**
     * Sets the state to be used for style matching.
     */
    public void setState(int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_set_state(HANDLE(), flags);
    }
    
    /**
     * Converts the style context into a string representation.
     * 
     * The string representation always includes information about
     * the name, state, id, visibility and style classes of the CSS
     * node that is backing @context. Depending on the flags, more
     * information may be included.
     * 
     * This function is intended for testing and debugging of the
     * CSS implementation in GTK. There are no guarantees about
     * the format of the returned string, it may change.
     */
    public java.lang.String toString(int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_style_context_to_string(HANDLE(), flags);
        return RESULT.getUtf8String(0);
    }
    
}