package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link List} struct is used for each element in a doubly-linked list.
 */
public class List extends io.github.jwharm.javagi.ResourceBase {

    public List(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_list_alloc = Interop.downcallHandle(
        "g_list_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates space for one {@link List} element. It is called by
     * g_list_append(), g_list_prepend(), g_list_insert() and
     * g_list_insert_sorted() and so is rarely used on its own.
     */
    public static org.gtk.glib.List alloc() {
        try {
            var RESULT = (MemoryAddress) g_list_alloc.invokeExact();
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_append = Interop.downcallHandle(
        "g_list_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element on to the end of the list.
     * <p>
     * Note that the return value is the new start of the list,
     * if {@code list} was empty; make sure you store the new value.
     * <p>
     * g_list_append() has to traverse the entire list to find the end,
     * which is inefficient when adding multiple elements. A common idiom
     * to avoid the inefficiency is to use g_list_prepend() and reverse
     * the list with g_list_reverse() when all elements have been added.
     * <p>
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     */
    public static org.gtk.glib.List append(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_append.invokeExact(list.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_concat = Interop.downcallHandle(
        "g_list_concat",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the second {@link List} onto the end of the first {@link List}.
     * Note that the elements of the second {@link List} are not copied.
     * They are used directly.
     * <p>
     * This function is for example used to move an element in the list.
     * The following example moves an element to the top of the list:
     * <pre>{@code <!-- language="C" -->
     * list = g_list_remove_link (list, llink);
     * list = g_list_concat (llink, list);
     * }</pre>
     */
    public static org.gtk.glib.List concat(org.gtk.glib.List list1, org.gtk.glib.List list2) {
        try {
            var RESULT = (MemoryAddress) g_list_concat.invokeExact(list1.handle(), list2.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_copy = Interop.downcallHandle(
        "g_list_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@link List}.
     * <p>
     * Note that this is a "shallow" copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data is not. See g_list_copy_deep() if you need
     * to copy the data as well.
     */
    public static org.gtk.glib.List copy(org.gtk.glib.List list) {
        try {
            var RESULT = (MemoryAddress) g_list_copy.invokeExact(list.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_copy_deep = Interop.downcallHandle(
        "g_list_copy_deep",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a full (deep) copy of a {@link List}.
     * <p>
     * In contrast with g_list_copy(), this function uses {@code func} to make
     * a copy of each list element, in addition to copying the list
     * container itself.
     * <p>
     * {@code func}, as a {@link CopyFunc}, takes two arguments, the data to be copied
     * and a {@code user_data} pointer. On common processor architectures, it's safe to
     * pass {@code null} as {@code user_data} if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC’s
     * {@code -Wcast-function-type} warning.
     * <p>
     * For instance, if {@code list} holds a list of GObjects, you can do:
     * <pre>{@code <!-- language="C" -->
     * another_list = g_list_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
     * }</pre>
     * <p>
     * And, to entirely free the new list, you could do:
     * <pre>{@code <!-- language="C" -->
     * g_list_free_full (another_list, g_object_unref);
     * }</pre>
     */
    public static org.gtk.glib.List copyDeep(org.gtk.glib.List list, CopyFunc func) {
        try {
            var RESULT = (MemoryAddress) g_list_copy_deep.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_delete_link = Interop.downcallHandle(
        "g_list_delete_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the node link_ from the list and frees it.
     * Compare this to g_list_remove_link() which removes the node
     * without freeing it.
     */
    public static org.gtk.glib.List deleteLink(org.gtk.glib.List list, org.gtk.glib.List link) {
        try {
            var RESULT = (MemoryAddress) g_list_delete_link.invokeExact(list.handle(), link.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_find = Interop.downcallHandle(
        "g_list_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the element in a {@link List} which contains the given data.
     */
    public static org.gtk.glib.List find(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_find.invokeExact(list.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_find_custom = Interop.downcallHandle(
        "g_list_find_custom",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an element in a {@link List}, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two {@code gconstpointer} arguments,
     * the {@link List} element's data as the first argument and the
     * given user data.
     */
    public static org.gtk.glib.List findCustom(org.gtk.glib.List list, CompareFunc func) {
        try {
            var RESULT = (MemoryAddress) g_list_find_custom.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_first = Interop.downcallHandle(
        "g_list_first",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the first element in a {@link List}.
     */
    public static org.gtk.glib.List first(org.gtk.glib.List list) {
        try {
            var RESULT = (MemoryAddress) g_list_first.invokeExact(list.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_foreach = Interop.downcallHandle(
        "g_list_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each element of a {@link List}.
     * <p>
     * It is safe for {@code func} to remove the element from {@code list}, but it must
     * not modify any part of the list after that element.
     */
    public static void foreach(org.gtk.glib.List list, Func func) {
        try {
            g_list_foreach.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_free = Interop.downcallHandle(
        "g_list_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees all of the memory used by a {@link List}.
     * The freed elements are returned to the slice allocator.
     * <p>
     * If list elements contain dynamically-allocated memory, you should
     * either use g_list_free_full() or free them manually first.
     * <p>
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling:
     * <pre>{@code <!-- language="C" -->
     * GList *list_of_borrowed_things = …;  /<!-- -->* (transfer container) *<!-- -->/
     * g_list_free (g_steal_pointer (&list_of_borrowed_things));
     * }</pre>
     */
    public static void free(org.gtk.glib.List list) {
        try {
            g_list_free.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_free_1 = Interop.downcallHandle(
        "g_list_free_1",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees one {@link List} element, but does not update links from the next and
     * previous elements in the list, so you should not call this function on an
     * element that is currently part of a list.
     * <p>
     * It is usually used after g_list_remove_link().
     */
    public static void free1(org.gtk.glib.List list) {
        try {
            g_list_free_1.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_index = Interop.downcallHandle(
        "g_list_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     */
    public static int index(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_list_index.invokeExact(list.handle(), data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_insert = Interop.downcallHandle(
        "g_list_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a new element into the list at the given position.
     */
    public static org.gtk.glib.List insert(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data, int position) {
        try {
            var RESULT = (MemoryAddress) g_list_insert.invokeExact(list.handle(), data, position);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_insert_before = Interop.downcallHandle(
        "g_list_insert_before",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new element into the list before the given position.
     */
    public static org.gtk.glib.List insertBefore(org.gtk.glib.List list, org.gtk.glib.List sibling, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_insert_before.invokeExact(list.handle(), sibling.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_insert_before_link = Interop.downcallHandle(
        "g_list_insert_before_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code link_} into the list before the given position.
     */
    public static org.gtk.glib.List insertBeforeLink(org.gtk.glib.List list, org.gtk.glib.List sibling, org.gtk.glib.List link) {
        try {
            var RESULT = (MemoryAddress) g_list_insert_before_link.invokeExact(list.handle(), sibling.handle(), link.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_insert_sorted = Interop.downcallHandle(
        "g_list_insert_sorted",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * <p>
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     */
    public static org.gtk.glib.List insertSorted(org.gtk.glib.List list, CompareFunc func) {
        try {
            var RESULT = (MemoryAddress) g_list_insert_sorted.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_insert_sorted_with_data = Interop.downcallHandle(
        "g_list_insert_sorted_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * <p>
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     */
    public static org.gtk.glib.List insertSortedWithData(org.gtk.glib.List list, CompareDataFunc func) {
        try {
            var RESULT = (MemoryAddress) g_list_insert_sorted_with_data.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_last = Interop.downcallHandle(
        "g_list_last",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the last element in a {@link List}.
     */
    public static org.gtk.glib.List last(org.gtk.glib.List list) {
        try {
            var RESULT = (MemoryAddress) g_list_last.invokeExact(list.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_length = Interop.downcallHandle(
        "g_list_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of elements in a {@link List}.
     * <p>
     * This function iterates over the whole list to count its elements.
     * Use a {@link Queue} instead of a GList if you regularly need the number
     * of items. To check whether the list is non-empty, it is faster to check
     * {@code list} against {@code null}.
     */
    public static int length(org.gtk.glib.List list) {
        try {
            var RESULT = (int) g_list_length.invokeExact(list.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_nth = Interop.downcallHandle(
        "g_list_nth",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the element at the given position in a {@link List}.
     * <p>
     * This iterates over the list until it reaches the @n-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the {@link List} introduction.
     */
    public static org.gtk.glib.List nth(org.gtk.glib.List list, int n) {
        try {
            var RESULT = (MemoryAddress) g_list_nth.invokeExact(list.handle(), n);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_nth_data = Interop.downcallHandle(
        "g_list_nth_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the data of the element at the given position.
     * <p>
     * This iterates over the list until it reaches the @n-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the {@link List} introduction.
     */
    public static java.lang.foreign.MemoryAddress nthData(org.gtk.glib.List list, int n) {
        try {
            var RESULT = (MemoryAddress) g_list_nth_data.invokeExact(list.handle(), n);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_nth_prev = Interop.downcallHandle(
        "g_list_nth_prev",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the element @n places before {@code list}.
     */
    public static org.gtk.glib.List nthPrev(org.gtk.glib.List list, int n) {
        try {
            var RESULT = (MemoryAddress) g_list_nth_prev.invokeExact(list.handle(), n);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_position = Interop.downcallHandle(
        "g_list_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the given element
     * in the {@link List} (starting from 0).
     */
    public static int position(org.gtk.glib.List list, org.gtk.glib.List llink) {
        try {
            var RESULT = (int) g_list_position.invokeExact(list.handle(), llink.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_prepend = Interop.downcallHandle(
        "g_list_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a new element on to the start of the list.
     * <p>
     * Note that the return value is the new start of the list,
     * which will have changed, so make sure you store the new value.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * // Notice that it is initialized to the empty list.
     * GList *list = NULL;
     * 
     * list = g_list_prepend (list, "last");
     * list = g_list_prepend (list, "first");
     * }</pre>
     * <p>
     * Do not use this function to prepend a new element to a different
     * element than the start of the list. Use g_list_insert_before() instead.
     */
    public static org.gtk.glib.List prepend(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_prepend.invokeExact(list.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_remove = Interop.downcallHandle(
        "g_list_remove",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an element from a {@link List}.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the {@link List} is unchanged.
     */
    public static org.gtk.glib.List remove(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_remove.invokeExact(list.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_remove_all = Interop.downcallHandle(
        "g_list_remove_all",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all list nodes with data equal to {@code data}.
     * Returns the new head of the list. Contrast with
     * g_list_remove() which removes only the first node
     * matching the given data.
     */
    public static org.gtk.glib.List removeAll(org.gtk.glib.List list, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_list_remove_all.invokeExact(list.handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_remove_link = Interop.downcallHandle(
        "g_list_remove_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an element from a {@link List}, without freeing the element.
     * The removed element's prev and next links are set to {@code null}, so
     * that it becomes a self-contained list with one element.
     * <p>
     * This function is for example used to move an element in the list
     * (see the example for g_list_concat()) or to remove an element in
     * the list before freeing its data:
     * <pre>{@code <!-- language="C" -->
     * list = g_list_remove_link (list, llink);
     * free_some_data_that_may_access_the_list_again (llink->data);
     * g_list_free (llink);
     * }</pre>
     */
    public static org.gtk.glib.List removeLink(org.gtk.glib.List list, org.gtk.glib.List llink) {
        try {
            var RESULT = (MemoryAddress) g_list_remove_link.invokeExact(list.handle(), llink.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_reverse = Interop.downcallHandle(
        "g_list_reverse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses a {@link List}.
     * It simply switches the next and prev pointers of each element.
     */
    public static org.gtk.glib.List reverse(org.gtk.glib.List list) {
        try {
            var RESULT = (MemoryAddress) g_list_reverse.invokeExact(list.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_list_sort_with_data = Interop.downcallHandle(
        "g_list_sort_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_list_sort(), but the comparison function accepts
     * a user data argument.
     */
    public static org.gtk.glib.List sortWithData(org.gtk.glib.List list, CompareDataFunc compareFunc) {
        try {
            var RESULT = (MemoryAddress) g_list_sort_with_data.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
