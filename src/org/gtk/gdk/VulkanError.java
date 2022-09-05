package org.gtk.gdk;

/**
 * Error enumeration for `GdkVulkanContext`.
 */
public enum VulkanError {

    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    UNSUPPORTED,
    
    /**
     * Vulkan support is not available on this Surface
     */
    NOT_AVAILABLE;
    
    public static VulkanError fromValue(int value) {
        return switch(value) {
            case 0 -> UNSUPPORTED;
            case 1 -> NOT_AVAILABLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNSUPPORTED -> 0;
            case NOT_AVAILABLE -> 1;
        };
    }

}
