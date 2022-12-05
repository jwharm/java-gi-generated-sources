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
        boolean onVulkanImageMemoryFindViewFunc(@NotNull org.gstreamer.vulkan.VulkanImageView view);
}
