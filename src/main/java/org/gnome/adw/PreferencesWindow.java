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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.Window.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a PreferencesWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PreferencesWindow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PreferencesWindow if its GType is a (or inherits from) "AdwPreferencesWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PreferencesWindow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesWindow", a ClassCastException will be thrown.
     */
    public static PreferencesWindow castFrom(org.gtk.gobject.Object gobject) {
            return new PreferencesWindow(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_window_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesWindow}.
     */
    public PreferencesWindow() {
        super(constructNew(), Ownership.NONE);
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
                    toast.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        toast.yieldOwnership();
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
        return new org.gnome.adw.PreferencesPage(RESULT, Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_preferences_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gnome.adw.Window.Build {
        
         /**
         * A {@link PreferencesWindow.Build} object constructs a {@link PreferencesWindow} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PreferencesWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PreferencesWindow} using {@link PreferencesWindow#castFrom}.
         * @return A new instance of {@code PreferencesWindow} with the properties 
         *         that were set in the Build object.
         */
        public PreferencesWindow construct() {
            return PreferencesWindow.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PreferencesWindow.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether gestures and shortcuts for closing subpages are enabled.
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
         * @param canNavigateBack The value for the {@code can-navigate-back} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCanNavigateBack(boolean canNavigateBack) {
            names.add("can-navigate-back");
            values.add(org.gtk.gobject.Value.create(canNavigateBack));
            return this;
        }
        
        /**
         * Whether search is enabled.
         * @param searchEnabled The value for the {@code search-enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSearchEnabled(boolean searchEnabled) {
            names.add("search-enabled");
            values.add(org.gtk.gobject.Value.create(searchEnabled));
            return this;
        }
        
        public Build setVisiblePage(org.gtk.gtk.Widget visiblePage) {
            names.add("visible-page");
            values.add(org.gtk.gobject.Value.create(visiblePage));
            return this;
        }
        
        public Build setVisiblePageName(java.lang.String visiblePageName) {
            names.add("visible-page-name");
            values.add(org.gtk.gobject.Value.create(visiblePageName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_window_new = Interop.downcallHandle(
            "adw_preferences_window_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_add = Interop.downcallHandle(
            "adw_preferences_window_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_add_toast = Interop.downcallHandle(
            "adw_preferences_window_add_toast",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_close_subpage = Interop.downcallHandle(
            "adw_preferences_window_close_subpage",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_get_can_navigate_back = Interop.downcallHandle(
            "adw_preferences_window_get_can_navigate_back",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_get_search_enabled = Interop.downcallHandle(
            "adw_preferences_window_get_search_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_get_visible_page = Interop.downcallHandle(
            "adw_preferences_window_get_visible_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_get_visible_page_name = Interop.downcallHandle(
            "adw_preferences_window_get_visible_page_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_present_subpage = Interop.downcallHandle(
            "adw_preferences_window_present_subpage",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_remove = Interop.downcallHandle(
            "adw_preferences_window_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_set_can_navigate_back = Interop.downcallHandle(
            "adw_preferences_window_set_can_navigate_back",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_window_set_search_enabled = Interop.downcallHandle(
            "adw_preferences_window_set_search_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_window_set_visible_page = Interop.downcallHandle(
            "adw_preferences_window_set_visible_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_set_visible_page_name = Interop.downcallHandle(
            "adw_preferences_window_set_visible_page_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_window_get_type = Interop.downcallHandle(
            "adw_preferences_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
