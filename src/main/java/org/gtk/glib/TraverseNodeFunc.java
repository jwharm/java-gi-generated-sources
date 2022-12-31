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
@FunctionalInterface
public interface TraverseNodeFunc {
    boolean run(org.gtk.glib.TreeNode node);

    @ApiStatus.Internal default int upcall(MemoryAddress node, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.TreeNode.fromAddress.marshal(node, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TraverseNodeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
