package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A base class for Adwaita applications.
 * <p>
 * {@code AdwApplication} handles library initialization by calling {@link Adw#init} in the
 * default {@code Gio.Application::startup} signal handler, in turn chaining up
 * as required by {@link org.gtk.gtk.Application}. Therefore, any subclass of
 * {@code AdwApplication} should always chain up its {@code startup} handler before using
 * any Adwaita or GTK API.
 * <p>
 * <strong>Automatic Resources</strong><br/>
 * {@code AdwApplication} will automatically load stylesheets located in the
 * application's resource base path (see
 * {@link org.gtk.gio.Application#setResourceBasePath}, if they're present.
 * <p>
 * They can be used to add custom styles to the application, as follows:
 * <ul>
 * <li>{@code style.css} contains styles that are always present.
 * </ul>
 * <ul>
 * <li>{@code style-dark.css} contains styles only used when
 * {@code StyleManager:dark} is {@code TRUE}.
 * </ul>
 * <ul>
 * <li>{@code style-hc.css} contains styles used when the system high contrast
 *   preference is enabled.
 * </ul>
 * <ul>
 * <li>{@code style-hc-dark.css} contains styles used when the system high contrast
 *   preference is enabled and {@code StyleManager:dark} is {@code TRUE}.
 * </ul>
 * @version 1.0
 */
public class Application extends org.gtk.gtk.Application implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Application.getMemoryLayout().withName("parent_instance")
    ).withName("AdwApplication");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Application(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        java.util.Objects.requireNonNullElse(applicationId, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_application_new.invokeExact(Interop.allocateNativeString(applicationId), flags.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwApplication}.
     * <p>
     * If {@code application_id} is not {@code NULL}, then it must be valid. See
     * {@link org.gtk.gio.Application#idIsValid}.
     * <p>
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     * @param applicationId The application ID
     * @param flags The application flags
     */
    public Application(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
    }
    
    /**
     * Gets the style manager for {@code self}.
     * @return the style manager
     */
    public @NotNull org.gnome.adw.StyleManager getStyleManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_application_get_style_manager.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.StyleManager(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_application_new = Interop.downcallHandle(
            "adw_application_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_application_get_style_manager = Interop.downcallHandle(
            "adw_application_get_style_manager",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
