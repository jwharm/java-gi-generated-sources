package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Wait for a most {@code timeout} to pass for all {@link VulkanTrash} objects to be
 * signalled and freed.
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanTrashListWait {
        boolean onVulkanTrashListWait(@NotNull org.gstreamer.vulkan.VulkanTrashList trashList, long timeout);
}
