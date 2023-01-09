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
public class Sorter extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Sorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Sorter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Sorter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Sorter(input);
    
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
    public void changed(org.gtk.gtk.SorterChange change) {
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
    public org.gtk.gtk.Ordering compare(org.gtk.gobject.GObject item1, org.gtk.gobject.GObject item2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sorter_compare.invokeExact(
                    handle(),
                    item1.handle(),
                    item2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Ordering.of(RESULT);
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
    public org.gtk.gtk.SorterOrder getOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sorter_get_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SorterOrder.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
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
        void run(org.gtk.gtk.SorterChange change);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSorter, int change) {
            run(org.gtk.gtk.SorterChange.of(change));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Sorter.Changed> onChanged(Sorter.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Sorter.Builder} object constructs a {@link Sorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Sorter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Sorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Sorter}.
         * @return A new instance of {@code Sorter} with the properties 
         *         that were set in the Builder object.
         */
        public Sorter build() {
            return (Sorter) org.gtk.gobject.GObject.newWithProperties(
                Sorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_sorter_changed = Interop.downcallHandle(
                "gtk_sorter_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_sorter_compare = Interop.downcallHandle(
                "gtk_sorter_compare",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_sorter_get_order = Interop.downcallHandle(
                "gtk_sorter_get_order",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_sorter_get_type = Interop.downcallHandle(
                "gtk_sorter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_sorter_get_type != null;
    }
}
