package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link MiniObjectNotify} function can be added to a mini object as a
 * callback that gets triggered when gst_mini_object_unref() drops the
 * last ref and {@code obj} is about to be freed.
 */
@FunctionalInterface
public interface MiniObjectNotify {
    void run(org.gstreamer.gst.MiniObject obj);

    @ApiStatus.Internal default void upcall(MemoryAddress userData, MemoryAddress obj) {
        run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MiniObjectNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
