package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "move-to" draw
 * operation.
 * @version 4.0.0
 */
/**
 * Functional interface declaration of the {@code DrawMoveToFuncT} callback.
 */
@FunctionalInterface
public interface DrawMoveToFuncT {

    /**
     * A virtual method for the {@link DrawFuncsT} to perform a "move-to" draw
     * operation.
     * @version 4.0.0
     */
    void run(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float toX, float toY, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default void upcall(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float toX, float toY, MemoryAddress userData) {
        run(org.harfbuzz.DrawFuncsT.fromAddress.marshal(dfuncs, null), drawData, org.harfbuzz.DrawStateT.fromAddress.marshal(st, null), toX, toY, userData);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawMoveToFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
