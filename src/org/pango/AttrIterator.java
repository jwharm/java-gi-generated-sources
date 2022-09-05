package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoAttrIterator` is used to iterate through a `PangoAttrList`.
 * 
 * A new iterator is created with [method@Pango.AttrList.get_iterator].
 * Once the iterator is created, it can be advanced through the style
 * changes in the text using [method@Pango.AttrIterator.next]. At each
 * style change, the range of the current style segment and the attributes
 * currently in effect can be queried.
 */
public class AttrIterator extends io.github.jwharm.javagi.interop.ResourceBase {

    public AttrIterator(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Copy a `PangoAttrIterator`.
     */
    public AttrIterator copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_copy(HANDLE());
        return new AttrIterator(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Destroy a `PangoAttrIterator` and free all associated memory.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_destroy(HANDLE());
    }
    
    /**
     * Find the current attribute of a particular type
     * at the iterator location.
     * 
     * When multiple attributes of the same type overlap,
     * the attribute whose range starts closest to the
     * current location is used.
     */
    public Attribute get(AttrType type) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_get(HANDLE(), type.getValue());
        return new Attribute(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     */
    public org.gtk.glib.SList getAttrs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_get_attrs(HANDLE());
        return new org.gtk.glib.SList(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Get the font and other attributes at the current
     * iterator position.
     */
    public void getFont(FontDescription desc, Language[] language, org.gtk.glib.SList[] extraAttrs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_get_font(HANDLE(), desc.HANDLE(), Interop.allocateNativeArray(language), Interop.allocateNativeArray(extraAttrs));
    }
    
    /**
     * Advance the iterator until the next change of style.
     */
    public boolean next() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attr_iterator_next(HANDLE());
        return (RESULT != 0);
    }
    
}
