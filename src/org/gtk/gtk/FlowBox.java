package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkFlowBox` puts child widgets in reflowing grid.
 * 
 * For instance, with the horizontal orientation, the widgets will be
 * arranged from left to right, starting a new row under the previous
 * row when necessary. Reducing the width in this case will require more
 * rows, so a larger height will be requested.
 * 
 * Likewise, with the vertical orientation, the widgets will be arranged
 * from top to bottom, starting a new column to the right when necessary.
 * Reducing the height will require more columns, so a larger width will
 * be requested.
 * 
 * The size request of a `GtkFlowBox` alone may not be what you expect;
 * if you need to be able to shrink it along both axes and dynamically
 * reflow its children, you may have to wrap it in a `GtkScrolledWindow`
 * to enable that.
 * 
 * The children of a `GtkFlowBox` can be dynamically sorted and filtered.
 * 
 * Although a `GtkFlowBox` must have only `GtkFlowBoxChild` children, you
 * can add any kind of widget to it via [method@Gtk.FlowBox.insert], and a
 * `GtkFlowBoxChild` widget will automatically be inserted between the box
 * and the widget.
 * 
 * Also see [class@Gtk.ListBox].
 * 
 * # CSS nodes
 * 
 * ```
 * flowbox
 * ├── flowboxchild
 * │   ╰── <child>
 * ├── flowboxchild
 * │   ╰── <child>
 * ┊
 * ╰── [rubberband]
 * ```
 * 
 * `GtkFlowBox` uses a single CSS node with name flowbox. `GtkFlowBoxChild`
 * uses a single CSS node with name flowboxchild. For rubberband selection,
 * a subnode with name rubberband is used.
 * 
 * # Accessibility
 * 
 * `GtkFlowBox` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and `GtkFlowBoxChild`
 * uses the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 */
public class FlowBox extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public FlowBox(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FlowBox */
    public static FlowBox castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBox(gobject.getReference());
    }
    
    /**
     * Creates a `GtkFlowBox`.
     */
    public FlowBox() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_new(), false));
    }
    
    /**
     * Adds @child to the end of @self.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * 
     * See also: [method@Gtk.FlowBox.insert].
     */
    public void append(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_append(HANDLE(), child.HANDLE());
    }
    
    /**
     * Returns whether children activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_activate_on_single_click(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the nth child in the @box.
     */
    public FlowBoxChild getChildAtIndex(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_child_at_index(HANDLE(), idx);
        return new FlowBoxChild(References.get(RESULT, false));
    }
    
    /**
     * Gets the child in the (@x, @y) position.
     * 
     * Both @x and @y are assumed to be relative to the origin of @box.
     */
    public FlowBoxChild getChildAtPos(int x, int y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_child_at_pos(HANDLE(), x, y);
        return new FlowBoxChild(References.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal spacing.
     */
    public int getColumnSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_column_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether the box is homogeneous.
     */
    public boolean getHomogeneous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_homogeneous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the maximum number of children per line.
     */
    public int getMaxChildrenPerLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_max_children_per_line(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the minimum number of children per line.
     */
    public int getMinChildrenPerLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_min_children_per_line(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the vertical spacing.
     */
    public int getRowSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_row_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_selected_children(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the selection mode of @box.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_get_selection_mode(HANDLE());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Inserts the @widget into @box at @position.
     * 
     * If a sort function is set, the widget will actually be inserted
     * at the calculated position.
     * 
     * If @position is -1, or larger than the total number of children
     * in the @box, then the @widget will be appended to the end.
     */
    public void insert(Widget widget, int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_insert(HANDLE(), widget.HANDLE(), position);
    }
    
    /**
     * Updates the filtering for all children.
     * 
     * Call this function when the result of the filter
     * function on the @box is changed due ot an external
     * factor. For instance, this would be used if the
     * filter function just looked for a specific search
     * term, and the entry with the string has changed.
     */
    public void invalidateFilter() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_invalidate_filter(HANDLE());
    }
    
    /**
     * Updates the sorting for all children.
     * 
     * Call this when the result of the sort function on
     * @box is changed due to an external factor.
     */
    public void invalidateSort() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_invalidate_sort(HANDLE());
    }
    
    /**
     * Adds @child to the start of @self.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * 
     * See also: [method@Gtk.FlowBox.insert].
     */
    public void prepend(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_prepend(HANDLE(), child.HANDLE());
    }
    
    /**
     * Removes a child from @box.
     */
    public void remove(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_remove(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Select all children of @box, if the selection
     * mode allows it.
     */
    public void selectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_select_all(HANDLE());
    }
    
    /**
     * Selects a single child of @box, if the selection
     * mode allows it.
     */
    public void selectChild(FlowBoxChild child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_select_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * If @single is %TRUE, children will be activated when you click
     * on them, otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_activate_on_single_click(HANDLE(), single ? 1 : 0);
    }
    
    /**
     * Sets the horizontal space to add between children.
     */
    public void setColumnSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_column_spacing(HANDLE(), spacing);
    }
    
    /**
     * Hooks up an adjustment to focus handling in @box.
     * 
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See [method@Gtk.ScrolledWindow.get_hadjustment]
     * for a typical way of obtaining the adjustment, and
     * [method@Gtk.FlowBox.set_vadjustment] for setting the vertical
     * adjustment.
     * 
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     */
    public void setHadjustment(Adjustment adjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_hadjustment(HANDLE(), adjustment.HANDLE());
    }
    
    /**
     * Sets whether or not all children of @box are given
     * equal space in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_homogeneous(HANDLE(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of children to request and
     * allocate space for in @box’s orientation.
     * 
     * Setting the maximum number of children per line
     * limits the overall natural size request to be no more
     * than @n_children children long in the given orientation.
     */
    public void setMaxChildrenPerLine(int nChildren) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_max_children_per_line(HANDLE(), nChildren);
    }
    
    /**
     * Sets the minimum number of children to line up
     * in @box’s orientation before flowing.
     */
    public void setMinChildrenPerLine(int nChildren) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_min_children_per_line(HANDLE(), nChildren);
    }
    
    /**
     * Sets the vertical space to add between children.
     */
    public void setRowSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_row_spacing(HANDLE(), spacing);
    }
    
    /**
     * Sets how selection works in @box.
     */
    public void setSelectionMode(SelectionMode mode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_selection_mode(HANDLE(), mode.getValue());
    }
    
    /**
     * Hooks up an adjustment to focus handling in @box.
     * 
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See [method@Gtk.ScrolledWindow.get_vadjustment]
     * for a typical way of obtaining the adjustment, and
     * [method@Gtk.FlowBox.set_hadjustment] for setting the horizontal
     * adjustment.
     * 
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     */
    public void setVadjustment(Adjustment adjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_set_vadjustment(HANDLE(), adjustment.HANDLE());
    }
    
    /**
     * Unselect all children of @box, if the selection
     * mode allows it.
     */
    public void unselectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_unselect_all(HANDLE());
    }
    
    /**
     * Unselects a single child of @box, if the selection
     * mode allows it.
     */
    public void unselectChild(FlowBoxChild child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flow_box_unselect_child(HANDLE(), child.HANDLE());
    }
    
    @FunctionalInterface
    public interface ActivateCursorChildHandler {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted when the user activates the @box.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     */
    public void onActivateCursorChild(ActivateCursorChildHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxActivateCursorChild", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate-cursor-child").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onChildActivated(ChildActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxChildActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("child-activated").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     * 
     * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd>
     *   move by individual children
     * - <kbd>Home</kbd>, <kbd>End</kbd> move to the ends of the box
     * - <kbd>PgUp</kbd>, <kbd>PgDn</kbd> move vertically by pages
     */
    public void onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("move-cursor").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
     */
    public void onSelectAll(SelectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("select-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * Use [method@Gtk.FlowBox.selected_foreach] or
     * [method@Gtk.FlowBox.get_selected_children] to obtain the
     * selected children.
     */
    public void onSelectedChildrenChanged(SelectedChildrenChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxSelectedChildrenChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("selected-children-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>Space</kbd>.
     */
    public void onToggleCursorChild(ToggleCursorChildHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxToggleCursorChild", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("toggle-cursor-child").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
     */
    public void onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFlowBoxUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("unselect-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
