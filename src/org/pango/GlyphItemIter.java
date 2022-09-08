package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoGlyphItemIter` is an iterator over the clusters in a
 * `PangoGlyphItem`.
 * 
 * The *forward direction* of the iterator is the logical direction of text.
 * That is, with increasing @start_index and @start_char values. If @glyph_item
 * is right-to-left (that is, if `glyph_item->item->analysis.level` is odd),
 * then @start_glyph decreases as the iterator moves forward.  Moreover,
 * in right-to-left cases, @start_glyph is greater than @end_glyph.
 * 
 * An iterator should be initialized using either
 * pango_glyph_item_iter_init_start() or
 * pango_glyph_item_iter_init_end(), for forward and backward iteration
 * respectively, and walked over using any desired mixture of
 * pango_glyph_item_iter_next_cluster() and
 * pango_glyph_item_iter_prev_cluster().
 * 
 * A common idiom for doing a forward iteration over the clusters is:
 * 
 * ```
 * PangoGlyphItemIter cluster_iter;
 * gboolean have_cluster;
 * 
 * for (have_cluster = pango_glyph_item_iter_init_start (&cluster_iter,
 *                                                       glyph_item, text);
 *      have_cluster;
 *      have_cluster = pango_glyph_item_iter_next_cluster (&cluster_iter))
 * {
 *   ...
 * }
 * ```
 * 
 * Note that @text is the start of the text for layout, which is then
 * indexed by `glyph_item->item->offset` to get to the text of @glyph_item.
 * The @start_index and @end_index values can directly index into @text. The
 * @start_glyph, @end_glyph, @start_char, and @end_char values however are
 * zero-based for the @glyph_item.  For each cluster, the item pointed at by
 * the start variables is included in the cluster while the one pointed at by
 * end variables is not.
 * 
 * None of the members of a `PangoGlyphItemIter` should be modified manually.
 */
public class GlyphItemIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public GlyphItemIter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Make a shallow copy of an existing `PangoGlyphItemIter` structure.
     */
    public GlyphItemIter copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_copy(HANDLE());
        return new GlyphItemIter(References.get(RESULT, true));
    }
    
    /**
     * Frees a `PangoGlyphItem`Iter.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_free(HANDLE());
    }
    
    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * last cluster in a glyph item.
     * 
     * See `PangoGlyphItemIter` for details of cluster orders.
     */
    public boolean initEnd(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_init_end(HANDLE(), glyphItem.HANDLE(), Interop.allocateNativeString(text).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * first cluster in a glyph item.
     * 
     * See `PangoGlyphItemIter` for details of cluster orders.
     */
    public boolean initStart(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_init_start(HANDLE(), glyphItem.HANDLE(), Interop.allocateNativeString(text).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Advances the iterator to the next cluster in the glyph item.
     * 
     * See `PangoGlyphItemIter` for details of cluster orders.
     */
    public boolean nextCluster() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_next_cluster(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See `PangoGlyphItemIter` for details of cluster orders.
     */
    public boolean prevCluster() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_iter_prev_cluster(HANDLE());
        return (RESULT != 0);
    }
    
}
