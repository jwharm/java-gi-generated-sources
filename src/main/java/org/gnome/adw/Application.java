package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A base class for Adwaita applications.
 * <p>
 * {@code AdwApplication} handles library initialization by calling {@link init#null} in the
 * default {@code Gio.Application::startup} signal handler, in turn chaining up
 * as required by {@link org.gtk.gtk.Application}. Therefore, any subclass of
 * {@code AdwApplication} should always chain up its {@code startup} handler before using
 * any Adwaita or GTK API.
 * <p>
 * <h2>Automatic Resources</h2>
 * <p>
 * {@code AdwApplication} will automatically load stylesheets located in the
 * application's resource base path (see
 * {@link org.gtk.gio.Application#setResourceBasePath}, if they're present.
 * <p>
 * They can be used to add custom styles to the application, as follows:
 * <p>
 * <ul>
 * <li>{@code style.css} contains styles that are always present.
 * </ul>
 * <p>
 * <ul>
 * <li>{@code style-dark.css} contains styles only used when
 * {@code StyleManager:dark} is {@code TRUE}.
 * </ul>
 * <p>
 * <ul>
 * <li>{@code style-hc.css} contains styles used when the system high contrast
 *   preference is enabled.
 * </ul>
 * <p>
 * <ul>
 * <li>{@code style-hc-dark.css} contains styles used when the system high contrast
 *   preference is enabled and {@code StyleManager:dark} is {@code TRUE}.
 */
public class Application extends org.gtk.gtk.Application implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {

    public Application(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.refcounted());
    }
    
    static final MethodHandle adw_application_new = Interop.downcallHandle(
        "adw_application_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_application_new.invokeExact(Interop.allocateNativeString(applicationId).handle(), flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwApplication}.
     * <p>
     * If {@code application_id} is not {@code NULL}, then it must be valid. See
     * {@link Gio#Application}.
     * <p>
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     */
    public Application(java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
    }
    
    static final MethodHandle adw_application_get_style_manager = Interop.downcallHandle(
        "adw_application_get_style_manager",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the style manager for {@code self}.
     */
    public StyleManager getStyleManager() {
        try {
            var RESULT = (MemoryAddress) adw_application_get_style_manager.invokeExact(handle());
            return new StyleManager(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
