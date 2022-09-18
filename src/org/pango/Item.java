package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>PangoItem</code> structure stores information about a segment of text.
 * <p>
 * You typically obtain <code>PangoItems</code> by itemizing a piece of text
 * with {@link [func@itemize]}.
 */
public class Item extends io.github.jwharm.javagi.ResourceBase {

    public Item(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_item_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>PangoItem</code> structure initialized to default values.
     */
    public Item() {
        super(constructNew());
    }
    
    /**
     * Add attributes to a <code>PangoItem</code>.
     * 
     * The idea is that you have attributes that don&<code>#39</code> t affect itemization,
     * such as font features, so you filter them out using
     * {@link org.pango.AttrList<code>#filter</code> , itemize your text, then reapply the
     * attributes to the resulting items using this function.
     * 
     * The @iter should be positioned before the range of the item,
     * and will be advanced past it. This function is meant to be called
     * in a loop over the items resulting from itemization, while passing
     * the iter to each call.
     */
    public void applyAttrs(AttrIterator iter) {
        gtk_h.pango_item_apply_attrs(handle(), iter.handle());
    }
    
    /**
     * Copy an existing <code>PangoItem</code> structure.
     */
    public Item copy() {
        var RESULT = gtk_h.pango_item_copy(handle());
        return new Item(References.get(RESULT, true));
    }
    
    /**
     * Free a <code>PangoItem</code> and all associated memory.
     */
    public void free() {
        gtk_h.pango_item_free(handle());
    }
    
    /**
     * Modifies @orig to cover only the text after @split_index, and
     * returns a new item that covers the text before @split_index that
     * used to be in @orig.
     * <p>
     * You can think of @split_index as the length of the returned item.
     * @split_index may not be 0, and it may not be greater than or equal
     * to the length of @orig (that is, there must be at least one byte
     * assigned to each item, you can&<code>#39</code> t create a zero-length item).
     * @split_offset is the length of the first item in chars, and must be
     * provided because the text used to generate the item isn&<code>#39</code> t available,
     * so <code>pango_item_split()</code> can&<code>#39</code> t count the char length of the split items
     * itself.
     */
    public Item split(int splitIndex, int splitOffset) {
        var RESULT = gtk_h.pango_item_split(handle(), splitIndex, splitOffset);
        return new Item(References.get(RESULT, true));
    }
    
}
