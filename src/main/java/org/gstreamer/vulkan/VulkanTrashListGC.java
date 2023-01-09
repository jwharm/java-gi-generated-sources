package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Remove any memory allocated by any signalled objects.
 * @version 1.18
 */
/**
 * Functional interface declaration of the {@code VulkanTrashListGC} callback.
 */
@FunctionalInterface
public interface VulkanTrashListGC {

    /**
     * Remove any memory allocated by any signalled objects.
     * @version 1.18
     */
    void run(org.gstreamer.vulkan.VulkanTrashList trashList);
    
    @ApiStatus.Internal default void upcall(MemoryAddress trashList) {
        run((org.gstreamer.vulkan.VulkanTrashList) Interop.register(trashList, org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(trashList, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanTrashListGC.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
