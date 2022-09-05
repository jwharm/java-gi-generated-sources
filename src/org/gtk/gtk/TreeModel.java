package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The tree interface used by GtkTreeView
 * 
 * The `GtkTreeModel` interface defines a generic tree interface for
 * use by the `GtkTreeView` widget. It is an abstract interface, and
 * is designed to be usable with any appropriate data structure. The
 * programmer just has to implement this interface on their own data
 * type for it to be viewable by a `GtkTreeView` widget.
 * 
 * The model is represented as a hierarchical tree of strongly-typed,
 * columned data. In other words, the model can be seen as a tree where
 * every node has different values depending on which column is being
 * queried. The type of data found in a column is determined by using
 * the GType system (ie. %G_TYPE_INT, %GTK_TYPE_BUTTON, %G_TYPE_POINTER,
 * etc). The types are homogeneous per column across all nodes. It is
 * important to note that this interface only provides a way of examining
 * a model and observing changes. The implementation of each individual
 * model decides how and if changes are made.
 * 
 * In order to make life simpler for programmers who do not need to
 * write their own specialized model, two generic models are provided
 * — the `GtkTreeStore` and the `GtkListStore`. To use these, the
 * developer simply pushes data into these models as necessary. These
 * models provide the data structure as well as all appropriate tree
 * interfaces. As a result, implementing drag and drop, sorting, and
 * storing data is trivial. For the vast majority of trees and lists,
 * these two models are sufficient.
 * 
 * Models are accessed on a node/column level of granularity. One can
 * query for the value of a model at a certain node and a certain
 * column on that node. There are two structures used to reference a
 * particular node in a model. They are the [struct@Gtk.TreePath] and
 * the [struct@Gtk.TreeIter] (“iter” is short for iterator). Most of the
 * interface consists of operations on a [struct@Gtk.TreeIter].
 * 
 * A path is essentially a potential node. It is a location on a model
 * that may or may not actually correspond to a node on a specific
 * model. A [struct@Gtk.TreePath] can be converted into either an
 * array of unsigned integers or a string. The string form is a list
 * of numbers separated by a colon. Each number refers to the offset
 * at that level. Thus, the path `0` refers to the root
 * node and the path `2:4` refers to the fifth child of
 * the third node.
 * 
 * By contrast, a [struct@Gtk.TreeIter] is a reference to a specific node on
 * a specific model. It is a generic struct with an integer and three
 * generic pointers. These are filled in by the model in a model-specific
 * way. One can convert a path to an iterator by calling
 * gtk_tree_model_get_iter(). These iterators are the primary way
 * of accessing a model and are similar to the iterators used by
 * `GtkTextBuffer`. They are generally statically allocated on the
 * stack and only used for a short time. The model interface defines
 * a set of operations using them for navigating the model.
 * 
 * It is expected that models fill in the iterator with private data.
 * For example, the `GtkListStore` model, which is internally a simple
 * linked list, stores a list node in one of the pointers. The
 * `GtkTreeModel`Sort stores an array and an offset in two of the
 * pointers. Additionally, there is an integer field. This field is
 * generally filled with a unique stamp per model. This stamp is for
 * catching errors resulting from using invalid iterators with a model.
 * 
 * The lifecycle of an iterator can be a little confusing at first.
 * Iterators are expected to always be valid for as long as the model
 * is unchanged (and doesn’t emit a signal). The model is considered
 * to own all outstanding iterators and nothing needs to be done to
 * free them from the user’s point of view. Additionally, some models
 * guarantee that an iterator is valid for as long as the node it refers
 * to is valid (most notably the `GtkTreeStore` and `GtkListStore`).
 * Although generally uninteresting, as one always has to allow for
 * the case where iterators do not persist beyond a signal, some very
 * important performance enhancements were made in the sort model.
 * As a result, the %GTK_TREE_MODEL_ITERS_PERSIST flag was added to
 * indicate this behavior.
 * 
 * To help show some common operation of a model, some examples are
 * provided. The first example shows three ways of getting the iter at
 * the location `3:2:5`. While the first method shown is
 * easier, the second is much more common, as you often get paths from
 * callbacks.
 * 
 * ## Acquiring a `GtkTreeIter`
 * 
 * ```c
 * // Three ways of getting the iter pointing to the location
 * GtkTreePath *path;
 * GtkTreeIter iter;
 * GtkTreeIter parent_iter;
 * 
 * // get the iterator from a string
 * gtk_tree_model_get_iter_from_string (model,
 *                                      &iter,
 *                                      "3:2:5");
 * 
 * // get the iterator from a path
 * path = gtk_tree_path_new_from_string ("3:2:5");
 * gtk_tree_model_get_iter (model, &iter, path);
 * gtk_tree_path_free (path);
 * 
 * // walk the tree to find the iterator
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                NULL, 3);
 * parent_iter = iter;
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                &parent_iter, 2);
 * parent_iter = iter;
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                &parent_iter, 5);
 * ```
 * 
 * This second example shows a quick way of iterating through a list
 * and getting a string and an integer from each row. The
 * populate_model() function used below is not
 * shown, as it is specific to the `GtkListStore`. For information on
 * how to write such a function, see the `GtkListStore` documentation.
 * 
 * ## Reading data from a `GtkTreeModel`
 * 
 * ```c
 * enum
 * {
 *   STRING_COLUMN,
 *   INT_COLUMN,
 *   N_COLUMNS
 * };
 * 
 * ...
 * 
 * GtkTreeModel *list_store;
 * GtkTreeIter iter;
 * gboolean valid;
 * int row_count = 0;
 * 
 * // make a new list_store
 * list_store = gtk_list_store_new (N_COLUMNS,
 *                                  G_TYPE_STRING,
 *                                  G_TYPE_INT);
 * 
 * // Fill the list store with data
 * populate_model (list_store);
 * 
 * // Get the first iter in the list, check it is valid and walk
 * // through the list, reading each row.
 * 
 * valid = gtk_tree_model_get_iter_first (list_store,
 *                                        &iter);
 * while (valid)
 *  {
 *    char *str_data;
 *    int    int_data;
 * 
 *    // Make sure you terminate calls to gtk_tree_model_get() with a “-1” value
 *    gtk_tree_model_get (list_store, &iter,
 *                        STRING_COLUMN, &str_data,
 *                        INT_COLUMN, &int_data,
 *                        -1);
 * 
 *    // Do something with the data
 *    g_print ("Row %d: (%s,%d)\\n",
 *             row_count, str_data, int_data);
 *    g_free (str_data);
 * 
 *    valid = gtk_tree_model_iter_next (list_store,
 *                                      &iter);
 *    row_count++;
 *  }
 * ```
 * 
 * The `GtkTreeModel` interface contains two methods for reference
 * counting: gtk_tree_model_ref_node() and gtk_tree_model_unref_node().
 * These two methods are optional to implement. The reference counting
 * is meant as a way for views to let models know when nodes are being
 * displayed. `GtkTreeView` will take a reference on a node when it is
 * visible, which means the node is either in the toplevel or expanded.
 * Being displayed does not mean that the node is currently directly
 * visible to the user in the viewport. Based on this reference counting
 * scheme a caching model, for example, can decide whether or not to cache
 * a node based on the reference count. A file-system based model would
 * not want to keep the entire file hierarchy in memory, but just the
 * folders that are currently expanded in every current view.
 * 
 * When working with reference counting, the following rules must be taken
 * into account:
 * 
 * - Never take a reference on a node without owning a reference on its parent.
 *   This means that all parent nodes of a referenced node must be referenced
 *   as well.
 * 
 * - Outstanding references on a deleted node are not released. This is not
 *   possible because the node has already been deleted by the time the
 *   row-deleted signal is received.
 * 
 * - Models are not obligated to emit a signal on rows of which none of its
 *   siblings are referenced. To phrase this differently, signals are only
 *   required for levels in which nodes are referenced. For the root level
 *   however, signals must be emitted at all times (however the root level
 *   is always referenced when any view is attached).
 */
