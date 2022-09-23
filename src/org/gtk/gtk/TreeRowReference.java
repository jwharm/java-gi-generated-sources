package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * same row (a {@code GtkTreePath} refers to a position, not a fixed row). Create a
 * new GtkTreeRowReference with gtk_tree_row_reference_new().
 */
public class TreeRowReference extends io.github.jwharm.javagi.ResourceBase {

    public TreeRowReference(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(TreeModel model, TreePath path) {
        Reference RESULT = References.get(gtk_h.gtk_tree_row_reference_new(model.handle(), path.handle()), true);
        return RESULT;
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
    
    private static Reference constructNewProxy(org.gtk.gobject.Object proxy, TreeModel model, TreePath path) {
        Reference RESULT = References.get(gtk_h.gtk_tree_row_reference_new_proxy(proxy.handle(), model.handle(), path.handle()), true);
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
     */
    public static TreeRowReference newProxy(org.gtk.gobject.Object proxy, TreeModel model, TreePath path) {
        return new TreeRowReference(constructNewProxy(proxy, model, path));
    }
    
    /**
     * Copies a {@code GtkTreeRowReference}.
     */
    public TreeRowReference copy() {
        var RESULT = gtk_h.gtk_tree_row_reference_copy(handle());
        return new TreeRowReference(References.get(RESULT, true));
    }
    
    /**
     * Free’s {@code reference}. {@code reference} may be {@code null}
     */
    public void free() {
        gtk_h.gtk_tree_row_reference_free(handle());
    }
    
    /**
     * Returns the model that the row reference is monitoring.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_tree_row_reference_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns a path that the row reference currently points to,
     * or {@code null} if the path pointed to is no longer valid.
     */
    public TreePath getPath() {
        var RESULT = gtk_h.gtk_tree_row_reference_get_path(handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns {@code true} if the {@code reference} is non-{@code null} and refers to
     * a current valid path.
     */
    public boolean valid() {
        var RESULT = gtk_h.gtk_tree_row_reference_valid(handle());
        return (RESULT != 0);
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-deleted signal.
     */
    public static void deleted(org.gtk.gobject.Object proxy, TreePath path) {
        gtk_h.gtk_tree_row_reference_deleted(proxy.handle(), path.handle());
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::row-inserted signal.
     */
    public static void inserted(org.gtk.gobject.Object proxy, TreePath path) {
        gtk_h.gtk_tree_row_reference_inserted(proxy.handle(), path.handle());
    }
    
    /**
     * Lets a set of row reference created by
     * gtk_tree_row_reference_new_proxy() know that the
     * model emitted the ::rows-reordered signal.
     */
    public static void reordered(org.gtk.gobject.Object proxy, TreePath path, TreeIter iter, int[] newOrder) {
        gtk_h.gtk_tree_row_reference_reordered(proxy.handle(), path.handle(), iter.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder)).handle());
    }
    
}
