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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("glyph_item"),
            Interop.valueLayout.ADDRESS.withName("text"),
            Interop.valueLayout.C_INT.withName("start_glyph"),
            Interop.valueLayout.C_INT.withName("start_index"),
            Interop.valueLayout.C_INT.withName("start_char"),
            Interop.valueLayout.C_INT.withName("end_glyph"),
            Interop.valueLayout.C_INT.withName("end_index"),
            Interop.valueLayout.C_INT.withName("end_char")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphItemIter}
     * @return A new, uninitialized @{link GlyphItemIter}
     */
    public static GlyphItemIter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GlyphItemIter newInstance = new GlyphItemIter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph_item}
     * @return The value of the field {@code glyph_item}
     */
    public org.pango.GlyphItem getGlyphItem() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.pango.GlyphItem.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code glyph_item}
     * @param glyphItem The new value of the field {@code glyph_item}
     */
    public void setGlyphItem(org.pango.GlyphItem glyphItem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyphItem == null ? MemoryAddress.NULL : glyphItem.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code text}
     * @return The value of the field {@code text}
     */
    public java.lang.String getText() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void setText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code start_glyph}
     * @return The value of the field {@code start_glyph}
     */
    public int getStartGlyph() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start_glyph}
     * @param startGlyph The new value of the field {@code start_glyph}
     */
    public void setStartGlyph(int startGlyph) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), startGlyph);
        }
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int getStartIndex() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param startIndex The new value of the field {@code start_index}
     */
    public void setStartIndex(int startIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), startIndex);
        }
    }
    
    /**
     * Get the value of the field {@code start_char}
     * @return The value of the field {@code start_char}
     */
    public int getStartChar() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start_char}
     * @param startChar The new value of the field {@code start_char}
     */
    public void setStartChar(int startChar) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), startChar);
        }
    }
    
    /**
     * Get the value of the field {@code end_glyph}
     * @return The value of the field {@code end_glyph}
     */
    public int getEndGlyph() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code end_glyph}
     * @param endGlyph The new value of the field {@code end_glyph}
     */
    public void setEndGlyph(int endGlyph) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), endGlyph);
        }
    }
    
    /**
     * Get the value of the field {@code end_index}
     * @return The value of the field {@code end_index}
     */
    public int getEndIndex() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code end_index}
     * @param endIndex The new value of the field {@code end_index}
     */
    public void setEndIndex(int endIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), endIndex);
        }
    }
    
    /**
     * Get the value of the field {@code end_char}
     * @return The value of the field {@code end_char}
     */
    public int getEndChar() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code end_char}
     * @param endChar The new value of the field {@code end_char}
     */
    public void setEndChar(int endChar) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), endChar);
        }
    }
    
    /**
     * Create a GlyphItemIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GlyphItemIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphItemIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GlyphItemIter(input);
    
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
        var OBJECT = org.pango.GlyphItemIter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public boolean initEnd(org.pango.GlyphItem glyphItem, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_end.invokeExact(
                        handle(),
                        glyphItem.handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean initStart(org.pango.GlyphItem glyphItem, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_glyph_item_iter_init_start.invokeExact(
                        handle(),
                        glyphItem.handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * A {@link GlyphItemIter.Builder} object constructs a {@link GlyphItemIter} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphItemIter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphItemIter struct;
        
        private Builder() {
            struct = GlyphItemIter.allocate();
        }
        
        /**
         * Finish building the {@link GlyphItemIter} struct.
         * @return A new instance of {@code GlyphItemIter} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphItemIter build() {
            return struct;
        }
        
        public Builder setGlyphItem(org.pango.GlyphItem glyphItem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("glyph_item"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyphItem == null ? MemoryAddress.NULL : glyphItem.handle()));
                return this;
            }
        }
        
        public Builder setText(java.lang.String text) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
                return this;
            }
        }
        
        public Builder setStartGlyph(int startGlyph) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_glyph"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), startGlyph);
                return this;
            }
        }
        
        public Builder setStartIndex(int startIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), startIndex);
                return this;
            }
        }
        
        public Builder setStartChar(int startChar) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_char"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), startChar);
                return this;
            }
        }
        
        public Builder setEndGlyph(int endGlyph) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_glyph"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), endGlyph);
                return this;
            }
        }
        
        public Builder setEndIndex(int endIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), endIndex);
                return this;
            }
        }
        
        public Builder setEndChar(int endChar) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_char"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), endChar);
                return this;
            }
        }
    }
}
