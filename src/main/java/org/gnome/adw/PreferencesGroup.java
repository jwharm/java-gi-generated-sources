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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PreferencesGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PreferencesGroup(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PreferencesGroup> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PreferencesGroup(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     */
    public void add(org.gtk.gtk.Widget child) {
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
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the suffix for {@code self}'s header.
     * @return the suffix for {@code self}'s header.
     */
    public @Nullable org.gtk.gtk.Widget getHeaderSuffix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_header_suffix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Removes a child from {@code self}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_preferences_group_set_description.invokeExact(
                        handle(),
                        (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_preferences_group_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_preferences_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PreferencesGroup.Builder} object constructs a {@link PreferencesGroup} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PreferencesGroup.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PreferencesGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PreferencesGroup}.
         * @return A new instance of {@code PreferencesGroup} with the properties 
         *         that were set in the Builder object.
         */
        public PreferencesGroup build() {
            return (PreferencesGroup) org.gtk.gobject.GObject.newWithProperties(
                PreferencesGroup.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The description for this group of preferences.
         * @param description The value for the {@code description} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
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
        public Builder setHeaderSuffix(org.gtk.gtk.Widget headerSuffix) {
            names.add("header-suffix");
            values.add(org.gtk.gobject.Value.create(headerSuffix));
            return this;
        }
        
        /**
         * The title for this group of preferences.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_preferences_group_get_type != null;
    }
}
