package org.gtk.gtk;

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

    public Filter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Filter */
    public static Filter castFrom(org.gtk.gobject.Object gobject) {
        return new Filter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_filter_changed = Interop.downcallHandle(
        "gtk_filter_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_filter_changed.invokeExact(handle(), change.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_filter_get_strictness = Interop.downcallHandle(
        "gtk_filter_get_strictness",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gtk_filter_get_strictness.invokeExact(handle());
            return new FilterMatch(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_filter_match = Interop.downcallHandle(
        "gtk_filter_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@code item} is matched by the filter or not.
     */
    public boolean match(org.gtk.gobject.Object item) {
        try {
            var RESULT = (int) gtk_filter_match.invokeExact(handle(), item.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Filter.Callbacks.class, "signalFilterChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFilterChanged(MemoryAddress source, int change, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Filter.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Filter(Refcounted.get(source)), new FilterChange(change));
        }
        
    }
}
