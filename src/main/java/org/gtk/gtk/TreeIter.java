package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkTreeIter} is the primary structure
 * for accessing a {@code GtkTreeModel}. Models are expected to put a unique
 * integer in the {@code stamp} member, and put
 * model-specific data in the three {@code user_data}
 * members.
 */
public class TreeIter extends io.github.jwharm.javagi.ResourceBase {

    public TreeIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gtk_tree_iter_copy = Interop.downcallHandle(
        "gtk_tree_iter_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a dynamically allocated tree iterator as a copy of {@code iter}.
     * <p>
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * ({@code GtkTreeIter new_iter = iter;}).
     * You must free this iter with gtk_tree_iter_free().
     */
    public @NotNull TreeIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_iter_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeIter(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_iter_free = Interop.downcallHandle(
        "gtk_tree_iter_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * <p>
     * This function is mainly used for language bindings.
     */
    public @NotNull void free() {
        try {
            gtk_tree_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
