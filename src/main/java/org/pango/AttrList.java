package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoAttrList} represents a list of attributes that apply to a section
 * of text.
 * <p>
 * The attributes in a {@code PangoAttrList} are, in general, allowed to overlap in
 * an arbitrary fashion. However, if the attributes are manipulated only through
 * {@link AttrList#change}, the overlap between properties will meet
 * stricter criteria.
 * <p>
 * Since the {@code PangoAttrList} structure is stored as a linear list, it is not
 * suitable for storing attributes for large amounts of text. In general, you
 * should not use a single {@code PangoAttrList} for more than one paragraph of text.
 */
public class AttrList extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AttrList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrList newInstance = new AttrList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AttrList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AttrList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new empty attribute list with a reference
     * count of one.
     */
    public AttrList() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will replace any attributes of the same type
     * on that segment and be merged with any adjoining
     * attributes that are identical.
     * <p>
     * This function is slower than {@link AttrList#insert}
     * for creating an attribute list in order (potentially
     * much slower for large lists). However,
     * {@link AttrList#insert} is not suitable for
     * continually changing a set of attributes since it
     * never removes or combines existing attributes.
     * @param attr the attribute to insert
     */
    public void change(@NotNull org.pango.Attribute attr) {
        java.util.Objects.requireNonNull(attr, "Parameter 'attr' must not be null");
        try {
            DowncallHandles.pango_attr_list_change.invokeExact(
                    handle(),
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        attr.yieldOwnership();
    }
    
    /**
     * Copy {@code list} and return an identical new list.
     * @return the newly allocated
     *   {@code PangoAttrList}, with a reference count of one,
     *   which should be freed with {@link AttrList#unref}.
     *   Returns {@code null} if {@code list} was {@code null}.
     */
    public @Nullable org.pango.AttrList copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks whether {@code list} and {@code other_list} contain the same
     * attributes and whether those attributes apply to the
     * same ranges.
     * <p>
     * Beware that this will return wrong values if any list
     * contains duplicates.
     * @param otherList the other {@code PangoAttrList}
     * @return {@code true} if the lists are equal, {@code false} if
     *   they aren't
     */
    public boolean equal(@NotNull org.pango.AttrList otherList) {
        java.util.Objects.requireNonNull(otherList, "Parameter 'otherList' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attr_list_equal.invokeExact(
                    handle(),
                    otherList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Given a {@code PangoAttrList} and callback function, removes
     * any elements of {@code list} for which {@code func} returns {@code true} and
     * inserts them into a new list.
     * @param func callback function;
     *   returns {@code true} if an attribute should be filtered out
     * @return the new
     *   {@code PangoAttrList} or {@code null} if no attributes of the
     *   given types were found
     */
    public @Nullable org.pango.AttrList filter(@NotNull org.pango.AttrFilterFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_filter.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.Callbacks.class, "cbAttrFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of all attributes in {@code list}.
     * @return a list of all attributes in {@code list}. To free this value,
     *   call {@link Attribute#destroy} on each value and
     *   g_slist_free() on the list.
     */
    public @NotNull org.gtk.glib.SList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a iterator initialized to the beginning of the list.
     * <p>
     * {@code list} must not be modified until this iterator is freed.
     * @return the newly allocated
     *   {@code PangoAttrIterator}, which should be freed with
     *   {@link AttrIterator#destroy}
     */
    public @NotNull org.pango.AttrIterator getIterator() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_get_iterator.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrIterator(RESULT, Ownership.FULL);
    }
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted after all other attributes with a
     * matching {@code start_index}.
     * @param attr the attribute to insert
     */
    public void insert(@NotNull org.pango.Attribute attr) {
        java.util.Objects.requireNonNull(attr, "Parameter 'attr' must not be null");
        try {
            DowncallHandles.pango_attr_list_insert.invokeExact(
                    handle(),
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        attr.yieldOwnership();
    }
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted before all other attributes with a
     * matching {@code start_index}.
     * @param attr the attribute to insert
     */
    public void insertBefore(@NotNull org.pango.Attribute attr) {
        java.util.Objects.requireNonNull(attr, "Parameter 'attr' must not be null");
        try {
            DowncallHandles.pango_attr_list_insert_before.invokeExact(
                    handle(),
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        attr.yieldOwnership();
    }
    
    /**
     * Increase the reference count of the given attribute
     * list by one.
     * @return The attribute list passed in
     */
    public @NotNull org.pango.AttrList ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    /**
     * This function opens up a hole in {@code list}, fills it
     * in with attributes from the left, and then merges
     * {@code other} on top of the hole.
     * <p>
     * This operation is equivalent to stretching every attribute
     * that applies at position {@code pos} in {@code list} by an amount {@code len},
     * and then calling {@link AttrList#change} with a copy
     * of each attribute in {@code other} in sequence (offset in position
     * by {@code pos}, and limited in length to {@code len}).
     * <p>
     * This operation proves useful for, for instance, inserting
     * a pre-edit string in the middle of an edit buffer.
     * <p>
     * For backwards compatibility, the function behaves differently
     * when {@code len} is 0. In this case, the attributes from {@code other} are
     * not imited to {@code len}, and are just overlayed on top of {@code list}.
     * <p>
     * This mode is useful for merging two lists of attributes together.
     * @param other another {@code PangoAttrList}
     * @param pos the position in {@code list} at which to insert {@code other}
     * @param len the length of the spliced segment. (Note that this
     *   must be specified since the attributes in {@code other} may only
     *   be present at some subsection of this range)
     */
    public void splice(@NotNull org.pango.AttrList other, int pos, int len) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.pango_attr_list_splice.invokeExact(
                    handle(),
                    other.handle(),
                    pos,
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serializes a {@code PangoAttrList} to a string.
     * <p>
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * <p>
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     * @return a newly allocated string
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Decrease the reference count of the given attribute
     * list by one.
     * <p>
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public void unref() {
        try {
            DowncallHandles.pango_attr_list_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update indices of attributes in {@code list} for a change in the
     * text they refer to.
     * <p>
     * The change that this function applies is removing {@code remove}
     * bytes at position {@code pos} and inserting {@code add} bytes instead.
     * <p>
     * Attributes that fall entirely in the ({@code pos}, {@code pos} + {@code remove})
     * range are removed.
     * <p>
     * Attributes that start or end inside the ({@code pos}, {@code pos} + {@code remove})
     * range are shortened to reflect the removal.
     * <p>
     * Attributes start and end positions are updated if they are
     * behind {@code pos} + {@code remove}.
     * @param pos the position of the change
     * @param remove the number of removed bytes
     * @param add the number of added bytes
     */
    public void update(int pos, int remove, int add) {
        try {
            DowncallHandles.pango_attr_list_update.invokeExact(
                    handle(),
                    pos,
                    remove,
                    add);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deserializes a {@code PangoAttrList} from a string.
     * <p>
     * This is the counterpart to {@link AttrList#toString}.
     * See that functions for details about the format.
     * @param text a string
     * @return a new {@code PangoAttrList}
     */
    public static @Nullable org.pango.AttrList fromString(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_from_string.invokeExact(
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_list_new = Interop.downcallHandle(
            "pango_attr_list_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_change = Interop.downcallHandle(
            "pango_attr_list_change",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_copy = Interop.downcallHandle(
            "pango_attr_list_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_equal = Interop.downcallHandle(
            "pango_attr_list_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_filter = Interop.downcallHandle(
            "pango_attr_list_filter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_get_attributes = Interop.downcallHandle(
            "pango_attr_list_get_attributes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_get_iterator = Interop.downcallHandle(
            "pango_attr_list_get_iterator",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_insert = Interop.downcallHandle(
            "pango_attr_list_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_insert_before = Interop.downcallHandle(
            "pango_attr_list_insert_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_ref = Interop.downcallHandle(
            "pango_attr_list_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_splice = Interop.downcallHandle(
            "pango_attr_list_splice",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle pango_attr_list_to_string = Interop.downcallHandle(
            "pango_attr_list_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_unref = Interop.downcallHandle(
            "pango_attr_list_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_list_update = Interop.downcallHandle(
            "pango_attr_list_update",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle pango_attr_list_from_string = Interop.downcallHandle(
            "pango_attr_list_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
