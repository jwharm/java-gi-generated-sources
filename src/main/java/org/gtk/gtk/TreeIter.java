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
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeIter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("stamp"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("user_data2"),
        Interop.valueLayout.ADDRESS.withName("user_data3")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TreeIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeIter newInstance = new TreeIter(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code stamp}
     * @return The value of the field {@code stamp}
     */
    public int stamp$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stamp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code stamp}
     * @param stamp The new value of the field {@code stamp}
     */
    public void stamp$set(int stamp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stamp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), stamp);
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress user_data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param user_data The new value of the field {@code user_data}
     */
    public void user_data$set(java.lang.foreign.MemoryAddress user_data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), user_data);
    }
    
    /**
     * Get the value of the field {@code user_data2}
     * @return The value of the field {@code user_data2}
     */
    public java.lang.foreign.MemoryAddress user_data2$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data2}
     * @param user_data2 The new value of the field {@code user_data2}
     */
    public void user_data2$set(java.lang.foreign.MemoryAddress user_data2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), user_data2);
    }
    
    /**
     * Get the value of the field {@code user_data3}
     * @return The value of the field {@code user_data3}
     */
    public java.lang.foreign.MemoryAddress user_data3$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data3"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data3}
     * @param user_data3 The new value of the field {@code user_data3}
     */
    public void user_data3$set(java.lang.foreign.MemoryAddress user_data3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), user_data3);
    }
    
    @ApiStatus.Internal
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_iter_copy.invokeExact(
                    handle());
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
            DowncallHandles.gtk_tree_iter_free.invokeExact(
                    handle());
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
