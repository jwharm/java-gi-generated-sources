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
@FunctionalInterface
public interface TreeSelectionFunc {
    boolean run(org.gtk.gtk.TreeSelection selection, org.gtk.gtk.TreeModel model, org.gtk.gtk.TreePath path, boolean pathCurrentlySelected);

    @ApiStatus.Internal default int upcall(MemoryAddress selection, MemoryAddress model, MemoryAddress path, int pathCurrentlySelected, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeSelection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(selection)), org.gtk.gtk.TreeSelection.fromAddress).marshal(selection, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.TreeModel.fromAddress).marshal(model, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), Marshal.integerToBoolean.marshal(pathCurrentlySelected, null).booleanValue());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeSelectionFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
