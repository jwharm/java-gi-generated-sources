package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code ScaleFormatValueFunc} callback.
 */
@FunctionalInterface
public interface ScaleFormatValueFunc {

    java.lang.String run(org.gtk.gtk.Scale scale, double value);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress scale, double value, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gtk.Scale) Interop.register(scale, org.gtk.gtk.Scale.fromAddress).marshal(scale, null), value);
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ScaleFormatValueFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
