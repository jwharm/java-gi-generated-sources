package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_tree_foreach_node(). It is
 * passed each node, together with the {@code user_data} parameter passed to
 * g_tree_foreach_node(). If the function returns {@code true}, the traversal is
 * stopped.
 * @version 2.68
 */
/**
 * Functional interface declaration of the {@code TraverseNodeFunc} callback.
 */
@FunctionalInterface
public interface TraverseNodeFunc {

    /**
     * Specifies the type of function passed to g_tree_foreach_node(). It is
     * passed each node, together with the {@code user_data} parameter passed to
     * g_tree_foreach_node(). If the function returns {@code true}, the traversal is
     * stopped.
     * @version 2.68
     */
    boolean run(org.gtk.glib.TreeNode node);
    
    @ApiStatus.Internal default int upcall(MemoryAddress node, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.TreeNode.fromAddress.marshal(node, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TraverseNodeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
