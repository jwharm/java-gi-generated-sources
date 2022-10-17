package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwPreferencesWindow} has a main CSS node with the name {@code window} and the
 * style class {@code .preferences}.
 */
public class PreferencesWindow extends Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {

    public PreferencesWindow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PreferencesWindow */
    public static PreferencesWindow castFrom(org.gtk.gobject.Object gobject) {
        return new PreferencesWindow(gobject.refcounted());
    }
    
    private static final MethodHandle adw_preferences_window_new = Interop.downcallHandle(
        "adw_preferences_window_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_preferences_window_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwPreferencesWindow}.
     */
    public PreferencesWindow() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_preferences_window_add = Interop.downcallHandle(
        "adw_preferences_window_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a preferences page to {@code self}.
     */
    public @NotNull void add(@NotNull PreferencesPage page) {
        try {
            adw_preferences_window_add.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_add_toast = Interop.downcallHandle(
        "adw_preferences_window_add_toast",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Displays {@code toast}.
     * <p>
     * See {@link ToastOverlay#addToast}.
     */
    public @NotNull void addToast(@NotNull Toast toast) {
        try {
            adw_preferences_window_add_toast.invokeExact(handle(), toast.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_close_subpage = Interop.downcallHandle(
        "adw_preferences_window_close_subpage",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes the current subpage.
     * <p>
     * If there is no presented subpage, this does nothing.
     */
    public @NotNull void closeSubpage() {
        try {
            adw_preferences_window_close_subpage.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_get_can_navigate_back = Interop.downcallHandle(
        "adw_preferences_window_get_can_navigate_back",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether gestures and shortcuts for closing subpages are enabled.
     */
    public boolean getCanNavigateBack() {
        int RESULT;
        try {
            RESULT = (int) adw_preferences_window_get_can_navigate_back.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_preferences_window_get_search_enabled = Interop.downcallHandle(
        "adw_preferences_window_get_search_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether search is enabled for {@code self}.
     */
    public boolean getSearchEnabled() {
        int RESULT;
        try {
            RESULT = (int) adw_preferences_window_get_search_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_preferences_window_get_visible_page = Interop.downcallHandle(
        "adw_preferences_window_get_visible_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently visible page of {@code self}.
     */
    public @Nullable PreferencesPage getVisiblePage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_preferences_window_get_visible_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PreferencesPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_preferences_window_get_visible_page_name = Interop.downcallHandle(
        "adw_preferences_window_get_visible_page_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of currently visible page of {@code self}.
     */
    public @Nullable java.lang.String getVisiblePageName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_preferences_window_get_visible_page_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_preferences_window_present_subpage = Interop.downcallHandle(
        "adw_preferences_window_present_subpage",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code subpage} as the window's subpage and opens it.
     * <p>
     * The transition can be cancelled by the user, in which case visible child will
     * change back to the previously visible child.
     */
    public @NotNull void presentSubpage(@NotNull org.gtk.gtk.Widget subpage) {
        try {
            adw_preferences_window_present_subpage.invokeExact(handle(), subpage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_remove = Interop.downcallHandle(
        "adw_preferences_window_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a page from {@code self}.
     */
    public @NotNull void remove(@NotNull PreferencesPage page) {
        try {
            adw_preferences_window_remove.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_set_can_navigate_back = Interop.downcallHandle(
        "adw_preferences_window_set_can_navigate_back",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether gestures and shortcuts for closing subpages are enabled.
     */
    public @NotNull void setCanNavigateBack(@NotNull boolean canNavigateBack) {
        try {
            adw_preferences_window_set_can_navigate_back.invokeExact(handle(), canNavigateBack ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_set_search_enabled = Interop.downcallHandle(
        "adw_preferences_window_set_search_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether search is enabled for {@code self}.
     */
    public @NotNull void setSearchEnabled(@NotNull boolean searchEnabled) {
        try {
            adw_preferences_window_set_search_enabled.invokeExact(handle(), searchEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_set_visible_page = Interop.downcallHandle(
        "adw_preferences_window_set_visible_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code page} the visible page of {@code self}.
     */
    public @NotNull void setVisiblePage(@NotNull PreferencesPage page) {
        try {
            adw_preferences_window_set_visible_page.invokeExact(handle(), page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_preferences_window_set_visible_page_name = Interop.downcallHandle(
        "adw_preferences_window_set_visible_page_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the page with the given name visible.
     */
    public @NotNull void setVisiblePageName(@NotNull java.lang.String name) {
        try {
            adw_preferences_window_set_visible_page_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
