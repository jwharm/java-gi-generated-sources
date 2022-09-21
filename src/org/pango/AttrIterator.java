package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoAttrIterator} is used to iterate through a {@code PangoAttrList}.
 * <p>
 * A new iterator is created with {@link AttrList#getIterator}.
 * Once the iterator is created, it can be advanced through the style
 * changes in the text using {@link AttrIterator#next}. At each
 * style change, the range of the current style segment and the attributes
 * currently in effect can be queried.
 */
public class AttrIterator extends io.github.jwharm.javagi.ResourceBase {

    public AttrIterator(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Copy a {@code PangoAttrIterator}.
     */
    public AttrIterator copy() {
        var RESULT = gtk_h.pango_attr_iterator_copy(handle());
        return new AttrIterator(References.get(RESULT, true));
    }
    
    /**
     * Destroy a {@code PangoAttrIterator} and free all associated memory.
     */
    public void destroy() {
        gtk_h.pango_attr_iterator_destroy(handle());
    }
    
    /**
     * Find the current attribute of a particular type
     * at the iterator location.
     * <p>
     * When multiple attributes of the same type overlap,
     * the attribute whose range starts closest to the
     * current location is used.
     */
    public Attribute get(AttrType type) {
        var RESULT = gtk_h.pango_attr_iterator_get(handle(), type.getValue());
        return new Attribute(References.get(RESULT, false));
    }
    
    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     */
    public org.gtk.glib.SList getAttrs() {
        var RESULT = gtk_h.pango_attr_iterator_get_attrs(handle());
        return new org.gtk.glib.SList(References.get(RESULT, true));
    }
    
    /**
     * Get the font and other attributes at the current
     * iterator position.
     */
    public void getFont(FontDescription desc, Language[] language, org.gtk.glib.SList[] extraAttrs) {
        gtk_h.pango_attr_iterator_get_font(handle(), desc.handle(), Interop.allocateNativeArray(language).handle(), Interop.allocateNativeArray(extraAttrs).handle());
    }
    
    /**
     * Advance the iterator until the next change of style.
     */
    public boolean next() {
        var RESULT = gtk_h.pango_attr_iterator_next(handle());
        return (RESULT != 0);
    }
    
}
