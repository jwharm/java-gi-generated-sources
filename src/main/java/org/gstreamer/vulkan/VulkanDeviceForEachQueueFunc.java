package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VulkanDeviceForEachQueueFunc {
    boolean run(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanQueue queue);

    @ApiStatus.Internal default int upcall(MemoryAddress device, MemoryAddress queue, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.vulkan.VulkanDevice) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(device, Ownership.NONE), (org.gstreamer.vulkan.VulkanQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(queue)), org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(queue, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanDeviceForEachQueueFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
