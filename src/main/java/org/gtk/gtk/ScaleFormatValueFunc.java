package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface ScaleFormatValueFunc {
    java.lang.String run(org.gtk.gtk.Scale scale, double value);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress scale, double value, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.Scale) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scale)), org.gtk.gtk.Scale.fromAddress).marshal(scale, Ownership.NONE), value);
        return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ScaleFormatValueFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
