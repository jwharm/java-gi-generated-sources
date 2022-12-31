package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will repeatedly be called in the thread created by
 * a {@link Task}.
 */
@FunctionalInterface
public interface TaskFunction {
    void run();

    @ApiStatus.Internal default void upcall(MemoryAddress userData) {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TaskFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
