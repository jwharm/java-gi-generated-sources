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
public class StyleManager extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwStyleManager";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public StyleManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to StyleManager if its GType is a (or inherits from) "AdwStyleManager".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "StyleManager" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwStyleManager", a ClassCastException will be thrown.
     */
    public static StyleManager castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwStyleManager"))) {
            return new StyleManager(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwStyleManager");
        }
    }
    
    /**
     * Gets the requested application color scheme.
     * @return the color scheme
     */
    public @NotNull org.gnome.adw.ColorScheme getColorScheme() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_style_manager_get_color_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ColorScheme(RESULT);
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
            RESULT = (int) DowncallHandles.adw_style_manager_get_dark.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the display the style manager is associated with.
     * <p>
     * The display will be {@code NULL} for the style manager returned by
     * {@code StyleManager.StyleManager#getDefault}.
     * @return (nullable): the display
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
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
            RESULT = (int) DowncallHandles.adw_style_manager_get_high_contrast.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.adw_style_manager_get_system_supports_color_schemes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void setColorScheme(@NotNull org.gnome.adw.ColorScheme colorScheme) {
        java.util.Objects.requireNonNull(colorScheme, "Parameter 'colorScheme' must not be null");
        try {
            DowncallHandles.adw_style_manager_set_color_scheme.invokeExact(
                    handle(),
                    colorScheme.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static @NotNull org.gnome.adw.StyleManager getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.StyleManager(Refcounted.get(RESULT, false));
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
    public static @NotNull org.gnome.adw.StyleManager getForDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_style_manager_get_for_display.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.StyleManager(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_style_manager_get_color_scheme = Interop.downcallHandle(
            "adw_style_manager_get_color_scheme",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_get_dark = Interop.downcallHandle(
            "adw_style_manager_get_dark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_get_display = Interop.downcallHandle(
            "adw_style_manager_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_get_high_contrast = Interop.downcallHandle(
            "adw_style_manager_get_high_contrast",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_get_system_supports_color_schemes = Interop.downcallHandle(
            "adw_style_manager_get_system_supports_color_schemes",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_set_color_scheme = Interop.downcallHandle(
            "adw_style_manager_set_color_scheme",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_style_manager_get_default = Interop.downcallHandle(
            "adw_style_manager_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_style_manager_get_for_display = Interop.downcallHandle(
            "adw_style_manager_get_for_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
