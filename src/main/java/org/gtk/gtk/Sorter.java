package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public Sorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Sorter if its GType is a (or inherits from) "GtkSorter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Sorter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSorter", a ClassCastException will be thrown.
     */
    public static Sorter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSorter"))) {
            return new Sorter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSorter");
        }
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
     * @param change How the sorter changed
     */
    public void changed(@NotNull org.gtk.gtk.SorterChange change) {
        java.util.Objects.requireNonNull(change, "Parameter 'change' must not be null");
        try {
            DowncallHandles.gtk_sorter_changed.invokeExact(
                    handle(),
                    change.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares two given items according to the sort order implemented
     * by the sorter.
     * <p>
     * Sorters implement a partial order:
     * <p>
     * * It is reflexive, ie a = a
     * * It is antisymmetric, ie if a &lt; b and b &lt; a, then a = b
     * * It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
     *   then a ≤ c
     * <p>
     * The sorter may signal it conforms to additional constraints
     * via the return value of {@link Sorter#getOrder}.
     * @param item1 first item to compare
     * @param item2 second item to compare
     * @return {@link Ordering#EQUAL} if {@code item1} == {@code item2},
     *   {@link Ordering#SMALLER} if {@code item1} &lt; {@code item2},
     *   {@link Ordering#LARGER} if {@code item1} &gt; {@code item2}
     */
    public @NotNull org.gtk.gtk.Ordering compare(@NotNull org.gtk.gobject.Object item1, @NotNull org.gtk.gobject.Object item2) {
        java.util.Objects.requireNonNull(item1, "Parameter 'item1' must not be null");
        java.util.Objects.requireNonNull(item2, "Parameter 'item2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sorter_compare.invokeExact(
                    handle(),
                    item1.handle(),
                    item2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Ordering(RESULT);
    }
    
    /**
     * Gets the order that {@code self} conforms to.
     * <p>
     * See {@code Gtk.SorterOrder} for details
     * of the possible return values.
     * <p>
     * This function is intended to allow optimizations.
     * @return The order
     */
    public @NotNull org.gtk.gtk.SorterOrder getOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sorter_get_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SorterOrder(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Sorter source, @NotNull org.gtk.gtk.SorterChange change);
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
    public Signal<Sorter.Changed> onChanged(Sorter.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Sorter.Callbacks.class, "signalSorterChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Sorter.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_sorter_changed = Interop.downcallHandle(
            "gtk_sorter_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_sorter_compare = Interop.downcallHandle(
            "gtk_sorter_compare",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sorter_get_order = Interop.downcallHandle(
            "gtk_sorter_get_order",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSorterChanged(MemoryAddress source, int change, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Sorter.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Sorter(Refcounted.get(source)), new org.gtk.gtk.SorterChange(change));
        }
    }
}
