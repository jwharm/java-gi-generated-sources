package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual function prototype for methods to free resources used by
 * mini-objects.
 */
@FunctionalInterface
public interface MiniObjectFreeFunction {
    void run(org.gstreamer.gst.MiniObject obj);

    @ApiStatus.Internal default void upcall(MemoryAddress obj) {
        run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MiniObjectFreeFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
