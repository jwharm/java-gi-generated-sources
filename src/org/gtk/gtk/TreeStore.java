package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A tree-like data structure that can be used with the GtkTreeView
 * <p>
 * The {@code GtkTreeStore} object is a list model for use with a {@code GtkTreeView}
 * widget.  It implements the {@code GtkTreeModel} interface, and consequently,
 * can use all of the methods available there.  It also implements the
 * {@code GtkTreeSortable} interface so it can be sorted by the view.  Finally,
 * it also implements the tree
 * [drag and drop][gtk3-GtkTreeView-drag-and-drop]
 * interfaces.
 * <p>
 * <h1>GtkTreeStore as GtkBuildable</h1>
 * <p>
 * The GtkTreeStore implementation of the {@code GtkBuildable} interface allows
 * to specify the model columns with a &lt;columns&gt; element that may contain
 * multiple &lt;column&gt; elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 * <p>
 * An example of a UI Definition fragment for a tree store:
 * |[
 * &lt;object class="GtkTreeStore"&gt;
 *   &lt;columns&gt;
 *     &lt;column type="gchararray"/&gt;
 *     &lt;column type="gchararray"/&gt;
 *     &lt;column type="gint"/&gt;
 *   &lt;/columns&gt;
 * &lt;/object&gt;
 * ]|
 */
