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
public class ListStore extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
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
     */
    protected ListStore(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListStore> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ListStore(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type itemType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_store_new.invokeExact(itemType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ListStore} with items of type {@code item_type}. {@code item_type}
     * must be a subclass of {@link org.gtk.gobject.GObject}.
     * @param itemType the {@link org.gtk.glib.Type} of items in the list
     */
    public ListStore(org.gtk.glib.Type itemType) {
        super(constructNew(itemType));
        this.takeOwnership();
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
    public void append(org.gtk.gobject.GObject item) {
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
    public boolean find(org.gtk.gobject.GObject item, Out<Integer> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_list_store_find.invokeExact(
                        handle(),
                        item.handle(),
                        (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean findWithEqualFunc(org.gtk.gobject.GObject item, org.gtk.glib.EqualFunc equalFunc, Out<Integer> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_list_store_find_with_equal_func.invokeExact(
                        handle(),
                        item.handle(),
                        (Addressable) equalFunc.toCallback(),
                        (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean findWithEqualFuncFull(org.gtk.gobject.GObject item, org.gtk.glib.EqualFuncFull equalFunc, Out<Integer> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_list_store_find_with_equal_func_full.invokeExact(
                        handle(),
                        item.handle(),
                        (Addressable) equalFunc.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public void insert(int position, org.gtk.gobject.GObject item) {
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
    public int insertSorted(org.gtk.gobject.GObject item, org.gtk.glib.CompareDataFunc compareFunc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_store_insert_sorted.invokeExact(
                    handle(),
                    item.handle(),
                    (Addressable) compareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
            DowncallHandles.g_list_store_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sort the items in {@code store} according to {@code compare_func}.
     * @param compareFunc pairwise comparison function for sorting
     */
    public void sort(org.gtk.glib.CompareDataFunc compareFunc) {
        try {
            DowncallHandles.g_list_store_sort.invokeExact(
                    handle(),
                    (Addressable) compareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void splice(int position, int nRemovals, org.gtk.gobject.GObject[] additions, int nAdditions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_list_store_splice.invokeExact(
                        handle(),
                        position,
                        nRemovals,
                        Interop.allocateNativeArray(additions, false, SCOPE),
                        nAdditions);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_list_store_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ListStore.Builder} object constructs a {@link ListStore} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ListStore.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ListStore} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListStore}.
         * @return A new instance of {@code ListStore} with the properties 
         *         that were set in the Builder object.
         */
        public ListStore build() {
            return (ListStore) org.gtk.gobject.GObject.newWithProperties(
                ListStore.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The type of items contained in this list store. Items must be
         * subclasses of {@link org.gtk.gobject.GObject}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The number of items contained in this list store.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_list_store_get_type != null;
    }
}
