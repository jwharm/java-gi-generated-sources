package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Remove any memory allocated by any signalled objects.
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListGC {
    void run(org.gstreamer.vulkan.VulkanTrashList trashList);

    @ApiStatus.Internal default void upcall(MemoryAddress trashList) {
        run((org.gstreamer.vulkan.VulkanTrashList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trashList)), org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanTrashListGC.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
