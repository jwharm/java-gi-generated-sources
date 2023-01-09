package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * FIXME(2.0): remove, this is unused
 */
/**
 * Functional interface declaration of the {@code ControlBindingConvert} callback.
 */
@FunctionalInterface
public interface ControlBindingConvert {

    /**
     * FIXME(2.0): remove, this is unused
     */
    void run(org.gstreamer.gst.ControlBinding binding, double srcValue, org.gtk.gobject.Value destValue);
    
    @ApiStatus.Internal default void upcall(MemoryAddress binding, double srcValue, MemoryAddress destValue) {
        run((org.gstreamer.gst.ControlBinding) Interop.register(binding, org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, null), srcValue, org.gtk.gobject.Value.fromAddress.marshal(destValue, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ControlBindingConvert.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
