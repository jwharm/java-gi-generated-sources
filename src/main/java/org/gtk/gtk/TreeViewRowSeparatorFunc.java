package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function type for determining whether the row pointed to by {@code iter} should
 * be rendered as a separator. A common way to implement this is to have a
 * boolean column in the model, whose values the {@code GtkTreeViewRowSeparatorFunc}
 * returns.
 */
/**
 * Functional interface declaration of the {@code TreeViewRowSeparatorFunc} callback.
 */
@FunctionalInterface
public interface TreeViewRowSeparatorFunc {

    /**
     * Function type for determining whether the row pointed to by {@code iter} should
     * be rendered as a separator. A common way to implement this is to have a
     * boolean column in the model, whose values the {@code GtkTreeViewRowSeparatorFunc}
     * returns.
     */
    boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeViewRowSeparatorFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
