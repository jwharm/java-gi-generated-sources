package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Stores geometrical information for a series of rows in a GtkCellArea
 * <p>
 * The {@code GtkCellAreaContext} object is created by a given {@code GtkCellArea}
 * implementation via its {@code GtkCellAreaClass.create_context()} virtual
 * method and is used to store cell sizes and alignments for a series of
 * {@code GtkTreeModel} rows that are requested and rendered in the same context.
 * <p>
 * {@code GtkCellLayout} widgets can create any number of contexts in which to
 * request and render groups of data rows. However, it’s important that the
 * same context which was used to request sizes for a given {@code GtkTreeModel}
 * row also be used for the same row when calling other {@code GtkCellArea} APIs
 * such as gtk_cell_area_render() and gtk_cell_area_event().
 */
public class CellAreaContext extends org.gtk.gobject.Object {

    public CellAreaContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellAreaContext */
    public static CellAreaContext castFrom(org.gtk.gobject.Object gobject) {
        return new CellAreaContext(gobject.refcounted());
    }
    
    /**
     * Allocates a width and/or a height for all rows which are to be
     * rendered with {@code context}.
     * <p>
     * Usually allocation is performed only horizontally or sometimes
     * vertically since a group of rows are usually rendered side by
     * side vertically or horizontally and share either the same width
     * or the same height. Sometimes they are allocated in both horizontal
     * and vertical orientations producing a homogeneous effect of the
     * rows. This is generally the case for {@code GtkTreeView} when
     * {@code GtkTreeView:fixed-height-mode} is enabled.
     */
    public void allocate(int width, int height) {
        gtk_h.gtk_cell_area_context_allocate(handle(), width, height);
    }
    
    /**
     * Fetches the current allocation size for {@code context}.
     * <p>
     * If the context was not allocated in width or height, or if the
     * context was recently reset with gtk_cell_area_context_reset(),
     * the returned value will be -1.
     */
    public void getAllocation(PointerInteger width, PointerInteger height) {
        gtk_h.gtk_cell_area_context_get_allocation(handle(), width.handle(), height.handle());
    }
    
    /**
     * Fetches the {@code GtkCellArea} this {@code context} was created by.
     * <p>
     * This is generally unneeded by layouting widgets; however,
     * it is important for the context implementation itself to
     * fetch information about the area it is being used for.
     * <p>
     * For instance at {@code GtkCellAreaContextClass.allocate()} time
     * it’s important to know details about any cell spacing
     * that the {@code GtkCellArea} is configured with in order to
     * compute a proper allocation.
     */
    public CellArea getArea() {
        var RESULT = gtk_h.gtk_cell_area_context_get_area(handle());
        return new CellArea(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the accumulative preferred height for all rows which have been
     * requested with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are 0.
     */
    public void getPreferredHeight(PointerInteger minimumHeight, PointerInteger naturalHeight) {
        gtk_h.gtk_cell_area_context_get_preferred_height(handle(), minimumHeight.handle(), naturalHeight.handle());
    }
    
    /**
     * Gets the accumulative preferred height for {@code width} for all rows
     * which have been requested for the same said {@code width} with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are -1.
     */
    public void getPreferredHeightForWidth(int width, PointerInteger minimumHeight, PointerInteger naturalHeight) {
        gtk_h.gtk_cell_area_context_get_preferred_height_for_width(handle(), width, minimumHeight.handle(), naturalHeight.handle());
    }
    
    /**
     * Gets the accumulative preferred width for all rows which have been
     * requested with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are 0.
     */
    public void getPreferredWidth(PointerInteger minimumWidth, PointerInteger naturalWidth) {
        gtk_h.gtk_cell_area_context_get_preferred_width(handle(), minimumWidth.handle(), naturalWidth.handle());
    }
    
    /**
     * Gets the accumulative preferred width for {@code height} for all rows which
     * have been requested for the same said {@code height} with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are -1.
     */
    public void getPreferredWidthForHeight(int height, PointerInteger minimumWidth, PointerInteger naturalWidth) {
        gtk_h.gtk_cell_area_context_get_preferred_width_for_height(handle(), height, minimumWidth.handle(), naturalWidth.handle());
    }
    
    /**
     * Causes the minimum and/or natural height to grow if the new
     * proposed sizes exceed the current minimum and natural height.
     * <p>
     * This is used by {@code GtkCellAreaContext} implementations during
     * the request process over a series of {@code GtkTreeModel} rows to
     * progressively push the requested height over a series of
     * gtk_cell_area_get_preferred_height() requests.
     */
    public void pushPreferredHeight(int minimumHeight, int naturalHeight) {
        gtk_h.gtk_cell_area_context_push_preferred_height(handle(), minimumHeight, naturalHeight);
    }
    
    /**
     * Causes the minimum and/or natural width to grow if the new
     * proposed sizes exceed the current minimum and natural width.
     * <p>
     * This is used by {@code GtkCellAreaContext} implementations during
     * the request process over a series of {@code GtkTreeModel} rows to
     * progressively push the requested width over a series of
     * gtk_cell_area_get_preferred_width() requests.
     */
    public void pushPreferredWidth(int minimumWidth, int naturalWidth) {
        gtk_h.gtk_cell_area_context_push_preferred_width(handle(), minimumWidth, naturalWidth);
    }
    
    /**
     * Resets any previously cached request and allocation
     * data.
     * <p>
     * When underlying {@code GtkTreeModel} data changes its
     * important to reset the context if the content
     * size is allowed to shrink. If the content size
     * is only allowed to grow (this is usually an option
     * for views rendering large data stores as a measure
     * of optimization), then only the row that changed
     * or was inserted needs to be (re)requested with
     * gtk_cell_area_get_preferred_width().
     * <p>
     * When the new overall size of the context requires
     * that the allocated size changes (or whenever this
     * allocation changes at all), the variable row
     * sizes need to be re-requested for every row.
     * <p>
     * For instance, if the rows are displayed all with
     * the same width from top to bottom then a change
     * in the allocated width necessitates a recalculation
     * of all the displayed row heights using
     * gtk_cell_area_get_preferred_height_for_width().
     */
    public void reset() {
        gtk_h.gtk_cell_area_context_reset(handle());
    }
    
}
