package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkTreeExpander` is a widget that provides an expander for a list.
 * 
 * It is typically placed as a bottommost child into a `GtkListView`
 * to allow users to expand and collapse children in a list with a
 * [class@Gtk.TreeListModel]. `GtkTreeExpander` provides the common UI
 * elements, gestures and keybindings for this purpose.
 * 
 * On top of this, the "listitem.expand", "listitem.collapse" and
 * "listitem.toggle-expand" actions are provided to allow adding custom
 * UI for managing expanded state.
 * 
 * The `GtkTreeListModel` must be set to not be passthrough. Then it
 * will provide [class@Gtk.TreeListRow] items which can be set via
 * [method@Gtk.TreeExpander.set_list_row] on the expander.
 * The expander will then watch that row item automatically.
 * [method@Gtk.TreeExpander.set_child] sets the widget that displays
 * the actual row contents.
 * 
 * # CSS nodes
 * 
 * ```
 * treeexpander
 * ├── [indent]*
 * ├── [expander]
 * ╰── <child>
 * ```
 * 
 * `GtkTreeExpander` has zero or one CSS nodes with the name "expander" that
 * should display the expander icon. The node will be `:checked` when it
 * is expanded. If the node is not expandable, an "indent" node will be
 * displayed instead.
 * 
 * For every level of depth, another "indent" node is prepended.
 * 
 * # Accessibility
 * 
 * `GtkTreeExpander` uses the %GTK_ACCESSIBLE_ROLE_GROUP role. The expander icon
 * is represented as a %GTK_ACCESSIBLE_ROLE_BUTTON, labelled by the expander's
 * child, and toggling it will change the %GTK_ACCESSIBLE_STATE_EXPANDED state.
 */
public class TreeExpander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public TreeExpander(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TreeExpander */
    public static TreeExpander castFrom(org.gtk.gobject.Object gobject) {
        return new TreeExpander(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkTreeExpander`
     */
    public TreeExpander() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_new(), false));
    }
    
    /**
     * Gets the child widget displayed by @self.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     */
    public boolean getIndentForIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_get_indent_for_icon(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Forwards the item set on the `GtkTreeListRow` that @self is managing.
     * 
     * This call is essentially equivalent to calling:
     * 
     * ```c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * ```
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_get_item(HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the list row managed by @self.
     */
    public TreeListRow getListRow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_get_list_row(HANDLE());
        return new TreeListRow(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets the content widget to display.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     */
    public void setIndentForIcon(boolean indentForIcon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_set_indent_for_icon(HANDLE(), indentForIcon ? 1 : 0);
    }
    
    /**
     * Sets the tree list row that this expander should manage.
     */
    public void setListRow(TreeListRow listRow) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_expander_set_list_row(HANDLE(), listRow.HANDLE());
    }
    
}
