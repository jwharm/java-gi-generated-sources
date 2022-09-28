package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>AdwPreferencesGroup as GtkBuildable</h2>
 * <p>
 * The {@code AdwPreferencesGroup} implementation of the {@code Gtk.Buildable} interface
 * supports adding {@link PreferencesRow}s to the list by omitting "type". If "type"
 * is omitted and the widget isn't a {@link PreferencesRow} the child is added to
 * a box below the list.
 * <p>
 * When the "type" attribute of a child is {@code header-suffix}, the child
 * is set as the suffix on the end of the title and description.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwPreferencesGroup} has a single CSS node with name {@code preferencesgroup}.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwPreferencesGroup} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class PreferencesGroup extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public PreferencesGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PreferencesGroup */
    public static PreferencesGroup castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesGroup(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_preferences_group_new(), false);
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
     */
    public void add(org.gtk.gtk.Widget child) {
        gtk_h.adw_preferences_group_add(handle(), child.handle());
    }
    
    /**
     * Gets the description of {@code self}.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.adw_preferences_group_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the suffix for {@code self}'s header.
     */
    public org.gtk.gtk.Widget getHeaderSuffix() {
        var RESULT = gtk_h.adw_preferences_group_get_header_suffix(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_preferences_group_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes a child from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_preferences_group_remove(handle(), child.handle());
    }
    
    /**
     * Sets the description for {@code self}.
     */
    public void setDescription(java.lang.String description) {
        gtk_h.adw_preferences_group_set_description(handle(), Interop.allocateNativeString(description).handle());
    }
    
    /**
     * Sets the suffix for {@code self}'s header.
     */
    public void setHeaderSuffix(org.gtk.gtk.Widget suffix) {
        gtk_h.adw_preferences_group_set_header_suffix(handle(), suffix.handle());
    }
    
    /**
     * Sets the title for {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_preferences_group_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
}
