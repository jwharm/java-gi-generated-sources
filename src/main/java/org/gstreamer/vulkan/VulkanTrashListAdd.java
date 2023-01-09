package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Add {@code trash} to {@code trash_list} for tracking
 * @version 1.18
 */
/**
 * Functional interface declaration of the {@code VulkanTrashListAdd} callback.
 */
@FunctionalInterface
public interface VulkanTrashListAdd {

    /**
     * Add {@code trash} to {@code trash_list} for tracking
     * @version 1.18
     */
    boolean run(org.gstreamer.vulkan.VulkanTrashList trashList, org.gstreamer.vulkan.VulkanTrash trash);
    
    @ApiStatus.Internal default int upcall(MemoryAddress trashList, MemoryAddress trash) {
        var RESULT = run((org.gstreamer.vulkan.VulkanTrashList) Interop.register(trashList, org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, null), org.gstreamer.vulkan.VulkanTrash.fromAddress.marshal(trash, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanTrashListAdd.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
