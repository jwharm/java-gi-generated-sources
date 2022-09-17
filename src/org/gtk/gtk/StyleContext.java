package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkStyleContext</code> stores styling information affecting a widget.
 * <p>
 * In order to construct the final style information, <code>GtkStyleContext</code>
 * queries information from all attached <code>GtkStyleProviders</code>. Style
 * providers can be either attached explicitly to the context through
 * {@link org.gtk.gtk.StyleContext#addProvider}, or to the display through
 * {@link Gtk#StyleContext}. The resulting
 * style is a combination of all providers&#8217; information in priority order.
 * <p>
 * For GTK widgets, any <code>GtkStyleContext</code> returned by
 * {@link org.gtk.gtk.Widget#getStyleContext} will already have a <code>GdkDisplay</code>
 * and RTL/LTR information set. The style context will also be updated
 * automatically if any of these settings change on the widget.
 * <p>
 * <h1>tyle Classes</h1>
 * <p>
 * Widgets can add style classes to their context, which can be used to associate
 * different styles by class. The documentation for individual widgets lists
 * which style classes it uses itself, and which style classes may be added by
 * applications to affect their appearance.
 * <p>
 * <h1>ustom styling in UI libraries and applications</h1>
 * <p>
 * If you are developing a library with custom widgets that render differently
 * than standard components, you may need to add a <code>GtkStyleProvider</code> yourself
 * with the <code>GTK_STYLE_PROVIDER_PRIORITY_FALLBACK</code> priority, either a<code>GtkCssProvider</code> or a custom object implementing the <code>GtkStyleProvider</code>
 * interface. This way themes may still attempt to style your UI elements in
 * a different way if needed so.
 * <p>
 * If you are using custom styling on an applications, you probably want then
 * to make your style information prevail to the theme&#8217;s, so you must use
 * a <code>GtkStyleProvider</code> with the <code>GTK_STYLE_PROVIDER_PRIORITY_APPLICATION
 * priority,</code> keep in mind that the user settings in<code>XDG_CONFIG_HOME/gtk-4.0/gtk.css</code> will
 * still take precedence over your changes, as it uses the
 * <code>GTK_STYLE_PROVIDER_PRIORITY_USER</code> priority.
 */
public class StyleContext extends org.gtk.gobject.Object {

    public StyleContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StyleContext */
    public static StyleContext castFrom(org.gtk.gobject.Object gobject) {
        return new StyleContext(gobject.getReference());
    }
    
    /**
     * Adds a style class to @context, so later uses of the
     * style context will make use of this new class for styling.
     * <p>
     * In the CSS file format, a <code>GtkEntry</code> defining a &#8220;search&#8221;
     * class, would be matched by:
     * <p><pre>css
     * entry.search { ... }
     * </pre>
     * <p>
     * While any widget defining a &#8220;search&#8221; class would be
     * matched by:<pre>css
     * .search { ... }
     * </pre>
     */
    public void addClass(java.lang.String className) {
        gtk_h.gtk_style_context_add_class(handle(), Interop.allocateNativeString(className).handle());
    }
    
    /**
     * Adds a style provider to @context, to be used in style construction.
     * <p>
     * Note that a style provider added by this function only affects
     * the style of the widget to which @context belongs. If you want
     * to affect the style of all widgets, use
     * {@link Gtk#StyleContext}.
     * <p>
     * Note: If both priorities are the same, a <code>GtkStyleProvider</code>
     * added through this function takes precedence over another added
     * through {@link Gtk#StyleContext}.
     */
    public void addProvider(StyleProvider provider, int priority) {
        gtk_h.gtk_style_context_add_provider(handle(), provider.handle(), priority);
    }
    
    /**
     * Gets the border for a given state as a <code>GtkBorder</code>.
     */
    public void getBorder(Border border) {
        gtk_h.gtk_style_context_get_border(handle(), border.handle());
    }
    
    /**
     * Gets the foreground color for a given state.
     */
    public void getColor(org.gtk.gdk.RGBA color) {
        gtk_h.gtk_style_context_get_color(handle(), color.handle());
    }
    
    /**
     * Returns the <code>GdkDisplay</code> to which @context is attached.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_style_context_get_display(handle());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the margin for a given state as a <code>GtkBorder</code>.
     */
    public void getMargin(Border margin) {
        gtk_h.gtk_style_context_get_margin(handle(), margin.handle());
    }
    
    /**
     * Gets the padding for a given state as a <code>GtkBorder</code>.
     */
    public void getPadding(Border padding) {
        gtk_h.gtk_style_context_get_padding(handle(), padding.handle());
    }
    
    /**
     * Returns the scale used for assets.
     */
    public int getScale() {
        var RESULT = gtk_h.gtk_style_context_get_scale(handle());
        return RESULT;
    }
    
    /**
     * Returns the state used for style matching.
     * <p>
     * This method should only be used to retrieve the <code>GtkStateFlags</code>
     * to pass to <code>GtkStyleContext</code> methods, like
     * {@link org.gtk.gtk.StyleContext#getPadding}.
     * If you need to retrieve the current state of a <code>GtkWidget</code>, use
     * {@link org.gtk.gtk.Widget#getStateFlags}.
     */
    public int getState() {
        var RESULT = gtk_h.gtk_style_context_get_state(handle());
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if @context currently has defined the
     * given class name.
     */
    public boolean hasClass(java.lang.String className) {
        var RESULT = gtk_h.gtk_style_context_has_class(handle(), Interop.allocateNativeString(className).handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks up and resolves a color name in the @context color map.
     */
    public boolean lookupColor(java.lang.String colorName, org.gtk.gdk.RGBA color) {
        var RESULT = gtk_h.gtk_style_context_lookup_color(handle(), Interop.allocateNativeString(colorName).handle(), color.handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes @class_name from @context.
     */
    public void removeClass(java.lang.String className) {
        gtk_h.gtk_style_context_remove_class(handle(), Interop.allocateNativeString(className).handle());
    }
    
    /**
     * Removes @provider from the style providers list in @context.
     */
    public void removeProvider(StyleProvider provider) {
        gtk_h.gtk_style_context_remove_provider(handle(), provider.handle());
    }
    
    /**
     * Restores @context state to a previous stage.
     * 
     * See {@link org.gtk.gtk.StyleContext#save}.
     */
    public void restore() {
        gtk_h.gtk_style_context_restore(handle());
    }
    
    /**
     * Saves the @context state.
     * 
     * This allows temporary modifications done through
     * {@link org.gtk.gtk.StyleContext#addClass},
     * {@link org.gtk.gtk.StyleContext#removeClass},
     * {@link org.gtk.gtk.StyleContext#setState} to be quickly
     * reverted in one go through {@link org.gtk.gtk.StyleContext#restore}.
     * 
     * The matching call to {@link org.gtk.gtk.StyleContext#restore}
     * must be done before GTK returns to the main loop.
     */
    public void save() {
        gtk_h.gtk_style_context_save(handle());
    }
    
    /**
     * Attaches @context to the given display.
     * <p>
     * The display is used to add style information from &#8220;global&#8221;
     * style providers, such as the display&#39;s <code>GtkSettings</code> instance.
     * <p>
     * If you are using a <code>GtkStyleContext</code> returned from
     * {@link org.gtk.gtk.Widget#getStyleContext}, you do not need to
     * call this yourself.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        gtk_h.gtk_style_context_set_display(handle(), display.handle());
    }
    
    /**
     * Sets the scale to use when getting image assets for the style.
     */
    public void setScale(int scale) {
        gtk_h.gtk_style_context_set_scale(handle(), scale);
    }
    
    /**
     * Sets the state to be used for style matching.
     */
    public void setState(int flags) {
        gtk_h.gtk_style_context_set_state(handle(), flags);
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
        var RESULT = gtk_h.gtk_style_context_to_string(handle(), flags);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds a global style provider to @display, which will be used
     * in style construction for all <code>GtkStyleContexts</code> under @display.
     * <p>
     * GTK uses this to make styling information from <code>GtkSettings</code>
     * available.
     * <p>
     * Note: If both priorities are the same, A <code>GtkStyleProvider</code>
     * added through {@link org.gtk.gtk.StyleContext#addProvider} takes
     * precedence over another added through this function.
     */
    public static void addProviderForDisplay(org.gtk.gdk.Display display, StyleProvider provider, int priority) {
        gtk_h.gtk_style_context_add_provider_for_display(display.handle(), provider.handle(), priority);
    }
    
    /**
     * Removes @provider from the global style providers list in @display.
     */
    public static void removeProviderForDisplay(org.gtk.gdk.Display display, StyleProvider provider) {
        gtk_h.gtk_style_context_remove_provider_for_display(display.handle(), provider.handle());
    }
    
}
