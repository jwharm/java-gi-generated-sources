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
@FunctionalInterface
public interface VulkanHandleDestroyNotify {
    void run(org.gstreamer.vulkan.VulkanHandle handle);

    @ApiStatus.Internal default void upcall(MemoryAddress handle, MemoryAddress userData) {
        run(org.gstreamer.vulkan.VulkanHandle.fromAddress.marshal(handle, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanHandleDestroyNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
