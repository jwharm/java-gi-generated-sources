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
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphItemIter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("glyph_item"),
        Interop.valueLayout.ADDRESS.withName("text"),
        ValueLayout.JAVA_INT.withName("start_glyph"),
        ValueLayout.JAVA_INT.withName("start_index"),
        ValueLayout.JAVA_INT.withName("start_char"),
        ValueLayout.JAVA_INT.withName("end_glyph"),
        ValueLayout.JAVA_INT.withName("end_index"),
        ValueLayout.JAVA_INT.withName("end_char")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static GlyphItemIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphItemIter newInstance = new GlyphItemIter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph_item}
     * @return The value of the field {@code glyph_item}
     */
    public org.pango.GlyphItem glyph_item$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphItem(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code glyph_item}
     * @param glyph_item The new value of the field {@code glyph_item}
     */
    public void glyph_item$set(org.pango.GlyphItem glyph_item) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glyph_item.handle());
    }
    
    /**
     * Get the value of the field {@code text}
     * @return The value of the field {@code text}
     */
    public java.lang.String text$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void text$set(java.lang.String text) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(text));
    }
    
    /**
     * Get the value of the field {@code start_glyph}
     * @return The value of the field {@code start_glyph}
     */
    public int start_glyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_glyph}
     * @param start_glyph The new value of the field {@code start_glyph}
     */
    public void start_glyph$set(int start_glyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start_glyph);
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int start_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param start_index The new value of the field {@code start_index}
     */
    public void start_index$set(int start_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start_index);
    }
    
    /**
     * Get the value of the field {@code start_char}
     * @return The value of the field {@code start_char}
     */
    public int start_char$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_char}
     * @param start_char The new value of the field {@code start_char}
     */
    public void start_char$set(int start_char) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start_char);
    }
    
    /**
     * Get the value of the field {@code end_glyph}
     * @return The value of the field {@code end_glyph}
     */
    public int end_glyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_glyph}
     * @param end_glyph The new value of the field {@code end_glyph}
     */
    public void end_glyph$set(int end_glyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end_glyph);
    }
    
    /**
     * Get the value of the field {@code end_index}
     * @return The value of the field {@code end_index}
     */
    public int end_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_index}
     * @param end_index The new value of the field {@code end_index}
     */
    public void end_index$set(int end_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end_index);
    }
    
    /**
     * Get the value of the field {@code end_char}
     * @return The value of the field {@code end_char}
     */
    public int end_char$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_char}
     * @param end_char The new value of the field {@code end_char}
     */
    public void end_char$set(int end_char) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end_char);
    }
    
    /**
     * Create a GlyphItemIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphItemIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Make a shallow copy of an existing {@code PangoGlyphItemIter} structure.
     * @return the newly allocated {@code PangoGlyphItemIter}
     */
    public @Nullable org.pango.GlyphItemIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_item_iter_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.GlyphItemIter(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a {@code PangoGlyphItem}Iter.
     */
    public void free() {
        try {
            DowncallHandles.pango_glyph_item_iter_free.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_end.invokeExact(
                    handle(),
                    glyphItem.handle(),
                    Interop.allocateNativeString(text));
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
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_start.invokeExact(
                    handle(),
                    glyphItem.handle(),
                    Interop.allocateNativeString(text));
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
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_next_cluster.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.pango_glyph_item_iter_prev_cluster.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_glyph_item_iter_copy = Interop.downcallHandle(
            "pango_glyph_item_iter_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_free = Interop.downcallHandle(
            "pango_glyph_item_iter_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_end = Interop.downcallHandle(
            "pango_glyph_item_iter_init_end",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_start = Interop.downcallHandle(
            "pango_glyph_item_iter_init_start",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_next_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_next_cluster",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_prev_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_prev_cluster",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
