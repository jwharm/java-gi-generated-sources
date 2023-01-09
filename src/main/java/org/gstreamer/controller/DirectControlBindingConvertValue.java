package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to map a control-value to the target plain data type.
 */
/**
 * Functional interface declaration of the {@code DirectControlBindingConvertValue} callback.
 */
@FunctionalInterface
public interface DirectControlBindingConvertValue {

    /**
     * Function to map a control-value to the target plain data type.
     */
    void run(org.gstreamer.controller.DirectControlBinding self, double srcValue, @Nullable java.lang.foreign.MemoryAddress destValue);
    
    @ApiStatus.Internal default void upcall(MemoryAddress self, double srcValue, MemoryAddress destValue) {
        run((org.gstreamer.controller.DirectControlBinding) Interop.register(self, org.gstreamer.controller.DirectControlBinding.fromAddress).marshal(self, null), srcValue, destValue);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DirectControlBindingConvertValue.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
