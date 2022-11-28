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
 * <p>
 * <strong>Acquiring a `GtkTreeIter`</strong><br/>
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
 * <p>
 * <strong>Reading data from a `GtkTreeModel`</strong><br/>
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
 * </ul>
 * <ul>
 * <li>Outstanding references on a deleted node are not released. This is not
 *   possible because the node has already been deleted by the time the
 *   row-deleted signal is received.
 * </ul>
 * <ul>
 * <li>Models are not obligated to emit a signal on rows of which none of its
 *   siblings are referenced. To phrase this differently, signals are only
 *   required for levels in which nodes are referenced. For the root level
 *   however, signals must be emitted at all times (however the root level
 *   is always referenced when any view is attached).
 * </ul>
 */
public interface TreeModel extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to TreeModel if its GType is a (or inherits from) "GtkTreeModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TreeModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeModel", a ClassCastException will be thrown.
     */
    public static TreeModel castFrom(org.gtk.gobject.Object gobject) {
            return new TreeModelImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Creates a new {@code GtkTreeModel}, with {@code child_model} as the child_model
     * and {@code root} as the virtual root.
     * @param root A {@code GtkTreePath}
     * @return A new {@code GtkTreeModel}.
     */
    default @NotNull org.gtk.gtk.TreeModel filterNew(@Nullable org.gtk.gtk.TreePath root) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_filter_new.invokeExact(
                    handle(),
                    (Addressable) (root == null ? MemoryAddress.NULL : root.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModel.TreeModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls {@code func} on each node in model in a depth-first fashion.
     * <p>
     * If {@code func} returns {@code true}, then the tree ceases to be walked,
     * and gtk_tree_model_foreach() returns.
     * @param func a function to be called on each row
     */
    default void foreach(@NotNull org.gtk.gtk.TreeModelForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_tree_model_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeModelForeachFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value of one or more cells in the row referenced by {@code iter}.
     * <p>
     * The variable argument list should contain integer column numbers,
     * each column number followed by a place to store the value being
     * retrieved.  The list is terminated by a -1. For example, to get a
     * value from column 0 with type {@code G_TYPE_STRING}, you would
     * write: {@code gtk_tree_model_get (model, iter, 0, &place_string_here, -1)},
     * where {@code place_string_here} is a {@code gchararray}
     * to be filled with the string.
     * <p>
     * Returned values with type {@code G_TYPE_OBJECT} have to be unreferenced,
     * values with type {@code G_TYPE_STRING} or {@code G_TYPE_BOXED} have to be freed.
     * Other values are passed by value.
     * @param iter a row in {@code tree_model}
     * @param varargs pairs of column number and value return locations,
     *   terminated by -1
     */
    default void get(@NotNull org.gtk.gtk.TreeIter iter, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_get.invokeExact(
                    handle(),
                    iter.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the type of the column.
     * @param index the column index
     * @return the type of the column
     */
    default @NotNull org.gtk.glib.Type getColumnType(int index) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_model_get_column_type.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns a set of flags supported by this interface.
     * <p>
     * The flags are a bitwise combination of {@code GtkTreeModel}Flags.
     * The flags supported should not change during the lifetime
     * of the {@code tree_model}.
     * @return the flags supported by this interface
     */
    default @NotNull org.gtk.gtk.TreeModelFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModelFlags(RESULT);
    }
    
    /**
     * Sets {@code iter} to a valid iterator pointing to {@code path}.
     * <p>
     * If {@code path} does not exist, {@code iter} is set to an invalid
     * iterator and {@code false} is returned.
     * @param iter the uninitialized {@code GtkTreeIter}
     * @param path the {@code GtkTreePath}
     * @return {@code true}, if {@code iter} was set
     */
    default boolean getIter(@NotNull org.gtk.gtk.TreeIter iter, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_get_iter.invokeExact(
                    handle(),
                    iter.handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code iter} with the first iterator in the tree
     * (the one at the path "0").
     * <p>
     * Returns {@code false} if the tree is empty, {@code true} otherwise.
     * @param iter the uninitialized {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} was set
     */
    default boolean getIterFirst(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_get_iter_first.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code iter} to a valid iterator pointing to {@code path_string}, if it
     * exists.
     * <p>
     * Otherwise, {@code iter} is left invalid and {@code false} is returned.
     * @param iter an uninitialized {@code GtkTreeIter}
     * @param pathString a string representation of a {@code GtkTreePath}
     * @return {@code true}, if {@code iter} was set
     */
    default boolean getIterFromString(@NotNull org.gtk.gtk.TreeIter iter, @NotNull java.lang.String pathString) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(pathString, "Parameter 'pathString' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_get_iter_from_string.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(pathString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the number of columns supported by {@code tree_model}.
     * @return the number of columns
     */
    default int getNColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_get_n_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly-created {@code GtkTreePath} referenced by {@code iter}.
     * <p>
     * This path should be freed with gtk_tree_path_free().
     * @param iter the {@code GtkTreeIter}
     * @return a newly-created {@code GtkTreePath}
     */
    default @NotNull org.gtk.gtk.TreePath getPath(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_get_path.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreePath(RESULT, Ownership.FULL);
    }
    
    /**
     * Generates a string representation of the iter.
     * <p>
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string.
     * @param iter a {@code GtkTreeIter}
     * @return a newly-allocated string
     */
    default @Nullable java.lang.String getStringFromIter(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_get_string_from_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the value of one or more cells in the row referenced by {@code iter}.
     * <p>
     * See {@link TreeModel#get}, this version takes a va_list
     * for language bindings to use.
     * @param iter a row in {@code tree_model}
     * @param varArgs va_list of column/return location pairs
     */
    default void getValist(@NotNull org.gtk.gtk.TreeIter iter, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gtk_tree_model_get_valist.invokeExact(
                    handle(),
                    iter.handle(),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes and sets {@code value} to that at {@code column}.
     * <p>
     * When done with {@code value}, g_value_unset() needs to be called
     * to free any allocated memory.
     * @param iter the {@code GtkTreeIter}
     * @param column the column to lookup the value at
     * @param value an empty {@code GValue} to set
     */
    default void getValue(@NotNull org.gtk.gtk.TreeIter iter, int column, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_tree_model_get_value.invokeExact(
                    handle(),
                    iter.handle(),
                    column,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code iter} to point to the first child of {@code parent}.
     * <p>
     * If {@code parent} has no children, {@code false} is returned and {@code iter} is
     * set to be invalid. {@code parent} will remain a valid node after this
     * function has been called.
     * <p>
     * If {@code parent} is {@code null} returns the first node, equivalent to
     * {@code gtk_tree_model_get_iter_first (tree_model, iter);}
     * @param iter the new {@code GtkTreeIter} to be set to the child
     * @param parent the {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} has been set to the first child
     */
    default boolean iterChildren(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_children.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code iter} has children, {@code false} otherwise.
     * @param iter the {@code GtkTreeIter} to test for children
     * @return {@code true} if {@code iter} has children
     */
    default boolean iterHasChild(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_has_child.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the number of children that {@code iter} has.
     * <p>
     * As a special case, if {@code iter} is {@code null}, then the number
     * of toplevel nodes is returned.
     * @param iter the {@code GtkTreeIter}
     * @return the number of children of {@code iter}
     */
    default int iterNChildren(@Nullable org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_n_children.invokeExact(
                    handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets {@code iter} to point to the node following it at the current level.
     * <p>
     * If there is no next {@code iter}, {@code false} is returned and {@code iter} is set
     * to be invalid.
     * @param iter the {@code GtkTreeIter}
     * @return {@code true} if {@code iter} has been changed to the next node
     */
    default boolean iterNext(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_next.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code iter} to be the child of {@code parent}, using the given index.
     * <p>
     * The first index is 0. If {@code n} is too big, or {@code parent} has no children,
     * {@code iter} is set to an invalid iterator and {@code false} is returned. {@code parent}
     * will remain a valid node after this function has been called. As a
     * special case, if {@code parent} is {@code null}, then the {@code n}-th root node
     * is set.
     * @param iter the {@code GtkTreeIter} to set to the nth child
     * @param parent the {@code GtkTreeIter} to get the child from
     * @param n the index of the desired child
     * @return {@code true}, if {@code parent} has an {@code n}-th child
     */
    default boolean iterNthChild(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, int n) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_nth_child.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param iter the new {@code GtkTreeIter} to set to the parent
     * @param child the {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} is set to the parent of {@code child}
     */
    default boolean iterParent(@NotNull org.gtk.gtk.TreeIter iter, @NotNull org.gtk.gtk.TreeIter child) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_parent.invokeExact(
                    handle(),
                    iter.handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code iter} to point to the previous node at the current level.
     * <p>
     * If there is no previous {@code iter}, {@code false} is returned and {@code iter} is
     * set to be invalid.
     * @param iter the {@code GtkTreeIter}
     * @return {@code true} if {@code iter} has been changed to the previous node
     */
    default boolean iterPrevious(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_iter_previous.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param iter the {@code GtkTreeIter}
     */
    default void refNode(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_ref_node.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::row-changed signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-changed}.
     * @param path a {@code GtkTreePath} pointing to the changed row
     * @param iter a valid {@code GtkTreeIter} pointing to the changed row
     */
    default void rowChanged(@NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_row_changed.invokeExact(
                    handle(),
                    path.handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param path a {@code GtkTreePath} pointing to the previous location of
     *   the deleted row
     */
    default void rowDeleted(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_tree_model_row_deleted.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::row-has-child-toggled signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-has-child-toggled}.
     * <p>
     * This should be called by models after the child
     * state of a node changes.
     * @param path a {@code GtkTreePath} pointing to the changed row
     * @param iter a valid {@code GtkTreeIter} pointing to the changed row
     */
    default void rowHasChildToggled(@NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_row_has_child_toggled.invokeExact(
                    handle(),
                    path.handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::row-inserted signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::row-inserted}.
     * @param path a {@code GtkTreePath} pointing to the inserted row
     * @param iter a valid {@code GtkTreeIter} pointing to the inserted row
     */
    default void rowInserted(@NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_row_inserted.invokeExact(
                    handle(),
                    path.handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::rows-reordered signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::rows-reordered}.
     * <p>
     * This should be called by models when their rows have been
     * reordered.
     * @param path a {@code GtkTreePath} pointing to the tree node whose children
     *   have been reordered
     * @param iter a valid {@code GtkTreeIter} pointing to the node whose children
     *   have been reordered, or {@code null} if the depth of {@code path} is 0
     * @param newOrder an array of integers mapping the current position of
     *   each child to its old position before the re-ordering,
     *   i.e. {@code new_order}{@code [newpos] = oldpos}
     */
    default void rowsReordered(@NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter, PointerInteger newOrder) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_tree_model_rows_reordered.invokeExact(
                    handle(),
                    path.handle(),
                    iter.handle(),
                    newOrder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ::rows-reordered signal on {@code tree_model}.
     * <p>
     * See {@code Gtk.TreeModel::rows-reordered}.
     * <p>
     * This should be called by models when their rows have been
     * reordered.
     * @param path a {@code GtkTreePath} pointing to the tree node whose children
     *   have been reordered
     * @param iter a valid {@code GtkTreeIter} pointing to the node
     *   whose children have been reordered, or {@code null} if the depth
     *   of {@code path} is 0
     * @param newOrder an array of integers
     *   mapping the current position of each child to its old
     *   position before the re-ordering,
     *   i.e. {@code new_order}{@code [newpos] = oldpos}
     * @param length length of {@code new_order} array
     */
    default void rowsReorderedWithLength(@NotNull org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeIter iter, @NotNull int[] newOrder, int length) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_tree_model_rows_reordered_with_length.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()),
                    Interop.allocateNativeArray(newOrder, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets the tree unref the node.
     * <p>
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons. For more information on what
     * this means, see gtk_tree_model_ref_node().
     * <p>
     * Please note that nodes that are deleted are not unreffed.
     * @param iter the {@code GtkTreeIter}
     */
    default void unrefNode(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_model_unref_node.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface RowChanged {
        void signalReceived(TreeModel source, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row in the model has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeModel.RowChanged> onRowChanged(TreeModel.RowChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeModel.RowChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowDeleted {
        void signalReceived(TreeModel source, @NotNull org.gtk.gtk.TreePath path);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeModel.RowDeleted> onRowDeleted(TreeModel.RowDeleted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-deleted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowDeleted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeModel.RowDeleted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowHasChildToggled {
        void signalReceived(TreeModel source, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter);
    }
    
    /**
     * This signal is emitted when a row has gotten the first child
     * row or lost its last child row.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeModel.RowHasChildToggled> onRowHasChildToggled(TreeModel.RowHasChildToggled handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-has-child-toggled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowHasChildToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeModel.RowHasChildToggled>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowInserted {
        void signalReceived(TreeModel source, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter);
    }
    
    /**
     * This signal is emitted when a new row has been inserted in
     * the model.
     * <p>
     * Note that the row may still be empty at this point, since
     * it is a common pattern to first insert an empty row, and
     * then fill it with the desired values.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeModel.RowInserted> onRowInserted(TreeModel.RowInserted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-inserted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowInserted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeModel.RowInserted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowsReordered {
        void signalReceived(TreeModel source, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter, @Nullable java.lang.foreign.MemoryAddress newOrder);
    }
    
    /**
     * This signal is emitted when the children of a node in the
     * {@code GtkTreeModel} have been reordered.
     * <p>
     * Note that this signal is not emitted
     * when rows are reordered by DND, since this is implemented
     * by removing and then reinserting the row.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeModel.RowsReordered> onRowsReordered(TreeModel.RowsReordered handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("rows-reordered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeModel.Callbacks.class, "signalTreeModelRowsReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeModel.RowsReordered>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_filter_new = Interop.downcallHandle(
            "gtk_tree_model_filter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_foreach = Interop.downcallHandle(
            "gtk_tree_model_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get = Interop.downcallHandle(
            "gtk_tree_model_get",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_column_type = Interop.downcallHandle(
            "gtk_tree_model_get_column_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_flags = Interop.downcallHandle(
            "gtk_tree_model_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_iter = Interop.downcallHandle(
            "gtk_tree_model_get_iter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_iter_first = Interop.downcallHandle(
            "gtk_tree_model_get_iter_first",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_iter_from_string = Interop.downcallHandle(
            "gtk_tree_model_get_iter_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_n_columns = Interop.downcallHandle(
            "gtk_tree_model_get_n_columns",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_path = Interop.downcallHandle(
            "gtk_tree_model_get_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_string_from_iter = Interop.downcallHandle(
            "gtk_tree_model_get_string_from_iter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_valist = Interop.downcallHandle(
            "gtk_tree_model_get_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_value = Interop.downcallHandle(
            "gtk_tree_model_get_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_children = Interop.downcallHandle(
            "gtk_tree_model_iter_children",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_has_child = Interop.downcallHandle(
            "gtk_tree_model_iter_has_child",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_n_children = Interop.downcallHandle(
            "gtk_tree_model_iter_n_children",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_next = Interop.downcallHandle(
            "gtk_tree_model_iter_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_nth_child = Interop.downcallHandle(
            "gtk_tree_model_iter_nth_child",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_parent = Interop.downcallHandle(
            "gtk_tree_model_iter_parent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_iter_previous = Interop.downcallHandle(
            "gtk_tree_model_iter_previous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_ref_node = Interop.downcallHandle(
            "gtk_tree_model_ref_node",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_row_changed = Interop.downcallHandle(
            "gtk_tree_model_row_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_row_deleted = Interop.downcallHandle(
            "gtk_tree_model_row_deleted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_row_has_child_toggled = Interop.downcallHandle(
            "gtk_tree_model_row_has_child_toggled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_row_inserted = Interop.downcallHandle(
            "gtk_tree_model_row_inserted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_rows_reordered = Interop.downcallHandle(
            "gtk_tree_model_rows_reordered",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_rows_reordered_with_length = Interop.downcallHandle(
            "gtk_tree_model_rows_reordered_with_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_unref_node = Interop.downcallHandle(
            "gtk_tree_model_unref_node",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_model_get_type = Interop.downcallHandle(
            "gtk_tree_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalTreeModelRowChanged(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TreeModel.RowChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeModel.TreeModelImpl(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static void signalTreeModelRowDeleted(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TreeModel.RowDeleted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeModel.TreeModelImpl(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE));
        }
        
        public static void signalTreeModelRowHasChildToggled(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TreeModel.RowHasChildToggled) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeModel.TreeModelImpl(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static void signalTreeModelRowInserted(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TreeModel.RowInserted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeModel.TreeModelImpl(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static void signalTreeModelRowsReordered(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TreeModel.RowsReordered) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeModel.TreeModelImpl(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE), newOrder);
        }
    }
    
    class TreeModelImpl extends org.gtk.gobject.Object implements TreeModel {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public TreeModelImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
