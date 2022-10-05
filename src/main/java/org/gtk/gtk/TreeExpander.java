package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkTreeExpander} is a widget that provides an expander for a list.
 * <p>
 * It is typically placed as a bottommost child into a {@code GtkListView}
 * to allow users to expand and collapse children in a list with a
 * {@link TreeListModel}. {@code GtkTreeExpander} provides the common UI
 * elements, gestures and keybindings for this purpose.
 * <p>
 * On top of this, the "listitem.expand", "listitem.collapse" and
 * "listitem.toggle-expand" actions are provided to allow adding custom
 * UI for managing expanded state.
 * <p>
 * The {@code GtkTreeListModel} must be set to not be passthrough. Then it
 * will provide {@link TreeListRow} items which can be set via
 * {@link TreeExpander#setListRow} on the expander.
 * The expander will then watch that row item automatically.
 * {@link TreeExpander#setChild} sets the widget that displays
 * the actual row contents.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * treeexpander
 * ├── [indent]*
 * ├── [expander]
 * ╰── <child>
 * }</pre>
 * <p>
 * {@code GtkTreeExpander} has zero or one CSS nodes with the name "expander" that
 * should display the expander icon. The node will be {@code :checked} when it
 * is expanded. If the node is not expandable, an "indent" node will be
 * displayed instead.
 * <p>
 * For every level of depth, another "indent" node is prepended.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkTreeExpander} uses the {@link AccessibleRole#GROUP} role. The expander icon
 * is represented as a {@link AccessibleRole#BUTTON}, labelled by the expander's
 * child, and toggling it will change the {@link AccessibleState#EXPANDED} state.
 */
public class TreeExpander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public TreeExpander(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeExpander */
    public static TreeExpander castFrom(org.gtk.gobject.Object gobject) {
        return new TreeExpander(gobject.refcounted());
    }
    
    static final MethodHandle gtk_tree_expander_new = Interop.downcallHandle(
        "gtk_tree_expander_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_expander_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreeExpander}
     */
    public TreeExpander() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_tree_expander_get_child = Interop.downcallHandle(
        "gtk_tree_expander_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget displayed by {@code self}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_expander_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_get_indent_for_icon = Interop.downcallHandle(
        "gtk_tree_expander_get_indent_for_icon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     */
    public boolean getIndentForIcon() {
        try {
            var RESULT = (int) gtk_tree_expander_get_indent_for_icon.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_get_item = Interop.downcallHandle(
        "gtk_tree_expander_get_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Forwards the item set on the {@code GtkTreeListRow} that {@code self} is managing.
     * <p>
     * This call is essentially equivalent to calling:
     * <p>
     * <pre>{@code c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * }</pre>
     */
    public org.gtk.gobject.Object getItem() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_expander_get_item.invokeExact(handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_get_list_row = Interop.downcallHandle(
        "gtk_tree_expander_get_list_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list row managed by {@code self}.
     */
    public TreeListRow getListRow() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_expander_get_list_row.invokeExact(handle());
            return new TreeListRow(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_set_child = Interop.downcallHandle(
        "gtk_tree_expander_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the content widget to display.
     */
    public void setChild(Widget child) {
        try {
            gtk_tree_expander_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_set_indent_for_icon = Interop.downcallHandle(
        "gtk_tree_expander_set_indent_for_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     */
    public void setIndentForIcon(boolean indentForIcon) {
        try {
            gtk_tree_expander_set_indent_for_icon.invokeExact(handle(), indentForIcon ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_expander_set_list_row = Interop.downcallHandle(
        "gtk_tree_expander_set_list_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tree list row that this expander should manage.
     */
    public void setListRow(TreeListRow listRow) {
        try {
            gtk_tree_expander_set_list_row.invokeExact(handle(), listRow.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
