package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_node_children_foreach().
 * The function is called with each child node, together with the user
 * data passed to g_node_children_foreach().
 */
/**
 * Functional interface declaration of the {@code NodeForeachFunc} callback.
 */
@FunctionalInterface
public interface NodeForeachFunc {

    /**
     * Specifies the type of function passed to g_node_children_foreach().
     * The function is called with each child node, together with the user
     * data passed to g_node_children_foreach().
     */
    void run(org.gtk.glib.Node node);
    
    @ApiStatus.Internal default void upcall(MemoryAddress node, MemoryAddress userData) {
        run(org.gtk.glib.Node.fromAddress.marshal(node, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NodeForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
