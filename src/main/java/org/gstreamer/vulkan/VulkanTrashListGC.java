package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Remove any memory allocated by any signalled objects.
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListGC {
        void onVulkanTrashListGC(@NotNull org.gstreamer.vulkan.VulkanTrashList trashList);
}
