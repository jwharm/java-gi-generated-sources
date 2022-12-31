package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called whenever a child changes
 * or is added.
 * <p>
 * It lets you control if the child should be visible or not.
 */
@FunctionalInterface
public interface FlowBoxFilterFunc {
    boolean run(org.gtk.gtk.FlowBoxChild child);

    @ApiStatus.Internal default int upcall(MemoryAddress child, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.FlowBoxChild) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlowBoxFilterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
