package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 */
/**
 * Functional interface declaration of the {@code TreeViewMappingFunc} callback.
 */
@FunctionalInterface
public interface TreeViewMappingFunc {

    /**
     * Function used for gtk_tree_view_map_expanded_rows().
     */
    void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreePath path);
    
    @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
        run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeViewMappingFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
