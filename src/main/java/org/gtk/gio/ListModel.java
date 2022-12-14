package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ListModel} is an interface that represents a mutable list of
 * {@code GObjects}. Its main intention is as a model for various widgets in
 * user interfaces, such as list views, but it can also be used as a
 * convenient method of returning lists of data, with support for
 * updates.
 * <p>
 * Each object in the list may also report changes in itself via some
 * mechanism (normally the {@link org.gtk.gobject.GObject}::notify signal).  Taken together
 * with the {@link ListModel}::items-changed signal, this provides for a list
 * that can change its membership, and in which the members can change
 * their individual properties.
 * <p>
 * A good example would be the list of visible wireless network access
 * points, where each access point can report dynamic properties such as
 * signal strength.
 * <p>
 * It is important to note that the {@link ListModel} itself does not report
 * changes to the individual items.  It only reports changes to the list
 * membership.  If you want to observe changes to the objects themselves
 * then you need to connect signals to the objects that you are
 * interested in.
 * <p>
 * All items in a {@link ListModel} are of (or derived from) the same type.
 * g_list_model_get_item_type() returns that type.  The type may be an
 * interface, in which case all objects in the list must implement it.
 * <p>
 * The semantics are close to that of an array:
 * g_list_model_get_n_items() returns the number of items in the list and
 * g_list_model_get_item() returns an item at a (0-based) position. In
 * order to allow implementations to calculate the list length lazily,
 * you can also iterate over items: starting from 0, repeatedly call
 * g_list_model_get_item() until it returns {@code null}.
 * <p>
 * An implementation may create objects lazily, but must take care to
 * return the same object for a given position until all references to
 * it are gone.
 * <p>
 * On the other side, a consumer is expected only to hold references on
 * objects that are currently "user visible", in order to facilitate the
 * maximum level of laziness in the implementation of the list and to
 * reduce the required number of signal connections at a given time.
 * <p>
 * This interface is intended only to be used from a single thread.  The
 * thread in which it is appropriate to use it depends on the particular
 * implementation, but typically it will be from the thread that owns
 * the [thread-default main context][g-main-context-push-thread-default]
 * in effect at the time that the model was created.
 * <p>
 * Over time, it has established itself as good practice for listmodel
 * implementations to provide properties {@code item-type} and {@code n-items} to
 * ease working with them. While it is not required, it is recommended
 * that implementations provide these two properties. They should return
 * the values of g_list_model_get_item_type() and g_list_model_get_n_items()
 * respectively and be defined as such:
 * <pre>{@code <!-- language="C" -->
 * properties[PROP_ITEM_TYPE] =
 *   g_param_spec_gtype ("item-type", "", "", G_TYPE_OBJECT,
 *                       G_PARAM_CONSTRUCT_ONLY | G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
 * properties[PROP_N_ITEMS] =
 *   g_param_spec_uint ("n-items", "", "", 0, G_MAXUINT, 0,
 *                      G_PARAM_READABLE | G_PARAM_STATIC_STRINGS);
 * }</pre>
 */
public interface ListModel extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListModelImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ListModelImpl(input);
    
    /**
     * Gets the type of the items in {@code list}.
     * <p>
     * All items returned from g_list_model_get_item() are of the type
     * returned by this function, or a subtype, or if the type is an
     * interface, they are an implementation of that interface.
     * <p>
     * The item type of a {@link ListModel} can not change during the life of the
     * model.
     * @return the {@link org.gtk.glib.Type} of the items contained in {@code list}.
     */
    default org.gtk.glib.Type getItemType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_list_model_get_item_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the number of items in {@code list}.
     * <p>
     * Depending on the model implementation, calling this function may be
     * less efficient than iterating the list with increasing values for
     * {@code position} until g_list_model_get_item() returns {@code null}.
     * @return the number of items in {@code list}.
     */
    default int getNItems() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_list_model_get_n_items.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the item at {@code position}.
     * <p>
     * If {@code position} is greater than the number of items in {@code list}, {@code null} is
     * returned.
     * <p>
     * {@code null} is never returned for an index that is smaller than the length
     * of the list.
     * <p>
     * This function is meant to be used by language bindings in place
     * of g_list_model_get_item().
     * <p>
     * See also: g_list_model_get_n_items()
     * @param position the position of the item to fetch
     * @return the object at {@code position}.
     */
    default @Nullable org.gtk.gobject.GObject getItem(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_list_model_get_object.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Emits the {@link ListModel}::items-changed signal on {@code list}.
     * <p>
     * This function should only be called by classes implementing
     * {@link ListModel}. It has to be called after the internal representation
     * of {@code list} has been updated, because handlers connected to this signal
     * might query the new state of the list.
     * <p>
     * Implementations must only make changes to the model (as visible to
     * its consumer) in places that will not cause problems for that
     * consumer.  For models that are driven directly by a write API (such
     * as {@link ListStore}), changes can be reported in response to uses of that
     * API.  For models that represent remote data, changes should only be
     * made from a fresh mainloop dispatch.  It is particularly not
     * permitted to make changes in response to a call to the {@link ListModel}
     * consumer API.
     * <p>
     * Stated another way: in general, it is assumed that code making a
     * series of accesses to the model via the API, without returning to the
     * mainloop, and without calling other code, will continue to view the
     * same contents of the model.
     * @param position the position at which {@code list} changed
     * @param removed the number of items removed
     * @param added the number of items added
     */
    default void itemsChanged(int position, int removed, int added) {
        try {
            DowncallHandles.g_list_model_items_changed.invokeExact(
                    handle(),
                    position,
                    removed,
                    added);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ItemsChanged} callback.
     */
    @FunctionalInterface
    public interface ItemsChanged {
    
        /**
         * This signal is emitted whenever items were added to or removed
         * from {@code list}. At {@code position}, {@code removed} items were removed and {@code added}
         * items were added in their place.
         * <p>
         * Note: If {@code removed != added}, the positions of all later items
         * in the model change.
         */
        void run(int position, int removed, int added);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListModel, int position, int removed, int added) {
            run(position, removed, added);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ItemsChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted whenever items were added to or removed
     * from {@code list}. At {@code position}, {@code removed} items were removed and {@code added}
     * items were added in their place.
     * <p>
     * Note: If {@code removed != added}, the positions of all later items
     * in the model change.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ListModel.ItemsChanged> onItemsChanged(ListModel.ItemsChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("items-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_list_model_get_item_type = Interop.downcallHandle(
                "g_list_model_get_item_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_list_model_get_n_items = Interop.downcallHandle(
                "g_list_model_get_n_items",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_list_model_get_object = Interop.downcallHandle(
                "g_list_model_get_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_list_model_items_changed = Interop.downcallHandle(
                "g_list_model_items_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_list_model_get_type = Interop.downcallHandle(
                "g_list_model_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The ListModelImpl type represents a native instance of the ListModel interface.
     */
    class ListModelImpl extends org.gtk.gobject.GObject implements ListModel {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ListModel for the provided memory address.
         * @param address the memory address of the instance
         */
        public ListModelImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_list_model_get_type != null;
    }
}
