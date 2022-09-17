package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The selection object for GtkTreeView
 * <p>
 * The <code>GtkTreeSelection</code> object is a helper object to manage the selection
 * for a <code>GtkTreeView</code> widget.  The <code>GtkTreeSelection</code> object is
 * automatically created when a new <code>GtkTreeView</code> widget is created, and
 * cannot exist independently of this widget.  The primary reason the<code>GtkTreeSelection</code> objects exists is for cleanliness of code and API.
 * That is, there is no conceptual reason all these functions could not be
 * methods on the <code>GtkTreeView</code> widget instead of a separate function.
 * <p>
 * The <code>GtkTreeSelection</code> object is gotten from a <code>GtkTreeView</code> by calling
 * gtk_tree_view_get_selection().  It can be manipulated to check the
 * selection status of the tree, as well as select and deselect individual
 * rows.  Selection is done completely view side.  As a result, multiple
 * views of the same model can have completely different selections.
 * Additionally, you cannot change the selection of a row on the model that
 * is not currently displayed by the view without expanding its parents
 * first.
 * <p>
 * One of the important things to remember when monitoring the selection of
 * a view is that the <code>GtkTreeSelection</code>::changed signal is mostly a hint.
 * That is, it may only emit one signal when a range of rows is selected.
 * Additionally, it may on occasion emit a <code>GtkTreeSelection</code>::changed signal
 * when nothing has happened (mostly as a result of programmers calling
 * select_row on an already selected row).
 */
public class TreeSelection extends org.gtk.gobject.Object {

    public TreeSelection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeSelection */
    public static TreeSelection castFrom(org.gtk.gobject.Object gobject) {
        return new TreeSelection(gobject.getReference());
    }
    
    /**
     * Returns the number of rows that have been selected in @tree.
     */
    public int countSelectedRows() {
        var RESULT = gtk_h.gtk_tree_selection_count_selected_rows(handle());
        return RESULT;
    }
    
    /**
     * Gets the selection mode for @selection. See
     * gtk_tree_selection_set_mode().
     */
    public SelectionMode getMode() {
        var RESULT = gtk_h.gtk_tree_selection_get_mode(handle());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Sets @iter to the currently selected node if @selection is set to
     * {@link org.gtk.gtk.SelectionMode#SINGLE} or <code>GTK_SELECTION_BROWSE.</code>  @iter may be NULL if you
     * just want to test if @selection has any selected nodes.  @model is filled
     * with the current model as a convenience.  This function will not work if you
     * use @selection is  @iter may be NULL if you
     * just want to test if @selection has any selected nodes.  @model is filled
     * with the current model as a convenience.  This function will not work if you
     * use @selection is %GTK_SELECTION_MULTIPLE.
     */
    public boolean getSelected(TreeModel[] model, TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_selection_get_selected(handle(), Interop.allocateNativeArray(model).handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a list of path of all selected rows. Additionally, if you are
     * planning on modifying the model after calling this function, you may
     * want to convert the returned list into a list of <code>GtkTreeRowReference</code>s.
     * To do this, you can use gtk_tree_row_reference_new().
     * 
     * To free the return value, use:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * ]}|
     */
    public org.gtk.glib.List getSelectedRows(TreeModel[] model) {
        var RESULT = gtk_h.gtk_tree_selection_get_selected_rows(handle(), Interop.allocateNativeArray(model).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Returns the tree view associated with @selection.
     */
    public TreeView getTreeView() {
        var RESULT = gtk_h.gtk_tree_selection_get_tree_view(handle());
        return new TreeView(References.get(RESULT, false));
    }
    
    /**
     * Returns the user data for the selection function.
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.gtk_tree_selection_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if the row at @iter is currently selected.
     */
    public boolean iterIsSelected(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_selection_iter_is_selected(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the row pointed to by @path is currently selected.  If @path
     * does not point to a valid location, <code>false</code> is returned
     */
    public boolean pathIsSelected(TreePath path) {
        var RESULT = gtk_h.gtk_tree_selection_path_is_selected(handle(), path.handle());
        return (RESULT != 0);
    }
    
    /**
     * Selects all the nodes. @selection must be set to 
     *             
     *           
     *         
     *       
     *       
     *         Selects all the nodes. @selection must be set to %GTK_SELECTION_MULTIPLE
     * mode.
     */
    public void selectAll() {
        gtk_h.gtk_tree_selection_select_all(handle());
    }
    
    /**
     * Selects the specified iterator.
     */
    public void selectIter(TreeIter iter) {
        gtk_h.gtk_tree_selection_select_iter(handle(), iter.handle());
    }
    
    /**
     * Select the row at @path.
     */
    public void selectPath(TreePath path) {
        gtk_h.gtk_tree_selection_select_path(handle(), path.handle());
    }
    
    /**
     * Selects a range of nodes, determined by @start_path and @end_path inclusive.
     * @selection must be set to {@link org.gtk.gtk.SelectionMode#MULTIPLE} mode.
     */
    public void selectRange(TreePath startPath, TreePath endPath) {
        gtk_h.gtk_tree_selection_select_range(handle(), startPath.handle(), endPath.handle());
    }
    
    /**
     * Calls a function for each selected node. Note that you cannot modify
     * the tree or selection from within this function. As a result,
     * gtk_tree_selection_get_selected_rows() might be more useful.
     */
    public void selectedForeach(TreeSelectionForeachFunc func) {
        try {
            gtk_h.gtk_tree_selection_selected_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeSelectionForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the selection mode of the @selection.  If the previous type was
     * <code>GTK_SELECTION_MULTIPLE,</code> then the anchor is kept selected, if it was
     * previously selected.
     */
    public void setMode(SelectionMode type) {
        gtk_h.gtk_tree_selection_set_mode(handle(), type.getValue());
    }
    
    /**
     * Sets the selection function.
     * 
     * If set, this function is called before any node is selected or unselected,
     * giving some control over which nodes are selected. The select function
     * should return <code>true</code> if the state of the node may be toggled, and <code>FALSE
     * if</code> the state of the node should be left unchanged.
     */
    public void setSelectFunction(TreeSelectionFunc func) {
        try {
            gtk_h.gtk_tree_selection_set_select_function(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeSelectionFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unselects all the nodes.
     */
    public void unselectAll() {
        gtk_h.gtk_tree_selection_unselect_all(handle());
    }
    
    /**
     * Unselects the specified iterator.
     */
    public void unselectIter(TreeIter iter) {
        gtk_h.gtk_tree_selection_unselect_iter(handle(), iter.handle());
    }
    
    /**
     * Unselects the row at @path.
     */
    public void unselectPath(TreePath path) {
        gtk_h.gtk_tree_selection_unselect_path(handle(), path.handle());
    }
    
    /**
     * Unselects a range of nodes, determined by @start_path and @end_path
     * inclusive.
     */
    public void unselectRange(TreePath startPath, TreePath endPath) {
        gtk_h.gtk_tree_selection_unselect_range(handle(), startPath.handle(), endPath.handle());
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(TreeSelection source);
    }
    
    /**
     * Emitted whenever the selection has (possibly) changed. Please note that
     * this signal is mostly a hint.  It may only be emitted once when a range
     * of rows are selected, and it may occasionally be emitted when nothing
     * has happened.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeSelectionChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
