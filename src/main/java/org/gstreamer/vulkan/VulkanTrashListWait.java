package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Wait for a most {@code timeout} to pass for all {@link VulkanTrash} objects to be
 * signalled and freed.
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListWait {
    boolean run(org.gstreamer.vulkan.VulkanTrashList trashList, long timeout);

    @ApiStatus.Internal default int upcall(MemoryAddress trashList, long timeout) {
        var RESULT = run((org.gstreamer.vulkan.VulkanTrashList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trashList)), org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, Ownership.NONE), timeout);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanTrashListWait.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
