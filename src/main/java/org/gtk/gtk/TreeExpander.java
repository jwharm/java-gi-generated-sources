package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkTreeExpander} uses the {@link AccessibleRole#GROUP} role. The expander icon
 * is represented as a {@link AccessibleRole#BUTTON}, labelled by the expander's
 * child, and toggling it will change the {@link AccessibleState#EXPANDED} state.
 */
public class TreeExpander extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
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
    
    public TreeExpander(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeExpander */
    public static TreeExpander castFrom(org.gtk.gobject.Object gobject) {
        return new TreeExpander(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_tree_expander_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeExpander}
     */
    public TreeExpander() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget displayed by {@code self}.
     * @return The child displayed by {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * TreeExpander indents the child by the width of an expander-icon if it is not expandable.
     * @return TRUE if the child should be indented when not expandable. Otherwise FALSE.
     */
    public boolean getIndentForIcon() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_expander_get_indent_for_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Forwards the item set on the {@code GtkTreeListRow} that {@code self} is managing.
     * <p>
     * This call is essentially equivalent to calling:
     * <pre>{@code c
     * gtk_tree_list_row_get_item (gtk_tree_expander_get_list_row (@self));
     * }</pre>
     * @return The item of the row
     */
    public @Nullable org.gtk.gobject.Object getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the list row managed by {@code self}.
     * @return The list row displayed by {@code self}
     */
    public @Nullable org.gtk.gtk.TreeListRow getListRow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_expander_get_list_row.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeListRow(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the content widget to display.
     * @param child a {@code GtkWidget}
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNullElse(child, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_expander_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets if the TreeExpander should indent the child by the width of an expander-icon when it is not expandable.
     * @param indentForIcon TRUE if the child should be indented without expander. Otherwise FALSE.
     */
    public void setIndentForIcon(boolean indentForIcon) {
        try {
            DowncallHandles.gtk_tree_expander_set_indent_for_icon.invokeExact(handle(), indentForIcon ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tree list row that this expander should manage.
     * @param listRow a {@code GtkTreeListRow}
     */
    public void setListRow(@Nullable org.gtk.gtk.TreeListRow listRow) {
        java.util.Objects.requireNonNullElse(listRow, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_expander_set_list_row.invokeExact(handle(), listRow.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_expander_new = Interop.downcallHandle(
            "gtk_tree_expander_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_get_child = Interop.downcallHandle(
            "gtk_tree_expander_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_get_indent_for_icon = Interop.downcallHandle(
            "gtk_tree_expander_get_indent_for_icon",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_get_item = Interop.downcallHandle(
            "gtk_tree_expander_get_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_get_list_row = Interop.downcallHandle(
            "gtk_tree_expander_get_list_row",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_set_child = Interop.downcallHandle(
            "gtk_tree_expander_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_expander_set_indent_for_icon = Interop.downcallHandle(
            "gtk_tree_expander_set_indent_for_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_tree_expander_set_list_row = Interop.downcallHandle(
            "gtk_tree_expander_set_list_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
