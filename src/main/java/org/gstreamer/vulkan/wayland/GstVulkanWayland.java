package org.gstreamer.vulkan.wayland;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstVulkanWayland namespace.
 */
public final class GstVulkanWayland {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    private static void registerTypes() {
        if (VulkanDisplayWayland.isAvailable()) Interop.register(VulkanDisplayWayland.getType(), VulkanDisplayWayland.fromAddress);
    }
}
