package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * FIXME(2.0): remove, this is unused
 */
@FunctionalInterface
public interface ControlBindingConvert {
    void run(org.gstreamer.gst.ControlBinding binding, double srcValue, org.gtk.gobject.Value destValue);

    @ApiStatus.Internal default void upcall(MemoryAddress binding, double srcValue, MemoryAddress destValue) {
        run((org.gstreamer.gst.ControlBinding) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(binding)), org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, Ownership.NONE), srcValue, org.gtk.gobject.Value.fromAddress.marshal(destValue, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ControlBindingConvert.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
