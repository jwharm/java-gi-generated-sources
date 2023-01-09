package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code VideoConvertSampleCallback} callback.
 */
@FunctionalInterface
public interface VideoConvertSampleCallback {

    void run(org.gstreamer.gst.Sample sample, org.gtk.glib.Error error);
    
    @ApiStatus.Internal default void upcall(MemoryAddress sample, MemoryAddress error, MemoryAddress userData) {
        run(org.gstreamer.gst.Sample.fromAddress.marshal(sample, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VideoConvertSampleCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
