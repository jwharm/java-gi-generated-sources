package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSorter` is an object to describe sorting criteria.
 * 
 * Its primary user is [class@Gtk.SortListModel]
 * 
 * The model will use a sorter to determine the order in which
 * its items should appear by calling [method@Gtk.Sorter.compare]
 * for pairs of items.
 * 
 * Sorters may change their sorting behavior through their lifetime.
 * In that case, they will emit the [signal@Gtk.Sorter::changed] signal
 * to notify that the sort order is no longer valid and should be updated
 * by calling gtk_sorter_compare() again.
 * 
 * GTK provides various pre-made sorter implementations for common sorting
 * operations. [class@Gtk.ColumnView] has built-in support for sorting lists
 * via the [property@Gtk.ColumnViewColumn:sorter] property, where the user can
 * change the sorting by clicking on list headers.
 * 
 * Of course, in particular for large lists, it is also possible to subclass
 * `GtkSorter` and provide one's own sorter.
 */
public class Sorter extends org.gtk.gobject.Object {

    public Sorter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Sorter */
    public static Sorter castFrom(org.gtk.gobject.Object gobject) {
        return new Sorter(gobject.getReference());
    }
    
    /**
     * Notifies all users of the sorter that it has changed.
     * 
     * This emits the [signal@Gtk.Sorter::changed] signal. Users
     * of the sorter should then update the sort order via
     * [method@Gtk.Sorter.compare].
     * 
     * Depending on the @change parameter, it may be possible to
     * update the sort order without a full resorting. Refer to
     * the [enum@Gtk.SorterChange] documentation for details.
     * 
     * This function is intended for implementors of `GtkSorter`
     * subclasses and should not be called from other functions.
     */
    public void changed(SorterChange change) {
        gtk_h.gtk_sorter_changed(handle(), change.getValue());
    }
    
    /**
     * Compares two given items according to the sort order implemented
     * by the sorter.
     * 
     * Sorters implement a partial order:
     * 
     * * It is reflexive, ie a = a
     * * It is antisymmetric, ie if a < b and b < a, then a = b
     * * It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
     *   then a ≤ c
     * 
     * The sorter may signal it conforms to additional constraints
     * via the return value of [method@Gtk.Sorter.get_order].
     */
    public Ordering compare(org.gtk.gobject.Object item1, org.gtk.gobject.Object item2) {
        var RESULT = gtk_h.gtk_sorter_compare(handle(), item1.handle(), item2.handle());
        return Ordering.fromValue(RESULT);
    }
    
    /**
     * Gets the order that @self conforms to.
     * 
     * See [enum@Gtk.SorterOrder] for details
     * of the possible return values.
     * 
     * This function is intended to allow optimizations.
     */
    public SorterOrder getOrder() {
        var RESULT = gtk_h.gtk_sorter_get_order(handle());
        return SorterOrder.fromValue(RESULT);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Sorter source, SorterChange change);
    }
    
    /**
     * Emitted whenever the sorter changed.
     * 
     * Users of the sorter should then update the sort order
     * again via gtk_sorter_compare().
     * 
     * [class@Gtk.SortListModel] handles this signal automatically.
     * 
     * Depending on the @change parameter, it may be possible to update
     * the sort order without a full resorting. Refer to the
     * [enum@Gtk.SorterChange] documentation for details.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSorterChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
