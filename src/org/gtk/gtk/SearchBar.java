package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSearchBar</code> is a container made to have a search entry.
 * <p>
 * !{@link [An example GtkSearchBar]}(search-bar.png)
 * <p>
 * It can also contain additional widgets, such as drop-down menus,
 * or buttons.  The search bar would appear when a search is started
 * through typing on the keyboard, or the application&#8217;s search mode
 * is toggled on.
 * <p>
 * For keyboard presses to start a search, the search bar must be told
 * of a widget to capture key events from through
 * {@link org.gtk.gtk.SearchBar#setKeyCaptureWidget}. This widget will
 * typically be the top-level window, or a parent container of the
 * search bar. Common shortcuts such as Ctrl+F should be handled as an
 * application action, or through the menu items.
 * <p>
 * You will also need to tell the search bar about which entry you
 * are using as your search entry using {@link org.gtk.gtk.SearchBar#connectEntry}.
 * <p>
 * <h2>Creating a search bar</h2>
 * <p>
 * The following example shows you how to create a more complex search
 * entry.
 * <p>
 * {@link [A simple example]}(https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c)
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * searchbar
 * &#9584;&#9472;&#9472; revealer
 *     &#9584;&#9472;&#9472; box
 *          &#9500;&#9472;&#9472; {@link [child]}
 *          &#9584;&#9472;&#9472; {@link [button.close]}
 * </pre>
 * <p><code>GtkSearchBar</code> has a main CSS node with name searchbar. It has a child
 * node with name revealer that contains a node with name box. The box node
 * contains both the CSS node of the child widget as well as an optional button
 * node which gets the .close style class applied.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkSearchBar</code> uses the {@link org.gtk.gtk.AccessibleRole#SEARCH} role.
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
     * Creates a <code>GtkSearchBar</code>.
     * 
     * You will need to tell it about which widget is going to be your text
     * entry using {@link org.gtk.gtk.SearchBar#connectEntry}.
     */
    public SearchBar() {
        super(constructNew());
    }
    
    /**
     * Connects the <code>GtkEditable widget passed as the one to be used in
     * this search bar.
     * 
     * The entry should be a descendant of the search bar. Calling this
     * function manually is only required if the entry isn&#8217;t the direct
     * child of the search bar (as in our main example).
     */
    public void connectEntry(Editable entry) {
        gtk_h.gtk_search_bar_connect_entry(handle(), entry.handle());
    }
    
    /**
     * Gets the child widget of @bar.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_search_bar_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the widget that @bar is capturing key events from.
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
     * Sets the child widget of @bar.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_search_bar_set_child(handle(), child.handle());
    }
    
    /**
     * Sets @widget as the widget that @bar will capture key events
     * from.
     * 
     * If key events are handled by the search bar, the bar will
     * be shown, and the entry populated with the entered text.
     * 
     * Note that despite the name of this function, the events
     * are only &#39;captured&#39; in the bubble phase, which means that
     * editable child widgets of @widget will receive text input
     * before it gets captured. If that is not desired, you can
     * capture and forward the events yourself with
     * {@link org.gtk.gtk.EventControllerKey#forward}.
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
     * 
     * Applications that already have a &#8220;search&#8221; toggle button should not
     * show a close button in their search bar, as it duplicates the role
     * of the toggle button.
     */
    public void setShowCloseButton(boolean visible) {
        gtk_h.gtk_search_bar_set_show_close_button(handle(), visible ? 1 : 0);
    }
    
}
