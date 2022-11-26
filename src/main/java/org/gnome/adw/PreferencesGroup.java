package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A group of preference rows.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="preferences-group-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="preferences-group.png" alt="preferences-group"&gt;
 * &lt;/picture&gt;
 * <p>
 * An {@code AdwPreferencesGroup} represents a group or tightly related preferences,
 * which in turn are represented by {@link PreferencesRow}.
 * <p>
 * To summarize the role of the preferences it gathers, a group can have both a
 * title and a description. The title will be used by {@link PreferencesWindow}
 * to let the user look for a preference.
 * <p>
 * <strong>AdwPreferencesGroup as GtkBuildable</strong><br/>
 * The {@code AdwPreferencesGroup} implementation of the {@code Gtk.Buildable} interface
 * supports adding {@link PreferencesRow}s to the list by omitting "type". If "type"
 * is omitted and the widget isn't a {@link PreferencesRow} the child is added to
 * a box below the list.
 * <p>
 * When the "type" attribute of a child is {@code header-suffix}, the child
 * is set as the suffix on the end of the title and description.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwPreferencesGroup} has a single CSS node with name {@code preferencesgroup}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwPreferencesGroup} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class PreferencesGroup extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesGroup";
    
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PreferencesGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PreferencesGroup(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PreferencesGroup if its GType is a (or inherits from) "AdwPreferencesGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PreferencesGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesGroup", a ClassCastException will be thrown.
     */
    public static PreferencesGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), PreferencesGroup.getType())) {
            return new PreferencesGroup(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPreferencesGroup");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesGroup}.
     */
    public PreferencesGroup() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     */
    public void add(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_preferences_group_add.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the description of {@code self}.
     * @return the description of {@code self}
     */
    public @Nullable java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the suffix for {@code self}'s header.
     * @return the suffix for {@code self}'s header.
     */
    public @Nullable org.gtk.gtk.Widget getHeaderSuffix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_header_suffix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Removes a child from {@code self}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_preferences_group_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the description for {@code self}.
     * @param description the description
     */
    public void setDescription(@Nullable java.lang.String description) {
        try {
            DowncallHandles.adw_preferences_group_set_description.invokeExact(
                    handle(),
                    (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the suffix for {@code self}'s header.
     * <p>
     * Displayed above the list, next to the title and description.
     * <p>
     * Suffixes are commonly used to show a button or a spinner for the whole group.
     * @param suffix the suffix to set
     */
    public void setHeaderSuffix(@Nullable org.gtk.gtk.Widget suffix) {
        try {
            DowncallHandles.adw_preferences_group_set_header_suffix.invokeExact(
                    handle(),
                    (Addressable) (suffix == null ? MemoryAddress.NULL : suffix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title for {@code self}.
     * @param title the title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_preferences_group_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
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
            RESULT = (long) DowncallHandles.adw_preferences_group_get_type.invokeExact();
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
         * A {@link PreferencesGroup.Build} object constructs a {@link PreferencesGroup} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PreferencesGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PreferencesGroup} using {@link PreferencesGroup#castFrom}.
         * @return A new instance of {@code PreferencesGroup} with the properties 
         *         that were set in the Build object.
         */
        public PreferencesGroup construct() {
            return PreferencesGroup.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PreferencesGroup.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The description for this group of preferences.
         * @param description The value for the {@code description} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            names.add("description");
            values.add(org.gtk.gobject.Value.create(description));
            return this;
        }
        
        /**
         * The header suffix widget.
         * <p>
         * Displayed above the list, next to the title and description.
         * <p>
         * Suffixes are commonly used to show a button or a spinner for the whole
         * group.
         * @param headerSuffix The value for the {@code header-suffix} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeaderSuffix(org.gtk.gtk.Widget headerSuffix) {
            names.add("header-suffix");
            values.add(org.gtk.gobject.Value.create(headerSuffix));
            return this;
        }
        
        /**
         * The title for this group of preferences.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_group_new = Interop.downcallHandle(
            "adw_preferences_group_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_add = Interop.downcallHandle(
            "adw_preferences_group_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_get_description = Interop.downcallHandle(
            "adw_preferences_group_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_get_header_suffix = Interop.downcallHandle(
            "adw_preferences_group_get_header_suffix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_get_title = Interop.downcallHandle(
            "adw_preferences_group_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_remove = Interop.downcallHandle(
            "adw_preferences_group_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_set_description = Interop.downcallHandle(
            "adw_preferences_group_set_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_set_header_suffix = Interop.downcallHandle(
            "adw_preferences_group_set_header_suffix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_set_title = Interop.downcallHandle(
            "adw_preferences_group_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_group_get_type = Interop.downcallHandle(
            "adw_preferences_group_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
