package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SList} struct is used for each element in the singly-linked
 * list.
 */
public class SList extends io.github.jwharm.javagi.ResourceBase {

    public SList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_slist_alloc = Interop.downcallHandle(
        "g_slist_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates space for one {@link SList} element. It is called by the
     * g_slist_append(), g_slist_prepend(), g_slist_insert() and
     * g_slist_insert_sorted() functions and so is rarely used on its own.
     */
    public static @NotNull org.gtk.glib.SList alloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_append = Interop.downcallHandle(
        "g_slist_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * <p>
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
     */
    public static @NotNull org.gtk.glib.SList append(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_append.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_concat = Interop.downcallHandle(
        "g_slist_concat",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the second {@link SList} onto the end of the first {@link SList}.
     * Note that the elements of the second {@link SList} are not copied.
     * They are used directly.
     */
    public static @NotNull org.gtk.glib.SList concat(@NotNull org.gtk.glib.SList list1, @NotNull org.gtk.glib.SList list2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_concat.invokeExact(list1.handle(), list2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_copy = Interop.downcallHandle(
        "g_slist_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@link SList}.
     * <p>
     * Note that this is a "shallow" copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data isn't. See g_slist_copy_deep() if you need
     * to copy the data as well.
     */
    public static @NotNull org.gtk.glib.SList copy(@NotNull org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_copy.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_copy_deep = Interop.downcallHandle(
        "g_slist_copy_deep",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a full (deep) copy of a {@link SList}.
     * <p>
     * In contrast with g_slist_copy(), this function uses {@code func} to make a copy of
     * each list element, in addition to copying the list container itself.
     * <p>
     * {@code func}, as a {@link CopyFunc}, takes two arguments, the data to be copied
     * and a {@code user_data} pointer. On common processor architectures, it's safe to
     * pass {@code null} as {@code user_data} if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC’s
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
     */
    public static @NotNull org.gtk.glib.SList copyDeep(@NotNull org.gtk.glib.SList list, @NotNull CopyFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_copy_deep.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_delete_link = Interop.downcallHandle(
        "g_slist_delete_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @NotNull org.gtk.glib.SList deleteLink(@NotNull org.gtk.glib.SList list, @NotNull org.gtk.glib.SList link) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_delete_link.invokeExact(list.handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_find = Interop.downcallHandle(
        "g_slist_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the element in a {@link SList} which
     * contains the given data.
     */
    public static @NotNull org.gtk.glib.SList find(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_find.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_find_custom = Interop.downcallHandle(
        "g_slist_find_custom",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an element in a {@link SList}, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two {@code gconstpointer} arguments,
     * the {@link SList} element's data as the first argument and the
     * given user data.
     */
    public static @NotNull org.gtk.glib.SList findCustom(@NotNull org.gtk.glib.SList list, @NotNull CompareFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_find_custom.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_foreach = Interop.downcallHandle(
        "g_slist_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each element of a {@link SList}.
     * <p>
     * It is safe for {@code func} to remove the element from {@code list}, but it must
     * not modify any part of the list after that element.
     */
    public static @NotNull void foreach(@NotNull org.gtk.glib.SList list, @NotNull Func func) {
        try {
            g_slist_foreach.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_slist_free = Interop.downcallHandle(
        "g_slist_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
     * GSList *list_of_borrowed_things = …;  /<!-- -->* (transfer container) *<!-- -->/
     * g_slist_free (g_steal_pointer (&list_of_borrowed_things));
     * }</pre>
     */
    public static @NotNull void free(@NotNull org.gtk.glib.SList list) {
        try {
            g_slist_free.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_slist_free_1 = Interop.downcallHandle(
        "g_slist_free_1",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees one {@link SList} element.
     * It is usually used after g_slist_remove_link().
     */
    public static @NotNull void free1(@NotNull org.gtk.glib.SList list) {
        try {
            g_slist_free_1.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_slist_index = Interop.downcallHandle(
        "g_slist_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     */
    public static int index(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_slist_index.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_slist_insert = Interop.downcallHandle(
        "g_slist_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a new element into the list at the given position.
     */
    public static @NotNull org.gtk.glib.SList insert(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data, @NotNull int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_insert.invokeExact(list.handle(), data, position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_insert_before = Interop.downcallHandle(
        "g_slist_insert_before",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a node before {@code sibling} containing {@code data}.
     */
    public static @NotNull org.gtk.glib.SList insertBefore(@NotNull org.gtk.glib.SList slist, @NotNull org.gtk.glib.SList sibling, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_insert_before.invokeExact(slist.handle(), sibling.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_insert_sorted = Interop.downcallHandle(
        "g_slist_insert_sorted",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     */
    public static @NotNull org.gtk.glib.SList insertSorted(@NotNull org.gtk.glib.SList list, @NotNull CompareFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_insert_sorted.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_insert_sorted_with_data = Interop.downcallHandle(
        "g_slist_insert_sorted_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new element into the list, using the given
     * comparison function to determine its position.
     */
    public static @NotNull org.gtk.glib.SList insertSortedWithData(@NotNull org.gtk.glib.SList list, @NotNull CompareDataFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_insert_sorted_with_data.invokeExact(list.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_last = Interop.downcallHandle(
        "g_slist_last",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the last element in a {@link SList}.
     * <p>
     * This function iterates over the whole list.
     */
    public static @NotNull org.gtk.glib.SList last(@NotNull org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_last.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_length = Interop.downcallHandle(
        "g_slist_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of elements in a {@link SList}.
     * <p>
     * This function iterates over the whole list to
     * count its elements. To check whether the list is non-empty, it is faster to
     * check {@code list} against {@code null}.
     */
    public static int length(@NotNull org.gtk.glib.SList list) {
        int RESULT;
        try {
            RESULT = (int) g_slist_length.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_slist_nth = Interop.downcallHandle(
        "g_slist_nth",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the element at the given position in a {@link SList}.
     */
    public static @NotNull org.gtk.glib.SList nth(@NotNull org.gtk.glib.SList list, @NotNull int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_nth.invokeExact(list.handle(), n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_nth_data = Interop.downcallHandle(
        "g_slist_nth_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the data of the element at the given position.
     */
    public static @Nullable java.lang.foreign.MemoryAddress nthData(@NotNull org.gtk.glib.SList list, @NotNull int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_nth_data.invokeExact(list.handle(), n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_slist_position = Interop.downcallHandle(
        "g_slist_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the given element
     * in the {@link SList} (starting from 0).
     */
    public static int position(@NotNull org.gtk.glib.SList list, @NotNull org.gtk.glib.SList llink) {
        int RESULT;
        try {
            RESULT = (int) g_slist_position.invokeExact(list.handle(), llink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_slist_prepend = Interop.downcallHandle(
        "g_slist_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element on to the start of the list.
     * <p>
     * The return value is the new start of the list, which
     * may have changed, so make sure you store the new value.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * // Notice that it is initialized to the empty list.
     * GSList *list = NULL;
     * list = g_slist_prepend (list, "last");
     * list = g_slist_prepend (list, "first");
     * }</pre>
     */
    public static @NotNull org.gtk.glib.SList prepend(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_prepend.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_remove = Interop.downcallHandle(
        "g_slist_remove",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an element from a {@link SList}.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the {@link SList} is unchanged.
     */
    public static @NotNull org.gtk.glib.SList remove(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_remove.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_remove_all = Interop.downcallHandle(
        "g_slist_remove_all",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all list nodes with data equal to {@code data}.
     * Returns the new head of the list. Contrast with
     * g_slist_remove() which removes only the first node
     * matching the given data.
     */
    public static @NotNull org.gtk.glib.SList removeAll(@NotNull org.gtk.glib.SList list, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_remove_all.invokeExact(list.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_remove_link = Interop.downcallHandle(
        "g_slist_remove_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @NotNull org.gtk.glib.SList removeLink(@NotNull org.gtk.glib.SList list, @NotNull org.gtk.glib.SList link) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_remove_link.invokeExact(list.handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_reverse = Interop.downcallHandle(
        "g_slist_reverse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses a {@link SList}.
     */
    public static @NotNull org.gtk.glib.SList reverse(@NotNull org.gtk.glib.SList list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_reverse.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_slist_sort_with_data = Interop.downcallHandle(
        "g_slist_sort_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_slist_sort(), but the sort function accepts a user data argument.
     */
    public static @NotNull org.gtk.glib.SList sortWithData(@NotNull org.gtk.glib.SList list, @NotNull CompareDataFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_slist_sort_with_data.invokeExact(list.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
}
