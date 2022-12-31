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
@FunctionalInterface
public interface VulkanImageMemoryFindViewFunc {
    boolean run(org.gstreamer.vulkan.VulkanImageView view);

    @ApiStatus.Internal default int upcall(MemoryAddress view, MemoryAddress userData) {
        var RESULT = run(org.gstreamer.vulkan.VulkanImageView.fromAddress.marshal(view, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VulkanImageMemoryFindViewFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
