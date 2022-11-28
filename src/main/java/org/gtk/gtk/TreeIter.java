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
public class TreeIter extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeIter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("stamp"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("user_data2"),
        Interop.valueLayout.ADDRESS.withName("user_data3")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeIter}
     * @return A new, uninitialized @{link TreeIter}
     */
    public static TreeIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeIter newInstance = new TreeIter(segment.address(), Ownership.NONE);
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
    public java.lang.foreign.MemoryAddress userData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void userData$set(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) userData);
    }
    
    /**
     * Get the value of the field {@code user_data2}
     * @return The value of the field {@code user_data2}
     */
    public java.lang.foreign.MemoryAddress userData2$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data2}
     * @param userData2 The new value of the field {@code user_data2}
     */
    public void userData2$set(java.lang.foreign.MemoryAddress userData2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) userData2);
    }
    
    /**
     * Get the value of the field {@code user_data3}
     * @return The value of the field {@code user_data3}
     */
    public java.lang.foreign.MemoryAddress userData3$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data3"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data3}
     * @param userData3 The new value of the field {@code user_data3}
     */
    public void userData3$set(java.lang.foreign.MemoryAddress userData3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) userData3);
    }
    
    /**
     * Create a TreeIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeIter(Addressable address, Ownership ownership) {
        super(address, ownership);
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
        return new org.gtk.gtk.TreeIter(RESULT, Ownership.FULL);
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
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_iter_free = Interop.downcallHandle(
            "gtk_tree_iter_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeIter struct;
        
         /**
         * A {@link TreeIter.Build} object constructs a {@link TreeIter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeIter.allocate();
        }
        
         /**
         * Finish building the {@link TreeIter} struct.
         * @return A new instance of {@code TreeIter} with the fields 
         *         that were set in the Build object.
         */
        public TreeIter construct() {
            return struct;
        }
        
        /**
         * a unique stamp to catch invalid iterators
         * @param stamp The value for the {@code stamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStamp(int stamp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), stamp);
            return this;
        }
        
        /**
         * model-specific data
         * @param userData The value for the {@code userData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        /**
         * model-specific data
         * @param userData2 The value for the {@code userData2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUserData2(java.lang.foreign.MemoryAddress userData2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData2 == null ? MemoryAddress.NULL : (Addressable) userData2));
            return this;
        }
        
        /**
         * model-specific data
         * @param userData3 The value for the {@code userData3} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUserData3(java.lang.foreign.MemoryAddress userData3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData3 == null ? MemoryAddress.NULL : (Addressable) userData3));
            return this;
        }
    }
}
