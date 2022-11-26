package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSearchBar} is a container made to have a search entry.
 * <p>
 * <img src="./doc-files/search-bar.png" alt="An example GtkSearchBar">
 * <p>
 * It can also contain additional widgets, such as drop-down menus,
 * or buttons.  The search bar would appear when a search is started
 * through typing on the keyboard, or the application’s search mode
 * is toggled on.
 * <p>
 * For keyboard presses to start a search, the search bar must be told
 * of a widget to capture key events from through
 * {@link SearchBar#setKeyCaptureWidget}. This widget will
 * typically be the top-level window, or a parent container of the
 * search bar. Common shortcuts such as Ctrl+F should be handled as an
 * application action, or through the menu items.
 * <p>
 * You will also need to tell the search bar about which entry you
 * are using as your search entry using {@link SearchBar#connectEntry}.
 * <p>
 * <strong>Creating a search bar</strong><br/>
 * The following example shows you how to create a more complex search
 * entry.
 * <p>
 * <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c">A simple example</a>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * searchbar
 * ╰── revealer
 *     ╰── box
 *          ├── [child]
 *          ╰── [button.close]
 * }</pre>
 * <p>
 * {@code GtkSearchBar} has a main CSS node with name searchbar. It has a child
 * node with name revealer that contains a node with name box. The box node
 * contains both the CSS node of the child widget as well as an optional button
 * node which gets the .close style class applied.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkSearchBar} uses the {@link AccessibleRole#SEARCH} role.
 */
public class SearchBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSearchBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SearchBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SearchBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SearchBar if its GType is a (or inherits from) "GtkSearchBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SearchBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSearchBar", a ClassCastException will be thrown.
     */
    public static SearchBar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SearchBar.getType())) {
            return new SearchBar(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSearchBar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkSearchBar}.
     * <p>
     * You will need to tell it about which widget is going to be your text
     * entry using {@link SearchBar#connectEntry}.
     */
    public SearchBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Connects the `GtkEditable widget passed as the one to be used in
     * this search bar.
     * <p>
     * The entry should be a descendant of the search bar. Calling this
     * function manually is only required if the entry isn’t the direct
     * child of the search bar (as in our main example).
     * @param entry a {@code GtkEditable}
     */
    public void connectEntry(@NotNull org.gtk.gtk.Editable entry) {
        java.util.Objects.requireNonNull(entry, "Parameter 'entry' must not be null");
        try {
            DowncallHandles.gtk_search_bar_connect_entry.invokeExact(
                    handle(),
                    entry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the child widget of {@code bar}.
     * @return the child widget of {@code bar}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_bar_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the widget that {@code bar} is capturing key events from.
     * @return The key capture widget.
     */
    public @Nullable org.gtk.gtk.Widget getKeyCaptureWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_bar_get_key_capture_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the search mode is on or off.
     * @return whether search mode is toggled on
     */
    public boolean getSearchMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_search_bar_get_search_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the close button is shown.
     * @return whether the close button is shown
     */
    public boolean getShowCloseButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_search_bar_get_show_close_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the child widget of {@code bar}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_search_bar_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code widget} as the widget that {@code bar} will capture key events
     * from.
     * <p>
     * If key events are handled by the search bar, the bar will
     * be shown, and the entry populated with the entered text.
     * <p>
     * Note that despite the name of this function, the events
     * are only 'captured' in the bubble phase, which means that
     * editable child widgets of {@code widget} will receive text input
     * before it gets captured. If that is not desired, you can
     * capture and forward the events yourself with
     * {@link EventControllerKey#forward}.
     * @param widget a {@code GtkWidget}
     */
    public void setKeyCaptureWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_search_bar_set_key_capture_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Switches the search mode on or off.
     * @param searchMode the new state of the search mode
     */
    public void setSearchMode(boolean searchMode) {
        try {
            DowncallHandles.gtk_search_bar_set_search_mode.invokeExact(
                    handle(),
                    searchMode ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shows or hides the close button.
     * <p>
     * Applications that already have a “search” toggle button should not
     * show a close button in their search bar, as it duplicates the role
     * of the toggle button.
     * @param visible whether the close button will be shown or not
     */
    public void setShowCloseButton(boolean visible) {
        try {
            DowncallHandles.gtk_search_bar_set_show_close_button.invokeExact(
                    handle(),
                    visible ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_search_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link SearchBar.Build} object constructs a {@link SearchBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SearchBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SearchBar} using {@link SearchBar#castFrom}.
         * @return A new instance of {@code SearchBar} with the properties 
         *         that were set in the Build object.
         */
        public SearchBar construct() {
            return SearchBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SearchBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The key capture widget.
         * @param keyCaptureWidget The value for the {@code key-capture-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKeyCaptureWidget(org.gtk.gtk.Widget keyCaptureWidget) {
            names.add("key-capture-widget");
            values.add(org.gtk.gobject.Value.create(keyCaptureWidget));
            return this;
        }
        
        /**
         * Whether the search mode is on and the search bar shown.
         * @param searchModeEnabled The value for the {@code search-mode-enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSearchModeEnabled(boolean searchModeEnabled) {
            names.add("search-mode-enabled");
            values.add(org.gtk.gobject.Value.create(searchModeEnabled));
            return this;
        }
        
        /**
         * Whether to show the close button in the search bar.
         * @param showCloseButton The value for the {@code show-close-button} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowCloseButton(boolean showCloseButton) {
            names.add("show-close-button");
            values.add(org.gtk.gobject.Value.create(showCloseButton));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_search_bar_new = Interop.downcallHandle(
            "gtk_search_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_connect_entry = Interop.downcallHandle(
            "gtk_search_bar_connect_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_get_child = Interop.downcallHandle(
            "gtk_search_bar_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_get_key_capture_widget = Interop.downcallHandle(
            "gtk_search_bar_get_key_capture_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_get_search_mode = Interop.downcallHandle(
            "gtk_search_bar_get_search_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_get_show_close_button = Interop.downcallHandle(
            "gtk_search_bar_get_show_close_button",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_set_child = Interop.downcallHandle(
            "gtk_search_bar_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_set_key_capture_widget = Interop.downcallHandle(
            "gtk_search_bar_set_key_capture_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_bar_set_search_mode = Interop.downcallHandle(
            "gtk_search_bar_set_search_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_search_bar_set_show_close_button = Interop.downcallHandle(
            "gtk_search_bar_set_show_close_button",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_search_bar_get_type = Interop.downcallHandle(
            "gtk_search_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
