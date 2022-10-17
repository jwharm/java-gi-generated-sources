package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ListStore} is a simple implementation of {@link ListModel} that stores all
 * items in memory.
 * <p>
 * It provides insertions, deletions, and lookups in logarithmic time
 * with a fast path for the common case of iterating the list linearly.
 */
public class ListStore extends org.gtk.gobject.Object implements ListModel {

    public ListStore(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListStore */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        return new ListStore(gobject.refcounted());
    }
    
    private static final MethodHandle g_list_store_new = Interop.downcallHandle(
        "g_list_store_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gobject.Type itemType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_list_store_new.invokeExact(itemType.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ListStore} with items of type {@code item_type}. {@code item_type}
     * must be a subclass of {@link org.gtk.gobject.Object}.
     */
    public ListStore(@NotNull org.gtk.gobject.Type itemType) {
        super(constructNew(itemType));
    }
    
    private static final MethodHandle g_list_store_append = Interop.downcallHandle(
        "g_list_store_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code item} to {@code store}. {@code item} must be of type {@link ListStore}:item-type.
     * <p>
     * This function takes a ref on {@code item}.
     * <p>
     * Use g_list_store_splice() to append multiple items at the same time
     * efficiently.
     */
    public @NotNull void append(@NotNull org.gtk.gobject.Object item) {
        try {
            g_list_store_append.invokeExact(handle(), item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_list_store_find = Interop.downcallHandle(
        "g_list_store_find",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the given {@code item} in the list store by looping over the items until
     * the first occurrence of {@code item}. If {@code item} was not found, then {@code position} will
     * not be set, and this method will return {@code false}.
     * <p>
     * If you need to compare the two items with a custom comparison function, use
     * g_list_store_find_with_equal_func() with a custom {@link org.gtk.glib.EqualFunc} instead.
     */
    public boolean find(@NotNull org.gtk.gobject.Object item, @NotNull Out<Integer> position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) g_list_store_find.invokeExact(handle(), item.handle(), (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(positionPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle g_list_store_insert = Interop.downcallHandle(
        "g_list_store_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code item} into {@code store} at {@code position}. {@code item} must be of type
     * {@link ListStore}:item-type or derived from it. {@code position} must be smaller
     * than the length of the list, or equal to it to append.
     * <p>
     * This function takes a ref on {@code item}.
     * <p>
     * Use g_list_store_splice() to insert multiple items at the same time
     * efficiently.
     */
    public @NotNull void insert(@NotNull int position, @NotNull org.gtk.gobject.Object item) {
        try {
            g_list_store_insert.invokeExact(handle(), position, item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_list_store_insert_sorted = Interop.downcallHandle(
        "g_list_store_insert_sorted",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code item} into {@code store} at a position to be determined by the
     * {@code compare_func}.
     * <p>
     * The list must already be sorted before calling this function or the
     * result is undefined.  Usually you would approach this by only ever
     * inserting items by way of this function.
     * <p>
     * This function takes a ref on {@code item}.
     */
    public int insertSorted(@NotNull org.gtk.gobject.Object item, @NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        int RESULT;
        try {
            RESULT = (int) g_list_store_insert_sorted.invokeExact(handle(), item.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_list_store_remove = Interop.downcallHandle(
        "g_list_store_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the item from {@code store} that is at {@code position}. {@code position} must be
     * smaller than the current length of the list.
     * <p>
     * Use g_list_store_splice() to remove multiple items at the same time
     * efficiently.
     */
    public @NotNull void remove(@NotNull int position) {
        try {
            g_list_store_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_list_store_remove_all = Interop.downcallHandle(
        "g_list_store_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all items from {@code store}.
     */
    public @NotNull void removeAll() {
        try {
            g_list_store_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_list_store_sort = Interop.downcallHandle(
        "g_list_store_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sort the items in {@code store} according to {@code compare_func}.
     */
    public @NotNull void sort(@NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        try {
            g_list_store_sort.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_list_store_splice = Interop.downcallHandle(
        "g_list_store_splice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes {@code store} by removing {@code n_removals} items and adding {@code n_additions}
     * items to it. {@code additions} must contain {@code n_additions} items of type
     * {@link ListStore}:item-type.  {@code null} is not permitted.
     * <p>
     * This function is more efficient than g_list_store_insert() and
     * g_list_store_remove(), because it only emits
     * {@link ListModel}::items-changed once for the change.
     * <p>
     * This function takes a ref on each item in {@code additions}.
     * <p>
     * The parameters {@code position} and {@code n_removals} must be correct (ie:
     * {@code position} + {@code n_removals} must be less than or equal to the length of
     * the list at the time this function is called).
     */
    public @NotNull void splice(@NotNull int position, @NotNull int nRemovals, @NotNull org.gtk.gobject.Object[] additions, @NotNull int nAdditions) {
        try {
            g_list_store_splice.invokeExact(handle(), position, nRemovals, Interop.allocateNativeArray(additions), nAdditions);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
