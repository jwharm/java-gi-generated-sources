package org.gtk.gtk;

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

    public FlowBox(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FlowBox */
    public static FlowBox castFrom(org.gtk.gobject.Object gobject) {
        return new FlowBox(gobject.refcounted());
    }
    
    static final MethodHandle gtk_flow_box_new = Interop.downcallHandle(
        "gtk_flow_box_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_flow_box_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkFlowBox}.
     */
    public FlowBox() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_flow_box_append = Interop.downcallHandle(
        "gtk_flow_box_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to the end of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     */
    public void append(Widget child) {
        try {
            gtk_flow_box_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_bind_model = Interop.downcallHandle(
        "gtk_flow_box_bind_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void bindModel(org.gtk.gio.ListModel model, FlowBoxCreateWidgetFunc createWidgetFunc) {
        try {
            gtk_flow_box_bind_model.invokeExact(handle(), model.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFlowBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(createWidgetFunc.hashCode(), createWidgetFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_activate_on_single_click = Interop.downcallHandle(
        "gtk_flow_box_get_activate_on_single_click",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether children activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        try {
            var RESULT = (int) gtk_flow_box_get_activate_on_single_click.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_child_at_index = Interop.downcallHandle(
        "gtk_flow_box_get_child_at_index",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the nth child in the {@code box}.
     */
    public FlowBoxChild getChildAtIndex(int idx) {
        try {
            var RESULT = (MemoryAddress) gtk_flow_box_get_child_at_index.invokeExact(handle(), idx);
            return new FlowBoxChild(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_child_at_pos = Interop.downcallHandle(
        "gtk_flow_box_get_child_at_pos",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the child in the (@x, @y) position.
     * <p>
     * Both @x and @y are assumed to be relative to the origin of {@code box}.
     */
    public FlowBoxChild getChildAtPos(int x, int y) {
        try {
            var RESULT = (MemoryAddress) gtk_flow_box_get_child_at_pos.invokeExact(handle(), x, y);
            return new FlowBoxChild(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_column_spacing = Interop.downcallHandle(
        "gtk_flow_box_get_column_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the horizontal spacing.
     */
    public int getColumnSpacing() {
        try {
            var RESULT = (int) gtk_flow_box_get_column_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_homogeneous = Interop.downcallHandle(
        "gtk_flow_box_get_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the box is homogeneous.
     */
    public boolean getHomogeneous() {
        try {
            var RESULT = (int) gtk_flow_box_get_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_max_children_per_line = Interop.downcallHandle(
        "gtk_flow_box_get_max_children_per_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum number of children per line.
     */
    public int getMaxChildrenPerLine() {
        try {
            var RESULT = (int) gtk_flow_box_get_max_children_per_line.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_min_children_per_line = Interop.downcallHandle(
        "gtk_flow_box_get_min_children_per_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the minimum number of children per line.
     */
    public int getMinChildrenPerLine() {
        try {
            var RESULT = (int) gtk_flow_box_get_min_children_per_line.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_row_spacing = Interop.downcallHandle(
        "gtk_flow_box_get_row_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the vertical spacing.
     */
    public int getRowSpacing() {
        try {
            var RESULT = (int) gtk_flow_box_get_row_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_selected_children = Interop.downcallHandle(
        "gtk_flow_box_get_selected_children",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedChildren() {
        try {
            var RESULT = (MemoryAddress) gtk_flow_box_get_selected_children.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_get_selection_mode = Interop.downcallHandle(
        "gtk_flow_box_get_selection_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selection mode of {@code box}.
     */
    public SelectionMode getSelectionMode() {
        try {
            var RESULT = (int) gtk_flow_box_get_selection_mode.invokeExact(handle());
            return new SelectionMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_insert = Interop.downcallHandle(
        "gtk_flow_box_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_flow_box_insert.invokeExact(handle(), widget.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_invalidate_filter = Interop.downcallHandle(
        "gtk_flow_box_invalidate_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            gtk_flow_box_invalidate_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_invalidate_sort = Interop.downcallHandle(
        "gtk_flow_box_invalidate_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Updates the sorting for all children.
     * <p>
     * Call this when the result of the sort function on
     * {@code box} is changed due to an external factor.
     */
    public void invalidateSort() {
        try {
            gtk_flow_box_invalidate_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_prepend = Interop.downcallHandle(
        "gtk_flow_box_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} to the start of {@code self}.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * <p>
     * See also: {@link FlowBox#insert}.
     */
    public void prepend(Widget child) {
        try {
            gtk_flow_box_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_remove = Interop.downcallHandle(
        "gtk_flow_box_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code box}.
     */
    public void remove(Widget widget) {
        try {
            gtk_flow_box_remove.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_select_all = Interop.downcallHandle(
        "gtk_flow_box_select_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Select all children of {@code box}, if the selection
     * mode allows it.
     */
    public void selectAll() {
        try {
            gtk_flow_box_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_select_child = Interop.downcallHandle(
        "gtk_flow_box_select_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects a single child of {@code box}, if the selection
     * mode allows it.
     */
    public void selectChild(FlowBoxChild child) {
        try {
            gtk_flow_box_select_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_selected_foreach = Interop.downcallHandle(
        "gtk_flow_box_selected_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each selected child.
     * <p>
     * Note that the selection cannot be modified from within
     * this function.
     */
    public void selectedForeach(FlowBoxForeachFunc func) {
        try {
            gtk_flow_box_selected_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFlowBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_activate_on_single_click = Interop.downcallHandle(
        "gtk_flow_box_set_activate_on_single_click",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code single} is {@code true}, children will be activated when you click
     * on them, otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            gtk_flow_box_set_activate_on_single_click.invokeExact(handle(), single ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_column_spacing = Interop.downcallHandle(
        "gtk_flow_box_set_column_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the horizontal space to add between children.
     */
    public void setColumnSpacing(int spacing) {
        try {
            gtk_flow_box_set_column_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_filter_func = Interop.downcallHandle(
        "gtk_flow_box_set_filter_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_flow_box_set_filter_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFlowBoxFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(filterFunc.hashCode(), filterFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_hadjustment = Interop.downcallHandle(
        "gtk_flow_box_set_hadjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_flow_box_set_hadjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_homogeneous = Interop.downcallHandle(
        "gtk_flow_box_set_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether or not all children of {@code box} are given
     * equal space in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            gtk_flow_box_set_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_max_children_per_line = Interop.downcallHandle(
        "gtk_flow_box_set_max_children_per_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum number of children to request and
     * allocate space for in {@code box}’s orientation.
     * <p>
     * Setting the maximum number of children per line
     * limits the overall natural size request to be no more
     * than {@code n_children} children long in the given orientation.
     */
    public void setMaxChildrenPerLine(int nChildren) {
        try {
            gtk_flow_box_set_max_children_per_line.invokeExact(handle(), nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_min_children_per_line = Interop.downcallHandle(
        "gtk_flow_box_set_min_children_per_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the minimum number of children to line up
     * in {@code box}’s orientation before flowing.
     */
    public void setMinChildrenPerLine(int nChildren) {
        try {
            gtk_flow_box_set_min_children_per_line.invokeExact(handle(), nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_row_spacing = Interop.downcallHandle(
        "gtk_flow_box_set_row_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the vertical space to add between children.
     */
    public void setRowSpacing(int spacing) {
        try {
            gtk_flow_box_set_row_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_selection_mode = Interop.downcallHandle(
        "gtk_flow_box_set_selection_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets how selection works in {@code box}.
     */
    public void setSelectionMode(SelectionMode mode) {
        try {
            gtk_flow_box_set_selection_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_sort_func = Interop.downcallHandle(
        "gtk_flow_box_set_sort_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_flow_box_set_sort_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbFlowBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_set_vadjustment = Interop.downcallHandle(
        "gtk_flow_box_set_vadjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gtk_flow_box_set_vadjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_unselect_all = Interop.downcallHandle(
        "gtk_flow_box_unselect_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unselect all children of {@code box}, if the selection
     * mode allows it.
     */
    public void unselectAll() {
        try {
            gtk_flow_box_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_flow_box_unselect_child = Interop.downcallHandle(
        "gtk_flow_box_unselect_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects a single child of {@code box}, if the selection
     * mode allows it.
     */
    public void unselectChild(FlowBoxChild child) {
        try {
            gtk_flow_box_unselect_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-child").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxActivateCursorChild",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("child-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxChildActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxMoveCursor",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selected-children-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxSelectedChildrenChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-child").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxToggleCursorChild",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FlowBox.Callbacks.class, "signalFlowBoxUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFlowBoxActivateCursorChild(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.ActivateCursorChildHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxChildActivated(MemoryAddress source, MemoryAddress child, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.ChildActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)), new FlowBoxChild(Refcounted.get(child, false)));
        }
        
        public static boolean signalFlowBoxMoveCursor(MemoryAddress source, int step, int count, int extend, int modify, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.MoveCursorHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new FlowBox(Refcounted.get(source)), new MovementStep(step), count, extend != 0, modify != 0);
        }
        
        public static void signalFlowBoxSelectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.SelectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxSelectedChildrenChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.SelectedChildrenChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxToggleCursorChild(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.ToggleCursorChildHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
        public static void signalFlowBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FlowBox.UnselectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FlowBox(Refcounted.get(source)));
        }
        
    }
}
