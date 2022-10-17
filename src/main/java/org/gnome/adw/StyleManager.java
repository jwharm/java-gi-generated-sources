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
 */
public class StyleManager extends org.gtk.gobject.Object {

    public StyleManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StyleManager */
    public static StyleManager castFrom(org.gtk.gobject.Object gobject) {
        return new StyleManager(gobject.refcounted());
    }
    
    private static final MethodHandle adw_style_manager_get_color_scheme = Interop.downcallHandle(
        "adw_style_manager_get_color_scheme",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the requested application color scheme.
     */
    public @NotNull ColorScheme getColorScheme() {
        int RESULT;
        try {
            RESULT = (int) adw_style_manager_get_color_scheme.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ColorScheme(RESULT);
    }
    
    private static final MethodHandle adw_style_manager_get_dark = Interop.downcallHandle(
        "adw_style_manager_get_dark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the application is using dark appearance.
     */
    public boolean getDark() {
        int RESULT;
        try {
            RESULT = (int) adw_style_manager_get_dark.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_style_manager_get_display = Interop.downcallHandle(
        "adw_style_manager_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the display the style manager is associated with.
     * <p>
     * The display will be {@code NULL} for the style manager returned by
     * {@link StyleManager#getDefault}.
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_style_manager_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_style_manager_get_high_contrast = Interop.downcallHandle(
        "adw_style_manager_get_high_contrast",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the application is using high contrast appearance.
     */
    public boolean getHighContrast() {
        int RESULT;
        try {
            RESULT = (int) adw_style_manager_get_high_contrast.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_style_manager_get_system_supports_color_schemes = Interop.downcallHandle(
        "adw_style_manager_get_system_supports_color_schemes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the system supports color schemes.
     */
    public boolean getSystemSupportsColorSchemes() {
        int RESULT;
        try {
            RESULT = (int) adw_style_manager_get_system_supports_color_schemes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_style_manager_set_color_scheme = Interop.downcallHandle(
        "adw_style_manager_set_color_scheme",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the requested application color scheme.
     * <p>
     * The effective appearance will be decided based on the application color
     * scheme and the system preferred color scheme. The
     * {@code StyleManager:dark} property can be used to query the current
     * effective appearance.
     */
    public @NotNull void setColorScheme(@NotNull ColorScheme colorScheme) {
        try {
            adw_style_manager_set_color_scheme.invokeExact(handle(), colorScheme.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_style_manager_get_default = Interop.downcallHandle(
        "adw_style_manager_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@code AdwStyleManager} instance.
     * <p>
     * It manages all {@link org.gtk.gdk.Display} instances unless the style manager for
     * that display has an override.
     * <p>
     * See {@link StyleManager#getForDisplay}.
     */
    public static @NotNull StyleManager getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_style_manager_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StyleManager(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_style_manager_get_for_display = Interop.downcallHandle(
        "adw_style_manager_get_for_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code AdwStyleManager} instance managing {@code display}.
     * <p>
     * It can be used to override styles for that specific display instead of the
     * whole application.
     * <p>
     * Most applications should use {@link StyleManager#getDefault} instead.
     */
    public static @NotNull StyleManager getForDisplay(@NotNull org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_style_manager_get_for_display.invokeExact(display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new StyleManager(Refcounted.get(RESULT, false));
    }
    
}
