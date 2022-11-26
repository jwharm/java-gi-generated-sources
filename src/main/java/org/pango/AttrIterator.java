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
public class AttrIterator extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrIterator";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrIterator}
     * @return A new, uninitialized @{link AttrIterator}
     */
    public static AttrIterator allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrIterator newInstance = new AttrIterator(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AttrIterator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AttrIterator(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Copy a {@code PangoAttrIterator}.
     * @return the newly allocated
     *   {@code PangoAttrIterator}, which should be freed with
     *   {@link AttrIterator#destroy}
     */
    public @NotNull org.pango.AttrIterator copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_iterator_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrIterator(RESULT, Ownership.FULL);
    }
    
    /**
     * Destroy a {@code PangoAttrIterator} and free all associated memory.
     */
    public void destroy() {
        try {
            DowncallHandles.pango_attr_iterator_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Find the current attribute of a particular type
     * at the iterator location.
     * <p>
     * When multiple attributes of the same type overlap,
     * the attribute whose range starts closest to the
     * current location is used.
     * @param type the type of attribute to find
     * @return the current
     *   attribute of the given type, or {@code null} if no attribute
     *   of that type applies to the current location.
     */
    public @Nullable org.pango.Attribute get(@NotNull org.pango.AttrType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_iterator_get.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     * @return a list of all attributes for the current range. To free
     *   this value, call {@link Attribute#destroy} on each
     *   value and g_slist_free() on the list.
     */
    public @NotNull org.gtk.glib.SList getAttrs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_iterator_get_attrs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the font and other attributes at the current
     * iterator position.
     * @param desc a {@code PangoFontDescription} to fill in with the current
     *   values. The family name in this structure will be set using
     *   {@link FontDescription#setFamilyStatic} using
     *   values from an attribute in the {@code PangoAttrList} associated
     *   with the iterator, so if you plan to keep it around, you
     *   must call:
     *   {@code pango_font_description_set_family (desc, pango_font_description_get_family (desc))}.
     * @param language location to store language tag
     *   for item, or {@code null} if none is found.
     * @param extraAttrs location in which to store a list of non-font attributes
     *   at the the current position; only the highest priority
     *   value of each attribute will be added to this list. In
     *   order to free this value, you must call
     *   {@link Attribute#destroy} on each member.
     */
    public void getFont(@NotNull org.pango.FontDescription desc, @NotNull PointerProxy<org.pango.Language> language, @NotNull PointerProxy<org.gtk.glib.SList> extraAttrs) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        java.util.Objects.requireNonNull(extraAttrs, "Parameter 'extraAttrs' must not be null");
        try {
            DowncallHandles.pango_attr_iterator_get_font.invokeExact(
                    handle(),
                    desc.handle(),
                    language.handle(),
                    extraAttrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Advance the iterator until the next change of style.
     * @return {@code false} if the iterator is at the end
     *   of the list, otherwise {@code true}
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attr_iterator_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the range of the current segment.
     * <p>
     * Note that the stored return values are signed, not unsigned
     * like the values in {@code PangoAttribute}. To deal with this API
     * oversight, stored return values that wouldn't fit into
     * a signed integer are clamped to {@code G_MAXINT}.
     * @param start location to store the start of the range
     * @param end location to store the end of the range
     */
    public void range(Out<Integer> start, Out<Integer> end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        MemorySegment startPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemorySegment endPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_attr_iterator_range.invokeExact(
                    handle(),
                    (Addressable) startPOINTER.address(),
                    (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(startPOINTER.get(Interop.valueLayout.C_INT, 0));
        end.set(endPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_iterator_copy = Interop.downcallHandle(
            "pango_attr_iterator_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_destroy = Interop.downcallHandle(
            "pango_attr_iterator_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_get = Interop.downcallHandle(
            "pango_attr_iterator_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_get_attrs = Interop.downcallHandle(
            "pango_attr_iterator_get_attrs",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_get_font = Interop.downcallHandle(
            "pango_attr_iterator_get_font",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_next = Interop.downcallHandle(
            "pango_attr_iterator_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_iterator_range = Interop.downcallHandle(
            "pango_attr_iterator_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AttrIterator struct;
        
         /**
         * A {@link AttrIterator.Build} object constructs a {@link AttrIterator} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AttrIterator.allocate();
        }
        
         /**
         * Finish building the {@link AttrIterator} struct.
         * @return A new instance of {@code AttrIterator} with the fields 
         *         that were set in the Build object.
         */
        public AttrIterator construct() {
            return struct;
        }
    }
}
