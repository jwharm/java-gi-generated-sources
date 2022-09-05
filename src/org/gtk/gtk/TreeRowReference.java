package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * same row (a `GtkTreePath` refers to a position, not a fixed row). Create a
 * new GtkTreeRowReference with gtk_tree_row_reference_new().
 */
public class TreeRowReference extends io.github.jwharm.javagi.interop.ResourceBase {

    public TreeRowReference(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a row reference based on @path.
     * 
     * This reference will keep pointing to the node pointed to
     * by @path, so long as it exists. Any changes that occur on @model are
     * propagated, and the path is updated appropriately. If
     * @path isn’t a valid path in @model, then %NULL is returned.
     */
    public TreeRowReference(TreeModel model, TreePath path) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_new(model.HANDLE(), path.HANDLE()), true));
    }
    
    /**
     * You do not need to use this function.
     * 
     * Creates a row reference based on @path.
     * 
     * This reference will keep pointing to the node pointed to
     * by @path, so long as it exists. If @path isn’t a valid
     * path in @model, then %NULL is returned. However, unlike
     * references created with gtk_tree_row_reference_new(), it
     * does not listen to the model for changes. The creator of
     * the row reference must do this explicitly using
     * gtk_tree_row_reference_inserted(), gtk_tree_row_reference_deleted(),
     * gtk_tree_row_reference_reordered().
     * 
     * These functions must be called exactly once per proxy when the
     * corresponding signal on the model is emitted. This single call
     * updates all row references for that proxy. Since built-in GTK
     * objects like `GtkTreeView` already use this mechanism internally,
     * using them as the proxy object will produce unpredictable results.
     * Further more, passing the same object as @model and @proxy
     * doesn’t work for reasons of internal implementation.
     * 
     * This type of row reference is primarily meant by structures that
     * need to carefully monitor exactly when a row reference updates
     * itself, and is not generally needed by most applications.
     */
    public TreeRowReference(org.gtk.gobject.Object proxy, TreeModel model, TreePath path) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_new_proxy(proxy.HANDLE(), model.HANDLE(), path.HANDLE()), true));
    }
    
    /**
     * Copies a `GtkTreeRowReference`.
     */
    public TreeRowReference copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_copy(HANDLE());
        return new TreeRowReference(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Free’s @reference. @reference may be %NULL
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_free(HANDLE());
    }
    
    /**
     * Returns the model that the row reference is monitoring.
     */
    public TreeModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_get_model(HANDLE());
        return new TreeModel.TreeModelImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns a path that the row reference currently points to,
     * or %NULL if the path pointed to is no longer valid.
     */
    public TreePath getPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_get_path(HANDLE());
        return new TreePath(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Returns %TRUE if the @reference is non-%NULL and refers to
     * a current valid path.
     */
    public boolean valid() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_row_reference_valid(HANDLE());
        return (RESULT != 0);
    }
    
}
