package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A cell area that renders GtkCellRenderers into a row or a column
 * <p>
 * The {@code GtkCellAreaBox} renders cell renderers into a row or a column
 * depending on its {@code GtkOrientation}.
 * <p>
 * GtkCellAreaBox uses a notion of packing. Packing
 * refers to adding cell renderers with reference to a particular position
 * in a {@code GtkCellAreaBox}. There are two reference positions: the
 * start and the end of the box.
 * When the {@code GtkCellAreaBox} is oriented in the {@link Orientation#VERTICAL}
 * orientation, the start is defined as the top of the box and the end is
 * defined as the bottom. In the {@link Orientation#HORIZONTAL} orientation
 * start is defined as the left side and the end is defined as the right
 * side.
 * <p>
 * Alignments of {@code GtkCellRenderer}s rendered in adjacent rows can be
 * configured by configuring the {@code GtkCellAreaBox} align child cell property
 * with gtk_cell_area_cell_set_property() or by specifying the "align"
 * argument to gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
 */
public class CellAreaBox extends CellArea implements Buildable, CellLayout, Orientable {

    public CellAreaBox(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellAreaBox */
    public static CellAreaBox castFrom(org.gtk.gobject.Object gobject) {
        return new CellAreaBox(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_area_box_new = Interop.downcallHandle(
        "gtk_cell_area_box_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_area_box_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellAreaBox}.
     */
    public CellAreaBox() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_cell_area_box_get_spacing = Interop.downcallHandle(
        "gtk_cell_area_box_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the spacing added between cell renderers.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) gtk_cell_area_box_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_box_pack_end = Interop.downcallHandle(
        "gtk_cell_area_box_pack_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the end of {@code box}.
     * <p>
     * The {@code renderer} is packed after (away from end of) any other
     * {@code GtkCellRenderer} packed with reference to the end of {@code box}.
     */
    public void packEnd(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        try {
            gtk_cell_area_box_pack_end.invokeExact(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_box_pack_start = Interop.downcallHandle(
        "gtk_cell_area_box_pack_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the start of {@code box}.
     * <p>
     * The {@code renderer} is packed after any other {@code GtkCellRenderer} packed
     * with reference to the start of {@code box}.
     */
    public void packStart(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        try {
            gtk_cell_area_box_pack_start.invokeExact(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_box_set_spacing = Interop.downcallHandle(
        "gtk_cell_area_box_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the spacing to add between cell renderers in {@code box}.
     */
    public void setSpacing(int spacing) {
        try {
            gtk_cell_area_box_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
