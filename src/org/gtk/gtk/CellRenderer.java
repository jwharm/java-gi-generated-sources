package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An object for rendering a single cell
 * <p>
 * The <code>GtkCellRenderer</code> is a base class of a set of objects used for
 * rendering a cell to a <code>cairo_t</code>.  These objects are used primarily by
 * the <code>GtkTreeView</code> widget, though they aren&<code>#8217</code> t tied to them in any
 * specific way.  It is worth noting that <code>GtkCellRenderer</code> is not a<code>GtkWidget</code> and cannot be treated as such.
 * <p>
 * The primary use of a <code>GtkCellRenderer</code> is for drawing a certain graphical
 * elements on a <code>cairo_t</code>. Typically, one cell renderer is used to
 * draw many cells on the screen.  To this extent, it isn&<code>#8217</code> t expected that a
 * CellRenderer keep any permanent state around.  Instead, any state is set
 * just prior to use using <code>GObject</code>s property system.  Then, the
 * cell is measured using gtk_cell_renderer_get_preferred_size(). Finally, the cell
 * is rendered in the correct location using gtk_cell_renderer_snapshot().
 * <p>
 * There are a number of rules that must be followed when writing a new<code>GtkCellRenderer</code>.  First and foremost, it&<code>#8217</code> s important that a certain set
 * of properties will always yield a cell renderer of the same size,
 * barring a style change. The <code>GtkCellRenderer</code> also has a number of
 * generic properties that are expected to be honored by all children.
 * <p>
 * Beyond merely rendering a cell, cell renderers can optionally
 * provide active user interface elements. A cell renderer can be
 * &<code>#8220</code> activatable&<code>#8221</code>  like <code>GtkCellRenderer</code>Toggle,
 * which toggles when it gets activated by a mouse click, or it can be
 * &<code>#8220</code> editable&<code>#8221</code>  like <code>GtkCellRenderer</code>Text, which
 * allows the user to edit the text using a widget implementing the<code>GtkCellEditable</code> interface, e.g. <code>GtkEntry</code>.
 * To make a cell renderer activatable or editable, you have to
 * implement the <code>GtkCellRenderer</code>Class.activate or<code>GtkCellRenderer</code>Class.start_editing virtual functions, respectively.
 * <p>
 * Many properties of <code>GtkCellRenderer</code> and its subclasses have a
 * corresponding &<code>#8220</code> set&<code>#8221</code>  property, e.g. &<code>#8220</code> cell-background-set&<code>#8221</code>  corresponds
 * to &<code>#8220</code> cell-background&<code>#8221</code> . These &<code>#8220</code> set&<code>#8221</code>  properties reflect whether a property
 * has been set or not. You should not set them independently.
 */
public class CellRenderer extends org.gtk.gobject.InitiallyUnowned {

