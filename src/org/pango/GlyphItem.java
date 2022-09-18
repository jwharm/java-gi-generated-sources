package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoGlyphItem</code> is a pair of a <code>PangoItem</code> and the glyphs
 * resulting from shaping the items text.
 * <p>
 * As an example of the usage of <code>PangoGlyphItem</code>, the results
 * of shaping text with <code>PangoLayout</code> is a list of <code>PangoLayoutLine</code>,
 * each of which contains a list of <code>PangoGlyphItem</code>.
 */
public class GlyphItem extends io.github.jwharm.javagi.ResourceBase {

    public GlyphItem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Splits a shaped item (<code>PangoGlyphItem</code>) into multiple items based
     * on an attribute list.
     * 
     * The idea is that if you have attributes that don&<code>#39</code> t affect shaping,
     * such as color or underline, to avoid affecting shaping, you filter
     * them out ({@link org.pango.AttrList<code>#filter</code> ), apply the shaping process
     * and then reapply them to the result using this function.
     * 
     * All attributes that start or end inside a cluster are applied
     * to that cluster; for instance, if half of a cluster is underlined
     * and the other-half strikethrough, then the cluster will end
     * up with both underline and strikethrough attributes. In these
     * cases, it may happen that @item-&<code>#62</code> extra_attrs for some of the
     * result items can have multiple attributes of the same type.
     * 
     * This function takes ownership of @glyph_item; it will be reused
     * as one of the elements in the list.
     */
    public org.gtk.glib.SList applyAttrs(java.lang.String text, AttrList list) {
        var RESULT = gtk_h.pango_glyph_item_apply_attrs(handle(), Interop.allocateNativeString(text).handle(), list.handle());
        return new org.gtk.glib.SList(References.get(RESULT, true));
    }
    
    /**
     * Make a deep copy of an existing <code>PangoGlyphItem</code> structure.
     */
    public GlyphItem copy() {
        var RESULT = gtk_h.pango_glyph_item_copy(handle());
        return new GlyphItem(References.get(RESULT, true));
    }
    
    /**
     * Frees a <code>PangoGlyphItem</code> and resources to which it points.
     */
    public void free() {
        gtk_h.pango_glyph_item_free(handle());
    }
    
    /**
     * Given a <code>PangoGlyphItem</code> and the corresponding text, determine the
     * width corresponding to each character.
     * 
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * 
     * See also {@link org.pango.GlyphString<code>#getLogicalWidths</code> .
     */
    public void getLogicalWidths(java.lang.String text, int[] logicalWidths) {
        gtk_h.pango_glyph_item_get_logical_widths(handle(), Interop.allocateNativeString(text).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, logicalWidths)).handle());
    }
    
    /**
     * Adds spacing between the graphemes of @glyph_item to
     * give the effect of typographic letter spacing.
     */
    public void letterSpace(java.lang.String text, LogAttr[] logAttrs, int letterSpacing) {
        gtk_h.pango_glyph_item_letter_space(handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeArray(logAttrs).handle(), letterSpacing);
    }
    
    /**
     * Modifies @orig to cover only the text after @split_index, and
     * returns a new item that covers the text before @split_index that
     * used to be in @orig.
     * 
     * You can think of @split_index as the length of the returned item.
     * @split_index may not be 0, and it may not be greater than or equal
     * to the length of @orig (that is, there must be at least one byte
     * assigned to each item, you can&<code>#39</code> t create a zero-length item).
     * 
     * This function is similar in function to pango_item_split() (and uses
     * it internally.)
     */
    public GlyphItem split(java.lang.String text, int splitIndex) {
        var RESULT = gtk_h.pango_glyph_item_split(handle(), Interop.allocateNativeString(text).handle(), splitIndex);
        return new GlyphItem(References.get(RESULT, true));
    }
    
}
