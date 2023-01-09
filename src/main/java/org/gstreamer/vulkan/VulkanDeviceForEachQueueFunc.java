package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code VulkanDeviceForEachQueueFunc} callback.
 */
@FunctionalInterface
public interface VulkanDeviceForEachQueueFunc {

    boolean run(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanQueue queue);
    
    @ApiStatus.Internal default int upcall(MemoryAddress device, MemoryAddress queue, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.vulkan.VulkanDevice) Interop.register(device, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(device, null), (org.gstreamer.vulkan.VulkanQueue) Interop.register(queue, org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(queue, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanDeviceForEachQueueFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
