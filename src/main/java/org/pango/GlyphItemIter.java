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
public class GlyphItemIter extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphItemIter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("glyph_item"),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.C_INT.withName("start_glyph"),
        Interop.valueLayout.C_INT.withName("start_index"),
        Interop.valueLayout.C_INT.withName("start_char"),
        Interop.valueLayout.C_INT.withName("end_glyph"),
        Interop.valueLayout.C_INT.withName("end_index"),
        Interop.valueLayout.C_INT.withName("end_char")
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
    
    /**
     * Allocate a new {@link GlyphItemIter}
     * @return A new, uninitialized @{link GlyphItemIter}
     */
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
    public org.pango.GlyphItem glyphItem$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphItem(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code glyph_item}
     * @param glyphItem The new value of the field {@code glyph_item}
     */
    public void glyphItem$set(org.pango.GlyphItem glyphItem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glyphItem.handle());
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
    public int startGlyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_glyph}
     * @param startGlyph The new value of the field {@code start_glyph}
     */
    public void startGlyph$set(int startGlyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startGlyph);
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int startIndex$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param startIndex The new value of the field {@code start_index}
     */
    public void startIndex$set(int startIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startIndex);
    }
    
    /**
     * Get the value of the field {@code start_char}
     * @return The value of the field {@code start_char}
     */
    public int startChar$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_char}
     * @param startChar The new value of the field {@code start_char}
     */
    public void startChar$set(int startChar) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startChar);
    }
    
    /**
     * Get the value of the field {@code end_glyph}
     * @return The value of the field {@code end_glyph}
     */
    public int endGlyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_glyph}
     * @param endGlyph The new value of the field {@code end_glyph}
     */
    public void endGlyph$set(int endGlyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), endGlyph);
    }
    
    /**
     * Get the value of the field {@code end_index}
     * @return The value of the field {@code end_index}
     */
    public int endIndex$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_index}
     * @param endIndex The new value of the field {@code end_index}
     */
    public void endIndex$set(int endIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), endIndex);
    }
    
    /**
     * Get the value of the field {@code end_char}
     * @return The value of the field {@code end_char}
     */
    public int endChar$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_char}
     * @param endChar The new value of the field {@code end_char}
     */
    public void endChar$set(int endChar) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), endChar);
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
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_free = Interop.downcallHandle(
            "pango_glyph_item_iter_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_end = Interop.downcallHandle(
            "pango_glyph_item_iter_init_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_init_start = Interop.downcallHandle(
            "pango_glyph_item_iter_init_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_next_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_next_cluster",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_item_iter_prev_cluster = Interop.downcallHandle(
            "pango_glyph_item_iter_prev_cluster",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GlyphItemIter struct;
        
         /**
         * A {@link GlyphItemIter.Build} object constructs a {@link GlyphItemIter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GlyphItemIter.allocate();
        }
        
         /**
         * Finish building the {@link GlyphItemIter} struct.
         * @return A new instance of {@code GlyphItemIter} with the fields 
         *         that were set in the Build object.
         */
        public GlyphItemIter construct() {
            return struct;
        }
        
        public Build setGlyphItem(org.pango.GlyphItem glyphItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyphItem == null ? MemoryAddress.NULL : glyphItem.handle()));
            return this;
        }
        
        public Build setText(java.lang.String text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)));
            return this;
        }
        
        public Build setStartGlyph(int startGlyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), startGlyph);
            return this;
        }
        
        public Build setStartIndex(int startIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), startIndex);
            return this;
        }
        
        public Build setStartChar(int startChar) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), startChar);
            return this;
        }
        
        public Build setEndGlyph(int endGlyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), endGlyph);
            return this;
        }
        
        public Build setEndIndex(int endIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), endIndex);
            return this;
        }
        
        public Build setEndChar(int endChar) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), endChar);
            return this;
        }
    }
}
