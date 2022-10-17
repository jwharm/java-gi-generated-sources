package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle pango_attr_iterator_copy = Interop.downcallHandle(
        "pango_attr_iterator_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy a {@code PangoAttrIterator}.
     */
    public @NotNull AttrIterator copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_iterator_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrIterator(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_iterator_destroy = Interop.downcallHandle(
        "pango_attr_iterator_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroy a {@code PangoAttrIterator} and free all associated memory.
     */
    public @NotNull void destroy() {
        try {
            pango_attr_iterator_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_iterator_get = Interop.downcallHandle(
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
    public @Nullable Attribute get(@NotNull AttrType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_iterator_get.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Attribute(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_attr_iterator_get_attrs = Interop.downcallHandle(
        "pango_attr_iterator_get_attrs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     */
    public @NotNull org.gtk.glib.SList getAttrs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_iterator_get_attrs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_iterator_get_font = Interop.downcallHandle(
        "pango_attr_iterator_get_font",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the font and other attributes at the current
     * iterator position.
     */
    public @NotNull void getFont(@NotNull FontDescription desc, @NotNull Out<Language> language, @NotNull Out<org.gtk.glib.SList> extraAttrs) {
        MemorySegment languagePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment extraAttrsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_attr_iterator_get_font.invokeExact(handle(), desc.handle(), (Addressable) languagePOINTER.address(), (Addressable) extraAttrsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        language.set(new Language(Refcounted.get(languagePOINTER.get(ValueLayout.ADDRESS, 0), true)));
        extraAttrs.set(new org.gtk.glib.SList(Refcounted.get(extraAttrsPOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle pango_attr_iterator_next = Interop.downcallHandle(
        "pango_attr_iterator_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Advance the iterator until the next change of style.
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) pango_attr_iterator_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_attr_iterator_range = Interop.downcallHandle(
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
    public @NotNull void range(@NotNull Out<Integer> start, @NotNull Out<Integer> end) {
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_attr_iterator_range.invokeExact(handle(), (Addressable) startPOINTER.address(), (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(startPOINTER.get(ValueLayout.JAVA_INT, 0));
        end.set(endPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
}
