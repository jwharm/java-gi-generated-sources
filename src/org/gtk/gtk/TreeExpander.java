package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkTreeExpander</code> is a widget that provides an expander for a list.
 * <p>
 * It is typically placed as a bottommost child into a <code>GtkListView</code>
 * to allow users to expand and collapse children in a list with a
 * {@link org.gtk.gtk.TreeListModel}. <code>GtkTreeExpander</code> provides the common UI
 * elements, gestures and keybindings for this purpose.
 * <p>
 * On top of this, the &<code>#34</code> listitem.expand&<code>#34</code> , &<code>#34</code> listitem.collapse&<code>#34</code>  and
 * &<code>#34</code> listitem.toggle-expand&<code>#34</code>  actions are provided to allow adding custom
 * UI for managing expanded state.
 * <p>
 * The <code>GtkTreeListModel</code> must be set to not be passthrough. Then it
 * will provide {@link org.gtk.gtk.TreeListRow} items which can be set via
 * {@link org.gtk.gtk.TreeExpander<code>#setListRow</code>  on the expander.
 * The expander will then watch that row item automatically.
 * {@link org.gtk.gtk.TreeExpander<code>#setChild</code>  sets the widget that displays
 * the actual row contents.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * treeexpander
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [indent]}*
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [expander]}
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  &<code>#60</code> child&<code>#62</code> 
 * </pre>
 * <p><code>GtkTreeExpander</code> has zero or one CSS nodes with the name &<code>#34</code> expander&<code>#34</code>  that
 * should display the expander icon. The node will be <code>:checked</code> when it
 * is expanded. If the node is not expandable, an &<code>#34</code> indent&<code>#34</code>  node will be
 * displayed instead.
 * <p>
 * For every level of depth, another &<code>#34</code> indent&<code>#34</code>  node is prepended.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkTreeExpander</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#GROUP</code>  role. The expander icon
 * is represented as a {@link org.gtk.gtk.AccessibleRole<code>#BUTTON</code>   labelled by the expander&<code>#39</code> s
 * child, and toggling it will change the {@link org.gtk.gtk.AccessibleState<code>#EXPANDED</code>  state.
 */
public class TreeExpander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public TreeExpander(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeExpander */
    public static TreeExpander castFrom(org.gtk.gobject.Object gobject) {
        return new TreeExpander(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_tree_expander_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTreeExpander</code>
     */
    public TreeExpander() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget displayed by @self.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_tree_expander_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     */
    public boolean getIndentForIcon() {
        var RESULT = gtk_h.gtk_tree_expander_get_indent_for_icon(handle());
        return (RESULT != 0);
    }
    
    /**
     * Forwards the item set on the <code>GtkTreeListRow</code> that @self is managing.
     * <p>
     * This call is essentially equivalent to calling:
     * <p><pre>c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * </pre>
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = gtk_h.gtk_tree_expander_get_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, true));
    }
    
    /**
     * Gets the list row managed by @self.
     */
    public TreeListRow getListRow() {
        var RESULT = gtk_h.gtk_tree_expander_get_list_row(handle());
        return new TreeListRow(References.get(RESULT, false));
    }
    
    /**
     * Sets the content widget to display.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_tree_expander_set_child(handle(), child.handle());
    }
    
    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     */
    public void setIndentForIcon(boolean indentForIcon) {
        gtk_h.gtk_tree_expander_set_indent_for_icon(handle(), indentForIcon ? 1 : 0);
    }
    
    /**
     * Sets the tree list row that this expander should manage.
     */
    public void setListRow(TreeListRow listRow) {
        gtk_h.gtk_tree_expander_set_list_row(handle(), listRow.handle());
    }
    
}
