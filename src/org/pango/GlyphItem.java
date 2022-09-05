package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoGlyphItem` is a pair of a `PangoItem` and the glyphs
 * resulting from shaping the items text.
 * 
 * As an example of the usage of `PangoGlyphItem`, the results
 * of shaping text with `PangoLayout` is a list of `PangoLayoutLine`,
 * each of which contains a list of `PangoGlyphItem`.
 */
public class GlyphItem extends io.github.jwharm.javagi.interop.ResourceBase {

    public GlyphItem(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Splits a shaped item (`PangoGlyphItem`) into multiple items based
     * on an attribute list.
     * 
     * The idea is that if you have attributes that don't affect shaping,
     * such as color or underline, to avoid affecting shaping, you filter
     * them out ([method@Pango.AttrList.filter]), apply the shaping process
     * and then reapply them to the result using this function.
     * 
     * All attributes that start or end inside a cluster are applied
     * to that cluster; for instance, if half of a cluster is underlined
     * and the other-half strikethrough, then the cluster will end
     * up with both underline and strikethrough attributes. In these
     * cases, it may happen that @item->extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     * 
     * This function takes ownership of @glyph_item; it will be reused
     * as one of the elements in the list.
     */
    public org.gtk.glib.SList applyAttrs(java.lang.String text, AttrList list) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_apply_attrs(HANDLE(), Interop.allocateNativeString(text).HANDLE(), list.HANDLE());
        return new org.gtk.glib.SList(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Make a deep copy of an existing `PangoGlyphItem` structure.
     */
    public GlyphItem copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_copy(HANDLE());
        return new GlyphItem(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Frees a `PangoGlyphItem` and resources to which it points.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_free(HANDLE());
    }
    
    /**
     * Given a `PangoGlyphItem` and the corresponding text, determine the
     * width corresponding to each character.
     * 
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * 
     * See also [method@Pango.GlyphString.get_logical_widths].
     */
    public void getLogicalWidths(java.lang.String text, int[] logicalWidths) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_get_logical_widths(HANDLE(), Interop.allocateNativeString(text).HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, logicalWidths));
    }
    
    /**
     * Adds spacing between the graphemes of @glyph_item to
     * give the effect of typographic letter spacing.
     */
    public void letterSpace(java.lang.String text, LogAttr[] logAttrs, int letterSpacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_letter_space(HANDLE(), Interop.allocateNativeString(text).HANDLE(), Interop.allocateNativeArray(logAttrs), letterSpacing);
    }
    
    /**
     * Modifies @orig to cover only the text after @split_index, and
     * returns a new item that covers the text before @split_index that
     * used to be in @orig.
     * 
     * You can think of @split_index as the length of the returned item.
     * @split_index may not be 0, and it may not be greater than or equal
     * to the length of @orig (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     * 
     * This function is similar in function to pango_item_split() (and uses
     * it internally.)
     */
    public GlyphItem split(java.lang.String text, int splitIndex) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_glyph_item_split(HANDLE(), Interop.allocateNativeString(text).HANDLE(), splitIndex);
        return new GlyphItem(ProxyFactory.get(RESULT, true));
    }
    
}
