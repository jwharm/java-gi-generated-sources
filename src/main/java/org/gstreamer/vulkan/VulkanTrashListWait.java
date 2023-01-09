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
/**
 * Functional interface declaration of the {@code VulkanTrashListWait} callback.
 */
@FunctionalInterface
public interface VulkanTrashListWait {

    /**
     * Wait for a most {@code timeout} to pass for all {@link VulkanTrash} objects to be
     * signalled and freed.
     * @version 1.18
     */
    boolean run(org.gstreamer.vulkan.VulkanTrashList trashList, long timeout);
    
    @ApiStatus.Internal default int upcall(MemoryAddress trashList, long timeout) {
        var RESULT = run((org.gstreamer.vulkan.VulkanTrashList) Interop.register(trashList, org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, null), timeout);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanTrashListWait.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
