package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Filter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Filter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Filter if its GType is a (or inherits from) "GtkFilter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Filter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFilter", a ClassCastException will be thrown.
     */
    public static Filter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFilter"))) {
            return new Filter(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFilter");
        }
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
     * @param change How the filter changed
     */
    public void changed(@NotNull org.gtk.gtk.FilterChange change) {
        java.util.Objects.requireNonNull(change, "Parameter 'change' must not be null");
        try {
            DowncallHandles.gtk_filter_changed.invokeExact(
                    handle(),
                    change.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the strictness of {@code self}
     */
    public @NotNull org.gtk.gtk.FilterMatch getStrictness() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_filter_get_strictness.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.FilterMatch(RESULT);
    }
    
    /**
     * Checks if the given {@code item} is matched by the filter or not.
     * @param item The item to check
     * @return {@code true} if the filter matches the item and a filter model should
     *   keep it, {@code false} if not.
     */
    public boolean match(@NotNull org.gtk.gobject.Object item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_filter_match.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Filter source, @NotNull org.gtk.gtk.FilterChange change);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Filter.Changed> onChanged(Filter.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Filter.Callbacks.class, "signalFilterChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Filter.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_filter_changed = Interop.downcallHandle(
            "gtk_filter_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_filter_get_strictness = Interop.downcallHandle(
            "gtk_filter_get_strictness",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_match = Interop.downcallHandle(
            "gtk_filter_match",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalFilterChanged(MemoryAddress source, int change, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Filter.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Filter(source, Ownership.UNKNOWN), new org.gtk.gtk.FilterChange(change));
        }
    }
}
