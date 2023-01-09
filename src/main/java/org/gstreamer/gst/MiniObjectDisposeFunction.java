package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for when a miniobject has lost its last refcount.
 * Implementation of the mini object are allowed to revive the
 * passed object by doing a gst_mini_object_ref(). If the object is not
 * revived after the dispose function, the function should return {@code true}
 * and the memory associated with the object is freed.
 */
/**
 * Functional interface declaration of the {@code MiniObjectDisposeFunction} callback.
 */
@FunctionalInterface
public interface MiniObjectDisposeFunction {

    /**
     * Function prototype for when a miniobject has lost its last refcount.
     * Implementation of the mini object are allowed to revive the
     * passed object by doing a gst_mini_object_ref(). If the object is not
     * revived after the dispose function, the function should return {@code true}
     * and the memory associated with the object is freed.
     */
    boolean run(org.gstreamer.gst.MiniObject obj);
    
    @ApiStatus.Internal default int upcall(MemoryAddress obj) {
        var RESULT = run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MiniObjectDisposeFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
