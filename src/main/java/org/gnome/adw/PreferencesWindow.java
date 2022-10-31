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
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwPreferencesWindow} has a main CSS node with the name {@code window} and the
 * style class {@code .preferences}.
 * @version 1.0
 */
public class PreferencesWindow extends org.gnome.adw.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesWindow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.Window.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gnome.adw.Window parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gnome.adw.Window(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public PreferencesWindow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PreferencesWindow if its GType is a (or inherits from) "AdwPreferencesWindow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PreferencesWindow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesWindow", a ClassCastException will be thrown.
     */
    public static PreferencesWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPreferencesWindow"))) {
            return new PreferencesWindow(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPreferencesWindow");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_preferences_window_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param page the page to add
     */
    public void add(@NotNull org.gnome.adw.PreferencesPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_preferences_window_add.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Displays {@code toast}.
     * <p>
     * See {@code ToastOverlay#addToast}.
     * @param toast a toast
     */
    public void addToast(@NotNull org.gnome.adw.Toast toast) {
        java.util.Objects.requireNonNull(toast, "Parameter 'toast' must not be null");
        try {
            DowncallHandles.adw_preferences_window_add_toast.invokeExact(
                    handle(),
                    toast.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Closes the current subpage.
     * <p>
     * If there is no presented subpage, this does nothing.
     */
    public void closeSubpage() {
        try {
            DowncallHandles.adw_preferences_window_close_subpage.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether gestures and shortcuts for closing subpages are enabled.
     * @return whether gestures and shortcuts are enabled.
     */
    public boolean getCanNavigateBack() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_window_get_can_navigate_back.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether search is enabled for {@code self}.
     * @return whether search is enabled for {@code self}.
     */
    public boolean getSearchEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_window_get_search_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the currently visible page of {@code self}.
     * @return the visible page
     */
    public @Nullable org.gnome.adw.PreferencesPage getVisiblePage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_window_get_visible_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.PreferencesPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of currently visible page of {@code self}.
     * @return the name of the visible page
     */
    public @Nullable java.lang.String getVisiblePageName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_window_get_visible_page_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets {@code subpage} as the window's subpage and opens it.
     * <p>
     * The transition can be cancelled by the user, in which case visible child will
     * change back to the previously visible child.
     * @param subpage the subpage
     */
    public void presentSubpage(@NotNull org.gtk.gtk.Widget subpage) {
        java.util.Objects.requireNonNull(subpage, "Parameter 'subpage' must not be null");
        try {
            DowncallHandles.adw_preferences_window_present_subpage.invokeExact(
                    handle(),
                    subpage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a page from {@code self}.
     * @param page the page to remove
     */
    public void remove(@NotNull org.gnome.adw.PreferencesPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_preferences_window_remove.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether gestures and shortcuts for closing subpages are enabled.
     * <p>
     * The supported gestures are:
     * <ul>
     * <li>One-finger swipe on touchscreens
     * <li>Horizontal scrolling on touchpads (usually two-finger swipe)
     * <li>Back mouse button
     * </ul>
     * <p>
     * The keyboard back key is also supported, as well as the
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;←&lt;/kbd&gt; shortcut.
     * <p>
     * For right-to-left locales, gestures and shortcuts are reversed.
     * @param canNavigateBack the new value
     */
    public void setCanNavigateBack(boolean canNavigateBack) {
        try {
            DowncallHandles.adw_preferences_window_set_can_navigate_back.invokeExact(
                    handle(),
                    canNavigateBack ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether search is enabled for {@code self}.
     * @param searchEnabled whether search is enabled
     */
    public void setSearchEnabled(boolean searchEnabled) {
        try {
            DowncallHandles.adw_preferences_window_set_search_enabled.invokeExact(
                    handle(),
                    searchEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code page} the visible page of {@code self}.
     * @param page a page of {@code self}
     */
    public void setVisiblePage(@NotNull org.gnome.adw.PreferencesPage page) {
        java.util.Objects.requireNonNull(page, "Parameter 'page' must not be null");
        try {
            DowncallHandles.adw_preferences_window_set_visible_page.invokeExact(
                    handle(),
                    page.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes the page with the given name visible.
     * <p>
     * See {@code ViewStack:visible-child}.
     * @param name the name of the page to make visible
     */
    public void setVisiblePageName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.adw_preferences_window_set_visible_page_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_window_new = Interop.downcallHandle(
            "adw_preferences_window_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_add = Interop.downcallHandle(
            "adw_preferences_window_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_add_toast = Interop.downcallHandle(
            "adw_preferences_window_add_toast",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_close_subpage = Interop.downcallHandle(
            "adw_preferences_window_close_subpage",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_get_can_navigate_back = Interop.downcallHandle(
            "adw_preferences_window_get_can_navigate_back",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_get_search_enabled = Interop.downcallHandle(
            "adw_preferences_window_get_search_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_get_visible_page = Interop.downcallHandle(
            "adw_preferences_window_get_visible_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_get_visible_page_name = Interop.downcallHandle(
            "adw_preferences_window_get_visible_page_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_present_subpage = Interop.downcallHandle(
            "adw_preferences_window_present_subpage",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_remove = Interop.downcallHandle(
            "adw_preferences_window_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_set_can_navigate_back = Interop.downcallHandle(
            "adw_preferences_window_set_can_navigate_back",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_preferences_window_set_search_enabled = Interop.downcallHandle(
            "adw_preferences_window_set_search_enabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_preferences_window_set_visible_page = Interop.downcallHandle(
            "adw_preferences_window_set_visible_page",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_window_set_visible_page_name = Interop.downcallHandle(
            "adw_preferences_window_set_visible_page_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
