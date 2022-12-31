package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to compare two children to determine which
 * should come first.
 */
@FunctionalInterface
public interface FlowBoxSortFunc {
    int run(org.gtk.gtk.FlowBoxChild child1, org.gtk.gtk.FlowBoxChild child2);

    @ApiStatus.Internal default int upcall(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.FlowBoxChild) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child1)), org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child1, Ownership.NONE), (org.gtk.gtk.FlowBoxChild) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child2)), org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child2, Ownership.NONE));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlowBoxSortFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
