package org.gtk.gdk;

/**
 * Error enumeration for {@code GdkVulkanContext}.
 */
public class VulkanError {

    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    public static final VulkanError UNSUPPORTED = new VulkanError(0);
    
    /**
     * Vulkan support is not available on this Surface
     */
    public static final VulkanError NOT_AVAILABLE = new VulkanError(1);
    
    private int value;
    
    public VulkanError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(VulkanError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
