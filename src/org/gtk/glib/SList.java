package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GSList struct is used for each element in the singly-linked
 * list.
 */
public class SList extends io.github.jwharm.javagi.ResourceBase {

    public SList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates space for one #GSList element. It is called by the
     * g_slist_append(), g_slist_prepend(), g_slist_insert() and
     * g_slist_insert_sorted() functions and so is rarely used on its own.
     */
    public static org.gtk.glib.SList alloc() {
        var RESULT = gtk_h.g_slist_alloc();
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Adds a new element on to the end of the list.
     * 
     * The return value is the new start of the list, which may
     * have changed, so make sure you store the new value.
     * 
     * Note that g_slist_append() has to traverse the entire list
     * to find the end, which is inefficient when adding multiple
     * elements. A common idiom to avoid the inefficiency is to prepend
     * the elements and reverse the list when all elements have been added.
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * // Notice that these are initialized to the empty list.
     * GSList *list = NULL, *number_list = NULL;
     * 
     * // This is a list of strings.
     * list = g_slist_append (list, &#34;first&#34;);
     * list = g_slist_append (list, &#34;second&#34;);
     * 
     * // This is a list of integers.
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (27));
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (14));
     * ]}|
     */
    public static org.gtk.glib.SList append(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_append(list.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Adds the second #GSList onto the end of the first #GSList.
     * Note that the elements of the second #GSList are not copied.
     * They are used directly.
     */
    public static org.gtk.glib.SList concat(org.gtk.glib.SList list1, org.gtk.glib.SList list2) {
        var RESULT = gtk_h.g_slist_concat(list1.handle(), list2.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Copies a #GSList.
     * 
     * Note that this is a &#34;shallow&#34; copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data isn&#39;t. See g_slist_copy_deep() if you need
     * to copy the data as well.
     */
    public static org.gtk.glib.SList copy(org.gtk.glib.SList list) {
        var RESULT = gtk_h.g_slist_copy(list.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Makes a full (deep) copy of a #GSList.
     * <p>
     * In contrast with g_slist_copy(), this function uses @func to make a copy of
     * each list element, in addition to copying the list container itself.
     * <p>
     * @func, as a #GCopyFunc, takes two arguments, the data to be copied
     * and a @user_data pointer. On common processor architectures, it&#39;s safe to
     * pass <code>null</code> as @user_data if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC&#8217;s<code>-Wcast-function-type</code> warning.
     * 
     * For instance, if @list holds a list of GObjects, you can do:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * another_list = g_slist_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * ]}|
     * 
     * And, to entirely free the new list, you could do:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * g_slist_free_full (another_list, g_object_unref);
     * ]}|
     */
    public static org.gtk.glib.SList copyDeep(org.gtk.glib.SList list, CopyFunc func) {
        try {
            var RESULT = gtk_h.g_slist_copy_deep(list.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return new org.gtk.glib.SList(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes the node link_ from the list and frees it.
     * Compare this to g_slist_remove_link() which removes the node
     * without freeing it.
     * 
     * Removing arbitrary nodes from a singly-linked list requires time
     * that is proportional to the length of the list (ie. O(n)). If you
     * find yourself using g_slist_delete_link() frequently, you should
     * consider a different data structure, such as the doubly-linked
     * #GList.
     */
    public static org.gtk.glib.SList deleteLink(org.gtk.glib.SList list, org.gtk.glib.SList link) {
        var RESULT = gtk_h.g_slist_delete_link(list.handle(), link.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Finds the element in a #GSList which
     * contains the given data.
     */
    public static org.gtk.glib.SList find(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_find(list.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Finds an element in a #GSList, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two #gconstpointer arguments,
     * the #GSList element&#39;s data as the first argument and the
     * given user data.
     */
    public static org.gtk.glib.SList findCustom(org.gtk.glib.SList list, CompareFunc func) {
        try {
            var RESULT = gtk_h.g_slist_find_custom(list.handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.SList(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls a function for each element of a #GSList.
     * 
     * It is safe for @func to remove the element from @list, but it must
     * not modify any part of the list after that element.
     */
    public static void foreach(org.gtk.glib.SList list, Func func) {
        try {
            gtk_h.g_slist_foreach(list.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees all of the memory used by a #GSList.
     * The freed elements are returned to the slice allocator.
     * 
     * If list elements contain dynamically-allocated memory,
     * you should either use g_slist_free_full() or free them manually
     * first.
     * 
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * GSList *list_of_borrowed_things = &#8230;;  /&#60;!-- --&#62;* (transfer container) *&#60;!-- --&#62;/
     * g_slist_free (g_steal_pointer (&#38;list_of_borrowed_things));
     * ]}|
     */
    public static void free(org.gtk.glib.SList list) {
        gtk_h.g_slist_free(list.handle());
    }
    
    /**
     * Frees one #GSList element.
     * It is usually used after g_slist_remove_link().
     */
    public static void free1(org.gtk.glib.SList list) {
        gtk_h.g_slist_free_1(list.handle());
    }
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     */
    public static int index(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_index(list.handle(), data);
        return RESULT;
    }
    
    /**
     * Inserts a new element into the list at the given position.
     */
    public static org.gtk.glib.SList insert(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data, int position) {
        var RESULT = gtk_h.g_slist_insert(list.handle(), data, position);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Inserts a node before @sibling containing @data.
     */
    public static org.gtk.glib.SList insertBefore(org.gtk.glib.SList slist, org.gtk.glib.SList sibling, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_insert_before(slist.handle(), sibling.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     */
    public static org.gtk.glib.SList insertSorted(org.gtk.glib.SList list, CompareFunc func) {
        try {
            var RESULT = gtk_h.g_slist_insert_sorted(list.handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.SList(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     */
    public static org.gtk.glib.SList insertSortedWithData(org.gtk.glib.SList list, CompareDataFunc func) {
        try {
            var RESULT = gtk_h.g_slist_insert_sorted_with_data(list.handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return new org.gtk.glib.SList(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the last element in a #GSList.
     * 
     * This function iterates over the whole list.
     */
    public static org.gtk.glib.SList last(org.gtk.glib.SList list) {
        var RESULT = gtk_h.g_slist_last(list.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of elements in a #GSList.
     * 
     * This function iterates over the whole list to
     * count its elements. To check whether the list is non-empty, it is faster to
     * check @list against 
     *             
     *               
     *             
     *           
     *         
     *       
     *       
     *         Gets the number of elements in a #GSList.
     * 
     * This function iterates over the whole list to
     * count its elements. To check whether the list is non-empty, it is faster to
     * check @list against %NULL.
     */
    public static int length(org.gtk.glib.SList list) {
        var RESULT = gtk_h.g_slist_length(list.handle());
        return RESULT;
    }
    
    /**
     * Gets the element at the given position in a #GSList.
     */
    public static org.gtk.glib.SList nth(org.gtk.glib.SList list, int n) {
        var RESULT = gtk_h.g_slist_nth(list.handle(), n);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Gets the data of the element at the given position.
     */
    public static jdk.incubator.foreign.MemoryAddress nthData(org.gtk.glib.SList list, int n) {
        var RESULT = gtk_h.g_slist_nth_data(list.handle(), n);
        return RESULT;
    }
    
    /**
     * Gets the position of the given element
     * in the #GSList (starting from 0).
     */
    public static int position(org.gtk.glib.SList list, org.gtk.glib.SList llink) {
        var RESULT = gtk_h.g_slist_position(list.handle(), llink.handle());
        return RESULT;
    }
    
    /**
     * Adds a new element on to the start of the list.
     * 
     * The return value is the new start of the list, which
     * may have changed, so make sure you store the new value.
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * // Notice that it is initialized to the empty list.
     * GSList *list = NULL;
     * list = g_slist_prepend (list, &#34;last&#34;);
     * list = g_slist_prepend (list, &#34;first&#34;);
     * ]}|
     */
    public static org.gtk.glib.SList prepend(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_prepend(list.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Removes an element from a #GSList.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the #GSList is unchanged.
     */
    public static org.gtk.glib.SList remove(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_remove(list.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Removes all list nodes with data equal to @data.
     * Returns the new head of the list. Contrast with
     * g_slist_remove() which removes only the first node
     * matching the given data.
     */
    public static org.gtk.glib.SList removeAll(org.gtk.glib.SList list, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_slist_remove_all(list.handle(), data);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Removes an element from a #GSList, without
     * freeing the element. The removed element&#39;s next
     * link is set to <code>NULL,</code> so that it becomes a
     * self-contained list with one element.
     * 
     * Removing arbitrary nodes from a singly-linked list
     * requires time that is proportional to the length of the list
     * (ie. O(n)). If you find yourself using g_slist_remove_link()
     * frequently, you should consider a different data structure,
     * such as the doubly-linked #GList.
     */
    public static org.gtk.glib.SList removeLink(org.gtk.glib.SList list, org.gtk.glib.SList link) {
        var RESULT = gtk_h.g_slist_remove_link(list.handle(), link.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Reverses a #GSList.
     */
    public static org.gtk.glib.SList reverse(org.gtk.glib.SList list) {
        var RESULT = gtk_h.g_slist_reverse(list.handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Like g_slist_sort(), but the sort function accepts a user data argument.
     */
    public static org.gtk.glib.SList sortWithData(org.gtk.glib.SList list, CompareDataFunc compareFunc) {
        try {
            var RESULT = gtk_h.g_slist_sort_with_data(list.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
            return new org.gtk.glib.SList(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
