package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSorter</code> is an object to describe sorting criteria.
 * <p>
 * Its primary user is {@link org.gtk.gtk.SortListModel}
 * <p>
 * The model will use a sorter to determine the order in which
 * its items should appear by calling {@link org.gtk.gtk.Sorter<code>#compare</code> 
 * for pairs of items.
 * <p>
 * Sorters may change their sorting behavior through their lifetime.
 * In that case, they will emit the {@link [signal@Gtk.Sorter::changed] (ref=signal)} signal
 * to notify that the sort order is no longer valid and should be updated
 * by calling gtk_sorter_compare() again.
 * <p>
 * GTK provides various pre-made sorter implementations for common sorting
 * operations. {@link org.gtk.gtk.ColumnView} has built-in support for sorting lists
 * via the {@link [property@Gtk.ColumnViewColumn:sorter] (ref=property)} property, where the user can
 * change the sorting by clicking on list headers.
 * <p>
 * Of course, in particular for large lists, it is also possible to subclass<code>GtkSorter</code> and provide one&<code>#39</code> s own sorter.
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
     * This emits the {@link [signal@Gtk.Sorter::changed] (ref=signal)} signal. Users
     * of the sorter should then update the sort order via
     * {@link org.gtk.gtk.Sorter<code>#compare</code> .
     * <p>
     * Depending on the @change parameter, it may be possible to
     * update the sort order without a full resorting. Refer to
     * the {@link [enum@Gtk.SorterChange] (ref=enum)} documentation for details.
     * <p>
     * This function is intended for implementors of <code>GtkSorter</code>
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
     * * It is antisymmetric, ie if a &<code>#60</code>  b and b &<code>#60</code>  a, then a = b
     * * It is transitive, ie given any 3 items with a &<code>#8804</code>  b and b &<code>#8804</code>  c,
     *   then a &<code>#8804</code>  c
     * 
     * The sorter may signal it conforms to additional constraints
     * via the return value of {@link org.gtk.gtk.Sorter<code>#getOrder</code> .
     */
    public Ordering compare(org.gtk.gobject.Object item1, org.gtk.gobject.Object item2) {
        var RESULT = gtk_h.gtk_sorter_compare(handle(), item1.handle(), item2.handle());
        return Ordering.fromValue(RESULT);
    }
    
    /**
     * Gets the order that @self conforms to.
     * 
     * See {@link [enum@Gtk.SorterOrder] (ref=enum)} for details
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
     * {@link org.gtk.gtk.SortListModel} handles this signal automatically.
     * 
     * Depending on the @change parameter, it may be possible to update
     * the sort order without a full resorting. Refer to the
     * {@link [enum@Gtk.SorterChange] (ref=enum)} documentation for details.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSorterChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
