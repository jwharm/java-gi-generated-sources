package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Add {@code trash} to {@code trash_list} for tracking
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListAdd {
    boolean run(org.gstreamer.vulkan.VulkanTrashList trashList, org.gstreamer.vulkan.VulkanTrash trash);

    @ApiStatus.Internal default int upcall(MemoryAddress trashList, MemoryAddress trash) {
        var RESULT = run((org.gstreamer.vulkan.VulkanTrashList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trashList)), org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, Ownership.NONE), org.gstreamer.vulkan.VulkanTrash.fromAddress.marshal(trash, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanTrashListAdd.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
