package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMultiSorter} combines multiple sorters by trying them
 * in turn.
 * <p>
 * If the first sorter compares two items as equal,
 * the second is tried next, and so on.
 */
public class MultiSorter extends org.gtk.gtk.Sorter implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public MultiSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MultiSorter */
    public static MultiSorter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiSorter(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_multi_sorter_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new multi sorter.
     * <p>
     * This sorter compares items by trying each of the sorters
     * in turn, until one returns non-zero. In particular, if
     * no sorter has been added to it, it will always compare
     * items as equal.
     */
    public MultiSorter() {
        super(constructNew());
    }
    
    /**
     * Add {@code sorter} to {@code self} to use for sorting at the end.
     * <p>
     * {@code self} will consult all existing sorters before it will
     * sort with the given {@code sorter}.
     * @param sorter a sorter to add
     */
    public void append(@NotNull org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNull(sorter, "Parameter 'sorter' must not be null");
        try {
            DowncallHandles.gtk_multi_sorter_append.invokeExact(handle(), sorter.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the sorter at the given {@code position} from the list of sorter
     * used by {@code self}.
     * <p>
     * If {@code position} is larger than the number of sorters, nothing happens.
     * @param position position of sorter to remove
     */
    public void remove(int position) {
        try {
            DowncallHandles.gtk_multi_sorter_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_multi_sorter_new = Interop.downcallHandle(
            "gtk_multi_sorter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_multi_sorter_append = Interop.downcallHandle(
            "gtk_multi_sorter_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_multi_sorter_remove = Interop.downcallHandle(
            "gtk_multi_sorter_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
