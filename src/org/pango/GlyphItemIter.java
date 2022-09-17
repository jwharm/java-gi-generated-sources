package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoGlyphItemIter</code> is an iterator over the clusters in a<code>PangoGlyphItem</code>.
 * <p>
 * The *forward direction* of the iterator is the logical direction of text.
 * That is, with increasing @start_index and @start_char values. If @glyph_item
 * is right-to-left (that is, if <code>glyph_item-&#62;item-&#62;analysis.level</code> is odd),
 * then @start_glyph decreases as the iterator moves forward.  Moreover,
 * in right-to-left cases, @start_glyph is greater than @end_glyph.
 * <p>
 * An iterator should be initialized using either
 * pango_glyph_item_iter_init_start() or
 * pango_glyph_item_iter_init_end(), for forward and backward iteration
 * respectively, and walked over using any desired mixture of
 * pango_glyph_item_iter_next_cluster() and
 * pango_glyph_item_iter_prev_cluster().
 * <p>
 * A common idiom for doing a forward iteration over the clusters is:
 * <p><pre>
 * PangoGlyphItemIter cluster_iter;
 * gboolean have_cluster;
 * <p>
 * for (have_cluster = pango_glyph_item_iter_init_start (&#38;cluster_iter,
 *                                                       glyph_item, text);
 *      have_cluster;
 *      have_cluster = pango_glyph_item_iter_next_cluster (&#38;cluster_iter))
 * {
 *   ...
 * }
 * </pre>
 * <p>
 * Note that @text is the start of the text for layout, which is then
 * indexed by <code>glyph_item-&#62;item-&#62;offset</code> to get to the text of @glyph_item.
 * The @start_index and @end_index values can directly index into @text. The
 * @start_glyph, @end_glyph, @start_char, and @end_char values however are
 * zero-based for the @glyph_item.  For each cluster, the item pointed at by
 * the start variables is included in the cluster while the one pointed at by
 * end variables is not.
 * <p>
 * None of the members of a <code>PangoGlyphItemIter</code> should be modified manually.
 */
public class GlyphItemIter extends io.github.jwharm.javagi.ResourceBase {

    public GlyphItemIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Make a shallow copy of an existing <code>PangoGlyphItemIter</code> structure.
     */
    public GlyphItemIter copy() {
        var RESULT = gtk_h.pango_glyph_item_iter_copy(handle());
        return new GlyphItemIter(References.get(RESULT, true));
    }
    
    /**
     * Frees a <code>PangoGlyphItem</code>Iter.
     */
    public void free() {
        gtk_h.pango_glyph_item_iter_free(handle());
    }
    
    /**
     * Initializes a <code>PangoGlyphItemIter</code> structure to point to the
     * last cluster in a glyph item.
     * <p>
     * See <code>PangoGlyphItemIter</code> for details of cluster orders.
     */
    public boolean initEnd(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = gtk_h.pango_glyph_item_iter_init_end(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes a <code>PangoGlyphItemIter</code> structure to point to the
     * first cluster in a glyph item.
     * <p>
     * See <code>PangoGlyphItemIter</code> for details of cluster orders.
     */
    public boolean initStart(GlyphItem glyphItem, java.lang.String text) {
        var RESULT = gtk_h.pango_glyph_item_iter_init_start(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
        return (RESULT != 0);
    }
    
    /**
     * Advances the iterator to the next cluster in the glyph item.
     * <p>
     * See <code>PangoGlyphItemIter</code> for details of cluster orders.
     */
    public boolean nextCluster() {
        var RESULT = gtk_h.pango_glyph_item_iter_next_cluster(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See <code>PangoGlyphItemIter</code> for details of cluster orders.
     */
    public boolean prevCluster() {
        var RESULT = gtk_h.pango_glyph_item_iter_prev_cluster(handle());
        return (RESULT != 0);
    }
    
}
