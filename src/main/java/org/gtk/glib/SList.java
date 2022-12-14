package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SList} struct is used for each element in the singly-linked
 * list.
 */
public class SList extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSList";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("next")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SList}
     * @return A new, uninitialized @{link SList}
     */
    public static SList allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SList newInstance = new SList(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.SList getNext() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(org.gtk.glib.SList next) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
        }
    }
    
    /**
     * Create a SList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SList(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SList> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SList(input);
    
    /**
     * Allocates space for one {@link SList} element. It is called by the
     * g_slist_append(), g_slist_prepend(), g_slist_insert() and
     * g_slist_insert_sorted() functions and so is rarely used on its own.
     * @return a pointer to the newly-allocated {@link SList} element.
     */
    public static org.gtk.glib.SList alloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds a new element on to the end of the list.
     * <p>
     * The return value is the new start of the list, which may
     * have changed, so make sure you store the new value.
     * <p>
     * Note that g_slist_append() has to traverse the entire list
     * to find the end, which is inefficient when adding multiple
     * elements. A common idiom to avoid the inefficiency is to prepend
     * the elements and reverse the list when all elements have been added.
     * <pre>{@code <!-- language="C" -->
     * // Notice that these are initialized to the empty list.
     * GSList *list = NULL, *number_list = NULL;
     * 
     * // This is a list of strings.
     * list = g_slist_append (list, "first");
     * list = g_slist_append (list, "second");
     * 
     * // This is a list of integers.
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (27));
     * number_list = g_slist_append (number_list, GINT_TO_POINTER (14));
     * }</pre>
     * @param list a {@link SList}
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList append(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_append.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds the second {@link SList} onto the end of the first {@link SList}.
     * Note that the elements of the second {@link SList} are not copied.
     * They are used directly.
     * @param list1 a {@link SList}
     * @param list2 the {@link SList} to add to the end of the first {@link SList}
     * @return the start of the new {@link SList}
     */
    public static org.gtk.glib.SList concat(org.gtk.glib.SList list1, org.gtk.glib.SList list2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_concat.invokeExact(
                    list1.handle(),
                    list2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Copies a {@link SList}.
     * <p>
     * Note that this is a "shallow" copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data isn't. See g_slist_copy_deep() if you need
     * to copy the data as well.
     * @param list a {@link SList}
     * @return a copy of {@code list}
     */
    public static org.gtk.glib.SList copy(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_copy.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Makes a full (deep) copy of a {@link SList}.
     * <p>
     * In contrast with g_slist_copy(), this function uses {@code func} to make a copy of
     * each list element, in addition to copying the list container itself.
     * <p>
     * {@code func}, as a {@link CopyFunc}, takes two arguments, the data to be copied
     * and a {@code user_data} pointer. On common processor architectures, it's safe to
     * pass {@code null} as {@code user_data} if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC???s
     * {@code -Wcast-function-type} warning.
     * <p>
     * For instance, if {@code list} holds a list of GObjects, you can do:
     * <pre>{@code <!-- language="C" -->
     * another_list = g_slist_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * }</pre>
     * <p>
     * And, to entirely free the new list, you could do:
     * <pre>{@code <!-- language="C" -->
     * g_slist_free_full (another_list, g_object_unref);
     * }</pre>
     * @param list a {@link SList}
     * @param func a copy function used to copy every element in the list
     * @return a full copy of {@code list}, use g_slist_free_full() to free it
     */
    public static org.gtk.glib.SList copyDeep(org.gtk.glib.SList list, org.gtk.glib.CopyFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_copy_deep.invokeExact(
                    list.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes the node link_ from the list and frees it.
     * Compare this to g_slist_remove_link() which removes the node
     * without freeing it.
     * <p>
     * Removing arbitrary nodes from a singly-linked list requires time
     * that is proportional to the length of the list (ie. O(n)). If you
     * find yourself using g_slist_delete_link() frequently, you should
     * consider a different data structure, such as the doubly-linked
     * {@link List}.
     * @param list a {@link SList}
     * @param link node to delete
     * @return the new head of {@code list}
     */
    public static org.gtk.glib.SList deleteLink(org.gtk.glib.SList list, org.gtk.glib.SList link) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_delete_link.invokeExact(
                    list.handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Finds the element in a {@link SList} which
     * contains the given data.
     * @param list a {@link SList}
     * @return the found {@link SList} element,
     *     or {@code null} if it is not found
     */
    public static org.gtk.glib.SList find(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_find.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Finds an element in a {@link SList}, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two {@code gconstpointer} arguments,
     * the {@link SList} element's data as the first argument and the
     * given user data.
     * @param list a {@link SList}
     * @param func the function to call for each element.
     *     It should return 0 when the desired element is found
     * @return the found {@link SList} element, or {@code null} if it is not found
     */
    public static org.gtk.glib.SList findCustom(org.gtk.glib.SList list, org.gtk.glib.CompareFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_find_custom.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Calls a function for each element of a {@link SList}.
     * <p>
     * It is safe for {@code func} to remove the element from {@code list}, but it must
     * not modify any part of the list after that element.
     * @param list a {@link SList}
     * @param func the function to call with each element's data
     */
    public static void foreach(org.gtk.glib.SList list, org.gtk.glib.Func func) {
        try {
            DowncallHandles.g_slist_foreach.invokeExact(
                    list.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees all of the memory used by a {@link SList}.
     * The freed elements are returned to the slice allocator.
     * <p>
     * If list elements contain dynamically-allocated memory,
     * you should either use g_slist_free_full() or free them manually
     * first.
     * <p>
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling:
     * <pre>{@code <!-- language="C" -->
     * GSList *list_of_borrowed_things = ???;  /<!-- -->* (transfer container) *<!-- -->/
     * g_slist_free (g_steal_pointer (&list_of_borrowed_things));
     * }</pre>
     * @param list the first link of a {@link SList}
     */
    public static void free(org.gtk.glib.SList list) {
        try {
            DowncallHandles.g_slist_free.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees one {@link SList} element.
     * It is usually used after g_slist_remove_link().
     * @param list a {@link SList} element
     */
    public static void free1(org.gtk.glib.SList list) {
        try {
            DowncallHandles.g_slist_free_1.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience method, which frees all the memory used by a {@link SList}, and
     * calls the specified destroy function on every element's data.
     * <p>
     * {@code free_func} must not modify the list (eg, by removing the freed
     * element from it).
     * <p>
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling ????? this also has the nice property that the head pointer
     * is cleared before any of the list elements are freed, to prevent double frees
     * from {@code free_func}:
     * <pre>{@code <!-- language="C" -->
     * GSList *list_of_owned_things = ???;  /<!-- -->* (transfer full) (element-type GObject) *<!-- -->/
     * g_slist_free_full (g_steal_pointer (&list_of_owned_things), g_object_unref);
     * }</pre>
     * @param list the first link of a {@link SList}
     * @param freeFunc the function to be called to free each element's data
     */
    public static void freeFull(org.gtk.glib.SList list, org.gtk.glib.DestroyNotify freeFunc) {
        try {
            DowncallHandles.g_slist_free_full.invokeExact(
                    list.handle(),
                    (Addressable) freeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     * @param list a {@link SList}
     * @return the index of the element containing the data,
     *     or -1 if the data is not found
     */
    public static int index(org.gtk.glib.SList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_slist_index.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a new element into the list at the given position.
     * @param list a {@link SList}
     * @param position the position to insert the element.
     *     If this is negative, or is larger than the number
     *     of elements in the list, the new element is added on
     *     to the end of the list.
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList insert(org.gtk.glib.SList list, int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_insert.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL,
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Inserts a node before {@code sibling} containing {@code data}.
     * @param slist a {@link SList}
     * @param sibling node to insert {@code data} before
     * @return the new head of the list.
     */
    public static org.gtk.glib.SList insertBefore(org.gtk.glib.SList slist, org.gtk.glib.SList sibling) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_insert_before.invokeExact(
                    slist.handle(),
                    sibling.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     * @param list a {@link SList}
     * @param func the function to compare elements in the list.
     *     It should return a number &gt; 0 if the first parameter
     *     comes after the second parameter in the sort order.
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList insertSorted(org.gtk.glib.SList list, org.gtk.glib.CompareFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_insert_sorted.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     * @param list a {@link SList}
     * @param func the function to compare elements in the list.
     *     It should return a number &gt; 0 if the first parameter
     *     comes after the second parameter in the sort order.
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList insertSortedWithData(org.gtk.glib.SList list, org.gtk.glib.CompareDataFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_insert_sorted_with_data.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the last element in a {@link SList}.
     * <p>
     * This function iterates over the whole list.
     * @param list a {@link SList}
     * @return the last element in the {@link SList},
     *     or {@code null} if the {@link SList} has no elements
     */
    public static org.gtk.glib.SList last(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_last.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the number of elements in a {@link SList}.
     * <p>
     * This function iterates over the whole list to
     * count its elements. To check whether the list is non-empty, it is faster to
     * check {@code list} against {@code null}.
     * @param list a {@link SList}
     * @return the number of elements in the {@link SList}
     */
    public static int length(org.gtk.glib.SList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_slist_length.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the element at the given position in a {@link SList}.
     * @param list a {@link SList}
     * @param n the position of the element, counting from 0
     * @return the element, or {@code null} if the position is off
     *     the end of the {@link SList}
     */
    public static org.gtk.glib.SList nth(org.gtk.glib.SList list, int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_nth.invokeExact(
                    list.handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the data of the element at the given position.
     * @param list a {@link SList}
     * @param n the position of the element
     * @return the element's data, or {@code null} if the position
     *     is off the end of the {@link SList}
     */
    public static @Nullable java.lang.foreign.MemoryAddress nthData(org.gtk.glib.SList list, int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_nth_data.invokeExact(
                    list.handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the position of the given element
     * in the {@link SList} (starting from 0).
     * @param list a {@link SList}
     * @param llink an element in the {@link SList}
     * @return the position of the element in the {@link SList},
     *     or -1 if the element is not found
     */
    public static int position(org.gtk.glib.SList list, org.gtk.glib.SList llink) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_slist_position.invokeExact(
                    list.handle(),
                    llink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Adds a new element on to the start of the list.
     * <p>
     * The return value is the new start of the list, which
     * may have changed, so make sure you store the new value.
     * <pre>{@code <!-- language="C" -->
     * // Notice that it is initialized to the empty list.
     * GSList *list = NULL;
     * list = g_slist_prepend (list, "last");
     * list = g_slist_prepend (list, "first");
     * }</pre>
     * @param list a {@link SList}
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList prepend(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_prepend.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes an element from a {@link SList}.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the {@link SList} is unchanged.
     * @param list a {@link SList}
     * @return the new start of the {@link SList}
     */
    public static org.gtk.glib.SList remove(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_remove.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes all list nodes with data equal to {@code data}.
     * Returns the new head of the list. Contrast with
     * g_slist_remove() which removes only the first node
     * matching the given data.
     * @param list a {@link SList}
     * @return new head of {@code list}
     */
    public static org.gtk.glib.SList removeAll(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_remove_all.invokeExact(
                    list.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes an element from a {@link SList}, without
     * freeing the element. The removed element's next
     * link is set to {@code null}, so that it becomes a
     * self-contained list with one element.
     * <p>
     * Removing arbitrary nodes from a singly-linked list
     * requires time that is proportional to the length of the list
     * (ie. O(n)). If you find yourself using g_slist_remove_link()
     * frequently, you should consider a different data structure,
     * such as the doubly-linked {@link List}.
     * @param list a {@link SList}
     * @param link an element in the {@link SList}
     * @return the new start of the {@link SList}, without the element
     */
    public static org.gtk.glib.SList removeLink(org.gtk.glib.SList list, org.gtk.glib.SList link) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_remove_link.invokeExact(
                    list.handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Reverses a {@link SList}.
     * @param list a {@link SList}
     * @return the start of the reversed {@link SList}
     */
    public static org.gtk.glib.SList reverse(org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_reverse.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sorts a {@link SList} using the given comparison function. The algorithm
     * used is a stable sort.
     * @param list a {@link SList}
     * @param compareFunc the comparison function used to sort the {@link SList}.
     *     This function is passed the data from 2 elements of the {@link SList}
     *     and should return 0 if they are equal, a negative value if the
     *     first element comes before the second, or a positive value if
     *     the first element comes after the second.
     * @return the start of the sorted {@link SList}
     */
    public static org.gtk.glib.SList sort(org.gtk.glib.SList list, org.gtk.glib.CompareFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_sort.invokeExact(
                    list.handle(),
                    (Addressable) compareFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Like g_slist_sort(), but the sort function accepts a user data argument.
     * @param list a {@link SList}
     * @param compareFunc comparison function
     * @return new head of the list
     */
    public static org.gtk.glib.SList sortWithData(org.gtk.glib.SList list, org.gtk.glib.CompareDataFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_slist_sort_with_data.invokeExact(
                    list.handle(),
                    (Addressable) compareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_slist_alloc = Interop.downcallHandle(
                "g_slist_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_append = Interop.downcallHandle(
                "g_slist_append",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_concat = Interop.downcallHandle(
                "g_slist_concat",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_copy = Interop.downcallHandle(
                "g_slist_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_copy_deep = Interop.downcallHandle(
                "g_slist_copy_deep",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_delete_link = Interop.downcallHandle(
                "g_slist_delete_link",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_find = Interop.downcallHandle(
                "g_slist_find",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_find_custom = Interop.downcallHandle(
                "g_slist_find_custom",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_foreach = Interop.downcallHandle(
                "g_slist_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_free = Interop.downcallHandle(
                "g_slist_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_free_1 = Interop.downcallHandle(
                "g_slist_free_1",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_free_full = Interop.downcallHandle(
                "g_slist_free_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_index = Interop.downcallHandle(
                "g_slist_index",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_insert = Interop.downcallHandle(
                "g_slist_insert",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_slist_insert_before = Interop.downcallHandle(
                "g_slist_insert_before",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_insert_sorted = Interop.downcallHandle(
                "g_slist_insert_sorted",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_insert_sorted_with_data = Interop.downcallHandle(
                "g_slist_insert_sorted_with_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_last = Interop.downcallHandle(
                "g_slist_last",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_length = Interop.downcallHandle(
                "g_slist_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_nth = Interop.downcallHandle(
                "g_slist_nth",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_slist_nth_data = Interop.downcallHandle(
                "g_slist_nth_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_slist_position = Interop.downcallHandle(
                "g_slist_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_prepend = Interop.downcallHandle(
                "g_slist_prepend",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_remove = Interop.downcallHandle(
                "g_slist_remove",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_remove_all = Interop.downcallHandle(
                "g_slist_remove_all",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_remove_link = Interop.downcallHandle(
                "g_slist_remove_link",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_reverse = Interop.downcallHandle(
                "g_slist_reverse",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_sort = Interop.downcallHandle(
                "g_slist_sort",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_slist_sort_with_data = Interop.downcallHandle(
                "g_slist_sort_with_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link SList.Builder} object constructs a {@link SList} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SList.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SList struct;
        
        private Builder() {
            struct = SList.allocate();
        }
        
        /**
         * Finish building the {@link SList} struct.
         * @return A new instance of {@code SList} with the fields 
         *         that were set in the Builder object.
         */
        public SList build() {
            return struct;
        }
        
        /**
         * holds the element's data, which can be a pointer to any kind
         *        of data, or any integer value using the
         *        [Type Conversion Macros][glib-Type-Conversion-Macros]
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        /**
         * contains the link to the next element in the list.
         * @param next The value for the {@code next} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNext(org.gtk.glib.SList next) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
                return this;
            }
        }
    }
}
