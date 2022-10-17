package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The tree interface used by GtkTreeView
 * <p>
 * The {@code GtkTreeModel} interface defines a generic tree interface for
 * use by the {@code GtkTreeView} widget. It is an abstract interface, and
 * is designed to be usable with any appropriate data structure. The
 * programmer just has to implement this interface on their own data
 * type for it to be viewable by a {@code GtkTreeView} widget.
 * <p>
 * The model is represented as a hierarchical tree of strongly-typed,
 * columned data. In other words, the model can be seen as a tree where
 * every node has different values depending on which column is being
 * queried. The type of data found in a column is determined by using
 * the GType system (ie. {@code G_TYPE_INT}, {@code GTK_TYPE_BUTTON}, {@code G_TYPE_POINTER},
 * etc). The types are homogeneous per column across all nodes. It is
 * important to note that this interface only provides a way of examining
 * a model and observing changes. The implementation of each individual
 * model decides how and if changes are made.
 * <p>
 * In order to make life simpler for programmers who do not need to
 * write their own specialized model, two generic models are provided
 * — the {@code GtkTreeStore} and the {@code GtkListStore}. To use these, the
 * developer simply pushes data into these models as necessary. These
 * models provide the data structure as well as all appropriate tree
 * interfaces. As a result, implementing drag and drop, sorting, and
 * storing data is trivial. For the vast majority of trees and lists,
 * these two models are sufficient.
 * <p>
 * Models are accessed on a node/column level of granularity. One can
 * query for the value of a model at a certain node and a certain
 * column on that node. There are two structures used to reference a
 * particular node in a model. They are the {@code Gtk.TreePath} and
 * the {@code Gtk.TreeIter} (“iter” is short for iterator). Most of the
 * interface consists of operations on a {@code Gtk.TreeIter}.
 * <p>
 * A path is essentially a potential node. It is a location on a model
 * that may or may not actually correspond to a node on a specific
 * model. A {@code Gtk.TreePath} can be converted into either an
 * array of unsigned integers or a string. The string form is a list
 * of numbers separated by a colon. Each number refers to the offset
 * at that level. Thus, the path {@code 0} refers to the root
 * node and the path {@code 2:4} refers to the fifth child of
 * the third node.
 * <p>
 * By contrast, a {@code Gtk.TreeIter} is a reference to a specific node on
 * a specific model. It is a generic struct with an integer and three
 * generic pointers. These are filled in by the model in a model-specific
 * way. One can convert a path to an iterator by calling
 * gtk_tree_model_get_iter(). These iterators are the primary way
 * of accessing a model and are similar to the iterators used by
 * {@code GtkTextBuffer}. They are generally statically allocated on the
 * stack and only used for a short time. The model interface defines
 * a set of operations using them for navigating the model.
 * <p>
 * It is expected that models fill in the iterator with private data.
 * For example, the {@code GtkListStore} model, which is internally a simple
 * linked list, stores a list node in one of the pointers. The
 * {@code GtkTreeModel}Sort stores an array and an offset in two of the
 * pointers. Additionally, there is an integer field. This field is
 * generally filled with a unique stamp per model. This stamp is for
 * catching errors resulting from using invalid iterators with a model.
 * <p>
 * The lifecycle of an iterator can be a little confusing at first.
 * Iterators are expected to always be valid for as long as the model
 * is unchanged (and doesn’t emit a signal). The model is considered
 * to own all outstanding iterators and nothing needs to be done to
 * free them from the user’s point of view. Additionally, some models
 * guarantee that an iterator is valid for as long as the node it refers
 * to is valid (most notably the {@code GtkTreeStore} and {@code GtkListStore}).
 * Although generally uninteresting, as one always has to allow for
 * the case where iterators do not persist beyond a signal, some very
 * important performance enhancements were made in the sort model.
 * As a result, the {@link TreeModelFlags#ITERS_PERSIST} flag was added to
 * indicate this behavior.
 * <p>
 * To help show some common operation of a model, some examples are
 * provided. The first example shows three ways of getting the iter at
 * the location {@code 3:2:5}. While the first method shown is
 * easier, the second is much more common, as you often get paths from
 * callbacks.
 * 
 * <h2>Acquiring a `GtkTreeIter`</h2>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * This second example shows a quick way of iterating through a list
 * and getting a string and an integer from each row. The
 * populate_model() function used below is not
 * shown, as it is specific to the {@code GtkListStore}. For information on
 * how to write such a function, see the {@code GtkListStore} documentation.
 * 
 * <h2>Reading data from a `GtkTreeModel`</h2>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * The {@code GtkTreeModel} interface contains two methods for reference
 * counting: gtk_tree_model_ref_node() and gtk_tree_model_unref_node().
 * These two methods are optional to implement. The reference counting
 * is meant as a way for views to let models know when nodes are being
 * displayed. {@code GtkTreeView} will take a reference on a node when it is
 * visible, which means the node is either in the toplevel or expanded.
 * Being displayed does not mean that the node is currently directly
 * visible to the user in the viewport. Based on this reference counting
 * scheme a caching model, for example, can decide whether or not to cache
 * a node based on the reference count. A file-system based model would
 * not want to keep the entire file hierarchy in memory, but just the
 * folders that are currently expanded in every current view.
 * <p>
 * When working with reference counting, the following rules must be taken
 * into account:
 * <ul>
 * <li>Never take a reference on a node without owning a reference on its parent.
 *   This means that all parent nodes of a referenced node must be referenced
 *   as well.
 * <li>Outstanding references on a deleted node are not released. This is not
 *   possible because the node has already been deleted by the time the
 *   row-deleted signal is received.
 * <li>Models are not obligated to emit a signal on rows of which none of its
 *   siblings are referenced. To phrase this differently, signals are only
 *   required for levels in which nodes are referenced. For the root level
 *   however, signals must be emitted at all times (however the root level
 *   is always referenced when any view is attached).
 */
public interface TreeModel extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_tree_model_filter_new = Interop.downcallHandle(
        "gtk_tree_model_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GtkTreeModel}, with {@code child_model} as the child_model
     * and {@code root} as the virtual root.
     */
    default @NotNull TreeModel filterNew(@Nullable TreePath root) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_model_filter_new.invokeExact(handle(), root.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_foreach = Interop.downcallHandle(
        "gtk_tree_model_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} on each node in model in a depth-first fashion.
     * <p>
     * If {@code func} returns {@code true}, then the tree ceases to be walked,
     * and gtk_tree_model_foreach() returns.
     */
    default @NotNull void foreach(@NotNull TreeModelForeachFunc func) {
        try {
            gtk_tree_model_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeModelForeachFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_column_type = Interop.downcallHandle(
        "gtk_tree_model_get_column_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the type of the column.
     */
    default @NotNull org.gtk.gobject.Type getColumnType(@NotNull int index) {
        long RESULT;
        try {
            RESULT = (long) gtk_tree_model_get_column_type.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_flags = Interop.downcallHandle(
        "gtk_tree_model_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a set of flags supported by this interface.
     * <p>
     * The flags are a bitwise combination of {@code GtkTreeModel}Flags.
     * The flags supported should not change during the lifetime
     * of the {@code tree_model}.
     */
    default @NotNull TreeModelFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeModelFlags(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_iter = Interop.downcallHandle(
        "gtk_tree_model_get_iter",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to a valid iterator pointing to {@code path}.
     * <p>
     * If {@code path} does not exist, {@code iter} is set to an invalid
     * iterator and {@code false} is returned.
     */
    default boolean getIter(@NotNull Out<TreeIter> iter, @NotNull TreePath path) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_get_iter.invokeExact(handle(), (Addressable) iterPOINTER.address(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_iter_first = Interop.downcallHandle(
        "gtk_tree_model_get_iter_first",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code iter} with the first iterator in the tree
     * (the one at the path "0").
     * <p>
     * Returns {@code false} if the tree is empty, {@code true} otherwise.
     */
    default boolean getIterFirst(@NotNull Out<TreeIter> iter) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_get_iter_first.invokeExact(handle(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_iter_from_string = Interop.downcallHandle(
        "gtk_tree_model_get_iter_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to a valid iterator pointing to {@code path_string}, if it
     * exists.
     * <p>
     * Otherwise, {@code iter} is left invalid and {@code false} is returned.
     */
    default boolean getIterFromString(@NotNull Out<TreeIter> iter, @NotNull java.lang.String pathString) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_get_iter_from_string.invokeExact(handle(), (Addressable) iterPOINTER.address(), Interop.allocateNativeString(pathString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_n_columns = Interop.downcallHandle(
        "gtk_tree_model_get_n_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of columns supported by {@code tree_model}.
     */
    default int getNColumns() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_get_n_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_path = Interop.downcallHandle(
        "gtk_tree_model_get_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a newly-created {@code GtkTreePath} referenced by {@code iter}.
     * <p>
     * This path should be freed with gtk_tree_path_free().
     */
    default @NotNull TreePath getPath(@NotNull TreeIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_model_get_path.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreePath(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_string_from_iter = Interop.downcallHandle(
        "gtk_tree_model_get_string_from_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Generates a string representation of the iter.
     * <p>
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string.
     */
    default @Nullable java.lang.String getStringFromIter(@NotNull TreeIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_model_get_string_from_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_valist = Interop.downcallHandle(
        "gtk_tree_model_get_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of one or more cells in the row referenced by {@code iter}.
     * <p>
     * See {@link TreeModel#get}, this version takes a va_list
     * for language bindings to use.
     */
    default @NotNull void getValist(@NotNull TreeIter iter, @NotNull VaList varArgs) {
        try {
            gtk_tree_model_get_valist.invokeExact(handle(), iter.handle(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_get_value = Interop.downcallHandle(
        "gtk_tree_model_get_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes and sets {@code value} to that at {@code column}.
     * <p>
     * When done with {@code value}, g_value_unset() needs to be called
     * to free any allocated memory.
     */
    default @NotNull void getValue(@NotNull TreeIter iter, @NotNull int column, @NotNull Out<org.gtk.gobject.Value> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_tree_model_get_value.invokeExact(handle(), iter.handle(), column, (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(new org.gtk.gobject.Value(Refcounted.get(valuePOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_children = Interop.downcallHandle(
        "gtk_tree_model_iter_children",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to point to the first child of {@code parent}.
     * <p>
     * If {@code parent} has no children, {@code false} is returned and {@code iter} is
     * set to be invalid. {@code parent} will remain a valid node after this
     * function has been called.
     * <p>
     * If {@code parent} is {@code null} returns the first node, equivalent to
     * {@code gtk_tree_model_get_iter_first (tree_model, iter);}
     */
    default boolean iterChildren(@NotNull Out<TreeIter> iter, @Nullable TreeIter parent) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_children.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_has_child = Interop.downcallHandle(
        "gtk_tree_model_iter_has_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code iter} has children, {@code false} otherwise.
     */
    default boolean iterHasChild(@NotNull TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_has_child.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_n_children = Interop.downcallHandle(
        "gtk_tree_model_iter_n_children",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of children that {@code iter} has.
     * <p>
     * As a special case, if {@code iter} is {@code null}, then the number
     * of toplevel nodes is returned.
     */
    default int iterNChildren(@Nullable TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_n_children.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_next = Interop.downcallHandle(
        "gtk_tree_model_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to point to the node following it at the current level.
     * <p>
     * If there is no next {@code iter}, {@code false} is returned and {@code iter} is set
     * to be invalid.
     */
    default boolean iterNext(@NotNull TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_next.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_nth_child = Interop.downcallHandle(
        "gtk_tree_model_iter_nth_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code iter} to be the child of {@code parent}, using the given index.
     * <p>
     * The first index is 0. If @n is too big, or {@code parent} has no children,
     * {@code iter} is set to an invalid iterator and {@code false} is returned. {@code parent}
     * will remain a valid node after this function has been called. As a
     * special case, if {@code parent} is {@code null}, then the @n-th root node
     * is set.
     */
    default boolean iterNthChild(@NotNull Out<TreeIter> iter, @Nullable TreeIter parent, @NotNull int n) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_nth_child.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle(), n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_parent = Interop.downcallHandle(
        "gtk_tree_model_iter_parent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to be the parent of {@code child}.
     * <p>
     * If {@code child} is at the toplevel, and doesn’t have a parent, then
     * {@code iter} is set to an invalid iterator and {@code false} is returned.
     * {@code child} will remain a valid node after this function has been
     * called.
     * <p>
     * {@code iter} will be initialized before the lookup is performed, so {@code child}
     * and {@code iter} cannot point to the same memory location.
     */
    default boolean iterParent(@NotNull Out<TreeIter> iter, @NotNull TreeIter child) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_parent.invokeExact(handle(), (Addressable) iterPOINTER.address(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_iter_previous = Interop.downcallHandle(
        "gtk_tree_model_iter_previous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to point to the previous node at the current level.
     * <p>
     * If there is no previous {@code iter}, {@code false} is returned and {@code iter} is
     * set to be invalid.
     */
    default boolean iterPrevious(@NotNull TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_model_iter_previous.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_ref_node = Interop.downcallHandle(
        "gtk_tree_model_ref_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets the tree ref the node.
     * <p>
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons.
     * <p>
     * This function is primarily meant as a way for views to let
     * caching models know when nodes are being displayed (and hence,
     * whether or not to cache that node). Being displayed means a node
     * is in an expanded branch, regardless of whether the node is currently
     * visible in the viewport. For example, a file-system based model
     * would not want to keep the entire file-hierarchy in memory,
     * just the sections that are currently being displayed by
     * every current view.
     * <p>
     * A model should be expected to be able to get an iter independent
     * of its reffed state.
     */
    default @NotNull void refNode(@NotNull TreeIter iter) {
        try {
            gtk_tree_model_ref_node.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_row_changed = Interop.downcallHandle(
        "gtk_tree_model_row_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::row-changed signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-changed}.
     */
    default @NotNull void rowChanged(@NotNull TreePath path, @NotNull TreeIter iter) {
        try {
            gtk_tree_model_row_changed.invokeExact(handle(), path.handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_row_deleted = Interop.downcallHandle(
        "gtk_tree_model_row_deleted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::row-deleted signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-deleted}.
     * <p>
     * This should be called by models after a row has been removed.
     * The location pointed to by {@code path} should be the location that
     * the row previously was at. It may not be a valid location anymore.
     * <p>
     * Nodes that are deleted are not unreffed, this means that any
     * outstanding references on the deleted node should not be released.
     */
    default @NotNull void rowDeleted(@NotNull TreePath path) {
        try {
            gtk_tree_model_row_deleted.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_row_has_child_toggled = Interop.downcallHandle(
        "gtk_tree_model_row_has_child_toggled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::row-has-child-toggled signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-has-child-toggled}.
     * <p>
     * This should be called by models after the child
     * state of a node changes.
     */
    default @NotNull void rowHasChildToggled(@NotNull TreePath path, @NotNull TreeIter iter) {
        try {
            gtk_tree_model_row_has_child_toggled.invokeExact(handle(), path.handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_row_inserted = Interop.downcallHandle(
        "gtk_tree_model_row_inserted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::row-inserted signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-inserted}.
     */
    default @NotNull void rowInserted(@NotNull TreePath path, @NotNull TreeIter iter) {
        try {
            gtk_tree_model_row_inserted.invokeExact(handle(), path.handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_rows_reordered = Interop.downcallHandle(
        "gtk_tree_model_rows_reordered",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the ::rows-reordered signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::rows-reordered}.
     * <p>
     * This should be called by models when their rows have been
     * reordered.
     */
    default @NotNull void rowsReordered(@NotNull TreePath path, @NotNull TreeIter iter, @NotNull PointerInteger newOrder) {
        try {
            gtk_tree_model_rows_reordered.invokeExact(handle(), path.handle(), iter.handle(), newOrder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_rows_reordered_with_length = Interop.downcallHandle(
        "gtk_tree_model_rows_reordered_with_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Emits the ::rows-reordered signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::rows-reordered}.
     * <p>
     * This should be called by models when their rows have been
     * reordered.
     */
    default @NotNull void rowsReorderedWithLength(@NotNull TreePath path, @Nullable TreeIter iter, @NotNull int[] newOrder, @NotNull int length) {
        try {
            gtk_tree_model_rows_reordered_with_length.invokeExact(handle(), path.handle(), iter.handle(), Interop.allocateNativeArray(newOrder), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_model_unref_node = Interop.downcallHandle(
        "gtk_tree_model_unref_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets the tree unref the node.
     * <p>
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons. For more information on what
     * this means, see gtk_tree_model_ref_node().
     * <p>
     * Please note that nodes that are deleted are not unreffed.
     */
    default @NotNull void unrefNode(@NotNull TreeIter iter) {
        try {
            gtk_tree_model_unref_node.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowChangedHandler {
        void signalReceived(TreeModel source, @NotNull TreePath path, @NotNull TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row in the model has changed.
     */
    public default SignalHandle onRowChanged(RowChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowDeletedHandler {
        void signalReceived(TreeModel source, @NotNull TreePath path);
    }
    
    /**
     * This signal is emitted when a row has been deleted.
     * <p>
     * Note that no iterator is passed to the signal handler,
     * since the row is already deleted.
     * <p>
     * This should be called by models after a row has been removed.
     * The location pointed to by {@code path} should be the location that
     * the row previously was at. It may not be a valid location anymore.
     */
    public default SignalHandle onRowDeleted(RowDeletedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-deleted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowDeleted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowHasChildToggledHandler {
        void signalReceived(TreeModel source, @NotNull TreePath path, @NotNull TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row has gotten the first child
     * row or lost its last child row.
     */
    public default SignalHandle onRowHasChildToggled(RowHasChildToggledHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-has-child-toggled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowHasChildToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowInsertedHandler {
        void signalReceived(TreeModel source, @NotNull TreePath path, @NotNull TreeIter iter);
    }
    
    /**
     * This signal is emitted when a new row has been inserted in
     * the model.
     * <p>
     * Note that the row may still be empty at this point, since
     * it is a common pattern to first insert an empty row, and
     * then fill it with the desired values.
     */
    public default SignalHandle onRowInserted(RowInsertedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-inserted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowInserted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowsReorderedHandler {
        void signalReceived(TreeModel source, @NotNull TreePath path, @NotNull TreeIter iter, @Nullable java.lang.foreign.MemoryAddress newOrder);
    }
    
    /**
     * This signal is emitted when the children of a node in the
     * {@code GtkTreeModel} have been reordered.
     * <p>
     * Note that this signal is not emitted
     * when rows are reordered by DND, since this is implemented
     * by removing and then reinserting the row.
     */
    public default SignalHandle onRowsReordered(RowsReorderedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("rows-reordered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowsReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTreeModelRowChanged(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeModel.RowChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeModel.TreeModelImpl(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)));
        }
        
        public static void signalTreeModelRowDeleted(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeModel.RowDeletedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeModel.TreeModelImpl(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static void signalTreeModelRowHasChildToggled(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeModel.RowHasChildToggledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeModel.TreeModelImpl(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)));
        }
        
        public static void signalTreeModelRowInserted(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeModel.RowInsertedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeModel.TreeModelImpl(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)));
        }
        
        public static void signalTreeModelRowsReordered(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeModel.RowsReorderedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeModel.TreeModelImpl(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)), new TreeIter(Refcounted.get(iter, false)), newOrder);
        }
        
    }
    
    class TreeModelImpl extends org.gtk.gobject.Object implements TreeModel {
        public TreeModelImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
