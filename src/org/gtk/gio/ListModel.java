package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ListModel} is an interface that represents a mutable list of
 * {@code GObjects}. Its main intention is as a model for various widgets in
 * user interfaces, such as list views, but it can also be used as a
 * convenient method of returning lists of data, with support for
 * updates.
 * <p>
 * Each object in the list may also report changes in itself via some
 * mechanism (normally the {@link org.gtk.gobject.Object}::notify signal).  Taken together
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
 * g_list_model_get_item() until it returns <code>null</code>.
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
 */
public interface ListModel extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Get the item at {@code position}.
     * <p>
     * If {@code position} is greater than the number of items in {@code list}, <code>null</code> is
     * returned.
     * <p>
     * <code>null</code> is never returned for an index that is smaller than the length
     * of the list.
     * <p>
     * See also: g_list_model_get_n_items()
     */
    public default java.lang.foreign.MemoryAddress getItem(int position) {
        var RESULT = gtk_h.g_list_model_get_item(handle(), position);
        return RESULT;
    }
    
    /**
     * Gets the type of the items in {@code list}.
     * <p>
     * All items returned from g_list_model_get_item() are of the type
     * returned by this function, or a subtype, or if the type is an
     * interface, they are an implementation of that interface.
     * <p>
     * The item type of a {@link ListModel} can not change during the life of the
     * model.
     */
    public default org.gtk.gobject.Type getItemType() {
        var RESULT = gtk_h.g_list_model_get_item_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the number of items in {@code list}.
     * <p>
     * Depending on the model implementation, calling this function may be
     * less efficient than iterating the list with increasing values for
     * {@code position} until g_list_model_get_item() returns <code>null</code>.
     */
    public default int getNItems() {
        var RESULT = gtk_h.g_list_model_get_n_items(handle());
        return RESULT;
    }
    
    /**
     * Get the item at {@code position}.
     * <p>
     * If {@code position} is greater than the number of items in {@code list}, <code>null</code> is
     * returned.
     * <p>
     * <code>null</code> is never returned for an index that is smaller than the length
     * of the list.
     * <p>
     * This function is meant to be used by language bindings in place
     * of g_list_model_get_item().
     * <p>
     * See also: g_list_model_get_n_items()
     */
    public default org.gtk.gobject.Object getObject(int position) {
        var RESULT = gtk_h.g_list_model_get_object(handle(), position);
        return new org.gtk.gobject.Object(References.get(RESULT, true));
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
     */
    public default void itemsChanged(int position, int removed, int added) {
        gtk_h.g_list_model_items_changed(handle(), position, removed, added);
    }
    
    @FunctionalInterface
    public interface ItemsChangedHandler {
        void signalReceived(ListModel source, int position, int removed, int added);
    }
    
    /**
     * This signal is emitted whenever items were added to or removed
     * from {@code list}. At {@code position}, {@code removed} items were removed and {@code added}
     * items were added in their place.
     * <p>
     * Note: If {@code removed != added}, the positions of all later items
     * in the model change.
     */
    public default SignalHandle onItemsChanged(ItemsChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListModelItemsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("items-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class ListModelImpl extends org.gtk.gobject.Object implements ListModel {
        public ListModelImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
