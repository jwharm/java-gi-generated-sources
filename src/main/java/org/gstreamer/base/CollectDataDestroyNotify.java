package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when the {@link CollectData} will be freed.
 * It is passed the pointer to the structure and should free any custom
 * memory and resources allocated for it.
 */
/**
 * Functional interface declaration of the {@code CollectDataDestroyNotify} callback.
 */
@FunctionalInterface
public interface CollectDataDestroyNotify {

    /**
     * A function that will be called when the {@link CollectData} will be freed.
     * It is passed the pointer to the structure and should free any custom
     * memory and resources allocated for it.
     */
    void run(org.gstreamer.base.CollectData data);
    
    @ApiStatus.Internal default void upcall(MemoryAddress data) {
        run(org.gstreamer.base.CollectData.fromAddress.marshal(data, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectDataDestroyNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
