package org.gnome.adw;

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

    public PreferencesRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PreferencesRow */
    public static PreferencesRow castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesRow(gobject.refcounted());
    }
    
    static final MethodHandle adw_preferences_row_new = Interop.downcallHandle(
        "adw_preferences_row_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_preferences_row_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwPreferencesRow}.
     */
    public PreferencesRow() {
        super(constructNew());
    }
    
    static final MethodHandle adw_preferences_row_get_title = Interop.downcallHandle(
        "adw_preferences_row_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of the preference represented by {@code self}.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_preferences_row_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_row_get_title_selectable = Interop.downcallHandle(
        "adw_preferences_row_get_title_selectable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the user can copy the title from the label
     */
    public boolean getTitleSelectable() {
        try {
            var RESULT = (int) adw_preferences_row_get_title_selectable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_row_get_use_underline = Interop.downcallHandle(
        "adw_preferences_row_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) adw_preferences_row_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_row_set_title = Interop.downcallHandle(
        "adw_preferences_row_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of the preference represented by {@code self}.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_preferences_row_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_row_set_title_selectable = Interop.downcallHandle(
        "adw_preferences_row_set_title_selectable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the user can copy the title from the label
     */
    public void setTitleSelectable(boolean titleSelectable) {
        try {
            adw_preferences_row_set_title_selectable.invokeExact(handle(), titleSelectable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_row_set_use_underline = Interop.downcallHandle(
        "adw_preferences_row_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            adw_preferences_row_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
