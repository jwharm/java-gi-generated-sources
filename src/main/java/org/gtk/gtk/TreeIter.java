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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("stamp"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("user_data2"),
        Interop.valueLayout.ADDRESS.withName("user_data3")
    ).withName("GtkTreeIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TreeIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Creates a dynamically allocated tree iterator as a copy of {@code iter}.
     * <p>
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * ({@code GtkTreeIter new_iter = iter;}).
     * You must free this iter with gtk_tree_iter_free().
     * @return a newly-allocated copy of {@code iter}
     */
    public @NotNull org.gtk.gtk.TreeIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_iter_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeIter(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * <p>
     * This function is mainly used for language bindings.
     */
    public void free() {
        try {
            DowncallHandles.gtk_tree_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_iter_copy = Interop.downcallHandle(
            "gtk_tree_iter_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_iter_free = Interop.downcallHandle(
            "gtk_tree_iter_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
