package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_node_traverse(). The
 * function is called with each of the nodes visited, together with the
 * user data passed to g_node_traverse(). If the function returns
 * {@code true}, then the traversal is stopped.
 */
/**
 * Functional interface declaration of the {@code NodeTraverseFunc} callback.
 */
@FunctionalInterface
public interface NodeTraverseFunc {

    /**
     * Specifies the type of function passed to g_node_traverse(). The
     * function is called with each of the nodes visited, together with the
     * user data passed to g_node_traverse(). If the function returns
     * {@code true}, then the traversal is stopped.
     */
    boolean run(org.gtk.glib.Node node);
    
    @ApiStatus.Internal default int upcall(MemoryAddress node, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.Node.fromAddress.marshal(node, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NodeTraverseFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
