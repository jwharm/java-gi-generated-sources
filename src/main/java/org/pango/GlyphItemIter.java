package org.pango;

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

    public GlyphItemIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_glyph_item_iter_copy = Interop.downcallHandle(
        "pango_glyph_item_iter_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make a shallow copy of an existing {@code PangoGlyphItemIter} structure.
     */
    public GlyphItemIter copy() {
        try {
            var RESULT = (MemoryAddress) pango_glyph_item_iter_copy.invokeExact(handle());
            return new GlyphItemIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_iter_free = Interop.downcallHandle(
        "pango_glyph_item_iter_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code PangoGlyphItem}Iter.
     */
    public void free() {
        try {
            pango_glyph_item_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_iter_init_end = Interop.downcallHandle(
        "pango_glyph_item_iter_init_end",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * last cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean initEnd(GlyphItem glyphItem, java.lang.String text) {
        try {
            var RESULT = (int) pango_glyph_item_iter_init_end.invokeExact(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_iter_init_start = Interop.downcallHandle(
        "pango_glyph_item_iter_init_start",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * first cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean initStart(GlyphItem glyphItem, java.lang.String text) {
        try {
            var RESULT = (int) pango_glyph_item_iter_init_start.invokeExact(handle(), glyphItem.handle(), Interop.allocateNativeString(text).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_iter_next_cluster = Interop.downcallHandle(
        "pango_glyph_item_iter_next_cluster",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Advances the iterator to the next cluster in the glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean nextCluster() {
        try {
            var RESULT = (int) pango_glyph_item_iter_next_cluster.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_iter_prev_cluster = Interop.downcallHandle(
        "pango_glyph_item_iter_prev_cluster",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     */
    public boolean prevCluster() {
        try {
            var RESULT = (int) pango_glyph_item_iter_prev_cluster.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
