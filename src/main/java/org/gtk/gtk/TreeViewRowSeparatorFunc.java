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
@FunctionalInterface
public interface TreeViewRowSeparatorFunc {
    boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter);

    @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.TreeModel.fromAddress).marshal(model, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeViewRowSeparatorFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
