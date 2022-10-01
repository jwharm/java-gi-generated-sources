package org.gtk.gdk;

/**
 * Error enumeration for {@code GdkVulkanContext}.
 */
public class VulkanError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    public static final VulkanError UNSUPPORTED = new VulkanError(0);
    
    /**
     * Vulkan support is not available on this Surface
     */
    public static final VulkanError NOT_AVAILABLE = new VulkanError(1);
    
    public VulkanError(int value) {
        super(value);
    }
    
}
