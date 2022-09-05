package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An object for rendering a single cell
 * 
 * The `GtkCellRenderer` is a base class of a set of objects used for
 * rendering a cell to a `cairo_t`.  These objects are used primarily by
 * the `GtkTreeView` widget, though they aren’t tied to them in any
 * specific way.  It is worth noting that `GtkCellRenderer` is not a
 * `GtkWidget` and cannot be treated as such.
 * 
 * The primary use of a `GtkCellRenderer` is for drawing a certain graphical
 * elements on a `cairo_t`. Typically, one cell renderer is used to
 * draw many cells on the screen.  To this extent, it isn’t expected that a
 * CellRenderer keep any permanent state around.  Instead, any state is set
 * just prior to use using `GObject`s property system.  Then, the
 * cell is measured using gtk_cell_renderer_get_preferred_size(). Finally, the cell
 * is rendered in the correct location using gtk_cell_renderer_snapshot().
 * 
 * There are a number of rules that must be followed when writing a new
 * `GtkCellRenderer`.  First and foremost, it’s important that a certain set
 * of properties will always yield a cell renderer of the same size,
 * barring a style change. The `GtkCellRenderer` also has a number of
 * generic properties that are expected to be honored by all children.
 * 
 * Beyond merely rendering a cell, cell renderers can optionally
 * provide active user interface elements. A cell renderer can be
 * “activatable” like `GtkCellRenderer`Toggle,
 * which toggles when it gets activated by a mouse click, or it can be
 * “editable” like `GtkCellRenderer`Text, which
 * allows the user to edit the text using a widget implementing the
 * `GtkCellEditable` interface, e.g. `GtkEntry`.
 * To make a cell renderer activatable or editable, you have to
 * implement the `GtkCellRenderer`Class.activate or
 * `GtkCellRenderer`Class.start_editing virtual functions, respectively.
 * 
 * Many properties of `GtkCellRenderer` and its subclasses have a
 * corresponding “set” property, e.g. “cell-background-set” corresponds
 * to “cell-background”. These “set” properties reflect whether a property
 * has been set or not. You should not set them independently.
 */
public class CellRenderer extends org.gtk.gobject.InitiallyUnowned {

