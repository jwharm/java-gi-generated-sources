package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "cubic-to" draw
 * operation.
 * @version 4.0.0
 */
@FunctionalInterface
public interface DrawCubicToFuncT {
    void run(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default void upcall(MemoryAddress dfuncs, MemoryAddress drawData, MemoryAddress st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, MemoryAddress userData) {
        run(org.harfbuzz.DrawFuncsT.fromAddress.marshal(dfuncs, Ownership.NONE), drawData, org.harfbuzz.DrawStateT.fromAddress.marshal(st, Ownership.NONE), control1X, control1Y, control2X, control2Y, toX, toY, userData);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawCubicToFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
