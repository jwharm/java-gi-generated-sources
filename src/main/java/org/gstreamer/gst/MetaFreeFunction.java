package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is freed in {@code buffer}.
 */
@FunctionalInterface
public interface MetaFreeFunction {
    void run(org.gstreamer.gst.Meta meta, org.gstreamer.gst.Buffer buffer);

    @ApiStatus.Internal default void upcall(MemoryAddress meta, MemoryAddress buffer) {
        run(org.gstreamer.gst.Meta.fromAddress.marshal(meta, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MetaFreeFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
