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
/**
 * Functional interface declaration of the {@code MiniObjectNotify} callback.
 */
@FunctionalInterface
public interface MiniObjectNotify {

    /**
     * A {@link MiniObjectNotify} function can be added to a mini object as a
     * callback that gets triggered when gst_mini_object_unref() drops the
     * last ref and {@code obj} is about to be freed.
     */
    void run(org.gstreamer.gst.MiniObject obj);
    
    @ApiStatus.Internal default void upcall(MemoryAddress userData, MemoryAddress obj) {
        run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MiniObjectNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
