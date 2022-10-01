package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.pango_attr_list_new(), true);
        return RESULT;
    }
    
    /**
     * Create a new empty attribute list with a reference
     * count of one.
     */
    public AttrList() {
        super(constructNew());
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
     */
    public void change(Attribute attr) {
        gtk_h.pango_attr_list_change(handle(), attr.refcounted().unowned().handle());
    }
    
    /**
     * Copy {@code list} and return an identical new list.
     */
    public AttrList copy() {
        var RESULT = gtk_h.pango_attr_list_copy(handle());
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks whether {@code list} and {@code other_list} contain the same
     * attributes and whether those attributes apply to the
     * same ranges.
     * <p>
     * Beware that this will return wrong values if any list
     * contains duplicates.
     */
    public boolean equal(AttrList otherList) {
        var RESULT = gtk_h.pango_attr_list_equal(handle(), otherList.handle());
        return RESULT != 0;
    }
    
    /**
     * Given a {@code PangoAttrList} and callback function, removes
     * any elements of {@code list} for which {@code func} returns {@code true} and
     * inserts them into a new list.
     */
    public AttrList filter(AttrFilterFunc func) {
        try {
            var RESULT = gtk_h.pango_attr_list_filter(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbAttrFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return new AttrList(Refcounted.get(RESULT, true));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets a list of all attributes in {@code list}.
     */
    public org.gtk.glib.SList getAttributes() {
        var RESULT = gtk_h.pango_attr_list_get_attributes(handle());
        return new org.gtk.glib.SList(Refcounted.get(RESULT, true));
    }
    
    /**
     * Create a iterator initialized to the beginning of the list.
     * <p>
     * {@code list} must not be modified until this iterator is freed.
     */
    public AttrIterator getIterator() {
        var RESULT = gtk_h.pango_attr_list_get_iterator(handle());
        return new AttrIterator(Refcounted.get(RESULT, true));
    }
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted after all other attributes with a
     * matching {@code start_index}.
     */
    public void insert(Attribute attr) {
        gtk_h.pango_attr_list_insert(handle(), attr.refcounted().unowned().handle());
    }
    
    /**
     * Insert the given attribute into the {@code PangoAttrList}.
     * <p>
     * It will be inserted before all other attributes with a
     * matching {@code start_index}.
     */
    public void insertBefore(Attribute attr) {
        gtk_h.pango_attr_list_insert_before(handle(), attr.refcounted().unowned().handle());
    }
    
    /**
     * Increase the reference count of the given attribute
     * list by one.
     */
    public AttrList ref() {
        var RESULT = gtk_h.pango_attr_list_ref(handle());
        return new AttrList(Refcounted.get(RESULT, true));
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
     */
    public void splice(AttrList other, int pos, int len) {
        gtk_h.pango_attr_list_splice(handle(), other.handle(), pos, len);
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
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_attr_list_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Decrease the reference count of the given attribute
     * list by one.
     * <p>
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public void unref() {
        gtk_h.pango_attr_list_unref(handle());
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
     */
    public void update(int pos, int remove, int add) {
        gtk_h.pango_attr_list_update(handle(), pos, remove, add);
    }
    
    /**
     * Deserializes a {@code PangoAttrList} from a string.
     * <p>
     * This is the counterpart to {@link AttrList#toString}.
     * See that functions for details about the format.
     */
    public static AttrList fromString(java.lang.String text) {
        var RESULT = gtk_h.pango_attr_list_from_string(Interop.allocateNativeString(text).handle());
        return new AttrList(Refcounted.get(RESULT, true));
    }
    
}
