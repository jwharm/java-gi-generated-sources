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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public SearchBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SearchBar */
    public static SearchBar castFrom(org.gtk.gobject.Object gobject) {
        return new SearchBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_search_bar_new.invokeExact(), false);
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
        super(constructNew());
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
            DowncallHandles.gtk_search_bar_connect_entry.invokeExact(handle(), entry.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_bar_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the widget that {@code bar} is capturing key events from.
     * @return The key capture widget.
     */
    public @Nullable org.gtk.gtk.Widget getKeyCaptureWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_bar_get_key_capture_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the search mode is on or off.
     * @return whether search mode is toggled on
     */
    public boolean getSearchMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_search_bar_get_search_mode.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_search_bar_get_show_close_button.invokeExact(handle());
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
        java.util.Objects.requireNonNullElse(child, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_search_bar_set_child.invokeExact(handle(), child.handle());
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
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_search_bar_set_key_capture_widget.invokeExact(handle(), widget.handle());
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
            DowncallHandles.gtk_search_bar_set_search_mode.invokeExact(handle(), searchMode ? 1 : 0);
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
            DowncallHandles.gtk_search_bar_set_show_close_button.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_search_bar_new = Interop.downcallHandle(
            "gtk_search_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_connect_entry = Interop.downcallHandle(
            "gtk_search_bar_connect_entry",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_get_child = Interop.downcallHandle(
            "gtk_search_bar_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_get_key_capture_widget = Interop.downcallHandle(
            "gtk_search_bar_get_key_capture_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_get_search_mode = Interop.downcallHandle(
            "gtk_search_bar_get_search_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_get_show_close_button = Interop.downcallHandle(
            "gtk_search_bar_get_show_close_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_set_child = Interop.downcallHandle(
            "gtk_search_bar_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_set_key_capture_widget = Interop.downcallHandle(
            "gtk_search_bar_set_key_capture_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_search_bar_set_search_mode = Interop.downcallHandle(
            "gtk_search_bar_set_search_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_search_bar_set_show_close_button = Interop.downcallHandle(
            "gtk_search_bar_set_show_close_button",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
