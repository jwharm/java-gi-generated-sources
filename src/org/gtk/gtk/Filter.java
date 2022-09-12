package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkFilter` object describes the filtering to be performed by a
 * [class@Gtk.FilterListModel].
 * 
 * The model will use the filter to determine if it should include items
 * or not by calling [method@Gtk.Filter.match] for each item and only
 * keeping the ones that the function returns %TRUE for.
 * 
 * Filters may change what items they match through their lifetime. In that
 * case, they will emit the [signal@Gtk.Filter::changed] signal to notify
 * that previous filter results are no longer valid and that items should
 * be checked again via [method@Gtk.Filter.match].
 * 
 * GTK provides various pre-made filter implementations for common filtering
 * operations. These filters often include properties that can be linked to
 * various widgets to easily allow searches.
 * 
 * However, in particular for large lists or complex search methods, it is
 * also possible to subclass `GtkFilter` and provide one's own filter.
 */
public class Filter extends org.gtk.gobject.Object {

    public Filter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Filter */
    public static Filter castFrom(org.gtk.gobject.Object gobject) {
        return new Filter(gobject.getReference());
    }
    
    /**
     * Notifies all users of the filter that it has changed.
     * 
     * This emits the [signal@Gtk.Filter::changed] signal. Users
     * of the filter should then check items again via
     * [method@Gtk.Filter.match].
     * 
     * Depending on the @change parameter, not all items need to
     * be changed, but only some. Refer to the [enum@Gtk.FilterChange]
     * documentation for details.
     * 
     * This function is intended for implementors of `GtkFilter`
     * subclasses and should not be called from other functions.
     */
    public void changed(FilterChange change) {
        gtk_h.gtk_filter_changed(handle(), change.getValue());
    }
    
    /**
     * Gets the known strictness of @filters.
     * 
     * If the strictness is not known, %GTK_FILTER_MATCH_SOME is returned.
     * 
     * This value may change after emission of the [signal@Gtk.Filter::changed]
     * signal.
     * 
     * This function is meant purely for optimization purposes, filters can
     * choose to omit implementing it, but `GtkFilterListModel` uses it.
     */
    public FilterMatch getStrictness() {
        var RESULT = gtk_h.gtk_filter_get_strictness(handle());
        return FilterMatch.fromValue(RESULT);
    }
    
    /**
     * Checks if the given @item is matched by the filter or not.
     */
    public boolean match(org.gtk.gobject.Object item) {
        var RESULT = gtk_h.gtk_filter_match(handle(), item.handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Filter source, FilterChange change);
    }
    
    /**
     * Emitted whenever the filter changed.
     * 
     * Users of the filter should then check items again via
     * [method@Gtk.Filter.match].
     * 
     * `GtkFilterListModel` handles this signal automatically.
     * 
     * Depending on the @change parameter, not all items need
     * to be checked, but only some. Refer to the [enum@Gtk.FilterChange]
     * documentation for details.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFilterChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
