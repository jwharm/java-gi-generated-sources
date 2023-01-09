package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A class for managing application-wide styling.
 * <p>
 * {@code AdwStyleManager} provides a way to query and influence the application
 * styles, such as whether to use dark or high contrast appearance.
 * <p>
 * It allows to set the color scheme via the
 * {@code StyleManager:color-scheme} property, and to query the current
 * appearance, as well as whether a system-wide color scheme preference exists.
 * @version 1.0
 */
public class StyleManager extends org.gtk.gobject.GObject {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwStyleManager";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StyleManager proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StyleManager(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StyleManager> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StyleManager(input);
    
    /**
     * Gets the requested application color scheme.
     * @return the color scheme
     */
    public org.gnome.adw.ColorScheme getColorScheme() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_style_manager_get_color_scheme.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.ColorScheme.of(RESULT);
    }
    
    /**
     * Gets whether the application is using dark appearance.
     * <p>
     * This can be used to query the current appearance, as requested via
     * {@code StyleManager:color-scheme}.
     * @return whether the application is using dark appearance
     */
    public boolean getDark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_style_manager_get_dark.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the display the style manager is associated with.
     * <p>
     * The display will be {@code NULL} for the style manager returned by
     * {@code StyleManager.StyleManager#getDefault}.
     * @return (nullable): the display
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the application is using high contrast appearance.
     * <p>
     * This cannot be overridden by applications.
     * @return whether the application is using high contrast appearance
     */
    public boolean getHighContrast() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_style_manager_get_high_contrast.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the system supports color schemes.
     * <p>
     * This can be used to check if the current environment provides a color scheme
     * preference. For example, applications might want to show a separate
     * appearance switcher if it's set to {@code FALSE}.
     * @return whether the system supports color schemes
     */
    public boolean getSystemSupportsColorSchemes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_style_manager_get_system_supports_color_schemes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the requested application color scheme.
     * <p>
     * The effective appearance will be decided based on the application color
     * scheme and the system preferred color scheme. The
     * {@code StyleManager:dark} property can be used to query the current
     * effective appearance.
     * <p>
     * The {@code ADW_COLOR_SCHEME_PREFER_LIGHT} color scheme results in the application
     * using light appearance unless the system prefers dark colors. This is the
     * default value.
     * <p>
     * The {@code ADW_COLOR_SCHEME_PREFER_DARK} color scheme results in the application
     * using dark appearance, but can still switch to the light appearance if the
     * system can prefers it, for example, when the high contrast preference is
     * enabled.
     * <p>
     * The {@code ADW_COLOR_SCHEME_FORCE_LIGHT} and {@code ADW_COLOR_SCHEME_FORCE_DARK} values
     * ignore the system preference entirely. They are useful if the application
     * wants to match its UI to its content or to provide a separate color scheme
     * switcher.
     * <p>
     * If a per-{@link org.gtk.gdk.Display} style manager has its color scheme set to
     * {@code ADW_COLOR_SCHEME_DEFAULT}, it will inherit the color scheme from the
     * default style manager.
     * <p>
     * For the default style manager, {@code ADW_COLOR_SCHEME_DEFAULT} is equivalent to
     * {@code ADW_COLOR_SCHEME_PREFER_LIGHT}.
     * <p>
     * The {@code StyleManager:system-supports-color-schemes} property can be
     * used to check if the current environment provides a color scheme
     * preference.
     * @param colorScheme the color scheme
     */
    public void setColorScheme(org.gnome.adw.ColorScheme colorScheme) {
        try {
            DowncallHandles.adw_style_manager_set_color_scheme.invokeExact(
                    handle(),
                    colorScheme.getValue());
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
            RESULT = (long) DowncallHandles.adw_style_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@code AdwStyleManager} instance.
     * <p>
     * It manages all {@link org.gtk.gdk.Display} instances unless the style manager for
     * that display has an override.
     * <p>
     * See {@code StyleManager.StyleManager#getForDisplay}.
     * @return the default style manager
     */
    public static org.gnome.adw.StyleManager getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.StyleManager) Interop.register(RESULT, org.gnome.adw.StyleManager.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code AdwStyleManager} instance managing {@code display}.
     * <p>
     * It can be used to override styles for that specific display instead of the
     * whole application.
     * <p>
     * Most applications should use {@code StyleManager.StyleManager#getDefault} instead.
     * @param display a {@code GdkDisplay}
     * @return the style manager for {@code display}
     */
    public static org.gnome.adw.StyleManager getForDisplay(org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_for_display.invokeExact(display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.StyleManager) Interop.register(RESULT, org.gnome.adw.StyleManager.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * A {@link StyleManager.Builder} object constructs a {@link StyleManager} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StyleManager.Builder#build()}. 
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
         * Finish building the {@link StyleManager} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StyleManager}.
         * @return A new instance of {@code StyleManager} with the properties 
         *         that were set in the Builder object.
         */
        public StyleManager build() {
            return (StyleManager) org.gtk.gobject.GObject.newWithProperties(
                StyleManager.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The requested application color scheme.
         * <p>
         * The effective appearance will be decided based on the application color
         * scheme and the system preferred color scheme. The
         * {@code StyleManager:dark} property can be used to query the current
         * effective appearance.
         * <p>
         * The {@code ADW_COLOR_SCHEME_PREFER_LIGHT} color scheme results in the application
         * using light appearance unless the system prefers dark colors. This is the
         * default value.
         * <p>
         * The {@code ADW_COLOR_SCHEME_PREFER_DARK} color scheme results in the application
         * using dark appearance, but can still switch to the light appearance if the
         * system can prefers it, for example, when the high contrast preference is
         * enabled.
         * <p>
         * The {@code ADW_COLOR_SCHEME_FORCE_LIGHT} and {@code ADW_COLOR_SCHEME_FORCE_DARK} values
         * ignore the system preference entirely. They are useful if the application
         * wants to match its UI to its content or to provide a separate color scheme
         * switcher.
         * <p>
         * If a per-{@link org.gtk.gdk.Display} style manager has its color scheme set to
         * {@code ADW_COLOR_SCHEME_DEFAULT}, it will inherit the color scheme from the
         * default style manager.
         * <p>
         * For the default style manager, {@code ADW_COLOR_SCHEME_DEFAULT} is equivalent to
         * {@code ADW_COLOR_SCHEME_PREFER_LIGHT}.
         * <p>
         * The {@code StyleManager:system-supports-color-schemes} property can be
         * used to check if the current environment provides a color scheme
         * preference.
         * @param colorScheme The value for the {@code color-scheme} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorScheme(org.gnome.adw.ColorScheme colorScheme) {
            names.add("color-scheme");
            values.add(org.gtk.gobject.Value.create(colorScheme));
            return this;
        }
        
        /**
         * Whether the application is using dark appearance.
         * <p>
         * This property can be used to query the current appearance, as requested via
         * {@code StyleManager:color-scheme}.
         * @param dark The value for the {@code dark} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDark(boolean dark) {
            names.add("dark");
            values.add(org.gtk.gobject.Value.create(dark));
            return this;
        }
        
        /**
         * The display the style manager is associated with.
         * <p>
         * The display will be {@code NULL} for the style manager returned by
         * {@code StyleManager.StyleManager#getDefault}.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * Whether the application is using high contrast appearance.
         * <p>
         * This cannot be overridden by applications.
         * @param highContrast The value for the {@code high-contrast} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHighContrast(boolean highContrast) {
            names.add("high-contrast");
            values.add(org.gtk.gobject.Value.create(highContrast));
            return this;
        }
        
        /**
         * Whether the system supports color schemes.
         * <p>
         * This property can be used to check if the current environment provides a
         * color scheme preference. For example, applications might want to show a
         * separate appearance switcher if it's set to {@code FALSE}.
         * <p>
         * See {@code StyleManager:color-scheme}.
         * @param systemSupportsColorSchemes The value for the {@code system-supports-color-schemes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSystemSupportsColorSchemes(boolean systemSupportsColorSchemes) {
            names.add("system-supports-color-schemes");
            values.add(org.gtk.gobject.Value.create(systemSupportsColorSchemes));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_style_manager_get_color_scheme = Interop.downcallHandle(
                "adw_style_manager_get_color_scheme",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_dark = Interop.downcallHandle(
                "adw_style_manager_get_dark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_display = Interop.downcallHandle(
                "adw_style_manager_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_high_contrast = Interop.downcallHandle(
                "adw_style_manager_get_high_contrast",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_system_supports_color_schemes = Interop.downcallHandle(
                "adw_style_manager_get_system_supports_color_schemes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_set_color_scheme = Interop.downcallHandle(
                "adw_style_manager_set_color_scheme",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_type = Interop.downcallHandle(
                "adw_style_manager_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_default = Interop.downcallHandle(
                "adw_style_manager_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_style_manager_get_for_display = Interop.downcallHandle(
                "adw_style_manager_get_for_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_style_manager_get_type != null;
    }
}
