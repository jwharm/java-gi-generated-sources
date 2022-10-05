package org.gnome.adw;

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

    public PreferencesPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PreferencesPage */
    public static PreferencesPage castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesPage(gobject.refcounted());
    }
    
    static final MethodHandle adw_preferences_page_new = Interop.downcallHandle(
        "adw_preferences_page_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_preferences_page_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwPreferencesPage}.
     */
    public PreferencesPage() {
        super(constructNew());
    }
    
    static final MethodHandle adw_preferences_page_add = Interop.downcallHandle(
        "adw_preferences_page_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a preferences group to {@code self}.
     */
    public void add(PreferencesGroup group) {
        try {
            adw_preferences_page_add.invokeExact(handle(), group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_get_icon_name = Interop.downcallHandle(
        "adw_preferences_page_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) adw_preferences_page_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_get_name = Interop.downcallHandle(
        "adw_preferences_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code self}.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) adw_preferences_page_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_get_title = Interop.downcallHandle(
        "adw_preferences_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_preferences_page_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_get_use_underline = Interop.downcallHandle(
        "adw_preferences_page_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) adw_preferences_page_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_remove = Interop.downcallHandle(
        "adw_preferences_page_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a group from {@code self}.
     */
    public void remove(PreferencesGroup group) {
        try {
            adw_preferences_page_remove.invokeExact(handle(), group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_set_icon_name = Interop.downcallHandle(
        "adw_preferences_page_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            adw_preferences_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_set_name = Interop.downcallHandle(
        "adw_preferences_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of {@code self}.
     */
    public void setName(java.lang.String name) {
        try {
            adw_preferences_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_set_title = Interop.downcallHandle(
        "adw_preferences_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_preferences_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_preferences_page_set_use_underline = Interop.downcallHandle(
        "adw_preferences_page_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            adw_preferences_page_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