    public CellRenderer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRenderer */
    public static CellRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new CellRenderer(gobject.getReference());
    }
    
    /**
     * Passes an activate event to the cell renderer for possible processing.
     * Some cell renderers may use events; for example, <code>GtkCellRendererToggle</code>
     * toggles when it gets a mouse click.
     */
    public boolean activate(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = gtk_h.gtk_cell_renderer_activate(handle(), event.handle(), widget.handle(), Interop.allocateNativeString(path).handle(), backgroundArea.handle(), cellArea.handle(), flags);
        return (RESULT != 0);
    }
    
    /**
     * Gets the aligned area used by @cell inside @cell_area. Used for finding
     * the appropriate edit and focus rectangle.
     */
    public void getAlignedArea(Widget widget, int flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea) {
        gtk_h.gtk_cell_renderer_get_aligned_area(handle(), widget.handle(), flags, cellArea.handle(), alignedArea.handle());
    }
    
    /**
     * Checks whether the given <code>GtkCellRenderer</code> is expanded.
     */
    public boolean getIsExpanded() {
        var RESULT = gtk_h.gtk_cell_renderer_get_is_expanded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the given <code>GtkCellRenderer</code> is an expander.
     */
    public boolean getIsExpander() {
        var RESULT = gtk_h.gtk_cell_renderer_get_is_expander(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the minimum and natural size of a cell taking
     * into account the widget&<code>#8217</code> s preference for height-for-width management.
     */
    public void getPreferredSize(Widget widget, Requisition minimumSize, Requisition naturalSize) {
        gtk_h.gtk_cell_renderer_get_preferred_size(handle(), widget.handle(), minimumSize.handle(), naturalSize.handle());
    }
    
    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * or a width-for-height layout.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = gtk_h.gtk_cell_renderer_get_request_mode(handle());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Returns the cell renderer&<code>#8217</code> s sensitivity.
     */
    public boolean getSensitive() {
        var RESULT = gtk_h.gtk_cell_renderer_get_sensitive(handle());
        return (RESULT != 0);
    }
    
    /**
     * Translates the cell renderer state to <code>GtkStateFlags</code>,
     * based on the cell renderer and widget sensitivity, and
     * the given <code>GtkCellRenderer</code>State.
     */
    public int getState(Widget widget, int cellState) {
        var RESULT = gtk_h.gtk_cell_renderer_get_state(handle(), widget.handle(), cellState);
        return RESULT;
    }
    
    /**
     * Returns the cell renderer&<code>#8217</code> s visibility.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_cell_renderer_get_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the cell renderer can do something when activated.
     */
    public boolean isActivatable() {
        var RESULT = gtk_h.gtk_cell_renderer_is_activatable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the renderer&<code>#8217</code> s alignment within its available space.
     */
    public void setAlignment(float xalign, float yalign) {
        gtk_h.gtk_cell_renderer_set_alignment(handle(), xalign, yalign);
    }
    
    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     */
    public void setFixedSize(int width, int height) {
        gtk_h.gtk_cell_renderer_set_fixed_size(handle(), width, height);
    }
    
    /**
     * Sets whether the given <code>GtkCellRenderer</code> is expanded.
     */
    public void setIsExpanded(boolean isExpanded) {
        gtk_h.gtk_cell_renderer_set_is_expanded(handle(), isExpanded ? 1 : 0);
    }
    
    /**
     * Sets whether the given <code>GtkCellRenderer</code> is an expander.
     */
    public void setIsExpander(boolean isExpander) {
        gtk_h.gtk_cell_renderer_set_is_expander(handle(), isExpander ? 1 : 0);
    }
    
    /**
     * Sets the renderer&<code>#8217</code> s padding.
     */
    public void setPadding(int xpad, int ypad) {
        gtk_h.gtk_cell_renderer_set_padding(handle(), xpad, ypad);
    }
    
    /**
     * Sets the cell renderer&<code>#8217</code> s sensitivity.
     */
    public void setSensitive(boolean sensitive) {
        gtk_h.gtk_cell_renderer_set_sensitive(handle(), sensitive ? 1 : 0);
    }
    
    /**
     * Sets the cell renderer&<code>#8217</code> s visibility.
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_cell_renderer_set_visible(handle(), visible ? 1 : 0);
    }
    
    /**
     * Invokes the virtual render function of the <code>GtkCellRenderer</code>. The three
     * passed-in rectangles are areas in @cr. Most renderers will draw within
     * @cell_area; the xalign, yalign, xpad, and ypad fields of the <code>GtkCellRenderer</code>
     * should be honored with respect to @cell_area. @background_area includes the
     * blank space around the cell, and also the area containing the tree expander;
     * so the @background_area rectangles for all cells tile to cover the entire
     * @window.
     */
    public void snapshot(Snapshot snapshot, Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        gtk_h.gtk_cell_renderer_snapshot(handle(), snapshot.handle(), widget.handle(), backgroundArea.handle(), cellArea.handle(), flags);
    }
    
    /**
     * Starts editing the contents of this @cell, through a new <code>GtkCellEditable</code>
     * widget created by the <code>GtkCellRenderer</code>Class.start_editing virtual function.
     */
    public CellEditable startEditing(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = gtk_h.gtk_cell_renderer_start_editing(handle(), event.handle(), widget.handle(), Interop.allocateNativeString(path).handle(), backgroundArea.handle(), cellArea.handle(), flags);
        return new CellEditable.CellEditableImpl(References.get(RESULT, false));
    }
    
    /**
     * Informs the cell renderer that the editing is stopped.
     * If @canceled is <code>true</code>  the cell renderer will emit the<code>GtkCellRenderer</code>::editing-canceled signal.
     * <p>
     * This function should be called by cell renderer implementations
     * in response to the <code>GtkCellEditable::editing-done</code> signal of<code>GtkCellEditable</code>.
     */
    public void stopEditing(boolean canceled) {
        gtk_h.gtk_cell_renderer_stop_editing(handle(), canceled ? 1 : 0);
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
    public SignalHandle onEditingCanceled(EditingCanceledHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererEditingCanceled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("editing-canceled").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * on @editable, e.g. adding a <code>GtkEntryCompletion</code> or setting
     * up additional columns in a <code>GtkComboBox</code>.
     * 
     * See gtk_cell_editable_start_editing() for information on the lifecycle of
     * the @editable and a way to do setup that doesn&<code>#8217</code> t depend on the @renderer.
     * 
     * Note that GTK doesn&<code>#39</code> t guarantee that cell renderers will
     * continue to use the same kind of widget for editing in future
     * releases, therefore you should check the type of @editable
     * before doing any specific setup, as in the following example:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
     * ]}|
     */
    public SignalHandle onEditingStarted(EditingStartedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererEditingStarted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("editing-started").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
