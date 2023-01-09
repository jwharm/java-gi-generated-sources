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
/**
 * Functional interface declaration of the {@code FlowBoxFilterFunc} callback.
 */
@FunctionalInterface
public interface FlowBoxFilterFunc {

    /**
     * A function that will be called whenever a child changes
     * or is added.
     * <p>
     * It lets you control if the child should be visible or not.
     */
    boolean run(org.gtk.gtk.FlowBoxChild child);
    
    @ApiStatus.Internal default int upcall(MemoryAddress child, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.FlowBoxChild) Interop.register(child, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlowBoxFilterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
