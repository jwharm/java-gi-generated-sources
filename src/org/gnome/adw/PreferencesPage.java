package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwPreferencesPage} has a single CSS node with name {@code preferencespage}.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwPreferencesPage} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class PreferencesPage extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public PreferencesPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PreferencesPage */
    public static PreferencesPage castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesPage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_preferences_page_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesPage}.
     */
    public PreferencesPage() {
        super(constructNew());
    }
    
    /**
     * Adds a preferences group to {@code self}.
     */
    public void add(PreferencesGroup group) {
        gtk_h.adw_preferences_page_add(handle(), group.handle());
    }
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_preferences_page_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of {@code self}.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.adw_preferences_page_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_preferences_page_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.adw_preferences_page_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes a group from {@code self}.
     */
    public void remove(PreferencesGroup group) {
        gtk_h.adw_preferences_page_remove(handle(), group.handle());
    }
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_preferences_page_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the name of {@code self}.
     */
    public void setName(java.lang.String name) {
        gtk_h.adw_preferences_page_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_preferences_page_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.adw_preferences_page_set_use_underline(handle(), useUnderline ? 1 : 0);
    }
    
}
