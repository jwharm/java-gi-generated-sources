package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A window to present an application's preferences.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="preferences-window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="preferences-window.png" alt="preferences-window"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwPreferencesWindow} widget presents an application's preferences
 * gathered into pages and groups. The preferences are searchable by the user.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwPreferencesWindow} has a main CSS node with the name {@code window} and the
 * style class {@code .preferences}.
 */
public class PreferencesWindow extends Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {

    public PreferencesWindow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PreferencesWindow */
    public static PreferencesWindow castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesWindow(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_preferences_window_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesWindow}.
     */
    public PreferencesWindow() {
        super(constructNew());
    }
    
    /**
     * Adds a preferences page to {@code self}.
     */
    public void add(PreferencesPage page) {
        gtk_h.adw_preferences_window_add(handle(), page.handle());
    }
    
    /**
     * Displays {@code toast}.
     * <p>
     * See {@link ToastOverlay#addToast}.
     */
    public void addToast(Toast toast) {
        gtk_h.adw_preferences_window_add_toast(handle(), toast.getReference().unowned().handle());
    }
    
    /**
     * Closes the current subpage.
     * <p>
     * If there is no presented subpage, this does nothing.
     */
    public void closeSubpage() {
        gtk_h.adw_preferences_window_close_subpage(handle());
    }
    
    /**
     * Gets whether gestures and shortcuts for closing subpages are enabled.
     */
    public boolean getCanNavigateBack() {
        var RESULT = gtk_h.adw_preferences_window_get_can_navigate_back(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether search is enabled for {@code self}.
     */
    public boolean getSearchEnabled() {
        var RESULT = gtk_h.adw_preferences_window_get_search_enabled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the currently visible page of {@code self}.
     */
    public PreferencesPage getVisiblePage() {
        var RESULT = gtk_h.adw_preferences_window_get_visible_page(handle());
        return new PreferencesPage(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of currently visible page of {@code self}.
     */
    public java.lang.String getVisiblePageName() {
        var RESULT = gtk_h.adw_preferences_window_get_visible_page_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets {@code subpage} as the window's subpage and opens it.
     * <p>
     * The transition can be cancelled by the user, in which case visible child will
     * change back to the previously visible child.
     */
    public void presentSubpage(org.gtk.gtk.Widget subpage) {
        gtk_h.adw_preferences_window_present_subpage(handle(), subpage.handle());
    }
    
    /**
     * Removes a page from {@code self}.
     */
    public void remove(PreferencesPage page) {
        gtk_h.adw_preferences_window_remove(handle(), page.handle());
    }
    
    /**
     * Sets whether gestures and shortcuts for closing subpages are enabled.
     */
    public void setCanNavigateBack(boolean canNavigateBack) {
        gtk_h.adw_preferences_window_set_can_navigate_back(handle(), canNavigateBack ? 1 : 0);
    }
    
    /**
     * Sets whether search is enabled for {@code self}.
     */
    public void setSearchEnabled(boolean searchEnabled) {
        gtk_h.adw_preferences_window_set_search_enabled(handle(), searchEnabled ? 1 : 0);
    }
    
    /**
     * Makes {@code page} the visible page of {@code self}.
     */
    public void setVisiblePage(PreferencesPage page) {
        gtk_h.adw_preferences_window_set_visible_page(handle(), page.handle());
    }
    
    /**
     * Makes the page with the given name visible.
     */
    public void setVisiblePageName(java.lang.String name) {
        gtk_h.adw_preferences_window_set_visible_page_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
}
