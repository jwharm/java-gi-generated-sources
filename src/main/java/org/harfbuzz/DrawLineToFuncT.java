package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "line-to" draw
 * operation.
 * @version 4.0.0
 */
@FunctionalInterface
public interface DrawLineToFuncT {
    void run(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float toX, float toY, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default void upcall(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float toX, float toY, MemoryAddress userData) {
        run(org.harfbuzz.DrawFuncsT.fromAddress.marshal(dfuncs, Ownership.NONE), drawData, org.harfbuzz.DrawStateT.fromAddress.marshal(st, Ownership.NONE), toX, toY, userData);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawLineToFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
