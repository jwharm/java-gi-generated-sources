package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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

    public AttrIterator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_attr_iterator_copy = Interop.downcallHandle(
        "pango_attr_iterator_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy a {@code PangoAttrIterator}.
     */
    public AttrIterator copy() {
        try {
            var RESULT = (MemoryAddress) pango_attr_iterator_copy.invokeExact(handle());
            return new AttrIterator(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_destroy = Interop.downcallHandle(
        "pango_attr_iterator_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroy a {@code PangoAttrIterator} and free all associated memory.
     */
    public void destroy() {
        try {
            pango_attr_iterator_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_get = Interop.downcallHandle(
        "pango_attr_iterator_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Find the current attribute of a particular type
     * at the iterator location.
     * <p>
     * When multiple attributes of the same type overlap,
     * the attribute whose range starts closest to the
     * current location is used.
     */
    public Attribute get(AttrType type) {
        try {
            var RESULT = (MemoryAddress) pango_attr_iterator_get.invokeExact(handle(), type.getValue());
            return new Attribute(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_get_attrs = Interop.downcallHandle(
        "pango_attr_iterator_get_attrs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     */
    public org.gtk.glib.SList getAttrs() {
        try {
            var RESULT = (MemoryAddress) pango_attr_iterator_get_attrs.invokeExact(handle());
            return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_get_font = Interop.downcallHandle(
        "pango_attr_iterator_get_font",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the font and other attributes at the current
     * iterator position.
     */
    public void getFont(FontDescription desc, PointerProxy<Language> language, PointerProxy<org.gtk.glib.SList> extraAttrs) {
        try {
            pango_attr_iterator_get_font.invokeExact(handle(), desc.handle(), language.handle(), extraAttrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_next = Interop.downcallHandle(
        "pango_attr_iterator_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Advance the iterator until the next change of style.
     */
    public boolean next() {
        try {
            var RESULT = (int) pango_attr_iterator_next.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_iterator_range = Interop.downcallHandle(
        "pango_attr_iterator_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the range of the current segment.
     * <p>
     * Note that the stored return values are signed, not unsigned
     * like the values in {@code PangoAttribute}. To deal with this API
     * oversight, stored return values that wouldn't fit into
     * a signed integer are clamped to {@code G_MAXINT}.
     */
    public void range(PointerInteger start, PointerInteger end) {
        try {
            pango_attr_iterator_range.invokeExact(handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
