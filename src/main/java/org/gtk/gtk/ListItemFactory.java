package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkListItemFactory} creates widgets for the items taken from a {@code GListModel}.
 * <p>
 * This is one of the core concepts of handling list widgets such
 * as {@code Gtk.GridView}.
 * <p>
 * The {@code GtkListItemFactory} is tasked with creating widgets for items
 * taken from the model when the views need them and updating them as
 * the items displayed by the view change.
 * <p>
 * A view is usually only able to display anything after both a factory
 * and a model have been set on the view. So it is important that you do
 * not skip this step when setting up your first view.
 * <p>
 * Because views do not display the whole list at once but only a few
 * items, they only need to maintain a few widgets at a time. They will
 * instruct the {@code GtkListItemFactory} to create these widgets and bind them
 * to the items that are currently displayed.
 * <p>
 * As the list model changes or the user scrolls to the list, the items will
 * change and the view will instruct the factory to bind the widgets to those
 * new items.
 * <p>
 * The actual widgets used for displaying those widgets is provided by you.
 * <p>
 * When the factory needs widgets created, it will create a {@code GtkListItem}
 * and hand it to your code to set up a widget for. This list item will provide
 * various properties with information about what item to display and provide
 * you with some opportunities to configure its behavior. See the
 * {@link ListItem} documentation for further details.
 * <p>
 * Various implementations of {@code GtkListItemFactory} exist to allow you different
 * ways to provide those widgets. The most common implementations are
 * {@link BuilderListItemFactory} which takes a {@code GtkBuilder} .ui file
 * and then creates widgets and manages everything automatically from the
 * information in that file and {@link SignalListItemFactory} which allows
 * you to connect to signals with your own code and retain full control over
 * how the widgets are setup and managed.
 * <p>
 * A {@code GtkListItemFactory} is supposed to be final - that means its behavior should
 * not change and the first widget created from it should behave the same way as
 * the last widget created from it.
 * If you intend to do changes to the behavior, it is recommended that you create
 * a new {@code GtkListItemFactory} which will allow the views to recreate its widgets.
 * <p>
 * Once you have chosen your factory and created it, you need to set it
 * on the view widget you want to use it with, such as via
 * {@link ListView#setFactory}. Reusing factories across different
 * views is allowed, but very uncommon.
 */
public class ListItemFactory extends org.gtk.gobject.Object {

    public ListItemFactory(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListItemFactory */
    public static ListItemFactory castFrom(org.gtk.gobject.Object gobject) {
        return new ListItemFactory(gobject.refcounted());
    }
    
}
