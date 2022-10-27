package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphItemIter} is an iterator over the clusters in a
 * {@code PangoGlyphItem}.
 * <p>
 * The <em>forward direction</em> of the iterator is the logical direction of text.
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
 * @version 1.22
 */
public class GlyphItemIter extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.GlyphItem.getMemoryLayout().withName("glyph_item"),
        Interop.valueLayout.ADDRESS.withName("text"),
        ValueLayout.JAVA_INT.withName("start_glyph"),
        ValueLayout.JAVA_INT.withName("start_index"),
        ValueLayout.JAVA_INT.withName("start_char"),
        ValueLayout.JAVA_INT.withName("end_glyph"),
        ValueLayout.JAVA_INT.withName("end_index"),
        ValueLayout.JAVA_INT.withName("end_char")
    ).withName("PangoGlyphItemIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public GlyphItemIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Make a shallow copy of an existing {@code PangoGlyphItemIter} structure.
     * @return the newly allocated {@code PangoGlyphItemIter}
     */
    public @Nullable org.pango.GlyphItemIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_item_iter_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.GlyphItemIter(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code PangoGlyphItem}Iter.
     */
    public void free() {
        try {
            DowncallHandles.pango_glyph_item_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * last cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     * @param glyphItem the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return {@code false} if there are no clusters in the glyph item
     */
    public boolean initEnd(@NotNull org.pango.GlyphItem glyphItem, @NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(glyphItem, "Parameter 'glyphItem' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_end.invokeExact(handle(), glyphItem.handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes a {@code PangoGlyphItemIter} structure to point to the
     * first cluster in a glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     * @param glyphItem the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return {@code false} if there are no clusters in the glyph item
     */
    public boolean initStart(@NotNull org.pango.GlyphItem glyphItem, @NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(glyphItem, "Parameter 'glyphItem' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_start.invokeExact(handle(), glyphItem.handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Advances the iterator to the next cluster in the glyph item.
     * <p>
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     * @return {@code true} if the iterator was advanced,
     *   {@code false} if we were already on the  last cluster.
     */
    public boolean nextCluster() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_next_cluster.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See {@code PangoGlyphItemIter} for details of cluster orders.
     * @return {@code true} if the iterator was moved,
     *   {@code false} if we were already on the first cluster.
     */
    public boolean prevCluster() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_prev_cluster.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_glyph_item_iter_copy = Interop.downcallHandle(
            "pango_glyph_item_iter_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_iter_free = Interop.downcallHandle(
            "pango_glyph_item_iter_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_end = Interop.downcallHandle(
            "pango_glyph_item_iter_init_end",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_start = Interop.downcallHandle(
            "pango_glyph_item_iter_init_start",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_iter_next_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_next_cluster",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_iter_prev_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_prev_cluster",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