public interface TreeModel extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Creates a new `GtkTreeModel`, with @child_model as the child_model
     * and @root as the virtual root.
     */
    public default TreeModel filterNew(TreePath root) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_filter_new(HANDLE(), root.HANDLE());
        return new TreeModel.TreeModelImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns the type of the column.
     */
    public default org.gtk.gobject.Type getColumnType(int index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_column_type(HANDLE(), index);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns a set of flags supported by this interface.
     * 
     * The flags are a bitwise combination of `GtkTreeModel`Flags.
     * The flags supported should not change during the lifetime
     * of the @tree_model.
     */
    public default int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets @iter to a valid iterator pointing to @path.
     * 
     * If @path does not exist, @iter is set to an invalid
     * iterator and %FALSE is returned.
     */
    public default boolean getIter(TreeIter iter, TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_iter(HANDLE(), iter.HANDLE(), path.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Initializes @iter with the first iterator in the tree
     * (the one at the path "0").
     * 
     * Returns %FALSE if the tree is empty, %TRUE otherwise.
     */
    public default boolean getIterFirst(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_iter_first(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @iter to a valid iterator pointing to @path_string, if it
     * exists.
     * 
     * Otherwise, @iter is left invalid and %FALSE is returned.
     */
    public default boolean getIterFromString(TreeIter iter, java.lang.String pathString) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_iter_from_string(HANDLE(), iter.HANDLE(), Interop.getAllocator().allocateUtf8String(pathString));
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of columns supported by @tree_model.
     */
    public default int getNColumns() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_n_columns(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns a newly-created `GtkTreePath` referenced by @iter.
     * 
     * This path should be freed with gtk_tree_path_free().
     */
    public default TreePath getPath(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_path(HANDLE(), iter.HANDLE());
        return new TreePath(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Generates a string representation of the iter.
     * 
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string.
     */
    public default java.lang.String getStringFromIter(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_string_from_iter(HANDLE(), iter.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of one or more cells in the row referenced by @iter.
     * 
     * See [method@Gtk.TreeModel.get], this version takes a va_list
     * for language bindings to use.
     */
    public default void getValist(TreeIter iter, VaList varArgs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_valist(HANDLE(), iter.HANDLE(), varArgs);
    }
    
    /**
     * Initializes and sets @value to that at @column.
     * 
     * When done with @value, g_value_unset() needs to be called
     * to free any allocated memory.
     */
    public default void getValue(TreeIter iter, int column, org.gtk.gobject.Value value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_get_value(HANDLE(), iter.HANDLE(), column, value.HANDLE());
    }
    
    /**
     * Sets @iter to point to the first child of @parent.
     * 
     * If @parent has no children, %FALSE is returned and @iter is
     * set to be invalid. @parent will remain a valid node after this
     * function has been called.
     * 
     * If @parent is %NULL returns the first node, equivalent to
     * `gtk_tree_model_get_iter_first (tree_model, iter);`
     */
    public default boolean iterChildren(TreeIter iter, TreeIter parent) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_children(HANDLE(), iter.HANDLE(), parent.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @iter has children, %FALSE otherwise.
     */
    public default boolean iterHasChild(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_has_child(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of children that @iter has.
     * 
     * As a special case, if @iter is %NULL, then the number
     * of toplevel nodes is returned.
     */
    public default int iterNChildren(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_n_children(HANDLE(), iter.HANDLE());
        return RESULT;
    }
    
    /**
     * Sets @iter to point to the node following it at the current level.
     * 
     * If there is no next @iter, %FALSE is returned and @iter is set
     * to be invalid.
     */
    public default boolean iterNext(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_next(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @iter to be the child of @parent, using the given index.
     * 
     * The first index is 0. If @n is too big, or @parent has no children,
     * @iter is set to an invalid iterator and %FALSE is returned. @parent
     * will remain a valid node after this function has been called. As a
     * special case, if @parent is %NULL, then the @n-th root node
     * is set.
     */
    public default boolean iterNthChild(TreeIter iter, TreeIter parent, int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_nth_child(HANDLE(), iter.HANDLE(), parent.HANDLE(), n);
        return (RESULT != 0);
    }
    
    /**
     * Sets @iter to be the parent of @child.
     * 
     * If @child is at the toplevel, and doesn’t have a parent, then
     * @iter is set to an invalid iterator and %FALSE is returned.
     * @child will remain a valid node after this function has been
     * called.
     * 
     * @iter will be initialized before the lookup is performed, so @child
     * and @iter cannot point to the same memory location.
     */
    public default boolean iterParent(TreeIter iter, TreeIter child) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_parent(HANDLE(), iter.HANDLE(), child.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @iter to point to the previous node at the current level.
     * 
     * If there is no previous @iter, %FALSE is returned and @iter is
     * set to be invalid.
     */
    public default boolean iterPrevious(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_iter_previous(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Lets the tree ref the node.
     * 
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons.
     * 
     * This function is primarily meant as a way for views to let
     * caching models know when nodes are being displayed (and hence,
     * whether or not to cache that node). Being displayed means a node
     * is in an expanded branch, regardless of whether the node is currently
     * visible in the viewport. For example, a file-system based model
     * would not want to keep the entire file-hierarchy in memory,
     * just the sections that are currently being displayed by
     * every current view.
     * 
     * A model should be expected to be able to get an iter independent
     * of its reffed state.
     */
    public default void refNode(TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_ref_node(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Emits the ::row-changed signal on @tree_model.
     * 
     * See [signal@Gtk.TreeModel::row-changed].
     */
    public default void rowChanged(TreePath path, TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_row_changed(HANDLE(), path.HANDLE(), iter.HANDLE());
    }
    
    /**
     * Emits the ::row-deleted signal on @tree_model.
     * 
     * See [signal@Gtk.TreeModel::row-deleted].
     * 
     * This should be called by models after a row has been removed.
     * The location pointed to by @path should be the location that
     * the row previously was at. It may not be a valid location anymore.
     * 
     * Nodes that are deleted are not unreffed, this means that any
     * outstanding references on the deleted node should not be released.
     */
    public default void rowDeleted(TreePath path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_row_deleted(HANDLE(), path.HANDLE());
    }
    
    /**
     * Emits the ::row-has-child-toggled signal on @tree_model.
     * 
     * See [signal@Gtk.TreeModel::row-has-child-toggled].
     * 
     * This should be called by models after the child
     * state of a node changes.
     */
    public default void rowHasChildToggled(TreePath path, TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_row_has_child_toggled(HANDLE(), path.HANDLE(), iter.HANDLE());
    }
    
    /**
     * Emits the ::row-inserted signal on @tree_model.
     * 
     * See [signal@Gtk.TreeModel::row-inserted].
     */
    public default void rowInserted(TreePath path, TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_row_inserted(HANDLE(), path.HANDLE(), iter.HANDLE());
    }
    
    /**
     * Emits the ::rows-reordered signal on @tree_model.
     * 
     * See [signal@Gtk.TreeModel::rows-reordered].
     * 
     * This should be called by models when their rows have been
     * reordered.
     */
    public default void rowsReorderedWithLength(TreePath path, TreeIter iter, int[] newOrder, int length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_rows_reordered_with_length(HANDLE(), path.HANDLE(), iter.HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder), length);
    }
    
    /**
     * Lets the tree unref the node.
     * 
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons. For more information on what
     * this means, see gtk_tree_model_ref_node().
     * 
     * Please note that nodes that are deleted are not unreffed.
     */
    public default void unrefNode(TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_model_unref_node(HANDLE(), iter.HANDLE());
    }
    
    @FunctionalInterface
    public interface RowChangedHandler {
        void signalReceived(TreeModel source, TreePath path, TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row in the model has changed.
     */
    public default void onRowChanged(RowChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeModelRowChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("row-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowDeletedHandler {
        void signalReceived(TreeModel source, TreePath path);
    }
    
    /**
     * This signal is emitted when a row has been deleted.
     * 
     * Note that no iterator is passed to the signal handler,
     * since the row is already deleted.
     * 
     * This should be called by models after a row has been removed.
     * The location pointed to by @path should be the location that
     * the row previously was at. It may not be a valid location anymore.
     */
    public default void onRowDeleted(RowDeletedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeModelRowDeleted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("row-deleted"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowHasChildToggledHandler {
        void signalReceived(TreeModel source, TreePath path, TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row has gotten the first child
     * row or lost its last child row.
     */
    public default void onRowHasChildToggled(RowHasChildToggledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeModelRowHasChildToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("row-has-child-toggled"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowInsertedHandler {
        void signalReceived(TreeModel source, TreePath path, TreeIter iter);
    }
    
    /**
     * This signal is emitted when a new row has been inserted in
     * the model.
     * 
     * Note that the row may still be empty at this point, since
     * it is a common pattern to first insert an empty row, and
     * then fill it with the desired values.
     */
    public default void onRowInserted(RowInsertedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeModelRowInserted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("row-inserted"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowsReorderedHandler {
        void signalReceived(TreeModel source, TreePath path, TreeIter iter, jdk.incubator.foreign.MemoryAddress newOrder);
    }
    
    /**
     * This signal is emitted when the children of a node in the
     * `GtkTreeModel` have been reordered.
     * 
     * Note that this signal is not emitted
     * when rows are reordered by DND, since this is implemented
     * by removing and then reinserting the row.
     */
    public default void onRowsReordered(RowsReorderedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeModelRowsReordered", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("rows-reordered"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class TreeModelImpl extends org.gtk.gobject.Object implements TreeModel {
        public TreeModelImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}