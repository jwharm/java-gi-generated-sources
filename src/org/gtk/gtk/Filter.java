package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkFilter} object describes the filtering to be performed by a
 * {@link FilterListModel}.
 * <p>
 * The model will use the filter to determine if it should include items
 * or not by calling {@link Filter#match} for each item and only
 * keeping the ones that the function returns {@code true} for.
 * <p>
 * Filters may change what items they match through their lifetime. In that
 * case, they will emit the {@code Gtk.Filter::changed} signal to notify
 * that previous filter results are no longer valid and that items should
 * be checked again via {@link Filter#match}.
 * <p>
 * GTK provides various pre-made filter implementations for common filtering
 * operations. These filters often include properties that can be linked to
 * various widgets to easily allow searches.
 * <p>
 * However, in particular for large lists or complex search methods, it is
 * also possible to subclass {@code GtkFilter} and provide one's own filter.
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
     * <p>
     * This emits the {@code Gtk.Filter::changed} signal. Users
     * of the filter should then check items again via
     * {@link Filter#match}.
     * <p>
     * Depending on the {@code change} parameter, not all items need to
     * be changed, but only some. Refer to the {@code Gtk.FilterChange}
     * documentation for details.
     * <p>
     * This function is intended for implementors of {@code GtkFilter}
     * subclasses and should not be called from other functions.
     */
    public void changed(FilterChange change) {
        gtk_h.gtk_filter_changed(handle(), change.getValue());
    }
    
    /**
     * Gets the known strictness of {@code filters}.
     * <p>
     * If the strictness is not known, {@link FilterMatch#SOME} is returned.
     * <p>
     * This value may change after emission of the {@code Gtk.Filter::changed}
     * signal.
     * <p>
     * This function is meant purely for optimization purposes, filters can
     * choose to omit implementing it, but {@code GtkFilterListModel} uses it.
     */
    public FilterMatch getStrictness() {
        var RESULT = gtk_h.gtk_filter_get_strictness(handle());
        return FilterMatch.fromValue(RESULT);
    }
    
    /**
     * Checks if the given {@code item} is matched by the filter or not.
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
     * <p>
     * Users of the filter should then check items again via
     * {@link Filter#match}.
     * <p>
     * {@code GtkFilterListModel} handles this signal automatically.
     * <p>
     * Depending on the {@code change} parameter, not all items need
     * to be checked, but only some. Refer to the {@code Gtk.FilterChange}
     * documentation for details.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFilterChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
