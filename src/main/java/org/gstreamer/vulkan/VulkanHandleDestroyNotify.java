package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function definition called when the {@link VulkanHandle} is no longer in use.
 * All implementations of this callback must free the internal handle stored
 * inside {@code handle}.
 * @version 1.18
 */
/**
 * Functional interface declaration of the {@code VulkanHandleDestroyNotify} callback.
 */
@FunctionalInterface
public interface VulkanHandleDestroyNotify {

    /**
     * Function definition called when the {@link VulkanHandle} is no longer in use.
     * All implementations of this callback must free the internal handle stored
     * inside {@code handle}.
     * @version 1.18
     */
    void run(org.gstreamer.vulkan.VulkanHandle handle);
    
    @ApiStatus.Internal default void upcall(MemoryAddress handle, MemoryAddress userData) {
        run(org.gstreamer.vulkan.VulkanHandle.fromAddress.marshal(handle, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanHandleDestroyNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
