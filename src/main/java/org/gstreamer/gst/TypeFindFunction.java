package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called by typefinding.
 */
/**
 * Functional interface declaration of the {@code TypeFindFunction} callback.
 */
@FunctionalInterface
public interface TypeFindFunction {

    /**
     * A function that will be called by typefinding.
     */
    void run(org.gstreamer.gst.TypeFind find);
    
    @ApiStatus.Internal default void upcall(MemoryAddress find, MemoryAddress userData) {
        run(org.gstreamer.gst.TypeFind.fromAddress.marshal(find, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TypeFindFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
