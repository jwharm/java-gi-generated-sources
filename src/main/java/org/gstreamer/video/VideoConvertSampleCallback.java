package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoConvertSampleCallback {
    void run(org.gstreamer.gst.Sample sample, org.gtk.glib.Error error);

    @ApiStatus.Internal default void upcall(MemoryAddress sample, MemoryAddress error, MemoryAddress userData) {
        run(org.gstreamer.gst.Sample.fromAddress.marshal(sample, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VideoConvertSampleCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
