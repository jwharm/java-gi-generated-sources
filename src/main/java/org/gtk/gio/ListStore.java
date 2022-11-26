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
public class ListStore extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GListStore";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ListStore proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListStore(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListStore if its GType is a (or inherits from) "GListStore".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListStore} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GListStore", a ClassCastException will be thrown.
     */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ListStore.getType())) {
            return new ListStore(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GListStore");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type itemType) {
        java.util.Objects.requireNonNull(itemType, "Parameter 'itemType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_store_new.invokeExact(
                    itemType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ListStore} with items of type {@code item_type}. {@code item_type}
     * must be a subclass of {@link org.gtk.gobject.Object}.
     * @param itemType the {@link org.gtk.gobject.Type} of items in the list
     */
    public ListStore(@NotNull org.gtk.glib.Type itemType) {
        super(constructNew(itemType), Ownership.FULL);
    }
    
    /**
     * Appends {@code item} to {@code store}. {@code item} must be of type {@link ListStore}:item-type.
     * <p>
     * This function takes a ref on {@code item}.
     * <p>
     * Use g_list_store_splice() to append multiple items at the same time
     * efficiently.
     * @param item the new item
     */
    public void append(@NotNull org.gtk.gobject.Object item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        try {
            DowncallHandles.g_list_store_append.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the given {@code item} in the list store by looping over the items until
     * the first occurrence of {@code item}. If {@code item} was not found, then {@code position} will
     * not be set, and this method will return {@code false}.
     * <p>
     * If you need to compare the two items with a custom comparison function, use
     * g_list_store_find_with_equal_func() with a custom {@link org.gtk.glib.EqualFunc} instead.
     * @param item an item
     * @param position the first position of {@code item}, if it was found.
     * @return Whether {@code store} contains {@code item}. If it was found, {@code position} will be
     * set to the position where {@code item} occurred for the first time.
     */
    public boolean find(@NotNull org.gtk.gobject.Object item, Out<Integer> position) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_store_find.invokeExact(
                    handle(),
                    item.handle(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Looks up the given {@code item} in the list store by looping over the items and
     * comparing them with {@code equal_func} until the first occurrence of {@code item} which
     * matches. If {@code item} was not found, then {@code position} will not be set, and this
     * method will return {@code false}.
     * @param item an item
     * @param equalFunc A custom equality check function
     * @param position the first position of {@code item}, if it was found.
     * @return Whether {@code store} contains {@code item}. If it was found, {@code position} will be
     * set to the position where {@code item} occurred for the first time.
     */
    public boolean findWithEqualFunc(@NotNull org.gtk.gobject.Object item, @NotNull org.gtk.glib.EqualFunc equalFunc, Out<Integer> position) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Like g_list_store_find_with_equal_func() but with an additional {@code user_data}
     * that is passed to {@code equal_func}.
     * @param item an item
     * @param equalFunc A custom equality check function
     * @param position the first position of {@code item}, if it was found.
     * @return Whether {@code store} contains {@code item}. If it was found, {@code position} will be
     * set to the position where {@code item} occurred for the first time.
     */
    public boolean findWithEqualFuncFull(@NotNull org.gtk.gobject.Object item, @NotNull org.gtk.glib.EqualFuncFull equalFunc, Out<Integer> position) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        java.util.Objects.requireNonNull(equalFunc, "Parameter 'equalFunc' must not be null");
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_store_find_with_equal_func_full.invokeExact(
                    handle(),
                    item.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbEqualFuncFull",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(equalFunc)),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Inserts {@code item} into {@code store} at {@code position}. {@code item} must be of type
     * {@link ListStore}:item-type or derived from it. {@code position} must be smaller
     * than the length of the list, or equal to it to append.
     * <p>
     * This function takes a ref on {@code item}.
     * <p>
     * Use g_list_store_splice() to insert multiple items at the same time
     * efficiently.
     * @param position the position at which to insert the new item
     * @param item the new item
     */
    public void insert(int position, @NotNull org.gtk.gobject.Object item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        try {
            DowncallHandles.g_list_store_insert.invokeExact(
                    handle(),
                    position,
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code item} into {@code store} at a position to be determined by the
     * {@code compare_func}.
     * <p>
     * The list must already be sorted before calling this function or the
     * result is undefined.  Usually you would approach this by only ever
     * inserting items by way of this function.
     * <p>
     * This function takes a ref on {@code item}.
     * @param item the new item
     * @param compareFunc pairwise comparison function for sorting
     * @return the position at which {@code item} was inserted
     */
    public int insertSorted(@NotNull org.gtk.gobject.Object item, @NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_store_insert_sorted.invokeExact(
                    handle(),
                    item.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the item from {@code store} that is at {@code position}. {@code position} must be
     * smaller than the current length of the list.
     * <p>
     * Use g_list_store_splice() to remove multiple items at the same time
     * efficiently.
     * @param position the position of the item that is to be removed
     */
    public void remove(int position) {
        try {
            DowncallHandles.g_list_store_remove.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all items from {@code store}.
     */
    public void removeAll() {
        try {
            DowncallHandles.g_list_store_remove_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sort the items in {@code store} according to {@code compare_func}.
     * @param compareFunc pairwise comparison function for sorting
     */
    public void sort(@NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        try {
            DowncallHandles.g_list_store_sort.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param position the position at which to make the change
     * @param nRemovals the number of items to remove
     * @param additions the items to add
     * @param nAdditions the number of items to add
     */
    public void splice(int position, int nRemovals, @NotNull org.gtk.gobject.Object[] additions, int nAdditions) {
        java.util.Objects.requireNonNull(additions, "Parameter 'additions' must not be null");
        try {
            DowncallHandles.g_list_store_splice.invokeExact(
                    handle(),
                    position,
                    nRemovals,
                    Interop.allocateNativeArray(additions, false),
                    nAdditions);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_list_store_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ListStore.Build} object constructs a {@link ListStore} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ListStore} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListStore} using {@link ListStore#castFrom}.
         * @return A new instance of {@code ListStore} with the properties 
         *         that were set in the Build object.
         */
        public ListStore construct() {
            return ListStore.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ListStore.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The type of items contained in this list store. Items must be
         * subclasses of {@link org.gtk.gobject.Object}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The number of items contained in this list store.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_list_store_new = Interop.downcallHandle(
            "g_list_store_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_list_store_append = Interop.downcallHandle(
            "g_list_store_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_find = Interop.downcallHandle(
            "g_list_store_find",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_find_with_equal_func = Interop.downcallHandle(
            "g_list_store_find_with_equal_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_find_with_equal_func_full = Interop.downcallHandle(
            "g_list_store_find_with_equal_func_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_insert = Interop.downcallHandle(
            "g_list_store_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_insert_sorted = Interop.downcallHandle(
            "g_list_store_insert_sorted",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_remove = Interop.downcallHandle(
            "g_list_store_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_list_store_remove_all = Interop.downcallHandle(
            "g_list_store_remove_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_sort = Interop.downcallHandle(
            "g_list_store_sort",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_list_store_splice = Interop.downcallHandle(
            "g_list_store_splice",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_list_store_get_type = Interop.downcallHandle(
            "g_list_store_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
