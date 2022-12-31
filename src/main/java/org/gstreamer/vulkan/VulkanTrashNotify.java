package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VulkanTrashNotify {
    void run(org.gstreamer.vulkan.VulkanDevice device);

    @ApiStatus.Internal default void upcall(MemoryAddress device, MemoryAddress userData) {
        run((org.gstreamer.vulkan.VulkanDevice) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(device, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanTrashNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
