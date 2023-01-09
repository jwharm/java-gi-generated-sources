package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function definition used to find views.  Return {@code true} if {@code view} matches the
 * criteria.
 * @version 1.18
 */
/**
 * Functional interface declaration of the {@code VulkanImageMemoryFindViewFunc} callback.
 */
@FunctionalInterface
public interface VulkanImageMemoryFindViewFunc {

    /**
     * Function definition used to find views.  Return {@code true} if {@code view} matches the
     * criteria.
     * @version 1.18
     */
    boolean run(org.gstreamer.vulkan.VulkanImageView view);
    
    @ApiStatus.Internal default int upcall(MemoryAddress view, MemoryAddress userData) {
        var RESULT = run(org.gstreamer.vulkan.VulkanImageView.fromAddress.marshal(view, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VulkanImageMemoryFindViewFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
