package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "close-path" draw
 * operation.
 * @version 4.0.0
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
    void run(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default void upcall(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, MemoryAddress userData) {
        run(org.harfbuzz.DrawFuncsT.fromAddress.marshal(dfuncs, Ownership.NONE), drawData, org.harfbuzz.DrawStateT.fromAddress.marshal(st, Ownership.NONE), userData);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawClosePathFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
