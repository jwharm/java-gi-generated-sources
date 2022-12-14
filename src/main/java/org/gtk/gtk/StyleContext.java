package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStyleContext} stores styling information affecting a widget.
 * <p>
 * In order to construct the final style information, {@code GtkStyleContext}
 * queries information from all attached {@code GtkStyleProviders}. Style
 * providers can be either attached explicitly to the context through
 * {@link StyleContext#addProvider}, or to the display through
 * {@link StyleContext#addProviderForDisplay}. The resulting
 * style is a combination of all providers’ information in priority order.
 * <p>
 * For GTK widgets, any {@code GtkStyleContext} returned by
 * {@link Widget#getStyleContext} will already have a {@code GdkDisplay}
 * and RTL/LTR information set. The style context will also be updated
 * automatically if any of these settings change on the widget.
 * <p>
 * <strong>Style Classes</strong><br/>
 * Widgets can add style classes to their context, which can be used to associate
 * different styles by class. The documentation for individual widgets lists
 * which style classes it uses itself, and which style classes may be added by
 * applications to affect their appearance.
 * <p>
 * <strong>Custom styling in UI libraries and applications</strong><br/>
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
public class StyleContext extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStyleContext";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_object")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a StyleContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StyleContext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StyleContext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StyleContext(input);
    
    /**
     * Adds a style class to {@code context}, so later uses of the
     * style context will make use of this new class for styling.
     * <p>
     * In the CSS file format, a {@code GtkEntry} defining a “search”
     * class, would be matched by:
     * <pre>{@code css
     * entry.search { ... }
     * }</pre>
     * <p>
     * While any widget defining a “search” class would be
     * matched by:
     * <pre>{@code css
     * .search { ... }
     * }</pre>
     * @param className class name to use in styling
     */
    public void addClass(java.lang.String className) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_style_context_add_class.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(className, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds a style provider to {@code context}, to be used in style construction.
     * <p>
     * Note that a style provider added by this function only affects
     * the style of the widget to which {@code context} belongs. If you want
     * to affect the style of all widgets, use
     * {@link StyleContext#addProviderForDisplay}.
     * <p>
     * Note: If both priorities are the same, a {@code GtkStyleProvider}
     * added through this function takes precedence over another added
     * through {@link StyleContext#addProviderForDisplay}.
     * @param provider a {@code GtkStyleProvider}
     * @param priority the priority of the style provider. The lower
     *   it is, the earlier it will be used in the style construction.
     *   Typically this will be in the range between
     *   {@code GTK_STYLE_PROVIDER_PRIORITY_FALLBACK} and
     *   {@code GTK_STYLE_PROVIDER_PRIORITY_USER}
     */
    public void addProvider(org.gtk.gtk.StyleProvider provider, int priority) {
        try {
            DowncallHandles.gtk_style_context_add_provider.invokeExact(
                    handle(),
                    provider.handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the border for a given state as a {@code GtkBorder}.
     * @param border return value for the border settings
     */
    public void getBorder(org.gtk.gtk.Border border) {
        try {
            DowncallHandles.gtk_style_context_get_border.invokeExact(
                    handle(),
                    border.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the foreground color for a given state.
     * @param color return value for the foreground color
     */
    public void getColor(org.gtk.gdk.RGBA color) {
        try {
            DowncallHandles.gtk_style_context_get_color.invokeExact(
                    handle(),
                    color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the {@code GdkDisplay} to which {@code context} is attached.
     * @return a {@code GdkDisplay}.
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_style_context_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the margin for a given state as a {@code GtkBorder}.
     * @param margin return value for the margin settings
     */
    public void getMargin(org.gtk.gtk.Border margin) {
        try {
            DowncallHandles.gtk_style_context_get_margin.invokeExact(
                    handle(),
                    margin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the padding for a given state as a {@code GtkBorder}.
     * @param padding return value for the padding settings
     */
    public void getPadding(org.gtk.gtk.Border padding) {
        try {
            DowncallHandles.gtk_style_context_get_padding.invokeExact(
                    handle(),
                    padding.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the scale used for assets.
     * @return the scale
     */
    public int getScale() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_style_context_get_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the state used for style matching.
     * <p>
     * This method should only be used to retrieve the {@code GtkStateFlags}
     * to pass to {@code GtkStyleContext} methods, like
     * {@link StyleContext#getPadding}.
     * If you need to retrieve the current state of a {@code GtkWidget}, use
     * {@link Widget#getStateFlags}.
     * @return the state flags
     */
    public org.gtk.gtk.StateFlags getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_style_context_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StateFlags(RESULT);
    }
    
    /**
     * Returns {@code true} if {@code context} currently has defined the
     * given class name.
     * @param className a class name
     * @return {@code true} if {@code context} has {@code class_name} defined
     */
    public boolean hasClass(java.lang.String className) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_style_context_has_class.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(className, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Looks up and resolves a color name in the {@code context} color map.
     * @param colorName color name to lookup
     * @param color Return location for the looked up color
     * @return {@code true} if {@code color_name} was found and resolved, {@code false} otherwise
     */
    public boolean lookupColor(java.lang.String colorName, org.gtk.gdk.RGBA color) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_style_context_lookup_color.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(colorName, SCOPE),
                        color.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes {@code class_name} from {@code context}.
     * @param className class name to remove
     */
    public void removeClass(java.lang.String className) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_style_context_remove_class.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(className, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Removes {@code provider} from the style providers list in {@code context}.
     * @param provider a {@code GtkStyleProvider}
     */
    public void removeProvider(org.gtk.gtk.StyleProvider provider) {
        try {
            DowncallHandles.gtk_style_context_remove_provider.invokeExact(
                    handle(),
                    provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Restores {@code context} state to a previous stage.
     * <p>
     * See {@link StyleContext#save}.
     */
    public void restore() {
        try {
            DowncallHandles.gtk_style_context_restore.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.gtk_style_context_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches {@code context} to the given display.
     * <p>
     * The display is used to add style information from “global”
     * style providers, such as the display's {@code GtkSettings} instance.
     * <p>
     * If you are using a {@code GtkStyleContext} returned from
     * {@link Widget#getStyleContext}, you do not need to
     * call this yourself.
     * @param display a {@code GdkDisplay}
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        try {
            DowncallHandles.gtk_style_context_set_display.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scale to use when getting image assets for the style.
     * @param scale scale
     */
    public void setScale(int scale) {
        try {
            DowncallHandles.gtk_style_context_set_scale.invokeExact(
                    handle(),
                    scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state to be used for style matching.
     * @param flags state to represent
     */
    public void setState(org.gtk.gtk.StateFlags flags) {
        try {
            DowncallHandles.gtk_style_context_set_state.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param flags Flags that determine what to print
     * @return a newly allocated string representing {@code context}
     */
    public java.lang.String toString(org.gtk.gtk.StyleContextPrintFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_style_context_to_string.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_style_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
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
     * @param display a {@code GdkDisplay}
     * @param provider a {@code GtkStyleProvider}
     * @param priority the priority of the style provider. The lower
     *   it is, the earlier it will be used in the style construction.
     *   Typically this will be in the range between
     *   {@code GTK_STYLE_PROVIDER_PRIORITY_FALLBACK} and
     *   {@code GTK_STYLE_PROVIDER_PRIORITY_USER}
     */
    public static void addProviderForDisplay(org.gtk.gdk.Display display, org.gtk.gtk.StyleProvider provider, int priority) {
        try {
            DowncallHandles.gtk_style_context_add_provider_for_display.invokeExact(
                    display.handle(),
                    provider.handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code provider} from the global style providers list in {@code display}.
     * @param display a {@code GdkDisplay}
     * @param provider a {@code GtkStyleProvider}
     */
    public static void removeProviderForDisplay(org.gtk.gdk.Display display, org.gtk.gtk.StyleProvider provider) {
        try {
            DowncallHandles.gtk_style_context_remove_provider_for_display.invokeExact(
                    display.handle(),
                    provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link StyleContext.Builder} object constructs a {@link StyleContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StyleContext.Builder#build()}. 
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
         * Finish building the {@link StyleContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StyleContext}.
         * @return A new instance of {@code StyleContext} with the properties 
         *         that were set in the Builder object.
         */
        public StyleContext build() {
            return (StyleContext) org.gtk.gobject.GObject.newWithProperties(
                StyleContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_style_context_add_class = Interop.downcallHandle(
                "gtk_style_context_add_class",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_add_provider = Interop.downcallHandle(
                "gtk_style_context_add_provider",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_border = Interop.downcallHandle(
                "gtk_style_context_get_border",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_color = Interop.downcallHandle(
                "gtk_style_context_get_color",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_display = Interop.downcallHandle(
                "gtk_style_context_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_margin = Interop.downcallHandle(
                "gtk_style_context_get_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_padding = Interop.downcallHandle(
                "gtk_style_context_get_padding",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_scale = Interop.downcallHandle(
                "gtk_style_context_get_scale",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_state = Interop.downcallHandle(
                "gtk_style_context_get_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_has_class = Interop.downcallHandle(
                "gtk_style_context_has_class",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_lookup_color = Interop.downcallHandle(
                "gtk_style_context_lookup_color",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_remove_class = Interop.downcallHandle(
                "gtk_style_context_remove_class",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_remove_provider = Interop.downcallHandle(
                "gtk_style_context_remove_provider",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_restore = Interop.downcallHandle(
                "gtk_style_context_restore",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_save = Interop.downcallHandle(
                "gtk_style_context_save",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_set_display = Interop.downcallHandle(
                "gtk_style_context_set_display",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_style_context_set_scale = Interop.downcallHandle(
                "gtk_style_context_set_scale",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_style_context_set_state = Interop.downcallHandle(
                "gtk_style_context_set_state",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_style_context_to_string = Interop.downcallHandle(
                "gtk_style_context_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_style_context_get_type = Interop.downcallHandle(
                "gtk_style_context_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_style_context_add_provider_for_display = Interop.downcallHandle(
                "gtk_style_context_add_provider_for_display",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_style_context_remove_provider_for_display = Interop.downcallHandle(
                "gtk_style_context_remove_provider_for_display",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_style_context_get_type != null;
    }
}
