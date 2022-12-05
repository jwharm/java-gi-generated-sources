package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A page from {@link PreferencesWindow}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="preferences-page-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="preferences-page.png" alt="preferences-page"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwPreferencesPage} widget gathers preferences groups into a single page
 * of a preferences window.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwPreferencesPage} has a single CSS node with name {@code preferencespage}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwPreferencesPage} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class PreferencesPage extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesPage";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
     * Create a PreferencesPage proxy instance for the provided memory address.
     * <p>
     * Because PreferencesPage is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PreferencesPage(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to PreferencesPage if its GType is a (or inherits from) "AdwPreferencesPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PreferencesPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesPage", a ClassCastException will be thrown.
     */
    public static PreferencesPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PreferencesPage.getType())) {
            return new PreferencesPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPreferencesPage");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesPage}.
     */
    public PreferencesPage() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a preferences group to {@code self}.
     * @param group the group to add
     */
    public void add(@NotNull org.gnome.adw.PreferencesGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.adw_preferences_page_add.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the icon name for {@code self}.
     * @return the icon name for {@code self}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the name of {@code self}.
     * @return the name of {@code self}
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     * @return whether an embedded underline in the title indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_page_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a group from {@code self}.
     * @param group the group to remove
     */
    public void remove(@NotNull org.gnome.adw.PreferencesGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.adw_preferences_page_remove.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name for {@code self}.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.adw_preferences_page_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of {@code self}.
     * @param name the name
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.adw_preferences_page_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * @param title the title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_preferences_page_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     * @param useUnderline {@code TRUE} if underlines in the text indicate mnemonics
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.adw_preferences_page_set_use_underline.invokeExact(
                    handle(),
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_preferences_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link PreferencesPage.Build} object constructs a {@link PreferencesPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PreferencesPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PreferencesPage} using {@link PreferencesPage#castFrom}.
         * @return A new instance of {@code PreferencesPage} with the properties 
         *         that were set in the Build object.
         */
        public PreferencesPage construct() {
            return PreferencesPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PreferencesPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The icon name for this page.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The name of this page.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The title for this page.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether an embedded underline in the title indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_page_new = Interop.downcallHandle(
            "adw_preferences_page_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_add = Interop.downcallHandle(
            "adw_preferences_page_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_get_icon_name = Interop.downcallHandle(
            "adw_preferences_page_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_get_name = Interop.downcallHandle(
            "adw_preferences_page_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_get_title = Interop.downcallHandle(
            "adw_preferences_page_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_get_use_underline = Interop.downcallHandle(
            "adw_preferences_page_get_use_underline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_remove = Interop.downcallHandle(
            "adw_preferences_page_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_set_icon_name = Interop.downcallHandle(
            "adw_preferences_page_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_set_name = Interop.downcallHandle(
            "adw_preferences_page_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_set_title = Interop.downcallHandle(
            "adw_preferences_page_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_page_set_use_underline = Interop.downcallHandle(
            "adw_preferences_page_set_use_underline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_page_get_type = Interop.downcallHandle(
            "adw_preferences_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
