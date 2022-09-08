package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A tree-like data structure that can be used with the GtkTreeView
 * 
 * The `GtkTreeStore` object is a list model for use with a `GtkTreeView`
 * widget.  It implements the `GtkTreeModel` interface, and consequently,
 * can use all of the methods available there.  It also implements the
 * `GtkTreeSortable` interface so it can be sorted by the view.  Finally,
 * it also implements the tree
 * [drag and drop][gtk3-GtkTreeView-drag-and-drop]
 * interfaces.
 * 
 * # GtkTreeStore as GtkBuildable
 * 
 * The GtkTreeStore implementation of the `GtkBuildable` interface allows
 * to specify the model columns with a <columns> element that may contain
 * multiple <column> elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 * 
 * An example of a UI Definition fragment for a tree store:
 * |[
 * <object class="GtkTreeStore">
 *   <columns>
 *     <column type="gchararray"/>
 *     <column type="gchararray"/>
 *     <column type="gint"/>
 *   </columns>
 * </object>
 * ]|
 */
public class TreeStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public TreeStore(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeStore */
    public static TreeStore castFrom(org.gtk.gobject.Object gobject) {
        return new TreeStore(gobject.getReference());
    }
    
    /**
     * Non vararg creation function.  Used primarily by language bindings.
     */
    public static TreeStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new TreeStore(References.get(gtk_h.gtk_tree_store_newv(nColumns, Interop.allocateNativeArray(types).handle()), true));
    }
    
    /**
     * Appends a new row to @tree_store.  If @parent is non-%NULL, then it will append the
     * new row after the last child of @parent, otherwise it will append a row to
     * the top level.  @iter will be changed to point to this new row.  The row will
     * be empty after this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void append(TreeIter iter, TreeIter parent) {
        gtk_h.gtk_tree_store_append(handle(), iter.handle(), parent.handle());
    }
    
    /**
     * Removes all rows from @tree_store
     */
    public void clear() {
        gtk_h.gtk_tree_store_clear(handle());
    }
    
    /**
     * Creates a new row at @position.  If parent is non-%NULL, then the row will be
     * made a child of @parent.  Otherwise, the row will be created at the toplevel.
     * If @position is -1 or is larger than the number of rows at that level, then
     * the new row will be inserted to the end of the list.  @iter will be changed
     * to point to this new row.  The row will be empty after this function is
     * called.  To fill in values, you need to call gtk_tree_store_set() or
     * gtk_tree_store_set_value().
     */
    public void insert(TreeIter iter, TreeIter parent, int position) {
        gtk_h.gtk_tree_store_insert(handle(), iter.handle(), parent.handle(), position);
    }
    
    /**
     * Inserts a new row after @sibling.  If @sibling is %NULL, then the row will be
     * prepended to @parent ’s children.  If @parent and @sibling are %NULL, then
     * the row will be prepended to the toplevel.  If both @sibling and @parent are
     * set, then @parent must be the parent of @sibling.  When @sibling is set,
     * @parent is optional.
     * 
     * @iter will be changed to point to this new row.  The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void insertAfter(TreeIter iter, TreeIter parent, TreeIter sibling) {
        gtk_h.gtk_tree_store_insert_after(handle(), iter.handle(), parent.handle(), sibling.handle());
    }
    
    /**
     * Inserts a new row before @sibling.  If @sibling is %NULL, then the row will
     * be appended to @parent ’s children.  If @parent and @sibling are %NULL, then
     * the row will be appended to the toplevel.  If both @sibling and @parent are
     * set, then @parent must be the parent of @sibling.  When @sibling is set,
     * @parent is optional.
     * 
     * @iter will be changed to point to this new row.  The row will be empty after
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
     * Returns %TRUE if @iter is an ancestor of @descendant.  That is, @iter is the
     * parent (or grandparent or great-grandparent) of @descendant.
     */
    public boolean isAncestor(TreeIter iter, TreeIter descendant) {
        var RESULT = gtk_h.gtk_tree_store_is_ancestor(handle(), iter.handle(), descendant.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the depth of @iter.  This will be 0 for anything on the root level, 1
     * for anything down a level, etc.
     */
    public int iterDepth(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_iter_depth(handle(), iter.handle());
        return RESULT;
    }
    
    /**
     * Checks if the given iter is a valid iter for this `GtkTreeStore`.
     * 
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_iter_is_valid(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter in @tree_store to the position after @position. @iter and
     * @position should be in the same level. Note that this function only
     * works with unsorted stores. If @position is %NULL, @iter will be moved
     * to the start of the level.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        gtk_h.gtk_tree_store_move_after(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Moves @iter in @tree_store to the position before @position. @iter and
     * @position should be in the same level. Note that this function only
     * works with unsorted stores. If @position is %NULL, @iter will be
     * moved to the end of the level.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        gtk_h.gtk_tree_store_move_before(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Prepends a new row to @tree_store.  If @parent is non-%NULL, then it will prepend
     * the new row before the first child of @parent, otherwise it will prepend a row
     * to the top level.  @iter will be changed to point to this new row.  The row
     * will be empty after this function is called.  To fill in values, you need to
     * call gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void prepend(TreeIter iter, TreeIter parent) {
        gtk_h.gtk_tree_store_prepend(handle(), iter.handle(), parent.handle());
    }
    
    /**
     * Removes @iter from @tree_store.  After being removed, @iter is set to the
     * next valid row at that level, or invalidated if it previously pointed to the
     * last one.
     */
    public boolean remove(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_store_remove(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Reorders the children of @parent in @tree_store to follow the order
     * indicated by @new_order. Note that this function only works with
     * unsorted stores.
     */
    public void reorder(TreeIter parent, int[] newOrder) {
        gtk_h.gtk_tree_store_reorder(handle(), parent.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder)).handle());
    }
    
    /**
     * This function is meant primarily for `GObjects` that inherit from
     * `GtkTreeStore`, and should only be used when constructing a new
     * `GtkTreeStore`.  It will not function after a row has been added,
     * or a method on the `GtkTreeModel` interface is called.
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
     * Sets the data in the cell specified by @iter and @column.
     * The type of @value must be convertible to the type of the
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
     * Swaps @a and @b in the same level of @tree_store. Note that this function
     * only works with unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        gtk_h.gtk_tree_store_swap(handle(), a.handle(), b.handle());
    }
    
}
