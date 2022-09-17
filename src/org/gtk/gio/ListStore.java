package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GListStore is a simple implementation of #GListModel that stores all
 * items in memory.
 * 
 * It provides insertions, deletions, and lookups in logarithmic time
 * with a fast path for the common case of iterating the list linearly.
 */
public class ListStore extends org.gtk.gobject.Object implements ListModel {

    public ListStore(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListStore */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        return new ListStore(gobject.getReference());
    }
    
    private static Reference constructNew(Type itemType) {
        Reference RESULT = References.get(gtk_h.g_list_store_new(itemType.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GListStore with items of type @item_type. @item_type
     * must be a subclass of #GObject.
     */
    public ListStore(Type itemType) {
        super(constructNew(itemType));
    }
    
    /**
     * Appends @item to @store. @item must be of type #GListStore:item-type.
     * 
     * This function takes a ref on @item.
     * 
     * Use g_list_store_splice() to append multiple items at the same time
     * efficiently.
     */
    public void append(org.gtk.gobject.Object item) {
        gtk_h.g_list_store_append(handle(), item.handle());
    }
    
    /**
     * Inserts @item into @store at @position. @item must be of type
     * #GListStore:item-type or derived from it. @position must be smaller
     * than the length of the list, or equal to it to append.
     * 
     * This function takes a ref on @item.
     * 
     * Use g_list_store_splice() to insert multiple items at the same time
     * efficiently.
     */
    public void insert(int position, org.gtk.gobject.Object item) {
        gtk_h.g_list_store_insert(handle(), position, item.handle());
    }
    
    /**
     * Inserts @item into @store at a position to be determined by the
     * @compare_func.
     * 
     * The list must already be sorted before calling this function or the
     * result is undefined.  Usually you would approach this by only ever
     * inserting items by way of this function.
     * 
     * This function takes a ref on @item.
     */
    public int insertSorted(org.gtk.gobject.Object item, org.gtk.glib.CompareDataFunc compareFunc) {
        try {
            var RESULT = gtk_h.g_list_store_insert_sorted(handle(), item.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes the item from @store that is at @position. @position must be
     * smaller than the current length of the list.
     * 
     * Use g_list_store_splice() to remove multiple items at the same time
     * efficiently.
     */
    public void remove(int position) {
        gtk_h.g_list_store_remove(handle(), position);
    }
    
    /**
     * Removes all items from @store.
     */
    public void removeAll() {
        gtk_h.g_list_store_remove_all(handle());
    }
    
    /**
     * Sort the items in @store according to @compare_func.
     */
    public void sort(org.gtk.glib.CompareDataFunc compareFunc) {
        try {
            gtk_h.g_list_store_sort(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Changes @store by removing @n_removals items and adding @n_additions
     * items to it. @additions must contain @n_additions items of type
     * #GListStore:item-type.  <code>null</code> is not permitted.
     * 
     * This function is more efficient than g_list_store_insert() and
     * g_list_store_remove(), because it only emits
     * #GListModel::items-changed once for the change.
     * 
     * This function takes a ref on each item in @additions.
     * 
     * The parameters @position and @n_removals must be correct (ie:
     * @position + @n_removals must be less than or equal to the length of
     * the list at the time this function is called).
     */
    public void splice(int position, int nRemovals, org.gtk.gobject.Object[] additions, int nAdditions) {
        gtk_h.g_list_store_splice(handle(), position, nRemovals, Interop.allocateNativeArray(additions).handle(), nAdditions);
    }
    
}
