package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface GLFilterRenderFunc {
    boolean run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gl.GLMemory inTex);

    @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress inTex, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gl.GLFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.gl.GLMemory.fromAddress.marshal(inTex, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLFilterRenderFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
