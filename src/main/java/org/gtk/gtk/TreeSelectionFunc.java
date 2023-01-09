package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_tree_selection_set_select_function() to filter
 * whether or not a row may be selected. It is called whenever a row's
 * state might change.
 * <p>
 * A return value of {@code true} indicates to {@code selection} that it is okay to
 * change the selection.
 */
/**
 * Functional interface declaration of the {@code TreeSelectionFunc} callback.
 */
@FunctionalInterface
public interface TreeSelectionFunc {

    /**
     * A function used by gtk_tree_selection_set_select_function() to filter
     * whether or not a row may be selected. It is called whenever a row's
     * state might change.
     * <p>
     * A return value of {@code true} indicates to {@code selection} that it is okay to
     * change the selection.
     */
    boolean run(org.gtk.gtk.TreeSelection selection, org.gtk.gtk.TreeModel model, org.gtk.gtk.TreePath path, boolean pathCurrentlySelected);
    
    @ApiStatus.Internal default int upcall(MemoryAddress selection, MemoryAddress model, MemoryAddress path, int pathCurrentlySelected, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeSelection) Interop.register(selection, org.gtk.gtk.TreeSelection.fromAddress).marshal(selection, null), (org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), Marshal.integerToBoolean.marshal(pathCurrentlySelected, null).booleanValue());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeSelectionFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
