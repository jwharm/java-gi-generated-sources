package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Custom GstTask thread callback functions that can be installed.
 */
@FunctionalInterface
public interface TaskThreadFunc {
    void run(org.gstreamer.gst.Task task, org.gtk.glib.Thread thread);

    @ApiStatus.Internal default void upcall(MemoryAddress task, MemoryAddress thread, MemoryAddress userData) {
        run((org.gstreamer.gst.Task) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(task)), org.gstreamer.gst.Task.fromAddress).marshal(task, Ownership.NONE), org.gtk.glib.Thread.fromAddress.marshal(thread, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TaskThreadFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
