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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public FlowBox(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FlowBox if its GType is a (or inherits from) "GtkFlowBox".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FlowBox" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFlowBox", a ClassCastException will be thrown.
     */
    public static FlowBox castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFlowBox"))) {
            return new FlowBox(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFlowBox");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_flow_box_new.invokeExact(), false);
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
    public void append(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
     */
    public void bindModel(@Nullable org.gtk.gio.ListModel model, @NotNull org.gtk.gtk.FlowBoxCreateWidgetFunc createWidgetFunc) {
        java.util.Objects.requireNonNull(createWidgetFunc, "Parameter 'createWidgetFunc' must not be null");
        try {
            DowncallHandles.gtk_flow_box_bind_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFlowBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(createWidgetFunc)),
                    Interop.cbDestroyNotifySymbol());
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
            RESULT = (int) DowncallHandles.gtk_flow_box_get_activate_on_single_click.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        return new org.gtk.gtk.FlowBoxChild(Refcounted.get(RESULT, false));
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
        return new org.gtk.gtk.FlowBoxChild(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal spacing.
     * @return the horizontal spacing
     */
    public int getColumnSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_column_spacing.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_flow_box_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the maximum number of children per line.
     * @return the maximum number of children per line
     */
    public int getMaxChildrenPerLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_max_children_per_line.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_flow_box_get_min_children_per_line.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_flow_box_get_row_spacing.invokeExact(
                    handle());
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
    public @NotNull org.gtk.glib.List getSelectedChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_get_selected_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the selection mode of {@code box}.
     * @return the {@code GtkSelectionMode}
     */
    public @NotNull org.gtk.gtk.SelectionMode getSelectionMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_get_selection_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionMode(RESULT);
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
    public void insert(@NotNull org.gtk.gtk.Widget widget, int position) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
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
            DowncallHandles.gtk_flow_box_invalidate_filter.invokeExact(
                    handle());
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
            DowncallHandles.gtk_flow_box_invalidate_sort.invokeExact(
                    handle());
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
    public void prepend(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public void remove(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
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
            DowncallHandles.gtk_flow_box_select_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects a single child of {@code box}, if the selection
     * mode allows it.
     * @param child a child of {@code box}
     */
    public void selectChild(@NotNull org.gtk.gtk.FlowBoxChild child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public void selectedForeach(@NotNull org.gtk.gtk.FlowBoxForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_flow_box_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFlowBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
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
                    single ? 1 : 0);
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
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.FlowBoxFilterFunc filterFunc) {
        try {
            DowncallHandles.gtk_flow_box_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFlowBoxFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : Interop.registerCallback(filterFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    public void setHadjustment(@NotNull org.gtk.gtk.Adjustment adjustment) {
        java.util.Objects.requireNonNull(adjustment, "Parameter 'adjustment' must not be null");
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
                    homogeneous ? 1 : 0);
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
    public void setSelectionMode(@NotNull org.gtk.gtk.SelectionMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
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
     */
    public void setSortFunc(@Nullable org.gtk.gtk.FlowBoxSortFunc sortFunc) {
        try {
            DowncallHandles.gtk_flow_box_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbFlowBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    public void setVadjustment(@NotNull org.gtk.gtk.Adjustment adjustment) {
        java.util.Objects.requireNonNull(adjustment, "Parameter 'adjustment' must not be null");
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
            DowncallHandles.gtk_flow_box_unselect_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects a single child of {@code box}, if the selection
     * mode allows it.
     * @param child a child of {@code box}
     */
    public void unselectChild(@NotNull org.gtk.gtk.FlowBoxChild child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_flow_box_unselect_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateCursorChild {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted when the user activates the {@code box}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public Signal<FlowBox.ActivateCursorChild> onActivateCursorChild(FlowBox.ActivateCursorChild handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-child"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxActivateCursorChild",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.ActivateCursorChild>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChildActivated {
        void signalReceived(FlowBox source, @NotNull org.gtk.gtk.FlowBoxChild child);
    }
    
    /**
     * Emitted when a child has been activated by the user.
     */
    public Signal<FlowBox.ChildActivated> onChildActivated(FlowBox.ChildActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("child-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxChildActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.ChildActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        boolean signalReceived(FlowBox source, @NotNull org.gtk.gtk.MovementStep step, int count, boolean extend, boolean modify);
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
     */
    public Signal<FlowBox.MoveCursor> onMoveCursor(FlowBox.MoveCursor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxMoveCursor",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.MoveCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAll {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to select all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     */
    public Signal<FlowBox.SelectAll> onSelectAll(FlowBox.SelectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.SelectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectedChildrenChanged {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted when the set of selected children changes.
     * <p>
     * Use {@link FlowBox#selectedForeach} or
     * {@link FlowBox#getSelectedChildren} to obtain the
     * selected children.
     */
    public Signal<FlowBox.SelectedChildrenChanged> onSelectedChildrenChanged(FlowBox.SelectedChildrenChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selected-children-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxSelectedChildrenChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.SelectedChildrenChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorChild {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to toggle the selection of the child that has the focus.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Space&lt;/kbd&gt;.
     */
    public Signal<FlowBox.ToggleCursorChild> onToggleCursorChild(FlowBox.ToggleCursorChild handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-child"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxToggleCursorChild",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.ToggleCursorChild>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAll {
        void signalReceived(FlowBox source);
    }
    
    /**
     * Emitted to unselect all children of the box,
     * if the selection mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     */
    public Signal<FlowBox.UnselectAll> onUnselectAll(FlowBox.UnselectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FlowBox.UnselectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_flow_box_new = Interop.downcallHandle(
            "gtk_flow_box_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_append = Interop.downcallHandle(
            "gtk_flow_box_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_bind_model = Interop.downcallHandle(
            "gtk_flow_box_bind_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_activate_on_single_click = Interop.downcallHandle(
            "gtk_flow_box_get_activate_on_single_click",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_child_at_index = Interop.downcallHandle(
            "gtk_flow_box_get_child_at_index",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_get_child_at_pos = Interop.downcallHandle(
            "gtk_flow_box_get_child_at_pos",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_get_column_spacing = Interop.downcallHandle(
            "gtk_flow_box_get_column_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_homogeneous = Interop.downcallHandle(
            "gtk_flow_box_get_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_max_children_per_line = Interop.downcallHandle(
            "gtk_flow_box_get_max_children_per_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_min_children_per_line = Interop.downcallHandle(
            "gtk_flow_box_get_min_children_per_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_row_spacing = Interop.downcallHandle(
            "gtk_flow_box_get_row_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_selected_children = Interop.downcallHandle(
            "gtk_flow_box_get_selected_children",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_get_selection_mode = Interop.downcallHandle(
            "gtk_flow_box_get_selection_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_insert = Interop.downcallHandle(
            "gtk_flow_box_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_invalidate_filter = Interop.downcallHandle(
            "gtk_flow_box_invalidate_filter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_invalidate_sort = Interop.downcallHandle(
            "gtk_flow_box_invalidate_sort",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_prepend = Interop.downcallHandle(
            "gtk_flow_box_prepend",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_remove = Interop.downcallHandle(
            "gtk_flow_box_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_select_all = Interop.downcallHandle(
            "gtk_flow_box_select_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_select_child = Interop.downcallHandle(
            "gtk_flow_box_select_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_selected_foreach = Interop.downcallHandle(
            "gtk_flow_box_selected_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_set_activate_on_single_click = Interop.downcallHandle(
            "gtk_flow_box_set_activate_on_single_click",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_column_spacing = Interop.downcallHandle(
            "gtk_flow_box_set_column_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_filter_func = Interop.downcallHandle(
            "gtk_flow_box_set_filter_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_set_hadjustment = Interop.downcallHandle(
            "gtk_flow_box_set_hadjustment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_set_homogeneous = Interop.downcallHandle(
            "gtk_flow_box_set_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_max_children_per_line = Interop.downcallHandle(
            "gtk_flow_box_set_max_children_per_line",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_min_children_per_line = Interop.downcallHandle(
            "gtk_flow_box_set_min_children_per_line",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_row_spacing = Interop.downcallHandle(
            "gtk_flow_box_set_row_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_selection_mode = Interop.downcallHandle(
            "gtk_flow_box_set_selection_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flow_box_set_sort_func = Interop.downcallHandle(
            "gtk_flow_box_set_sort_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_set_vadjustment = Interop.downcallHandle(
            "gtk_flow_box_set_vadjustment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_unselect_all = Interop.downcallHandle(
            "gtk_flow_box_unselect_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flow_box_unselect_child = Interop.downcallHandle(
            "gtk_flow_box_unselect_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalFlowBoxActivateCursorChild(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.ActivateCursorChild) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxChildActivated(MemoryAddress source, MemoryAddress child, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.ChildActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)), new org.gtk.gtk.FlowBoxChild(Refcounted.get(child, false)));
        }
        
        public static boolean signalFlowBoxMoveCursor(MemoryAddress source, int step, int count, int extend, int modify, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.MoveCursor) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new FlowBox(Refcounted.get(source)), new org.gtk.gtk.MovementStep(step), count, extend != 0, modify != 0);
        }
        
        public static void signalFlowBoxSelectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.SelectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxSelectedChildrenChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.SelectedChildrenChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxToggleCursorChild(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.ToggleCursorChild) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FlowBox.UnselectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FlowBox(Refcounted.get(source)));
        }
    }
}
