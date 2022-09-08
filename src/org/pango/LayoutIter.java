package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoLayoutIter` can be used to iterate over the visual
 * extents of a `PangoLayout`.
 * 
 * To obtain a `PangoLayoutIter`, use [method@Pango.Layout.get_iter].
 * 
 * The `PangoLayoutIter` structure is opaque, and has no user-visible fields.
 */
public class LayoutIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public LayoutIter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Determines whether @iter is on the last line of the layout.
     */
    public boolean atLastLine() {
        var RESULT = gtk_h.pango_layout_iter_at_last_line(handle());
        return (RESULT != 0);
    }
    
    /**
     * Copies a `PangoLayoutIter`.
     */
    public LayoutIter copy() {
        var RESULT = gtk_h.pango_layout_iter_copy(handle());
        return new LayoutIter(References.get(RESULT, true));
    }
    
    /**
     * Frees an iterator that's no longer in use.
     */
    public void free() {
        gtk_h.pango_layout_iter_free(handle());
    }
    
    /**
     * Gets the Y position of the current line's baseline, in layout
     * coordinates.
     * 
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public int getBaseline() {
        var RESULT = gtk_h.pango_layout_iter_get_baseline(handle());
        return RESULT;
    }
    
    /**
     * Gets the extents of the current character, in layout coordinates.
     * 
     * Layout coordinates have the origin at the top left of the entire layout.
     * 
     * Only logical extents can sensibly be obtained for characters;
     * ink extents make sense only down to the level of clusters.
     */
    public void getCharExtents(Rectangle logicalRect) {
        gtk_h.pango_layout_iter_get_char_extents(handle(), logicalRect.handle());
    }
    
    /**
     * Gets the extents of the current cluster, in layout coordinates.
     * 
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public void getClusterExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_iter_get_cluster_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Gets the current byte index.
     * 
     * Note that iterating forward by char moves in visual order,
     * not logical order, so indexes may not be sequential. Also,
     * the index may be equal to the length of the text in the
     * layout, if on the %NULL run (see [method@Pango.LayoutIter.get_run]).
     */
    public int getIndex() {
        var RESULT = gtk_h.pango_layout_iter_get_index(handle());
        return RESULT;
    }
    
    /**
     * Gets the layout associated with a `PangoLayoutIter`.
     */
    public Layout getLayout() {
        var RESULT = gtk_h.pango_layout_iter_get_layout(handle());
        return new Layout(References.get(RESULT, false));
    }
    
    /**
     * Obtains the extents of the `PangoLayout` being iterated over.
     */
    public void getLayoutExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_iter_get_layout_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Gets the current line.
     * 
     * Use the faster [method@Pango.LayoutIter.get_line_readonly] if
     * you do not plan to modify the contents of the line (glyphs,
     * glyph widths, etc.).
     */
    public LayoutLine getLine() {
        var RESULT = gtk_h.pango_layout_iter_get_line(handle());
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Obtains the extents of the current line.
     * 
     * Extents are in layout coordinates (origin is the top-left corner
     * of the entire `PangoLayout`). Thus the extents returned by this
     * function will be the same width/height but not at the same x/y
     * as the extents returned from [method@Pango.LayoutLine.get_extents].
     */
    public void getLineExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_iter_get_line_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Gets the current line for read-only access.
     * 
     * This is a faster alternative to [method@Pango.LayoutIter.get_line],
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLineReadonly() {
        var RESULT = gtk_h.pango_layout_iter_get_line_readonly(handle());
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Gets the current run.
     * 
     * When iterating by run, at the end of each line, there's a position
     * with a %NULL run, so this function can return %NULL. The %NULL run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     * 
     * Use the faster [method@Pango.LayoutIter.get_run_readonly] if you do not
     * plan to modify the contents of the run (glyphs, glyph widths, etc.).
     */
    public LayoutRun getRun() {
        var RESULT = gtk_h.pango_layout_iter_get_run(handle());
        return new LayoutRun(References.get(RESULT, false));
    }
    
    /**
     * Gets the Y position of the current run's baseline, in layout
     * coordinates.
     * 
     * Layout coordinates have the origin at the top left of the entire layout.
     * 
     * The run baseline can be different from the line baseline, for
     * example due to superscript or subscript positioning.
     */
    public int getRunBaseline() {
        var RESULT = gtk_h.pango_layout_iter_get_run_baseline(handle());
        return RESULT;
    }
    
    /**
     * Gets the extents of the current run in layout coordinates.
     * 
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public void getRunExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_iter_get_run_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Gets the current run for read-only access.
     * 
     * When iterating by run, at the end of each line, there's a position
     * with a %NULL run, so this function can return %NULL. The %NULL run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     * 
     * This is a faster alternative to [method@Pango.LayoutIter.get_run],
     * but the user is not expected to modify the contents of the run (glyphs,
     * glyph widths, etc.).
     */
    public LayoutRun getRunReadonly() {
        var RESULT = gtk_h.pango_layout_iter_get_run_readonly(handle());
        return new LayoutRun(References.get(RESULT, false));
    }
    
    /**
     * Moves @iter forward to the next character in visual order.
     * 
     * If @iter was already at the end of the layout, returns %FALSE.
     */
    public boolean nextChar() {
        var RESULT = gtk_h.pango_layout_iter_next_char(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the next cluster in visual order.
     * 
     * If @iter was already at the end of the layout, returns %FALSE.
     */
    public boolean nextCluster() {
        var RESULT = gtk_h.pango_layout_iter_next_cluster(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the start of the next line.
     * 
     * If @iter is already on the last line, returns %FALSE.
     */
    public boolean nextLine() {
        var RESULT = gtk_h.pango_layout_iter_next_line(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the next run in visual order.
     * 
     * If @iter was already at the end of the layout, returns %FALSE.
     */
    public boolean nextRun() {
        var RESULT = gtk_h.pango_layout_iter_next_run(handle());
        return (RESULT != 0);
    }
    
}
