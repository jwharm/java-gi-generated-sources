package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoGlyphItem} is a pair of a {@code PangoItem} and the glyphs
 * resulting from shaping the items text.
 * <p>
 * As an example of the usage of {@code PangoGlyphItem}, the results
 * of shaping text with {@code PangoLayout} is a list of {@code PangoLayoutLine},
 * each of which contains a list of {@code PangoGlyphItem}.
 */
public class GlyphItem extends io.github.jwharm.javagi.ResourceBase {

    public GlyphItem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_glyph_item_apply_attrs = Interop.downcallHandle(
        "pango_glyph_item_apply_attrs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * cases, it may happen that {@code item}->extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     * <p>
     * This function takes ownership of {@code glyph_item}; it will be reused
     * as one of the elements in the list.
     */
    public org.gtk.glib.SList applyAttrs(java.lang.String text, AttrList list) {
        try {
            var RESULT = (MemoryAddress) pango_glyph_item_apply_attrs.invokeExact(handle(), Interop.allocateNativeString(text).handle(), list.handle());
            return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_copy = Interop.downcallHandle(
        "pango_glyph_item_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make a deep copy of an existing {@code PangoGlyphItem} structure.
     */
    public GlyphItem copy() {
        try {
            var RESULT = (MemoryAddress) pango_glyph_item_copy.invokeExact(handle());
            return new GlyphItem(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_free = Interop.downcallHandle(
        "pango_glyph_item_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code PangoGlyphItem} and resources to which it points.
     */
    public void free() {
        try {
            pango_glyph_item_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_get_logical_widths = Interop.downcallHandle(
        "pango_glyph_item_get_logical_widths",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given a {@code PangoGlyphItem} and the corresponding text, determine the
     * width corresponding to each character.
     * <p>
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * <p>
     * See also {@link GlyphString#getLogicalWidths}.
     */
    public void getLogicalWidths(java.lang.String text, int[] logicalWidths) {
        try {
            pango_glyph_item_get_logical_widths.invokeExact(handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeArray(logicalWidths).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_letter_space = Interop.downcallHandle(
        "pango_glyph_item_letter_space",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds spacing between the graphemes of {@code glyph_item} to
     * give the effect of typographic letter spacing.
     */
    public void letterSpace(java.lang.String text, LogAttr[] logAttrs, int letterSpacing) {
        try {
            pango_glyph_item_letter_space.invokeExact(handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeArray(logAttrs).handle(), letterSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_glyph_item_split = Interop.downcallHandle(
        "pango_glyph_item_split",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public GlyphItem split(java.lang.String text, int splitIndex) {
        try {
            var RESULT = (MemoryAddress) pango_glyph_item_split.invokeExact(handle(), Interop.allocateNativeString(text).handle(), splitIndex);
            return new GlyphItem(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
