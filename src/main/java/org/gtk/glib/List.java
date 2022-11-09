package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link List} struct is used for each element in a doubly-linked list.
 */
public class List extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GList";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("next"),
        Interop.valueLayout.ADDRESS.withName("prev")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static List allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        List newInstance = new List(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data);
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.List next$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void next$set(org.gtk.glib.List next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next.handle());
    }
    
    /**
     * Get the value of the field {@code prev}
     * @return The value of the field {@code prev}
     */
    public org.gtk.glib.List prev$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code prev}
     * @param prev The new value of the field {@code prev}
     */
    public void prev$set(org.gtk.glib.List prev) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), prev.handle());
    }
    
    /**
     * Create a List proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public List(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Allocates space for one {@link List} element. It is called by
     * g_list_append(), g_list_prepend(), g_list_insert() and
     * g_list_insert_sorted() and so is rarely used on its own.
     * @return a pointer to the newly-allocated {@link List} element
     */
    public static @NotNull org.gtk.glib.List alloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
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
     * @param list a pointer to a {@link List}
     * @param data the data for the new element
     * @return either {@code list} or the new start of the {@link List} if {@code list} was {@code null}
     */
    public static @NotNull org.gtk.glib.List append(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_append.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
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
     * @param list1 a {@link List}, this must point to the top of the list
     * @param list2 the {@link List} to add to the end of the first {@link List},
     *     this must point  to the top of the list
     * @return the start of the new {@link List}, which equals {@code list1} if not {@code null}
     */
    public static @NotNull org.gtk.glib.List concat(@NotNull org.gtk.glib.List list1, @NotNull org.gtk.glib.List list2) {
        java.util.Objects.requireNonNull(list1, "Parameter 'list1' must not be null");
        java.util.Objects.requireNonNull(list2, "Parameter 'list2' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_concat.invokeExact(
                    list1.handle(),
                    list2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Copies a {@link List}.
     * <p>
     * Note that this is a "shallow" copy. If the list elements
     * consist of pointers to data, the pointers are copied but
     * the actual data is not. See g_list_copy_deep() if you need
     * to copy the data as well.
     * @param list a {@link List}, this must point to the top of the list
     * @return the start of the new list that holds the same data as {@code list}
     */
    public static @NotNull org.gtk.glib.List copy(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_copy.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
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
     * @param list a {@link List}, this must point to the top of the list
     * @param func a copy function used to copy every element in the list
     * @return the start of the new list that holds a full copy of {@code list},
     *     use g_list_free_full() to free it
     */
    public static @NotNull org.gtk.glib.List copyDeep(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CopyFunc func) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_copy_deep.invokeExact(
                    list.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes the node link_ from the list and frees it.
     * Compare this to g_list_remove_link() which removes the node
     * without freeing it.
     * @param list a {@link List}, this must point to the top of the list
     * @param link node to delete from {@code list}
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List deleteLink(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_delete_link.invokeExact(
                    list.handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds the element in a {@link List} which contains the given data.
     * @param list a {@link List}, this must point to the top of the list
     * @param data the element data to find
     * @return the found {@link List} element, or {@code null} if it is not found
     */
    public static @NotNull org.gtk.glib.List find(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_find.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds an element in a {@link List}, using a supplied function to
     * find the desired element. It iterates over the list, calling
     * the given function which should return 0 when the desired
     * element is found. The function takes two {@code gconstpointer} arguments,
     * the {@link List} element's data as the first argument and the
     * given user data.
     * @param list a {@link List}, this must point to the top of the list
     * @param func the function to call for each element.
     *     It should return 0 when the desired element is found
     * @return the found {@link List} element, or {@code null} if it is not found
     */
    public static @NotNull org.gtk.glib.List findCustom(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CompareFunc func) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_find_custom.invokeExact(
                    list.handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the first element in a {@link List}.
     * @param list any {@link List} element
     * @return the first element in the {@link List},
     *     or {@code null} if the {@link List} has no elements
     */
    public static @NotNull org.gtk.glib.List first(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_first.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Calls a function for each element of a {@link List}.
     * <p>
     * It is safe for {@code func} to remove the element from {@code list}, but it must
     * not modify any part of the list after that element.
     * @param list a {@link List}, this must point to the top of the list
     * @param func the function to call with each element's data
     */
    public static void foreach(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.Func func) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_list_foreach.invokeExact(
                    list.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param list the first link of a {@link List}
     */
    public static void free(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.g_list_free.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees one {@link List} element, but does not update links from the next and
     * previous elements in the list, so you should not call this function on an
     * element that is currently part of a list.
     * <p>
     * It is usually used after g_list_remove_link().
     * @param list a {@link List} element
     */
    public static void free1(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.g_list_free_1.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience method, which frees all the memory used by a {@link List},
     * and calls {@code free_func} on every element's data.
     * <p>
     * {@code free_func} must not modify the list (eg, by removing the freed
     * element from it).
     * <p>
     * It can be combined with g_steal_pointer() to ensure the list head pointer
     * is not left dangling ­— this also has the nice property that the head pointer
     * is cleared before any of the list elements are freed, to prevent double frees
     * from {@code free_func}:
     * <pre>{@code <!-- language="C" -->
     * GList *list_of_owned_things = …;  /<!-- -->* (transfer full) (element-type GObject) *<!-- -->/
     * g_list_free_full (g_steal_pointer (&list_of_owned_things), g_object_unref);
     * }</pre>
     * @param list the first link of a {@link List}
     * @param freeFunc the function to be called to free each element's data
     */
    public static void freeFull(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.DestroyNotify freeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Gets the position of the element containing
     * the given data (starting from 0).
     * @param list a {@link List}, this must point to the top of the list
     * @param data the data to find
     * @return the index of the element containing the data,
     *     or -1 if the data is not found
     */
    public static int index(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_index.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a new element into the list at the given position.
     * @param list a pointer to a {@link List}, this must point to the top of the list
     * @param data the data for the new element
     * @param position the position to insert the element. If this is
     *     negative, or is larger than the number of elements in the
     *     list, the new element is added on to the end of the list.
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List insert(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data, int position) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_insert.invokeExact(
                    list.handle(),
                    data,
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a new element into the list before the given position.
     * @param list a pointer to a {@link List}, this must point to the top of the list
     * @param sibling the list element before which the new element
     *     is inserted or {@code null} to insert at the end of the list
     * @param data the data for the new element
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List insertBefore(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.List sibling, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_insert_before.invokeExact(
                    list.handle(),
                    sibling.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts {@code link_} into the list before the given position.
     * @param list a pointer to a {@link List}, this must point to the top of the list
     * @param sibling the list element before which the new element
     *     is inserted or {@code null} to insert at the end of the list
     * @param link the list element to be added, which must not be part of
     *     any other list
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List insertBeforeLink(@NotNull org.gtk.glib.List list, @Nullable org.gtk.glib.List sibling, @NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_insert_before_link.invokeExact(
                    list.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * <p>
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     * @param list a pointer to a {@link List}, this must point to the top of the
     *     already sorted list
     * @param func the function to compare elements in the list. It should
     *     return a number &gt; 0 if the first parameter comes after the
     *     second parameter in the sort order.
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List insertSorted(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CompareFunc func) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_insert_sorted.invokeExact(
                    list.handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a new element into the list, using the given comparison
     * function to determine its position.
     * <p>
     * If you are adding many new elements to a list, and the number of
     * new elements is much larger than the length of the list, use
     * g_list_prepend() to add the new items and sort the list afterwards
     * with g_list_sort().
     * @param list a pointer to a {@link List}, this must point to the top of the
     *     already sorted list
     * @param func the function to compare elements in the list. It should
     *     return a number &gt; 0 if the first parameter  comes after the
     *     second parameter in the sort order.
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List insertSortedWithData(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_insert_sorted_with_data.invokeExact(
                    list.handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the last element in a {@link List}.
     * @param list any {@link List} element
     * @return the last element in the {@link List},
     *     or {@code null} if the {@link List} has no elements
     */
    public static @NotNull org.gtk.glib.List last(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_last.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the number of elements in a {@link List}.
     * <p>
     * This function iterates over the whole list to count its elements.
     * Use a {@link Queue} instead of a GList if you regularly need the number
     * of items. To check whether the list is non-empty, it is faster to check
     * {@code list} against {@code null}.
     * @param list a {@link List}, this must point to the top of the list
     * @return the number of elements in the {@link List}
     */
    public static int length(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_length.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the element at the given position in a {@link List}.
     * <p>
     * This iterates over the list until it reaches the {@code n}-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the {@link List} introduction.
     * @param list a {@link List}, this must point to the top of the list
     * @param n the position of the element, counting from 0
     * @return the element, or {@code null} if the position is off
     *     the end of the {@link List}
     */
    public static @NotNull org.gtk.glib.List nth(@NotNull org.gtk.glib.List list, int n) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_nth.invokeExact(
                    list.handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the data of the element at the given position.
     * <p>
     * This iterates over the list until it reaches the {@code n}-th position. If you
     * intend to iterate over every element, it is better to use a for-loop as
     * described in the {@link List} introduction.
     * @param list a {@link List}, this must point to the top of the list
     * @param n the position of the element
     * @return the element's data, or {@code null} if the position
     *     is off the end of the {@link List}
     */
    public static @Nullable java.lang.foreign.MemoryAddress nthData(@NotNull org.gtk.glib.List list, int n) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_nth_data.invokeExact(
                    list.handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the element {@code n} places before {@code list}.
     * @param list a {@link List}
     * @param n the position of the element, counting from 0
     * @return the element, or {@code null} if the position is
     *     off the end of the {@link List}
     */
    public static @NotNull org.gtk.glib.List nthPrev(@NotNull org.gtk.glib.List list, int n) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_nth_prev.invokeExact(
                    list.handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the position of the given element
     * in the {@link List} (starting from 0).
     * @param list a {@link List}, this must point to the top of the list
     * @param llink an element in the {@link List}
     * @return the position of the element in the {@link List},
     *     or -1 if the element is not found
     */
    public static int position(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.List llink) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(llink, "Parameter 'llink' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_position.invokeExact(
                    list.handle(),
                    llink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Prepends a new element on to the start of the list.
     * <p>
     * Note that the return value is the new start of the list,
     * which will have changed, so make sure you store the new value.
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
     * @param list a pointer to a {@link List}, this must point to the top of the list
     * @param data the data for the new element
     * @return a pointer to the newly prepended element, which is the new
     *     start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List prepend(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_prepend.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes an element from a {@link List}.
     * If two elements contain the same data, only the first is removed.
     * If none of the elements contain the data, the {@link List} is unchanged.
     * @param list a {@link List}, this must point to the top of the list
     * @param data the data of the element to remove
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List remove(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_remove.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes all list nodes with data equal to {@code data}.
     * Returns the new head of the list. Contrast with
     * g_list_remove() which removes only the first node
     * matching the given data.
     * @param list a {@link List}, this must point to the top of the list
     * @param data data to remove
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List removeAll(@NotNull org.gtk.glib.List list, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_remove_all.invokeExact(
                    list.handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
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
     * @param list a {@link List}, this must point to the top of the list
     * @param llink an element in the {@link List}
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List removeLink(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.List llink) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(llink, "Parameter 'llink' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_remove_link.invokeExact(
                    list.handle(),
                    llink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Reverses a {@link List}.
     * It simply switches the next and prev pointers of each element.
     * @param list a {@link List}, this must point to the top of the list
     * @return the start of the reversed {@link List}
     */
    public static @NotNull org.gtk.glib.List reverse(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_reverse.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Sorts a {@link List} using the given comparison function. The algorithm
     * used is a stable sort.
     * @param list a {@link List}, this must point to the top of the list
     * @param compareFunc the comparison function used to sort the {@link List}.
     *     This function is passed the data from 2 elements of the {@link List}
     *     and should return 0 if they are equal, a negative value if the
     *     first element comes before the second, or a positive value if
     *     the first element comes after the second.
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List sort(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CompareFunc compareFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Like g_list_sort(), but the comparison function accepts
     * a user data argument.
     * @param list a {@link List}, this must point to the top of the list
     * @param compareFunc comparison function
     * @return the (possibly changed) start of the {@link List}
     */
    public static @NotNull org.gtk.glib.List sortWithData(@NotNull org.gtk.glib.List list, @NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_sort_with_data.invokeExact(
                    list.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_list_alloc = Interop.downcallHandle(
            "g_list_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_append = Interop.downcallHandle(
            "g_list_append",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_concat = Interop.downcallHandle(
            "g_list_concat",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_copy = Interop.downcallHandle(
            "g_list_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_copy_deep = Interop.downcallHandle(
            "g_list_copy_deep",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_delete_link = Interop.downcallHandle(
            "g_list_delete_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_find = Interop.downcallHandle(
            "g_list_find",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_find_custom = Interop.downcallHandle(
            "g_list_find_custom",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_first = Interop.downcallHandle(
            "g_list_first",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_foreach = Interop.downcallHandle(
            "g_list_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_free = Interop.downcallHandle(
            "g_list_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_free_1 = Interop.downcallHandle(
            "g_list_free_1",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_free_full = Interop.downcallHandle(
            "g_list_free_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_index = Interop.downcallHandle(
            "g_list_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_insert = Interop.downcallHandle(
            "g_list_insert",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_list_insert_before = Interop.downcallHandle(
            "g_list_insert_before",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_insert_before_link = Interop.downcallHandle(
            "g_list_insert_before_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_insert_sorted = Interop.downcallHandle(
            "g_list_insert_sorted",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_insert_sorted_with_data = Interop.downcallHandle(
            "g_list_insert_sorted_with_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_last = Interop.downcallHandle(
            "g_list_last",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_length = Interop.downcallHandle(
            "g_list_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_nth = Interop.downcallHandle(
            "g_list_nth",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_list_nth_data = Interop.downcallHandle(
            "g_list_nth_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_list_nth_prev = Interop.downcallHandle(
            "g_list_nth_prev",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_list_position = Interop.downcallHandle(
            "g_list_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_prepend = Interop.downcallHandle(
            "g_list_prepend",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_remove = Interop.downcallHandle(
            "g_list_remove",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_remove_all = Interop.downcallHandle(
            "g_list_remove_all",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_remove_link = Interop.downcallHandle(
            "g_list_remove_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_reverse = Interop.downcallHandle(
            "g_list_reverse",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_sort = Interop.downcallHandle(
            "g_list_sort",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_sort_with_data = Interop.downcallHandle(
            "g_list_sort_with_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
