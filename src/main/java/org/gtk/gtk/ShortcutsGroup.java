package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsGroup} represents a group of related keyboard shortcuts
 * or gestures.
 * <p>
 * The group has a title. It may optionally be associated with a view
 * of the application, which can be used to show only relevant shortcuts
 * depending on the application context.
 * <p>
 * This widget is only meant to be used with {@link ShortcutsWindow}.
 */
public class ShortcutsGroup extends org.gtk.gtk.Box implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutsGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShortcutsGroup(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutsGroup> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutsGroup(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ShortcutsGroup.Builder} object constructs a {@link ShortcutsGroup} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutsGroup.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Box.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutsGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsGroup}.
         * @return A new instance of {@code ShortcutsGroup} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutsGroup build() {
            return (ShortcutsGroup) org.gtk.gobject.GObject.newWithProperties(
                ShortcutsGroup.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The size group for the accelerator portion of shortcuts in this group.
         * <p>
         * This is used internally by GTK, and must not be modified by applications.
         * @param accelSizeGroup The value for the {@code accel-size-group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAccelSizeGroup(org.gtk.gtk.SizeGroup accelSizeGroup) {
            names.add("accel-size-group");
            values.add(org.gtk.gobject.Value.create(accelSizeGroup));
            return this;
        }
        
        /**
         * A rough measure for the number of lines in this group.
         * <p>
         * This is used internally by GTK, and is not useful for applications.
         * @param height The value for the {@code height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            names.add("height");
            values.add(org.gtk.gobject.Value.create(height));
            return this;
        }
        
        /**
         * The title for this group of shortcuts.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * The size group for the textual portion of shortcuts in this group.
         * <p>
         * This is used internally by GTK, and must not be modified by applications.
         * @param titleSizeGroup The value for the {@code title-size-group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitleSizeGroup(org.gtk.gtk.SizeGroup titleSizeGroup) {
            names.add("title-size-group");
            values.add(org.gtk.gobject.Value.create(titleSizeGroup));
            return this;
        }
        
        /**
         * An optional view that the shortcuts in this group are relevant for.
         * <p>
         * The group will be hidden if the {@code Gtk.ShortcutsWindow:view-name}
         * property does not match the view of this group.
         * <p>
         * Set this to {@code null} to make the group always visible.
         * @param view The value for the {@code view} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setView(java.lang.String view) {
            names.add("view");
            values.add(org.gtk.gobject.Value.create(view));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcuts_group_get_type = Interop.downcallHandle(
                "gtk_shortcuts_group_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcuts_group_get_type != null;
    }
}
