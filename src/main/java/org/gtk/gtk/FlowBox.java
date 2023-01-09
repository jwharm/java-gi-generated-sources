package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkFlowBox} uses the {@link AccessibleRole#GRID} role, and {@code GtkFlowBoxChild}
 * uses the {@link AccessibleRole#GRID_CELL} role.
 */
public class FlowBox extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFlowBox";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FlowBox proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FlowBox(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlowBox> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FlowBox(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkFlowBox}.
     */
    public FlowBox() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds {@code child} to the end of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     * @param child the {@code GtkWidget} to add
     */
    public void append(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_flow_box_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Binds {@code model} to {@code box}.
     * <p>
     * If {@code box} was already bound to a model, that previous binding is
     * destroyed.
     * <p>
     * The contents of {@code box} are cleared and then filled with widgets that
     * represent items from {@code model}. {@code box} is updated whenever {@code model} changes.
     * If {@code model} is {@code null}, {@code box} is left empty.
     * <p>
     * It is undefined to add or remove widgets directly (for example, with
     * {@link FlowBox#insert}) while {@code box} is bound to a model.
     * <p>
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in {@code GtkFlowBox}. When using a model, filtering and sorting
     * should be implemented by the model.
     * @param model the {@code GListModel} to be bound to {@code box}
     * @param createWidgetFunc a function that creates widgets for items
     * @param userDataFreeFunc function for freeing {@code user_data}
     */
    public void bindModel(@Nullable org.gtk.gio.ListModel model, org.gtk.gtk.FlowBoxCreateWidgetFunc createWidgetFunc, org.gtk.glib.DestroyNotify userDataFreeFunc) {
        try {
            DowncallHandles.gtk_flow_box_bind_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) createWidgetFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDataFreeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether children activate on single clicks.
     * @return {@code true} if children are activated on single click,
     *   {@code false} otherwise
     */
    public boolean getActivateOnSingleClick() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_activate_on_single_click.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the nth child in the {@code box}.
     * @param idx the position of the child
     * @return the child widget, which will
     *   always be a {@code GtkFlowBoxChild} or {@code null} in case no child widget
     *   with the given index exists.
     */
    public @Nullable org.gtk.gtk.FlowBoxChild getChildAtIndex(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_get_child_at_index.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.FlowBoxChild) Interop.register(RESULT, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the child in the ({@code x}, {@code y}) position.
     * <p>
     * Both {@code x} and {@code y} are assumed to be relative to the origin of {@code box}.
     * @param x the x coordinate of the child
     * @param y the y coordinate of the child
     * @return the child widget, which will
     *   always be a {@code GtkFlowBoxChild} or {@code null} in case no child widget
     *   exists for the given x and y coordinates.
     */
    public @Nullable org.gtk.gtk.FlowBoxChild getChildAtPos(int x, int y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_get_child_at_pos.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.FlowBoxChild) Interop.register(RESULT, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the horizontal spacing.
     * @return the horizontal spacing
     */
    public int getColumnSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_column_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the box is homogeneous.
     * @return {@code true} if the box is homogeneous.
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_homogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the maximum number of children per line.
     * @return the maximum number of children per line
     */
    public int getMaxChildrenPerLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_max_children_per_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the minimum number of children per line.
     * @return the minimum number of children per line
     */
    public int getMinChildrenPerLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_min_children_per_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the vertical spacing.
     * @return the vertical spacing
     */
    public int getRowSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_row_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a list of all selected children.
     * @return A {@code GList} containing the {@code GtkWidget} for each selected child.
     *   Free with g_list_free() when done.
     */
    public org.gtk.glib.List getSelectedChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_get_selected_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the selection mode of {@code box}.
     * @return the {@code GtkSelectionMode}
     */
    public org.gtk.gtk.SelectionMode getSelectionMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_selection_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SelectionMode.of(RESULT);
    }
    
    /**
     * Inserts the {@code widget} into {@code box} at {@code position}.
     * <p>
     * If a sort function is set, the widget will actually be inserted
     * at the calculated position.
     * <p>
     * If {@code position} is -1, or larger than the total number of children
     * in the {@code box}, then the {@code widget} will be appended to the end.
     * @param widget the {@code GtkWidget} to add
     * @param position the position to insert {@code child} in
     */
    public void insert(org.gtk.gtk.Widget widget, int position) {
        try {
            DowncallHandles.gtk_flow_box_insert.invokeExact(
                    handle(),
                    widget.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_flow_box_invalidate_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates the sorting for all children.
     * <p>
     * Call this when the result of the sort function on
     * {@code box} is changed due to an external factor.
     */
    public void invalidateSort() {
        try {
            DowncallHandles.gtk_flow_box_invalidate_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} to the start of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     * @param child the {@code GtkWidget} to add
     */
    public void prepend(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_flow_box_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code box}.
     * @param widget the child widget to remove
     */
    public void remove(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_flow_box_remove.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Select all children of {@code box}, if the selection
     * mode allows it.
     */
    public void selectAll() {
        try {
            DowncallHandles.gtk_flow_box_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects a single child of {@code box}, if the selection
     * mode allows it.
     * @param child a child of {@code box}
     */
    public void selectChild(org.gtk.gtk.FlowBoxChild child) {
        try {
            DowncallHandles.gtk_flow_box_select_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function for each selected child.
     * <p>
     * Note that the selection cannot be modified from within
     * this function.
     * @param func the function to call for each selected child
     */
    public void selectedForeach(org.gtk.gtk.FlowBoxForeachFunc func) {
        try {
            DowncallHandles.gtk_flow_box_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code single} is {@code true}, children will be activated when you click
     * on them, otherwise you need to double-click.
     * @param single {@code true} to emit child-activated on a single click
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            DowncallHandles.gtk_flow_box_set_activate_on_single_click.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(single, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal space to add between children.
     * @param spacing the spacing to use
     */
    public void setColumnSpacing(int spacing) {
        try {
            DowncallHandles.gtk_flow_box_set_column_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param filterFunc callback that
     *   lets you filter which children to show
     * @param destroy destroy notifier for {@code user_data}
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.FlowBoxFilterFunc filterFunc, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_flow_box_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : (Addressable) filterFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param adjustment an adjustment which should be adjusted
     *    when the focus is moved among the descendents of {@code container}
     */
    public void setHadjustment(org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_flow_box_set_hadjustment.invokeExact(
                    handle(),
                    adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether or not all children of {@code box} are given
     * equal space in the box.
     * @param homogeneous {@code true} to create equal allotments,
     *   {@code false} for variable allotments
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_flow_box_set_homogeneous.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(homogeneous, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum number of children to request and
     * allocate space for in {@code box}’s orientation.
     * <p>
     * Setting the maximum number of children per line
     * limits the overall natural size request to be no more
     * than {@code n_children} children long in the given orientation.
     * @param nChildren the maximum number of children per line
     */
    public void setMaxChildrenPerLine(int nChildren) {
        try {
            DowncallHandles.gtk_flow_box_set_max_children_per_line.invokeExact(
                    handle(),
                    nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum number of children to line up
     * in {@code box}’s orientation before flowing.
     * @param nChildren the minimum number of children per line
     */
    public void setMinChildrenPerLine(int nChildren) {
        try {
            DowncallHandles.gtk_flow_box_set_min_children_per_line.invokeExact(
                    handle(),
                    nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical space to add between children.
     * @param spacing the spacing to use
     */
    public void setRowSpacing(int spacing) {
        try {
            DowncallHandles.gtk_flow_box_set_row_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how selection works in {@code box}.
     * @param mode the new selection mode
     */
    public void setSelectionMode(org.gtk.gtk.SelectionMode mode) {
        try {
            DowncallHandles.gtk_flow_box_set_selection_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param sortFunc the sort function
     * @param destroy destroy notifier for {@code user_data}
     */
    public void setSortFunc(@Nullable org.gtk.gtk.FlowBoxSortFunc sortFunc, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_flow_box_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) sortFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param adjustment an adjustment which should be adjusted
     *    when the focus is moved among the descendents of {@code container}
     */
    public void setVadjustment(org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_flow_box_set_vadjustment.invokeExact(
                    handle(),
                    adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselect all children of {@code box}, if the selection
     * mode allows it.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_flow_box_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects a single child of {@code box}, if the selection
     * mode allows it.
     * @param child a child of {@code box}
     */
    public void unselectChild(org.gtk.gtk.FlowBoxChild child) {
        try {
            DowncallHandles.gtk_flow_box_unselect_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_flow_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCursorChild} callback.
     */
    @FunctionalInterface
    public interface ActivateCursorChild {
    
        /**
         * Emitted when the user activates the {@code box}.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCursorChild.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user activates the {@code box}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.ActivateCursorChild> onActivateCursorChild(FlowBox.ActivateCursorChild handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-cursor-child", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChildActivated} callback.
     */
    @FunctionalInterface
    public interface ChildActivated {
    
        /**
         * Emitted when a child has been activated by the user.
         */
        void run(org.gtk.gtk.FlowBoxChild child);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox, MemoryAddress child) {
            run((org.gtk.gtk.FlowBoxChild) Interop.register(child, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChildActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a child has been activated by the user.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.ChildActivated> onChildActivated(FlowBox.ChildActivated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("child-activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursor} callback.
     */
    @FunctionalInterface
    public interface MoveCursor {
    
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
         * <ul>
         * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
         *   move by individual children
         * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the box
         * <li>&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
         * </ul>
         */
        boolean run(org.gtk.gtk.MovementStep step, int count, boolean extend, boolean modify);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceFlowBox, int step, int count, int extend, int modify) {
            var RESULT = run(org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extend, null).booleanValue(), Marshal.integerToBoolean.marshal(modify, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * <ul>
     * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
     *   move by individual children
     * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the box
     * <li>&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
     * </ul>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.MoveCursor> onMoveCursor(FlowBox.MoveCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectAll} callback.
     */
    @FunctionalInterface
    public interface SelectAll {
    
        /**
         * Emitted to select all children of the box,
         * if the selection mode permits it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectAll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to select all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.SelectAll> onSelectAll(FlowBox.SelectAll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-all", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectedChildrenChanged} callback.
     */
    @FunctionalInterface
    public interface SelectedChildrenChanged {
    
        /**
         * Emitted when the set of selected children changes.
         * <p>
         * Use {@link FlowBox#selectedForeach} or
         * {@link FlowBox#getSelectedChildren} to obtain the
         * selected children.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectedChildrenChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the set of selected children changes.
     * <p>
     * Use {@link FlowBox#selectedForeach} or
     * {@link FlowBox#getSelectedChildren} to obtain the
     * selected children.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.SelectedChildrenChanged> onSelectedChildrenChanged(FlowBox.SelectedChildrenChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("selected-children-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleCursorChild} callback.
     */
    @FunctionalInterface
    public interface ToggleCursorChild {
    
        /**
         * Emitted to toggle the selection of the child that has the focus.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Space&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleCursorChild.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to toggle the selection of the child that has the focus.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Space&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.ToggleCursorChild> onToggleCursorChild(FlowBox.ToggleCursorChild handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-cursor-child", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnselectAll} callback.
     */
    @FunctionalInterface
    public interface UnselectAll {
    
        /**
         * Emitted to unselect all children of the box,
         * if the selection mode permits it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnselectAll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to unselect all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBox.UnselectAll> onUnselectAll(FlowBox.UnselectAll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unselect-all", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FlowBox.Builder} object constructs a {@link FlowBox} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FlowBox.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FlowBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FlowBox}.
         * @return A new instance of {@code FlowBox} with the properties 
         *         that were set in the Builder object.
         */
        public FlowBox build() {
            return (FlowBox) org.gtk.gobject.GObject.newWithProperties(
                FlowBox.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAcceptUnpairedRelease(boolean acceptUnpairedRelease) {
            names.add("accept-unpaired-release");
            values.add(org.gtk.gobject.Value.create(acceptUnpairedRelease));
            return this;
        }
        
        /**
         * Determines whether children can be activated with a single
         * click, or require a double-click.
         * @param activateOnSingleClick The value for the {@code activate-on-single-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivateOnSingleClick(boolean activateOnSingleClick) {
            names.add("activate-on-single-click");
            values.add(org.gtk.gobject.Value.create(activateOnSingleClick));
            return this;
        }
        
        /**
         * The amount of horizontal space between two children.
         * @param columnSpacing The value for the {@code column-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColumnSpacing(int columnSpacing) {
            names.add("column-spacing");
            values.add(org.gtk.gobject.Value.create(columnSpacing));
            return this;
        }
        
        /**
         * Determines whether all children should be allocated the
         * same size.
         * @param homogeneous The value for the {@code homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHomogeneous(boolean homogeneous) {
            names.add("homogeneous");
            values.add(org.gtk.gobject.Value.create(homogeneous));
            return this;
        }
        
        /**
         * The maximum amount of children to request space for consecutively
         * in the given orientation.
         * @param maxChildrenPerLine The value for the {@code max-children-per-line} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxChildrenPerLine(int maxChildrenPerLine) {
            names.add("max-children-per-line");
            values.add(org.gtk.gobject.Value.create(maxChildrenPerLine));
            return this;
        }
        
        /**
         * The minimum number of children to allocate consecutively
         * in the given orientation.
         * <p>
         * Setting the minimum children per line ensures
         * that a reasonably small height will be requested
         * for the overall minimum width of the box.
         * @param minChildrenPerLine The value for the {@code min-children-per-line} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinChildrenPerLine(int minChildrenPerLine) {
            names.add("min-children-per-line");
            values.add(org.gtk.gobject.Value.create(minChildrenPerLine));
            return this;
        }
        
        /**
         * The amount of vertical space between two children.
         * @param rowSpacing The value for the {@code row-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRowSpacing(int rowSpacing) {
            names.add("row-spacing");
            values.add(org.gtk.gobject.Value.create(rowSpacing));
            return this;
        }
        
        /**
         * The selection mode used by the flow box.
         * @param selectionMode The value for the {@code selection-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectionMode(org.gtk.gtk.SelectionMode selectionMode) {
            names.add("selection-mode");
            values.add(org.gtk.gobject.Value.create(selectionMode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_flow_box_new = Interop.downcallHandle(
                "gtk_flow_box_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_append = Interop.downcallHandle(
                "gtk_flow_box_append",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_bind_model = Interop.downcallHandle(
                "gtk_flow_box_bind_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_activate_on_single_click = Interop.downcallHandle(
                "gtk_flow_box_get_activate_on_single_click",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_child_at_index = Interop.downcallHandle(
                "gtk_flow_box_get_child_at_index",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_child_at_pos = Interop.downcallHandle(
                "gtk_flow_box_get_child_at_pos",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_column_spacing = Interop.downcallHandle(
                "gtk_flow_box_get_column_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_homogeneous = Interop.downcallHandle(
                "gtk_flow_box_get_homogeneous",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_max_children_per_line = Interop.downcallHandle(
                "gtk_flow_box_get_max_children_per_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_min_children_per_line = Interop.downcallHandle(
                "gtk_flow_box_get_min_children_per_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_row_spacing = Interop.downcallHandle(
                "gtk_flow_box_get_row_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_selected_children = Interop.downcallHandle(
                "gtk_flow_box_get_selected_children",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_selection_mode = Interop.downcallHandle(
                "gtk_flow_box_get_selection_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_insert = Interop.downcallHandle(
                "gtk_flow_box_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_invalidate_filter = Interop.downcallHandle(
                "gtk_flow_box_invalidate_filter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_invalidate_sort = Interop.downcallHandle(
                "gtk_flow_box_invalidate_sort",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_prepend = Interop.downcallHandle(
                "gtk_flow_box_prepend",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_remove = Interop.downcallHandle(
                "gtk_flow_box_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_select_all = Interop.downcallHandle(
                "gtk_flow_box_select_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_select_child = Interop.downcallHandle(
                "gtk_flow_box_select_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_selected_foreach = Interop.downcallHandle(
                "gtk_flow_box_selected_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_activate_on_single_click = Interop.downcallHandle(
                "gtk_flow_box_set_activate_on_single_click",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_column_spacing = Interop.downcallHandle(
                "gtk_flow_box_set_column_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_filter_func = Interop.downcallHandle(
                "gtk_flow_box_set_filter_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_hadjustment = Interop.downcallHandle(
                "gtk_flow_box_set_hadjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_homogeneous = Interop.downcallHandle(
                "gtk_flow_box_set_homogeneous",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_max_children_per_line = Interop.downcallHandle(
                "gtk_flow_box_set_max_children_per_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_min_children_per_line = Interop.downcallHandle(
                "gtk_flow_box_set_min_children_per_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_row_spacing = Interop.downcallHandle(
                "gtk_flow_box_set_row_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_selection_mode = Interop.downcallHandle(
                "gtk_flow_box_set_selection_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_sort_func = Interop.downcallHandle(
                "gtk_flow_box_set_sort_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_set_vadjustment = Interop.downcallHandle(
                "gtk_flow_box_set_vadjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_unselect_all = Interop.downcallHandle(
                "gtk_flow_box_unselect_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_unselect_child = Interop.downcallHandle(
                "gtk_flow_box_unselect_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_flow_box_get_type = Interop.downcallHandle(
                "gtk_flow_box_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_flow_box_get_type != null;
    }
}
