package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Stores geometrical information for a series of rows in a GtkCellArea
 * 
 * The `GtkCellAreaContext` object is created by a given `GtkCellArea`
 * implementation via its `GtkCellAreaClass.create_context()` virtual
 * method and is used to store cell sizes and alignments for a series of
 * `GtkTreeModel` rows that are requested and rendered in the same context.
 * 
 * `GtkCellLayout` widgets can create any number of contexts in which to
 * request and render groups of data rows. However, it’s important that the
 * same context which was used to request sizes for a given `GtkTreeModel`
 * row also be used for the same row when calling other `GtkCellArea` APIs
 * such as gtk_cell_area_render() and gtk_cell_area_event().
 */
public class CellAreaContext extends org.gtk.gobject.Object {

    public CellAreaContext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CellAreaContext */
    public static CellAreaContext castFrom(org.gtk.gobject.Object gobject) {
        return new CellAreaContext(gobject.getProxy());
    }
    
    /**
     * Allocates a width and/or a height for all rows which are to be
     * rendered with @context.
     * 
     * Usually allocation is performed only horizontally or sometimes
     * vertically since a group of rows are usually rendered side by
     * side vertically or horizontally and share either the same width
     * or the same height. Sometimes they are allocated in both horizontal
     * and vertical orientations producing a homogeneous effect of the
     * rows. This is generally the case for `GtkTreeView` when
     * `GtkTreeView:fixed-height-mode` is enabled.
     */
    public void allocate(int width, int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_context_allocate(HANDLE(), width, height);
    }
    
    /**
     * Fetches the `GtkCellArea` this @context was created by.
     * 
     * This is generally unneeded by layouting widgets; however,
     * it is important for the context implementation itself to
     * fetch information about the area it is being used for.
     * 
     * For instance at `GtkCellAreaContextClass.allocate()` time
     * it’s important to know details about any cell spacing
     * that the `GtkCellArea` is configured with in order to
     * compute a proper allocation.
     */
    public CellArea getArea() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_context_get_area(HANDLE());
        return new CellArea(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Causes the minimum and/or natural height to grow if the new
     * proposed sizes exceed the current minimum and natural height.
     * 
     * This is used by `GtkCellAreaContext` implementations during
     * the request process over a series of `GtkTreeModel` rows to
     * progressively push the requested height over a series of
     * gtk_cell_area_get_preferred_height() requests.
     */
    public void pushPreferredHeight(int minimumHeight, int naturalHeight) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_context_push_preferred_height(HANDLE(), minimumHeight, naturalHeight);
    }
    
    /**
     * Causes the minimum and/or natural width to grow if the new
     * proposed sizes exceed the current minimum and natural width.
     * 
     * This is used by `GtkCellAreaContext` implementations during
     * the request process over a series of `GtkTreeModel` rows to
     * progressively push the requested width over a series of
     * gtk_cell_area_get_preferred_width() requests.
     */
    public void pushPreferredWidth(int minimumWidth, int naturalWidth) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_context_push_preferred_width(HANDLE(), minimumWidth, naturalWidth);
    }
    
    /**
     * Resets any previously cached request and allocation
     * data.
     * 
     * When underlying `GtkTreeModel` data changes its
     * important to reset the context if the content
     * size is allowed to shrink. If the content size
     * is only allowed to grow (this is usually an option
     * for views rendering large data stores as a measure
     * of optimization), then only the row that changed
     * or was inserted needs to be (re)requested with
     * gtk_cell_area_get_preferred_width().
     * 
     * When the new overall size of the context requires
     * that the allocated size changes (or whenever this
     * allocation changes at all), the variable row
     * sizes need to be re-requested for every row.
     * 
     * For instance, if the rows are displayed all with
     * the same width from top to bottom then a change
     * in the allocated width necessitates a recalculation
     * of all the displayed row heights using
     * gtk_cell_area_get_preferred_height_for_width().
     */
    public void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_context_reset(HANDLE());
    }
    
}