public class TreeStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public TreeStore(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeStore */
    public static TreeStore castFrom(org.gtk.gobject.Object gobject) {
        return new TreeStore(gobject.getReference());
    }
    
    private static Reference constructNewv(int nColumns, org.gtk.gobject.Type[] types) {
        Reference RESULT = References.get(gtk_h.gtk_tree_store_newv(nColumns, Interop.allocateNativeArray(types).handle()), true);
        return RESULT;
    }
    
    /**
     * Non vararg creation function.  Used primarily by language bindings.
     */
    public static TreeStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new TreeStore(constructNewv(nColumns, types));
    }
    
    /**
     * Appends a new row to {@code tree_store}.  If {@code parent} is non-<code>null</code>, then it will append the
     * new row after the last child of {@code parent}, otherwise it will append a row to
     * the top level.  {@code iter} will be changed to point to this new row.  The row will
     * be empty after this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void append(TreeIter iter, TreeIter parent) {
        gtk_h.gtk_tree_store_append(handle(), iter.handle(), parent.handle());
    }
    
    /**
     * Removes all rows from {@code tree_store}
     */
    public void clear() {
        gtk_h.gtk_tree_store_clear(handle());
    }
    
    /**
     * Creates a new row at {@code position}.  If parent is non-<code>null</code>, then the row will be
     * made a child of {@code parent}.  Otherwise, the row will be created at the toplevel.
     * If {@code position} is -1 or is larger than the number of rows at that level, then
     * the new row will be inserted to the end of the list.  {@code iter} will be changed
     * to point to this new row.  The row will be empty after this function is
     * called.  To fill in values, you need to call gtk_tree_store_set() or
     * gtk_tree_store_set_value().
     */
    public void insert(TreeIter iter, TreeIter parent, int position) {
        gtk_h.gtk_tree_store_insert(handle(), iter.handle(), parent.handle(), position);
    }
    
    /**
     * Inserts a new row after {@code sibling}.  If {@code sibling} is <code>null</code>, then the row will be
     * prepended to {@code parent} ’s children.  If {@code parent} and {@code sibling} are <code>null</code>, then
     * the row will be prepended to the toplevel.  If both {@code sibling} and {@code parent} are
     * set, then {@code parent} must be the parent of {@code sibling}.  When {@code sibling} is set,
     * {@code parent} is optional.
     * <p>
     * {@code iter} will be changed to point to this new row.  The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void insertAfter(TreeIter iter, TreeIter parent, TreeIter sibling) {
        gtk_h.gtk_tree_store_insert_after(handle(), iter.handle(), parent.handle(), sibling.handle());
    }
    
    /**
     * Inserts a new row before {@code sibling}.  If {@code sibling} is <code>null</code>, then the row will
     * be appended to {@code parent} ’s children.  If {@code parent} and {@code sibling} are <code>null</code>, then
     * the row will be appended to the toplevel.  If both {@code sibling} and {@code parent} are
     * set, then {@code parent} must be the parent of {@code sibling}.  When {@code sibling} is set,
     * {@code parent} is optional.
     * <p>
     * {@code iter} will be changed to point to this new row.  The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void insertBefore(TreeIter iter, TreeIter parent, TreeIter sibling) {
        gtk_h.gtk_tree_store_insert_before(handle(), iter.handle(), parent.handle(), sibling.handle());
    }
    
    /**
     * A variant of gtk_tree_store_insert_with_values() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings.
     */
    public void insertWithValuesv(TreeIter iter, TreeIter parent, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        gtk_h.gtk_tree_store_insert_with_valuesv(handle(), iter.handle(), parent.handle(), position, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns)).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Returns <code>true</code> if {@code iter} is an ancestor of {@code descendant}.  That is, {@code iter} is the
     * parent (or grandparent or great-grandparent) of {@code descendant}.
     */
    public boolean isAncestor(TreeIter iter, TreeIter descendant) {
        var RESULT = gtk_h.gtk_tree_store_is_ancestor(handle(), iter.handle(), descendant.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the depth of {@code iter}.  This will be 0 for anything on the root level, 1
     * for anything down a level, etc.
     */
    public int iterDepth(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_iter_depth(handle(), iter.handle());
        return RESULT;
    }
    
    /**
     * Checks if the given iter is a valid iter for this {@code GtkTreeStore}.
     * <p>
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_iter_is_valid(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position after {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is <code>null</code>, {@code iter} will be moved
     * to the start of the level.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        gtk_h.gtk_tree_store_move_after(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position before {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is <code>null</code>, {@code iter} will be
     * moved to the end of the level.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        gtk_h.gtk_tree_store_move_before(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Prepends a new row to {@code tree_store}.  If {@code parent} is non-<code>null</code>, then it will prepend
     * the new row before the first child of {@code parent}, otherwise it will prepend a row
     * to the top level.  {@code iter} will be changed to point to this new row.  The row
     * will be empty after this function is called.  To fill in values, you need to
     * call gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void prepend(TreeIter iter, TreeIter parent) {
        gtk_h.gtk_tree_store_prepend(handle(), iter.handle(), parent.handle());
    }
    
    /**
     * Removes {@code iter} from {@code tree_store}.  After being removed, {@code iter} is set to the
     * next valid row at that level, or invalidated if it previously pointed to the
     * last one.
     */
    public boolean remove(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_remove(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Reorders the children of {@code parent} in {@code tree_store} to follow the order
     * indicated by {@code new_order}. Note that this function only works with
     * unsorted stores.
     */
    public void reorder(TreeIter parent, int[] newOrder) {
        gtk_h.gtk_tree_store_reorder(handle(), parent.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder)).handle());
    }
    
    /**
     * This function is meant primarily for {@code GObjects} that inherit from
     * {@code GtkTreeStore}, and should only be used when constructing a new
     * {@code GtkTreeStore}.  It will not function after a row has been added,
     * or a method on the {@code GtkTreeModel} interface is called.
     */
    public void setColumnTypes(int nColumns, org.gtk.gobject.Type[] types) {
        gtk_h.gtk_tree_store_set_column_types(handle(), nColumns, Interop.allocateNativeArray(types).handle());
    }
    
    /**
     * See gtk_tree_store_set(); this version takes a va_list for
     * use by language bindings.
     */
    public void setValist(TreeIter iter, VaList varArgs) {
        gtk_h.gtk_tree_store_set_valist(handle(), iter.handle(), varArgs);
    }
    
    /**
     * Sets the data in the cell specified by {@code iter} and {@code column}.
     * The type of {@code value} must be convertible to the type of the
     * column.
     */
    public void setValue(TreeIter iter, int column, org.gtk.gobject.Value value) {
        gtk_h.gtk_tree_store_set_value(handle(), iter.handle(), column, value.handle());
    }
    
    /**
     * A variant of gtk_tree_store_set_valist() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings or in case
     * the number of columns to change is not known until run-time.
     */
    public void setValuesv(TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        gtk_h.gtk_tree_store_set_valuesv(handle(), iter.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns)).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Swaps @a and @b in the same level of {@code tree_store}. Note that this function
     * only works with unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        gtk_h.gtk_tree_store_swap(handle(), a.handle(), b.handle());
    }
    
}
