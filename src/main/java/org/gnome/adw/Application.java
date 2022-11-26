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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Application.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Application parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Application(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Application proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Application(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Application if its GType is a (or inherits from) "AdwApplication".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Application} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwApplication", a ClassCastException will be thrown.
     */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Application.getType())) {
            return new Application(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwApplication");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_application_new.invokeExact(
                    (Addressable) (applicationId == null ? MemoryAddress.NULL : Interop.allocateNativeString(applicationId)),
                    flags.getValue());
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
        super(constructNew(applicationId, flags), Ownership.FULL);
    }
    
    /**
     * Gets the style manager for {@code self}.
     * <p>
     * This is a convenience property allowing to access {@code AdwStyleManager} through
     * property bindings or expressions.
     * @return the style manager
     */
    public @NotNull org.gnome.adw.StyleManager getStyleManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_application_get_style_manager.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.StyleManager(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_application_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Application.Build {
        
         /**
         * A {@link Application.Build} object constructs a {@link Application} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Application} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Application} using {@link Application#castFrom}.
         * @return A new instance of {@code Application} with the properties 
         *         that were set in the Build object.
         */
        public Application construct() {
            return Application.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Application.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setStyleManager(org.gnome.adw.StyleManager styleManager) {
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
}
