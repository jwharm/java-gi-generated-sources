package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for methods to create copies of instances.
 */
@FunctionalInterface
public interface MiniObjectCopyFunction {
    org.gstreamer.gst.MiniObject run(org.gstreamer.gst.MiniObject obj);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress obj) {
        var RESULT = run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MiniObjectCopyFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