    public CellRenderer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CellRenderer */
    public static CellRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new CellRenderer(gobject.getProxy());
    }
    
    /**
     * Passes an activate event to the cell renderer for possible processing.
     * Some cell renderers may use events; for example, `GtkCellRendererToggle`
     * toggles when it gets a mouse click.
     */
    public boolean activate(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_activate(HANDLE(), event.HANDLE(), widget.HANDLE(), Interop.getAllocator().allocateUtf8String(path), backgroundArea.HANDLE(), cellArea.HANDLE(), flags);
        return (RESULT != 0);
    }
    
    /**
     * Gets the aligned area used by @cell inside @cell_area. Used for finding
     * the appropriate edit and focus rectangle.
     */
    public void getAlignedArea(Widget widget, int flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_aligned_area(HANDLE(), widget.HANDLE(), flags, cellArea.HANDLE(), alignedArea.HANDLE());
    }
    
    /**
     * Checks whether the given `GtkCellRenderer` is expanded.
     */
    public boolean getIsExpanded() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_is_expanded(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the given `GtkCellRenderer` is an expander.
     */
    public boolean getIsExpander() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_is_expander(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the minimum and natural size of a cell taking
     * into account the widget’s preference for height-for-width management.
     */
    public void getPreferredSize(Widget widget, Requisition minimumSize, Requisition naturalSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_preferred_size(HANDLE(), widget.HANDLE(), minimumSize.HANDLE(), naturalSize.HANDLE());
    }
    
    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * or a width-for-height layout.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_request_mode(HANDLE());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Returns the cell renderer’s sensitivity.
     */
    public boolean getSensitive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_sensitive(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Translates the cell renderer state to `GtkStateFlags`,
     * based on the cell renderer and widget sensitivity, and
     * the given `GtkCellRenderer`State.
     */
    public int getState(Widget widget, int cellState) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_state(HANDLE(), widget.HANDLE(), cellState);
        return RESULT;
    }
    
    /**
     * Returns the cell renderer’s visibility.
     */
    public boolean getVisible() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_get_visible(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the cell renderer can do something when activated.
     */
    public boolean isActivatable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_is_activatable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the renderer’s alignment within its available space.
     */
    public void setAlignment(float xalign, float yalign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_alignment(HANDLE(), xalign, yalign);
    }
    
    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     */
    public void setFixedSize(int width, int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_fixed_size(HANDLE(), width, height);
    }
    
    /**
     * Sets whether the given `GtkCellRenderer` is expanded.
     */
    public void setIsExpanded(boolean isExpanded) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_is_expanded(HANDLE(), isExpanded ? 1 : 0);
    }
    
    /**
     * Sets whether the given `GtkCellRenderer` is an expander.
     */
    public void setIsExpander(boolean isExpander) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_is_expander(HANDLE(), isExpander ? 1 : 0);
    }
    
    /**
     * Sets the renderer’s padding.
     */
    public void setPadding(int xpad, int ypad) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_padding(HANDLE(), xpad, ypad);
    }
    
    /**
     * Sets the cell renderer’s sensitivity.
     */
    public void setSensitive(boolean sensitive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_sensitive(HANDLE(), sensitive ? 1 : 0);
    }
    
    /**
     * Sets the cell renderer’s visibility.
     */
    public void setVisible(boolean visible) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_set_visible(HANDLE(), visible ? 1 : 0);
    }
    
    /**
     * Invokes the virtual render function of the `GtkCellRenderer`. The three
     * passed-in rectangles are areas in @cr. Most renderers will draw within
     * @cell_area; the xalign, yalign, xpad, and ypad fields of the `GtkCellRenderer`
     * should be honored with respect to @cell_area. @background_area includes the
     * blank space around the cell, and also the area containing the tree expander;
     * so the @background_area rectangles for all cells tile to cover the entire
     * @window.
     */
    public void snapshot(Snapshot snapshot, Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_snapshot(HANDLE(), snapshot.HANDLE(), widget.HANDLE(), backgroundArea.HANDLE(), cellArea.HANDLE(), flags);
    }
    
    /**
     * Starts editing the contents of this @cell, through a new `GtkCellEditable`
     * widget created by the `GtkCellRenderer`Class.start_editing virtual function.
     */
    public CellEditable startEditing(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_start_editing(HANDLE(), event.HANDLE(), widget.HANDLE(), Interop.getAllocator().allocateUtf8String(path), backgroundArea.HANDLE(), cellArea.HANDLE(), flags);
        return new CellEditable.CellEditableImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Informs the cell renderer that the editing is stopped.
     * If @canceled is %TRUE, the cell renderer will emit the
     * `GtkCellRenderer`::editing-canceled signal.
     * 
     * This function should be called by cell renderer implementations
     * in response to the `GtkCellEditable::editing-done` signal of
     * `GtkCellEditable`.
     */
    public void stopEditing(boolean canceled) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_stop_editing(HANDLE(), canceled ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface EditingCanceledHandler {
        void signalReceived(CellRenderer source);
    }
    
    /**
     * This signal gets emitted when the user cancels the process of editing a
     * cell.  For example, an editable cell renderer could be written to cancel
     * editing when the user presses Escape.
     * 
     * See also: gtk_cell_renderer_stop_editing().
     */
    public void onEditingCanceled(EditingCanceledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererEditingCanceled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("editing-canceled"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EditingStartedHandler {
        void signalReceived(CellRenderer source, CellEditable editable, java.lang.String path);
    }
    
    /**
     * This signal gets emitted when a cell starts to be edited.
     * The intended use of this signal is to do special setup
     * on @editable, e.g. adding a `GtkEntryCompletion` or setting
     * up additional columns in a `GtkComboBox`.
     * 
     * See gtk_cell_editable_start_editing() for information on the lifecycle of
     * the @editable and a way to do setup that doesn’t depend on the @renderer.
     * 
     * Note that GTK doesn't guarantee that cell renderers will
     * continue to use the same kind of widget for editing in future
     * releases, therefore you should check the type of @editable
     * before doing any specific setup, as in the following example:
     * |[<!-- language="C" -->
     * static void
     * text_editing_started (GtkCellRenderer *cell,
     *                       GtkCellEditable *editable,
     *                       const char      *path,
     *                       gpointer         data)
     * {
     *   if (GTK_IS_ENTRY (editable))
     *     {
     *       GtkEntry *entry = GTK_ENTRY (editable);
     *       
     *       // ... create a GtkEntryCompletion
     *       
     *       gtk_entry_set_completion (entry, completion);
     *     }
     * }
     * ]|
     */
    public void onEditingStarted(EditingStartedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererEditingStarted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("editing-started"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}