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
public class MultiSorter extends Sorter implements org.gtk.gio.ListModel, Buildable {

    public MultiSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MultiSorter */
    public static MultiSorter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiSorter(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_multi_sorter_new = Interop.downcallHandle(
        "gtk_multi_sorter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_multi_sorter_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_multi_sorter_append = Interop.downcallHandle(
        "gtk_multi_sorter_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add {@code sorter} to {@code self} to use for sorting at the end.
     * <p>
     * {@code self} will consult all existing sorters before it will
     * sort with the given {@code sorter}.
     */
    public @NotNull void append(@NotNull Sorter sorter) {
        try {
            gtk_multi_sorter_append.invokeExact(handle(), sorter.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_multi_sorter_remove = Interop.downcallHandle(
        "gtk_multi_sorter_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the sorter at the given {@code position} from the list of sorter
     * used by {@code self}.
     * <p>
     * If {@code position} is larger than the number of sorters, nothing happens.
     */
    public @NotNull void remove(@NotNull int position) {
        try {
            gtk_multi_sorter_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
