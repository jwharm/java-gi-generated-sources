package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSorter} is an object to describe sorting criteria.
 * <p>
 * Its primary user is {@link SortListModel}
 * <p>
 * The model will use a sorter to determine the order in which
 * its items should appear by calling {@link Sorter#compare}
 * for pairs of items.
 * <p>
 * Sorters may change their sorting behavior through their lifetime.
 * In that case, they will emit the {@code Gtk.Sorter::changed} signal
 * to notify that the sort order is no longer valid and should be updated
 * by calling gtk_sorter_compare() again.
 * <p>
 * GTK provides various pre-made sorter implementations for common sorting
 * operations. {@link ColumnView} has built-in support for sorting lists
 * via the {@code Gtk.ColumnViewColumn:sorter} property, where the user can
 * change the sorting by clicking on list headers.
 * <p>
 * Of course, in particular for large lists, it is also possible to subclass
 * {@code GtkSorter} and provide one's own sorter.
 */
public class Sorter extends org.gtk.gobject.Object {

    public Sorter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Sorter */
    public static Sorter castFrom(org.gtk.gobject.Object gobject) {
        return new Sorter(gobject.getReference());
    }
    
    /**
     * Notifies all users of the sorter that it has changed.
     * <p>
     * This emits the {@code Gtk.Sorter::changed} signal. Users
     * of the sorter should then update the sort order via
     * {@link Sorter#compare}.
     * <p>
     * Depending on the {@code change} parameter, it may be possible to
     * update the sort order without a full resorting. Refer to
     * the {@code Gtk.SorterChange} documentation for details.
     * <p>
     * This function is intended for implementors of {@code GtkSorter}
     * subclasses and should not be called from other functions.
     */
    public void changed(SorterChange change) {
        gtk_h.gtk_sorter_changed(handle(), change.getValue());
    }
    
    /**
     * Compares two given items according to the sort order implemented
     * by the sorter.
     * <p>
     * Sorters implement a partial order:
     * <p>
     * * It is reflexive, ie a = a
     * * It is antisymmetric, ie if a < b and b < a, then a = b
     * * It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
     *   then a ≤ c
     * <p>
     * The sorter may signal it conforms to additional constraints
     * via the return value of {@link Sorter#getOrder}.
     */
    public Ordering compare(org.gtk.gobject.Object item1, org.gtk.gobject.Object item2) {
        var RESULT = gtk_h.gtk_sorter_compare(handle(), item1.handle(), item2.handle());
        return new Ordering(RESULT);
    }
    
    /**
     * Gets the order that {@code self} conforms to.
     * <p>
     * See {@code Gtk.SorterOrder} for details
     * of the possible return values.
     * <p>
     * This function is intended to allow optimizations.
     */
    public SorterOrder getOrder() {
        var RESULT = gtk_h.gtk_sorter_get_order(handle());
        return new SorterOrder(RESULT);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Sorter source, SorterChange change);
    }
    
    /**
     * Emitted whenever the sorter changed.
     * <p>
     * Users of the sorter should then update the sort order
     * again via gtk_sorter_compare().
     * <p>
     * {@link SortListModel} handles this signal automatically.
     * <p>
     * Depending on the {@code change} parameter, it may be possible to update
     * the sort order without a full resorting. Refer to the
     * {@code Gtk.SorterChange} documentation for details.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Sorter.Callbacks.class, "signalSorterChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSorterChanged(MemoryAddress source, int change, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Sorter.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Sorter(References.get(source)), new SorterChange(change));
        }
        
    }
}
