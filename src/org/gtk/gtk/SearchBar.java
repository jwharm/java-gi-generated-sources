package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>Creating a search bar</h2>
 * <p>
 * The following example shows you how to create a more complex search
 * entry.
 * <p>
 * <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c">A simple example</a>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkSearchBar} uses the {@link AccessibleRole#SEARCH} role.
 */
public class SearchBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public SearchBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SearchBar */
    public static SearchBar castFrom(org.gtk.gobject.Object gobject) {
        return new SearchBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_search_bar_new(), false);
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
     */
    public void connectEntry(Editable entry) {
        gtk_h.gtk_search_bar_connect_entry(handle(), entry.handle());
    }
    
    /**
     * Gets the child widget of {@code bar}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_search_bar_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the widget that {@code bar} is capturing key events from.
     */
    public Widget getKeyCaptureWidget() {
        var RESULT = gtk_h.gtk_search_bar_get_key_capture_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the search mode is on or off.
     */
    public boolean getSearchMode() {
        var RESULT = gtk_h.gtk_search_bar_get_search_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the close button is shown.
     */
    public boolean getShowCloseButton() {
        var RESULT = gtk_h.gtk_search_bar_get_show_close_button(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of {@code bar}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_search_bar_set_child(handle(), child.handle());
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
     */
    public void setKeyCaptureWidget(Widget widget) {
        gtk_h.gtk_search_bar_set_key_capture_widget(handle(), widget.handle());
    }
    
    /**
     * Switches the search mode on or off.
     */
    public void setSearchMode(boolean searchMode) {
        gtk_h.gtk_search_bar_set_search_mode(handle(), searchMode ? 1 : 0);
    }
    
    /**
     * Shows or hides the close button.
     * <p>
     * Applications that already have a “search” toggle button should not
     * show a close button in their search bar, as it duplicates the role
     * of the toggle button.
     */
    public void setShowCloseButton(boolean visible) {
        gtk_h.gtk_search_bar_set_show_close_button(handle(), visible ? 1 : 0);
    }
    
}
