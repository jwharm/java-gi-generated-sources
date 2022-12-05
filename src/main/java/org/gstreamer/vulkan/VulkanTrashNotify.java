package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VulkanTrashNotify {
        void onVulkanTrashNotify(@NotNull org.gstreamer.vulkan.VulkanDevice device);
}
