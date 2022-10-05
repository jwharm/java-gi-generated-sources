package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStyleContext} stores styling information affecting a widget.
 * <p>
 * In order to construct the final style information, {@code GtkStyleContext}
 * queries information from all attached {@code GtkStyleProviders}. Style
 * providers can be either attached explicitly to the context through
 * {@link StyleContext#addProvider}, or to the display through
 * {@link Gtk#StyleContext}. The resulting
 * style is a combination of all providers’ information in priority order.
 * <p>
 * For GTK widgets, any {@code GtkStyleContext} returned by
 * {@link Widget#getStyleContext} will already have a {@code GdkDisplay}
 * and RTL/LTR information set. The style context will also be updated
 * automatically if any of these settings change on the widget.
 * <p>
 * <h1>Style Classes</h1>
 * <p>
 * Widgets can add style classes to their context, which can be used to associate
 * different styles by class. The documentation for individual widgets lists
 * which style classes it uses itself, and which style classes may be added by
 * applications to affect their appearance.
 * <p>
 * <h1>Custom styling in UI libraries and applications</h1>
 * <p>
 * If you are developing a library with custom widgets that render differently
 * than standard components, you may need to add a {@code GtkStyleProvider} yourself
 * with the {@code GTK_STYLE_PROVIDER_PRIORITY_FALLBACK} priority, either a
 * {@code GtkCssProvider} or a custom object implementing the {@code GtkStyleProvider}
 * interface. This way themes may still attempt to style your UI elements in
 * a different way if needed so.
 * <p>
 * If you are using custom styling on an applications, you probably want then
 * to make your style information prevail to the theme’s, so you must use
 * a {@code GtkStyleProvider} with the {@code GTK_STYLE_PROVIDER_PRIORITY_APPLICATION}
 * priority, keep in mind that the user settings in
 * {@code XDG_CONFIG_HOME/gtk-4.0/gtk.css} will
 * still take precedence over your changes, as it uses the
 * {@code GTK_STYLE_PROVIDER_PRIORITY_USER} priority.
 */
public class StyleContext extends org.gtk.gobject.Object {

    public StyleContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StyleContext */
    public static StyleContext castFrom(org.gtk.gobject.Object gobject) {
        return new StyleContext(gobject.refcounted());
    }
    
    static final MethodHandle gtk_style_context_add_class = Interop.downcallHandle(
        "gtk_style_context_add_class",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a style class to {@code context}, so later uses of the
     * style context will make use of this new class for styling.
     * <p>
     * In the CSS file format, a {@code GtkEntry} defining a “search”
     * class, would be matched by:
     * <p>
     * <pre>{@code css
     * entry.search { ... }
     * }</pre>
     * <p>
     * While any widget defining a “search” class would be
     * matched by:
     * <pre>{@code css
     * .search { ... }
     * }</pre>
     */
    public void addClass(java.lang.String className) {
        try {
            gtk_style_context_add_class.invokeExact(handle(), Interop.allocateNativeString(className).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_add_provider = Interop.downcallHandle(
        "gtk_style_context_add_provider",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a style provider to {@code context}, to be used in style construction.
     * <p>
     * Note that a style provider added by this function only affects
     * the style of the widget to which {@code context} belongs. If you want
     * to affect the style of all widgets, use
     * {@link Gtk#StyleContext}.
     * <p>
     * Note: If both priorities are the same, a {@code GtkStyleProvider}
     * added through this function takes precedence over another added
     * through {@link Gtk#StyleContext}.
     */
    public void addProvider(StyleProvider provider, int priority) {
        try {
            gtk_style_context_add_provider.invokeExact(handle(), provider.handle(), priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_border = Interop.downcallHandle(
        "gtk_style_context_get_border",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the border for a given state as a {@code GtkBorder}.
     */
    public void getBorder(Border border) {
        try {
            gtk_style_context_get_border.invokeExact(handle(), border.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_color = Interop.downcallHandle(
        "gtk_style_context_get_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the foreground color for a given state.
     */
    public void getColor(org.gtk.gdk.RGBA color) {
        try {
            gtk_style_context_get_color.invokeExact(handle(), color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_display = Interop.downcallHandle(
        "gtk_style_context_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDisplay} to which {@code context} is attached.
     */
    public org.gtk.gdk.Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gtk_style_context_get_display.invokeExact(handle());
            return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_margin = Interop.downcallHandle(
        "gtk_style_context_get_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the margin for a given state as a {@code GtkBorder}.
     */
    public void getMargin(Border margin) {
        try {
            gtk_style_context_get_margin.invokeExact(handle(), margin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_padding = Interop.downcallHandle(
        "gtk_style_context_get_padding",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the padding for a given state as a {@code GtkBorder}.
     */
    public void getPadding(Border padding) {
        try {
            gtk_style_context_get_padding.invokeExact(handle(), padding.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_scale = Interop.downcallHandle(
        "gtk_style_context_get_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the scale used for assets.
     */
    public int getScale() {
        try {
            var RESULT = (int) gtk_style_context_get_scale.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_get_state = Interop.downcallHandle(
        "gtk_style_context_get_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the state used for style matching.
     * <p>
     * This method should only be used to retrieve the {@code GtkStateFlags}
     * to pass to {@code GtkStyleContext} methods, like
     * {@link StyleContext#getPadding}.
     * If you need to retrieve the current state of a {@code GtkWidget}, use
     * {@link Widget#getStateFlags}.
     */
    public StateFlags getState() {
        try {
            var RESULT = (int) gtk_style_context_get_state.invokeExact(handle());
            return new StateFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_has_class = Interop.downcallHandle(
        "gtk_style_context_has_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code context} currently has defined the
     * given class name.
     */
    public boolean hasClass(java.lang.String className) {
        try {
            var RESULT = (int) gtk_style_context_has_class.invokeExact(handle(), Interop.allocateNativeString(className).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_lookup_color = Interop.downcallHandle(
        "gtk_style_context_lookup_color",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up and resolves a color name in the {@code context} color map.
     */
    public boolean lookupColor(java.lang.String colorName, org.gtk.gdk.RGBA color) {
        try {
            var RESULT = (int) gtk_style_context_lookup_color.invokeExact(handle(), Interop.allocateNativeString(colorName).handle(), color.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_remove_class = Interop.downcallHandle(
        "gtk_style_context_remove_class",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code class_name} from {@code context}.
     */
    public void removeClass(java.lang.String className) {
        try {
            gtk_style_context_remove_class.invokeExact(handle(), Interop.allocateNativeString(className).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_remove_provider = Interop.downcallHandle(
        "gtk_style_context_remove_provider",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code provider} from the style providers list in {@code context}.
     */
    public void removeProvider(StyleProvider provider) {
        try {
            gtk_style_context_remove_provider.invokeExact(handle(), provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_restore = Interop.downcallHandle(
        "gtk_style_context_restore",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Restores {@code context} state to a previous stage.
     * <p>
     * See {@link StyleContext#save}.
     */
    public void restore() {
        try {
            gtk_style_context_restore.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_save = Interop.downcallHandle(
        "gtk_style_context_save",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Saves the {@code context} state.
     * <p>
     * This allows temporary modifications done through
     * {@link StyleContext#addClass},
     * {@link StyleContext#removeClass},
     * {@link StyleContext#setState} to be quickly
     * reverted in one go through {@link StyleContext#restore}.
     * <p>
     * The matching call to {@link StyleContext#restore}
     * must be done before GTK returns to the main loop.
     */
    public void save() {
        try {
            gtk_style_context_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_set_display = Interop.downcallHandle(
        "gtk_style_context_set_display",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attaches {@code context} to the given display.
     * <p>
     * The display is used to add style information from “global”
     * style providers, such as the display's {@code GtkSettings} instance.
     * <p>
     * If you are using a {@code GtkStyleContext} returned from
     * {@link Widget#getStyleContext}, you do not need to
     * call this yourself.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        try {
            gtk_style_context_set_display.invokeExact(handle(), display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_set_scale = Interop.downcallHandle(
        "gtk_style_context_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the scale to use when getting image assets for the style.
     */
    public void setScale(int scale) {
        try {
            gtk_style_context_set_scale.invokeExact(handle(), scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_set_state = Interop.downcallHandle(
        "gtk_style_context_set_state",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the state to be used for style matching.
     */
    public void setState(StateFlags flags) {
        try {
            gtk_style_context_set_state.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_to_string = Interop.downcallHandle(
        "gtk_style_context_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts the style context into a string representation.
     * <p>
     * The string representation always includes information about
     * the name, state, id, visibility and style classes of the CSS
     * node that is backing {@code context}. Depending on the flags, more
     * information may be included.
     * <p>
     * This function is intended for testing and debugging of the
     * CSS implementation in GTK. There are no guarantees about
     * the format of the returned string, it may change.
     */
    public java.lang.String toString(StyleContextPrintFlags flags) {
        try {
            var RESULT = (MemoryAddress) gtk_style_context_to_string.invokeExact(handle(), flags.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_add_provider_for_display = Interop.downcallHandle(
        "gtk_style_context_add_provider_for_display",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a global style provider to {@code display}, which will be used
     * in style construction for all {@code GtkStyleContexts} under {@code display}.
     * <p>
     * GTK uses this to make styling information from {@code GtkSettings}
     * available.
     * <p>
     * Note: If both priorities are the same, A {@code GtkStyleProvider}
     * added through {@link StyleContext#addProvider} takes
     * precedence over another added through this function.
     */
    public static void addProviderForDisplay(org.gtk.gdk.Display display, StyleProvider provider, int priority) {
        try {
            gtk_style_context_add_provider_for_display.invokeExact(display.handle(), provider.handle(), priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_style_context_remove_provider_for_display = Interop.downcallHandle(
        "gtk_style_context_remove_provider_for_display",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code provider} from the global style providers list in {@code display}.
     */
    public static void removeProviderForDisplay(org.gtk.gdk.Display display, StyleProvider provider) {
        try {
            gtk_style_context_remove_provider_for_display.invokeExact(display.handle(), provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}