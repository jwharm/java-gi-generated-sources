package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of a function filtering a list of attributes.
 */
/**
 * Functional interface declaration of the {@code AttrFilterFunc} callback.
 */
@FunctionalInterface
public interface AttrFilterFunc {

    /**
     * Type of a function filtering a list of attributes.
     */
    boolean run(org.pango.Attribute attribute);
    
    @ApiStatus.Internal default int upcall(MemoryAddress attribute, MemoryAddress userData) {
        var RESULT = run(org.pango.Attribute.fromAddress.marshal(attribute, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AttrFilterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
