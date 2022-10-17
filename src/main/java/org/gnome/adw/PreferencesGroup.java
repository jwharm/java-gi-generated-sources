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
 * 
 * <h2>AdwPreferencesGroup as GtkBuildable</h2>
 * The {@code AdwPreferencesGroup} implementation of the {@code Gtk.Buildable} interface
 * supports adding {@link PreferencesRow}s to the list by omitting "type". If "type"
 * is omitted and the widget isn't a {@link PreferencesRow} the child is added to
 * a box below the list.
 * <p>
 * When the "type" attribute of a child is {@code header-suffix}, the child
 * is set as the suffix on the end of the title and description.
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwPreferencesGroup} has a single CSS node with name {@code preferencesgroup}.
 * 
 * <h2>Accessibility</h2>
 * {@code AdwPreferencesGroup} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class PreferencesGroup extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public PreferencesGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PreferencesGroup */
    public static PreferencesGroup castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesGroup(gobject.refcounted());
    }
    
    private static final MethodHandle adw_preferences_group_new = Interop.downcallHandle(
        "adw_preferences_group_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_preferences_group_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwPreferencesGroup}.
     */
    public PreferencesGroup() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_preferences_group_add = Interop.downcallHandle(
        "adw_preferences_group_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     */
    public @NotNull void add(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_preferences_group_add.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_group_get_description = Interop.downcallHandle(
        "adw_preferences_group_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the description of {@code self}.
     */
    public @Nullable java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_preferences_group_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_preferences_group_get_header_suffix = Interop.downcallHandle(
        "adw_preferences_group_get_header_suffix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the suffix for {@code self}'s header.
     */
    public @Nullable org.gtk.gtk.Widget getHeaderSuffix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_preferences_group_get_header_suffix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_preferences_group_get_title = Interop.downcallHandle(
        "adw_preferences_group_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of {@code self}.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_preferences_group_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_preferences_group_remove = Interop.downcallHandle(
        "adw_preferences_group_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code self}.
     */
    public @NotNull void remove(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_preferences_group_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_group_set_description = Interop.downcallHandle(
        "adw_preferences_group_set_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the description for {@code self}.
     */
    public @NotNull void setDescription(@Nullable java.lang.String description) {
        try {
            adw_preferences_group_set_description.invokeExact(handle(), Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_group_set_header_suffix = Interop.downcallHandle(
        "adw_preferences_group_set_header_suffix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the suffix for {@code self}'s header.
     */
    public @NotNull void setHeaderSuffix(@Nullable org.gtk.gtk.Widget suffix) {
        try {
            adw_preferences_group_set_header_suffix.invokeExact(handle(), suffix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_group_set_title = Interop.downcallHandle(
        "adw_preferences_group_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title for {@code self}.
     */
    public @NotNull void setTitle(@NotNull java.lang.String title) {
        try {
            adw_preferences_group_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
