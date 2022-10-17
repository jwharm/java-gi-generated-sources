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
 * 
 * <h2>Creating a search bar</h2>
 * The following example shows you how to create a more complex search
 * entry.
 * <p>
 * <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c">A simple example</a>
 * 
 * <h1>CSS nodes</h1>
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
 * 
 * <h1>Accessibility</h1>
 * {@code GtkSearchBar} uses the {@link AccessibleRole#SEARCH} role.
 */
public class SearchBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public SearchBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SearchBar */
    public static SearchBar castFrom(org.gtk.gobject.Object gobject) {
        return new SearchBar(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_search_bar_new = Interop.downcallHandle(
        "gtk_search_bar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_search_bar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_search_bar_connect_entry = Interop.downcallHandle(
        "gtk_search_bar_connect_entry",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Connects the `GtkEditable widget passed as the one to be used in
     * this search bar.
     * <p>
     * The entry should be a descendant of the search bar. Calling this
     * function manually is only required if the entry isn’t the direct
     * child of the search bar (as in our main example).
     */
    public @NotNull void connectEntry(@NotNull Editable entry) {
        try {
            gtk_search_bar_connect_entry.invokeExact(handle(), entry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_search_bar_get_child = Interop.downcallHandle(
        "gtk_search_bar_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code bar}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_search_bar_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_search_bar_get_key_capture_widget = Interop.downcallHandle(
        "gtk_search_bar_get_key_capture_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget that {@code bar} is capturing key events from.
     */
    public @Nullable Widget getKeyCaptureWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_search_bar_get_key_capture_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_search_bar_get_search_mode = Interop.downcallHandle(
        "gtk_search_bar_get_search_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the search mode is on or off.
     */
    public boolean getSearchMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_search_bar_get_search_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_search_bar_get_show_close_button = Interop.downcallHandle(
        "gtk_search_bar_get_show_close_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the close button is shown.
     */
    public boolean getShowCloseButton() {
        int RESULT;
        try {
            RESULT = (int) gtk_search_bar_get_show_close_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_search_bar_set_child = Interop.downcallHandle(
        "gtk_search_bar_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code bar}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_search_bar_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_search_bar_set_key_capture_widget = Interop.downcallHandle(
        "gtk_search_bar_set_key_capture_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setKeyCaptureWidget(@Nullable Widget widget) {
        try {
            gtk_search_bar_set_key_capture_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_search_bar_set_search_mode = Interop.downcallHandle(
        "gtk_search_bar_set_search_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Switches the search mode on or off.
     */
    public @NotNull void setSearchMode(@NotNull boolean searchMode) {
        try {
            gtk_search_bar_set_search_mode.invokeExact(handle(), searchMode ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_search_bar_set_show_close_button = Interop.downcallHandle(
        "gtk_search_bar_set_show_close_button",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Shows or hides the close button.
     * <p>
     * Applications that already have a “search” toggle button should not
     * show a close button in their search bar, as it duplicates the role
     * of the toggle button.
     */
    public @NotNull void setShowCloseButton(@NotNull boolean visible) {
        try {
            gtk_search_bar_set_show_close_button.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
