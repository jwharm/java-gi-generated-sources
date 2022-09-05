package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A cell area that renders GtkCellRenderers into a row or a column
 * 
 * The `GtkCellAreaBox` renders cell renderers into a row or a column
 * depending on its `GtkOrientation`.
 * 
 * GtkCellAreaBox uses a notion of packing. Packing
 * refers to adding cell renderers with reference to a particular position
 * in a `GtkCellAreaBox`. There are two reference positions: the
 * start and the end of the box.
 * When the `GtkCellAreaBox` is oriented in the %GTK_ORIENTATION_VERTICAL
 * orientation, the start is defined as the top of the box and the end is
 * defined as the bottom. In the %GTK_ORIENTATION_HORIZONTAL orientation
 * start is defined as the left side and the end is defined as the right
 * side.
 * 
 * Alignments of `GtkCellRenderer`s rendered in adjacent rows can be
 * configured by configuring the `GtkCellAreaBox` align child cell property
 * with gtk_cell_area_cell_set_property() or by specifying the "align"
 * argument to gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
 */
public class CellAreaBox extends CellArea implements Buildable, CellLayout, Orientable {

    public CellAreaBox(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CellAreaBox */
    public static CellAreaBox castFrom(org.gtk.gobject.Object gobject) {
        return new CellAreaBox(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkCellAreaBox`.
     */
    public CellAreaBox() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_box_new(), false));
    }
    
    /**
     * Gets the spacing added between cell renderers.
     */
    public int getSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_box_get_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Adds @renderer to @box, packed with reference to the end of @box.
     * 
     * The @renderer is packed after (away from end of) any other
     * `GtkCellRenderer` packed with reference to the end of @box.
     */
    public void packEnd(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_box_pack_end(HANDLE(), renderer.HANDLE(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Adds @renderer to @box, packed with reference to the start of @box.
     * 
     * The @renderer is packed after any other `GtkCellRenderer` packed
     * with reference to the start of @box.
     */
    public void packStart(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_box_pack_start(HANDLE(), renderer.HANDLE(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Sets the spacing to add between cell renderers in @box.
     */
    public void setSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_box_set_spacing(HANDLE(), spacing);
    }
    
}
