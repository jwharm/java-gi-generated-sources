package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GList struct is used for each element in a doubly-linked list.
 */
public class List extends io.github.jwharm.javagi.interop.ResourceBase {

    public List(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates space for one #GList element. It is called by
     * g_list_append(), g_list_prepend(), g_list_insert() and
     * g_list_insert_sorted() and so is rarely used on its own.
     */
    public static org.gtk.glib.List alloc() {
        var RESULT = gtk_h.g_list_alloc();
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a new element on to the end of the list.
     * 
     * Note that the return value is the new start of the list,
     * if @list was empty; make sure you store the new value.
     * 
     * g_list_append() has to traverse the entire list to find the end,
     * which is inefficient when adding multiple elements. A common idiom
     * to avoid the inefficiency is to use g_list_prepend() and reverse
     * the list with g_list_reverse() when all elements have been added.
     * 
     * |[<!-- language="C" -->
     * // Notice that these are initialized to the empty list.
     * GList *string_list = NULL, *number_list = NULL;
     * 
     * // This is a list of strings.
     * string_list = g_list_append (string_list, "first");
     * string_list = g_list_append (string_list, "second");
     * 
     * // This is a list of integers.
     * number_list = g_list_append (number_list, GINT_TO_POINTER (27));
     * number_list = g_list_append (number_list, GINT_TO_POINTER (14));
     * ]|
     */
    public static org.gtk.glib.List append(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_append(list.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds the second #GList onto the end of the first #GList.
     * Note that the elements of the second #GList are not copied.
     * They are used directly.
     * 
     * This function is for example used to move an element in the list.
     * The following example moves an element to the top of the list:
     * |[<!-- language="C" -->
     * list = g_list_remove_link (list, llink);
     * list = g_list_concat (llink, list);
     * ]|
     */
    public static org.gtk.glib.List concat(org.gtk.glib.List list1, org.gtk.glib.List list2) {
        var RESULT = gtk_h.g_list_concat(list1.handle(), list2.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Copies a #GList.
     * 
     * Note that this is a "shallow" copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data is not. See g_list_copy_deep() if you need
     * to copy the data as well.
     */
    public static org.gtk.glib.List copy(org.gtk.glib.List list) {
        var RESULT = gtk_h.g_list_copy(list.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Makes a full (deep) copy of a #GList.
     * 
     * In contrast with g_list_copy(), this function uses @func to make
     * a copy of each list element, in addition to copying the list
     * container itself.
     * 
     * @func, as a #GCopyFunc, takes two arguments, the data to be copied
     * and a @user_data pointer. On common processor architectures, it's safe to
     * pass %NULL as @user_data if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC’s
     * `-Wcast-function-type` warning.
     * 
     * For instance, if @list holds a list of GObjects, you can do:
     * |[<!-- language="C" -->
     * another_list = g_list_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * ]|
     * 
     * And, to entirely free the new list, you could do:
     * |[<!-- language="C" -->
     * g_list_free_full (another_list, g_object_unref);
     * ]|
     */
    public org.gtk.glib.List copyDeep(org.gtk.glib.List list, CopyFunc func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCopyFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_list_copy_deep(list.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes the node link_ from the list and frees it.
     * Compare this to g_list_remove_link() which removes the node
     * without freeing it.
     */
    public static org.gtk.glib.List deleteLink(org.gtk.glib.List list, org.gtk.glib.List link) {
        var RESULT = gtk_h.g_list_delete_link(list.handle(), link.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Finds the element in a #GList which contains the given data.
     */
    public static org.gtk.glib.List find(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_find(list.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Finds an element in a #GList, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two #gconstpointer arguments,
     * the #GList element's data as the first argument and the
     * given user data.
     */
    /**
     * Gets the first element in a #GList.
     */
    public static org.gtk.glib.List first(org.gtk.glib.List list) {
        var RESULT = gtk_h.g_list_first(list.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Calls a function for each element of a #GList.
     * 
     * It is safe for @func to remove the element from @list, but it must
     * not modify any part of the list after that element.
     */
    public void foreach(org.gtk.glib.List list, Func func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_list_foreach(list.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees all of the memory used by a #GList.
     * The freed elements are returned to the slice allocator.
     * 
     * If list elements contain dynamically-allocated memory, you should
     * either use g_list_free_full() or free them manually first.
     * 
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling:
     * |[<!-- language="C" -->
     * GList *list_of_borrowed_things = …;  /<!-- -->* (transfer container) *<!-- -->/
     * g_list_free (g_steal_pointer (&list_of_borrowed_things));
     * ]|
     */
    public static void free(org.gtk.glib.List list) {
        gtk_h.g_list_free(list.handle());
    }
    
    /**
     * Frees one #GList element, but does not update links from the next and
     * previous elements in the list, so you should not call this function on an
     * element that is currently part of a list.
     * 
     * It is usually used after g_list_remove_link().
     */
    public static void free1(org.gtk.glib.List list) {
        gtk_h.g_list_free_1(list.handle());
    }
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     */
    public static int index(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_index(list.handle(), data);
        return RESULT;
    }
    
    /**
     * Inserts a new element into the list at the given position.
     */
    public static org.gtk.glib.List insert(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data, int position) {
        var RESULT = gtk_h.g_list_insert(list.handle(), data, position);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Inserts a new element into the list before the given position.
     */
    public static org.gtk.glib.List insertBefore(org.gtk.glib.List list, org.gtk.glib.List sibling, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_insert_before(list.handle(), sibling.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Inserts @link_ into the list before the given position.
     */
    public static org.gtk.glib.List insertBeforeLink(org.gtk.glib.List list, org.gtk.glib.List sibling, org.gtk.glib.List link) {
        var RESULT = gtk_h.g_list_insert_before_link(list.handle(), sibling.handle(), link.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * 
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     */
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * 
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     */
    public org.gtk.glib.List insertSortedWithData(org.gtk.glib.List list, CompareDataFunc func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_list_insert_sorted_with_data(list.handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the last element in a #GList.
     */
    public static org.gtk.glib.List last(org.gtk.glib.List list) {
        var RESULT = gtk_h.g_list_last(list.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of elements in a #GList.
     * 
     * This function iterates over the whole list to count its elements.
     * Use a #GQueue instead of a GList if you regularly need the number
     * of items. To check whether the list is non-empty, it is faster to check
     * @list against %NULL.
     */
    public static int length(org.gtk.glib.List list) {
        var RESULT = gtk_h.g_list_length(list.handle());
        return RESULT;
    }
    
    /**
     * Gets the element at the given position in a #GList.
     * 
     * This iterates over the list until it reaches the @n-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the #GList introduction.
     */
    public static org.gtk.glib.List nth(org.gtk.glib.List list, int n) {
        var RESULT = gtk_h.g_list_nth(list.handle(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the data of the element at the given position.
     * 
     * This iterates over the list until it reaches the @n-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the #GList introduction.
     */
    public static jdk.incubator.foreign.MemoryAddress nthData(org.gtk.glib.List list, int n) {
        var RESULT = gtk_h.g_list_nth_data(list.handle(), n);
        return RESULT;
    }
    
    /**
     * Gets the element @n places before @list.
     */
    public static org.gtk.glib.List nthPrev(org.gtk.glib.List list, int n) {
        var RESULT = gtk_h.g_list_nth_prev(list.handle(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the position of the given element
     * in the #GList (starting from 0).
     */
    public static int position(org.gtk.glib.List list, org.gtk.glib.List llink) {
        var RESULT = gtk_h.g_list_position(list.handle(), llink.handle());
        return RESULT;
    }
    
    /**
     * Prepends a new element on to the start of the list.
     * 
     * Note that the return value is the new start of the list,
     * which will have changed, so make sure you store the new value.
     * 
     * |[<!-- language="C" -->
     * // Notice that it is initialized to the empty list.
     * GList *list = NULL;
     * 
     * list = g_list_prepend (list, "last");
     * list = g_list_prepend (list, "first");
     * ]|
     * 
     * Do not use this function to prepend a new element to a different
     * element than the start of the list. Use g_list_insert_before() instead.
     */
    public static org.gtk.glib.List prepend(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_prepend(list.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes an element from a #GList.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the #GList is unchanged.
     */
    public static org.gtk.glib.List remove(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_remove(list.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes all list nodes with data equal to @data.
     * Returns the new head of the list. Contrast with
     * g_list_remove() which removes only the first node
     * matching the given data.
     */
    public static org.gtk.glib.List removeAll(org.gtk.glib.List list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_list_remove_all(list.handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes an element from a #GList, without freeing the element.
     * The removed element's prev and next links are set to %NULL, so
     * that it becomes a self-contained list with one element.
     * 
     * This function is for example used to move an element in the list
     * (see the example for g_list_concat()) or to remove an element in
     * the list before freeing its data:
     * |[<!-- language="C" -->
     * list = g_list_remove_link (list, llink);
     * free_some_data_that_may_access_the_list_again (llink->data);
     * g_list_free (llink);
     * ]|
     */
    public static org.gtk.glib.List removeLink(org.gtk.glib.List list, org.gtk.glib.List llink) {
        var RESULT = gtk_h.g_list_remove_link(list.handle(), llink.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Reverses a #GList.
     * It simply switches the next and prev pointers of each element.
     */
    public static org.gtk.glib.List reverse(org.gtk.glib.List list) {
        var RESULT = gtk_h.g_list_reverse(list.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Like g_list_sort(), but the comparison function accepts
     * a user data argument.
     */
    public org.gtk.glib.List sortWithData(org.gtk.glib.List list, CompareDataFunc compareFunc) {
        try {
            int hash = compareFunc.hashCode();
            Interop.signalRegistry.put(hash, compareFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_list_sort_with_data(list.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
