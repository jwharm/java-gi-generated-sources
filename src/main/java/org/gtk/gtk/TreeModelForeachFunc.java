package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 */
/**
 * Functional interface declaration of the {@code TreeModelForeachFunc} callback.
 */
@FunctionalInterface
public interface TreeModelForeachFunc {

    /**
     * Type of the callback passed to gtk_tree_model_foreach() to
     * iterate over the rows in a tree model.
     */
    boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeModelForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
