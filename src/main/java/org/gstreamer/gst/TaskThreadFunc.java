package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Custom GstTask thread callback functions that can be installed.
 */
/**
 * Functional interface declaration of the {@code TaskThreadFunc} callback.
 */
@FunctionalInterface
public interface TaskThreadFunc {

    /**
     * Custom GstTask thread callback functions that can be installed.
     */
    void run(org.gstreamer.gst.Task task, org.gtk.glib.Thread thread);
    
    @ApiStatus.Internal default void upcall(MemoryAddress task, MemoryAddress thread, MemoryAddress userData) {
        run((org.gstreamer.gst.Task) Interop.register(task, org.gstreamer.gst.Task.fromAddress).marshal(task, null), org.gtk.glib.Thread.fromAddress.marshal(thread, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TaskThreadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
