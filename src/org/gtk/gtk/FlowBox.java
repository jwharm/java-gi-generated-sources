package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkFlowBox} puts child widgets in reflowing grid.
 * <p>
 * For instance, with the horizontal orientation, the widgets will be
 * arranged from left to right, starting a new row under the previous
 * row when necessary. Reducing the width in this case will require more
 * rows, so a larger height will be requested.
 * <p>
 * Likewise, with the vertical orientation, the widgets will be arranged
 * from top to bottom, starting a new column to the right when necessary.
 * Reducing the height will require more columns, so a larger width will
 * be requested.
 * <p>
 * The size request of a {@code GtkFlowBox} alone may not be what you expect;
 * if you need to be able to shrink it along both axes and dynamically
 * reflow its children, you may have to wrap it in a {@code GtkScrolledWindow}
 * to enable that.
 * <p>
 * The children of a {@code GtkFlowBox} can be dynamically sorted and filtered.
 * <p>
 * Although a {@code GtkFlowBox} must have only {@code GtkFlowBoxChild} children, you
 * can add any kind of widget to it via {@link FlowBox#insert}, and a
 * {@code GtkFlowBoxChild} widget will automatically be inserted between the box
 * and the widget.
 * <p>
 * Also see {@link ListBox}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * flowbox
 * ├── flowboxchild
 * │   ╰── <child>
 * ├── flowboxchild
 * │   ╰── <child>
 * ┊
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkFlowBox} uses a single CSS node with name flowbox. {@code GtkFlowBoxChild}
 * uses a single CSS node with name flowboxchild. For rubberband selection,
 * a subnode with name rubberband is used.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkFlowBox} uses the {@link AccessibleRole#GRID} role, and {@code GtkFlowBoxChild}
 * uses the {@link AccessibleRole#GRID_CELL} role.
 */
public class FlowBox extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public FlowBox(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FlowBox */
    public static FlowBox castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBox(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_flow_box_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkFlowBox}.
     */
    public FlowBox() {
        super(constructNew());
    }
    
    /**
     * Adds {@code child} to the end of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     */
    public void append(Widget child) {
        gtk_h.gtk_flow_box_append(handle(), child.handle());
    }
    
    /**
     * Binds {@code model} to {@code box}.
     * <p>
     * If {@code box} was already bound to a model, that previous binding is
     * destroyed.
     * <p>
     * The contents of {@code box} are cleared and then filled with widgets that
     * represent items from {@code model}. {@code box} is updated whenever {@code model} changes.
     * If {@code model} is <code>null</code>, {@code box} is left empty.
     * <p>
     * It is undefined to add or remove widgets directly (for example, with
     * {@link FlowBox#insert}) while {@code box} is bound to a model.
     * <p>
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in {@code GtkFlowBox}. When using a model, filtering and sorting
     * should be implemented by the model.
     */
    public void bindModel(org.gtk.gio.ListModel model, FlowBoxCreateWidgetFunc createWidgetFunc) {
        try {
            gtk_h.gtk_flow_box_bind_model(handle(), model.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFlowBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(createWidgetFunc.hashCode(), createWidgetFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns whether children activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = gtk_h.gtk_flow_box_get_activate_on_single_click(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the nth child in the {@code box}.
     */
    public FlowBoxChild getChildAtIndex(int idx) {
        var RESULT = gtk_h.gtk_flow_box_get_child_at_index(handle(), idx);
        return new FlowBoxChild(References.get(RESULT, false));
    }
    
    /**
     * Gets the child in the (@x, @y) position.
     * <p>
     * Both @x and @y are assumed to be relative to the origin of {@code box}.
     */
    public FlowBoxChild getChildAtPos(int x, int y) {
        var RESULT = gtk_h.gtk_flow_box_get_child_at_pos(handle(), x, y);
        return new FlowBoxChild(References.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal spacing.
     */
    public int getColumnSpacing() {
        var RESULT = gtk_h.gtk_flow_box_get_column_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the box is homogeneous.
     */
    public boolean getHomogeneous() {
        var RESULT = gtk_h.gtk_flow_box_get_homogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the maximum number of children per line.
     */
    public int getMaxChildrenPerLine() {
        var RESULT = gtk_h.gtk_flow_box_get_max_children_per_line(handle());
        return RESULT;
    }
    
    /**
     * Gets the minimum number of children per line.
     */
    public int getMinChildrenPerLine() {
        var RESULT = gtk_h.gtk_flow_box_get_min_children_per_line(handle());
        return RESULT;
    }
    
    /**
     * Gets the vertical spacing.
     */
    public int getRowSpacing() {
        var RESULT = gtk_h.gtk_flow_box_get_row_spacing(handle());
        return RESULT;
    }
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedChildren() {
        var RESULT = gtk_h.gtk_flow_box_get_selected_children(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the selection mode of {@code box}.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = gtk_h.gtk_flow_box_get_selection_mode(handle());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Inserts the {@code widget} into {@code box} at {@code position}.
     * <p>
     * If a sort function is set, the widget will actually be inserted
     * at the calculated position.
     * <p>
     * If {@code position} is -1, or larger than the total number of children
     * in the {@code box}, then the {@code widget} will be appended to the end.
     */
    public void insert(Widget widget, int position) {
        gtk_h.gtk_flow_box_insert(handle(), widget.handle(), position);
    }
    
    /**
     * Updates the filtering for all children.
     * <p>
     * Call this function when the result of the filter
     * function on the {@code box} is changed due ot an external
     * factor. For instance, this would be used if the
     * filter function just looked for a specific search
     * term, and the entry with the string has changed.
     */
    public void invalidateFilter() {
        gtk_h.gtk_flow_box_invalidate_filter(handle());
    }
    
    /**
     * Updates the sorting for all children.
     * <p>
     * Call this when the result of the sort function on
     * {@code box} is changed due to an external factor.
     */
    public void invalidateSort() {
        gtk_h.gtk_flow_box_invalidate_sort(handle());
    }
    
    /**
     * Adds {@code child} to the start of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     */
    public void prepend(Widget child) {
        gtk_h.gtk_flow_box_prepend(handle(), child.handle());
    }
    
    /**
     * Removes a child from {@code box}.
     */
    public void remove(Widget widget) {
        gtk_h.gtk_flow_box_remove(handle(), widget.handle());
    }
    
    /**
     * Select all children of {@code box}, if the selection
     * mode allows it.
     */
    public void selectAll() {
        gtk_h.gtk_flow_box_select_all(handle());
    }
    
    /**
     * Selects a single child of {@code box}, if the selection
     * mode allows it.
     */
    public void selectChild(FlowBoxChild child) {
        gtk_h.gtk_flow_box_select_child(handle(), child.handle());
    }
    
    /**
     * Calls a function for each selected child.
     * <p>
     * Note that the selection cannot be modified from within
     * this function.
     */
    public void selectedForeach(FlowBoxForeachFunc func) {
        try {
            gtk_h.gtk_flow_box_selected_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFlowBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * If {@code single} is <code>true</code>, children will be activated when you click
     * on them, otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        gtk_h.gtk_flow_box_set_activate_on_single_click(handle(), single ? 1 : 0);
    }
    
    /**
     * Sets the horizontal space to add between children.
     */
    public void setColumnSpacing(int spacing) {
        gtk_h.gtk_flow_box_set_column_spacing(handle(), spacing);
    }
    
    /**
     * By setting a filter function on the {@code box} one can decide dynamically
     * which of the children to show.
     * <p>
     * For instance, to implement a search function that only shows the
     * children matching the search terms.
     * <p>
     * The {@code filter_func} will be called for each child after the call, and
     * it will continue to be called each time a child changes (via
     * {@link FlowBoxChild#changed}) or when
     * {@link FlowBox#invalidateFilter} is called.
     * <p>
     * Note that using a filter function is incompatible with using a model
     * (see {@link FlowBox#bindModel}).
     */
    public void setFilterFunc(FlowBoxFilterFunc filterFunc) {
        try {
            gtk_h.gtk_flow_box_set_filter_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFlowBoxFilterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(filterFunc.hashCode(), filterFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Hooks up an adjustment to focus handling in {@code box}.
     * <p>
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See {@link ScrolledWindow#getHadjustment}
     * for a typical way of obtaining the adjustment, and
     * {@link FlowBox#setVadjustment} for setting the vertical
     * adjustment.
     * <p>
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     */
    public void setHadjustment(Adjustment adjustment) {
        gtk_h.gtk_flow_box_set_hadjustment(handle(), adjustment.handle());
    }
    
    /**
     * Sets whether or not all children of {@code box} are given
     * equal space in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        gtk_h.gtk_flow_box_set_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of children to request and
     * allocate space for in {@code box}’s orientation.
     * <p>
     * Setting the maximum number of children per line
     * limits the overall natural size request to be no more
     * than {@code n_children} children long in the given orientation.
     */
    public void setMaxChildrenPerLine(int nChildren) {
        gtk_h.gtk_flow_box_set_max_children_per_line(handle(), nChildren);
    }
    
    /**
     * Sets the minimum number of children to line up
     * in {@code box}’s orientation before flowing.
     */
    public void setMinChildrenPerLine(int nChildren) {
        gtk_h.gtk_flow_box_set_min_children_per_line(handle(), nChildren);
    }
    
    /**
     * Sets the vertical space to add between children.
     */
    public void setRowSpacing(int spacing) {
        gtk_h.gtk_flow_box_set_row_spacing(handle(), spacing);
    }
    
    /**
     * Sets how selection works in {@code box}.
     */
    public void setSelectionMode(SelectionMode mode) {
        gtk_h.gtk_flow_box_set_selection_mode(handle(), mode.getValue());
    }
    
    /**
     * By setting a sort function on the {@code box}, one can dynamically
     * reorder the children of the box, based on the contents of
     * the children.
     * <p>
     * The {@code sort_func} will be called for each child after the call,
     * and will continue to be called each time a child changes (via
     * {@link FlowBoxChild#changed}) and when
     * {@link FlowBox#invalidateSort} is called.
     * <p>
     * Note that using a sort function is incompatible with using a model
     * (see {@link FlowBox#bindModel}).
     */
    public void setSortFunc(FlowBoxSortFunc sortFunc) {
        try {
            gtk_h.gtk_flow_box_set_sort_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFlowBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Hooks up an adjustment to focus handling in {@code box}.
     * <p>
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See {@link ScrolledWindow#getVadjustment}
     * for a typical way of obtaining the adjustment, and
     * {@link FlowBox#setHadjustment} for setting the horizontal
     * adjustment.
     * <p>
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     */
    public void setVadjustment(Adjustment adjustment) {
        gtk_h.gtk_flow_box_set_vadjustment(handle(), adjustment.handle());
    }
    
    /**
     * Unselect all children of {@code box}, if the selection
     * mode allows it.
     */
    public void unselectAll() {
        gtk_h.gtk_flow_box_unselect_all(handle());
    }
    
    /**
     * Unselects a single child of {@code box}, if the selection
     * mode allows it.
     */
    public void unselectChild(FlowBoxChild child) {
        gtk_h.gtk_flow_box_unselect_child(handle(), child.handle());
    }
    
    @FunctionalInterface
    public interface ActivateCursorChildHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted when the user activates the {@code box}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public SignalHandle onActivateCursorChild(ActivateCursorChildHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxActivateCursorChild", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-cursor-child").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChildActivatedHandler {
        void signalReceived(FlowBox source, FlowBoxChild child);
    }
    
    /**
     * Emitted when a child has been activated by the user.
     */
    public SignalHandle onChildActivated(ChildActivatedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxChildActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("child-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        boolean signalReceived(FlowBox source, MovementStep step, int count, boolean extend, boolean modify);
    }
    
    /**
     * Emitted when the user initiates a cursor movement.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     * <p>
     * <ul>
     * <li>&lt;kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd&gt;
     *   move by individual children
     * <li>&lt;kbd>Home</kbd>, <kbd>End</kbd&gt; move to the ends of the box
     * <li>&lt;kbd>PgUp</kbd>, <kbd>PgDn</kbd&gt; move vertically by pages
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to select all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd>Ctrl</kbd>-<kbd>a</kbd&gt;.
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectedChildrenChangedHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted when the set of selected children changes.
     * <p>
     * Use {@link FlowBox#selectedForeach} or
     * {@link FlowBox#getSelectedChildren} to obtain the
     * selected children.
     */
    public SignalHandle onSelectedChildrenChanged(SelectedChildrenChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxSelectedChildrenChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("selected-children-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorChildHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to toggle the selection of the child that has the focus.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd>Ctrl</kbd>-<kbd>Space</kbd&gt;.
     */
    public SignalHandle onToggleCursorChild(ToggleCursorChildHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxToggleCursorChild", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-cursor-child").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to unselect all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd&gt;.
     */
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unselect-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
