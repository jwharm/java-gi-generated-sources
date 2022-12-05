package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function definition called when the {@link VulkanHandle} is no longer in use.
 * All implementations of this callback must free the internal handle stored
 * inside {@code handle}.
 * @version 1.18
 */
@FunctionalInterface
public interface VulkanHandleDestroyNotify {
        void onVulkanHandleDestroyNotify(@NotNull org.gstreamer.vulkan.VulkanHandle handle);
}
