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
@FunctionalInterface
public interface NodeForeachFunc {
    void run(org.gtk.glib.Node node);

    @ApiStatus.Internal default void upcall(MemoryAddress node, MemoryAddress userData) {
        run(org.gtk.glib.Node.fromAddress.marshal(node, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NodeForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
