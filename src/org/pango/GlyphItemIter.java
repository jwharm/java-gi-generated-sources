package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoGlyphItemIter} is an iterator over the clusters in a
 * {@code PangoGlyphItem}.
 * <p>
 * The <strong>forward direction</strong> of the iterator is the logical direction of text.
 * That is, with increasing {@code start_index} and {@code start_char} values. If {@code glyph_item}
 * is right-to-left (that is, if {@code glyph_item->item->analysis.level} is odd),
 * then {@code start_glyph} decreases as the iterator moves forward.  Moreover,
 * in right-to-left cases, {@code start_glyph} is greater than {@code end_glyph}.
 * <p>
 * An iterator should be initialized using either
 * pango_glyph_item_iter_init_start() or
 * pango_glyph_item_iter_init_end(), for forward and backward iteration
 * respectively, and walked over using any desired mixture of
 * pango_glyph_item_iter_next_cluster() and
 * pango_glyph_item_iter_prev_cluster().
 * <p>
 * A common idiom for doing a forward iteration over the clusters is:
 * <p>
 * <pre>{@code 
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
 * }</pre>
 * <p>
 * Note that {@code text} is the start of the text for layout, which is then
 * indexed by {@code glyph_item->item->offset} to get to the text of {@code glyph_item}.
 * The {@code start_index} and {@code end_index} values can directly index into {@code text}. The
 * {@code start_glyph}, {@code end_glyph}, {@code start_char}, and {@code end_char} values however are
 * zero-based for the {@code glyph_item}.  For each cluster, the item pointed at by
 * the start variables is included in the cluster while the one pointed at by
 * end variables is not.
 * <p>
 * None of the members of a {@code PangoGlyphItemIter} should be modified manually.
 */
public class GlyphItemIter extends io.github.jwharm.javagi.ResourceBase {

    public GlyphItemIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GlyphItemIter() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoGlyphItemIter.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Make a shallow copy of an existing {@code PangoGlyphItemIter} structure.
     */
    public GlyphItemIter copy() {
        var RESULT = gtk_h.pango_glyph_item_iter_copy(handle());
        return new GlyphItemIter(References.get(RESULT, true));
    }
    
    /**
     * Frees a {@code PangoGlyphItem}Iter.
     */
    public void free() {
        gtk_h.pango_glyph_item_iter_free(handle());
    }
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * last cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean initEnd(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = gtk_h.pango_glyph_item_iter_init_end(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
        return RESULT != 0;
    }
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * first cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean initStart(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = gtk_h.pango_glyph_item_iter_init_start(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
        return RESULT != 0;
    }
    
    /**
     * Advances the iterator to the next cluster in the glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean nextCluster() {
        var RESULT = gtk_h.pango_glyph_item_iter_next_cluster(handle());
        return RESULT != 0;
    }
    
    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean prevCluster() {
        var RESULT = gtk_h.pango_glyph_item_iter_prev_cluster(handle());
        return RESULT != 0;
    }
    
}
