package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * same row (a {@code GtkTreePath} refers to a position, not a fixed row). Create a
 * new GtkTreeRowReference with gtk_tree_row_reference_new().
 */
public class TreeRowReference extends io.github.jwharm.javagi.ResourceBase {
    
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
    
    public TreeRowReference(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_tree_row_reference_new.invokeExact(model.handle(), path.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a row reference based on {@code path}.
     * <p>
     * This reference will keep pointing to the node pointed to
     * by {@code path}, so long as it exists. Any changes that occur on {@code model} are
     * propagated, and the path is updated appropriately. If
     * {@code path} isn’t a valid path in {@code model}, then {@code null} is returned.
     * @param model a {@code GtkTreeModel}
     * @param path a valid {@code GtkTreePath} to monitor
     */
    public TreeRowReference(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path) {
        super(constructNew(model, path));
    }
    
    private static Refcounted constructNewProxy(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_tree_row_reference_new_proxy.invokeExact(proxy.handle(), model.handle(), path.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param proxy a proxy {@code GObject}
     * @param model a {@code GtkTreeModel}
     * @param path a valid {@code GtkTreePath} to monitor
     * @return a newly allocated {@code GtkTreeRowReference}
     */
    public static TreeRowReference newProxy(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path) {
        return new TreeRowReference(constructNewProxy(proxy, model, path));
    }
    
    /**
     * Copies a {@code GtkTreeRowReference}.
     * @return a copy of {@code reference}
     */
    public @NotNull org.gtk.gtk.TreeRowReference copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_row_reference_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeRowReference(Refcounted.get(RESULT, true));
    }
    
    /**
     * Free’s {@code reference}. {@code reference} may be {@code null}
     */
    public void free() {
        try {
            DowncallHandles.gtk_tree_row_reference_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the model that the row reference is monitoring.
     * @return the model
     */
    public @NotNull org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_row_reference_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns a path that the row reference currently points to,
     * or {@code null} if the path pointed to is no longer valid.
     * @return a current path
     */
    public @Nullable org.gtk.gtk.TreePath getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_row_reference_get_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreePath(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns {@code true} if the {@code reference} is non-{@code null} and refers to
     * a current valid path.
     * @return {@code true} if {@code reference} points to a valid path
     */
    public boolean valid() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_row_reference_valid.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     * @param proxy a {@code GObject}
     * @param path the path position that was deleted
     */
    public static void deleted(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_tree_row_reference_deleted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-inserted signal.
     * @param proxy a {@code GObject}
     * @param path the row position that was inserted
     */
    public static void inserted(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_tree_row_reference_inserted.invokeExact(proxy.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::rows-reordered signal.
     * @param proxy a {@code GObject}
     * @param path the parent path of the reordered signal
     * @param iter the iter pointing to the parent of the reordered
     * @param newOrder the new order of rows
     */
    public static void reordered(@NotNull org.gtk.gobject.Object proxy, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter, int[] newOrder) {
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_tree_row_reference_reordered.invokeExact(proxy.handle(), path.handle(), iter.handle(), Interop.allocateNativeArray(newOrder, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_row_reference_new = Interop.downcallHandle(
            "gtk_tree_row_reference_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_new_proxy = Interop.downcallHandle(
            "gtk_tree_row_reference_new_proxy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_copy = Interop.downcallHandle(
            "gtk_tree_row_reference_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_free = Interop.downcallHandle(
            "gtk_tree_row_reference_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_get_model = Interop.downcallHandle(
            "gtk_tree_row_reference_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_get_path = Interop.downcallHandle(
            "gtk_tree_row_reference_get_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_valid = Interop.downcallHandle(
            "gtk_tree_row_reference_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_deleted = Interop.downcallHandle(
            "gtk_tree_row_reference_deleted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_inserted = Interop.downcallHandle(
            "gtk_tree_row_reference_inserted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_row_reference_reordered = Interop.downcallHandle(
            "gtk_tree_row_reference_reordered",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
