package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code PrintSettingsFunc} callback.
 */
@FunctionalInterface
public interface PrintSettingsFunc {

    void run(java.lang.String key, java.lang.String value);
    
    @ApiStatus.Internal default void upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(Marshal.addressToString.marshal(key, null), Marshal.addressToString.marshal(value, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrintSettingsFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
