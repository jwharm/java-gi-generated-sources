package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 */
@FunctionalInterface
public interface TreeModelForeachFunc {
    boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);

    @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.TreeModel.fromAddress).marshal(model, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeModelForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
