package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface DataQueueFullCallback {
    void run(org.gstreamer.base.DataQueue queue);

    @ApiStatus.Internal default void upcall(MemoryAddress queue, MemoryAddress checkdata) {
        run((org.gstreamer.base.DataQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(queue)), org.gstreamer.base.DataQueue.fromAddress).marshal(queue, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DataQueueFullCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
