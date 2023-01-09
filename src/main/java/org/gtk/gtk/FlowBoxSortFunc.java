package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to compare two children to determine which
 * should come first.
 */
/**
 * Functional interface declaration of the {@code FlowBoxSortFunc} callback.
 */
@FunctionalInterface
public interface FlowBoxSortFunc {

    /**
     * A function to compare two children to determine which
     * should come first.
     */
    int run(org.gtk.gtk.FlowBoxChild child1, org.gtk.gtk.FlowBoxChild child2);
    
    @ApiStatus.Internal default int upcall(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.FlowBoxChild) Interop.register(child1, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child1, null), (org.gtk.gtk.FlowBoxChild) Interop.register(child2, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child2, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlowBoxSortFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
