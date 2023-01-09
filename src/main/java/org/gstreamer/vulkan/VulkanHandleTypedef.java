package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanHandleTypedef extends io.github.jwharm.javagi.Alias<Long> {
    
    /**
     * Create a new VulkanHandleTypedef with the provided value
     */
    public VulkanHandleTypedef(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static VulkanHandleTypedef[] fromNativeArray(MemoryAddress address, long length) {
        VulkanHandleTypedef[] array = new VulkanHandleTypedef[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new VulkanHandleTypedef(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
