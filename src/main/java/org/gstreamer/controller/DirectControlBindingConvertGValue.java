package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to map a control-value to the target GValue.
 */
@FunctionalInterface
public interface DirectControlBindingConvertGValue {
    void run(org.gstreamer.controller.DirectControlBinding self, double srcValue, org.gtk.gobject.Value destValue);

    @ApiStatus.Internal default void upcall(MemoryAddress self, double srcValue, MemoryAddress destValue) {
        run((org.gstreamer.controller.DirectControlBinding) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.controller.DirectControlBinding.fromAddress).marshal(self, Ownership.NONE), srcValue, org.gtk.gobject.Value.fromAddress.marshal(destValue, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DirectControlBindingConvertGValue.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
