package org.gstreamer.vulkan.wayland;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(VulkanDisplayWayland.getType(), VulkanDisplayWayland.fromAddress);
    }
}
