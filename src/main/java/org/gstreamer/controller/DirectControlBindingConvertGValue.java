package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to map a control-value to the target GValue.
 */
/**
 * Functional interface declaration of the {@code DirectControlBindingConvertGValue} callback.
 */
@FunctionalInterface
public interface DirectControlBindingConvertGValue {

    /**
     * Function to map a control-value to the target GValue.
     */
    void run(org.gstreamer.controller.DirectControlBinding self, double srcValue, org.gtk.gobject.Value destValue);
    
    @ApiStatus.Internal default void upcall(MemoryAddress self, double srcValue, MemoryAddress destValue) {
        run((org.gstreamer.controller.DirectControlBinding) Interop.register(self, org.gstreamer.controller.DirectControlBinding.fromAddress).marshal(self, null), srcValue, org.gtk.gobject.Value.fromAddress.marshal(destValue, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DirectControlBindingConvertGValue.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
