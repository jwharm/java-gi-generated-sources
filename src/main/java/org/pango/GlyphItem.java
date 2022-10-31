package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphItem} is a pair of a {@code PangoItem} and the glyphs
 * resulting from shaping the items text.
 * <p>
 * As an example of the usage of {@code PangoGlyphItem}, the results
 * of shaping text with {@code PangoLayout} is a list of {@code PangoLayoutLine},
 * each of which contains a list of {@code PangoGlyphItem}.
 */
public class GlyphItem extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphItem";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("item"),
        Interop.valueLayout.ADDRESS.withName("glyphs"),
        ValueLayout.JAVA_INT.withName("y_offset"),
        ValueLayout.JAVA_INT.withName("start_x_offset"),
        ValueLayout.JAVA_INT.withName("end_x_offset")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static GlyphItem allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphItem newInstance = new GlyphItem(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code item}
     * @return The value of the field {@code item}
     */
    public org.pango.Item item$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.Item(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code item}
     * @param item The new value of the field {@code item}
     */
    public void item$set(org.pango.Item item) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), item.handle());
    }
    
    /**
     * Get the value of the field {@code glyphs}
     * @return The value of the field {@code glyphs}
     */
    public org.pango.GlyphString glyphs$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyphs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphString(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code glyphs}
     * @param glyphs The new value of the field {@code glyphs}
     */
    public void glyphs$set(org.pango.GlyphString glyphs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyphs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glyphs.handle());
    }
    
    /**
     * Get the value of the field {@code y_offset}
     * @return The value of the field {@code y_offset}
     */
    public int y_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y_offset}
     * @param y_offset The new value of the field {@code y_offset}
     */
    public void y_offset$set(int y_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y_offset);
    }
    
    /**
     * Get the value of the field {@code start_x_offset}
     * @return The value of the field {@code start_x_offset}
     */
    public int start_x_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_x_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_x_offset}
     * @param start_x_offset The new value of the field {@code start_x_offset}
     */
    public void start_x_offset$set(int start_x_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_x_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start_x_offset);
    }
    
    /**
     * Get the value of the field {@code end_x_offset}
     * @return The value of the field {@code end_x_offset}
     */
    public int end_x_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_x_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_x_offset}
     * @param end_x_offset The new value of the field {@code end_x_offset}
     */
    public void end_x_offset$set(int end_x_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_x_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end_x_offset);
    }
    
    @ApiStatus.Internal
    public GlyphItem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Splits a shaped item ({@code PangoGlyphItem}) into multiple items based
     * on an attribute list.
     * <p>
     * The idea is that if you have attributes that don't affect shaping,
     * such as color or underline, to avoid affecting shaping, you filter
     * them out ({@link AttrList#filter}), apply the shaping process
     * and then reapply them to the result using this function.
     * <p>
     * All attributes that start or end inside a cluster are applied
     * to that cluster; for instance, if half of a cluster is underlined
     * and the other-half strikethrough, then the cluster will end
     * up with both underline and strikethrough attributes. In these
     * cases, it may happen that {@code item}-&gt;extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     * <p>
     * This function takes ownership of {@code glyph_item}; it will be reused
     * as one of the elements in the list.
     * @param text text that {@code list} applies to
     * @param list a {@code PangoAttrList}
     * @return a
     *   list of glyph items resulting from splitting {@code glyph_item}. Free
     *   the elements using {@link GlyphItem#free}, the list using
     *   g_slist_free().
     */
    public @NotNull org.gtk.glib.SList applyAttrs(@NotNull java.lang.String text, @NotNull org.pango.AttrList list) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_item_apply_attrs.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
    }
    
    /**
     * Make a deep copy of an existing {@code PangoGlyphItem} structure.
     * @return the newly allocated {@code PangoGlyphItem}
     */
    public @Nullable org.pango.GlyphItem copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_item_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.GlyphItem(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code PangoGlyphItem} and resources to which it points.
     */
    public void free() {
        try {
            DowncallHandles.pango_glyph_item_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Given a {@code PangoGlyphItem} and the corresponding text, determine the
     * width corresponding to each character.
     * <p>
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * <p>
     * See also {@link GlyphString#getLogicalWidths}.
     * @param text text that {@code glyph_item} corresponds to
     *   (glyph_item-&gt;item-&gt;offset is an offset from the
     *   start of {@code text})
     * @param logicalWidths an array whose length is the number of
     *   characters in glyph_item (equal to glyph_item-&gt;item-&gt;num_chars)
     *   to be filled in with the resulting character widths.
     */
    public void getLogicalWidths(@NotNull java.lang.String text, int[] logicalWidths) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(logicalWidths, "Parameter 'logicalWidths' must not be null");
        try {
            DowncallHandles.pango_glyph_item_get_logical_widths.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    Interop.allocateNativeArray(logicalWidths, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds spacing between the graphemes of {@code glyph_item} to
     * give the effect of typographic letter spacing.
     * @param text text that {@code glyph_item} corresponds to
     *   (glyph_item-&gt;item-&gt;offset is an offset from the
     *   start of {@code text})
     * @param logAttrs logical attributes for the item
     *   (the first logical attribute refers to the position
     *   before the first character in the item)
     * @param letterSpacing amount of letter spacing to add
     *   in Pango units. May be negative, though too large
     *   negative values will give ugly results.
     */
    public void letterSpace(@NotNull java.lang.String text, org.pango.LogAttr[] logAttrs, int letterSpacing) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(logAttrs, "Parameter 'logAttrs' must not be null");
        try {
            DowncallHandles.pango_glyph_item_letter_space.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    Interop.allocateNativeArray(logAttrs, false),
                    letterSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Modifies {@code orig} to cover only the text after {@code split_index}, and
     * returns a new item that covers the text before {@code split_index} that
     * used to be in {@code orig}.
     * <p>
     * You can think of {@code split_index} as the length of the returned item.
     * {@code split_index} may not be 0, and it may not be greater than or equal
     * to the length of {@code orig} (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     * <p>
     * This function is similar in function to pango_item_split() (and uses
     * it internally.)
     * @param text text to which positions in {@code orig} apply
     * @param splitIndex byte index of position to split item, relative to the
     *   start of the item
     * @return the newly allocated item representing text before
     *   {@code split_index}, which should be freed
     *   with pango_glyph_item_free().
     */
    public @NotNull org.pango.GlyphItem split(@NotNull java.lang.String text, int splitIndex) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_item_split.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    splitIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.GlyphItem(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_glyph_item_apply_attrs = Interop.downcallHandle(
            "pango_glyph_item_apply_attrs",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_copy = Interop.downcallHandle(
            "pango_glyph_item_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_free = Interop.downcallHandle(
            "pango_glyph_item_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_get_logical_widths = Interop.downcallHandle(
            "pango_glyph_item_get_logical_widths",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_glyph_item_letter_space = Interop.downcallHandle(
            "pango_glyph_item_letter_space",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_glyph_item_split = Interop.downcallHandle(
            "pango_glyph_item_split",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
