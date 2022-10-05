package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * same row (a {@code GtkTreePath} refers to a position, not a fixed row). Create a
 * new GtkTreeRowReference with gtk_tree_row_reference_new().
 */
public class TreeRowReference extends io.github.jwharm.javagi.ResourceBase {

    public TreeRowReference(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_tree_row_reference_new = Interop.downcallHandle(
        "gtk_tree_row_reference_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(TreeModel model, TreePath path) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_row_reference_new.invokeExact(model.handle(), path.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a row reference based on {@code path}.
     * <p>
     * This reference will keep pointing to the node pointed to
     * by {@code path}, so long as it exists. Any changes that occur on {@code model} are
     * propagated, and the path is updated appropriately. If
     * {@code path} isn’t a valid path in {@code model}, then {@code null} is returned.
     */
    public TreeRowReference(TreeModel model, TreePath path) {
        super(constructNew(model, path));
    }
    
    static final MethodHandle gtk_tree_row_reference_new_proxy = Interop.downcallHandle(
        "gtk_tree_row_reference_new_proxy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewProxy(org.gtk.gobject.Object proxy, TreeModel model, TreePath path) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_row_reference_new_proxy.invokeExact(proxy.handle(), model.handle(), path.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * You do not need to use this function.
     * <p>
     * Creates a row reference based on {@code path}.
     * <p>
     * This reference will keep pointing to the node pointed to
     * by {@code path}, so long as it exists. If {@code path} isn’t a valid
     * path in {@code model}, then {@code null} is returned. However, unlike
     * references created with gtk_tree_row_reference_new(), it
     * does not listen to the model for changes. The creator of
     * the row reference must do this explicitly using
     * gtk_tree_row_reference_inserted(), gtk_tree_row_reference_deleted(),
     * gtk_tree_row_reference_reordered().
     * <p>
     * These functions must be called exactly once per proxy when the
     * corresponding signal on the model is emitted. This single call
     * updates all row references for that proxy. Since built-in GTK
     * objects like {@code GtkTreeView} already use this mechanism internally,
     * using them as the proxy object will produce unpredictable results.
     * Further more, passing the same object as {@code model} and {@code proxy}
     * doesn’t work for reasons of internal implementation.
     * <p>
     * This type of row reference is primarily meant by structures that
     * need to carefully monitor exactly when a row reference updates
     * itself, and is not generally needed by most applications.
     */
    public static TreeRowReference newProxy(org.gtk.gobject.Object proxy, TreeModel model, TreePath path) {
        return new TreeRowReference(constructNewProxy(proxy, model, path));
    }
    
    static final MethodHandle gtk_tree_row_reference_copy = Interop.downcallHandle(
        "gtk_tree_row_reference_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkTreeRowReference}.
     */
    public TreeRowReference copy() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_row_reference_copy.invokeExact(handle());
            return new TreeRowReference(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_free = Interop.downcallHandle(
        "gtk_tree_row_reference_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free’s {@code reference}. {@code reference} may be {@code null}
     */
    public void free() {
        try {
            gtk_tree_row_reference_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_get_model = Interop.downcallHandle(
        "gtk_tree_row_reference_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model that the row reference is monitoring.
     */
    public TreeModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_row_reference_get_model.invokeExact(handle());
            return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_get_path = Interop.downcallHandle(
        "gtk_tree_row_reference_get_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a path that the row reference currently points to,
     * or {@code null} if the path pointed to is no longer valid.
     */
    public TreePath getPath() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_row_reference_get_path.invokeExact(handle());
            return new TreePath(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_valid = Interop.downcallHandle(
        "gtk_tree_row_reference_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code reference} is non-{@code null} and refers to
     * a current valid path.
     */
    public boolean valid() {
        try {
            var RESULT = (int) gtk_tree_row_reference_valid.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_deleted = Interop.downcallHandle(
        "gtk_tree_row_reference_deleted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     */
    public static void deleted(org.gtk.gobject.Object proxy, TreePath path) {
        try {
            gtk_tree_row_reference_deleted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_inserted = Interop.downcallHandle(
        "gtk_tree_row_reference_inserted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-inserted signal.
     */
    public static void inserted(org.gtk.gobject.Object proxy, TreePath path) {
        try {
            gtk_tree_row_reference_inserted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_row_reference_reordered = Interop.downcallHandle(
        "gtk_tree_row_reference_reordered",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::rows-reordered signal.
     */
    public static void reordered(org.gtk.gobject.Object proxy, TreePath path, TreeIter iter, int[] newOrder) {
        try {
            gtk_tree_row_reference_reordered.invokeExact(proxy.handle(), path.handle(), iter.handle(), Interop.allocateNativeArray(newOrder).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
