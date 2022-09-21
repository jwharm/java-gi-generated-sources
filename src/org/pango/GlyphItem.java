package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public GlyphItem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
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
     * cases, it may happen that {@code item}->extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     * <p>
     * This function takes ownership of {@code glyph_item}; it will be reused
     * as one of the elements in the list.
     */
    public org.gtk.glib.SList applyAttrs(java.lang.String text, AttrList list) {
        var RESULT = gtk_h.pango_glyph_item_apply_attrs(handle(), Interop.allocateNativeString(text).handle(), list.handle());
        return new org.gtk.glib.SList(References.get(RESULT, true));
    }
    
    /**
     * Make a deep copy of an existing {@code PangoGlyphItem} structure.
     */
    public GlyphItem copy() {
        var RESULT = gtk_h.pango_glyph_item_copy(handle());
        return new GlyphItem(References.get(RESULT, true));
    }
    
    /**
     * Frees a {@code PangoGlyphItem} and resources to which it points.
     */
    public void free() {
        gtk_h.pango_glyph_item_free(handle());
    }
    
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
        gtk_h.pango_glyph_item_get_logical_widths(handle(), Interop.allocateNativeString(text).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, logicalWidths)).handle());
    }
    
    /**
     * Adds spacing between the graphemes of {@code glyph_item} to
     * give the effect of typographic letter spacing.
     */
    public void letterSpace(java.lang.String text, LogAttr[] logAttrs, int letterSpacing) {
        gtk_h.pango_glyph_item_letter_space(handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeArray(logAttrs).handle(), letterSpacing);
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
     */
    public GlyphItem split(java.lang.String text, int splitIndex) {
        var RESULT = gtk_h.pango_glyph_item_split(handle(), Interop.allocateNativeString(text).handle(), splitIndex);
        return new GlyphItem(References.get(RESULT, true));
    }
    
}
