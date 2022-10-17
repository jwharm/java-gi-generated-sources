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
public class AttrList extends io.github.jwharm.javagi.ResourceBase {

    public AttrList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_attr_list_new = Interop.downcallHandle(
        "pango_attr_list_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_attr_list_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new empty attribute list with a reference
     * count of one.
     */
    public AttrList() {
        super(constructNew());
    }
    
    private static final MethodHandle pango_attr_list_change = Interop.downcallHandle(
        "pango_attr_list_change",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void change(@NotNull Attribute attr) {
        try {
            pango_attr_list_change.invokeExact(handle(), attr.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_copy = Interop.downcallHandle(
        "pango_attr_list_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy {@code list} and return an identical new list.
     */
    public @Nullable AttrList copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_list_equal = Interop.downcallHandle(
        "pango_attr_list_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code list} and {@code other_list} contain the same
     * attributes and whether those attributes apply to the
     * same ranges.
     * <p>
     * Beware that this will return wrong values if any list
     * contains duplicates.
     */
    public boolean equal(@NotNull AttrList otherList) {
        int RESULT;
        try {
            RESULT = (int) pango_attr_list_equal.invokeExact(handle(), otherList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_attr_list_filter = Interop.downcallHandle(
        "pango_attr_list_filter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given a {@code PangoAttrList} and callback function, removes
     * any elements of {@code list} for which {@code func} returns {@code true} and
     * inserts them into a new list.
     */
    public @Nullable AttrList filter(@NotNull AttrFilterFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_filter.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbAttrFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_list_get_attributes = Interop.downcallHandle(
        "pango_attr_list_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all attributes in {@code list}.
     */
    public @NotNull org.gtk.glib.SList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_list_get_iterator = Interop.downcallHandle(
        "pango_attr_list_get_iterator",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a iterator initialized to the beginning of the list.
     * <p>
     * {@code list} must not be modified until this iterator is freed.
     */
    public @NotNull AttrIterator getIterator() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_get_iterator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrIterator(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_list_insert = Interop.downcallHandle(
        "pango_attr_list_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted after all other attributes with a
     * matching {@code start_index}.
     */
    public @NotNull void insert(@NotNull Attribute attr) {
        try {
            pango_attr_list_insert.invokeExact(handle(), attr.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_insert_before = Interop.downcallHandle(
        "pango_attr_list_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted before all other attributes with a
     * matching {@code start_index}.
     */
    public @NotNull void insertBefore(@NotNull Attribute attr) {
        try {
            pango_attr_list_insert_before.invokeExact(handle(), attr.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_ref = Interop.downcallHandle(
        "pango_attr_list_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of the given attribute
     * list by one.
     */
    public @NotNull AttrList ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_attr_list_splice = Interop.downcallHandle(
        "pango_attr_list_splice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void splice(@NotNull AttrList other, @NotNull int pos, @NotNull int len) {
        try {
            pango_attr_list_splice.invokeExact(handle(), other.handle(), pos, len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_to_string = Interop.downcallHandle(
        "pango_attr_list_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serializes a {@code PangoAttrList} to a string.
     * <p>
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * <p>
     * The intended use of this function is testing and
     * debugging. The format is not meant as a permanent
     * storage format.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_attr_list_unref = Interop.downcallHandle(
        "pango_attr_list_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of the given attribute
     * list by one.
     * <p>
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public @NotNull void unref() {
        try {
            pango_attr_list_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_update = Interop.downcallHandle(
        "pango_attr_list_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void update(@NotNull int pos, @NotNull int remove, @NotNull int add) {
        try {
            pango_attr_list_update.invokeExact(handle(), pos, remove, add);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_attr_list_from_string = Interop.downcallHandle(
        "pango_attr_list_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deserializes a {@code PangoAttrList} from a string.
     * <p>
     * This is the counterpart to {@link AttrList#toString}.
     * See that functions for details about the format.
     */
    public static @Nullable AttrList fromString(@NotNull java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_attr_list_from_string.invokeExact(Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
}
