package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public CellAreaBox(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellAreaBox */
    public static CellAreaBox castFrom(org.gtk.gobject.Object gobject) {
        return new CellAreaBox(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_area_box_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellAreaBox}.
     */
    public CellAreaBox() {
        super(constructNew());
    }
    
    /**
     * Gets the spacing added between cell renderers.
     */
    public int getSpacing() {
        var RESULT = gtk_h.gtk_cell_area_box_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the end of {@code box}.
     * <p>
     * The {@code renderer} is packed after (away from end of) any other
     * {@code GtkCellRenderer} packed with reference to the end of {@code box}.
     */
    public void packEnd(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        gtk_h.gtk_cell_area_box_pack_end(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the start of {@code box}.
     * <p>
     * The {@code renderer} is packed after any other {@code GtkCellRenderer} packed
     * with reference to the start of {@code box}.
     */
    public void packStart(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        gtk_h.gtk_cell_area_box_pack_start(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Sets the spacing to add between cell renderers in {@code box}.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_cell_area_box_set_spacing(handle(), spacing);
    }
    
}
