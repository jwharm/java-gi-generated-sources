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
    
    private static final java.lang.String C_TYPE_NAME = "AdwApplication";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Application.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Application proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Application(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Application> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Application(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.adw_application_new.invokeExact(
                        (Addressable) (applicationId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(applicationId, SCOPE)),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public Application(@Nullable java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
        this.takeOwnership();
    }
    
    /**
     * Gets the style manager for {@code self}.
     * <p>
     * This is a convenience property allowing to access {@code AdwStyleManager} through
     * property bindings or expressions.
     * @return the style manager
     */
    public org.gnome.adw.StyleManager getStyleManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_application_get_style_manager.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.StyleManager) Interop.register(RESULT, org.gnome.adw.StyleManager.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_application_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Application.Builder} object constructs a {@link Application} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Application.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Application.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Application} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Application}.
         * @return A new instance of {@code Application} with the properties 
         *         that were set in the Builder object.
         */
        public Application build() {
            return (Application) org.gtk.gobject.GObject.newWithProperties(
                Application.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The style manager for this application.
         * <p>
         * This is a convenience property allowing to access {@code AdwStyleManager} through
         * property bindings or expressions.
         * @param styleManager The value for the {@code style-manager} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStyleManager(org.gnome.adw.StyleManager styleManager) {
            names.add("style-manager");
            values.add(org.gtk.gobject.Value.create(styleManager));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_application_new = Interop.downcallHandle(
                "adw_application_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_application_get_style_manager = Interop.downcallHandle(
                "adw_application_get_style_manager",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_application_get_type = Interop.downcallHandle(
                "adw_application_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_application_get_type != null;
    }
}
