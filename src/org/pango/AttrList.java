package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoAttrList</code> represents a list of attributes that apply to a section
 * of text.
 * <p>
 * The attributes in a <code>PangoAttrList</code> are, in general, allowed to overlap in
 * an arbitrary fashion. However, if the attributes are manipulated only through
 * {@link org.pango.AttrList#change}, the overlap between properties will meet
 * stricter criteria.
 * <p>
 * Since the <code>PangoAttrList</code> structure is stored as a linear list, it is not
 * suitable for storing attributes for large amounts of text. In general, you
 * should not use a single <code>PangoAttrList</code> for more than one paragraph of text.
 */
public class AttrList extends io.github.jwharm.javagi.ResourceBase {

    public AttrList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_attr_list_new(), true);
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
     * Insert the given attribute into the <code>PangoAttrList</code>.
     * 
     * It will replace any attributes of the same type
     * on that segment and be merged with any adjoining
     * attributes that are identical.
     * 
     * This function is slower than {@link org.pango.AttrList#insert}
     * for creating an attribute list in order (potentially
     * much slower for large lists). However,
     * {@link org.pango.AttrList#insert} is not suitable for
     * continually changing a set of attributes since it
     * never removes or combines existing attributes.
     */
    public void change(Attribute attr) {
        gtk_h.pango_attr_list_change(handle(), attr.handle());
    }
    
    /**
     * Copy @list and return an identical new list.
     */
    public AttrList copy() {
        var RESULT = gtk_h.pango_attr_list_copy(handle());
        return new AttrList(References.get(RESULT, true));
    }
    
    /**
     * Checks whether @list and @other_list contain the same
     * attributes and whether those attributes apply to the
     * same ranges.
     * 
     * Beware that this will return wrong values if any list
     * contains duplicates.
     */
    public boolean equal(AttrList otherList) {
        var RESULT = gtk_h.pango_attr_list_equal(handle(), otherList.handle());
        return (RESULT != 0);
    }
    
    /**
     * Given a <code>PangoAttrList</code> and callback function, removes
     * any elements of @list for which @func returns <code>true</code> and
     * inserts them into a new list.
     */
    public AttrList filter(AttrFilterFunc func) {
        try {
            var RESULT = gtk_h.pango_attr_list_filter(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAttrFilterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return new AttrList(References.get(RESULT, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets a list of all attributes in @list.
     */
    public org.gtk.glib.SList getAttributes() {
        var RESULT = gtk_h.pango_attr_list_get_attributes(handle());
        return new org.gtk.glib.SList(References.get(RESULT, true));
    }
    
    /**
     * Create a iterator initialized to the beginning of the list.
     * 
     * @list must not be modified until this iterator is freed.
     */
    public AttrIterator getIterator() {
        var RESULT = gtk_h.pango_attr_list_get_iterator(handle());
        return new AttrIterator(References.get(RESULT, true));
    }
    
    /**
     * Insert the given attribute into the <code>PangoAttrList</code>.
     * 
     * It will be inserted after all other attributes with a
     * matching @start_index.
     */
    public void insert(Attribute attr) {
        gtk_h.pango_attr_list_insert(handle(), attr.handle());
    }
    
    /**
     * Insert the given attribute into the <code>PangoAttrList</code>.
     * 
     * It will be inserted before all other attributes with a
     * matching @start_index.
     */
    public void insertBefore(Attribute attr) {
        gtk_h.pango_attr_list_insert_before(handle(), attr.handle());
    }
    
    /**
     * Increase the reference count of the given attribute
     * list by one.
     */
    public AttrList ref() {
        var RESULT = gtk_h.pango_attr_list_ref(handle());
        return new AttrList(References.get(RESULT, true));
    }
    
    /**
     * This function opens up a hole in @list, fills it
     * in with attributes from the left, and then merges
     * @other on top of the hole.
     * 
     * This operation is equivalent to stretching every attribute
     * that applies at position @pos in @list by an amount @len,
     * and then calling {@link org.pango.AttrList#change} with a copy
     * of each attribute in @other in sequence (offset in position
     * by @pos, and limited in length to @len).
     * 
     * This operation proves useful for, for instance, inserting
     * a pre-edit string in the middle of an edit buffer.
     * 
     * For backwards compatibility, the function behaves differently
     * when @len is 0. In this case, the attributes from @other are
     * not imited to @len, and are just overlayed on top of @list.
     * 
     * This mode is useful for merging two lists of attributes together.
     */
    public void splice(AttrList other, int pos, int len) {
        gtk_h.pango_attr_list_splice(handle(), other.handle(), pos, len);
    }
    
    /**
     * Serializes a <code>PangoAttrList</code> to a string.
     * 
     * No guarantees are made about the format of the string,
     * it may change between Pango versions.
     * 
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
     * 
     * If the result is zero, free the attribute list
     * and the attributes it contains.
     */
    public void unref() {
        gtk_h.pango_attr_list_unref(handle());
    }
    
    /**
     * Update indices of attributes in @list for a change in the
     * text they refer to.
     * 
     * The change that this function applies is removing @remove
     * bytes at position @pos and inserting @add bytes instead.
     * 
     * Attributes that fall entirely in the (@pos, @pos + @remove)
     * range are removed.
     * 
     * Attributes that start or end inside the (@pos, @pos + @remove)
     * range are shortened to reflect the removal.
     * 
     * Attributes start and end positions are updated if they are
     * behind @pos + @remove.
     */
    public void update(int pos, int remove, int add) {
        gtk_h.pango_attr_list_update(handle(), pos, remove, add);
    }
    
    /**
     * Deserializes a <code>PangoAttrList</code> from a string.
     * 
     * This is the counterpart to {@link org.pango.AttrList#toString}.
     * See that functions for details about the format.
     */
    public static AttrList fromString(java.lang.String text) {
        var RESULT = gtk_h.pango_attr_list_from_string(Interop.allocateNativeString(text).handle());
        return new AttrList(References.get(RESULT, true));
    }
    
}
