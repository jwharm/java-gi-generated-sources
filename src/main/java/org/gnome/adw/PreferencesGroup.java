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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName("AdwPreferencesGroup");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PreferencesGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PreferencesGroup */
    public static PreferencesGroup castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesGroup(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_preferences_group_new.invokeExact(), false);
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
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     */
    public void add(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_preferences_group_add.invokeExact(handle(), child.handle());
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
        return RESULT.getUtf8String(0);
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
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_group_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes a child from {@code self}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_preferences_group_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the description for {@code self}.
     * @param description the description
     */
    public void setDescription(@Nullable java.lang.String description) {
        java.util.Objects.requireNonNullElse(description, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_preferences_group_set_description.invokeExact(handle(), Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the suffix for {@code self}'s header.
     * @param suffix the suffix to set
     */
    public void setHeaderSuffix(@Nullable org.gtk.gtk.Widget suffix) {
        java.util.Objects.requireNonNullElse(suffix, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_preferences_group_set_header_suffix.invokeExact(handle(), suffix.handle());
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
            DowncallHandles.adw_preferences_group_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_group_new = Interop.downcallHandle(
            "adw_preferences_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_add = Interop.downcallHandle(
            "adw_preferences_group_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_get_description = Interop.downcallHandle(
            "adw_preferences_group_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_get_header_suffix = Interop.downcallHandle(
            "adw_preferences_group_get_header_suffix",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_get_title = Interop.downcallHandle(
            "adw_preferences_group_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_remove = Interop.downcallHandle(
            "adw_preferences_group_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_set_description = Interop.downcallHandle(
            "adw_preferences_group_set_description",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_set_header_suffix = Interop.downcallHandle(
            "adw_preferences_group_set_header_suffix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_group_set_title = Interop.downcallHandle(
            "adw_preferences_group_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
