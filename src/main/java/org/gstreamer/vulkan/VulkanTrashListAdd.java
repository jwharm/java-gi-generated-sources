package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Add {@code trash} to {@code trash_list} for tracking
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListAdd {
        boolean onVulkanTrashListAdd(@NotNull org.gstreamer.vulkan.VulkanTrashList trashList, @NotNull org.gstreamer.vulkan.VulkanTrash trash);
}
