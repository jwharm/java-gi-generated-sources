package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A cell area that renders GtkCellRenderers into a row or a column
 * <p>
 * The <code>GtkCellAreaBox</code> renders cell renderers into a row or a column
 * depending on its <code>GtkOrientation</code>.
 * <p>
 * GtkCellAreaBox uses a notion of packing. Packing
 * refers to adding cell renderers with reference to a particular position
 * in a <code>GtkCellAreaBox</code>. There are two reference positions: the
 * start and the end of the box.
 * When the <code>GtkCellAreaBox</code> is oriented in the <code>GTK_ORIENTATION_VERTICAL
 * orientation,</code> the start is defined as the top of the box and the end is
 * defined as the bottom. In the {@link org.gtk.gtk.Orientation#HORIZONTAL} orientation
 * start is defined as the left side and the end is defined as the right
 * side.
 * <p>
 * Alignments of <code>GtkCellRenderer</code>s rendered in adjacent rows can be
 * configured by configuring the <code>GtkCellAreaBox</code> align child cell property
 * with gtk_cell_area_cell_set_property() or by specifying the &#34;align&#34;
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
     * Creates a new <code>GtkCellAreaBox</code>.
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
     * Adds @renderer to @box, packed with reference to the end of @box.
     * <p>
     * The @renderer is packed after (away from end of) any other<code>GtkCellRenderer</code> packed with reference to the end of @box.
     */
    public void packEnd(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        gtk_h.gtk_cell_area_box_pack_end(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Adds @renderer to @box, packed with reference to the start of @box.
     * <p>
     * The @renderer is packed after any other <code>GtkCellRenderer</code> packed
     * with reference to the start of @box.
     */
    public void packStart(CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        gtk_h.gtk_cell_area_box_pack_start(handle(), renderer.handle(), expand ? 1 : 0, align ? 1 : 0, fixed ? 1 : 0);
    }
    
    /**
     * Sets the spacing to add between cell renderers in @box.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_cell_area_box_set_spacing(handle(), spacing);
    }
    
}
