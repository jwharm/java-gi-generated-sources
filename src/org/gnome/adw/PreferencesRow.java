package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to present preferences.
 * <p>
 * The {@code AdwPreferencesRow} widget has a title that {@link PreferencesWindow}
 * will use to let the user look for a preference. It doesn't present the title
 * in any way and lets you present the preference as you please.
 * <p>
 * {@link ActionRow} and its derivatives are convenient to use as preference
 * rows as they take care of presenting the preference's title while letting you
 * compose the inputs of the preference around it.
 */
public class PreferencesRow extends org.gtk.gtk.ListBoxRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public PreferencesRow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PreferencesRow */
    public static PreferencesRow castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesRow(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_preferences_row_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesRow}.
     */
    public PreferencesRow() {
        super(constructNew());
    }
    
    /**
     * Gets the title of the preference represented by {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_preferences_row_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the user can copy the title from the label
     */
    public boolean getTitleSelectable() {
        var RESULT = gtk_h.adw_preferences_row_get_title_selectable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.adw_preferences_row_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the title of the preference represented by {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_preferences_row_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets whether the user can copy the title from the label
     */
    public void setTitleSelectable(boolean titleSelectable) {
        gtk_h.adw_preferences_row_set_title_selectable(handle(), titleSelectable ? 1 : 0);
    }
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.adw_preferences_row_set_use_underline(handle(), useUnderline ? 1 : 0);
    }
    
}
