package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoItem` structure stores information about a segment of text.
 * 
 * You typically obtain `PangoItems` by itemizing a piece of text
 * with [func@itemize].
 */
public class Item extends io.github.jwharm.javagi.interop.ResourceBase {

    public Item(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new `PangoItem` structure initialized to default values.
     */
    public Item() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_item_new(), true));
    }
    
    /**
     * Add attributes to a `PangoItem`.
     * 
     * The idea is that you have attributes that don't affect itemization,
     * such as font features, so you filter them out using
     * [method@Pango.AttrList.filter], itemize your text, then reapply the
     * attributes to the resulting items using this function.
     * 
     * The @iter should be positioned before the range of the item,
     * and will be advanced past it. This function is meant to be called
     * in a loop over the items resulting from itemization, while passing
     * the iter to each call.
     */
    public void applyAttrs(AttrIterator iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_item_apply_attrs(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Copy an existing `PangoItem` structure.
     */
    public Item copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_item_copy(HANDLE());
        return new Item(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Free a `PangoItem` and all associated memory.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_item_free(HANDLE());
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
     * @split_offset is the length of the first item in chars, and must be
     * provided because the text used to generate the item isn't available,
     * so `pango_item_split()` can't count the char length of the split items
     * itself.
     */
    public Item split(int splitIndex, int splitOffset) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_item_split(HANDLE(), splitIndex, splitOffset);
        return new Item(ProxyFactory.getProxy(RESULT, true));
    }
    
}
